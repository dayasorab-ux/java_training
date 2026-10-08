import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TerminalShooter {
    // Game screen dimensions
    private static final int WIDTH = 20;
    private static final int HEIGHT = 15;
    
    // Entity records or structures
    private static class Entity {
        int x, y;
        Entity(int x, int y) { this.x = x; this.y = y; }
    }

    // Game state variables
    private static int playerX = WIDTH / 2;
    private static final int PLAYER_Y = HEIGHT - 1;
    private static int score = 0;
    private static boolean running = true;
    
    private static final List<Entity> bullets = new ArrayList<>();
    private static final List<Entity> enemies = new ArrayList<>();
    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("=== JAVA 17 TERMINAL SHOOTER ===");
        System.out.println("Controls: A = Left, D = Right, W = Shoot, Q = Quit");
        System.out.println("Press Enter after each command!");
        System.out.println("Press Enter to start...");
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // Non-blocking input workaround for standard Java console
        Thread inputThread = new Thread(() -> {
            while (running) {
                if (scanner.hasNextLine()) {
                    String input = scanner.nextLine().toLowerCase();
                    if (input.isEmpty()) continue;
                    handleInput(input.charAt(0));
                }
            }
        });
        inputThread.setDaemon(true);
        inputThread.start();

        // Main Game Loop
        while (running) {
            updateGame();
            renderFrame();
            
            try {
                Thread.sleep(300); // Game tick timing (approx 3 frames per second)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nGAME OVER! Final Score: " + score);
        scanner.close();
    }

    private static synchronized void handleInput(char command) {
        // Utilizing Java 14+ Enhanced Switch Expressions
        switch (command) {
            case 'a' -> { if (playerX > 0) playerX--; }
            case 'd' -> { if (playerX < WIDTH - 1) playerX++; }
            case 'w' -> bullets.add(new Entity(playerX, PLAYER_Y - 1));
            case 'q' -> running = false;
            default -> {} // Ignore invalid keys
        }
    }

    private static synchronized void updateGame() {
        // 1. Move bullets upward
        bullets.forEach(b -> b.y--);
        bullets.removeIf(b -> b.y < 0);

        // 2. Move enemies downward
        enemies.forEach(e -> e.y++);

        // Check if any enemy reached the player or the ground
        boolean playerHit = enemies.stream()
                .anyMatch(e -> e.y >= HEIGHT || (e.x == playerX && e.y == PLAYER_Y));
        if (playerHit) {
            running = false;
            return;
        }

        // 3. Collision handling (Bullet hits Enemy) using modern list clearing filters
        List<Entity> deadBullets = new ArrayList<>();
        List<Entity> deadEnemies = new ArrayList<>();

        for (Entity b : bullets) {
            for (Entity e : enemies) {
                if (b.x == e.x && b.y == e.y) {
                    deadBullets.add(b);
                    deadEnemies.add(e);
                    score += 10;
                    break;
                }
            }
        }
        bullets.removeAll(deadBullets);
        enemies.removeAll(deadEnemies);

        // 4. Enemy Spawning (30% chance per tick)
        if (random.nextInt(10) < 3) {
            enemies.add(new Entity(random.nextInt(WIDTH), 0));
        }
    }

    private static synchronized void renderFrame() {
        // Clear terminal screen using ANSI escape codes
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Initialize grid
        char[][] grid = new char[HEIGHT][WIDTH];
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                grid[y][x] = '.'; 
            }
        }

        // Draw Game Entities onto grid
        bullets.stream()
               .filter(b -> b.y >= 0 && b.y < HEIGHT)
               .forEach(b -> grid[b.y][b.x] = '|');

        enemies.stream()
               .filter(e -> e.y >= 0 && e.y < HEIGHT)
               .forEach(e -> grid[e.y][e.x] = 'X');

        grid[PLAYER_Y][playerX] = '^'; 

        // Render Frame Output using repeat() from Java 11+
        StringBuilder frame = new StringBuilder();
        frame.append("Score: ").append(score).append("\n");
        frame.append("=".repeat(WIDTH + 2)).append("\n");

        for (int y = 0; y < HEIGHT; y++) {
            frame.append("|");
            for (int x = 0; x < WIDTH; x++) {
                frame.append(grid[y][x]);
            }
            frame.append("|\n");
        }

        frame.append("=".repeat(WIDTH + 2)).append("\n");
        System.out.print(frame);
    }
}

interface phone {
    void call();
    void message();
}
interface camera {
    void click();
    void record();
}
class multilvl implements phone, camera {
    public void call() {
        System.out.println("Calling...");
    }
    public void message() {
        System.out.println("Messaging...");
    }
    public void click() {
        System.out.println("Clicking photos...");
    }
    public void record() {
        System.out.println("Recording videos...");
    }
    public static void main(String[] args) {
        multilvl m = new multilvl();
        m.call();
        m.message();
        m.click();
        m.record();
    }
}
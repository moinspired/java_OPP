public class Mammal {
    private boolean sleeping = false;
    public void requlateTemplature(){
        System.out.println("My temperature is just right now.");
    }
    public void startSleeping(){
        sleeping = true;
        System.out.println("ZzZz");
    }
    public boolean isSleeping(){
        return sleeping;
    }
}
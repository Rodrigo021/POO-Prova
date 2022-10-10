package Questão_5;

public abstract class UFALBluetooth {

    public abstract void process_Data();

    public void open_Connection() {
        System.out.println("connected!");
    }
    
    public void close_Connection() {
        System.out.println("End connection!");
    }

}

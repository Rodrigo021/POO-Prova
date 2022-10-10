package Questão_5;

public class Connection {
    public static void main(String[] args) {
        UFALBluetooth bt = new Package_BT();
        bt.open_Connection();
        bt.process_Data();
        bt.close_Connection();

        bt = new Serial_BT();
        bt.open_Connection();
        bt.process_Data();
        bt.close_Connection();

    }
}

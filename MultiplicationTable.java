class MultiplicationTable {
    public synchronized void printTable(int number) {
        System.out.println("Multiplication table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();
    }
}

class MultiplicationTableThread extends Thread {
    private MultiplicationTable table;
    private int number;

    public MultiplicationTableThread(MultiplicationTable table, int number) {
        this.table = table;
        this.number = number;
    }

    @Override
    public void run() {
        table.printTable(number);
    }
}

public class Main {
    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();

        MultiplicationTableThread thread1 = new MultiplicationTableThread(table, 5);
        MultiplicationTableThread thread2 = new MultiplicationTableThread(table, 7);
        MultiplicationTableThread thread3 = new MultiplicationTableThread(table, 3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
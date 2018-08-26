import ru.taskdata.model.component.*;
import ru.taskdata.model.impl.Computer;
import ru.taskdata.model.impl.PrintSplit;

public class DemoApp {
    public static void main(String[] args) {
        Processor processor = new Processor();

        HDD hdd = new HDD();

        RAM ram = new RAM();

        Computer computer = new Computer(processor, hdd, ram);
        computer.rumHDD(hdd);
        PrintSplit.printDots();
        computer.rumRAM(ram);
        PrintSplit.printDots();
        computer.runProcessor(processor);
        PrintSplit.printDots();


    }
}

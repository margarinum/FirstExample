import ru.taskdata.model.component.*;
import ru.taskdata.model.impl.PrintSplit;

public class DemoApp {
    public static void main(String[] args) {
        RAM ram = new RAM();
        ram.setEramType(ERAMType.DDR2);
        ram.setCapacity(200.0);
        ram.start();

        PrintSplit.printDots();

        HDD hdd = new HDD();
        hdd.setCapacity(2220.0);
        hdd.setEhddType(EHDDType.SSD);
        hdd.start();

        PrintSplit.printDots();

        Processor processor = new Processor();
        processor.start();
        processor.setCahce(2);
        processor.setCores(3);
        processor.setFrequency(4);
        processor.start();


    }
}

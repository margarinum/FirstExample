import ru.taskdata.model.component.EHDDType;
import ru.taskdata.model.component.ERAMType;
import ru.taskdata.model.component.HDD;
import ru.taskdata.model.component.RAM;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("ghljhgljhgkjhgjkhy");
        HDD hdd = new HDD();
        hdd.getAllHddType();
        hdd.setEhddType(EHDDType.Flash);
        System.out.println("-----");
        System.out.println(hdd.getEhddType().toString());

        RAM ram = new RAM();
        ram.getAllRAMType();
        ram.setEramType(ERAMType.DDR3);
        System.out.println(ram.getEramType().toString());
    }
}

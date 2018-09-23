import ru.taskdata.model.ComputerRunner;
import ru.taskdata.model.impl.Computer;

public class DemoApp {
    public static void main(String[] args) {

        ComputerRunner computerRunner = new ComputerRunner();
        Computer computer = computerRunner.add();
        computerRunner.run(computer);


    }
}

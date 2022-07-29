package AbstractHandler;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("open TXT");

    }

    @Override
    public void create() {
        System.out.println("create TXT");

    }

    @Override
    public void change() {
        System.out.println("change TXT");

    }

    @Override
    public void save() {
        System.out.println("save TXT");

    }
}

package AbstractHandler;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("open DOC");

    }

    @Override
    public void create() {
        System.out.println("create DOC");

    }

    @Override
    public void change() {
        System.out.println("change DOC");

    }

    @Override
    public void save() {
        System.out.println("save DOC");

    }
}

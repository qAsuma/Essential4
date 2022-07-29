package AbstractHandler;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("open XML");

    }

    @Override
    public void create() {
        System.out.println("create XML");

    }

    @Override
    public void change() {
        System.out.println("change XML");

    }

    @Override
    public void save() {
        System.out.println("save XML");

    }
}

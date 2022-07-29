package AbstractHandler;
//Создайте класс AbstractHandler.
//В теле класса создать методы void open(), void create(), void change(), void save().
//Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
//Написать программу, которая будет выполнять определение документа и для каждого формата должны
//быть методы открытия, создания, редактирования, сохранения определенного формата документа.

public abstract class AbstractHandler {
    public abstract void open();

    public abstract void create();

    public abstract void change();

    public abstract void save();

    public static void main(String[] args) {
        AbstractHandler[]abstractHandlers ={new XMLHandler(),new DOCHandler(),new TXTHandler()};
        for (AbstractHandler handler:abstractHandlers) {
            handler.open();
            handler.create();
            handler.change();
            handler.save();

        }
    }
}


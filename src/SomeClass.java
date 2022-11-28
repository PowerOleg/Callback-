import javax.swing.*;

public class SomeClass {
    // создаем колбек и его метод
    interface Callback {void callingBack();}
    Callback callback;
    public void registerCallBack(Callback callback){
        this.callback = callback;}
    void doSomething() {JOptionPane.showMessageDialog(null, "Working");
        // вызываем метод обратного вызова
        callback.callingBack();}
}

class MyClass implements SomeClass.Callback {
    @Override
    public void callingBack() {
        System.out.println("Callback");

    }
}
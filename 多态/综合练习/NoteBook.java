package Module11.多态.综合练习;

public class NoteBook {
    //开机
    public void start(){
        System.out.println("开机");
    }

    //使用USB
    /*
     * 使用USB设备
     * 根据传入的USB对象类型，执行不同的操作
     * 这里利用了多态的特性，允许传入的usb对象是USB接口的任何实现类
     * 通过instanceof检查，确定传入的对象类型，然后进行相应的类型转换并调用方法
     *
     * @param usb USB接口类型的对象，可以是Mouse或KeyBoard的实例
     */
    public void useUSB(USB usb){
        // 检查传入的usb对象是否为Mouse类型
        if (usb instanceof Mouse){
            // 类型转换为Mouse，并调用Mouse特有的方法
            Mouse mouse = (Mouse) usb;
            mouse.open();
            mouse.click();
            mouse.close();
        }else{
            // 如果不是Mouse类型，则转换为KeyBoard类型，并调用KeyBoard特有的方法
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.open();
            keyBoard.input();
            keyBoard.close();
        }
        // 由于USB接口的open和close方法在Mouse和KeyBoard中都有实现，
        // 且在各自的子类中有不同的实现，因此这里不再直接调用usb对象的open和close方法
        //usb.open();
        //usb.close();
    }

    //关机
    public void stop(){
        System.out.println("关机");
    }
}


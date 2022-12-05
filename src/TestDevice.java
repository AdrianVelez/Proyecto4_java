public class TestDevice {

    public static void main(String[] args) {
        //Creacion de objeto, pasando valores al constructor
        SmartDevice device1 = new SmartDevice(1,"digital","Samsung","J8");
        SmartDevice device2 = new SmartDevice(1,"digital","Samsung","S3");


        SmartDevice phone1 = new SmartPhone();
        SmartDevice phone2 = new SmartPhone("Oled", "38px","7441689986", "6.14", device1);
        System.out.println(phone2);

        //Modificacion de atributos, utilizando los metodos GET y SET
        phone2.setId(2);
        phone2.setMarca("iphone");
        phone2.setModelo("XR");
        phone2.setTipo("64");
        System.out.println(phone2.getId()+phone2.getMarca()+phone2.getTipo()+phone2.getModelo());


        SmartDevice watch1 = new SmartWatch( 1, "Monitoreo de actividad", "Plastico", device2);
        System.out.println(device2);
        System.out.println(watch1);


    }




}
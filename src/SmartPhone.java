public class SmartPhone extends SmartDevice {
    private String display;
    private String camara;
    private String numero;
    private String software;
    SmartDevice phone;

    public SmartPhone() {

    }

    public SmartPhone(String display, String camara, String numero, String software, SmartDevice phone) {
        this.display = display;
        this.camara = camara;
        this.numero = numero;
        this.phone = phone;

    }

    public String getDisplay() {
        return display;
    }
    public void setDisplay(String display) {
        this.display = display;
    }

    public String getCamara() {
        return this.camara;
    }
    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }

    public String getSoftware(){
        return this.software;
    }
    public void setSoftware(String software){
        this.software=software;
    }

    public SmartDevice getPhone() {
        return phone;
    }

    public void setPhone(SmartDevice phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "display='" + display + '\'' +
                ", camara='" + camara + '\'' +
                ", numero='" + numero + '\'' +
                ", software='" + software + '\'' +
                ", phone=" + phone +
                '}';
    }
}
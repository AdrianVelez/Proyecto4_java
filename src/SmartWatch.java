public class SmartWatch extends SmartDevice {

    private int id;
    private String funcionalidad;
    private String extenciones;
    SmartDevice watch;

    public SmartWatch(){

    }
    public SmartWatch(int id, String funcionalidad, String extenciones, SmartDevice watch){
        this.id=id;
        this.funcionalidad=funcionalidad;
        this.extenciones=extenciones;
        this.watch=watch;

    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getFuncionalidad(){
        return this.funcionalidad;
    }
    public void setFuncionalidad(String funcionalidad){
        this.funcionalidad=funcionalidad;
    }

    public String getExtenciones(){
        return this.extenciones;
    }
    public void setExtenciones(String extenciones){
        this.funcionalidad=funcionalidad;
    }

    public SmartDevice getWatch(){
        return this.watch;
    }
    public void setWatch(SmartDevice watch){
        this.watch=watch;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "id=" + id +
                ", funcionalidad='" + funcionalidad + '\'' +
                ", extenciones='" + extenciones + '\'' +
                ", watch=" + watch +
                '}';
    }
}

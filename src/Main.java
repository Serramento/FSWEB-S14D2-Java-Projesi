import com.workintech.courses.*;
import com.workintech.courses.enums.LampType;
import com.workintech.courses.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom= new Bedroom("yatak odası",new Wall("doğu"),new Wall("batı"),new Wall("kuzey"),new Wall("güney"),new Ceiling(275, PaintColor.BLUE),new Lamp(true,20, LampType.TABLE), new Bed("çift kişilik",2,45,1,1), new Wardrobe(60,180,20), new Carpet(150,250,PaintColor.RED));

        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getLamp().status();
        bedroom.getLamp().toggle();
        bedroom.getLamp().status();
    }
}
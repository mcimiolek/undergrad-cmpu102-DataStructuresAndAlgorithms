package drawrandomface;
import acm.graphics.*;
import java.awt.*;

public class Face extends GCompound {
    
    protected static final Color HEAD_COLOR = Color.LIGHT_GRAY;
    protected static final Color EYE_COLOR = Utility.randomColor();
    protected static final Color NOSE_COLOR = Utility.randomColor();
    protected static final Color EAR_COLOR = Utility.randomColor();
    protected static final Color MOUTH_COLOR = Utility.randomColor();
    protected static final Color LENS_COLOR = Utility.randomColor();
    protected static final Color FRAME_COLOR = Utility.randomColor();
    
    protected Head head;
    protected Eye leftEye, rightEye;
    protected Nose nose;
    protected Ear leftEar, rightEar;
    protected Mouth mouth;
    protected Glasses glasses;
    
    public Face() {
        createComponents();
        addComponents();
    }    
    
    public void createComponents() {
        this.head = new Head(HEAD_COLOR);
        this.leftEye = new Eye(25,35,Utility.randomDouble(10, 30),0.5,EYE_COLOR);
        this.rightEye = new Eye(75,35,Utility.randomDouble(10, 30),0.5,EYE_COLOR);
        this.nose = new Nose(20,Utility.randomDouble(5, 30),NOSE_COLOR);
        this.leftEar = new Ear(0,50,Utility.randomDouble(10, 30),Utility.randomDouble(5, 60),EAR_COLOR);
        this.rightEar = new Ear(100,50,Utility.randomDouble(10, 30),Utility.randomDouble(5, 60),EAR_COLOR);
        this.mouth = new Mouth(50,30,MOUTH_COLOR);
        this.glasses = new Glasses(50, 35, Utility.randomDouble(30, 50), LENS_COLOR, FRAME_COLOR);
    }

    public void addComponents() {
        add(leftEar);
        add(rightEar);
        add(head);
        add(leftEye);
        add(rightEye);
        add(nose);
        add(mouth);
        add(glasses);
    }

}

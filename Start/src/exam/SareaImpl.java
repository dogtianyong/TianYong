package exam;

public class SareaImpl implements Sarea {
     private  double  radius=0;
    public double area() {
        if (radius!=0){
          return   PI*Math.pow(radius,2);
        }else{
            System.out.println("请输入半径值");
            return 0;
        }

    }
    public SareaImpl(){

    }
    public SareaImpl(double radius){
        this.radius=radius;
    }
}

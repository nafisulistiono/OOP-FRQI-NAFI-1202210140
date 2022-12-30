public class Calculation implements Runnable {

    public double radius, side, area;
    public double phi = 3.14d;
    @Override
    public void run(){
        System.out.println("thread will be start in");
        for (int a = 3; a > 0; --){
            System.out.println("thread start" + a);
        }
        try {
           Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public double getSquare(){
        return this.area;

    }

    public void setSquare(){
        if (side < 1) {
            throw new IllegalArgumentException();
        }
        else{
            this.area = side*side;
        } 
    }

    public double getCircle(){
        return this.area;
    }

    public void setCircle(){
        if (this.radius < 1) {
            throw new IllegalArgumentException();
        }
        else {
            this.area = this.phi * this.radius * this.radius;
        }            
    }

    public double getTrapezoid(){
        return this.area;
    }

    public void setTrapezoid(double a, double b, double t){
        if ((a < 1 || b < 1)) {
            throw new IllegalArgumentException();
        }else{
            this.area = (a + b) * t;
        }
    }

}
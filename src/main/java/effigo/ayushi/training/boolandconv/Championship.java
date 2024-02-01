package effigo.ayushi.training.boolandconv;

public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;
        if (margin >= 300){
            System.out.println("Gryffindor won! \n");
        }
        else if (margin >= 0){
            System.out.println("Gryffindor is second! \n");
        }
        else if(margin >= -100){
            System.out.println("gryffindor is third! \n");
        }
        else{
            System.out.println("Gryffindor is fourth1");
        }
    }
}

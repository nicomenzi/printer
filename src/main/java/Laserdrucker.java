public class Laserdrucker implements Printable{
    public Laserdrucker(){

    }

    @Override
    public void drucken(String text){
        System.out.println("Der Laserdrucker sendet" + text);
    }

}

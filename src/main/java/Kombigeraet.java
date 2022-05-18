public class Kombigeraet implements Faxable, Printable{

    public Kombigeraet() {

    }
    @Override
    public void drucken(String text){
        System.out.println("Kombiergerät sendet " + text);
    }

    @Override
    public void senden(String text){
        System.out.println("Kombiergerät sendet " + text);
    }


}

public class Faxgeraet implements Faxable{

    public Faxgeraet(){

    }

    @Override
    public void senden(String text){
        System.out.println("Das FAxgerät sendet " + text);
    }
}

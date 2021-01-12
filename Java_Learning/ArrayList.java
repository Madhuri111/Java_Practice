import java.util.ArrayList;
class Array_L{
    public static void main(String args[]){
        ArrayList<String> Madhuri=new ArrayList<String>();
        System.out.println("Size initially :"+Madhuri.size());    
        Madhuri.add("Manasa");
        Madhuri.add("Aswini");
        //Removing:-- Madhuri.remove("Manasa"); or else
        //Madhuri.remove(1);
        System.out.println("Size after adding:"+Madhuri.size()+"\n"+"elements in Arraylist:"+Madhuri);
    }
}
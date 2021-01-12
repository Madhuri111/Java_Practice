class Person{
    String Gender;
    String Name;
    int age;
    String Fav;

    public String getInfo(){
        return ("Name is:"+Name+"Age is:"+age+"Gender is:"+Gender);
    }
}
public class Execute{
    public static void main(String[] args){
        Person Manasa=new Person();
        Manasa.Name="manasa";
        Manasa.age=17;
        Manasa.Gender="Female";
        System.out.println(Manasa.getInfo());
    }
}
//class is for just defining data
//you can't even write a loop in class

/*class Arr{
    public static void main(String args[]){
    int arr[]= new int[3];

    for(int count=0;count<3;count++)
    {
       arr[count]=count+1;
    }
    for(int count=0;count<3;count++)
    {
        System.out.println(arr[count]);
    }
    }
}
*/
//Multidimensional :-- Ex: int twoD[ ][ ] = new int[4][5] ;
class Arr{
        public static void main(String args[]){
    int arr[]= new int[3];
    arr[0]=2;
    arr[1]=6;
    arr[2]=8;
    for(int count=0;count<3;count++)
    {
        System.out.println(arr[count]);
    }
        }
}
class ArrayPassingDemo{
    public static void passByRef(String a[]){
        a[0]="changed";
    }


public static void main(String args[])
{
    String []b={"Madhuri","Manasa"};
    System.out.println("Before Function Call    "+b[0]);
    ArrayPassingDemo.passByRef(b);
    System.out.println("After Function Call    "+b[0]);
}
}
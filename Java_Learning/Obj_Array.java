
class ObjectArray{
    public static void main(String args[]){
        Account objecs[]=new Account[2];
        objecs[0]=new Account();
        objecs[1]=new Account();
        objecs[0].set(1,2);
        objecs[1].set(3,4);
        System.out.println("For Array Element 0");
        objecs[0].show();
        System.out.println("For Array Element 1");
        objecs[1].show();
    }
}
class Account{
    int a;
    int b;
    public void set(int e,int f){
        a=e;
        b=f;
    }
    public void show(){
        System.out.println("Value of a ="+a);        
        System.out.println("Value of b ="+b);

    }

}
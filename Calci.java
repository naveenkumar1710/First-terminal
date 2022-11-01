public class Calci{
        int x=0;
        int y=1;
public static void main(String[]args){
        Calci c1=new Calci();
        c1.x=10;
        c1.y=5;
        c1.add(5,5);
        //Calci c2=new Calci();
        //c2.sub();
        }
       void add(int x,int y){
            System.out.println(x+y);
            System.out.println(this.x+this.y);
            this.sub();
        }
        void sub(){
            System.out.println(x-y);
        }
      


}


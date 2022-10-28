                                       // Constructor example program //
public class Itemp{
            String name="yuga";
            int emId=1122;
         Itemp(String n,int id){
            name=n;
            emId=id;
            System.out.println(name+emId);
         }
         Itemp(String n,int id,boolean pr){
              n=name;
              id=emId;
              System.out.println(n+id+pr);
          }
public static void main(String[]args){
     Itemp s1=new Itemp("sugu",1234);
     Itemp s2=new Itemp("naveen",4455,true);
}
}         

                             //Constructor Chaining
public class PayilagamInstitue01 extends PayilagamInstitute{
              PayilagamInstitue01(){
                    System.out.println("Sugu");
              }
              PayilagamInstitue01(boolean a,float b,char c ){
                  super(5,5,"naveen");
                  System.out.println(a+"\n"+b+"\n"+c);
              }
public static void main(String[]args){
              PayilagamInstitue01 javacourse=new PayilagamInstitue01();
              PayilagamInstitue01 course=new PayilagamInstitue01(true,5.8f,'a');             
}

}

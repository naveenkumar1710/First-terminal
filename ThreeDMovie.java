public class ThreeDMovie extends TwoDMovie{
        int noOfAds=4;
        void watchingMovie(){
            super.watchingMovie();
            System.out.println("I am watching 3D Movie");
        }
        void playAds(){
            super.playAds(5,"ball");
            System.out.println("Playing 3D Ads");
        this.totalNoOfAds();
        }
        void totalNoOfAds(int a,char b){
            System.out.println(noOfAds+" "+super.noOfAds);
        }
public static void main(String[]args){
        ThreeDMovie movie=new ThreeDMovie();
            movie.watchingMovie();
            movie.playAds();
        }
}

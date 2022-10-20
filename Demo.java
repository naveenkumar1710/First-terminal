class Demo
    {
    public static void main(String[] args)
    {
    Demo demo = new Demo();
    int result = demo.add(10,20);
    int naveen=demo.multiply(2,10);
    //demo.multiply(30,2);
    System.out.println(naveen);
    System.out.println(result);
    
    }
    int multiply(int no1, int no2){
    return no1*no2;

    }
     int add(int no1, int no2)
    {
    return no1+no2;
    }
    }

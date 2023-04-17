public class MethodsDemo {
    public static void main(String[] args){

        MethodsDemo d = new MethodsDemo();
        String name = d.getData();
        System.out.println(name);
        Methodsdemo2 d1 = new Methodsdemo2();
        d1.getUserData();
        getData2();

    }
   
    public String getData()
    
    {
        System.out.println("We love you Adwita & Atharv");
        return"Mumma & Pappa";
        
    }

    public static String getData2()
    
    {
        System.out.println("We love you Adwita & Atharv");
        return"Mumma & Pappa";
        
    }


}

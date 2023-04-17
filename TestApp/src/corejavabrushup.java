public class corejavabrushup {
    public static void main(String[] args) {
        int mynum = 5;
        String website = "Rahul Shetty Academy";
        char letter = 'A';
        Double dec = 3.26;
        boolean mycard = true; 
        
        System.out.println(mynum + " " + "is the value stored in the mynum variable");

        // array
        int[] arr = new int[6];
        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 5;
        arr[3] = 6;
        arr[4] = 2;
        arr[5] = 9;

        int [] arr2 = {1,2,3,4,5};
        {
                System.out.println(arr2[3]);
        }
        for(int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) 
        {
            System.out.println(arr2[i]);
        }
        String[] name = {"Rakesh", "Meenakshi", "Adwita", "Atharv"};

        for(int i = 0; i < name.length; i++)
        {
            System.out.println(name[i]);
        }

    
    
    
    for(String s:name)
    {
        System.out.println(s);
    }

    }
   
}
    


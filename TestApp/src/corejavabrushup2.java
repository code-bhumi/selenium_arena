import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class corejavabrushup2 {
    public static void main(String[] args){
        
        int[] arr = {5,2,6,3,6,15,39,1,8,7,9,14,18};

        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                System.out.println(arr[i]);
                break;
            }

            else
            {
                System.out.println(arr[i] + " " + "is not multiple of 2");
            }
        }

        ArrayList<String> a = new ArrayList();
        a.add("Adwita");
        a.add("Atharv");
        a.add("Education");
        a.add("Success");
        System.out.println(a.get(2));

        for(int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        }

        System.out.println("****************");

        for(String val:a)
        {
            System.out.println(val);
        }

        // item present in arraylist or not

        System.out.println(a.contains("Success"));

        // convert simple array to arraylist

        String[] name = {"Adwita", "Atharv", "Rakesh", "Meenakshi"};
        List<String> nameArrayList = Arrays.asList(name);
        nameArrayList.contains("Adwita");

    }    
}

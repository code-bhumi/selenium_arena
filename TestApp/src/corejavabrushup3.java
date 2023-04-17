public class corejavabrushup3 {
    public static void main(String[] args) {
        // string is an object  // String literal(if the content of two string is same it will generate only one object)
        
       
        String s1 =  "i love mathematics";

        // new (this method will generate new object every time irrespective of the content)

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        String s =  "i love universe";
        String[] splittedString = s.split("love");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());
        for(int i = s.length() - 1; i >= 0; i--)
        {
            System.out.println(s.charAt(i));
        }

         
    }
}

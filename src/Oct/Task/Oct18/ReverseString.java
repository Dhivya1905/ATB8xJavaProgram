    package Oct.Task.Oct18;

    public class ReverseString {

       // Reverse the String without using the any functions. (for loop)

        public static void main(String[] args){
            String str= "Dhivya Pradeepkumar";
            for(int i=str.length()-1; i>=0 ;i-- )
            {
                char ch=str.charAt(i);
                System.out.print(ch);
            }
        }
    }

package Oct.Task.Oct18;

public class Palindrome {
    /*Input : str = "abba"
    Output: Yes

    Input : str = "pramod"
    Output: No*/

    public static void main(String[] args)
    {
        String str="Dhivya";
        StringBuilder result=new StringBuilder();

        for(int i= str.length()-1;i>=0;i--) {

            result.append(str.charAt(i));
        }

        System.out.println("Input String : " + str);
        System.out.println("Reverse String : " + result);

            if (str.equals(result.toString())){

                System.out.println("Palindrome : Yes");
            }

            else { System.out.println("palindrome : No");
            }


            }



}

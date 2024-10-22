package Oct.ex_16102024_Static_and_Enum.Enum;

public class Lab050 {

    public static void main(String[] args){

        System.out.println(color.Red.getHexcode());
    }

    enum color{

        Red("#1234"),
        Green("#34554"),
        yellow("#68909");

        private String hexcode;

        private color(String hexcode) {
            this.hexcode = hexcode;
        }

        public String getHexcode() {
           return this.hexcode;
        }
    }
}



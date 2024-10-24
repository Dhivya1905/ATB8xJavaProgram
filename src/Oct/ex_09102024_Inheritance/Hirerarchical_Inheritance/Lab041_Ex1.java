package Oct.ex_09102024_Inheritance.Hirerarchical_Inheritance;

public class Lab041_Ex1 {

    public static void main(String[] args){

        Shali Sh= new Shali ();
        System.out.println("========Shali Asset===========");
        Sh.Asset_S();
        Sh.Asset_F();

        Dhivya Dh= new Dhivya ();
        System.out.println("==========Dhivya  Asset==========");
        Dh.Asset_D();
        Dh.Asset_F();

        Vignesh Vg= new Vignesh ();
        System.out.println("==========Vignesh Asset=============");
        Vg.Asset_V();
        Vg.Asset_F();

Father F=new Father();
        System.out.println("==========Father Asset=============");
F.Asset_F();

    }
}

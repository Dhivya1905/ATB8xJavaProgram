                    package Oct.ex_25102024_Array;

                    import java.util.Arrays;

                    public class String_Array {
                        public static void main (String[] args){
                    String[] names=new String[5];
                    names[0]="Anil";
                    names[1]="Amit";
                            names[2]="Banu";
                            names[3]="Dhruv";
                            names[4]="Arun";
                            System.out.println(names.length);
                            System.out.println(names[1]);
                            System.out.println("**************************");
                            Arrays.sort(names);
                            for(String s:names)
                            {
                                System.out.println(s);
                            }
                            System.out.println("**************************");
                            int item = Arrays.binarySearch(names,"Dhruv");
                            System.out.println(item);


                            //Array limitation
                            //Size is fixed
                            //only stores same data type value
                            //difficult in Add or delete the array

                        }
                    }

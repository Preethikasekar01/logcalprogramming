package Hello;
    import java.util.Scanner;
    public  class AddTwoBinaryString{
        public static void main(String[] args) {
            //TODo Auto-generted method stub
            Scanner scanner = new Scanner(System.in);

            //prompt for the first binary string
            System.out.print("Enter the first binary string:");
            String binary1 = scanner.nextLine();

            //promot for the second binary string 
            System.out.print("Enter the second binary string:");
            String binary2 = scanner.nextLine();

            //perfrom for the addition of binary string
            String result = addBinary(binary1,binary2);

            //display the result 
            System.out.println("the sum of the two binary string is:"+result);

            //close the scanner to void resource leaks
            scanner.close();
        }

        //Method to add two binary string
        public static String addBinary(String a,String b) {
            StringBuilder result = new StringBuilder();
            int carry = 0;

            int i = a.length() -1;
            int j = b.length() -1;



            while (i>=0|| j>=0||carry!=0){
           int sum = carry;

             if(i>=0){
                sum +=a.charAt(i) -'0';// conver char to char
                i--;
             }
             if(j>=0){
                sum +=a.charAt(j) -'0';// conver char to char
                j--;
             }
             result.append(sum%2);//Append the binary digit
             carry = sum /2;//calaculate carry
            }
            return rusult.reverse().toString();//Reverse the result
        } 
        }
    
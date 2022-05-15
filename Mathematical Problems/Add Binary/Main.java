public class Main {
    public static void main(String[] args) {
        String a = "11", b = "1" ;
        String ans = addBinary(a,b);
        System.out.println("Sum is "+ans);        
    }

    public static String addBinary(String a,String b){
        StringBuilder ans = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;

        int carry = 0;

        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            carry = sum>1?1:0;
            ans.append(sum%2);

            i--;
            j--;
        }
        if(carry!=0){
            ans.append(carry);
        }

        return ans.reverse().toString();
    }
}

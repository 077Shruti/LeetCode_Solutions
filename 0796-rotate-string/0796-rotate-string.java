class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        for(int i=0;i<s.length();i++){
            String b=check(s);

            if(b.equals(goal)) {
                
                return true;
            }else{
                s=b;
            }
        }
        return false;
        
    }
    public String check(String str){

    String a= str.substring(1) + str.substring(0, 1);
    System.out.println(a);
    return a;

    }
}
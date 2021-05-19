https://practice.geeksforgeeks.org/problems/reverse-a-string/1
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int j=str.length()-1;
        String s="";
        for(int i=j;i>=0;i--){
            s+=str.charAt(i);
        }
        return s;
    }
}

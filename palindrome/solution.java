class Solution {
    public boolean isPalindrome(int x) {
        int palin=0;int num=x;
        if (x<0)
            return false;

            for (int i=x;i>0;i=i/10)
            {
                int d=i%10;
                palin=palin*10+d;
            }
                if (x== palin)
                    return true;
                else 
                    return false;

            
        
    }
}

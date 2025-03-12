class Solution {
    public int lengthOfLongestSubstring(String s) {

      Set <Character> s1=new HashSet<>();

      int left=0;int maxlength=0;

      for(int right=0;right<s.length();right++){
        while(s1.contains(s.charAt(right))){
            s1.remove(s.charAt(left));
            left++;
        }

        s1.add(s.charAt(right));

        int currentlength=right-left+1;

        if(currentlength>maxlength){
            maxlength=currentlength;
        }
      }
      return maxlength;
    }
}

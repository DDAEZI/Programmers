package Level1;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        int yc = 0, pc = 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i=0;i<str.length;i++)
        {
            if(str[i]=='p' || str[i]=='P')
                pc++;
            else if(str[i]=='y' || str[i]=='Y')
                yc++;
        }
        if(pc==yc)
            return true;
        else
            return false;
    }
}


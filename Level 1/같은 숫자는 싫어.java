import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int[] temp= new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                temp[j+1]=arr[i+1];
                j++;
            }
        }
        answer = new int[j+1];
        
        for(int i=0;i<j+1;i++)
        {
            answer[i] = temp[i];
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int j=0;
        int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % divisor == 0)
            {
                temp[j] = arr[i];
                j++;
            }
            else
                continue;
        }
        int[] answer = new int[j];
        System.out.println(answer.length);
        if(j>0)
        {
            for(int i=0;i<j;i++)
                answer[i] = temp[i];
        }
        else
            answer = new int[]{-1};
        
       int temp2 = 0;
        
        for(int i=0;i<answer.length;i++)
        {
            for(int k=i+1;k<answer.length;k++)
            {
                if(answer[i] > answer[k])
                {
                    temp2 = answer[i];
                    answer[i] = answer[k];
                    answer[k] = temp2;
                }
            }
        }
        return answer;
    }
}
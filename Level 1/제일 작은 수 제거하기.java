class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int minIdx = 0;
        
        if(arr.length==1)
            return new int[]{-1};
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[minIdx])
                minIdx = i;
        }
        answer = new int[arr.length-1];

        int i = 0;
        
        for(int j=0;j<arr.length;j++){
            if(minIdx == j)
                continue;
            else
            {
                answer[i] = arr[j];
                i++;
            }
        }
        
        return answer;
    }
}
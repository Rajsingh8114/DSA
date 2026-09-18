class Solution {
    public void duplicateZeros(int[] arr) {
        // appproach 1
        int [] dest = new int[arr.length];

        int s = 0,
            d = 0;

        while (s < arr.length){
            if(arr[s] == 0){
                if (d < arr.length){
                    dest[d] = 0;
                }
                d += 1;
                if(d < arr.length){
                    dest[d] = 0;
                }

            }else{
                if(d < arr.length){
                    dest[d] = arr[s];
                }
            }

            d += 1;
            s += 1;
        }

        for (int i =0; i < arr.length; i++){
            arr[i] = dest[i];
        }
    }
}        
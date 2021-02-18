public class FindMaxMang2Chieu {
    public static void main(String[] args) {
        int arr[][] = {
                {1,245,74,596,423,3421},
                {323,2323,634,6,5905,843},
        };
        int max =arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

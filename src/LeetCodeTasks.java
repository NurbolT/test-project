import java.lang.reflect.Array;
import java.util.*;

public class LeetCodeTasks {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//
//        for(int i=0; i<n; i++){
//            nums[i] = sc.nextInt();
//        }
//
//        int target = sc.nextInt();
//        int[] twoSumArray = new int[2];
        //FirstSolution
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(target == (nums[i] + nums[j])){
//                    twoSumArray[0] = i;
//                    twoSumArray[1] = j;
//                }
//            }
//        }


        //SecondSolution
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<nums.length; i++){
//            map.put(nums[i], i);
//        }
//
//        for(int i=0; i<nums.length; i++){
//            int number = target - nums[i];
//            if(map.containsKey(number) && map.get(number) != i){
//                System.out.println(i +" " + map.get(number));
//            }
//        }

        //ThirdSolution
//        int number;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<nums.length; i++){
//             number = target - nums[i];
//            if(map.containsKey(number)){
//                twoSumArray[0] = map.get(number);
//                twoSumArray[1] = i;
//                break;
//            }
//            map.put(nums[i], i);
//        }
//
//        System.out.println(twoSumArray[0] + " " + twoSumArray[1]);


        //twoSum
        String str = "anviaj";
        String s2 = "";
        int result = 0;
        int length = 0;
        String resultS = "";

//        if(str.isEmpty()){
//            result = 0;
//        }else if(str.trim().isEmpty()){
//            result = 1;
//        }else {
//            String s1 = str.trim();
//            if (s1.length() > 0) {
//                ArrayList<String> stringArrayList = new ArrayList<>();
//                for (int i = 0; i < s1.length(); i++) {
//                    if (s2.contains(String.valueOf(s1.charAt(i)))) {
//                        if(s1.charAt(i) == s1.charAt(i-1)) {
//                            s2 = "";
//                        }else{
//                            s2 = "" + s1.charAt(i-1);
//                        }
//
//                    }
//                    s2 = (s2 + s1.charAt(i)).trim();
//                    System.out.print(s2 + " ");
//                    if (length < s2.length()) {
//                        length = s2.length();
//                        resultS = s2;
//                    }
//
//                }
//
//
//                result = resultS.length();
//
//            }
//        }
//
//        System.out.println(result);






















    }
}

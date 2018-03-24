import java.util.Scanner;

public class ReverseWords {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            char[] cInput = input.toCharArray();
            for (int i = 0; i < cInput.length; i++) {
                if (!(cInput[i] <= 'z' && cInput[i] >= 'a'
                        || cInput[i] >= 'A' && cInput[i] <= 'Z')) {
                    cInput[i] = ' ';
                }
            }
            String input2 = new String(cInput);


            String[] sList = input2.split("\\s+");

            int left = 0;
            int right = sList.length - 1;
            while (left < right) {
                String temp = sList[right];
                sList[right] = sList[left];
                sList[left] = temp;
                left++;
                right--;
            }
            StringBuffer sb = new StringBuffer();
            for (String s: sList)
                sb.append(s + " ");
            System.out.println(sb.toString().trim());
        }
    }

}

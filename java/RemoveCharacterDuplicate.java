public class RemoveCharacterDuplicate {
        public static String removeDuplicates(String str){

            String result = "";

            for (int index = 0; index< str.length(); index++) {
                int j = 0;
                while (j < index && str.charAt(j) != str.charAt(index)) {
                    j++;
                }
                if (j == index) {
                    result += str.charAt(index);
                }

            }
            return result;
        }





        public static void main(String[] args){

            String word = "bananas";

            System.out.println(removeDuplicates(word));
        }


    }





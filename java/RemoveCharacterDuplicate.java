public class RemoveCharacterDuplicate {
        public static String removeDuplicates(String str){

            String result = "";

            for (int index = 0; index< str.length(); index++) {
                int count = 0;
                while (count < index && str.charAt(count) != str.charAt(index)) {
                    count++;
                }
                if (count == index) {
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





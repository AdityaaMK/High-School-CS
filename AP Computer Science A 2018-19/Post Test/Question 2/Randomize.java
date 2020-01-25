    public class Randomize {

        private String word;
        //the letters of the String cannot be change so newWord will contain the changes
        private String newWord;

        public Randomize(String word) {
            this.word = word;
            newWord = "";
        }

        public void jumble() {
            //pick a random value to shift each character in the string
            int rand = (int) (Math.random() * word.length()) + 1;

            //loop so we can examine each letter in the array
            for (int i = 0; i < word.length(); i++) {

                // change an uppercase to another uppercase
                if ((int) word.charAt(i) >= 65 && (int) word.charAt(i) <= 90) {
                    if (rand + (int)word.charAt(i) > 90) //if the new letter if past the last letter in alphabet
                        newWord += (char) ((int) (word.charAt(i)+rand) % 90 + 65);//restart from beginning of alphabet
                    else //no need to restart from beginning
                        newWord += (char) ((int) (word.charAt(i)+rand));

                }
                //change a lowercase to another lowercase
                else if ((int) word.charAt(i) >= 97 && (int) word.charAt(i) <= 122) {
                    if (rand + (int)word.charAt(i) > 122)//if the new letter if past the last letter in alphabet
                        newWord += (char) ((int) (word.charAt(i)+rand) % 122 + 97);//restart from beginning of alphabet
                    else//no need to restart from beginning
                        newWord += (char) ((int) (word.charAt(i)+rand));
                }
            }
            System.out.println(rand);
            System.out.println(newWord);
        }
    }


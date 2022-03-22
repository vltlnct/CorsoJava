public class Stringa {
            private int length=0;
            private char[] str;

            // Costruttore
            public Stringa(char[] strInput) {
                int i;
                char[] tempo = new char[strInput.length];
                for (i=0; i<strInput.length; i++) {
                    tempo[i] = strInput[i];
                }
                this.length = strInput.length;
                this.str = tempo;
            }


            public Stringa(int length, char[] str) {
                this.length = length;
                this.str = str; //Passaggio per riferimento
            }


            public char[] toUpperCase(){
            //....
            for (int i=0; i<this.length; i++) {
                if ( (this.str[i] >=97) && (this.str[i] <= 122) ){
                    this.str[i] = (char) (this.str[i] - 32);
                }
            }
            return this.str;
        }

        public String concat(String str)
        {
            return str;
        }

        public int length()
        {
            return this.length;
        }
}



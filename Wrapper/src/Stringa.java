public class Stringa {
            private int lunghezza=0;

            private char[] str;

            public String  larghezza = "larghezza";
            public static String  pippo = "pippo";
      //      public final int valoreIntero = 10;

            // Costruttore
            public Stringa(char[] strInput) {
                int i;
                char[] tempo = new char[strInput.length];
                for (i=0; i<strInput.length; i++) {
                    tempo[i] = strInput[i];
                }
                this.lunghezza = strInput.length;
                System.out.println("Lunghezza ="+this.lunghezza);
                this.str = tempo;


            }


            public Stringa(int length, char[] str) {
                this.lunghezza = length;
                this.str = str; //Passaggio per riferimento
            }

            private int lung()
            {
                return this.lunghezza;
            }

            public char[] toUpperCase(){
            //....
            for (int i=0; i<this.lung(); i++) {
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

        public static void ciao(){
                System.out.println("Ciao dalla classe Stringa");
        }

        public static void addio(){
            ciao();
            System.out.println("Addio dalla classe Stringa");
        }

/*         public static void main(String[] args) {
                System.out.println("Questo main parte da Stringa");
         }*/
}



public class NumeroIntero {

    public int laMiaParseInt(String strNum) {
        //48..57
        int valInt = 0;
        int peso;
        for (int i=0; i<strNum.length(); i++)
        {
            peso = (10^ (strNum.length()-1-i) );
            valInt = valInt  + ((strNum.charAt(i)-48)*peso);
        }
        return valInt;
    }

/*    public String toBinaryString(int valore){
        int ris = valore;
        int resto;
        int[] bit = new int[20];
        int i=0;
        do {
            resto = ris % 2;
            bit[i++] = resto;
            bit.push(resto)
            ris = Math.trunc(ris / 2);
        } while (ris!=0)
        let str="";
        for (let i=bit.length-1; i>=0; i--)
            str += bit[i];

        return str;
    }*/

}

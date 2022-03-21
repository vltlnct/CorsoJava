import java.util.ArrayList;
import java.util.List;

public class ConcessionarioNew {
        List<Auto> listaAuto;


        public ConcessionarioNew() {
            listaAuto = new ArrayList<Auto>();
        }

        public List<Auto> getListaAuto() {
            return this.listaAuto;
        }

        public void addAuto(Auto nuovaAuto) {
            this.listaAuto.add(nuovaAuto);
        }

        public Auto getAuto(int i){
            return this.listaAuto.get(i);
        }

        public String viewListaAuto()
        {
            String outString = new String("{\n");

            for (int i=0; i<listaAuto.size(); i++){
                outString += this.listaAuto.get(i).toString();
            }
            outString += "}";
            return outString;

        }

/*        public String toString()
        {
            String outString = new String("{\n");

            for (int i=0; i<listaAuto.size(); i++){
                outString += this.listaAuto.get(i).toString();
            }
            outString += "}";
            return outString;

        }*/
}



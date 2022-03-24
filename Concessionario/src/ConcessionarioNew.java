import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;

/* Utilizzo esclusivamente un Array con dimensione fissa.
   Per accedere agli elementi uso la classe Arrays che mi permette
   di sfruttore i metodi della classe List per accedere agli elementi.
*/
public class ConcessionarioNew {
        private Auto[] listaAuto;
        private int indiceArray;

        public ConcessionarioNew(int dim) {
            this.listaAuto = new Auto[dim];
            this.indiceArray = 0;
        }

        public List<Auto> getListaAuto() {
            List<Auto> lista = Arrays.asList(this.listaAuto);
            return lista;
        }

        public int getDimensioneLista(){
            List<Auto> lista = Arrays.asList(this.listaAuto);
            return lista.size();
        }

        public void addAuto(Auto nuovaAuto) {
            List<Auto> lista = Arrays.asList(this.listaAuto);
//            lista.add(nuovaAuto);
            lista.set(indiceArray++, nuovaAuto);
        }

        public Auto getAuto(int i){
            List<Auto> lista = Arrays.asList(this.listaAuto);
            return lista.get(i);
        }

        public String viewListaAuto()
        {
           String outString = new String("{\n"+ Arrays.deepToString(listaAuto) + "\n}");
           return  outString;
        }

    public void ordina()
    {
        /*
        Questa soluzione utilizza una classe Comparator<AutoVeicolo> :
                OrdinaPerTarga implements Comparator<AutoVeicolo>
        Vedere il metodo 	Arrays.sort(T[] a, Comparator<? super T> c)
        */
        Arrays.sort(this.listaAuto, new OrdinaPerTarga());
    }

}



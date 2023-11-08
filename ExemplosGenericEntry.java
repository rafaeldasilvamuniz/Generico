package generic;

/**
 * @author Rafael da Silva Muniz
 */
public class ExemplosGenericEntry {

    public static void main(String args[]) {
        GenericEntry<String, Long> entry = new GenericEntry<String, Long>("Carro Teste", 60L);
        System.out.println(entry.getData()+ " " + entry.getCodigo());

        GenericEntry<Long, Integer> entryLong = new GenericEntry<Long, Integer>(60L, 11);
        System.out.println(entryLong.getData() + " " + entryLong.getCodigo());
    }
}

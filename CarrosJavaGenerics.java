package generic;

import generic.fruta.Brasilia;
import generic.fruta.Carro;
import generic.fruta.Fusca;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rafael da Silva Muniz
 */
public class CarrosJavaGenerics {

    public static void main(String args[]) {
        List<String> lista = new ArrayList();
        lista.add("Comprador");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList();
        listaLong.add(50l);
        listaLong.add(45l);
        imprimir(listaLong);

        String primeiroSt = pegarPrimeiroCarro(lista);
        System.out.println(primeiroSt);

        imprimir(listaLong);

        List<Fruta> carros = new ArrayList<>();
        frutas.add(new Brasilia());
        frutas.add(new Fusca());
        imprimirFrutas(carros);
    }

    public static void imprimirFrutas(List<? extends Fruta> lista) {
        for (Carro carro : lista) {
            System.out.println(carro);
        }
    }

    public static void imprimir2(List<?> lista) {
        for (Object st : lista) {
            if (st instanceof Long) {
                Long stLong = (Long) st;
                System.out.println(stLong);
            }
            System.out.println("Carros: " + st);
        }
    }

    public static <T> void imprimir(List<T> lista) {
        for (T st : lista) {
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroCarro(List<T> lista) {
        return lista.get(0);
    }

    public static <T> Long pegarPrimeiroCarroListaLong(List<T> lista) {
        return (Long) lista.get(0);
    }

}

package main.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public Sets(){
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        construirTreeSetConComparador();
    }
    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Banana");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Pera");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Banana");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Uva");
        System.out.println("HashSet: "+conjunto);
        conjunto.add("Durazno");

        System.out.println("HashSet: "+conjunto);

        conjunto.remove("Banana");
        System.out.println("Despues de eliminar el elemento banana "+ conjunto);

        boolean contieneUva = conjunto.contains("Uva");
        System.out.println("¿HashSet contiene 'Uva': "+contieneUva);

        int tamano = conjunto.size();
        System.out.println("HashSet tiene un tamaño de: "+tamano);

    }
    public void construirLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Pera");
        conjunto.add("Banana");
        conjunto.add("Uva");
        conjunto.add("Durazno");
        System.out.println("LinkedHashSet: "+conjunto);
    }
    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Pera");
        conjunto.add("Banana");
        conjunto.add("Uva");
        conjunto.add("Durazno");
        System.out.println("TreeSet: "+conjunto);

    }
    public void construirTreeSetConComparador(){
        Comparator<String> comparadorOrdenInverso = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        };

        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Pera");
        conjunto.add("Banana");
        conjunto.add("Uva");
        conjunto.add("Durazno");
        System.out.println("TreeSet comparativo a la inversa: "+conjunto);

    }
}

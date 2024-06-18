package Generics;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new List<Pessoa>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Pessoa> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Pessoa pessoa) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Pessoa> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Pessoa> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Pessoa get(int index) {
                return null;
            }

            @Override
            public Pessoa set(int index, Pessoa element) {
                return null;
            }

            @Override
            public void add(int index, Pessoa element) {

            }

            @Override
            public Pessoa remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Pessoa> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Pessoa> listIterator(int index) {
                return null;
            }

            @Override
            public List<Pessoa> subList(int fromIndex, int toIndex) {
                return List.of();
            }
        };

        Pessoa novaPessoa = new Pessoa("Wellinton", 21, Genero.Masculino);
        Pessoa outraPessoa = new Pessoa("Cleitin",12, Genero.Masculino);

        List<Pessoa> gente = new ArrayList<>();
        gente.add(novaPessoa);
        gente.add(new Pessoa("Cleitin",12, Genero.Masculino));

        for (Pessoa O : gente){
            System.out.println(O.getNome());
        }
        //Collections.sort(gente);
        System.out.println(outraPessoa.compareTo(novaPessoa));
    }


}

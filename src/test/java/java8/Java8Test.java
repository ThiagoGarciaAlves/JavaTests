package java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Testes do Java 8 baseado no artigo:
 * http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8/
 */
public class Java8Test {

    List<String> palavras = Arrays.asList("rodrigo", "paulo", "caelum");

    /**
     * Como era o Comparator antes
     */
    @Test
    public void test001() {

        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        System.out.println(palavras.toString());

        Collections.sort(palavras, comparator); // Como era feito antes

        System.out.println(palavras.toString());

    }

    /**
     * Usando LAMBDA no Comparator e novo método SORT da List (interface default method)
     */
    @Test
    public void test002() {

        Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        System.out.println(palavras.toString());

        palavras.sort(comparator);

        System.out.println(palavras.toString());

    }

    /**
     * Passando direto o LAMBDA
     */
    @Test
    public void test003() {

        System.out.println(palavras.toString());

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(palavras.toString());

    }

    /**
     * Método comparing
     */
    @Test
    public void test004() {

        System.out.println(palavras.toString());

        palavras.sort(Comparator.comparing(s -> s.length()));

        System.out.println(palavras.toString());

    }

    /**
     * Método comparing
     */
    @Test
    public void test005() {

        System.out.println(palavras.toString());

        palavras.sort(Comparator.comparing(String::length));

        System.out.println(palavras.toString());

    }

    /**
     * Novo forEach
     */
    @Test
    public void test006() {

        palavras.forEach(s -> System.out.println(s));

    }

    /**
     * Stream
     */
    @Test
    public void test007() {

        palavras.stream()
                .filter(s -> s.length() < 7)
                .forEach(System.out::println);

    }

    /**
     * Thread com Lambda
     */
    @Test
    public void test009() {

        new Thread(() -> System.out.println("thread nova rodando")).start();

    }

}

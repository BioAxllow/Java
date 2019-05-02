package _00_Objektinis_Programavimas_2019._00_Dziugo_Examples._03_Sprint.Demo_12;

import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // Reduce
        /*
          reduce(accumulator):

          boolean foundAny = false;
          int result = null;
          for (int element : this stream) {
              if (!foundAny) {
                  foundAny = true;
                  result = element;
              }
              else
                  result = accumulator.applyAsInt(result, element);
          }
          return foundAny ? OptionalInt.of(result) : OptionalInt.empty();
         */
        OptionalInt reduce = IntStream.range(1, 101).reduce((x, y) -> x + y);
        System.out.println("reduce 1: " + reduce);

        /*
          reduce(identity, accumulator):

          int result = identity;
          for (int element : this stream)
              result = accumulator.applyAsInt(result, element)
          return result;
         */
        int sum = IntStream.range(1, 101).reduce(-50, (x, y) -> x + y);
        System.out.println("reduce 2: " + sum);

        /*
          reduce(identity, accumulator, combiner):

          U result = identity;
          for (T element : this stream)
              result = accumulator.apply(result, element)
          return result;

          The identity value must be an identity for the combiner function.
          This means that for all u, combiner(identity, u) is equal to u
          Additionally, the combiner function must be compatible with the accumulator function;
          for all u and t, the following must hold:
          combiner.apply(u, accumulator.apply(identity, t)) == accumulator.apply(u, t)
         */

        BiFunction<A, Integer, A> accumulator = (s, x) -> {
            A rez = s.copy();
            if (x % 2 == 0) rez.setEven(rez.getEven() + x);
            else rez.setOdd(rez.getOdd() + x);
            System.out.println("a: (" + s + ", " + x + ") -> " + rez);
            return rez;
        };

        BinaryOperator<A> combiner = (s, x) -> {
            A rez = s.copy();
            rez.setOdd(rez.getOdd() + x.getOdd());
            rez.setEven(rez.getEven() + x.getEven());
            System.out.println("c: (" + s + ", " + x + ") -> " + rez);
            return rez;
        };

        A sum1 = IntStream.range(1, 11)
                .boxed()
                //.parallel() - jei ne parallel tai combiner neiškviečiamas!!!
                .reduce(new A(0, 0), accumulator, combiner);
        System.out.println("reduce 3.1: " + sum1);

        A sum2 = IntStream.range(1, 11)
                .boxed()
                .parallel()
                .reduce(new A(0, 0), accumulator, combiner);
        System.out.println("reduce 3.2: " + sum2);
    }
}

class A {
    int even;
    int odd;

    public A(int even, int odd) {
        this.even = even;
        this.odd = odd;
    }

    @Override
    public String toString() {
        return "A{" +
                "even=" + even +
                ", odd=" + odd +
                '}';
    }

    public A copy() {
        return new A(even, odd);
    }

    public int getEven() {
        return even;
    }

    public void setEven(int even) {
        this.even = even;
    }

    public int getOdd() {
        return odd;
    }

    public void setOdd(int odd) {
        this.odd = odd;
    }
}

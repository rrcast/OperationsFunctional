import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // System.out.println(x(6,5)); debe mostrar 42  /// 11 +30 + 1
        System.out.println(x(5, 6)); // debe mostrar 42  /// 11 +30 - 1
    }

    //Usamos addExact, multiplyExact y SubtractExact ya que automaticamente lanzan una exception si el resultado desborda a los int, adem'as al tratarse de un static ahorramos la instanciacion
    public static int x(int a, int b) {
        List<Integer> integers = Arrays.asList(Math.addExact(a, b), Math.multiplyExact(a, b), Math.subtractExact(a, b));
        return integers.stream()
                .reduce(0, (c, d) -> c + d);
    }
}
/*
1- Dada una lista de funciones, se requiere minimizar la complejidad utilizando una abstraccion de la mismas, en la cual al ejecutar
una sola funcion se ejecutan todas(x) al mismo tiempo. (Utilizar solo programacion funcional para resolver el problema / Composicion de funciones)
Ejemplo:

>> sum(x=1, y=2) == 3
>> mul(x=1, y=2) == 2
>> sub(x=1, y=2) == -1
>> result = sum(3, 2, -1) = 4


Resultado:
>> x(1, 2) = 4
 */
package beans;

import javax.ejb.Stateless;

@Stateless
public class HolaMundoEJB {

    public int sumar(int a, int b) {
        return a + b;
    }
}
package X;

import java.util.Map;

public class B7R extends C196019Xg {
    public Object A00;
    public final int A01;

    public B7R(C200139gg r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public static void A00(C200139gg r1, Object obj, Map map, int i) {
        map.put(obj, new B7R(r1, i));
    }
}

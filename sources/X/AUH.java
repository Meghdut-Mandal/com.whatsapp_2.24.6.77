package X;

import java.io.Serializable;
import java.util.Comparator;

public class AUH implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;
    public final Object[] elements;

    public Object readResolve() {
        AnonymousClass8Hj r1 = new AnonymousClass8Hj(this.comparator);
        r1.add(this.elements);
        return r1.build();
    }

    public AUH(Comparator comparator2, Object[] objArr) {
        this.comparator = comparator2;
        this.elements = objArr;
    }
}

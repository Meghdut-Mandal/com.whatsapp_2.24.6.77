package X;

import java.io.Serializable;

public class AUG implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] elements;

    public Object readResolve() {
        return C23931Ak.copyOf(this.elements);
    }

    public AUG(Object[] objArr) {
        this.elements = objArr;
    }
}

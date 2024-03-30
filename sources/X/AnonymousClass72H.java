package X;

import java.io.Serializable;

/* renamed from: X.72H  reason: invalid class name */
public class AnonymousClass72H implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] elements;

    public Object readResolve() {
        return C20760y7.copyOf(this.elements);
    }

    public AnonymousClass72H(Object[] objArr) {
        this.elements = objArr;
    }
}

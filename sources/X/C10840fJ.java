package X;

import java.io.Serializable;

/* renamed from: X.0fJ  reason: invalid class name and case insensitive filesystem */
public final class C10840fJ implements Serializable {
    public static final long serialVersionUID = 0;
    public final C005102h[] elements;

    private final Object readResolve() {
        C005102h[] r4 = this.elements;
        C005102h r3 = C008903u.A00;
        for (C005102h plus : r4) {
            r3 = r3.plus(plus);
        }
        return r3;
    }

    public C10840fJ(C005102h[] r1) {
        this.elements = r1;
    }
}

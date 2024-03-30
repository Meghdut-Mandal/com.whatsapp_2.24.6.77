package X;

import java.util.List;

/* renamed from: X.9QC  reason: invalid class name */
public class AnonymousClass9QC {
    public int A00 = 0;
    public List A01 = null;

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        for (Object append : this.A01) {
            A0u.append(append);
            A0u.append(' ');
        }
        A0u.append('[');
        A0u.append(this.A00);
        return AnonymousClass000.A0t(A0u, ']');
    }
}

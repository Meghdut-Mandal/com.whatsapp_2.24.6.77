package X;

import java.util.ArrayList;

/* renamed from: X.6Ot  reason: invalid class name and case insensitive filesystem */
public final class C131366Ot {
    public static final C131366Ot A01 = new C131366Ot(0);
    public static final C131366Ot A02 = new C131366Ot(1);
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C131366Ot) && this.A00 == ((C131366Ot) obj).A00);
    }

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList A0I = AnonymousClass001.A0I();
        if ((i & 1) != 0) {
            A0I.add("Underline");
        }
        if ((i & 2) != 0) {
            A0I.add("LineThrough");
        }
        int size = A0I.size();
        StringBuilder A0u = AnonymousClass000.A0u();
        if (size == 1) {
            A0u.append("TextDecoration.");
            A0u.append((String) C36441kJ.A12(A0I));
        } else {
            A0u.append("TextDecoration[");
            A0u.append(C109315Xc.A00(", ", A0I));
            A0u.append(']');
        }
        return A0u.toString();
    }

    public C131366Ot(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }
}

package X;

import java.util.Objects;

/* renamed from: X.2vw  reason: invalid class name and case insensitive filesystem */
public abstract class C56222vw {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        String[] strArr = C56232vx.A00;
        Objects.requireNonNull(", ", "delimiter");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(strArr[0]);
        int i = 1;
        do {
            A0u.append(", ");
            A0u.append(strArr[i]);
            i++;
        } while (i < 13);
        C36351kA.A1K(A0u, A0z);
        A0z.append(" FROM ");
        A00 = AnonymousClass000.A0q("devices", A0z);
    }
}

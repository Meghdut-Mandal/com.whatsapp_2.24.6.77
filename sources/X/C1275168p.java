package X;

import java.util.Arrays;

/* renamed from: X.68p  reason: invalid class name and case insensitive filesystem */
public class C1275168p {
    public final int A00;

    public boolean A00(C1275168p r3) {
        return AnonymousClass000.A1S(this.A00, r3.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1275168p) || this.A00 != ((C1275168p) obj).A00) {
            return false;
        }
        return true;
    }

    public C1275168p(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, this.A00);
        return 31 + Arrays.hashCode(A0L);
    }
}

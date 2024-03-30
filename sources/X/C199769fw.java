package X;

import java.util.Arrays;

/* renamed from: X.9fw  reason: invalid class name and case insensitive filesystem */
public class C199769fw {
    public static final C199769fw A02 = new C199769fw(AnonymousClass90T.REMOVE, new byte[]{2});
    public static final C199769fw A03 = new C199769fw(AnonymousClass90T.SET, new byte[]{1});
    public final AnonymousClass90T A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199769fw)) {
            return false;
        }
        C199769fw r4 = (C199769fw) obj;
        return Arrays.equals(this.A01, r4.A01) && this.A00 == r4.A00;
    }

    public C199769fw(AnonymousClass90T r1, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = r1;
    }

    public int hashCode() {
        return (AnonymousClass000.A0K(this.A00, AnonymousClass001.A0L()) * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncdOperation{bytes=");
        C90474aD.A1O(A0u, this.A01);
        A0u.append(", syncdOperation=");
        return C90464aC.A0X(this.A00, A0u);
    }
}

package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.AUw  reason: case insensitive filesystem */
public abstract class C21673AUw implements Iterable, Serializable {
    public static final C21673AUw A00 = new AnonymousClass8E0(C197089b7.A01);
    public static final C22891Axm A01;
    public int zzc = 0;

    public int A01() {
        AnonymousClass8E0 r1 = (AnonymousClass8E0) this;
        if (r1 instanceof C170578Dz) {
            return ((C170578Dz) r1).zzd;
        }
        return r1.zzb.length;
    }

    public C21673AUw A02(int i) {
        AnonymousClass8E0 r2 = (AnonymousClass8E0) this;
        int A002 = A00(0, i, r2.A01());
        if (A002 == 0) {
            return A00;
        }
        return new C170578Dz(r2.zzb, r2.A03(), A002);
    }

    public abstract boolean equals(Object obj);

    static {
        C22891Axm a3j;
        if (C196949an.A00()) {
            a3j = new C21021A3k();
        } else {
            a3j = new C21020A3j();
        }
        A01 = a3j;
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder A0h = C90524aI.A0h(32);
            A0h.append("Beginning index: ");
            A0h.append(i);
            throw C165617ti.A0W(AnonymousClass000.A0q(" < 0", A0h));
        } else if (i2 < i) {
            StringBuilder A0h2 = C90524aI.A0h(66);
            A0h2.append("Beginning index larger than ending index: ");
            A0h2.append(i);
            throw C165617ti.A0W(AnonymousClass000.A0r(", ", A0h2, i2));
        } else {
            StringBuilder A0h3 = C90524aI.A0h(37);
            A0h3.append("End index: ");
            A0h3.append(i2);
            throw C165617ti.A0W(AnonymousClass000.A0r(" >= ", A0h3, i3));
        }
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int A012 = A01();
            AnonymousClass8E0 r0 = (AnonymousClass8E0) this;
            byte[] bArr = r0.zzb;
            int A03 = r0.A03();
            i = A012;
            Charset charset = C197089b7.A00;
            for (int i2 = A03; i2 < A03 + A012; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new AY7(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = Integer.toHexString(System.identityHashCode(this));
        int A012 = A01();
        AnonymousClass000.A1K(A1Q, A012);
        if (A012 <= 50) {
            concat = AnonymousClass95T.A00(this);
        } else {
            concat = String.valueOf(AnonymousClass95T.A00(A02(47))).concat("...");
        }
        A1Q[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1Q);
    }
}

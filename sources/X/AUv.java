package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class AUv implements Iterable, Serializable {
    public static final AUv A00 = new AnonymousClass8D2(C197079b6.A01);
    public static final C22887Axi A01;
    public int zzfk = 0;

    public byte A01(int i) {
        AnonymousClass8D2 r3 = (AnonymousClass8D2) this;
        if (!(r3 instanceof AnonymousClass8D1)) {
            return r3.zzfp[i];
        }
        AnonymousClass8D1 r32 = (AnonymousClass8D1) r3;
        int i2 = r32.zzfn;
        if (((i2 - (i + 1)) | i) >= 0) {
            return r32.zzfp[r32.zzfm + i];
        }
        if (i < 0) {
            throw C165567td.A0M("Index < 0: ", C90524aI.A0h(22), i);
        }
        StringBuilder A0h = C90524aI.A0h(40);
        A0h.append("Index > length: ");
        A0h.append(i);
        throw C165567td.A0M(", ", A0h, i2);
    }

    public int A02() {
        AnonymousClass8D2 r1 = (AnonymousClass8D2) this;
        if (r1 instanceof AnonymousClass8D1) {
            return ((AnonymousClass8D1) r1).zzfn;
        }
        return r1.zzfp.length;
    }

    public void A03(C194279Ox r4) {
        AnonymousClass8D2 r0 = (AnonymousClass8D2) this;
        ((AnonymousClass8D7) r4).A0E(r0.zzfp, r0.A04(), r0.A02());
    }

    public abstract boolean equals(Object obj);

    public /* synthetic */ Iterator iterator() {
        return new AY1(this);
    }

    static {
        C22887Axi a3r;
        if (C196939am.A00 == null || C196939am.A01) {
            a3r = new A3R();
        } else {
            a3r = new A3S();
        }
        A01 = a3r;
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
        int i = this.zzfk;
        if (i == 0) {
            int A02 = A02();
            AnonymousClass8D2 r0 = (AnonymousClass8D2) this;
            byte[] bArr = r0.zzfp;
            int A04 = r0.A04();
            i = A02;
            Charset charset = C197079b6.A04;
            for (int i2 = A04; i2 < A04 + A02; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzfk = i;
        }
        return i;
    }

    public final String toString() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = Integer.toHexString(System.identityHashCode(this));
        AnonymousClass000.A1K(A0M, A02());
        return String.format("<ByteString@%s size=%d>", A0M);
    }
}

package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.AUx  reason: case insensitive filesystem */
public abstract class C21674AUx implements Iterable, Serializable {
    public static final C21674AUx A00 = new AnonymousClass8I5(AnonymousClass9BD.A05);
    public static final C22898AyA A01;
    public int hash = 0;

    public int A02() {
        AnonymousClass8I5 r1 = (AnonymousClass8I5) this;
        if (r1 instanceof AnonymousClass8I4) {
            return ((AnonymousClass8I4) r1).bytesLength;
        }
        return r1.bytes.length;
    }

    public C21674AUx A03(int i) {
        AnonymousClass8I5 r2 = (AnonymousClass8I5) this;
        int A002 = A00(0, i, r2.A02());
        if (A002 == 0) {
            return A00;
        }
        return new AnonymousClass8I4(r2.bytes, r2.A07(), A002);
    }

    public void A05(byte[] bArr, int i) {
        AnonymousClass8I5 r3 = (AnonymousClass8I5) this;
        if (r3 instanceof AnonymousClass8I4) {
            AnonymousClass8I4 r32 = (AnonymousClass8I4) r3;
            System.arraycopy(r32.bytes, r32.bytesOffset, bArr, 0, i);
            return;
        }
        System.arraycopy(r3.bytes, 0, bArr, 0, i);
    }

    public abstract boolean equals(Object obj);

    static {
        C22898AyA a6u;
        if (C196959aq.A00 == null || C196959aq.A01) {
            a6u = new A6U();
        } else {
            a6u = new A6V();
        }
        A01 = a6u;
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i < 0) {
            A0u.append("Beginning index: ");
            A0u.append(i);
            throw C165617ti.A0W(AnonymousClass000.A0q(" < 0", A0u));
        } else if (i2 < i) {
            A0u.append("Beginning index larger than ending index: ");
            A0u.append(i);
            throw C165617ti.A0W(AnonymousClass000.A0r(", ", A0u, i2));
        } else {
            A0u.append("End index: ");
            A0u.append(i2);
            throw C165617ti.A0W(AnonymousClass000.A0r(" >= ", A0u, i3));
        }
    }

    public static AnonymousClass8I5 A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new AnonymousClass8I5(A01.B3j(bArr, i, i2));
    }

    public final String A04() {
        Charset charset = AnonymousClass9BD.A04;
        if (A02() == 0) {
            return "";
        }
        AnonymousClass8I5 r0 = (AnonymousClass8I5) this;
        return new String(r0.bytes, r0.A07(), r0.A02(), charset);
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int A02 = A02();
            AnonymousClass8I5 r0 = (AnonymousClass8I5) this;
            byte[] bArr = r0.bytes;
            int A07 = r0.A07();
            i = A02;
            Charset charset = AnonymousClass9BD.A04;
            for (int i2 = A07; i2 < A07 + A02; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return new AY8(this);
    }

    public final String toString() {
        String A0q;
        Locale locale = Locale.ROOT;
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = Integer.toHexString(System.identityHashCode(this));
        int A02 = A02();
        AnonymousClass000.A1K(A1Q, A02);
        if (A02 <= 50) {
            A0q = C1898295t.A00(this);
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C1898295t.A00(A03(47)));
            A0q = AnonymousClass000.A0q("...", A0u);
        }
        A1Q[2] = A0q;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1Q);
    }

    public final byte[] A06() {
        int A02 = A02();
        if (A02 == 0) {
            return AnonymousClass9BD.A05;
        }
        byte[] bArr = new byte[A02];
        A05(bArr, A02);
        return bArr;
    }
}

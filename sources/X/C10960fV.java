package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.0fV  reason: invalid class name and case insensitive filesystem */
public abstract class C10960fV implements Iterable, Serializable {
    public static final C10960fV A00 = new AnonymousClass0M5(AnonymousClass0WB.A05);
    public int zzc = 0;

    public abstract byte A01(int i);

    public abstract int A02();

    public abstract boolean equals(Object obj);

    public final /* synthetic */ Iterator iterator() {
        return new C12220hh(this);
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
            throw new IndexOutOfBoundsException(AnonymousClass000.A0q(" < 0", A0u));
        } else if (i2 < i) {
            A0u.append("Beginning index larger than ending index: ");
            A0u.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0r(", ", A0u, i2));
        } else {
            A0u.append("End index: ");
            A0u.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0r(" >= ", A0u, i3));
        }
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int A02 = A02();
            byte[] bArr = ((AnonymousClass0M5) this).zza;
            i = A02;
            Charset charset = AnonymousClass0WB.A00;
            for (int i2 = 0; i2 < A02; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        C10960fV r1;
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        int A02 = A02();
        AnonymousClass000.A1K(objArr, A02);
        if (A02 <= 50) {
            concat = AnonymousClass0QV.A00(this);
        } else {
            AnonymousClass0M5 r3 = (AnonymousClass0M5) this;
            int A002 = A00(0, 47, r3.A02());
            if (A002 == 0) {
                r1 = A00;
            } else {
                r1 = new AnonymousClass0M4(r3.zza, A002);
            }
            concat = AnonymousClass0QV.A00(r1).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}

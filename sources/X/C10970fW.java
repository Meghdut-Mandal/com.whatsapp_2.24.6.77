package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.0fW  reason: invalid class name and case insensitive filesystem */
public abstract class C10970fW implements Iterable, Serializable {
    public static final C10970fW A00 = new C04980Mt(AnonymousClass0S2.A05);
    public int zzc = 0;

    public abstract byte A02(int i);

    public abstract byte A03(int i);

    public abstract int A04();

    public abstract boolean equals(Object obj);

    public final /* synthetic */ Iterator iterator() {
        return new C12230hi(this);
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
            int A04 = A04();
            i = A04;
            C04980Mt r0 = (C04980Mt) this;
            byte[] bArr = r0.zza;
            int A06 = r0.A06();
            Charset charset = AnonymousClass0S2.A00;
            for (int i2 = A06; i2 < A06 + A04; i2++) {
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
        C10970fW r2;
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        int A04 = A04();
        AnonymousClass000.A1K(objArr, A04);
        if (A04 <= 50) {
            concat = A01(this);
        } else {
            C04980Mt r22 = (C04980Mt) this;
            int A002 = A00(0, 47, r22.A04());
            if (A002 == 0) {
                r2 = A00;
            } else {
                r2 = new C04970Ms(r22.zza, r22.A06(), A002);
            }
            concat = A01(r2).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public static String A01(C10970fW r5) {
        String str;
        StringBuilder sb = new StringBuilder(r5.A04());
        for (int i = 0; i < r5.A04(); i++) {
            int A02 = r5.A02(i);
            if (A02 != 34) {
                if (A02 == 39) {
                    str = "\\'";
                } else if (A02 != 92) {
                    switch (A02) {
                        case 7:
                            str = "\\a";
                            break;
                        case 8:
                            str = "\\b";
                            break;
                        case 9:
                            str = "\\t";
                            break;
                        case 10:
                            str = "\\n";
                            break;
                        case 11:
                            str = "\\v";
                            break;
                        case 12:
                            str = "\\f";
                            break;
                        case 13:
                            str = "\\r";
                            break;
                        default:
                            if (A02 < 32 || A02 > 126) {
                                sb.append('\\');
                                sb.append((char) (((A02 >>> 6) & 3) + 48));
                                sb.append((char) (((A02 >>> 3) & 7) + 48));
                                A02 = (A02 & 7) + 48;
                            }
                            sb.append((char) A02);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                sb.append(str);
            } else {
                str = "\\\"";
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public final byte[] A05() {
        int A04 = A04();
        if (A04 == 0) {
            return AnonymousClass0S2.A05;
        }
        byte[] bArr = new byte[A04];
        System.arraycopy(((C04980Mt) this).zza, 0, bArr, 0, A04);
        return bArr;
    }
}

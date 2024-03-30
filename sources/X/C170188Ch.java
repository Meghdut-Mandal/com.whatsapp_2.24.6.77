package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Ch  reason: invalid class name and case insensitive filesystem */
public class C170188Ch extends C10440eF {
    public static final C170188Ch A08;
    public static final byte[][] A09;
    public static final Parcelable.Creator CREATOR = new C204829qd();
    public final String A00;
    public final byte[] A01;
    public final int[] A02;
    public final byte[][] A03;
    public final byte[][] A04;
    public final byte[][] A05;
    public final byte[][] A06;
    public final byte[][] A07;

    static {
        byte[][] bArr = new byte[0][];
        A09 = bArr;
        A08 = new C170188Ch("", (byte[]) null, (int[]) null, bArr, bArr, bArr, bArr, (byte[][]) null);
    }

    public C170188Ch(String str, byte[] bArr, int[] iArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, byte[][] bArr6) {
        this.A00 = str;
        this.A01 = bArr;
        this.A03 = bArr2;
        this.A04 = bArr3;
        this.A05 = bArr4;
        this.A06 = bArr5;
        this.A02 = iArr;
        this.A07 = bArr6;
    }

    public static void A01(String str, StringBuilder sb, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public static boolean A02(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static List A00(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList A14 = C36441kJ.A14(r4);
        for (byte[] encodeToString : bArr) {
            A14.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(A14);
        return A14;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (obj instanceof C170188Ch) {
            C170188Ch r8 = (C170188Ch) obj;
            if (A02(this.A00, r8.A00) && Arrays.equals(this.A01, r8.A01) && A02(A00(this.A03), A00(r8.A03)) && A02(A00(this.A04), A00(r8.A04)) && A02(A00(this.A05), A00(r8.A05)) && A02(A00(this.A06), A00(r8.A06))) {
                int[] iArr = this.A02;
                if (iArr == null) {
                    list = Collections.emptyList();
                } else {
                    ArrayList A14 = C36441kJ.A14(r2);
                    for (int A1F : iArr) {
                        AnonymousClass000.A1F(A14, A1F);
                    }
                    Collections.sort(A14);
                    list = A14;
                }
                int[] iArr2 = r8.A02;
                if (iArr2 == null) {
                    list2 = Collections.emptyList();
                } else {
                    ArrayList A142 = C36441kJ.A14(r2);
                    for (int A1F2 : iArr2) {
                        AnonymousClass000.A1F(A142, A1F2);
                    }
                    Collections.sort(A142);
                    list2 = A142;
                }
                if (!A02(list, list2) || !A02(A00(this.A07), A00(r8.A07))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String A0p;
        StringBuilder A0i = C90524aI.A0i("ExperimentTokens");
        A0i.append("(");
        String str = this.A00;
        if (str == null) {
            A0p = "null";
        } else {
            StringBuilder A0h = C90524aI.A0h(C90474aD.A05(str) + 2);
            A0h.append("'");
            A0p = AnonymousClass000.A0p(str, "'", A0h);
        }
        A0i.append(A0p);
        A0i.append(", ");
        byte[] bArr = this.A01;
        A0i.append("direct");
        A0i.append("=");
        if (bArr == null) {
            A0i.append("null");
        } else {
            A0i.append("'");
            A0i.append(Base64.encodeToString(bArr, 3));
            A0i.append("'");
        }
        A0i.append(", ");
        A01("GAIA", A0i, this.A03);
        A0i.append(", ");
        A01("PSEUDO", A0i, this.A04);
        A0i.append(", ");
        A01("ALWAYS", A0i, this.A05);
        A0i.append(", ");
        A01("OTHER", A0i, this.A06);
        A0i.append(", ");
        int[] iArr = this.A02;
        A0i.append("weak");
        A0i.append("=");
        if (iArr == null) {
            A0i.append("null");
        } else {
            A0i.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    A0i.append(", ");
                }
                A0i.append(i2);
                i++;
                z = false;
            }
            A0i.append(")");
        }
        A0i.append(", ");
        A01("directs", A0i, this.A07);
        return AnonymousClass000.A0q(")", A0i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0F(parcel, this.A01, 3, C10440eF.A06(parcel, this.A00));
        AnonymousClass0Z9.A0I(parcel, this.A03, 4);
        AnonymousClass0Z9.A0I(parcel, this.A04, 5);
        AnonymousClass0Z9.A0I(parcel, this.A05, 6);
        AnonymousClass0Z9.A0I(parcel, this.A06, 7);
        int[] iArr = this.A02;
        if (iArr != null) {
            int A022 = AnonymousClass0Z9.A02(parcel, 8);
            parcel.writeIntArray(iArr);
            AnonymousClass0Z9.A07(parcel, A022);
        }
        AnonymousClass0Z9.A0I(parcel, this.A07, 9);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

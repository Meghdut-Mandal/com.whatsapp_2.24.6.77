package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9ui  reason: invalid class name and case insensitive filesystem */
public class C207199ui implements Parcelable {
    public static final Map A0P;
    public static final Parcelable.Creator CREATOR = new C23181B8p(5);
    public int A00;
    public long A01;
    public C207119ua A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final AnonymousClass16U A08;
    public final C207009uP A09;
    public final C206839u5 A0A;
    public final C206979uM A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final boolean A0M;
    public final byte[] A0N;
    public final String A0O;

    public int describeContents() {
        return 0;
    }

    public static int A00(String str) {
        if ("pending".equals(str)) {
            return 1;
        }
        if ("processing".equals(str)) {
            return 2;
        }
        if ("payment_requested".equals(str)) {
            return 7;
        }
        if ("completed".equals(str)) {
            return 3;
        }
        if ("delivered".equals(str)) {
            return 9;
        }
        if ("canceled".equals(str)) {
            return 4;
        }
        if ("partially_shipped".equals(str)) {
            return 5;
        }
        if ("shipped".equals(str)) {
            return 6;
        }
        if ("preparing_to_ship".equals(str)) {
            return 8;
        }
        C36321k7.A1R("CheckoutInfoContent/getOrderStatus can not recognise order status: ", str, AnonymousClass000.A0u());
        return 0;
    }

    public static String A01(C18820ts r2, C207199ui r3) {
        C207119ua r0 = r3.A02;
        if (r0 == null) {
            return null;
        }
        AnonymousClass16U r1 = r3.A08;
        C18740tg.A06(r1);
        return r1.B7e(r2, r0.A02.A00);
    }

    public int A02() {
        String str = this.A0H;
        if ("digital-goods".equals(str)) {
            return 1;
        }
        return C165587tf.A03("physical-goods".equals(str) ? 1 : 0);
    }

    public C207119ua A03(C206979uM r4) {
        C199449fK r2 = new C199449fK();
        r2.A01 = Math.abs(r4.A01);
        r2.A00 = r4.A00;
        r2.A02 = this.A08;
        return r2.A01();
    }

    public C206839u5 A04() {
        C206839u5 r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        List<C206909uC> list = this.A0L;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (C206909uC r2 : list) {
            if (r2 != null && "cards".equals(r2.A01)) {
                B5M b5m = r2.A00;
                if (b5m instanceof C21331AHj) {
                    return ((C21331AHj) b5m).A00;
                }
            }
        }
        return null;
    }

    public String A05() {
        List<C206909uC> list;
        String str = this.A0O;
        if (TextUtils.isEmpty(str) && (list = this.A0L) != null && list.size() > 0) {
            for (C206909uC r3 : list) {
                B5M b5m = r3.A00;
                if (b5m != null && r3.A01.equals("upi_merchant_configuration")) {
                    return ((C21334AHm) b5m).A01;
                }
                if ((b5m instanceof C21331AHj) && "cards".equals(r3.A01)) {
                    String str2 = ((C21331AHj) b5m).A01;
                    if (!TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                }
            }
        }
        return str;
    }

    public String A06(C18820ts r3) {
        String A072 = A07(r3, this.A0B);
        if (A072 != null) {
            return A072;
        }
        AnonymousClass16U r1 = this.A08;
        C18740tg.A06(r1);
        return r1.B7e(r3, BigDecimal.ZERO);
    }

    public String A07(C18820ts r6, C206979uM r7) {
        if (r7 == null || r7.A01 == 0) {
            return null;
        }
        C207119ua A032 = A03(r7);
        AnonymousClass16U r1 = this.A08;
        C18740tg.A06(r1);
        return r1.B7e(r6, A032.A02.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A0N);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0H);
        AnonymousClass16U r1 = this.A08;
        AnonymousClass16U[] r0 = AnonymousClass16T.A01;
        r1.writeToParcel(parcel, i);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeList(this.A0I);
        parcel.writeList(this.A0J);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeList(this.A0L);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A02, i);
        parcel.writeList(this.A0K);
        parcel.writeString(this.A03);
    }

    static {
        HashMap A0J2 = AnonymousClass001.A0J();
        A0P = A0J2;
        Integer A0i = C36401kF.A0i();
        A0J2.put(1, C36421kH.A0g(new Integer[]{2, 7, 8, 5, 6, 3, A0i, 4}));
        Integer[] numArr = new Integer[7];
        numArr[0] = 7;
        numArr[1] = 8;
        C90514aH.A1O(5, 6, numArr);
        numArr[4] = 3;
        numArr[5] = A0i;
        numArr[6] = 4;
        A0J2.put(2, C36421kH.A0g(numArr));
        Integer[] numArr2 = new Integer[7];
        numArr2[0] = 2;
        numArr2[1] = 8;
        C90514aH.A1O(5, 6, numArr2);
        numArr2[4] = 3;
        numArr2[5] = A0i;
        numArr2[6] = 4;
        A0J2.put(7, C36421kH.A0g(numArr2));
        Integer[] numArr3 = new Integer[7];
        numArr3[0] = 2;
        numArr3[1] = 7;
        C90514aH.A1O(8, 6, numArr3);
        numArr3[4] = A0i;
        numArr3[5] = 3;
        numArr3[6] = 4;
        A0J2.put(5, C36421kH.A0g(numArr3));
        Integer[] numArr4 = new Integer[7];
        numArr4[0] = 2;
        numArr4[1] = 7;
        C90514aH.A1O(8, 5, numArr4);
        numArr4[4] = 3;
        numArr4[5] = A0i;
        numArr4[6] = 4;
        A0J2.put(6, C36421kH.A0g(numArr4));
        A0J2.put(8, C36421kH.A0g(new Integer[]{7, 6, 5, A0i, 4}));
        A0J2.put(A0i, C36421kH.A0g(new Integer[]{7, 8, 6, 5, 4}));
    }

    public C207199ui(Parcel parcel) {
        this.A0N = parcel.createByteArray();
        this.A0G = C90514aH.A0u(parcel);
        Parcelable A0H2 = C36411kG.A0H(parcel, C206979uM.class);
        C18740tg.A06(A0H2);
        this.A0B = (C206979uM) A0H2;
        this.A0F = C90514aH.A0u(parcel);
        this.A0D = parcel.readString();
        this.A0H = parcel.readString();
        this.A08 = AnonymousClass16T.A00(parcel);
        this.A0O = parcel.readString();
        this.A0E = parcel.readString();
        Parcelable A0H3 = C36411kG.A0H(parcel, C207009uP.class);
        C18740tg.A06(A0H3);
        this.A09 = (C207009uP) A0H3;
        this.A06 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        boolean z = false;
        this.A0M = AnonymousClass000.A1S(parcel.readInt(), 1);
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A0I = A0I2;
        parcel.readList(A0I2, C206319t7.class.getClassLoader());
        ArrayList A0I3 = AnonymousClass001.A0I();
        this.A0J = A0I3;
        parcel.readList(A0I3, C206929uE.class.getClassLoader());
        this.A07 = parcel.readInt() == 1 ? true : z;
        ArrayList A0I4 = AnonymousClass001.A0I();
        this.A0L = A0I4;
        parcel.readList(A0I4, C206909uC.class.getClassLoader());
        Parcelable A0H4 = C36411kG.A0H(parcel, C206839u5.class);
        C18740tg.A06(A0H4);
        this.A0A = (C206839u5) A0H4;
        this.A0C = parcel.readString();
        this.A02 = (C207119ua) C36411kG.A0H(parcel, C207119ua.class);
        ArrayList A0I5 = AnonymousClass001.A0I();
        this.A0K = A0I5;
        parcel.readList(A0I5, String.class.getClassLoader());
        this.A03 = parcel.readString();
    }

    public C207199ui(AnonymousClass16U r3, C207119ua r4, C207009uP r5, C206839u5 r6, C206979uM r7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, List list3, List list4, byte[] bArr, int i, long j, boolean z, boolean z2) {
        this.A0N = bArr;
        this.A0G = str;
        this.A0B = r7;
        this.A0F = str2;
        this.A0D = str3;
        this.A0H = str4;
        this.A08 = r3;
        this.A0O = str5;
        this.A0E = str6;
        this.A09 = r5;
        this.A06 = str7;
        this.A00 = i;
        this.A05 = str8;
        this.A04 = str9;
        this.A01 = j;
        this.A0M = z;
        this.A0I = list;
        this.A0J = list2;
        this.A07 = z2;
        this.A0L = list3;
        this.A0A = r6;
        this.A0C = str10;
        this.A02 = r4;
        this.A0K = list4;
        this.A03 = str11;
    }
}

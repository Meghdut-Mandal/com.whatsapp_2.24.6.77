package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0LV  reason: invalid class name */
public class AnonymousClass0LV extends AnonymousClass0K1 {
    public static final Parcelable.Creator CREATOR = new C08310aX();
    public final C05110Nm A00;
    public final C04420Ko A01;
    public final C04440Kq A02;
    public final C04310Kd A03;
    public final C04350Kh A04;
    public final C04280Ka A05;
    public final Double A06;
    public final Integer A07;
    public final List A08;
    public final List A09;
    public final byte[] A0A;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0LV) {
            AnonymousClass0LV r5 = (AnonymousClass0LV) obj;
            if (AnonymousClass0QM.A00(this.A03, r5.A03) && AnonymousClass0QM.A00(this.A04, r5.A04) && Arrays.equals(this.A0A, r5.A0A) && AnonymousClass0QM.A00(this.A06, r5.A06)) {
                List list = this.A08;
                List list2 = r5.A08;
                if (list.containsAll(list2) && list2.containsAll(list)) {
                    List list3 = this.A09;
                    List list4 = r5.A09;
                    if (list3 != null ? !(list4 == null || !list3.containsAll(list4) || !list4.containsAll(list3)) : list4 == null) {
                        if (!AnonymousClass0QM.A00(this.A02, r5.A02) || !AnonymousClass0QM.A00(this.A07, r5.A07) || !AnonymousClass0QM.A00(this.A05, r5.A05) || !AnonymousClass0QM.A00(this.A00, r5.A00) || !AnonymousClass0QM.A00(this.A01, r5.A01)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = this.A03;
        objArr[1] = this.A04;
        objArr[2] = Integer.valueOf(Arrays.hashCode(this.A0A));
        objArr[3] = this.A08;
        objArr[4] = this.A06;
        objArr[5] = this.A09;
        objArr[6] = this.A02;
        objArr[7] = this.A07;
        objArr[8] = this.A05;
        objArr[9] = this.A00;
        return AnonymousClass000.A0M(this.A01, objArr, 10);
    }

    public AnonymousClass0LV(C04420Ko r3, C04440Kq r4, C04310Kd r5, C04350Kh r6, C04280Ka r7, Double d, Integer num, String str, List list, List list2, byte[] bArr) {
        AnonymousClass006.A01(r5);
        this.A03 = r5;
        AnonymousClass006.A01(r6);
        this.A04 = r6;
        AnonymousClass006.A01(bArr);
        this.A0A = bArr;
        AnonymousClass006.A01(list);
        this.A08 = list;
        this.A06 = d;
        this.A09 = list2;
        this.A02 = r4;
        this.A07 = num;
        this.A05 = r7;
        if (str != null) {
            try {
                this.A00 = C05110Nm.A00(str);
            } catch (C05200Nz e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A01 = r3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String obj;
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A03, 2, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A04, 3, i, false);
        AnonymousClass0Z9.A0F(parcel, this.A0A, 4, false);
        AnonymousClass0Z9.A0E(parcel, this.A08, 5, false);
        Double d = this.A06;
        if (d != null) {
            parcel.writeInt(524294);
            parcel.writeDouble(d.doubleValue());
        }
        AnonymousClass0Z9.A0E(parcel, this.A09, 7, false);
        AnonymousClass0Z9.A0B(parcel, this.A02, 8, i, false);
        Integer num = this.A07;
        if (num != null) {
            parcel.writeInt(262153);
            parcel.writeInt(num.intValue());
        }
        AnonymousClass0Z9.A0B(parcel, this.A05, 10, i, false);
        C05110Nm r0 = this.A00;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.toString();
        }
        AnonymousClass0Z9.A0C(parcel, obj, 11, false);
        AnonymousClass0Z9.A0B(parcel, this.A01, 12, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

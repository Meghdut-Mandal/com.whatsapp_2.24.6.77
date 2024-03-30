package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.9tP  reason: invalid class name and case insensitive filesystem */
public class C206439tP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205589rt();
    public int A00;
    public C132386Tk A01;
    public BigDecimal A02;
    public final int A03;
    public final C134736bW A04;
    public final C134966bu A05;
    public final String A06;
    public final String A07;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            C206439tP r4 = (C206439tP) obj;
            if (this.A00 != r4.A00 || this.A03 != r4.A03 || !AnonymousClass00C.A0J(this.A07, r4.A07) || !AnonymousClass00C.A0J(this.A06, r4.A06) || !C1901797e.A00(this.A02, r4.A02) || !C1901797e.A00(this.A01, r4.A01) || !C1901797e.A00(this.A05, r4.A05) || !C1901797e.A00(this.A04, r4.A04)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeSerializable(this.A02);
        C132386Tk r0 = this.A01;
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        C134736bW r1 = this.A04;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, i);
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A07;
        objArr[1] = this.A06;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        objArr[4] = this.A05;
        objArr[5] = Integer.valueOf(this.A00);
        C36381kD.A1T(objArr, this.A03);
        return AnonymousClass000.A0M(this.A04, objArr, 7);
    }

    public C206439tP(C134736bW r1, C134966bu r2, C132386Tk r3, String str, String str2, BigDecimal bigDecimal, int i, int i2) {
        C36321k7.A0x(str, str2);
        this.A07 = str;
        this.A06 = str2;
        this.A02 = bigDecimal;
        this.A01 = r3;
        this.A05 = r2;
        this.A00 = i;
        this.A03 = i2;
        this.A04 = r1;
    }
}

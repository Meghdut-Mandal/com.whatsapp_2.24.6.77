package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6c5  reason: invalid class name and case insensitive filesystem */
public final class C135076c5 implements Parcelable {
    public static final C135076c5 A02 = new C135076c5(C134976bv.A00(-90.0d, -180.0d), C134976bv.A00(90.0d, 180.0d));
    public static final Parcelable.Creator CREATOR = new C163937r0(6);
    public final C134976bv A00;
    public final C134976bv A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135076c5)) {
            return false;
        }
        C135076c5 r4 = (C135076c5) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public C134976bv A00() {
        double d;
        C134976bv r3 = this.A01;
        double d2 = r3.A00;
        C134976bv r2 = this.A00;
        double d3 = (d2 + r2.A00) / 2.0d;
        double d4 = r3.A01;
        double d5 = r2.A01;
        int i = (d4 > d5 ? 1 : (d4 == d5 ? 0 : -1));
        double d6 = d4 + d5;
        if (i <= 0) {
            d = d6 / 2.0d;
        } else {
            double d7 = 360.0d;
            double d8 = (d6 + 360.0d) / 2.0d;
            if (d8 <= 180.0d) {
                d7 = 0.0d;
            }
            d = d8 - d7;
        }
        return C134976bv.A00(d3, d);
    }

    public boolean A02(C134976bv r9) {
        double d = r9.A00;
        C134976bv r7 = this.A00;
        if (d > r7.A00) {
            return false;
        }
        C134976bv r3 = this.A01;
        if (d < r3.A00) {
            return false;
        }
        double d2 = r3.A01;
        double d3 = r7.A01;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        double d4 = r9.A01;
        int i2 = (d4 > d2 ? 1 : (d4 == d2 ? 0 : -1));
        if (i < 0) {
            if (i2 < 0) {
                return false;
            }
        } else if (i2 >= 0) {
            return true;
        }
        if (d4 <= d3) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (527 + this.A00.hashCode()) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public C135076c5(Parcel parcel) {
        Class<C134976bv> cls = C134976bv.class;
        this.A00 = (C134976bv) C36411kG.A0H(parcel, cls);
        this.A01 = (C134976bv) C36411kG.A0H(parcel, cls);
    }

    public C135076c5 A01(C134976bv r2) {
        if (A02(r2)) {
            return this;
        }
        AnonymousClass6OA r0 = new AnonymousClass6OA(this);
        r0.A01(r2);
        return r0.A00();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        A0u.append("{northeast=");
        A0u.append(this.A00);
        A0u.append(", southwest=");
        A0u.append(this.A01);
        return AnonymousClass000.A0q("}", A0u);
    }

    public C135076c5(C134976bv r7, C134976bv r8) {
        double d = r7.A00;
        double d2 = r8.A00;
        if (d <= d2) {
            this.A01 = r7;
            this.A00 = r8;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Southern latitude (");
        A0u.append(d);
        A0u.append(") exceeds Northern latitude (");
        A0u.append(d2);
        throw AnonymousClass000.A0c(").", A0u);
    }
}

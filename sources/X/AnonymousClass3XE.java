package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XE  reason: invalid class name */
public final class AnonymousClass3XE implements Parcelable {
    public static final AnonymousClass3XE A04 = new AnonymousClass3XE((Double) null, (Double) null, "", "");
    public static final Parcelable.Creator CREATOR = new C89864Ye(3);
    public String A00;
    public String A01;
    public final Double A02;
    public final Double A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C36381kD.A1Y(this, obj)) {
                AnonymousClass3XE r8 = (AnonymousClass3XE) obj;
                if (AnonymousClass00C.A0J(this.A00, r8.A00) && AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    Double d = this.A02;
                    Double d2 = r8.A02;
                    if (d == null ? d2 == null : d2 != null && d.doubleValue() == d2.doubleValue()) {
                        Double d3 = this.A03;
                        Double d4 = r8.A03;
                        if (d3 == null) {
                            return d4 == null;
                        }
                        if (d4 == null || d3.doubleValue() != d4.doubleValue()) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        Double d = this.A02;
        if (d == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.A03;
        if (d2 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeDouble(d2.doubleValue());
    }

    public int hashCode() {
        int i = 0;
        int A08 = (C36381kD.A08(this.A01, C36421kH.A04(this.A00)) + AnonymousClass000.A0J(this.A02)) * 31;
        Double d = this.A03;
        if (d != null) {
            i = d.hashCode();
        }
        return A08 + i;
    }

    public AnonymousClass3XE(Double d, Double d2, String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = d;
        this.A03 = d2;
        this.A00 = str;
        this.A01 = str2;
    }
}

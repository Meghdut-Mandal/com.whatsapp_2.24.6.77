package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tC  reason: invalid class name and case insensitive filesystem */
public final class C206339tC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205829sH();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public C206339tC(String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IndiaUpiExternalPaymentMethodData{type='");
        C200449hQ.A03(A0u, this.A01);
        A0u.append("', name='");
        C200449hQ.A03(A0u, this.A00);
        return AnonymousClass000.A0q("'}", A0u);
    }
}

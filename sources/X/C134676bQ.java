package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bQ  reason: invalid class name and case insensitive filesystem */
public final class C134676bQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(21);
    public final String A00;
    public final String A01;
    public final String A02;

    public C134676bQ(String str, String str2, String str3) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C36381kD.A1Y(this, obj)) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A00, ((C134676bQ) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0K(this.A00, AnonymousClass001.A0L());
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PriceTier:{'id'='");
        A0u.append(this.A00);
        A0u.append("', 'symbol'='");
        A0u.append(this.A02);
        A0u.append("', 'name'='");
        A0u.append(this.A01);
        return AnonymousClass000.A0q("'}", A0u);
    }
}

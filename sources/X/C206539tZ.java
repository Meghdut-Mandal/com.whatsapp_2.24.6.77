package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tZ  reason: invalid class name and case insensitive filesystem */
public final class C206539tZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205449rf();
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C36381kD.A1Y(this, obj)) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A01, ((C206539tZ) obj).A01);
    }

    public C206539tZ(String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public int hashCode() {
        return AnonymousClass000.A0K(this.A01, AnonymousClass001.A0L());
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("{'type'='");
        A0u.append(this.A01);
        A0u.append("', 'level'='");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("'}", A0u);
    }
}

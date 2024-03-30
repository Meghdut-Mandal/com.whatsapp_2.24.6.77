package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tn  reason: invalid class name and case insensitive filesystem */
public final class C206679tn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206129sl();
    public int A00;
    public int A01;
    public String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206679tn) {
                C206679tn r5 = (C206679tn) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public int hashCode() {
        return (((C36341k9.A09(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public C206679tn(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShopContent(id=");
        A0u.append(this.A02);
        A0u.append(", surface=");
        A0u.append(this.A00);
        A0u.append(", version=");
        return C36321k7.A0G(A0u, this.A01);
    }
}

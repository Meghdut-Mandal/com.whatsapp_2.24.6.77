package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bR  reason: invalid class name and case insensitive filesystem */
public final class C134686bR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134256ak();
    public final int A00;
    public final String A01;
    public final String A02;

    public C134686bR(String str, String str2, int i) {
        AnonymousClass00C.A0D(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134686bR) {
                C134686bR r5 = (C134686bR) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return C36381kD.A08(this.A02, C36341k9.A09(this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessCategoryChipData(categoryId=");
        C90494aF.A1N(A0u, this.A01);
        A0u.append(this.A02);
        A0u.append(", drawableRes=");
        return C36321k7.A0G(A0u, this.A00);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9uT  reason: invalid class name and case insensitive filesystem */
public final class C207049uT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205909sP();
    public final String A00;
    public final String A01;
    public final boolean A02;

    public C207049uT(String str, String str2, boolean z) {
        AnonymousClass00C.A0D(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C207049uT) {
                C207049uT r5 = (C207049uT) obj;
                if (this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36381kD.A08(this.A00, C36341k9.A01(this.A02 ? 1 : 0) * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentMethodDetailsInternationalViewState(isShimmering=");
        A0u.append(this.A02);
        A0u.append(", descriptionText=");
        A0u.append(this.A00);
        A0u.append(", showDialog=");
        return C36321k7.A0E(this.A01, A0u);
    }

    public C207049uT() {
        this("", "", false);
    }
}

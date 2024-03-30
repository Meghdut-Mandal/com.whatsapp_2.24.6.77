package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bM  reason: invalid class name and case insensitive filesystem */
public final class C134636bM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134306ap();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134636bM) {
                C134636bM r5 = (C134636bM) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
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
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36421kH.A04(this.A00));
    }

    public C134636bM(String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrivacyDisclosureButton(action=");
        A0u.append(this.A00);
        A0u.append(", label=");
        return C36321k7.A0E(this.A01, A0u);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XH  reason: invalid class name */
public final class AnonymousClass3XH implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66583Wn();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XH) {
                AnonymousClass3XH r5 = (AnonymousClass3XH) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
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
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return (C36341k9.A09(this.A01) * 31) + C36421kH.A05(this.A00);
    }

    public AnonymousClass3XH(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SupportUserContext(entrypoint=");
        A0u.append(this.A01);
        A0u.append(", articles=");
        return C36321k7.A0E(this.A00, A0u);
    }
}

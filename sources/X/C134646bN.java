package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bN  reason: invalid class name and case insensitive filesystem */
public final class C134646bN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134376aw();
    public final String A00;
    public final String A01;

    public C134646bN(String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134646bN) {
                C134646bN r5 = (C134646bN) obj;
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
        return C36421kH.A04(this.A01) + C36341k9.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarProfilePhotoPose(url=");
        A0u.append(this.A01);
        A0u.append(", emojis=");
        return C36321k7.A0E(this.A00, A0u);
    }
}

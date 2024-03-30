package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4zY  reason: invalid class name and case insensitive filesystem */
public final class C102244zY extends C134456b4 {
    public static final Parcelable.Creator CREATOR = new C133996aK();
    public final C206759tv A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C102244zY) {
                C102244zY r5 = (C102244zY) obj;
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
        this.A00.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public C102244zY(C206759tv r1, String str) {
        C36321k7.A0x(str, r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ThumbnailOption(value=");
        A0u.append(this.A01);
        A0u.append(", thumbnail=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}

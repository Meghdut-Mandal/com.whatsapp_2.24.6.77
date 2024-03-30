package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XQ  reason: invalid class name */
public final class AnonymousClass3XQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66593Wo();
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XQ) {
                AnonymousClass3XQ r8 = (AnonymousClass3XQ) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A02, r8.A02) || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A01);
    }

    public int hashCode() {
        return C36341k9.A02(this.A01, C36381kD.A08(this.A02, (C36421kH.A04(this.A03) + this.A00) * 31));
    }

    public AnonymousClass3XQ(long j, String str, int i, String str2) {
        C36321k7.A0y(str, str2);
        this.A03 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TempFMessageMediaInfo(text=");
        A0u.append(this.A03);
        A0u.append(", mediaType=");
        A0u.append(this.A00);
        A0u.append(", mediaUri=");
        A0u.append(this.A02);
        A0u.append(", timestamp=");
        return C36331k8.A0j(A0u, this.A01);
    }
}

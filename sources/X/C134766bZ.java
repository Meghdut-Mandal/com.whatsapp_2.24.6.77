package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bZ  reason: invalid class name and case insensitive filesystem */
public final class C134766bZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134116aW();
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134766bZ) {
                C134766bZ r5 = (C134766bZ) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00 || this.A03 != r5.A03) {
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
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
    }

    public int hashCode() {
        return ((C36381kD.A08(this.A01, C36421kH.A04(this.A02)) + this.A00) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public C134766bZ(String str, String str2, int i, boolean z) {
        C36321k7.A0x(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ConnectedAccount:{'id'='");
        A0u.append(this.A02);
        A0u.append("', 'name'='");
        A0u.append(this.A01);
        A0u.append("', 'likes'='");
        A0u.append(this.A00);
        A0u.append("', 'hasMediaPost'='");
        A0u.append(this.A03);
        return AnonymousClass000.A0q("'}", A0u);
    }
}

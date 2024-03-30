package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.9tw  reason: invalid class name and case insensitive filesystem */
public final class C206769tw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205539ro();
    public int A00;
    public String A01;
    public String A02;
    public final boolean A03;
    public final List A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206769tw) {
                C206769tw r5 = (C206769tw) obj;
                if (this.A00 != r5.A00 || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeStringList(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return ((((C53202qw.A00(this.A00 * 31, this.A03) + AnonymousClass000.A0H(this.A04)) * 31) + C36341k9.A09(this.A02)) * 31) + C36421kH.A05(this.A01);
    }

    public C206769tw(String str, String str2, List list, int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A04 = list;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductStatus(status=");
        A0u.append(this.A00);
        A0u.append(", appealable=");
        A0u.append(this.A03);
        A0u.append(", reasonCodes=");
        A0u.append(this.A04);
        A0u.append(", rejectReason=");
        A0u.append(this.A02);
        A0u.append(", commerceUrl=");
        return C36321k7.A0E(this.A01, A0u);
    }
}

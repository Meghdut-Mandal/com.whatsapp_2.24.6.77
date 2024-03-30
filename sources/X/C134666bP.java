package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.6bP  reason: invalid class name and case insensitive filesystem */
public final class C134666bP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133946aF();
    public final String A00;
    public final BigDecimal A01;
    public final boolean A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134666bP) {
                C134666bP r5 = (C134666bP) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
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
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeSerializable(this.A01);
    }

    public int hashCode() {
        return C53202qw.A00(C36341k9.A09(this.A00) * 31, this.A02) + C36411kG.A09(this.A01);
    }

    public C134666bP(String str, BigDecimal bigDecimal, boolean z) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = bigDecimal;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductVariantListingDetails(description=");
        A0u.append(this.A00);
        A0u.append(", multiPrice=");
        A0u.append(this.A02);
        A0u.append(", lowestPrice=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bd  reason: invalid class name and case insensitive filesystem */
public final class C134806bd implements Parcelable {
    public static final C134106aV CREATOR = new C134106aV();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134806bd) {
                C134806bd r5 = (C134806bd) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A04 != r5.A04 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
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
        parcel.writeString(this.A03);
        if (this.A04) {
            parcel.writeByte((byte) 1);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        int A08 = C36381kD.A08(this.A00, C36421kH.A04(this.A01));
        return C90504aG.A0B(this.A02, (C36381kD.A08(this.A03, A08) + C36341k9.A01(this.A04 ? 1 : 0)) * 31);
    }

    public C134806bd(String str, String str2, String str3, String str4, boolean z) {
        C36321k7.A11(str, str2, str3);
        AnonymousClass00C.A0D(str4, 5);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A04 = z;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessServiceOffering(categoryName=");
        A0u.append(this.A01);
        A0u.append(", categoryId=");
        A0u.append(this.A00);
        A0u.append(", offeringId=");
        A0u.append(this.A03);
        A0u.append(", isOffered=");
        A0u.append(this.A04);
        A0u.append(", offerName=");
        return C36321k7.A0E(this.A02, A0u);
    }
}

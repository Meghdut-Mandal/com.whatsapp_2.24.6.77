package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tr  reason: invalid class name and case insensitive filesystem */
public final class C206719tr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205869sL();
    public final C135086c7 A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206719tr) {
                C206719tr r5 = (C206719tr) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, C36381kD.A08(this.A01, C36381kD.A08(this.A03, C36391kE.A0A(this.A00))));
    }

    public C206719tr(C135086c7 r1, String str, String str2, String str3) {
        C36321k7.A18(r1, str, str2, str3);
        this.A00 = r1;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentAliasData(alias=");
        A0u.append(this.A00);
        A0u.append(", aliasType=");
        A0u.append(this.A03);
        A0u.append(", aliasId=");
        A0u.append(this.A01);
        A0u.append(", aliasStatus=");
        return C36321k7.A0E(this.A02, A0u);
    }
}

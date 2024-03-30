package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9tj  reason: invalid class name and case insensitive filesystem */
public final class C206639tj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205959sU();
    public final String A00;
    public final List A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206639tj) {
                C206639tj r5 = (C206639tj) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
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
        parcel.writeString(this.A00);
        Iterator A0o = C90474aD.A0o(parcel, this.A01);
        while (A0o.hasNext()) {
            ((C206629ti) A0o.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36381kD.A08(this.A00, C36421kH.A04(this.A02)));
    }

    public C206639tj(String str, String str2, List list) {
        C36321k7.A0x(str, str2);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InstallmentOptions(paymentMethod=");
        A0u.append(this.A02);
        A0u.append(", cardNetwork=");
        A0u.append(this.A00);
        A0u.append(", installments=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}

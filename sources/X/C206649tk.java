package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9tk  reason: invalid class name and case insensitive filesystem */
public final class C206649tk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205979sW();
    public final C206479tT A00;
    public final C188008yt A01;
    public final List A02;

    public C206649tk(C206479tT r2, C188008yt r3, List list) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A02 = list;
        this.A00 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206649tk) {
                C206649tk r5 = (C206649tk) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        C36391kE.A1E(parcel, this.A01);
        List list = this.A02;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0o = C90474aD.A0o(parcel, list);
            while (A0o.hasNext()) {
                ((C206639tj) A0o.next()).writeToParcel(parcel, i);
            }
        }
        C206479tT r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r0.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MerchantPaymentConfig(merchantStatus=");
        A0u.append(this.A01);
        A0u.append(", installmentOptions=");
        A0u.append(this.A02);
        A0u.append(", merchantAccountSettings=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9te  reason: invalid class name and case insensitive filesystem */
public final class C206589te implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205519rm();
    public final C206779tx A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206589te) {
                C206589te r5 = (C206589te) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
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
        parcel.writeString(this.A02);
        C206779tx r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return (((C36341k9.A09(this.A01) * 31) + C36341k9.A09(this.A02)) * 31) + C36411kG.A09(this.A00);
    }

    public C206589te(C206779tx r1, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductComplianceInfo(countryCodeOrigin=");
        A0u.append(this.A01);
        A0u.append(", importerName=");
        A0u.append(this.A02);
        A0u.append(", importerAddress=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}

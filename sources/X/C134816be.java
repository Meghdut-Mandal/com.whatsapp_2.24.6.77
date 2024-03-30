package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6be  reason: invalid class name and case insensitive filesystem */
public final class C134816be implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134316aq();
    public final AnonymousClass5TI A00;
    public final AnonymousClass5TJ A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134816be) {
                C134816be r5 = (C134816be) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A00 != r5.A00 || this.A01 != r5.A01) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        AnonymousClass5TI r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r0.name());
        }
        AnonymousClass5TJ r02 = this.A01;
        if (r02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(r02.name());
    }

    public int hashCode() {
        return ((C36381kD.A08(this.A04, (C36421kH.A04(this.A03) + C36341k9.A09(this.A02)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01);
    }

    public C134816be(AnonymousClass5TI r1, AnonymousClass5TJ r2, String str, String str2, String str3) {
        C36321k7.A0y(str, str3);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrivacyDisclosureIcon(lightUrl=");
        A0u.append(this.A03);
        A0u.append(", darkUrl=");
        A0u.append(this.A02);
        A0u.append(", type=");
        A0u.append(this.A04);
        A0u.append(", role=");
        A0u.append(this.A00);
        A0u.append(", style=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}

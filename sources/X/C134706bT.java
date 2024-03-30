package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6bT  reason: invalid class name and case insensitive filesystem */
public final class C134706bT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134296ao();
    public final C134816be A00;
    public final String A01;
    public final String A02;

    public C134706bT(C134816be r2, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134706bT) {
                C134706bT r5 = (C134706bT) obj;
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
        C134816be r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r1.writeToParcel(parcel, i);
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A01) + C36341k9.A09(this.A02)) * 31) + C36411kG.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrivacyDisclosureBullet(text=");
        A0u.append(this.A01);
        A0u.append(", textSecondary=");
        A0u.append(this.A02);
        A0u.append(", icon=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}

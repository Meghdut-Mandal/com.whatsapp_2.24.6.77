package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XV  reason: invalid class name */
public final class AnonymousClass3XV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66643Wt();
    public final long A00;
    public final C206759tv A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass3XV(C206759tv r2, String str, String str2, String str3, long j) {
        C36331k8.A1G(str, 1, r2);
        this.A04 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = r2;
        this.A03 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XV) {
                AnonymousClass3XV r8 = (AnonymousClass3XV) obj;
                if (!AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A02, r8.A02) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36321k7.A00(this.A00, (C36421kH.A04(this.A04) + C36341k9.A09(this.A02)) * 31)) + C36421kH.A05(this.A03);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkedAccountPost(id=");
        A0u.append(this.A04);
        A0u.append(", caption=");
        A0u.append(this.A02);
        A0u.append(", creationTime=");
        A0u.append(this.A00);
        A0u.append(", image=");
        A0u.append(this.A01);
        A0u.append(", postUrl=");
        return C36321k7.A0E(this.A03, A0u);
    }
}

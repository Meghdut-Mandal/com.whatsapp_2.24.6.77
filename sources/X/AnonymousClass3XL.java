package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XL  reason: invalid class name */
public final class AnonymousClass3XL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66503Wf();
    public final String A00;
    public final String A01;
    public final boolean A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XL) {
                AnonymousClass3XL r5 = (AnonymousClass3XL) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
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
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return C53202qw.A00(C36421kH.A04(this.A01), this.A02) + this.A00.hashCode();
    }

    public AnonymousClass3XL(String str, String str2, boolean z) {
        C36321k7.A0y(str, str2);
        this.A01 = str;
        this.A02 = z;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShareSheetData(text=");
        A0u.append(this.A01);
        A0u.append(", isVideo=");
        A0u.append(this.A02);
        A0u.append(", emailSubject=");
        return C36321k7.A0E(this.A00, A0u);
    }
}

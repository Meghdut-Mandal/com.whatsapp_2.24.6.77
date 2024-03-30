package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XG  reason: invalid class name */
public final class AnonymousClass3XG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66493We();
    public final String A00;
    public final String A01;

    public AnonymousClass3XG(String str, String str2) {
        AnonymousClass00C.A0D(str2, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XG) {
                AnonymousClass3XG r5 = (AnonymousClass3XG) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
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
    }

    public int hashCode() {
        return (C36341k9.A09(this.A01) * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PhoneNumberSelectionInfo{phoneNumberLabel='");
        A0u.append(this.A01);
        A0u.append("', phoneNumber='");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("'}", A0u);
    }
}

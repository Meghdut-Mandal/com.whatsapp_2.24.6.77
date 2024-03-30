package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XI  reason: invalid class name */
public final class AnonymousClass3XI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass3X6();
    public final int A00;
    public final boolean A01;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XI) {
                AnonymousClass3XI r5 = (AnonymousClass3XI) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public int hashCode() {
        return (C36341k9.A01(this.A01 ? 1 : 0) * 31) + this.A00;
    }

    public AnonymousClass3XI(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StatusArchiveSettingsViewState(isEnabled=");
        A0u.append(this.A01);
        A0u.append(", archiveDurationInDays=");
        return C36321k7.A0G(A0u, this.A00);
    }
}

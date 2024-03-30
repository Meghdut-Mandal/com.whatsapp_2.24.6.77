package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XX  reason: invalid class name */
public final class AnonymousClass3XX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66473Wc();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XX) {
                AnonymousClass3XX r5 = (AnonymousClass3XX) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A04) * 31) + this.A03) * 31) + this.A05;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A05);
    }

    public AnonymousClass3XX(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkTypeActionViewState(actionIcon=");
        A0u.append(this.A00);
        A0u.append(", actionTitle=");
        A0u.append(this.A01);
        A0u.append(", currentSelection=");
        A0u.append(this.A02);
        A0u.append(", dialogTitle=");
        A0u.append(this.A04);
        A0u.append(", currentSelectionIndex=");
        A0u.append(this.A03);
        A0u.append(", options=");
        return C36321k7.A0G(A0u, this.A05);
    }
}

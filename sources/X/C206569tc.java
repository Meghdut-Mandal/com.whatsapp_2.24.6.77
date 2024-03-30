package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9tc  reason: invalid class name and case insensitive filesystem */
public final class C206569tc implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206069sf();
    public boolean A00;
    public final C206969uL A01;

    public C206569tc(C206969uL r2, boolean z) {
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = z;
        this.A01 = r2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C206569tc) {
                C206569tc r5 = (C206569tc) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36341k9.A01(this.A00 ? 1 : 0) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NativeFlowButton(isSelected=");
        A0u.append(this.A00);
        A0u.append(", info=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}

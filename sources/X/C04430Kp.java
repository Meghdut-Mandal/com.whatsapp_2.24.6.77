package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kp  reason: invalid class name and case insensitive filesystem */
public class C04430Kp extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08050a7();
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C04430Kp) {
                C04430Kp r5 = (C04430Kp) obj;
                if (r5.A00 != this.A00 || !AnonymousClass0QM.A00(r5.A01, this.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        String str = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(i);
        return AnonymousClass000.A0p(":", str, A0u);
    }

    public C04430Kp(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        C10440eF.A04(parcel, this.A01, A002);
    }
}

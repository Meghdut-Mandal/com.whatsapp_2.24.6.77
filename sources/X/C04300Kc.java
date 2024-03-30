package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kc  reason: invalid class name and case insensitive filesystem */
public class C04300Kc extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07920Zu();
    public final int A00;
    public final AnonymousClass0KW A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj instanceof C04300Kc) {
            C04300Kc r4 = (C04300Kc) obj;
            if (!AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A02, r4.A02) || this.A00 != r4.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C04300Kc(AnonymousClass0KW r1, String str, int i) {
        AnonymousClass006.A01(r1);
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        return AnonymousClass000.A0L(this.A02, A0M);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A01, 1, i, false);
        AnonymousClass0Z9.A0C(parcel, this.A02, 2, false);
        AnonymousClass0Z9.A08(parcel, 3, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KW  reason: invalid class name */
public class AnonymousClass0KW extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07950Zx();
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0KW) {
            AnonymousClass0KW r4 = (AnonymousClass0KW) obj;
            if (!AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A01, r4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0KW(String str, String str2) {
        AnonymousClass006.A02(str, "Account identifier cannot be null");
        String trim = str.trim();
        AnonymousClass006.A05(trim, "Account identifier cannot be empty");
        this.A00 = trim;
        AnonymousClass006.A03(str2);
        this.A01 = str2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A00;
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A00, 1, false);
        AnonymousClass0Z9.A0C(parcel, this.A01, 2, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

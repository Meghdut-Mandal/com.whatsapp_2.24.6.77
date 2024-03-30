package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kd  reason: invalid class name and case insensitive filesystem */
public class C04310Kd extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08350ab();
    public final String A00;
    public final String A01;
    public final String A02;

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A00;
        objArr[1] = this.A01;
        return AnonymousClass000.A0M(this.A02, objArr, 2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04310Kd) {
            C04310Kd r4 = (C04310Kd) obj;
            if (!AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A02, r4.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C04310Kd(String str, String str2, String str3) {
        AnonymousClass006.A01(str);
        this.A00 = str;
        AnonymousClass006.A01(str2);
        this.A01 = str2;
        this.A02 = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        boolean A06 = C10440eF.A06(parcel, this.A00);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, A06);
        AnonymousClass0Z9.A0C(parcel, this.A02, 4, A06);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

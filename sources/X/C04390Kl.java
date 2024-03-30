package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Kl  reason: invalid class name and case insensitive filesystem */
public final class C04390Kl extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07880Zq();
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public int hashCode() {
        Object[] objArr = new Object[7];
        C10440eF.A05(objArr, this.A04);
        objArr[1] = this.A00;
        objArr[2] = this.A01;
        objArr[3] = Boolean.valueOf(this.A05);
        objArr[4] = this.A02;
        objArr[5] = this.A03;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A06), objArr, 6);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04390Kl) {
            C04390Kl r4 = (C04390Kl) obj;
            if (this.A04 != r4.A04 || !AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A01, r4.A01) || this.A05 != r4.A05 || !AnonymousClass0QM.A00(this.A02, r4.A02) || !AnonymousClass0QM.A00(this.A03, r4.A03) || this.A06 != r4.A06) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C04390Kl(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        AnonymousClass006.A07(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
        this.A04 = z;
        if (z) {
            AnonymousClass006.A02(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.A00 = str;
        this.A01 = str2;
        this.A05 = z2;
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            arrayList = new ArrayList(list);
            Collections.sort(arrayList);
        }
        this.A03 = arrayList;
        this.A02 = str3;
        this.A06 = z3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0A(parcel, 1, this.A04);
        boolean A062 = C10440eF.A06(parcel, this.A00);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, A062);
        AnonymousClass0Z9.A0A(parcel, 4, this.A05);
        AnonymousClass0Z9.A0C(parcel, this.A02, 5, A062);
        AnonymousClass0Z9.A0D(parcel, this.A03, 6);
        AnonymousClass0Z9.A0A(parcel, 7, this.A06);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8CL  reason: invalid class name */
public final class AnonymousClass8CL extends C10440eF {
    public static final List A0B = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new C204559qC();
    public long A00;
    public boolean A01;
    public String A02;
    public final LocationRequest A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass8CL) {
            AnonymousClass8CL r4 = (AnonymousClass8CL) obj;
            if (!AnonymousClass0QM.A00(this.A03, r4.A03) || !AnonymousClass0QM.A00(this.A06, r4.A06) || !AnonymousClass0QM.A00(this.A04, r4.A04) || this.A07 != r4.A07 || this.A08 != r4.A08 || this.A09 != r4.A09 || !AnonymousClass0QM.A00(this.A05, r4.A05) || this.A0A != r4.A0A || this.A01 != r4.A01 || !AnonymousClass0QM.A00(this.A02, r4.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public AnonymousClass8CL(LocationRequest locationRequest, String str, String str2, String str3, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = locationRequest;
        this.A06 = list;
        this.A04 = str;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A05 = str2;
        this.A0A = z4;
        this.A01 = z5;
        this.A02 = str3;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A03);
        String str = this.A04;
        if (str != null) {
            A0u.append(" tag=");
            A0u.append(str);
        }
        String str2 = this.A05;
        if (str2 != null) {
            A0u.append(" moduleId=");
            A0u.append(str2);
        }
        String str3 = this.A02;
        if (str3 != null) {
            A0u.append(" contextAttributionTag=");
            A0u.append(str3);
        }
        A0u.append(" hideAppOps=");
        A0u.append(this.A07);
        A0u.append(" clients=");
        A0u.append(this.A06);
        A0u.append(" forceCoarseLocation=");
        A0u.append(this.A08);
        if (this.A09) {
            A0u.append(" exemptFromBackgroundThrottle");
        }
        if (this.A0A) {
            A0u.append(" locationSettingsIgnored");
        }
        if (this.A01) {
            A0u.append(" inaccurateLocationsDelayed");
        }
        return A0u.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A03, 1, i, false);
        AnonymousClass0Z9.A0E(parcel, this.A06, 5, false);
        AnonymousClass0Z9.A0C(parcel, this.A04, 6, false);
        AnonymousClass0Z9.A0A(parcel, 7, this.A07);
        AnonymousClass0Z9.A0A(parcel, 8, this.A08);
        AnonymousClass0Z9.A0A(parcel, 9, this.A09);
        AnonymousClass0Z9.A0C(parcel, this.A05, 10, false);
        AnonymousClass0Z9.A0A(parcel, 11, this.A0A);
        AnonymousClass0Z9.A0A(parcel, 12, this.A01);
        AnonymousClass0Z9.A0C(parcel, this.A02, 13, false);
        AnonymousClass0Z9.A09(parcel, 14, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

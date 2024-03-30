package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: X.0eF  reason: invalid class name and case insensitive filesystem */
public abstract class C10440eF implements SafeParcelable {
    public static void A03(Parcel parcel, int i, boolean z) {
        AnonymousClass0Z9.A0A(parcel, 1, z);
        AnonymousClass0Z9.A07(parcel, i);
    }

    public static void A04(Parcel parcel, String str, int i) {
        AnonymousClass0Z9.A0C(parcel, str, 2, false);
        AnonymousClass0Z9.A07(parcel, i);
    }

    public static boolean A06(Parcel parcel, String str) {
        AnonymousClass0Z9.A0C(parcel, str, 2, false);
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public static void A05(Object[] objArr, boolean z) {
        objArr[0] = Boolean.valueOf(z);
    }
}

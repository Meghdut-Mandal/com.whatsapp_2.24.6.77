package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: X.4s0  reason: invalid class name and case insensitive filesystem */
public final class C98774s0 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205429rd();
    public Bundle A00;
    public Map A01;

    public C98774s0(Bundle bundle) {
        this.A00 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A03(this.A00, parcel, 2);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
/* renamed from: X.8Bs  reason: invalid class name and case insensitive filesystem */
public final class C170038Bs extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205219rI();
    public final int A00;
    public final ConnectionConfiguration A01;

    public C170038Bs(ConnectionConfiguration connectionConfiguration, int i) {
        this.A00 = i;
        this.A01 = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        C165577te.A0y(parcel, this.A01, i, A002);
    }
}

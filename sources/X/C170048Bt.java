package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.8Bt  reason: invalid class name and case insensitive filesystem */
public final class C170048Bt extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205229rJ();
    public final int A00;
    public final ConnectionConfiguration[] A01;

    public C170048Bt(ConnectionConfiguration[] connectionConfigurationArr, int i) {
        this.A00 = i;
        this.A01 = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A0G(parcel, this.A01, 3, i);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

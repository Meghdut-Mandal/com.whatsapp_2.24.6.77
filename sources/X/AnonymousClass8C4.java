package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* renamed from: X.8C4  reason: invalid class name */
public final class AnonymousClass8C4 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204819qc();
    public final int A00;
    public final int A01;
    @Deprecated
    public final ClientAppContext A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, i2);
        AnonymousClass0Z9.A0B(parcel, this.A02, 2, i, false);
        AnonymousClass0Z9.A08(parcel, 3, this.A01);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8C4(ClientAppContext clientAppContext, int i, int i2) {
        this.A00 = i;
        this.A02 = clientAppContext;
        this.A01 = i2;
    }
}

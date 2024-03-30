package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0K8  reason: invalid class name */
public class AnonymousClass0K8 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07960Zy();
    public int A00;
    public Bundle A01;
    public final int A02;

    public AnonymousClass0K8(Bundle bundle, int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A02);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A03(this.A01, parcel, 3);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

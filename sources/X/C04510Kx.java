package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kx  reason: invalid class name and case insensitive filesystem */
public final class C04510Kx extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08110aD();
    public int A00;
    public Bundle A01;
    public AnonymousClass0KD A02;
    public C04520Ky[] A03;

    public C04510Kx(Bundle bundle, AnonymousClass0KD r2, C04520Ky[] r3, int i) {
        this.A01 = bundle;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A03(this.A01, parcel, 1);
        AnonymousClass0Z9.A0G(parcel, this.A03, 2, i);
        AnonymousClass0Z9.A08(parcel, 3, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A02, 4, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04510Kx() {
    }
}

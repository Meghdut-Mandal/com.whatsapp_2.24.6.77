package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: X.8Bn  reason: invalid class name and case insensitive filesystem */
public final class C169988Bn extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205159rC();
    public final int A00;
    public final ParcelFileDescriptor A01;

    public C169988Bn(ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.A00 = i;
        this.A01 = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        C165577te.A0y(parcel, this.A01, i, A002);
    }
}

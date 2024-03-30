package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: X.8Bx  reason: invalid class name and case insensitive filesystem */
public final class C170088Bx extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205269rN();
    public final int A00;
    public final ParcelFileDescriptor A01;

    public C170088Bx(ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.A00 = i;
        this.A01 = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        C165577te.A0y(parcel, this.A01, i | 1, A002);
    }
}

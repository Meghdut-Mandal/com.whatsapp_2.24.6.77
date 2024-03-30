package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8C8  reason: invalid class name */
public final class AnonymousClass8C8 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205369rX();
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass8C8(byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A08(parcel, 2, this.A01);
        AnonymousClass0Z9.A0F(parcel, this.A02, 3, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

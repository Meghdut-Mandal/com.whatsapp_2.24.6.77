package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CB  reason: invalid class name */
public final class AnonymousClass8CB extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205059r0();
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public AnonymousClass8CB(float f, float f2, int i, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A03);
        AnonymousClass0Z9.A06(parcel, this.A00, 2);
        AnonymousClass0Z9.A06(parcel, this.A01, 3);
        AnonymousClass0Z9.A08(parcel, 4, this.A02);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KC  reason: invalid class name */
public class AnonymousClass0KC extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08100aC();
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass0KC(int i, int i2, int i3, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A0A(parcel, 2, this.A03);
        AnonymousClass0Z9.A0A(parcel, 3, this.A04);
        AnonymousClass0Z9.A08(parcel, 4, this.A01);
        AnonymousClass0Z9.A08(parcel, 5, this.A02);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

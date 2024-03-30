package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CA  reason: invalid class name */
public final class AnonymousClass8CA extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204859qg();
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final AnonymousClass8C5[] A03;

    public AnonymousClass8CA(AnonymousClass8C5[] r2, int i, long j, boolean z) {
        this.A01 = j;
        this.A03 = r2;
        this.A02 = z;
        if (z) {
            this.A00 = i;
        } else {
            this.A00 = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A09(parcel, 2, this.A01);
        AnonymousClass0Z9.A0G(parcel, this.A03, 3, i);
        AnonymousClass0Z9.A08(parcel, 4, this.A00);
        AnonymousClass0Z9.A0A(parcel, 5, this.A02);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

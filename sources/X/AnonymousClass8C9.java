package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.8C9  reason: invalid class name */
public final class AnonymousClass8C9 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205389rZ();
    public final int A00;
    public final long A01;
    public final List A02;

    public AnonymousClass8C9(List list, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A09(parcel, 3, this.A01);
        AnonymousClass0Z9.A0E(parcel, this.A02, 4, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

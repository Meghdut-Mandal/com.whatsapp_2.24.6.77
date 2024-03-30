package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0K9  reason: invalid class name */
public final class AnonymousClass0K9 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08680b8();
    public final int A00;
    public final AnonymousClass0L0 A01;
    public final C04370Kj A02;

    public AnonymousClass0K9(AnonymousClass0L0 r1, C04370Kj r2, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A01, 2, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A02, 3, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

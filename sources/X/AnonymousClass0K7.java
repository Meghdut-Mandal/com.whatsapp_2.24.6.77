package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0K7  reason: invalid class name */
public final class AnonymousClass0K7 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08670b7();
    public final int A00;
    public final AnonymousClass0KB A01;

    public AnonymousClass0K7(AnonymousClass0KB r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A01, 2, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

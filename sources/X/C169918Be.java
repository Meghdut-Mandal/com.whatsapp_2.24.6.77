package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Be  reason: invalid class name and case insensitive filesystem */
public final class C169918Be extends C10440eF {
    public static final Parcelable.Creator CREATOR = new AnonymousClass9r6();
    public final int A00;

    public C169918Be(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Bg  reason: invalid class name and case insensitive filesystem */
public final class C169938Bg extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205359rW();
    public final int A00;

    public C169938Bg(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

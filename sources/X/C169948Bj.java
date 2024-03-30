package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Bj  reason: invalid class name and case insensitive filesystem */
public final class C169948Bj extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205029qx();
    public final int A00;
    public final PointF[] A01;

    public C169948Bj(PointF[] pointFArr, int i) {
        this.A01 = pointFArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0G(parcel, this.A01, 2, i);
        AnonymousClass0Z9.A08(parcel, 3, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

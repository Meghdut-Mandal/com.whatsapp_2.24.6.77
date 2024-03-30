package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qx  reason: invalid class name and case insensitive filesystem */
public final class C205029qx implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                pointFArr = (PointF[]) AnonymousClass0ZA.A0K(parcel, PointF.CREATOR, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C169948Bj(pointFArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C169948Bj[i];
    }
}

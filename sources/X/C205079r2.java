package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9r2  reason: invalid class name and case insensitive filesystem */
public final class C205079r2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        C170198Ci r1 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                r1 = (C170198Ci) AnonymousClass0ZA.A06(parcel, C170198Ci.CREATOR, readInt);
            } else if (c == 3) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 4) {
                AnonymousClass0ZA.A0F(parcel, readInt, 4);
                i2 = parcel.readInt();
            } else if (c != 5) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                i3 = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C98804s3(r1, i, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C98804s3[i];
    }
}

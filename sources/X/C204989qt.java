package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qt  reason: invalid class name and case insensitive filesystem */
public final class C204989qt implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                str2 = AnonymousClass0ZA.A09(parcel, str2, c, 3, readInt);
            } else {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CQ(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CQ[i];
    }
}

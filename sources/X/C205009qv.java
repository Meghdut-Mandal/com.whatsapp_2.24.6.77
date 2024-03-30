package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qv  reason: invalid class name and case insensitive filesystem */
public final class C205009qv implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c != 3) {
                i = C165607th.A04(parcel, c, readInt, i);
            } else {
                str2 = AnonymousClass0ZA.A08(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CS(str, str2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CS[i];
    }
}

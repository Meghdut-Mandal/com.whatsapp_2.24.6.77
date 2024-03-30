package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rH  reason: invalid class name and case insensitive filesystem */
public final class C205209rH implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 3, readInt);
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170028Br(i, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170028Br[i];
    }
}

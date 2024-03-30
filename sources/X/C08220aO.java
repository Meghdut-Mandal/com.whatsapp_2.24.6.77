package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aO  reason: invalid class name and case insensitive filesystem */
public final class C08220aO implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c == 2) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04520Ky(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04520Ky[i];
    }
}

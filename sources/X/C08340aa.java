package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aa  reason: invalid class name and case insensitive filesystem */
public final class C08340aa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                int A02 = AnonymousClass0ZA.A02(parcel, readInt);
                if (A02 == 0) {
                    num = null;
                } else {
                    AnonymousClass0ZA.A0E(parcel, A02, 4);
                    num = Integer.valueOf(parcel.readInt());
                }
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KX(str, num.intValue());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KX[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aH  reason: invalid class name and case insensitive filesystem */
public final class C08150aH implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                i2 = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04480Ku(i, str, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04480Ku[i];
    }
}

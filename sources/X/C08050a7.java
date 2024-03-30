package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0a7  reason: invalid class name and case insensitive filesystem */
public final class C08050a7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 2, readInt);
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04430Kp(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04430Kp[i];
    }
}

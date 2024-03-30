package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9ra  reason: invalid class name and case insensitive filesystem */
public final class C205399ra implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        byte b = 0;
        String str = null;
        byte b2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                b = (byte) AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 4, readInt);
            } else {
                b2 = (byte) AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C98824s5(str, b, b2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C98824s5[i];
    }
}

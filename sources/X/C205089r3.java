package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9r3  reason: invalid class name and case insensitive filesystem */
public final class C205089r3 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c != 3) {
                str3 = AnonymousClass0ZA.A09(parcel, str3, c, 4, readInt);
            } else {
                str2 = AnonymousClass0ZA.A08(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170198Ci(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170198Ci[i];
    }
}

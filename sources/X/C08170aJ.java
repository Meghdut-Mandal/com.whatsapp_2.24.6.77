package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aJ  reason: invalid class name and case insensitive filesystem */
public final class C08170aJ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        C04530Kz r1 = null;
        int i = 0;
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
                r1 = (C04530Kz) AnonymousClass0ZA.A06(parcel, C04530Kz.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04500Kw(r1, str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04500Kw[i];
    }
}

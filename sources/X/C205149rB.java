package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rB  reason: invalid class name and case insensitive filesystem */
public final class C205149rB implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        C98814s4 r1 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r1 = (C98814s4) AnonymousClass0ZA.A06(parcel, C98814s4.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C169978Bm(r1, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C169978Bm[i];
    }
}

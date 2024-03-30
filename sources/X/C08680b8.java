package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0b8  reason: invalid class name and case insensitive filesystem */
public final class C08680b8 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        AnonymousClass0L0 r1 = null;
        C04370Kj r2 = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                r1 = (AnonymousClass0L0) AnonymousClass0ZA.A06(parcel, AnonymousClass0L0.CREATOR, readInt);
            } else if (c != 3) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r2 = (C04370Kj) AnonymousClass0ZA.A06(parcel, C04370Kj.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0K9(r1, r2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0K9[i];
    }
}

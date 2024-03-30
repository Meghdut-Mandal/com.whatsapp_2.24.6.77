package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0b7  reason: invalid class name and case insensitive filesystem */
public final class C08670b7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        AnonymousClass0KB r1 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 2) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                r1 = (AnonymousClass0KB) AnonymousClass0ZA.A06(parcel, AnonymousClass0KB.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0K7(r1, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0K7[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rW  reason: invalid class name and case insensitive filesystem */
public final class C205359rW implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C169938Bg(i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C169938Bg[i];
    }
}

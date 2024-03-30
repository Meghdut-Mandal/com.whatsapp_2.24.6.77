package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0b0  reason: invalid class name and case insensitive filesystem */
public final class C08600b0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            str = AnonymousClass0ZA.A09(parcel, str, (char) readInt, 2, readInt);
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KK(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KK[i];
    }
}

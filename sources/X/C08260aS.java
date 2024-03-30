package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aS  reason: invalid class name and case insensitive filesystem */
public final class C08260aS implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        long j = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KO(j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KO[i];
    }
}

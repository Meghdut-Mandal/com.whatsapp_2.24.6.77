package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aq  reason: invalid class name and case insensitive filesystem */
public final class C08500aq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            } else if (c != 2) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KZ(bArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KZ[i];
    }
}

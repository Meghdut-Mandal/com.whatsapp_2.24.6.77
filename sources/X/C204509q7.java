package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9q7  reason: invalid class name and case insensitive filesystem */
public final class C204509q7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                z = C165607th.A1U(parcel, c, 2, readInt, z);
            } else {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8Bh(bArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8Bh[i];
    }
}

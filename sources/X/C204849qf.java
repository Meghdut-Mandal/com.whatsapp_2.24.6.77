package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qf  reason: invalid class name and case insensitive filesystem */
public final class C204849qf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        byte[] bArr = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c != 3) {
                i = C165607th.A04(parcel, c, readInt, i);
            } else {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8C5(str, bArr, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8C5[i];
    }
}

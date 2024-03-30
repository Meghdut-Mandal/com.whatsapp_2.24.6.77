package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0as  reason: invalid class name and case insensitive filesystem */
public final class C08520as implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c == 3) {
                bArr2 = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c == 4) {
                bArr3 = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c != 5) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                strArr = AnonymousClass0ZA.A0L(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0LU(bArr, bArr2, bArr3, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0LU[i];
    }
}

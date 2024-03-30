package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rP  reason: invalid class name and case insensitive filesystem */
public final class C205289rP implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 3) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c != 4) {
                str2 = AnonymousClass0ZA.A09(parcel, str2, c, 5, readInt);
            } else {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C98794s2(str, str2, bArr, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C98794s2[i];
    }
}

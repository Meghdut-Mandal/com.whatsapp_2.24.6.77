package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ar  reason: invalid class name and case insensitive filesystem */
public final class C08510ar implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c == 3) {
                bArr2 = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c == 4) {
                bArr3 = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c == 5) {
                bArr4 = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c != 6) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                bArr5 = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0LT(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0LT[i];
    }
}

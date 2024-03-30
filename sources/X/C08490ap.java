package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ap  reason: invalid class name and case insensitive filesystem */
public final class C08490ap implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c != 2) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                bArr2 = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KY(bArr, bArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KY[i];
    }
}

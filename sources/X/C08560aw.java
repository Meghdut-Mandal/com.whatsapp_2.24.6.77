package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aw  reason: invalid class name and case insensitive filesystem */
public final class C08560aw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        long j = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = AnonymousClass0ZA.A03(parcel, readInt);
            } else if (c == 2) {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c == 3) {
                bArr2 = AnonymousClass0ZA.A0I(parcel, readInt);
            } else if (c != 4) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                bArr3 = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04360Ki(bArr, bArr2, bArr3, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04360Ki[i];
    }
}

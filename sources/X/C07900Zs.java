package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zs  reason: invalid class name and case insensitive filesystem */
public final class C07900Zs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        byte[] bArr = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            } else if (c != 2) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 3, readInt);
            } else {
                bArr = AnonymousClass0ZA.A0I(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04290Kb(bArr, str, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04290Kb[i];
    }
}

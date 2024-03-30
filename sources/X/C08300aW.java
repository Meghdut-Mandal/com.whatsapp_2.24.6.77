package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aW  reason: invalid class name and case insensitive filesystem */
public final class C08300aW implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        byte[][] bArr = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                bArr = AnonymousClass0ZA.A0M(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KR(bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KR[i];
    }
}

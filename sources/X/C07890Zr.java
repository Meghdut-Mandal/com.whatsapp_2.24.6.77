package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zr  reason: invalid class name and case insensitive filesystem */
public final class C07890Zr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 2, readInt);
            } else {
                z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KV(z, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KV[i];
    }
}

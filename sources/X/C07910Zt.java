package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zt  reason: invalid class name and case insensitive filesystem */
public final class C07910Zt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        boolean z = false;
        while (parcel.dataPosition() < A00) {
            z = AnonymousClass0ZA.A0H(parcel, z);
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KH(z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KH[i];
    }
}

package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aB  reason: invalid class name and case insensitive filesystem */
public final class C08090aB implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        IBinder iBinder = null;
        AnonymousClass0L0 r5 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                iBinder = AnonymousClass0ZA.A05(parcel, readInt);
            } else if (c == 3) {
                r5 = (AnonymousClass0L0) AnonymousClass0ZA.A06(parcel, AnonymousClass0L0.CREATOR, readInt);
            } else if (c == 4) {
                z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            } else if (c != 5) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04370Kj(iBinder, r5, i, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04370Kj[i];
    }
}

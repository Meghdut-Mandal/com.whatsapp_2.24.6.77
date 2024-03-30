package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.0Zi  reason: invalid class name and case insensitive filesystem */
public final class C07800Zi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        int i = 0;
        C04700Lr r4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            int i3 = 1;
            if (c != 1) {
                i3 = 2;
                if (c != 2) {
                    i3 = 3;
                    if (c != 3) {
                        i3 = 4;
                        if (c != 4) {
                            AnonymousClass0ZA.A0D(parcel, readInt);
                        } else {
                            r4 = (C04700Lr) AnonymousClass0ZA.A06(parcel, C04700Lr.CREATOR, readInt);
                        }
                    } else {
                        i2 = AnonymousClass0ZA.A01(parcel, readInt);
                    }
                } else {
                    arrayList = AnonymousClass0ZA.A0B(parcel, C04710Ls.CREATOR, readInt);
                }
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
            AnonymousClass000.A1F(hashSet, i3);
        }
        if (parcel.dataPosition() == A00) {
            return new C04690Lq(r4, arrayList, hashSet, i, i2);
        }
        throw new C13160jP(parcel, AnonymousClass000.A0r("Overread allowed size end=", AnonymousClass000.A0u(), A00));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04690Lq[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.0Zk  reason: invalid class name and case insensitive filesystem */
public final class C07820Zk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        HashSet hashSet = new HashSet();
        C04720Lt r4 = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            int i2 = 1;
            if (c != 1) {
                i2 = 2;
                if (c != 2) {
                    i2 = 3;
                    if (c != 3) {
                        i2 = 4;
                        if (c != 4) {
                            i2 = 5;
                            if (c != 5) {
                                AnonymousClass0ZA.A0D(parcel, readInt);
                            } else {
                                str3 = AnonymousClass0ZA.A08(parcel, readInt);
                            }
                        } else {
                            str2 = AnonymousClass0ZA.A08(parcel, readInt);
                        }
                    } else {
                        str = AnonymousClass0ZA.A08(parcel, readInt);
                    }
                } else {
                    r4 = (C04720Lt) AnonymousClass0ZA.A06(parcel, C04720Lt.CREATOR, readInt);
                }
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
            AnonymousClass000.A1F(hashSet, i2);
        }
        if (parcel.dataPosition() == A00) {
            return new C04710Ls(r4, str, str2, str3, hashSet, i);
        }
        throw new C13160jP(parcel, AnonymousClass000.A0r("Overread allowed size end=", AnonymousClass000.A0u(), A00));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04710Ls[i];
    }
}

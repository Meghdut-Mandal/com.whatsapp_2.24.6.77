package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6aq  reason: invalid class name and case insensitive filesystem */
public final class C134316aq implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass5TI valueOf;
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AnonymousClass5TJ r2 = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = AnonymousClass5TI.valueOf(parcel.readString());
        }
        if (parcel.readInt() != 0) {
            r2 = AnonymousClass5TJ.valueOf(parcel.readString());
        }
        return new C134816be(valueOf, r2, A0g, readString, readString2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134816be[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Wh  reason: invalid class name and case insensitive filesystem */
public final class C66523Wh implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C36411kG.A02(parcel);
        String readString = parcel.readString();
        return new C66743Xd(C52252p8.valueOf(parcel.readString()), C52262p9.valueOf(parcel.readString()), readString, parcel.readString(), A02, AnonymousClass000.A1P(parcel.readInt()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C66743Xd[i];
    }
}

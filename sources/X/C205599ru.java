package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9ru  reason: invalid class name and case insensitive filesystem */
public final class C205599ru implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0g = C36341k9.A0g(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "pincode";
        }
        return new C206609tg(A0g, readString, readString2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C206609tg[i];
    }
}

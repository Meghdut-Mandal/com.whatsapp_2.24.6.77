package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Wk  reason: invalid class name and case insensitive filesystem */
public final class C66553Wk implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        String A0g = C36341k9.A0g(parcel);
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(AnonymousClass000.A1P(parcel.readInt()));
        }
        return new AnonymousClass3XM(valueOf, A0g, parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass3XM[i];
    }
}

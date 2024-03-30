package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ak  reason: invalid class name and case insensitive filesystem */
public final class C08440ak implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C05110Nm.A00(parcel.readString());
        } catch (C05200Nz e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C05110Nm[i];
    }
}

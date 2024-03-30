package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ae  reason: invalid class name and case insensitive filesystem */
public final class C08380ae implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        try {
            return C05130No.A00(readString);
        } catch (AnonymousClass0O3 e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C05130No[i];
    }
}

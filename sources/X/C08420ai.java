package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ai  reason: invalid class name and case insensitive filesystem */
public final class C08420ai implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        try {
            for (C05080Ni r1 : C05080Ni.values()) {
                if (readString.equals(r1.zze)) {
                    return r1;
                }
            }
            throw new AnonymousClass0O5(readString);
        } catch (AnonymousClass0O5 e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C05080Ni[i];
    }
}

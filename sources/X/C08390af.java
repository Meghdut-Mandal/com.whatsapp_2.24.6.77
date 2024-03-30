package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0af  reason: invalid class name and case insensitive filesystem */
public final class C08390af implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        try {
            for (AnonymousClass0Nk r1 : AnonymousClass0Nk.values()) {
                if (readString.equals(r1.zzb)) {
                    return r1;
                }
            }
            throw new AnonymousClass0O4(readString);
        } catch (AnonymousClass0O4 e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0Nk[i];
    }
}

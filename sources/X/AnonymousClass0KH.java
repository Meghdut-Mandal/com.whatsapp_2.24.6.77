package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0KH  reason: invalid class name */
public final class AnonymousClass0KH extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07910Zt();
    public final boolean A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KH) || this.A00 != ((AnonymousClass0KH) obj).A00) {
            return false;
        }
        return true;
    }

    public AnonymousClass0KH(boolean z) {
        this.A00 = z;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        C10440eF.A05(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C10440eF.A03(parcel, AnonymousClass0Z9.A00(parcel), this.A00);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0KM  reason: invalid class name */
public class AnonymousClass0KM extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08410ah();
    public final boolean A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KM) || this.A00 != ((AnonymousClass0KM) obj).A00) {
            return false;
        }
        return true;
    }

    public AnonymousClass0KM(boolean z) {
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

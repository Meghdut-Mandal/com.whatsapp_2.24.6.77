package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0KJ  reason: invalid class name */
public class AnonymousClass0KJ extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08480ao();
    public final boolean A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KJ) || this.A00 != ((AnonymousClass0KJ) obj).A00) {
            return false;
        }
        return true;
    }

    public AnonymousClass0KJ(boolean z) {
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

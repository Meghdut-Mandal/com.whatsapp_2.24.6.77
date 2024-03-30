package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0KU  reason: invalid class name */
public final class AnonymousClass0KU extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08250aR();
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KU) || this.A00 != ((AnonymousClass0KU) obj).A00) {
            return false;
        }
        return true;
    }

    public AnonymousClass0KU(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        AnonymousClass006.A01(valueOf);
        this.A00 = valueOf.booleanValue();
    }

    public final int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        C10440eF.A05(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C10440eF.A03(parcel, AnonymousClass0Z9.A00(parcel), this.A00);
    }
}

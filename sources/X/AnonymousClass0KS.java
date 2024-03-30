package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0KS  reason: invalid class name */
public final class AnonymousClass0KS extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08570ax();
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0KS) {
            List list = this.A00;
            List list2 = ((AnonymousClass0KS) obj).A00;
            if (!list.containsAll(list2) || !list2.containsAll(list)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0KS(List list) {
        AnonymousClass006.A01(list);
        this.A00 = list;
    }

    public final int hashCode() {
        return AnonymousClass000.A0K(new HashSet(this.A00), AnonymousClass001.A0L());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0E(parcel, this.A00, 1, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

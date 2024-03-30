package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KQ  reason: invalid class name */
public final class AnonymousClass0KQ extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08290aV();
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KQ)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass0KQ) obj).A00);
    }

    public AnonymousClass0KQ(String str) {
        AnonymousClass006.A01(str);
        this.A00 = str;
    }

    public final int hashCode() {
        return AnonymousClass000.A0K(this.A00, AnonymousClass001.A0L());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A00, 1, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

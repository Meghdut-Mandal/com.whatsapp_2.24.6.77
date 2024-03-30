package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KO  reason: invalid class name */
public final class AnonymousClass0KO extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08260aS();
    public final long A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KO) || this.A00 != ((AnonymousClass0KO) obj).A00) {
            return false;
        }
        return true;
    }

    public AnonymousClass0KO(long j) {
        Long valueOf = Long.valueOf(j);
        AnonymousClass006.A01(valueOf);
        this.A00 = valueOf.longValue();
    }

    public final int hashCode() {
        return AnonymousClass000.A0K(Long.valueOf(this.A00), AnonymousClass001.A0L());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A09(parcel, 1, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

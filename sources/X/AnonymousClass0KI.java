package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KI  reason: invalid class name */
public class AnonymousClass0KI extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07930Zv();
    public final PendingIntent A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KI)) {
            return false;
        }
        return AnonymousClass0QM.A00(this.A00, ((AnonymousClass0KI) obj).A00);
    }

    public AnonymousClass0KI(PendingIntent pendingIntent) {
        AnonymousClass006.A01(pendingIntent);
        this.A00 = pendingIntent;
    }

    public int hashCode() {
        return AnonymousClass000.A0K(this.A00, AnonymousClass001.A0L());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A00, 1, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

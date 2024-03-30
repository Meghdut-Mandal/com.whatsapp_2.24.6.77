package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0K2  reason: invalid class name */
public final class AnonymousClass0K2 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07860Zo();
    public final PendingIntent A00;

    public AnonymousClass0K2(PendingIntent pendingIntent) {
        AnonymousClass006.A01(pendingIntent);
        this.A00 = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A00, 1, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

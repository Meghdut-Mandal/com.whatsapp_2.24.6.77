package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aN  reason: invalid class name and case insensitive filesystem */
public final class C08210aN implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                i2 = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 3) {
                str = AnonymousClass0ZA.A09(parcel, str, c, 4, readInt);
            } else {
                pendingIntent = (PendingIntent) AnonymousClass0ZA.A06(parcel, PendingIntent.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0L0(pendingIntent, str, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0L0[i];
    }
}

package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zo  reason: invalid class name and case insensitive filesystem */
public final class C07860Zo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) AnonymousClass0ZA.A06(parcel, PendingIntent.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0K2(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0K2[i];
    }
}

package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0a5  reason: invalid class name and case insensitive filesystem */
public final class C08030a5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        AnonymousClass0L0 r5 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                str = AnonymousClass0ZA.A08(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) AnonymousClass0ZA.A06(parcel, PendingIntent.CREATOR, readInt);
            } else if (c == 4) {
                r5 = (AnonymousClass0L0) AnonymousClass0ZA.A06(parcel, AnonymousClass0L0.CREATOR, readInt);
            } else if (c != 1000) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new Status(pendingIntent, r5, str, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}

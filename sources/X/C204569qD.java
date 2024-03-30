package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qD  reason: invalid class name and case insensitive filesystem */
public final class C204569qD implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        AnonymousClass8CL r7 = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 2:
                    r7 = (AnonymousClass8CL) AnonymousClass0ZA.A06(parcel, AnonymousClass8CL.CREATOR, readInt);
                    break;
                case 3:
                    iBinder = AnonymousClass0ZA.A05(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) AnonymousClass0ZA.A06(parcel, PendingIntent.CREATOR, readInt);
                    break;
                case 5:
                    iBinder2 = AnonymousClass0ZA.A05(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = AnonymousClass0ZA.A05(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CC(pendingIntent, iBinder, iBinder2, iBinder3, r7, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CC[i];
    }
}

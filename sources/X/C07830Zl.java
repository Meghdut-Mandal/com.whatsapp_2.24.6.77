package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.0Zl  reason: invalid class name and case insensitive filesystem */
public final class C07830Zl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        int A00 = AnonymousClass0ZA.A00(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        AnonymousClass0KA r4 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = AnonymousClass0ZA.A01(parcel, readInt);
                    i = 1;
                    break;
                case 2:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    i = 2;
                    break;
                case 3:
                    i3 = AnonymousClass0ZA.A01(parcel, readInt);
                    i = 3;
                    break;
                case 4:
                    bArr = AnonymousClass0ZA.A0I(parcel, readInt);
                    i = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) AnonymousClass0ZA.A06(parcel, PendingIntent.CREATOR, readInt);
                    i = 5;
                    break;
                case 6:
                    r4 = (AnonymousClass0KA) AnonymousClass0ZA.A06(parcel, AnonymousClass0KA.CREATOR, readInt);
                    i = 6;
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    continue;
            }
            AnonymousClass000.A1F(hashSet, i);
        }
        if (parcel.dataPosition() == A00) {
            return new C04720Lt(pendingIntent, r4, str, hashSet, bArr, i2, i3);
        }
        throw new C13160jP(parcel, AnonymousClass000.A0r("Overread allowed size end=", AnonymousClass000.A0u(), A00));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04720Lt[i];
    }
}

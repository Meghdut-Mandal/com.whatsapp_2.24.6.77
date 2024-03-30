package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* renamed from: X.9qb  reason: invalid class name and case insensitive filesystem */
public final class C204809qb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 2:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 3:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 5:
                    i2 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 6:
                    str3 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new ClientAppContext(str, str2, str3, i, i2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientAppContext[i];
    }
}

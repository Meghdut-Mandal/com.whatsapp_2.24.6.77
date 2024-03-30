package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qA  reason: invalid class name and case insensitive filesystem */
public final class C204539qA implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C170158Ce[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 3:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 4:
                    i2 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 5:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 6:
                    str3 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 7:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 8:
                    str4 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 9:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 10:
                    i3 = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C170158Ce(str, str2, str3, str4, i, i2, i3, z, z2);
    }
}

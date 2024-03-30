package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qr  reason: invalid class name and case insensitive filesystem */
public final class C204969qr implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 3:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 4:
                    str3 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 5:
                    str4 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 6:
                    str5 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 7:
                    str6 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 8:
                    str7 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CY(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CY[i];
    }
}

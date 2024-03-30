package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9rb  reason: invalid class name and case insensitive filesystem */
public final class C205409rb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    i = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 3:
                    str = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 4:
                    str2 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 5:
                    str3 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 6:
                    str4 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 7:
                    str5 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 8:
                    str6 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 9:
                    b = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 10:
                    b2 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 11:
                    b3 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 12:
                    b4 = (byte) AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 13:
                    str7 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new C98854s8(str, str2, str3, str4, str5, str6, str7, b, b2, b3, b4, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C98854s8[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qq  reason: invalid class name and case insensitive filesystem */
public final class C204959qq implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 2:
                    str = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 3:
                    str2 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 4:
                    str3 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 5:
                    str4 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 6:
                    str5 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 7:
                    str6 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 8:
                    str7 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 9:
                    str8 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 10:
                    str9 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 11:
                    str10 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 12:
                    str11 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 13:
                    str12 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 14:
                    str13 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 15:
                    str14 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new C170118Ca(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C170118Ca[i];
    }
}

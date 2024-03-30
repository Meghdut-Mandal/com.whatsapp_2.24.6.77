package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zw  reason: invalid class name and case insensitive filesystem */
public final class C07940Zw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        C04450Kr r4 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 2:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 3:
                    str3 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 4:
                    str4 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 5:
                    uri = (Uri) AnonymousClass0ZA.A06(parcel, Uri.CREATOR, readInt);
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
                case 9:
                    r4 = (C04450Kr) AnonymousClass0ZA.A06(parcel, C04450Kr.CREATOR, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04410Kn(uri, r4, str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04410Kn[i];
    }
}

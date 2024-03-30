package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9qn  reason: invalid class name and case insensitive filesystem */
public final class C204929qn implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        AnonymousClass8CY r3 = null;
        String str = null;
        String str2 = null;
        AnonymousClass8CP[] r8 = null;
        AnonymousClass8CT[] r7 = null;
        String[] strArr = null;
        AnonymousClass8CN[] r6 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    r3 = (AnonymousClass8CY) AnonymousClass0ZA.A06(parcel, AnonymousClass8CY.CREATOR, readInt);
                    break;
                case 3:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 4:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 5:
                    r8 = (AnonymousClass8CP[]) AnonymousClass0ZA.A0K(parcel, AnonymousClass8CP.CREATOR, readInt);
                    break;
                case 6:
                    r7 = (AnonymousClass8CT[]) AnonymousClass0ZA.A0K(parcel, AnonymousClass8CT.CREATOR, readInt);
                    break;
                case 7:
                    strArr = AnonymousClass0ZA.A0L(parcel, readInt);
                    break;
                case 8:
                    r6 = (AnonymousClass8CN[]) AnonymousClass0ZA.A0K(parcel, AnonymousClass8CN.CREATOR, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass8CX(r3, str, str2, r6, r7, r8, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8CX[i];
    }
}

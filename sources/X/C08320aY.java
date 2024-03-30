package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0aY  reason: invalid class name and case insensitive filesystem */
public final class C08320aY implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        AnonymousClass0LU r5 = null;
        AnonymousClass0LT r4 = null;
        AnonymousClass0LS r6 = null;
        C04340Kg r3 = null;
        String str3 = null;
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
                    bArr = AnonymousClass0ZA.A0I(parcel, readInt);
                    break;
                case 4:
                    r5 = (AnonymousClass0LU) AnonymousClass0ZA.A06(parcel, AnonymousClass0LU.CREATOR, readInt);
                    break;
                case 5:
                    r4 = (AnonymousClass0LT) AnonymousClass0ZA.A06(parcel, AnonymousClass0LT.CREATOR, readInt);
                    break;
                case 6:
                    r6 = (AnonymousClass0LS) AnonymousClass0ZA.A06(parcel, AnonymousClass0LS.CREATOR, readInt);
                    break;
                case 7:
                    r3 = (C04340Kg) AnonymousClass0ZA.A06(parcel, C04340Kg.CREATOR, readInt);
                    break;
                case 8:
                    str3 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04450Kr(r3, r4, r5, r6, str, str2, str3, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04450Kr[i];
    }
}

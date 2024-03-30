package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0aX  reason: invalid class name and case insensitive filesystem */
public final class C08310aX implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        C04310Kd r5 = null;
        C04350Kh r6 = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        C04440Kq r4 = null;
        Integer num = null;
        C04280Ka r7 = null;
        String str = null;
        C04420Ko r3 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    r5 = (C04310Kd) AnonymousClass0ZA.A06(parcel, C04310Kd.CREATOR, readInt);
                    break;
                case 3:
                    r6 = (C04350Kh) AnonymousClass0ZA.A06(parcel, C04350Kh.CREATOR, readInt);
                    break;
                case 4:
                    bArr = AnonymousClass0ZA.A0I(parcel, readInt);
                    break;
                case 5:
                    arrayList = AnonymousClass0ZA.A0B(parcel, AnonymousClass0KX.CREATOR, readInt);
                    break;
                case 6:
                    int A02 = AnonymousClass0ZA.A02(parcel, readInt);
                    if (A02 != 0) {
                        AnonymousClass0ZA.A0E(parcel, A02, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                case 7:
                    arrayList2 = AnonymousClass0ZA.A0B(parcel, C04330Kf.CREATOR, readInt);
                    break;
                case 8:
                    r4 = (C04440Kq) AnonymousClass0ZA.A06(parcel, C04440Kq.CREATOR, readInt);
                    break;
                case 9:
                    int A022 = AnonymousClass0ZA.A02(parcel, readInt);
                    if (A022 != 0) {
                        AnonymousClass0ZA.A0E(parcel, A022, 4);
                        num = Integer.valueOf(parcel.readInt());
                        break;
                    } else {
                        num = null;
                        break;
                    }
                case 10:
                    r7 = (C04280Ka) AnonymousClass0ZA.A06(parcel, C04280Ka.CREATOR, readInt);
                    break;
                case 11:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 12:
                    r3 = (C04420Ko) AnonymousClass0ZA.A06(parcel, C04420Ko.CREATOR, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0LV(r3, r4, r5, r6, r7, d, num, str, arrayList, arrayList2, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0LV[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0an  reason: invalid class name and case insensitive filesystem */
public final class C08470an implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        AnonymousClass0KK r3 = null;
        AnonymousClass0KS r10 = null;
        AnonymousClass0KM r5 = null;
        AnonymousClass0KU r12 = null;
        AnonymousClass0KO r6 = null;
        AnonymousClass0KP r7 = null;
        AnonymousClass0KT r11 = null;
        AnonymousClass0KQ r8 = null;
        AnonymousClass0KL r4 = null;
        AnonymousClass0KR r9 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    r3 = (AnonymousClass0KK) AnonymousClass0ZA.A06(parcel, AnonymousClass0KK.CREATOR, readInt);
                    break;
                case 3:
                    r10 = (AnonymousClass0KS) AnonymousClass0ZA.A06(parcel, AnonymousClass0KS.CREATOR, readInt);
                    break;
                case 4:
                    r5 = (AnonymousClass0KM) AnonymousClass0ZA.A06(parcel, AnonymousClass0KM.CREATOR, readInt);
                    break;
                case 5:
                    r12 = (AnonymousClass0KU) AnonymousClass0ZA.A06(parcel, AnonymousClass0KU.CREATOR, readInt);
                    break;
                case 6:
                    r6 = (AnonymousClass0KO) AnonymousClass0ZA.A06(parcel, AnonymousClass0KO.CREATOR, readInt);
                    break;
                case 7:
                    r7 = (AnonymousClass0KP) AnonymousClass0ZA.A06(parcel, AnonymousClass0KP.CREATOR, readInt);
                    break;
                case 8:
                    r11 = (AnonymousClass0KT) AnonymousClass0ZA.A06(parcel, AnonymousClass0KT.CREATOR, readInt);
                    break;
                case 9:
                    r8 = (AnonymousClass0KQ) AnonymousClass0ZA.A06(parcel, AnonymousClass0KQ.CREATOR, readInt);
                    break;
                case 10:
                    r4 = (AnonymousClass0KL) AnonymousClass0ZA.A06(parcel, AnonymousClass0KL.CREATOR, readInt);
                    break;
                case 11:
                    r9 = (AnonymousClass0KR) AnonymousClass0ZA.A06(parcel, AnonymousClass0KR.CREATOR, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04420Ko(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04420Ko[i];
    }
}

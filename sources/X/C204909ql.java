package X;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9ql  reason: invalid class name and case insensitive filesystem */
public final class C204909ql implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        AnonymousClass8CT r8 = null;
        AnonymousClass8CP r10 = null;
        AnonymousClass8CQ r11 = null;
        AnonymousClass8CS r13 = null;
        AnonymousClass8CR r12 = null;
        AnonymousClass8CO r9 = null;
        AnonymousClass8CW r5 = null;
        AnonymousClass8CX r6 = null;
        C170118Ca r7 = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
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
                    i2 = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 6:
                    pointArr = (Point[]) AnonymousClass0ZA.A0K(parcel2, Point.CREATOR, readInt);
                    break;
                case 7:
                    r8 = (AnonymousClass8CT) AnonymousClass0ZA.A06(parcel2, AnonymousClass8CT.CREATOR, readInt);
                    break;
                case 8:
                    r10 = (AnonymousClass8CP) AnonymousClass0ZA.A06(parcel2, AnonymousClass8CP.CREATOR, readInt);
                    break;
                case 9:
                    r11 = (AnonymousClass8CQ) AnonymousClass0ZA.A06(parcel2, AnonymousClass8CQ.CREATOR, readInt);
                    break;
                case 10:
                    r13 = (AnonymousClass8CS) AnonymousClass0ZA.A06(parcel2, AnonymousClass8CS.CREATOR, readInt);
                    break;
                case 11:
                    r12 = (AnonymousClass8CR) AnonymousClass0ZA.A06(parcel2, AnonymousClass8CR.CREATOR, readInt);
                    break;
                case 12:
                    r9 = (AnonymousClass8CO) AnonymousClass0ZA.A06(parcel2, AnonymousClass8CO.CREATOR, readInt);
                    break;
                case 13:
                    r5 = (AnonymousClass8CW) AnonymousClass0ZA.A06(parcel2, AnonymousClass8CW.CREATOR, readInt);
                    break;
                case 14:
                    r6 = (AnonymousClass8CX) AnonymousClass0ZA.A06(parcel2, AnonymousClass8CX.CREATOR, readInt);
                    break;
                case 15:
                    r7 = (C170118Ca) AnonymousClass0ZA.A06(parcel2, C170118Ca.CREATOR, readInt);
                    break;
                case 16:
                    bArr = AnonymousClass0ZA.A0I(parcel2, readInt);
                    break;
                case 17:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new C170128Cb(r5, r6, r7, r8, r9, r10, r11, r12, r13, str, str2, bArr, pointArr, i, i2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C170128Cb[i];
    }
}

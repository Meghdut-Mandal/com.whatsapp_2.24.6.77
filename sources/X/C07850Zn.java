package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Zn  reason: invalid class name and case insensitive filesystem */
public final class C07850Zn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        AnonymousClass0KH r6 = null;
        C04390Kl r3 = null;
        String str = null;
        C04290Kb r5 = null;
        AnonymousClass0KV r4 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    r6 = (AnonymousClass0KH) AnonymousClass0ZA.A06(parcel, AnonymousClass0KH.CREATOR, readInt);
                    break;
                case 2:
                    r3 = (C04390Kl) AnonymousClass0ZA.A06(parcel, C04390Kl.CREATOR, readInt);
                    break;
                case 3:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 5:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 6:
                    r5 = (C04290Kb) AnonymousClass0ZA.A06(parcel, C04290Kb.CREATOR, readInt);
                    break;
                case 7:
                    r4 = (AnonymousClass0KV) AnonymousClass0ZA.A06(parcel, AnonymousClass0KV.CREATOR, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new C04400Km(r3, r4, r5, r6, str, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C04400Km[i];
    }
}

package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: X.0b9  reason: invalid class name and case insensitive filesystem */
public final class C08690b9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = AnonymousClass0ZA.A00(parcel2);
        Scope[] scopeArr = AnonymousClass0KF.A0F;
        Bundle A07 = AnonymousClass001.A07();
        C04520Ky[] r9 = AnonymousClass0KF.A0E;
        String str = null;
        C04520Ky[] r10 = r9;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 2:
                    i2 = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 3:
                    i3 = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 4:
                    str = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                case 5:
                    iBinder = AnonymousClass0ZA.A05(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) AnonymousClass0ZA.A0K(parcel2, Scope.CREATOR, readInt);
                    break;
                case 7:
                    A07 = AnonymousClass0ZA.A04(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) AnonymousClass0ZA.A06(parcel2, Account.CREATOR, readInt);
                    break;
                case 10:
                    r9 = (C04520Ky[]) AnonymousClass0ZA.A0K(parcel2, C04520Ky.CREATOR, readInt);
                    break;
                case 11:
                    r10 = (C04520Ky[]) AnonymousClass0ZA.A0K(parcel2, C04520Ky.CREATOR, readInt);
                    break;
                case 12:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                    break;
                case 13:
                    i4 = AnonymousClass0ZA.A01(parcel2, readInt);
                    break;
                case 14:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel2, readInt));
                    break;
                case 15:
                    str2 = AnonymousClass0ZA.A08(parcel2, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel2, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel2, A00);
        return new AnonymousClass0KF(account, A07, iBinder, str, str2, r9, r10, scopeArr, i, i2, i3, i4, z, z2);
    }

    public static void A00(Parcel parcel, AnonymousClass0KF r5, int i) {
        int A00 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, r5.A0C);
        AnonymousClass0Z9.A08(parcel, 2, r5.A0D);
        AnonymousClass0Z9.A08(parcel, 3, r5.A00);
        AnonymousClass0Z9.A0C(parcel, r5.A05, 4, false);
        AnonymousClass0Z9.A04(r5.A04, parcel, 5);
        AnonymousClass0Z9.A0G(parcel, r5.A0A, 6, i);
        AnonymousClass0Z9.A03(r5.A03, parcel, 7);
        AnonymousClass0Z9.A0B(parcel, r5.A02, 8, i, false);
        AnonymousClass0Z9.A0G(parcel, r5.A08, 10, i);
        AnonymousClass0Z9.A0G(parcel, r5.A09, 11, i);
        AnonymousClass0Z9.A0A(parcel, 12, r5.A06);
        AnonymousClass0Z9.A08(parcel, 13, r5.A01);
        AnonymousClass0Z9.A0A(parcel, 14, r5.A07);
        AnonymousClass0Z9.A0C(parcel, r5.A0B, 15, false);
        AnonymousClass0Z9.A07(parcel, A00);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KF[i];
    }
}

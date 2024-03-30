package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0a1  reason: invalid class name and case insensitive filesystem */
public final class C07990a1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = AnonymousClass0ZA.A01(parcel, readInt);
                    break;
                case 2:
                    arrayList = AnonymousClass0ZA.A0B(parcel, Scope.CREATOR, readInt);
                    break;
                case 3:
                    account = (Account) AnonymousClass0ZA.A06(parcel, Account.CREATOR, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 5:
                    z2 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 6:
                    z3 = AnonymousClass000.A1P(AnonymousClass0ZA.A01(parcel, readInt));
                    break;
                case 7:
                    str = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 8:
                    str2 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = AnonymousClass0ZA.A0B(parcel, AnonymousClass0K8.CREATOR, readInt);
                    break;
                case 10:
                    str3 = AnonymousClass0ZA.A08(parcel, readInt);
                    break;
                default:
                    AnonymousClass0ZA.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        Parcelable.Creator creator = GoogleSignInOptions.CREATOR;
        HashMap A0J = AnonymousClass001.A0J();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AnonymousClass0K8 r1 = (AnonymousClass0K8) it.next();
                A0J.put(Integer.valueOf(r1.A00), r1);
            }
        }
        return new GoogleSignInOptions(account, str, str2, str3, arrayList, A0J, i, z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}

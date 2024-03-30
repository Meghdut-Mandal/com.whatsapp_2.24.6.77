package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.0aA  reason: invalid class name and case insensitive filesystem */
public final class C08080aA implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = AnonymousClass0ZA.A00(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c == 2) {
                account = (Account) AnonymousClass0ZA.A06(parcel, Account.CREATOR, readInt);
            } else if (c == 3) {
                i2 = AnonymousClass0ZA.A01(parcel, readInt);
            } else if (c != 4) {
                AnonymousClass0ZA.A0D(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) AnonymousClass0ZA.A06(parcel, GoogleSignInAccount.CREATOR, readInt);
            }
        }
        AnonymousClass0ZA.A0C(parcel, A00);
        return new AnonymousClass0KB(account, googleSignInAccount, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass0KB[i];
    }
}

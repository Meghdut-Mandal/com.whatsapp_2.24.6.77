package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.0KB  reason: invalid class name */
public final class AnonymousClass0KB extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08080aA();
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    public AnonymousClass0KB(Account account, GoogleSignInAccount googleSignInAccount, int i, int i2) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A02, 2, i, false);
        AnonymousClass0Z9.A08(parcel, 3, this.A01);
        AnonymousClass0Z9.A0B(parcel, this.A03, 4, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}

package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0dx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10260dx implements C16820q9 {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ AnonymousClass0JJ A02;

    public /* synthetic */ C10260dx(Account account, Bundle bundle, AnonymousClass0JJ r3) {
        this.A02 = r3;
        this.A00 = account;
        this.A01 = bundle;
    }

    public final void B04(Object obj, Object obj2) {
        Account account = this.A00;
        Bundle bundle = this.A01;
        C07780Zg r3 = (C07780Zg) ((C07560Yg) obj).A04();
        C04670Lo r1 = new C04670Lo((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A00);
        obtain.writeStrongBinder(r1.asBinder());
        obtain.writeInt(1);
        account.writeToParcel(obtain, 0);
        obtain.writeString("oauth2:https://www.googleapis.com/auth/drive.appdata");
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        r3.A01(1, obtain);
    }
}

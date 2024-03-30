package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.IOException;

/* renamed from: X.0da  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10030da implements C16760q3 {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;

    public /* synthetic */ C10030da(Account account, Bundle bundle) {
        this.A00 = account;
        this.A01 = bundle;
    }

    public final Object ByD(IBinder iBinder) {
        Object r3;
        Account account = this.A00;
        Bundle bundle = this.A01;
        AnonymousClass0UT r0 = AnonymousClass0Z2.A01;
        if (iBinder == null) {
            r3 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof C17400rI) {
                r3 = (C17400rI) queryLocalInterface;
            } else {
                r3 = new C04630Lk(iBinder);
            }
        }
        C07780Zg r32 = (C07780Zg) r3;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r32.A00);
        obtain.writeInt(1);
        account.writeToParcel(obtain, 0);
        obtain.writeString("oauth2:https://www.googleapis.com/auth/drive.appdata");
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        Parcel A002 = r32.A00(5, obtain);
        Bundle bundle2 = (Bundle) AnonymousClass000.A0W(A002, Bundle.CREATOR);
        A002.recycle();
        if (bundle2 != null) {
            return AnonymousClass0Z2.A00(bundle2);
        }
        throw new IOException("Service call returned null");
    }
}

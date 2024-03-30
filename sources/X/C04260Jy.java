package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.0Jy  reason: invalid class name and case insensitive filesystem */
public class C04260Jy extends C04270Jz implements C17580re {
    public final Integer A00;
    public final Bundle A01;
    public final AnonymousClass0TT A02;

    public final String A07() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String A08() {
        return "com.google.android.gms.signin.service.START";
    }

    public final int BEG() {
        return 12451000;
    }

    public final boolean BoS() {
        return true;
    }

    public final void Bxt(C17410rK r8) {
        GoogleSignInAccount googleSignInAccount;
        try {
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C07550Yf.A00(this.A0F).A01();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.A00;
            AnonymousClass006.A01(num);
            AnonymousClass0KB r0 = new AnonymousClass0KB(account, googleSignInAccount, 2, num.intValue());
            C07760Ze r3 = (C07760Ze) A04();
            AnonymousClass0K7 r2 = new AnonymousClass0K7(r0, 1);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(r3.A01);
            obtain.writeInt(1);
            r2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(r8.asBinder());
            r3.A00(12, obtain);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                r8.Bxq(new AnonymousClass0K9(new AnonymousClass0L0(8, (PendingIntent) null), (C04370Kj) null, 1));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public C04260Jy(Context context, Bundle bundle, Looper looper, C17610rh r12, C17620ri r13, AnonymousClass0TT r14) {
        super(context, looper, r12, r13, r14, 44);
        this.A02 = r14;
        this.A01 = bundle;
        this.A00 = r14.A00;
    }

    public static Bundle A00(AnonymousClass0TT r4) {
        Integer num = r4.A00;
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable) null);
        if (num != null) {
            A07.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        A07.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        A07.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        A07.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        A07.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        A07.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        A07.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        A07.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        A07.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return A07;
    }

    public final Bundle A03() {
        String str = this.A02.A02;
        String str2 = str;
        if (!this.A0F.getPackageName().equals(str)) {
            this.A01.putString("com.google.android.gms.signin.internal.realClientPackageName", str2);
        }
        return this.A01;
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (!(queryLocalInterface instanceof AnonymousClass0ME)) {
            return new AnonymousClass0ME(iBinder);
        }
        return queryLocalInterface;
    }
}

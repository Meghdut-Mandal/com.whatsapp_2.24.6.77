package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;

/* renamed from: X.0Jv  reason: invalid class name and case insensitive filesystem */
public final class C04240Jv extends C04270Jz {
    public final String A07() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    public final String A08() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final boolean A0E() {
        return true;
    }

    public final C04520Ky[] A0F() {
        return new C04520Ky[]{AnonymousClass0SB.A09, AnonymousClass0SB.A08, AnonymousClass0SB.A00};
    }

    public final int BEG() {
        return 17895000;
    }

    public C04240Jv(Context context, Looper looper, C17080qg r10, C16810q8 r11, AnonymousClass0TT r12) {
        super(context, looper, r10, r11, r12, 224);
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        if (!(queryLocalInterface instanceof C04620Lj)) {
            return new C04620Lj(iBinder);
        }
        return queryLocalInterface;
    }

    public final void B5Y(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.B5Y(str);
    }
}

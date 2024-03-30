package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.0Jw  reason: invalid class name */
public final class AnonymousClass0Jw extends C04270Jz {
    public final Bundle A00 = AnonymousClass001.A07();

    public final Bundle A03() {
        return this.A00;
    }

    public final String A07() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    public final String A08() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final boolean A0E() {
        return true;
    }

    public final int BEG() {
        return 17895000;
    }

    public AnonymousClass0Jw(Context context, Looper looper, C17080qg r11, C16810q8 r12, AnonymousClass0TT r13) {
        super(context, looper, r11, r12, r13, 212);
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (!(queryLocalInterface instanceof C04540La)) {
            return new C04540La(iBinder);
        }
        return queryLocalInterface;
    }

    public final C04520Ky[] A0F() {
        return AnonymousClass0S9.A08;
    }
}

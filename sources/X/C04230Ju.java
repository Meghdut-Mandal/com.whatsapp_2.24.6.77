package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.0Ju  reason: invalid class name and case insensitive filesystem */
public final class C04230Ju extends C04270Jz {
    public final Bundle A00;

    public final Bundle A03() {
        return this.A00;
    }

    public final String A07() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String A08() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final int BEG() {
        return 12451000;
    }

    public C04230Ju(Context context, Looper looper, C10100dh r12, C17080qg r13, C16810q8 r14, AnonymousClass0TT r15) {
        super(context, looper, r13, r14, r15, 16);
        Bundle bundle;
        if (r12 == null) {
            bundle = AnonymousClass001.A07();
        } else {
            bundle = new Bundle(r12.A00);
        }
        this.A00 = bundle;
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (!(queryLocalInterface instanceof C04610Li)) {
            return new C04610Li(iBinder);
        }
        return queryLocalInterface;
    }

    public final boolean BoS() {
        AnonymousClass0TT r2 = this.A00;
        if (!TextUtils.isEmpty((CharSequence) null)) {
            r2.A04.get(C06010Ry.A02);
            if (r2.A05.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }
}

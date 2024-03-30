package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.0Jr  reason: invalid class name and case insensitive filesystem */
public final class C04210Jr extends C04270Jz {
    public final Bundle A00;

    public final Bundle A03() {
        return this.A00;
    }

    public final String A07() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    public final String A08() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final int BEG() {
        return 12451000;
    }

    public C04210Jr(Context context, Looper looper, C10110di r12, C17610rh r13, C17620ri r14, AnonymousClass0TT r15) {
        super(context, looper, r13, r14, r15, 128);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        if (!(queryLocalInterface instanceof C04600Lh)) {
            return new C04600Lh(iBinder);
        }
        return queryLocalInterface;
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.0Jo  reason: invalid class name and case insensitive filesystem */
public final class C04180Jo extends C04270Jz {
    public final C10120dj A00;

    public final String A07() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String A08() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final int BEG() {
        return 12800000;
    }

    public C04180Jo(Context context, Looper looper, C10120dj r12, C17610rh r13, C17620ri r14, AnonymousClass0TT r15) {
        super(context, looper, r13, r14, r15, 68);
        AnonymousClass0WS r1 = new AnonymousClass0WS(r12 == null ? C10120dj.A02 : r12);
        r1.A00 = C06920Vp.A00();
        this.A00 = new C10120dj(r1);
    }

    public final Bundle A03() {
        return this.A00.A00();
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (!(queryLocalInterface instanceof AnonymousClass0Lb)) {
            return new AnonymousClass0Lb(iBinder);
        }
        return queryLocalInterface;
    }
}

package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.8BV  reason: invalid class name */
public final class AnonymousClass8BV extends C04270Jz {
    public final String A07() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    public final String A08() {
        return "com.google.android.gms.auth.blockstore.service.START";
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

    public AnonymousClass8BV(Context context, Looper looper, C17080qg r10, C16810q8 r11, AnonymousClass0TT r12) {
        super(context, looper, r10, r11, r12, 258);
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        if (!(queryLocalInterface instanceof C170238Cq)) {
            return new C170238Cq(iBinder);
        }
        return queryLocalInterface;
    }

    public final C04520Ky[] A0F() {
        return C114115gf.A06;
    }
}

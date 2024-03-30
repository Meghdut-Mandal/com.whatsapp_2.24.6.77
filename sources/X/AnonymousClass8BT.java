package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.8BT  reason: invalid class name */
public final class AnonymousClass8BT extends C04270Jz {
    public final String A07() {
        return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
    }

    public final String A08() {
        return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final int BEG() {
        return 12451000;
    }

    public AnonymousClass8BT(Context context, Looper looper, C17080qg r10, C16810q8 r11, AnonymousClass0TT r12) {
        super(context, looper, r10, r11, r12, 69);
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (!(queryLocalInterface instanceof C170418Di)) {
            return new C170418Di(iBinder);
        }
        return queryLocalInterface;
    }
}

package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.8BU  reason: invalid class name */
public final class AnonymousClass8BU extends C04270Jz {
    public final Context A00;

    public final String A07() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    public final String A08() {
        return "com.google.android.gms.safetynet.service.START";
    }

    public final boolean A0D() {
        return true;
    }

    public final int BEG() {
        return 12200000;
    }

    public AnonymousClass8BU(Context context, Looper looper, C17610rh r10, C17620ri r11, AnonymousClass0TT r12) {
        super(context, looper, r10, r11, r12, 45);
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (!(queryLocalInterface instanceof C170438Dk)) {
            return new C170438Dk(iBinder);
        }
        return queryLocalInterface;
    }
}

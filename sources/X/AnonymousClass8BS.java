package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.8BS  reason: invalid class name */
public final class AnonymousClass8BS extends C04270Jz {
    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return !(queryLocalInterface instanceof C23093B4i) ? new C204479q4(iBinder) : queryLocalInterface;
    }

    public final String A07() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    public final String A08() {
        return "com.google.android.gms.clearcut.service.START";
    }

    public final int BEG() {
        return 11925000;
    }

    public AnonymousClass8BS(Context context, Looper looper, C17610rh r10, C17620ri r11, AnonymousClass0TT r12) {
        super(context, looper, r10, r11, r12, 40);
    }
}

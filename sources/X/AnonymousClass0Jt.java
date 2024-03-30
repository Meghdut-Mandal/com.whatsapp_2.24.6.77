package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.0Jt  reason: invalid class name */
public final class AnonymousClass0Jt extends C04270Jz {
    public final C10080df A00;

    public final String A07() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String A08() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean A0E() {
        return true;
    }

    public final int BEG() {
        return 203400000;
    }

    public AnonymousClass0Jt(Context context, Looper looper, C17080qg r10, C16810q8 r11, AnonymousClass0TT r12, C10080df r13) {
        super(context, looper, r10, r11, r12, 270);
        this.A00 = r13;
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (!(queryLocalInterface instanceof AnonymousClass0MD)) {
            return new AnonymousClass0MD(iBinder);
        }
        return queryLocalInterface;
    }

    public final Bundle A03() {
        return AnonymousClass001.A07();
    }

    public final C04520Ky[] A0F() {
        return C05910Ro.A01;
    }
}

package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.3WF  reason: invalid class name */
public final class AnonymousClass3WF implements ServiceConnection {
    public final AnonymousClass37I A00;
    public final /* synthetic */ C64593Op A01;

    public AnonymousClass3WF(C64593Op r1, AnonymousClass37I r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGetInstallReferrerService r1;
        AnonymousClass3LL.A00("Install Referrer service connected.");
        C64593Op r2 = this.A01;
        if (iBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                r1 = (IGetInstallReferrerService) queryLocalInterface;
            } else {
                r1 = new AnonymousClass3WZ(iBinder);
            }
        }
        r2.A02 = r1;
        r2.A00 = 2;
        AnonymousClass37I r0 = this.A00;
        C80313vC.A01(r0.A02, r0.A00, r0.A01, 21);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        AnonymousClass3LL.A01("Install Referrer service disconnected.");
        C64593Op r1 = this.A01;
        r1.A02 = null;
        r1.A00 = 0;
    }
}

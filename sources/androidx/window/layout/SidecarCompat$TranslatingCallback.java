package androidx.window.layout;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass93T;
import X.AnonymousClass9V8;
import X.C202089l1;
import X.C208139xi;
import X.C22851Ax0;
import X.C36321k7;
import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Iterator;

public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {
    public final /* synthetic */ C208139xi A00;

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface A01;
        AnonymousClass00C.A0D(sidecarDeviceState, 0);
        C208139xi r5 = this.A00;
        Iterator A0z = AnonymousClass000.A0z(r5.A04);
        while (A0z.hasNext()) {
            Activity activity = (Activity) A0z.next();
            IBinder A002 = AnonymousClass93T.A00(activity);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            if (!(A002 == null || (A01 = r5.A01()) == null)) {
                sidecarWindowLayoutInfo = A01.getWindowLayoutInfo(A002);
            }
            C22851Ax0 ax0 = r5.A00;
            if (ax0 != null) {
                ax0.Bkk(activity, r5.A01.A01(sidecarDeviceState, sidecarWindowLayoutInfo));
            }
        }
    }

    public SidecarCompat$TranslatingCallback(C208139xi r1) {
        this.A00 = r1;
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        SidecarDeviceState sidecarDeviceState;
        C36321k7.A0w(iBinder, sidecarWindowLayoutInfo);
        C208139xi r3 = this.A00;
        Activity activity = (Activity) r3.A04.get(iBinder);
        if (activity == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        C202089l1 r1 = r3.A01;
        SidecarInterface A01 = r3.A01();
        if (A01 == null || (sidecarDeviceState = A01.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        AnonymousClass9V8 A012 = r1.A01(sidecarDeviceState, sidecarWindowLayoutInfo);
        C22851Ax0 ax0 = r3.A00;
        if (ax0 != null) {
            ax0.Bkk(activity, A012);
        }
    }
}

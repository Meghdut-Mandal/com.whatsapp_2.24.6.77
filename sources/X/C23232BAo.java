package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import org.npci.upi.security.services.CLRemoteService;

/* renamed from: X.BAo  reason: case insensitive filesystem */
public class C23232BAo implements ServiceConnection {
    public Object A00;
    public final int A01;

    public C23232BAo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C204399pw r1;
        C204419py r12;
        CLRemoteService r13;
        if (this.A01 != 0) {
            C197959cf r2 = (C197959cf) this.A00;
            if (iBinder == null) {
                r13 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.npci.upi.security.services.CLRemoteService");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof CLRemoteService)) {
                    r13 = new AnonymousClass785(iBinder);
                } else {
                    r13 = (CLRemoteService) queryLocalInterface;
                }
            }
            r2.A01 = r13;
            AnonymousClass9FB r0 = r2.A00;
            C36341k9.A0H().post(new AVb(r0.A00, C197959cf.A04, 26));
            Log.d("Remote Service", "Service Connected");
            return;
        }
        AnonymousClass00C.A0D(iBinder, 1);
        AnonymousClass6YR.A06("lam:LinkedAppManager", "onServiceConnected: IPC server IAppLinkService is connected");
        C203689oX r3 = (C203689oX) this.A00;
        boolean z = r3.A0C;
        if (z) {
            IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.facebook.wearable.applinks.IAppLinkServiceV2");
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C204419py)) {
                r12 = new C204419py(iBinder);
            } else {
                r12 = (C204419py) queryLocalInterface2;
            }
            r3.A01 = r12;
        } else {
            IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.facebook.wearable.applinks.IAppLinkService");
            if (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof C204399pw)) {
                r1 = new C204399pw(iBinder);
            } else {
                r1 = (C204399pw) queryLocalInterface3;
            }
            r3.A00 = r1;
        }
        C203689oX.A04(r3);
        if (z) {
            C203689oX.A09(new C22079AgQ(r3));
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.A01 != 0) {
            C197959cf r1 = (C197959cf) this.A00;
            r1.A01 = null;
            r1.A00.A00.A02.A0E("payments/indiaupi", "CL service disconnected", true);
            com.whatsapp.util.Log.e("CLServices serviceDisconnected");
            Log.d("Remote Service", "Service Disconnected");
            return;
        }
        AnonymousClass6YR.A09("lam:LinkedAppManager", "onServiceDisconnected IPC server IAppLinkService has disconnected", (Throwable) null);
        C203689oX.A05((C203689oX) this.A00);
    }
}

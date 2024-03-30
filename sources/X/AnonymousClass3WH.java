package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.whatsapp.util.Log;

/* renamed from: X.3WH  reason: invalid class name */
public class AnonymousClass3WH implements ServiceConnection {
    public final String A00;
    public final String A01 = "com.facebook.stella";
    public final boolean A02;
    public final /* synthetic */ C64423Nx A03;

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public AnonymousClass3WH(C64423Nx r2, String str, boolean z) {
        this.A03 = r2;
        this.A00 = str;
        this.A02 = z;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C64423Nx r2 = this.A03;
        try {
            if (r2.A02.A01(componentName.getPackageName()).A03 && "com.facebook.stella".equals(componentName.getPackageName())) {
                r2.A05.execute(new C80293vA(this, iBinder, 22));
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.e("CallbackServiceProxy/service component mismatch.");
        r2.A00.A00.unbindService(this);
    }
}

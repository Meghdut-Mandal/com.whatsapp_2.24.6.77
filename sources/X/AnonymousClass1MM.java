package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1MM  reason: invalid class name */
public class AnonymousClass1MM {
    public final Map A00 = new HashMap();
    public final Set A01 = new HashSet();
    public final Handler A02 = new Handler(Looper.getMainLooper());

    public void A02(AnonymousClass5K8 r4) {
        synchronized (this) {
            Class<?> cls = r4.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("FgServiceManager register:");
            sb.append(cls);
            Log.i(sb.toString());
            this.A00.put(cls, r4);
        }
        A00();
    }

    private void A00() {
        this.A02.post(new C35731jA((Object) this, 37));
    }

    public void A01(Context context, Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("FgServiceManager/stopService ");
        sb.append(cls);
        Log.i(sb.toString());
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A01.add(cls);
            }
            A00();
            return;
        }
        context.stopService(new Intent(context, cls));
    }

    public boolean A03(Context context, Intent intent, Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("FgServiceManager/startService ");
        sb.append(cls);
        Log.i(sb.toString());
        intent.setClass(context, cls);
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A01.remove(cls);
            }
        }
        return C111795cr.A01(context, intent);
    }
}

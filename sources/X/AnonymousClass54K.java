package X;

import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.HashSet;
import org.chromium.net.CronetEngine;

/* renamed from: X.54K  reason: invalid class name */
public final class AnonymousClass54K extends AnonymousClass1BY {
    public synchronized CronetEngine A00() {
        synchronized (AnonymousClass54K.class) {
            try {
                CronetEngine.Builder builder = new CronetEngine.Builder(this.A00.A00);
                String str = AnonymousClass6JD.A0N;
                HashSet A00 = C183248qS.A00();
                Calendar instance = Calendar.getInstance();
                instance.add(13, Integer.MAX_VALUE);
                builder.addPublicKeyPins(str, A00, true, instance.getTime());
                builder.enableHttp2(true);
                builder.enableHttpCache(0, 0);
                AnonymousClass1BY.A01 = builder.build();
            } catch (Exception e) {
                Log.e("CronetEngineProvider/buildCronetEngine cronet engine building failed", e);
            }
        }
        return null;
    }

    public AnonymousClass54K(C19630wG r1) {
        super(r1);
    }
}

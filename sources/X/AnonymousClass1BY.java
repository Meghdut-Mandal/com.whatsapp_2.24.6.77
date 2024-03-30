package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* renamed from: X.1BY  reason: invalid class name */
public abstract class AnonymousClass1BY {
    public static volatile CronetEngine A01;
    public final C19630wG A00;

    public CronetEngine A00() {
        AnonymousClass1BZ r4 = (AnonymousClass1BZ) this;
        synchronized (AnonymousClass1BZ.class) {
            try {
                Log.i("QUICCronetEngineProvidertry to build cronetEngine");
                Context context = r4.A00.A00;
                CronetEngine.Builder builder = new CronetEngine.Builder(context);
                File cacheDir = context.getCacheDir();
                StringBuilder sb = new StringBuilder();
                sb.append("http/cronet/");
                sb.append("h1");
                File file = new File(cacheDir, sb.toString());
                if (!file.exists()) {
                    file.mkdirs();
                }
                builder.setStoragePath(file.getPath());
                String str = AnonymousClass6JD.A0Z;
                HashSet A002 = C183248qS.A00();
                Calendar instance = Calendar.getInstance();
                instance.add(13, Integer.MAX_VALUE);
                builder.addPublicKeyPins(str, A002, true, instance.getTime());
                builder.enableHttp2(false);
                builder.enableQuic(true);
                builder.enableHttpCache(3, 51200);
                Set<String> set = C56192vt.A00;
                if (!set.isEmpty()) {
                    for (String addQuicHint : set) {
                        builder.addQuicHint(addQuicHint, 443, 443);
                    }
                }
                A01 = builder.build();
            } catch (Throwable th) {
                Log.e("QUICCronetEngineProvider/buildCronetEngine cronet engine building failed", th);
                if (C20800yB.A01(C21000yV.A02, r4.A01, 5478)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("cronet engine building failed\n");
                    sb2.append(th.getMessage());
                    r4.A00.A0D("QUICCronetEngineProvider", sb2.toString(), th);
                }
            }
        }
        return null;
    }

    public AnonymousClass1BY(C19630wG r1) {
        this.A00 = r1;
    }
}

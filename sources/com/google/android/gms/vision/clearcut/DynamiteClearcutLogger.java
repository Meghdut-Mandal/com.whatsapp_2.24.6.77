package com.google.android.gms.vision.clearcut;

import X.AnonymousClass8ER;
import X.C192939Jf;
import X.C81333wq;
import X.C90524aI;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DynamiteClearcutLogger {
    public static final ExecutorService zza;
    public C192939Jf zzb = new C192939Jf();
    public VisionClearcutLogger zzc;

    public final void zza(int i, AnonymousClass8ER r11) {
        boolean z;
        if (i == 3) {
            C192939Jf r8 = this.zzb;
            synchronized (r8.A02) {
                long currentTimeMillis = System.currentTimeMillis();
                if (r8.A00 + r8.A01 > currentTimeMillis) {
                    z = false;
                } else {
                    r8.A00 = currentTimeMillis;
                    z = true;
                }
            }
            if (!z) {
                Object[] A0w = C90524aI.A0w();
                if (Log.isLoggable("Vision", 2)) {
                    Log.v("Vision", String.format("Skipping image analysis log due to rate limiting", A0w));
                    return;
                }
                return;
            }
        }
        zza.execute(new C81333wq(r11, i, 6, this));
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }
}

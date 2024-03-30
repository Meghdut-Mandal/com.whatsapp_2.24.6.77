package com.facebook.common.jniexecutors;

import X.AnonymousClass001;
import X.AnonymousClass6YR;
import X.AnonymousClass84E;
import X.AnonymousClass9GU;
import X.C159017ie;
import X.C198149cz;
import android.util.Log;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;

public class PooledNativeRunnable extends NativeRunnable {
    public static final C198149cz sPool;

    public PooledNativeRunnable() {
        super((HybridData) null);
    }

    static {
        AnonymousClass9GU r0 = new AnonymousClass9GU(AwakeTimeSinceBootClock.INSTANCE);
        AnonymousClass84E r2 = new AnonymousClass84E();
        r0.A00 = r2;
        C159017ie r1 = r0.A01;
        if (r1 != null) {
            sPool = new C198149cz(r2, r1);
            return;
        }
        throw AnonymousClass001.A08("Must add a clock to the object pool builder");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.common.jniexecutors.PooledNativeRunnable allocate(com.facebook.jni.HybridData r5) {
        /*
            X.9cz r4 = sPool
            monitor-enter(r4)
            int r0 = r4.A00     // Catch:{ all -> 0x0025 }
            if (r0 <= 0) goto L_0x0019
            int r3 = r0 + -1
            r4.A00 = r3     // Catch:{ all -> 0x0025 }
            java.lang.Object[] r1 = r4.A02     // Catch:{ all -> 0x0025 }
            r2 = r1[r3]     // Catch:{ all -> 0x0025 }
            r0 = 0
            r1[r3] = r0     // Catch:{ all -> 0x0025 }
        L_0x0012:
            r1 = r2
            com.facebook.common.jniexecutors.NativeRunnable r1 = (com.facebook.common.jniexecutors.NativeRunnable) r1     // Catch:{ all -> 0x0025 }
            r0 = 0
            r1.mNativeExecutor = r0     // Catch:{ all -> 0x0025 }
            goto L_0x001f
        L_0x0019:
            com.facebook.common.jniexecutors.PooledNativeRunnable r2 = new com.facebook.common.jniexecutors.PooledNativeRunnable     // Catch:{ all -> 0x0025 }
            r2.<init>()     // Catch:{ all -> 0x0025 }
            goto L_0x0012
        L_0x001f:
            monitor-exit(r4)
            com.facebook.common.jniexecutors.PooledNativeRunnable r2 = (com.facebook.common.jniexecutors.PooledNativeRunnable) r2
            r2.mHybridData = r5
            return r2
        L_0x0025:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.jniexecutors.PooledNativeRunnable.allocate(com.facebook.jni.HybridData):com.facebook.common.jniexecutors.PooledNativeRunnable");
    }

    public void run() {
        try {
            super.run();
        } catch (Exception e) {
            Log.e("PooledNativeRunnable", "run crashed", e);
        }
        C198149cz r3 = sPool;
        synchronized (r3) {
            long now = r3.A07.now();
            int i = r3.A00;
            int i2 = r3.A03;
            if (i < i2 * 2) {
                r3.A01 = now;
            }
            if (now - r3.A01 > 60000) {
                AnonymousClass6YR.A00(C198149cz.class, "ObjectPool.checkUsage is compacting the pool.");
                int length = r3.A02.length;
                int max = Math.max(length - i2, r3.A05);
                if (max != length) {
                    C198149cz.A00(r3, max);
                }
            }
            this.mHybridData = null;
            int i3 = r3.A00;
            int i4 = r3.A04;
            if (i3 < i4) {
                int i5 = i3 + 1;
                int length2 = r3.A02.length;
                if (i5 > length2) {
                    C198149cz.A00(r3, Math.min(i4, length2 + i2));
                }
                Object[] objArr = r3.A02;
                int i6 = r3.A00;
                r3.A00 = i6 + 1;
                objArr[i6] = this;
            }
        }
    }
}

package X;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9xk  reason: invalid class name and case insensitive filesystem */
public final class C208159xk implements C158927iT {
    public final C190969Ba A00;
    public final WindowLayoutComponent A01;
    public final Map A02 = C36431kI.A1G();
    public final Map A03 = C36431kI.A1G();
    public final Map A04 = C36431kI.A1G();
    public final ReentrantLock A05 = new ReentrantLock();

    public void BnE(Activity activity, AnonymousClass026 r16, Executor executor) {
        AnonymousClass00C.A0D(activity, 0);
        ReentrantLock reentrantLock = this.A05;
        reentrantLock.lock();
        try {
            Map map = this.A02;
            C207749wv r0 = (C207749wv) map.get(activity);
            AnonymousClass026 r2 = r16;
            if (r0 != null) {
                r0.A00(r2);
                this.A04.put(r2, activity);
            } else {
                C207749wv r6 = new C207749wv(activity);
                map.put(activity, r6);
                this.A04.put(r2, activity);
                r6.A00(r2);
                C190969Ba r3 = this.A00;
                WindowLayoutComponent windowLayoutComponent = this.A01;
                AX4 ax4 = new AX4(new C22305AkT(r6), C36441kJ.A1A(WindowLayoutInfo.class));
                ClassLoader classLoader = r3.A00;
                Object A0e = C165587tf.A0e(classLoader, "java.util.function.Consumer", ax4, new Class[1]);
                Class<?> cls = windowLayoutComponent.getClass();
                Class[] clsArr = new Class[2];
                clsArr[0] = Activity.class;
                Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
                AnonymousClass00C.A08(loadClass);
                AnonymousClass001.A0G(cls, loadClass, "addWindowLayoutInfoListener", clsArr, 1).invoke(windowLayoutComponent, C36431kI.A1a(activity, A0e, 2));
                Class<?> loadClass2 = classLoader.loadClass("java.util.function.Consumer");
                AnonymousClass00C.A08(loadClass2);
                this.A03.put(r6, new C208069xb(windowLayoutComponent, A0e, AnonymousClass001.A0G(cls, loadClass2, "removeWindowLayoutInfoListener", new Class[1], 0)));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BwL(X.AnonymousClass026 r10) {
        /*
            r9 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)
            java.util.concurrent.locks.ReentrantLock r6 = r9.A05
            r6.lock()
            java.util.Map r8 = r9.A04     // Catch:{ all -> 0x005c }
            java.lang.Object r7 = r8.get(r10)     // Catch:{ all -> 0x005c }
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0058
            java.util.Map r5 = r9.A02     // Catch:{ all -> 0x005c }
            java.lang.Object r2 = r5.get(r7)     // Catch:{ all -> 0x005c }
            X.9wv r2 = (X.C207749wv) r2     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0058
            java.util.concurrent.locks.ReentrantLock r1 = r2.A02     // Catch:{ all -> 0x005c }
            r1.lock()     // Catch:{ all -> 0x005c }
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x0053 }
            r0.remove(r10)     // Catch:{ all -> 0x0053 }
            r1.unlock()     // Catch:{ all -> 0x005c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0058
            java.util.Map r0 = r9.A03     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x005c }
            X.Ava r0 = (X.C22764Ava) r0     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x004c
            X.9xb r0 = (X.C208069xb) r0     // Catch:{ all -> 0x005c }
            java.lang.reflect.Method r4 = r0.A02     // Catch:{ all -> 0x005c }
            java.lang.Object r3 = r0.A01     // Catch:{ all -> 0x005c }
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x005c }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x005c }
            r4.invoke(r3, r2)     // Catch:{ all -> 0x005c }
        L_0x004c:
            r8.remove(r10)     // Catch:{ all -> 0x005c }
            r5.remove(r7)     // Catch:{ all -> 0x005c }
            goto L_0x0058
        L_0x0053:
            r0 = move-exception
            r1.unlock()     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x0058:
            r6.unlock()
            return
        L_0x005c:
            r0 = move-exception
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208159xk.BwL(X.026):void");
    }

    public C208159xk(C190969Ba r2, WindowLayoutComponent windowLayoutComponent) {
        this.A01 = windowLayoutComponent;
        this.A00 = r2;
    }
}

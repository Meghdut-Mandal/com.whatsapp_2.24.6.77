package X;

import android.content.Context;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.FileManager;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.Proxies;
import com.facebook.msys.mci.ProxyProvider;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.lang.reflect.Method;

/* renamed from: X.12u  reason: invalid class name and case insensitive filesystem */
public class C220812u {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass130 A04;
    public final AnonymousClass134 A05;
    public final C21520zN A06;
    public final C19770wU A07;
    public final C000100b A08;
    public final AnonymousClass13F A09;
    public final AnonymousClass13G A0A;
    public final C19700wN A0B;
    public final C21060yb A0C;
    public final C19970wo A0D;
    public final C21010yW A0E;
    public final AnonymousClass13E A0F;
    public final AnonymousClass13A A0G;

    public static synchronized void A00(Context context, C20050ww r11, C21080yd r12, C20020wt r13, C19770wU r14, C220812u r15) {
        NotificationCenter notificationCenter;
        synchronized (r15) {
            if (!r15.A03) {
                AnonymousClass13G r3 = r15.A0A;
                NotificationCenter notificationCenter2 = new NotificationCenter();
                synchronized (r3) {
                    try {
                        C18740tg.A06(notificationCenter2);
                        r3.A00 = notificationCenter2;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                C20020wt r8 = r13;
                String A022 = r13.A02();
                synchronized (r3) {
                    notificationCenter = r3.A00;
                    C18740tg.A06(notificationCenter);
                }
                C20050ww r4 = r11;
                NetworkSession networkSession = new NetworkSession(A022, notificationCenter, new C140176l9(r4, r15.A06, r15.A0F, r12, r8, r14, context.getCacheDir()));
                AnonymousClass13F r1 = r15.A09;
                synchronized (r1) {
                    try {
                        C18740tg.A06(networkSession);
                        r1.A00 = networkSession;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                r15.A03 = true;
            }
        }
    }

    public synchronized void A01() {
        if (this.A01) {
            C000100b r0 = this.A08;
            JniBridge.jvidispatchI(0);
            JniBridge.jvidispatchIO(0, (NativeHolder) ((JniBridge) r0).wajContext.get());
            this.A01 = false;
        }
    }

    public synchronized void A02(Context context) {
        IllegalStateException th;
        if (!this.A02) {
            Log.i("WaMsysSetup/bootstrap");
            C000100b r5 = this.A08;
            if (2886274677L == JniBridge.jvidispatchI(1)) {
                synchronized (com.facebook.msys.mci.Log.class) {
                    try {
                        Method method = C000600g.A03;
                        AnonymousClass00h.A01("registerLogger");
                        if (!com.facebook.msys.mci.Log.sRegistered) {
                            com.facebook.msys.mci.Log.registerLoggerNative(823, 5, false, 5);
                            com.facebook.msys.mci.Log.setLogLevel(4);
                            com.facebook.msys.mci.Log.sRegistered = true;
                        }
                        AnonymousClass00h.A00();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                Proxies.configure(new ProxyProvider(new AnonymousClass14N(new C36261k1(this, 0), new C36261k1(this, 1))));
                Execution.initialize();
                try {
                    FileManager.initialize(context.getCacheDir());
                    NativeHolder nativeHolder = (NativeHolder) ((JniBridge) r5).wajContext.getAndSet((NativeHolder) JniBridge.jvidispatchO(0));
                    if (nativeHolder != null) {
                        nativeHolder.release();
                    }
                    this.A02 = true;
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("WaMsysSetup/mismatch 2886274677 ");
                sb.append(JniBridge.jvidispatchI(1));
                th = new IllegalStateException(sb.toString());
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0092, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A03(X.C20050ww r22, X.C19630wG r23, X.C19420v0 r24, X.C18820ts r25, X.C21080yd r26, X.C20020wt r27, X.C19770wU r28, java.lang.String r29) {
        /*
            r21 = this;
            r13 = r21
            monitor-enter(r13)
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x009e }
            boolean r0 = r13.A01     // Catch:{ all -> 0x009e }
            r3 = 1
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg/already bootstrapped, skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x009e }
            goto L_0x0091
        L_0x0013:
            r0 = r23
            android.content.Context r8 = r0.A00     // Catch:{ all -> 0x009e }
            r13.A02(r8)     // Catch:{ all -> 0x009e }
            r9 = r22
            r10 = r26
            r11 = r27
            r12 = r28
            A00(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x009e }
            X.00b r6 = r13.A08     // Catch:{ all -> 0x009e }
            X.13F r0 = r13.A09     // Catch:{ all -> 0x009e }
            com.facebook.msys.mci.NetworkSession r1 = r0.A00()     // Catch:{ all -> 0x009e }
            com.whatsapp.wamsys.JniBridge r6 = (com.whatsapp.wamsys.JniBridge) r6     // Catch:{ all -> 0x009e }
            java.util.concurrent.atomic.AtomicReference r0 = r6.wajContext     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x009e }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ all -> 0x009e }
            r7 = 0
            long r4 = com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r7, r1, r0)     // Catch:{ all -> 0x009e }
            r1 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            java.lang.String r16 = r25.A06()     // Catch:{ all -> 0x009e }
            java.lang.String r17 = r25.A05()     // Catch:{ all -> 0x009e }
            java.lang.String r19 = r24.A0e()     // Catch:{ all -> 0x009e }
            long r14 = (long) r7     // Catch:{ all -> 0x009e }
            java.util.concurrent.atomic.AtomicReference r0 = r6.wajContext     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x009e }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ all -> 0x009e }
            r18 = r29
            r20 = r0
            com.whatsapp.wamsys.JniBridge.jvidispatchIIOOOOO(r14, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x009e }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x009e }
            java.util.concurrent.atomic.AtomicReference r0 = r6.wajContext     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x009e }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x009e }
            r0 = 6
            com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r0, r8, r1)     // Catch:{ all -> 0x009e }
            X.135 r2 = new X.135     // Catch:{ all -> 0x009e }
            r2.<init>()     // Catch:{ all -> 0x009e }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x009e }
            long r0 = r0 - r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x009e }
            r2.A00 = r0     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "sha-prepare-dispatch"
            r2.A02 = r0     // Catch:{ all -> 0x009e }
            X.0yW r0 = r13.A0E     // Catch:{ all -> 0x009e }
            r0.Bly(r2)     // Catch:{ all -> 0x009e }
            com.facebook.msys.mci.JsonSerialization.initialize()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x009e }
            r13.A01 = r3     // Catch:{ all -> 0x009e }
        L_0x0091:
            monitor-exit(r13)
            return r3
        L_0x0093:
            X.0wN r2 = r13.A0B     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "WCRManager init failure"
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg/failed to initialize WCRManager"
            r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x009e }
            monitor-exit(r13)
            return r7
        L_0x009e:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220812u.A03(X.0ww, X.0wG, X.0v0, X.0ts, X.0yd, X.0wt, X.0wU, java.lang.String):boolean");
    }

    public C220812u(AnonymousClass130 r1, C19700wN r2, C21060yb r3, C19970wo r4, AnonymousClass134 r5, C21520zN r6, C21010yW r7, AnonymousClass13E r8, C19770wU r9, AnonymousClass13A r10, C000100b r11, AnonymousClass13F r12, AnonymousClass13G r13) {
        this.A0D = r4;
        this.A0B = r2;
        this.A07 = r9;
        this.A08 = r11;
        this.A0E = r7;
        this.A04 = r1;
        this.A0F = r8;
        this.A0C = r3;
        this.A0G = r10;
        this.A06 = r6;
        this.A05 = r5;
        this.A09 = r12;
        this.A0A = r13;
    }
}

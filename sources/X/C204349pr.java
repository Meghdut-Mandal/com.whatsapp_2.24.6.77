package X;

import android.os.Handler;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;

/* renamed from: X.9pr  reason: invalid class name and case insensitive filesystem */
public class C204349pr implements Handler.Callback {
    public C20984A1y A00;
    public final Handler A01;
    public final SparseArray A02 = new SparseArray();
    public final AnonymousClass9VM A03;
    public final C198549dl A04;
    public final C201589jv A05;

    public static void A00(C20984A1y a1y, C204349pr r10) {
        C20984A1y a1y2 = r10.A00;
        if (a1y2 != a1y) {
            if (a1y2 != null) {
                r10.A05.A04(a1y2);
            }
            r10.A00 = a1y;
            if (a1y != null) {
                r10.A05.A03(a1y);
            }
            C20984A1y a1y3 = r10.A00;
            if (a1y3 != null) {
                SparseArray sparseArray = r10.A02;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    Object valueAt = sparseArray.valueAt(i);
                    Objects.requireNonNull(valueAt);
                    AnonymousClass9MK r0 = (AnonymousClass9MK) valueAt;
                    a1y3.A04(keyAt, r0.A01, r0.A00, r0.A03, r0.A02, r0.A04);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:41|42|43|44|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r16) {
        /*
            r15 = this;
            r3 = r16
            int r2 = r3.what
            r0 = 1
            if (r2 == r0) goto L_0x0102
            r1 = 2
            if (r2 == r1) goto L_0x00c9
            r1 = 3
            if (r2 == r1) goto L_0x0019
            r0 = 4
            if (r2 != r0) goto L_0x0017
            java.lang.Object r0 = r3.obj
            X.A1y r0 = (X.C20984A1y) r0
            A00(r0, r15)
        L_0x0017:
            r0 = 0
            return r0
        L_0x0019:
            X.9VM r1 = r15.A03
            X.83a r4 = r1.A01
            X.B5r r5 = r4.A02
            if (r5 == 0) goto L_0x0054
            java.util.HashMap r8 = X.AnonymousClass001.A0J()
            java.util.LinkedHashMap r3 = X.C1690483a.A0B
            monitor-enter(r3)
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x01a1 }
            r3.remove(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "active_media_pipelines"
            java.util.Collection r1 = r3.values()     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01a1 }
            r8.put(r2, r1)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = "frame_render_noop_counter"
            int r1 = r4.A00
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r8.put(r2, r1)
            java.lang.String r6 = "media_pipeline_stop"
            java.lang.String r7 = "MediaGraphControllerImpl"
            int r1 = r15.hashCode()
            long r9 = (long) r1
            r5.BOu(r6, r7, r8, r9)
        L_0x0054:
            X.9pr r1 = r4.A04
            X.9jv r1 = r1.A05
            X.9pp r1 = r1.A07
            android.os.Handler r1 = r1.A01
            if (r1 == 0) goto L_0x0061
            r1.removeMessages(r0, r4)
        L_0x0061:
            X.9jv r0 = r15.A05
            java.lang.Object r5 = r0.A09
            monitor-enter(r5)
            X.C201589jv.A00(r0)     // Catch:{ all -> 0x01aa }
            X.9VB r0 = r0.A08     // Catch:{ all -> 0x01aa }
            java.util.List r3 = r0.A00     // Catch:{ all -> 0x01aa }
            r0.A00()     // Catch:{ all -> 0x01aa }
            int r2 = r3.size()     // Catch:{ all -> 0x01aa }
            r1 = 0
        L_0x0075:
            if (r1 >= r2) goto L_0x0083
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x01aa }
            X.B2n r0 = (X.C23064B2n) r0     // Catch:{ all -> 0x01aa }
            r0.release()     // Catch:{ all -> 0x01aa }
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0083:
            monitor-exit(r5)     // Catch:{ all -> 0x01aa }
            r1 = 0
            r15.A00 = r1
            java.util.concurrent.CountDownLatch r0 = r4.A0A
            r4.A0A = r1
            if (r0 == 0) goto L_0x0090
            r0.countDown()
        L_0x0090:
            X.94Q r0 = X.B4H.A0E
            X.B3B r1 = r4.A00
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r2 = r1.BA0(r0)
            if (r2 == 0) goto L_0x0017
            X.94T r0 = X.C23111B5q.A00
            java.util.Objects.requireNonNull(r1)
            r1.B9z(r0)
            X.9TQ r3 = X.AnonymousClass88X.A00()
            monitor-enter(r3)
            java.util.HashMap r1 = r3.A00     // Catch:{ all -> 0x01a7 }
            monitor-enter(r1)     // Catch:{ all -> 0x01a7 }
            java.lang.Object r0 = r1.remove(r2)     // Catch:{ all -> 0x01a4 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x01a4 }
            monitor-exit(r1)     // Catch:{ all -> 0x01a4 }
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r2 = r0.first     // Catch:{ all -> 0x01a7 }
            android.os.HandlerThread r2 = (android.os.HandlerThread) r2     // Catch:{ all -> 0x01a7 }
            r2.quitSafely()     // Catch:{ all -> 0x01a7 }
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.join(r0)     // Catch:{ InterruptedException -> 0x00c3 }
            goto L_0x00c6
        L_0x00c3:
            X.C90484aE.A0z()     // Catch:{ all -> 0x01a7 }
        L_0x00c6:
            monitor-exit(r3)
            goto L_0x0017
        L_0x00c9:
            X.9VM r0 = r15.A03
            X.83a r2 = r0.A01
            r0 = 0
            r2.A00 = r0
            X.B5r r3 = r2.A02
            if (r3 == 0) goto L_0x00e1
            int r0 = r15.hashCode()
            long r7 = (long) r0
            r6 = 0
            java.lang.String r4 = "media_pipeline_pause"
            java.lang.String r5 = "MediaGraphControllerImpl"
            r3.BOu(r4, r5, r6, r7)
        L_0x00e1:
            X.9pr r0 = r2.A04
            X.9jv r0 = r0.A05
            X.9pp r0 = r0.A07
            android.os.Handler r1 = r0.A01
            if (r1 == 0) goto L_0x00f3
            r0 = 1
            r1.removeMessages(r0, r2)
            r0 = 3
            r1.sendEmptyMessage(r0)
        L_0x00f3:
            X.9jv r2 = r15.A05
            java.lang.Object r1 = r2.A09
            monitor-enter(r1)
            boolean r0 = r2.A0B     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x00ff
            X.C201589jv.A00(r2)     // Catch:{ all -> 0x01ad }
        L_0x00ff:
            monitor-exit(r1)     // Catch:{ all -> 0x01ad }
            goto L_0x0017
        L_0x0102:
            X.9jv r14 = r15.A05
            java.lang.Object r3 = r14.A09
            monitor-enter(r3)
            android.os.Looper r1 = r14.A0D     // Catch:{ all -> 0x01bb }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x01bb }
            X.9ST r1 = r14.A0E     // Catch:{ all -> 0x01bb }
            if (r1 != 0) goto L_0x0189
            java.util.Map r4 = X.C201589jv.A0G     // Catch:{ all -> 0x01bb }
            android.os.Handler r5 = r14.A00     // Catch:{ all -> 0x01bb }
            android.os.Looper r1 = r5.getLooper()     // Catch:{ all -> 0x01bb }
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x01bb }
            X.9jv r1 = (X.C201589jv) r1     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x0123
            X.C201589jv.A00(r1)     // Catch:{ all -> 0x01bb }
        L_0x0123:
            android.os.Looper r1 = r14.A0D     // Catch:{ all -> 0x01bb }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x01bb }
            X.9ST r1 = r14.A0E     // Catch:{ all -> 0x01bb }
            if (r1 != 0) goto L_0x0189
            r2 = 0
            android.content.Context r10 = r14.A02     // Catch:{ all -> 0x017a }
            X.9bn r13 = r14.A06     // Catch:{ all -> 0x017a }
            X.6Xg r11 = r14.A04     // Catch:{ all -> 0x017a }
            X.6Xg r12 = r14.A05     // Catch:{ all -> 0x017a }
            X.C36321k7.A0v(r10, r0, r13)     // Catch:{ all -> 0x017a }
            X.9ST r9 = new X.9ST     // Catch:{ all -> 0x017a }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x017a }
            r14.A0E = r9     // Catch:{ all -> 0x017a }
            X.9VB r0 = r14.A08     // Catch:{ all -> 0x017a }
            java.util.List r8 = r0.A00     // Catch:{ all -> 0x017a }
            int r7 = r8.size()     // Catch:{ all -> 0x017a }
            r6 = 0
        L_0x0148:
            if (r6 >= r7) goto L_0x015d
            java.lang.Object r0 = r8.get(r6)     // Catch:{ all -> 0x017a }
            X.B2n r0 = (X.C23064B2n) r0     // Catch:{ all -> 0x017a }
            r0.B1T(r9)     // Catch:{ all -> 0x0154 }
            goto L_0x015a
        L_0x0154:
            r1 = move-exception
            java.lang.String r0 = "GlHostImpl.attachGlElement() failed."
            X.C201589jv.A01(r14, r0, r1)     // Catch:{ all -> 0x017a }
        L_0x015a:
            int r6 = r6 + 1
            goto L_0x0148
        L_0x015d:
            int r7 = r11.A01     // Catch:{ all -> 0x017a }
            boolean r0 = r14.A0A     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0180
            int r6 = r14.A01     // Catch:{ all -> 0x017a }
            if (r7 == r6) goto L_0x0180
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x017a }
            java.lang.String r0 = "Unsupported OpenGL version. Expected is "
            r1.append(r0)     // Catch:{ all -> 0x017a }
            r1.append(r6)     // Catch:{ all -> 0x017a }
            java.lang.String r0 = " but got "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r7)     // Catch:{ all -> 0x017a }
            throw r0     // Catch:{ all -> 0x017a }
        L_0x017a:
            r1 = move-exception
            java.lang.String r0 = "GlHostImpl.attachGlContext() failed."
            X.C201589jv.A01(r14, r0, r1)     // Catch:{ all -> 0x01b0 }
        L_0x0180:
            r14.A0F = r2     // Catch:{ all -> 0x01bb }
            android.os.Looper r0 = r5.getLooper()     // Catch:{ all -> 0x01bb }
            r4.put(r0, r14)     // Catch:{ all -> 0x01bb }
        L_0x0189:
            monitor-exit(r3)     // Catch:{ all -> 0x01bb }
            X.9VM r0 = r15.A03
            X.83a r0 = r0.A01
            X.B5r r1 = r0.A02
            if (r1 == 0) goto L_0x0017
            int r0 = r15.hashCode()
            long r5 = (long) r0
            r4 = 0
            java.lang.String r2 = "media_pipeline_resume"
            java.lang.String r3 = "MediaGraphControllerImpl"
            r1.BOu(r2, r3, r4, r5)
            goto L_0x0017
        L_0x01a1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01a1 }
            throw r0
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ all -> 0x01a7 }
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01aa }
            throw r0
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ad }
            throw r0
        L_0x01b0:
            r1 = move-exception
            r14.A0F = r2     // Catch:{ all -> 0x01bb }
            android.os.Looper r0 = r5.getLooper()     // Catch:{ all -> 0x01bb }
            r4.put(r0, r14)     // Catch:{ all -> 0x01bb }
            throw r1     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01bb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204349pr.handleMessage(android.os.Message):boolean");
    }

    public C204349pr(AnonymousClass9VM r12, C198549dl r13, C201589jv r14) {
        Handler handler = new Handler(r14.A00.getLooper(), this);
        this.A01 = handler;
        this.A05 = r14;
        this.A03 = r12;
        C1690483a r0 = r12.A01;
        C23112B5r b5r = r0.A02;
        if (b5r != null) {
            HashMap A0J = AnonymousClass001.A0J();
            LinkedHashMap linkedHashMap = C1690483a.A0B;
            synchronized (linkedHashMap) {
                String obj = r0.toString();
                String BGH = b5r.BGH();
                linkedHashMap.put(obj, BGH.isEmpty() ? "unknown" : BGH);
                A0J.put("active_media_pipelines", linkedHashMap.values().toString());
            }
            b5r.BOu("media_pipeline_start", "MediaGraphControllerImpl", A0J, (long) hashCode());
        }
        this.A04 = r13;
        handler.getLooper().getThread().setUncaughtExceptionHandler(new AX3(AnonymousClass001.A0F(this)));
    }
}

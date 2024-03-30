package X;

import java.util.concurrent.Callable;

/* renamed from: X.7qf  reason: invalid class name and case insensitive filesystem */
public class C163727qf implements Callable {
    public Object A00;
    public final int A01;

    public C163727qf(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x003b;
                case 2: goto L_0x00d1;
                case 3: goto L_0x0108;
                case 4: goto L_0x0111;
                case 5: goto L_0x004c;
                case 6: goto L_0x0054;
                case 7: goto L_0x0005;
                case 8: goto L_0x006f;
                case 9: goto L_0x00c8;
                case 10: goto L_0x0094;
                case 11: goto L_0x0005;
                case 12: goto L_0x0131;
                case 13: goto L_0x00a9;
                case 14: goto L_0x013e;
                case 15: goto L_0x0149;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A00
            X.70u r0 = (X.C1493370u) r0
            X.C1493370u.A06(r0)
        L_0x000c:
            r1 = 0
        L_0x000d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x0011:
            return r2
        L_0x0012:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.Object r0 = r7.A00
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r0 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r0
            java.util.Map r0 = r0.A04
            java.util.Iterator r3 = X.AnonymousClass000.A0z(r0)
        L_0x0020:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r3.next()
            X.5ry r0 = (X.C120725ry) r0
            X.0X5 r1 = r0.A00
            X.0Y4 r0 = new X.0Y4
            r0.<init>(r1)
            X.0X5 r0 = r0.A00()
            r2.add(r0)
            goto L_0x0020
        L_0x003b:
            java.lang.Object r1 = r7.A00
            X.5hJ r1 = (X.C114475hJ) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            androidx.work.impl.WorkDatabase r1 = r1.A00
            java.lang.String r0 = "next_alarm_manager_id"
            int r1 = X.C109475Xs.A00(r1, r0)
            goto L_0x000d
        L_0x004c:
            java.lang.Object r0 = r7.A00
            X.70u r0 = (X.C1493370u) r0
            r1 = 0
            r0.A0M = r1
            goto L_0x000d
        L_0x0054:
            java.lang.Object r1 = r7.A00
            X.70u r1 = (X.C1493370u) r1
            X.67n r2 = r1.A04     // Catch:{ RuntimeException -> 0x0156 }
            if (r2 != 0) goto L_0x0011
            X.67n r2 = new X.67n     // Catch:{ RuntimeException -> 0x0156 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0156 }
            int r0 = r2.A00     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 != 0) goto L_0x0153
            java.lang.String r0 = "voip/video/SurfaceTextureHolder/createSurfaceTexture, failed to generate gl texture"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x0156 }
            r2.A00()     // Catch:{ RuntimeException -> 0x0156 }
            goto L_0x0152
        L_0x006f:
            java.lang.Object r2 = r7.A00
            X.70u r2 = (X.C1493370u) r2
            X.67n r0 = r2.A04
            if (r0 == 0) goto L_0x000c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/ releasing surface texture holder for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r2.A0D
            X.C36321k7.A1N(r0, r1)
            X.67n r0 = r2.A04
            r0.A00()
            android.os.HandlerThread r0 = r2.A0B
            X.C18740tg.A03(r0)
            r0 = 0
            r2.A04 = r0
            goto L_0x000c
        L_0x0094:
            java.lang.Object r1 = r7.A00
            X.70u r1 = (X.C1493370u) r1
            boolean r0 = X.C1493370u.A09(r1)
            if (r0 != 0) goto L_0x00a1
            r1 = -6
            goto L_0x000d
        L_0x00a1:
            float[] r0 = X.C1493370u.A0N
            int r1 = X.C1493370u.A03(r1, r0)
            goto L_0x000d
        L_0x00a9:
            java.lang.Object r3 = r7.A00
            X.70u r3 = (X.C1493370u) r3
            android.os.HandlerThread r0 = r3.A0B
            X.C18740tg.A03(r0)
            r2 = 0
            int[] r1 = X.C131466Pd.A00     // Catch:{ Exception -> 0x00be }
            X.7ab r0 = new X.7ab     // Catch:{ Exception -> 0x00be }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00be }
            r3.A07 = r0     // Catch:{ Exception -> 0x00be }
            goto L_0x000c
        L_0x00be:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.C1493370u.A05(r3)
            r1 = -5
            goto L_0x000d
        L_0x00c8:
            java.lang.Object r0 = r7.A00
            X.70u r0 = (X.C1493370u) r0
            X.C1493370u.A05(r0)
            goto L_0x000c
        L_0x00d1:
            java.lang.Object r1 = r7.A00
            X.71y r1 = (X.C1495971y) r1
            monitor-enter(r1)
            java.io.Writer r0 = r1.A03     // Catch:{ all -> 0x0105 }
            r2 = 0
            if (r0 != 0) goto L_0x00dd
        L_0x00db:
            monitor-exit(r1)     // Catch:{ all -> 0x0105 }
            goto L_0x0104
        L_0x00dd:
            long r5 = r1.A02     // Catch:{ all -> 0x0105 }
            long r3 = r1.A01     // Catch:{ all -> 0x0105 }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f7
            java.util.LinkedHashMap r0 = r1.A09     // Catch:{ all -> 0x0105 }
            java.util.Iterator r0 = X.C36371kC.A10(r0)     // Catch:{ all -> 0x0105 }
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = X.C90494aF.A0f(r0)     // Catch:{ all -> 0x0105 }
            r1.A07(r0)     // Catch:{ all -> 0x0105 }
            goto L_0x00dd
        L_0x00f7:
            boolean r0 = X.C1495971y.A06(r1)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00db
            X.C1495971y.A01(r1)     // Catch:{ all -> 0x0105 }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0105 }
            goto L_0x00db
        L_0x0104:
            return r2
        L_0x0105:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0105 }
            throw r0
        L_0x0108:
            java.lang.Object r0 = r7.A00
            X.4xO r0 = (X.C101344xO) r0
            java.lang.Object r2 = r0.A0F()
            return r2
        L_0x0111:
            java.lang.Object r1 = r7.A00
            X.71z r1 = (X.C1496071z) r1
            monitor-enter(r1)
            java.nio.charset.Charset r0 = X.C1496071z.A0E     // Catch:{ all -> 0x012e }
            java.io.Writer r0 = r1.A02     // Catch:{ all -> 0x012e }
            r2 = 0
            if (r0 == 0) goto L_0x012c
            X.C1496071z.A04(r1)     // Catch:{ all -> 0x012e }
            boolean r0 = X.C1496071z.A0A(r1)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x012c
            X.C1496071z.A05(r1)     // Catch:{ all -> 0x012e }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x012e }
        L_0x012c:
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return r2
        L_0x012e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            throw r0
        L_0x0131:
            java.lang.Object r0 = r7.A00
            X.70u r0 = (X.C1493370u) r0
            boolean r0 = X.C1493370u.A09(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x013e:
            java.lang.Object r0 = r7.A00
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r0 = (com.whatsapp.jobqueue.job.RotateSignedPreKeyJob) r0
            X.189 r0 = r0.A00
            X.5tq r2 = r0.A0G()
            return r2
        L_0x0149:
            java.lang.Object r0 = r7.A00
            X.5Qv r0 = (X.C107775Qv) r0
            java.lang.String r2 = r0.A00()
            return r2
        L_0x0152:
            r2 = 0
        L_0x0153:
            r1.A04 = r2     // Catch:{ RuntimeException -> 0x0156 }
            return r2
        L_0x0156:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163727qf.call():java.lang.Object");
    }
}

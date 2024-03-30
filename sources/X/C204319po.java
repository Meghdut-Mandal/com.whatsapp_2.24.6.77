package X;

import android.os.ConditionVariable;
import android.os.Handler;

/* renamed from: X.9po  reason: invalid class name and case insensitive filesystem */
public class C204319po implements Handler.Callback {
    public final ConditionVariable A00 = new ConditionVariable();
    public final Handler A01;
    public final C196119Xt A02;
    public final C204349pr A03;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0198 A[Catch:{ all -> 0x02e9, all -> 0x02fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b6 A[Catch:{ all -> 0x02e9, all -> 0x02fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e5 A[Catch:{ all -> 0x02e9, all -> 0x02fc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r22) {
        /*
            r21 = this;
            r0 = r22
            int r1 = r0.what
            r8 = 1
            r3 = r21
            if (r1 == r8) goto L_0x001d
            r0 = 2
            if (r1 != r0) goto L_0x033b
            java.lang.String r0 = "MediaGraphRendererSession.warmUp"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0333
        L_0x0013:
            r1 = move-exception
            android.os.ConditionVariable r0 = r3.A00
            r0.open()
            android.os.Trace.endSection()
            throw r1
        L_0x001d:
            java.lang.String r0 = "MediaGraphRendererSession.render"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x034f }
            X.9pr r2 = r3.A03     // Catch:{ all -> 0x034f }
            android.os.Handler r0 = r2.A01     // Catch:{ all -> 0x034f }
            android.os.Looper r1 = r0.getLooper()     // Catch:{ all -> 0x034f }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x034f }
            if (r1 != r0) goto L_0x033c
            X.9jv r0 = r2.A05     // Catch:{ all -> 0x034f }
            boolean r0 = r0.A05()     // Catch:{ all -> 0x034f }
            if (r0 != 0) goto L_0x004b
            X.9dl r1 = r2.A04     // Catch:{ all -> 0x034f }
            X.8zK r0 = X.C188278zK.A0k     // Catch:{ all -> 0x034f }
            r1.A00(r0)     // Catch:{ all -> 0x034f }
            X.9VM r0 = r2.A03     // Catch:{ all -> 0x034f }
            X.83a r1 = r0.A01     // Catch:{ all -> 0x034f }
            int r0 = r1.A00     // Catch:{ all -> 0x034f }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x034f }
            goto L_0x0338
        L_0x004b:
            X.9VM r0 = r2.A03     // Catch:{ all -> 0x034f }
            r20 = r0
            X.83a r9 = r0.A01     // Catch:{ all -> 0x034f }
            X.B5r r7 = r9.A02     // Catch:{ all -> 0x034f }
            if (r7 == 0) goto L_0x005c
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x034f }
            r7.Bn2(r0)     // Catch:{ all -> 0x034f }
        L_0x005c:
            java.lang.String r0 = "MediaGraphHost.mMediaGraph.render()"
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x0318 }
            X.A1y r6 = r2.A00     // Catch:{ Exception -> 0x0318 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ Exception -> 0x0318 }
            X.9Xt r10 = r3.A02     // Catch:{ Exception -> 0x0318 }
            X.9bE r1 = r10.A04     // Catch:{ Exception -> 0x0318 }
            r0 = 0
            android.util.SparseArray r1 = r1.A00     // Catch:{ Exception -> 0x0318 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = "GlProcessorGraph.render"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x02fc }
            r2 = 0
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x02fc }
            X.A1t r4 = (X.C20979A1t) r4     // Catch:{ all -> 0x02fc }
            if (r4 == 0) goto L_0x02ee
            java.lang.String r0 = "getInputData"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x02e9 }
            X.B0d r0 = r4.A05     // Catch:{ all -> 0x02e9 }
            if (r0 == 0) goto L_0x012f
            X.9NT r5 = r0.BC4()     // Catch:{ all -> 0x02e9 }
        L_0x008e:
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x02e9 }
            X.9jv r0 = r4.A01     // Catch:{ all -> 0x02e9 }
            if (r0 != 0) goto L_0x009e
            X.9dl r1 = r4.A04     // Catch:{ all -> 0x02e9 }
            X.8zK r0 = X.C188278zK.A05     // Catch:{ all -> 0x02e9 }
        L_0x0099:
            r1.A00(r0)     // Catch:{ all -> 0x02e9 }
            goto L_0x0191
        L_0x009e:
            X.9ST r0 = r4.A02     // Catch:{ all -> 0x02e9 }
            if (r0 != 0) goto L_0x00a7
            X.9dl r1 = r4.A04     // Catch:{ all -> 0x02e9 }
            X.8zK r0 = X.C188278zK.A08     // Catch:{ all -> 0x02e9 }
            goto L_0x0099
        L_0x00a7:
            X.9Wt r0 = r0.A06     // Catch:{ all -> 0x02e9 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x02e9 }
            if (r0 != 0) goto L_0x0191
            X.9jv r3 = r4.A01     // Catch:{ all -> 0x02e9 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x02e9 }
            X.9ST r2 = r4.A02     // Catch:{ all -> 0x02e9 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x02e9 }
            X.A1w r0 = r4.A03     // Catch:{ all -> 0x02e9 }
            if (r0 != 0) goto L_0x00d0
            X.9CW r0 = r4.A06     // Catch:{ all -> 0x02e9 }
            X.9dl r1 = r0.A00     // Catch:{ all -> 0x02e9 }
            X.A1w r0 = new X.A1w     // Catch:{ all -> 0x02e9 }
            r0.<init>(r1)     // Catch:{ all -> 0x02e9 }
            r4.A03 = r0     // Catch:{ all -> 0x02e9 }
            r0.BKM(r3)     // Catch:{ all -> 0x02e9 }
            X.A1w r0 = r4.A03     // Catch:{ all -> 0x02e9 }
            r0.B1T(r2)     // Catch:{ all -> 0x02e9 }
        L_0x00d0:
            X.A1w r3 = r4.A03     // Catch:{ all -> 0x02e9 }
            int r2 = r4.A00     // Catch:{ all -> 0x02e9 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x02e9 }
            if (r0 == 0) goto L_0x00f1
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x02e9 }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x02e9 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x02e9 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x02e9 }
            if (r1 != r0) goto L_0x00f1
            X.9dl r1 = r3.A04     // Catch:{ all -> 0x02e9 }
            X.8zK r0 = X.C188278zK.A01     // Catch:{ all -> 0x02e9 }
            goto L_0x0099
        L_0x00f1:
            X.9jv r0 = r3.A00     // Catch:{ all -> 0x02e9 }
            if (r0 != 0) goto L_0x00fa
            X.9dl r1 = r3.A04     // Catch:{ all -> 0x02e9 }
            X.8zK r0 = X.C188278zK.A05     // Catch:{ all -> 0x02e9 }
            goto L_0x0099
        L_0x00fa:
            X.9ST r0 = r3.A01     // Catch:{ all -> 0x02e9 }
            if (r0 != 0) goto L_0x0103
            X.9dl r1 = r3.A04     // Catch:{ all -> 0x02e9 }
            X.8zK r0 = X.C188278zK.A08     // Catch:{ all -> 0x02e9 }
            goto L_0x0099
        L_0x0103:
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x02e9 }
            X.9Wt r0 = r0.A06     // Catch:{ all -> 0x02e9 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x02e9 }
            if (r0 != 0) goto L_0x0191
            if (r5 == 0) goto L_0x0191
            if (r2 != 0) goto L_0x0119
            int r1 = r5.A00     // Catch:{ all -> 0x02e9 }
            if (r1 == 0) goto L_0x0191
            r0 = 3
            if (r1 == r0) goto L_0x0191
        L_0x0119:
            X.9jv r0 = r3.A00     // Catch:{ all -> 0x02e9 }
            r16 = r0
            java.util.Objects.requireNonNull(r16)     // Catch:{ all -> 0x02e9 }
            X.9ST r13 = r3.A01     // Catch:{ all -> 0x02e9 }
            java.util.Objects.requireNonNull(r13)     // Catch:{ all -> 0x02e9 }
            X.9Rm r0 = r5.A05     // Catch:{ all -> 0x02e9 }
            if (r0 != 0) goto L_0x0132
            X.9dl r1 = r3.A05     // Catch:{ all -> 0x02e9 }
            X.8zK r0 = X.C188278zK.A0m     // Catch:{ all -> 0x02e9 }
            goto L_0x0099
        L_0x012f:
            r5 = 0
            goto L_0x008e
        L_0x0132:
            int r12 = r0.A01     // Catch:{ all -> 0x02e9 }
            int r11 = r0.A00     // Catch:{ all -> 0x02e9 }
            X.A23 r1 = r3.A02     // Catch:{ all -> 0x02e9 }
            if (r1 != 0) goto L_0x0159
            X.9dl r15 = r3.A05     // Catch:{ all -> 0x02e9 }
            X.88T r14 = new X.88T     // Catch:{ all -> 0x02e9 }
            r14.<init>()     // Catch:{ all -> 0x02e9 }
            X.88R r4 = new X.88R     // Catch:{ all -> 0x02e9 }
            r4.<init>()     // Catch:{ all -> 0x02e9 }
            r0 = 0
            X.A23 r1 = new X.A23     // Catch:{ all -> 0x02e9 }
            r1.<init>(r15, r14, r4, r0)     // Catch:{ all -> 0x02e9 }
            r3.A02 = r1     // Catch:{ all -> 0x02e9 }
            int r0 = r5.A01     // Catch:{ all -> 0x02e9 }
            r1.A02(r12, r11, r0)     // Catch:{ all -> 0x02e9 }
            X.A23 r0 = r3.A02     // Catch:{ all -> 0x02e9 }
            r0.B1T(r13)     // Catch:{ all -> 0x02e9 }
            goto L_0x015e
        L_0x0159:
            int r0 = r5.A01     // Catch:{ all -> 0x02e9 }
            r1.A02(r12, r11, r0)     // Catch:{ all -> 0x02e9 }
        L_0x015e:
            if (r2 == 0) goto L_0x0166
            X.A23 r0 = r3.A02     // Catch:{ all -> 0x02e9 }
            X.9NT r0 = r0.A07     // Catch:{ all -> 0x02e9 }
            r0.A00 = r2     // Catch:{ all -> 0x02e9 }
        L_0x0166:
            X.A1v r0 = r3.A03     // Catch:{ all -> 0x02e9 }
            if (r0 != 0) goto L_0x0182
            X.9dl r1 = r3.A04     // Catch:{ all -> 0x02e9 }
            X.A1v r0 = new X.A1v     // Catch:{ all -> 0x02e9 }
            r0.<init>(r1)     // Catch:{ all -> 0x02e9 }
            r3.A03 = r0     // Catch:{ all -> 0x02e9 }
            X.9jv r0 = r3.A00     // Catch:{ all -> 0x02e9 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x02e9 }
            X.A1v r1 = r3.A03     // Catch:{ all -> 0x02e9 }
            X.9ST r0 = r3.A01     // Catch:{ all -> 0x02e9 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x02e9 }
            r1.B1T(r0)     // Catch:{ all -> 0x02e9 }
        L_0x0182:
            X.A1v r2 = r3.A03     // Catch:{ all -> 0x02e9 }
            X.9ST r1 = r16.A02()     // Catch:{ all -> 0x02e9 }
            X.A23 r0 = r3.A02     // Catch:{ all -> 0x02e9 }
            r2.A00(r1, r5, r0)     // Catch:{ all -> 0x02e9 }
            X.A23 r0 = r3.A02     // Catch:{ all -> 0x02e9 }
            X.9NT r5 = r0.A07     // Catch:{ all -> 0x02e9 }
        L_0x0191:
            android.os.Trace.endSection()     // Catch:{ all -> 0x02fc }
            boolean r0 = r6.A0L     // Catch:{ all -> 0x02fc }
            if (r0 == 0) goto L_0x01b1
            X.9RH r0 = r10.A05     // Catch:{ all -> 0x02fc }
            r1 = 0
            android.util.SparseArray r0 = r0.A00     // Catch:{ all -> 0x02fc }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x02fc }
            X.A1x r0 = (X.C20983A1x) r0     // Catch:{ all -> 0x02fc }
            if (r0 == 0) goto L_0x0304
            X.9VB r0 = r0.A03     // Catch:{ all -> 0x02fc }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x02fc }
            int r0 = r0.size()     // Catch:{ all -> 0x02fc }
            if (r0 != 0) goto L_0x01b1
            goto L_0x0304
        L_0x01b1:
            r4 = r5
            X.A1u r2 = r6.A0G     // Catch:{ all -> 0x02fc }
            if (r2 == 0) goto L_0x01e1
            java.lang.String r0 = "PreProcessCpuFrames"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x02fc }
            boolean r0 = r2.A03     // Catch:{ all -> 0x02fc }
            if (r0 == 0) goto L_0x01de
            X.9pj r1 = r2.A05     // Catch:{ all -> 0x02fc }
            int r0 = r5.A01     // Catch:{ all -> 0x02fc }
            r1.A00 = r0     // Catch:{ all -> 0x02fc }
            X.A1x r0 = r2.A02     // Catch:{ all -> 0x02fc }
            r0.A01(r5)     // Catch:{ all -> 0x02fc }
            boolean r0 = r2.A04     // Catch:{ all -> 0x02fc }
            if (r0 == 0) goto L_0x01de
            X.A23 r0 = r2.A00     // Catch:{ all -> 0x02fc }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x02fc }
            X.9NT r12 = r0.A07     // Catch:{ all -> 0x02fc }
            long r2 = r12.A03     // Catch:{ all -> 0x02fc }
            long r0 = r5.A03     // Catch:{ all -> 0x02fc }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x01de
            r4 = r12
        L_0x01de:
            android.os.Trace.endSection()     // Catch:{ all -> 0x02fc }
        L_0x01e1:
            boolean r0 = r6.A0K     // Catch:{ all -> 0x02fc }
            if (r0 == 0) goto L_0x02cf
            X.A21 r12 = r6.A0H     // Catch:{ all -> 0x02fc }
            monitor-enter(r12)     // Catch:{ all -> 0x02fc }
            X.9VB r11 = r12.A05     // Catch:{ all -> 0x02f9 }
            java.util.List r3 = r11.A00     // Catch:{ all -> 0x02f9 }
            int r2 = r3.size()     // Catch:{ all -> 0x02f9 }
            r1 = 0
        L_0x01f1:
            if (r1 >= r2) goto L_0x02ce
            java.lang.Object r13 = r3.get(r1)     // Catch:{ all -> 0x02f9 }
            X.A20 r13 = (X.A20) r13     // Catch:{ all -> 0x02f9 }
            boolean r0 = r13 instanceof X.C22788Avz     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x021a
            X.7lR r13 = r13.A03     // Catch:{ all -> 0x02f9 }
            boolean r0 = r13 instanceof X.C20995A2j     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x021a
            X.A2j r13 = (X.C20995A2j) r13     // Catch:{ all -> 0x02f9 }
            boolean r0 = r13.A0C     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x021a
            X.9jR r13 = r13.A0N     // Catch:{ all -> 0x02f9 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r13.A0B     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x021a
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r13.A02()     // Catch:{ all -> 0x02f9 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest     // Catch:{ all -> 0x02f9 }
            boolean r0 = r0.multipleOutputsSupported     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x021a
            goto L_0x021d
        L_0x021a:
            int r1 = r1 + 1
            goto L_0x01f1
        L_0x021d:
            monitor-exit(r12)     // Catch:{ all -> 0x02fc }
            X.9RH r10 = r10.A05     // Catch:{ all -> 0x02fc }
            r3 = 0
            android.util.SparseArray r0 = r10.A00     // Catch:{ all -> 0x02fc }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x02fc }
            X.A1x r0 = (X.C20983A1x) r0     // Catch:{ all -> 0x02fc }
            if (r0 == 0) goto L_0x02c3
            X.9VB r0 = r0.A03     // Catch:{ all -> 0x02fc }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x02fc }
            r19 = r0
            int r17 = r19.size()     // Catch:{ all -> 0x02fc }
        L_0x0235:
            int[] r0 = X.C20984A1y.A0R     // Catch:{ all -> 0x02fc }
            r2 = r0[r3]     // Catch:{ all -> 0x02fc }
            r14 = 0
            r1 = 0
        L_0x023b:
            r0 = r17
            if (r1 >= r0) goto L_0x02bd
            r0 = r19
            java.lang.Object r13 = r0.get(r1)     // Catch:{ all -> 0x02fc }
            X.B3a r13 = (X.C23071B3a) r13     // Catch:{ all -> 0x02fc }
            int r15 = r13.BEs()     // Catch:{ all -> 0x02fc }
            boolean r0 = r13.BLf(r4)     // Catch:{ all -> 0x02fc }
            if (r0 == 0) goto L_0x0258
            if (r2 == r15) goto L_0x025f
            r0 = 5
            if (r2 != 0) goto L_0x025b
            if (r15 == r0) goto L_0x025f
        L_0x0258:
            int r1 = r1 + 1
            goto L_0x023b
        L_0x025b:
            if (r2 != r0) goto L_0x0258
            if (r15 != 0) goto L_0x0258
        L_0x025f:
            if (r14 != 0) goto L_0x02b9
            monitor-enter(r12)     // Catch:{ all -> 0x02fc }
            java.util.List r0 = r11.A00     // Catch:{ all -> 0x02f9 }
            r18 = r0
            int r16 = r18.size()     // Catch:{ all -> 0x02f9 }
            r14 = 0
        L_0x026b:
            r0 = r16
            if (r14 >= r0) goto L_0x02b4
            r0 = r18
            java.lang.Object r15 = r0.get(r14)     // Catch:{ all -> 0x02f9 }
            X.A20 r15 = (X.A20) r15     // Catch:{ all -> 0x02f9 }
            boolean r0 = r15 instanceof X.C22788Avz     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x02b1
            X.9Gy r15 = r15.A06     // Catch:{ all -> 0x02f9 }
            if (r2 == r8) goto L_0x0292
            r0 = 2
            if (r2 == r0) goto L_0x028f
            r0 = 3
            if (r2 == r0) goto L_0x028c
            r0 = 4
            if (r2 == r0) goto L_0x0289
            goto L_0x0295
        L_0x0289:
            java.lang.Integer r0 = X.C023109s.A0S     // Catch:{ all -> 0x02f9 }
            goto L_0x0297
        L_0x028c:
            java.lang.Integer r0 = X.C023109s.A0R     // Catch:{ all -> 0x02f9 }
            goto L_0x0297
        L_0x028f:
            java.lang.Integer r0 = X.C023109s.A0G     // Catch:{ all -> 0x02f9 }
            goto L_0x0297
        L_0x0292:
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ all -> 0x02f9 }
            goto L_0x0297
        L_0x0295:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x02f9 }
        L_0x0297:
            r15.A01 = r0     // Catch:{ all -> 0x02f9 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x02f9 }
            switch(r0) {
                case 1: goto L_0x02ae;
                case 2: goto L_0x02ab;
                case 3: goto L_0x02a8;
                case 4: goto L_0x02a5;
                default: goto L_0x02a0;
            }     // Catch:{ all -> 0x02f9 }
        L_0x02a0:
            java.lang.Integer r0 = X.C023109s.A0S     // Catch:{ all -> 0x02f9 }
        L_0x02a2:
            r15.A00 = r0     // Catch:{ all -> 0x02f9 }
            goto L_0x02b1
        L_0x02a5:
            java.lang.Integer r0 = X.C023109s.A0R     // Catch:{ all -> 0x02f9 }
            goto L_0x02a2
        L_0x02a8:
            java.lang.Integer r0 = X.C023109s.A0G     // Catch:{ all -> 0x02f9 }
            goto L_0x02a2
        L_0x02ab:
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ all -> 0x02f9 }
            goto L_0x02a2
        L_0x02ae:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x02f9 }
            goto L_0x02a2
        L_0x02b1:
            int r14 = r14 + 1
            goto L_0x026b
        L_0x02b4:
            monitor-exit(r12)     // Catch:{ all -> 0x02fc }
            X.9NT r14 = X.C20984A1y.A00(r6, r4)     // Catch:{ all -> 0x02fc }
        L_0x02b9:
            r10.A00(r14, r13)     // Catch:{ all -> 0x02fc }
            goto L_0x0258
        L_0x02bd:
            int r3 = r3 + 1
            r0 = 5
            if (r3 < r0) goto L_0x0235
            goto L_0x02dd
        L_0x02c3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02fc }
            java.lang.String r0 = "GlOutput not set "
            java.lang.RuntimeException r0 = X.C165567td.A0U(r0, r1, r3)     // Catch:{ all -> 0x02fc }
            goto L_0x02fb
        L_0x02ce:
            monitor-exit(r12)     // Catch:{ all -> 0x02fc }
        L_0x02cf:
            X.9NT r2 = X.C20984A1y.A00(r6, r4)     // Catch:{ all -> 0x02fc }
            X.C20984A1y.A01(r6, r5)     // Catch:{ all -> 0x02fc }
            X.9RH r1 = r10.A05     // Catch:{ all -> 0x02fc }
            r0 = 0
            r1.A00(r2, r0)     // Catch:{ all -> 0x02fc }
            goto L_0x02e0
        L_0x02dd:
            X.C20984A1y.A01(r6, r5)     // Catch:{ all -> 0x02fc }
        L_0x02e0:
            X.9Xm r2 = r6.A0F     // Catch:{ all -> 0x02fc }
            X.A2u r1 = X.C21006A2u.A00     // Catch:{ all -> 0x02fc }
            r0 = 0
            r2.A01(r1, r0)     // Catch:{ all -> 0x02fc }
            goto L_0x0304
        L_0x02e9:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x02fc }
            goto L_0x02fb
        L_0x02ee:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02fc }
            java.lang.String r0 = "input not set "
            java.lang.RuntimeException r0 = X.C165567td.A0U(r0, r1, r2)     // Catch:{ all -> 0x02fc }
            goto L_0x02fb
        L_0x02f9:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x02fc }
        L_0x02fb:
            throw r0     // Catch:{ all -> 0x02fc }
        L_0x02fc:
            r2 = move-exception
            X.9jv r1 = r6.A05     // Catch:{ all -> 0x0308 }
            java.lang.String r0 = "MediaPipeline.onFrameAvailable() failed."
            X.C201589jv.A01(r1, r0, r2)     // Catch:{ all -> 0x0308 }
        L_0x0304:
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0318 }
            goto L_0x030d
        L_0x0308:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0318 }
            throw r0     // Catch:{ Exception -> 0x0318 }
        L_0x030d:
            android.os.Trace.endSection()     // Catch:{ all -> 0x034f }
            java.lang.String r0 = "MediaGraphHost.mMediaGraph.render().listeners()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x034f }
            if (r7 == 0) goto L_0x0326
            goto L_0x031f
        L_0x0318:
            r1 = move-exception
            r0 = r20
            r0.A00(r1)     // Catch:{ all -> 0x034a }
            goto L_0x032f
        L_0x031f:
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x034f }
            r7.Bn1(r0, r8)     // Catch:{ all -> 0x034f }
        L_0x0326:
            X.9pr r0 = r9.A04     // Catch:{ all -> 0x034f }
            X.9jv r0 = r0.A05     // Catch:{ all -> 0x034f }
            X.9pp r0 = r0.A07     // Catch:{ all -> 0x034f }
            r0.A00(r9)     // Catch:{ all -> 0x034f }
        L_0x032f:
            android.os.Trace.endSection()     // Catch:{ all -> 0x034f }
            goto L_0x0338
        L_0x0333:
            android.os.ConditionVariable r0 = r3.A00
            r0.open()
        L_0x0338:
            android.os.Trace.endSection()
        L_0x033b:
            return r8
        L_0x033c:
            X.9dl r1 = r2.A04     // Catch:{ all -> 0x034f }
            X.8zK r0 = X.C188278zK.A0l     // Catch:{ all -> 0x034f }
            r1.A00(r0)     // Catch:{ all -> 0x034f }
            java.lang.String r0 = "render() can be only called if you already are in the render thread"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x034f }
            goto L_0x034e
        L_0x034a:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x034f }
        L_0x034e:
            throw r0     // Catch:{ all -> 0x034f }
        L_0x034f:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204319po.handleMessage(android.os.Message):boolean");
    }

    public C204319po(C196119Xt r3, C204349pr r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = new Handler(r3.A03.A00.getLooper(), this);
    }
}

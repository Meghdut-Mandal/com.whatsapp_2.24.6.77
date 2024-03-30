package X;

/* renamed from: X.72p  reason: invalid class name and case insensitive filesystem */
public class C1497472p implements Runnable {
    public Object A00;
    public final int A01;

    public C1497472p(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass17Y r1, Object obj, int i) {
        r1.A0H(new C1497472p(obj, i));
    }

    public static void A01(AnonymousClass17Y r1, Object obj, int i) {
        r1.Bp3(new C1497472p(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0207, code lost:
        r2.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0209, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ef, code lost:
        r0.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04ab, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04cc, code lost:
        X.C011504z.A0B(r2, 64, (android.os.Bundle) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04e8, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04eb, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r72 = this;
            r1 = r72
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0265;
                case 1: goto L_0x026e;
                case 2: goto L_0x0329;
                case 3: goto L_0x0008;
                case 4: goto L_0x0331;
                case 5: goto L_0x033c;
                case 6: goto L_0x033c;
                case 7: goto L_0x0025;
                case 8: goto L_0x0347;
                case 9: goto L_0x034f;
                case 10: goto L_0x0039;
                case 11: goto L_0x0065;
                case 12: goto L_0x013f;
                case 13: goto L_0x03b0;
                case 14: goto L_0x0175;
                case 15: goto L_0x03c2;
                case 16: goto L_0x01a2;
                case 17: goto L_0x03ca;
                case 18: goto L_0x0007;
                case 19: goto L_0x0007;
                case 20: goto L_0x0007;
                case 21: goto L_0x0007;
                case 22: goto L_0x0007;
                case 23: goto L_0x01d0;
                case 24: goto L_0x03e3;
                case 25: goto L_0x03eb;
                case 26: goto L_0x03f3;
                case 27: goto L_0x01e6;
                case 28: goto L_0x01f7;
                case 29: goto L_0x020a;
                case 30: goto L_0x0408;
                case 31: goto L_0x0416;
                case 32: goto L_0x0227;
                case 33: goto L_0x0429;
                case 34: goto L_0x043c;
                case 35: goto L_0x043c;
                case 36: goto L_0x0446;
                case 37: goto L_0x0450;
                case 38: goto L_0x0463;
                case 39: goto L_0x0485;
                case 40: goto L_0x0485;
                case 41: goto L_0x048f;
                case 42: goto L_0x049b;
                case 43: goto L_0x04a2;
                case 44: goto L_0x04ad;
                case 45: goto L_0x04bd;
                case 46: goto L_0x04c6;
                case 47: goto L_0x04d3;
                case 48: goto L_0x04e0;
                case 49: goto L_0x04ec;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r0 = r1.A00
            X.4kK r0 = (X.C95264kK) r0
            X.5ND r2 = r0.A00
            android.view.View r1 = r2.A0E
            if (r1 == 0) goto L_0x0007
            android.view.View r0 = r2.A0C
            if (r0 != r1) goto L_0x0007
            X.7dA r1 = r2.A0H
            if (r1 == 0) goto L_0x0007
            r0 = 0
            r2.A0E = r0
            X.70Z r1 = (X.AnonymousClass70Z) r1
            X.70b r0 = r1.A00
            r0.B34()
            return
        L_0x0025:
            java.lang.Object r1 = r1.A00
            X.5rF r1 = (X.C120275rF) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0007
            X.5NK r1 = r1.A01
            r0 = 1
            r1.A0R = r0
            android.os.Handler r1 = r1.A0V
            r0 = 0
            r1.sendEmptyMessage(r0)
            return
        L_0x0039:
            java.lang.Object r1 = r1.A00
            X.6E3 r1 = (X.AnonymousClass6E3) r1
            X.5n3 r0 = r1.A05
            if (r0 == 0) goto L_0x0007
            int r1 = r1.A09
            X.6WC r2 = r0.A00
            int r0 = r2.A00
            int r0 = r0 % 2
            if (r1 != r0) goto L_0x004f
            X.AnonymousClass6WC.A02(r2)
            return
        L_0x004f:
            java.util.concurrent.ConcurrentLinkedQueue r1 = r2.A0C
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0007
            java.lang.Object r1 = r1.poll()
            X.9Xa r1 = (X.C195979Xa) r1
            X.AnonymousClass00C.A0B(r1)
            r0 = 0
            X.AnonymousClass6WC.A00(r1, r2, r0)
            return
        L_0x0065:
            java.lang.Object r3 = r1.A00
            X.6E3 r3 = (X.AnonymousClass6E3) r3
            X.5n3 r1 = r3.A05
            if (r1 == 0) goto L_0x0007
            int r2 = r3.A09
            java.lang.String r0 = r3.A07
            boolean r6 = r3.A08
            X.6WC r4 = r1.A00
            r4.A05 = r0
            int r1 = r4.A00
            int r0 = r1 % 2
            if (r2 != r0) goto L_0x00b2
            java.util.Set r5 = r4.A0B
            java.util.Iterator r3 = r5.iterator()
        L_0x0083:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e6
            r3.next()
            java.util.Iterator r2 = r5.iterator()
        L_0x0090:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r2.next()
            X.60j r0 = (X.C1255660j) r0
            X.5xe r0 = r0.A00
            X.6WA r0 = r0.A01
            if (r0 == 0) goto L_0x0090
            java.util.Set r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x00a8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0090
            r1.next()
            goto L_0x00a8
        L_0x00b2:
            int r0 = r1 + 1
            int r0 = r0 % 2
            if (r2 != r0) goto L_0x00e6
            java.util.Set r0 = r4.A0B
            java.util.Iterator r5 = r0.iterator()
        L_0x00be:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r5.next()
            X.60j r0 = (X.C1255660j) r0
            X.5xe r0 = r0.A00
            X.6WA r2 = r0.A01
            if (r2 == 0) goto L_0x00be
            java.util.concurrent.ConcurrentLinkedQueue r1 = r2.A04
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00be
            java.lang.Object r3 = r1.poll()
            X.5xe r2 = r2.A08
            X.0wU r1 = r2.A04
            r0 = 19
            X.C1501874h.A01(r1, r2, r3, r0)
            goto L_0x00be
        L_0x00e6:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x00ec
            if (r6 == 0) goto L_0x0007
        L_0x00ec:
            r0 = 0
            r4.A09 = r0
            int r0 = r4.A00
            int r0 = r0 + 1
            int r3 = r0 % 2
            r0 = 1
            r4.A06 = r0
            X.6E3[] r2 = r4.A0E
            r1 = r2[r3]
            X.AnonymousClass6WC.A03(r4, r3)
            X.9ps r0 = r1.A02
            if (r0 == 0) goto L_0x0106
            r0.A0C()
        L_0x0106:
            android.view.TextureView r1 = r1.A0A
            r1.bringToFront()
            r0 = 0
            r1.setAlpha(r0)
            int r0 = r4.A00
            int r0 = r0 % 2
            r3 = r2[r0]
            r1.clearAnimation()
            android.view.TextureView r0 = r3.A0A
            r0.clearAnimation()
            android.view.ViewPropertyAnimator r2 = r1.animate()
            X.AnonymousClass00C.A08(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r1 = 49
            X.3wd r0 = new X.3wd
            r0.<init>(r3, r4, r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            r0.start()
            return
        L_0x013f:
            java.lang.Object r1 = r1.A00
            X.6E3 r1 = (X.AnonymousClass6E3) r1
            X.5n3 r0 = r1.A05
            if (r0 == 0) goto L_0x0007
            int r3 = r1.A09
            X.6WC r2 = r0.A00
            int r0 = r2.A00
            int r1 = r0 % 2
            int r0 = r2.A01
            if (r3 == r0) goto L_0x0007
            r2.A01 = r3
            if (r3 != r1) goto L_0x0007
            java.util.Set r0 = r2.A0B
            java.util.Iterator r3 = r0.iterator()
        L_0x015d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r3.next()
            X.60j r0 = (X.C1255660j) r0
            X.5xe r0 = r0.A00
            X.6WA r2 = r0.A01
            if (r2 == 0) goto L_0x015d
            r1 = 6
            r0 = 0
            X.AnonymousClass6WA.A02(r2, r0, r0, r0, r1)
            goto L_0x015d
        L_0x0175:
            java.lang.Object r3 = r1.A00
            X.5NR r3 = (X.AnonymousClass5NR) r3
            X.4SO r2 = r3.A08
            if (r2 == 0) goto L_0x0182
            r1 = 0
            r0 = 1
            r2.Bcs(r1, r0)
        L_0x0182:
            X.5NU r2 = r3.A0V
            X.6D2 r0 = r2.A01
            if (r0 == 0) goto L_0x018b
            r0.A00()
        L_0x018b:
            r1 = 0
            r2.A00 = r1
            X.5NI r0 = r3.A0D
            if (r0 == 0) goto L_0x0007
            r0.setPlayer(r1)
            X.5NI r1 = r3.A0D
            java.lang.Runnable r0 = r1.A0F
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.A0G
            r1.removeCallbacks(r0)
            return
        L_0x01a2:
            java.lang.Object r4 = r1.A00
            X.5NR r4 = (X.AnonymousClass5NR) r4
            X.9ps r3 = r4.A06
            if (r3 == 0) goto L_0x0007
            X.6FG r0 = r4.A0A
            if (r0 == 0) goto L_0x01b1
            r0.A00()
        L_0x01b1:
            boolean r0 = r4.A0C
            r0 = r0 ^ 1
            android.os.Handler r2 = r3.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 47
            X.AnonymousClass000.A14(r2, r1, r0)
            boolean r0 = r4.A0Q
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.A0A
            r3.A0L(r0)
        L_0x01c9:
            r3.A0C()
            r4.A0E()
            return
        L_0x01d0:
            java.lang.Object r0 = r1.A00
            X.6mW r0 = (X.C141006mW) r0
            X.5NR r1 = r0.A00
            r0 = 1
            r1.A0B = r0
            r1.A0G = r0
            r0 = 0
            r1.A0I = r0
            X.4SP r0 = r1.A0B
            if (r0 == 0) goto L_0x0007
            r0.BkM()
            return
        L_0x01e6:
            java.lang.Object r2 = r1.A00
            X.6jN r2 = (X.C139186jN) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0007
            X.0wD r1 = r2.A03
            X.0wL r0 = r2.A02
            r1.unregisterObserver(r0)
            r0 = 0
            goto L_0x0207
        L_0x01f7:
            java.lang.Object r2 = r1.A00
            X.6jN r2 = (X.C139186jN) r2
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0007
            X.0wD r1 = r2.A03
            X.0wL r0 = r2.A02
            r1.registerObserver(r0)
            r0 = 1
        L_0x0207:
            r2.A00 = r0
            return
        L_0x020a:
            java.lang.Object r1 = r1.A00
            X.0wB r1 = (X.C19580wB) r1
            java.lang.String r0 = "voicenote/voicenotestarted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r1 = X.C36361kB.A0s(r1)
        L_0x0217:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r1.next()
            X.3L3 r0 = (X.AnonymousClass3L3) r0
            r0.A04()
            goto L_0x0217
        L_0x0227:
            java.lang.Object r0 = r1.A00
            X.6YP r0 = (X.AnonymousClass6YP) r0
            X.11F r5 = r0.A0B
            if (r5 == 0) goto L_0x0007
            X.3To r4 = r0.A11
            android.os.ConditionVariable r0 = X.C18740tg.A00
            long r2 = java.lang.System.currentTimeMillis()
            java.io.File r1 = X.C65813To.A02(r5, r4)
            if (r1 == 0) goto L_0x0246
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0246
            r1.setLastModified(r2)
        L_0x0246:
            java.io.File r1 = X.C65813To.A01(r5, r4)
            if (r1 == 0) goto L_0x0255
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0255
            r1.setLastModified(r2)
        L_0x0255:
            java.io.File r1 = X.C65813To.A00(r5, r4)
            if (r1 == 0) goto L_0x0007
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0007
            r1.setLastModified(r2)
            return
        L_0x0265:
            java.lang.Object r1 = r1.A00
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            r0 = 3
            r1.A0W(r0)
            return
        L_0x026e:
            java.lang.Object r8 = r1.A00
            X.6Tf r8 = (X.C132356Tf) r8
            monitor-enter(r8)
            java.util.Map r0 = r8.A05     // Catch:{ all -> 0x0326 }
            java.util.Iterator r4 = X.AnonymousClass000.A0y(r0)     // Catch:{ all -> 0x0326 }
        L_0x0279:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0326 }
            if (r0 == 0) goto L_0x02b2
            java.util.Map$Entry r3 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0326 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0326 }
            X.3wd r0 = (X.C81203wd) r0     // Catch:{ all -> 0x0326 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0326 }
            android.os.Handler r0 = (android.os.Handler) r0     // Catch:{ all -> 0x0326 }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x0326 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0326 }
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x0326 }
            java.util.Map r1 = r8.A06     // Catch:{ all -> 0x0326 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x0326 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0326 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0326 }
            if (r1 != r0) goto L_0x02ac
            X.C132356Tf.A00(r8, r2)     // Catch:{ all -> 0x0326 }
        L_0x02aa:
            monitor-exit(r8)     // Catch:{ all -> 0x0326 }
            goto L_0x0325
        L_0x02ac:
            java.util.Map r0 = r8.A07     // Catch:{ all -> 0x0326 }
            r0.remove(r2)     // Catch:{ all -> 0x0326 }
            goto L_0x0279
        L_0x02b2:
            java.util.List r0 = r8.A04     // Catch:{ all -> 0x0326 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0326 }
        L_0x02b8:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0326 }
            if (r0 == 0) goto L_0x0321
            java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x0326 }
            X.5vV r9 = (X.C122835vV) r9     // Catch:{ all -> 0x0326 }
            java.util.concurrent.ThreadPoolExecutor r0 = r9.A03     // Catch:{ all -> 0x0326 }
            long r4 = r0.getTaskCount()     // Catch:{ all -> 0x0326 }
            long r2 = r0.getCompletedTaskCount()     // Catch:{ all -> 0x0326 }
            long r0 = r9.A01     // Catch:{ all -> 0x0326 }
            long r6 = r9.A00     // Catch:{ all -> 0x0326 }
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0312
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0312
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x0312
            r13 = 1
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0326 }
            java.lang.String r10 = "Thread pool stuck, name:"
            r12.append(r10)     // Catch:{ all -> 0x0326 }
            java.lang.String r11 = r9.A02     // Catch:{ all -> 0x0326 }
            r12.append(r11)     // Catch:{ all -> 0x0326 }
            java.lang.String r10 = " lastTaskCount:"
            r12.append(r10)     // Catch:{ all -> 0x0326 }
            r12.append(r0)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = " lastCompleted:"
            r12.append(r0)     // Catch:{ all -> 0x0326 }
            r12.append(r6)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = " currentTaskCount:"
            r12.append(r0)     // Catch:{ all -> 0x0326 }
            r12.append(r4)     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = " currentCompleted:"
            java.lang.String r0 = X.C36381kD.A0z(r0, r12, r2)     // Catch:{ all -> 0x0326 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0326 }
            X.C132356Tf.A00(r8, r11)     // Catch:{ all -> 0x0326 }
            goto L_0x031a
        L_0x0312:
            r13 = 0
            java.util.Map r1 = r8.A07     // Catch:{ all -> 0x0326 }
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x0326 }
            r1.remove(r0)     // Catch:{ all -> 0x0326 }
        L_0x031a:
            r9.A00 = r2     // Catch:{ all -> 0x0326 }
            r9.A01 = r4     // Catch:{ all -> 0x0326 }
            if (r13 == 0) goto L_0x02b8
            goto L_0x02aa
        L_0x0321:
            r8.A01()     // Catch:{ all -> 0x0326 }
            goto L_0x02aa
        L_0x0325:
            return
        L_0x0326:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0326 }
            throw r0
        L_0x0329:
            java.lang.Object r0 = r1.A00
            X.0Bk r0 = (X.C02680Bk) r0
            r0.A03()
            return
        L_0x0331:
            java.lang.Object r0 = r1.A00
            X.6cy r0 = (X.C135606cy) r0
            com.whatsapp.videoplayback.HeroPlaybackControlView r0 = r0.A01
            r0.A07()
            goto L_0x03ef
        L_0x033c:
            java.lang.Object r0 = r1.A00
            X.6cy r0 = (X.C135606cy) r0
            com.whatsapp.videoplayback.HeroPlaybackControlView r0 = r0.A01
            r0.A06()
            goto L_0x03ef
        L_0x0347:
            java.lang.Object r0 = r1.A00
            X.4eZ r0 = (X.C92754eZ) r0
            r0.A0C()
            return
        L_0x034f:
            java.lang.Object r0 = r1.A00
            X.1Dw r0 = (X.C24811Dw) r0
            monitor-enter(r0)
            X.1Dz r1 = r0.A02     // Catch:{ all -> 0x03ad }
            X.1Dx r3 = r1.A01     // Catch:{ all -> 0x03ad }
            X.3S8 r6 = r3.A01()     // Catch:{ all -> 0x03ad }
            long r1 = r6.A07     // Catch:{ all -> 0x03ad }
            r4 = 1
            long r1 = r1 + r4
            r8 = 0
            r7 = -2097153(0xffffffffffdfffff, float:NaN)
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r50 = r1
            X.3S8 r1 = X.AnonymousClass3S8.A00(r6, r7, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70)     // Catch:{ all -> 0x03ad }
            r3.A03(r1)     // Catch:{ all -> 0x03ad }
            monitor-exit(r0)
            return
        L_0x03ad:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x03b0:
            java.lang.Object r0 = r1.A00
            X.6UA r0 = (X.AnonymousClass6UA) r0
            java.lang.Object r0 = r0.A00
            X.5NH r0 = (X.AnonymousClass5NH) r0
            android.media.MediaPlayer$OnErrorListener r3 = r0.A07
            android.media.MediaPlayer r2 = r0.A09
            r1 = 1
            r0 = 0
            r3.onError(r2, r1, r0)
            return
        L_0x03c2:
            java.lang.Object r0 = r1.A00
            X.5NR r0 = (X.AnonymousClass5NR) r0
            r0.A0d()
            return
        L_0x03ca:
            java.lang.Object r0 = r1.A00
            X.6mW r0 = (X.C141006mW) r0
            X.5NR r3 = r0.A00
            boolean r0 = r3.A0L
            r2 = 1
            if (r0 == 0) goto L_0x03e0
            X.5NU r0 = r3.A0V
            android.view.View r1 = r0.A06
            r0 = 8
            r1.setVisibility(r0)
            r3.A0B = r2
        L_0x03e0:
            r3.A0J = r2
            return
        L_0x03e3:
            java.lang.Object r0 = r1.A00
            X.5NI r0 = (X.AnonymousClass5NI) r0
            r0.A02()
            return
        L_0x03eb:
            java.lang.Object r0 = r1.A00
            X.5NI r0 = (X.AnonymousClass5NI) r0
        L_0x03ef:
            r0.A08()
            return
        L_0x03f3:
            java.lang.Object r2 = r1.A00
            X.37b r2 = (X.C602437b) r2
            X.3Qq r0 = r2.A01
            int r1 = r0.A04()
            X.3Qq r0 = r2.A01
            r0.A0I()
            X.3Qq r0 = r2.A01
            r0.A0L(r1)
            return
        L_0x0408:
            java.lang.Object r0 = r1.A00
            X.6YP r0 = (X.AnonymousClass6YP) r0
            X.0wN r3 = r0.A0f
            java.lang.String r2 = "VoiceNoteRecordingUI/logCriticalErrorForVoiceNoteReleaseIfNeeded"
            r1 = 0
            r0 = 1
            r3.A0E(r2, r1, r0)
            return
        L_0x0416:
            java.lang.Object r0 = r1.A00
            X.6YP r0 = (X.AnonymousClass6YP) r0
            X.01I r0 = r0.A0c
            if (r0 == 0) goto L_0x0421
            r0.finishAffinity()
        L_0x0421:
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L_0x0429:
            java.lang.Object r3 = r1.A00
            X.6YP r3 = (X.AnonymousClass6YP) r3
            X.6Q9 r2 = r3.A0H
            r2.A04()     // Catch:{ Exception -> 0x0433 }
            goto L_0x043b
        L_0x0433:
            X.17Y r1 = r3.A0h
            r0 = 8
            X.C1498172w.A00(r1, r3, r2, r0)
            return
        L_0x043b:
            return
        L_0x043c:
            java.lang.Object r0 = r1.A00
            X.6Q9 r0 = (X.AnonymousClass6Q9) r0
            X.7jp r0 = r0.A06
            r0.B5b()
            return
        L_0x0446:
            java.lang.Object r0 = r1.A00
            X.6Q9 r0 = (X.AnonymousClass6Q9) r0
            X.7jp r0 = r0.A06
            r0.Bto()
            return
        L_0x0450:
            java.lang.Object r0 = r1.A00
            X.14u r0 = (X.C225314u) r0
            X.0yb r0 = r0.A08
            android.os.Vibrator r2 = r0.A0H()
            X.C18740tg.A06(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.vibrate(r0)
            return
        L_0x0463:
            java.lang.Object r4 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            com.whatsapp.calling.views.VoipContactPickerDialogFragment r3 = new com.whatsapp.calling.views.VoipContactPickerDialogFragment
            r3.<init>()
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r3.A02
            r4.A17 = r0
            X.5rH r0 = new X.5rH
            r0.<init>()
            r2 = 0
            r0.A00 = r2
            boolean r0 = r0.A01
            X.6P2 r1 = new X.6P2
            r1.<init>(r0, r2)
            java.lang.String r0 = "VoipContactPickerDialogFragment"
            r4.A3n(r3, r1, r0)
            return
        L_0x0485:
            java.lang.Object r0 = r1.A00
            X.14p r0 = (X.C224914p) r0
            X.11e r0 = r0.A02
            r0.A04()
            return
        L_0x048f:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.whatsapp.calling.screenshare.ScreenShareViewModel r1 = r0.A0q
            X.5Sb r0 = X.C108075Sb.BOTTOM_SHEET
            r1.A0S(r0)
            return
        L_0x049b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            android.view.ViewGroup r1 = r0.A0G
            goto L_0x04ab
        L_0x04a2:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            android.view.ViewGroup r1 = r0.A0G
            X.C18740tg.A04(r1)
        L_0x04ab:
            r0 = 4
            goto L_0x04e8
        L_0x04ad:
            java.lang.Object r2 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            android.widget.TextView r1 = r2.A0K
            r0 = 2131887489(0x7f120581, float:1.9409587E38)
            r1.setText(r0)
            com.whatsapp.voipcalling.VoipActivityV2.A18(r2)
            return
        L_0x04bd:
            java.lang.Object r0 = r1.A00
            X.61I r0 = (X.AnonymousClass61I) r0
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            android.view.View r2 = r0.A0D
            goto L_0x04cc
        L_0x04c6:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r2 = r0.A0T
        L_0x04cc:
            r1 = 0
            r0 = 64
            X.C011504z.A0B(r2, r0, r1)
            return
        L_0x04d3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            X.6X3 r0 = r0.A0L
            r1 = 0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A0G
            r0.A0b(r1)
            return
        L_0x04e0:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = r0.A0T
            r0 = 8
        L_0x04e8:
            r1.setVisibility(r0)
            return
        L_0x04ec:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            android.view.View r1 = r0.A09
            r0 = 2131434978(0x7f0b1de2, float:1.8491785E38)
            android.view.View r1 = X.C012005e.A02(r1, r0)
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1497472p.run():void");
    }
}

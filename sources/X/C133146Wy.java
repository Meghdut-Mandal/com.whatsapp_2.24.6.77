package X;

import android.content.Context;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6Wy  reason: invalid class name and case insensitive filesystem */
public final class C133146Wy {
    public static final AtomicInteger A0L = C90484aE.A0v();
    public C123055vr A00;
    public C1263963t A01;
    public C115115iM A02;
    public int A03 = -1;
    public int A04 = -1;
    public int A05;
    public int A06;
    public long A07 = AnonymousClass6M5.A00.A00(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public C98254r8 A08;
    public C157827ek A09;
    public C130326Kq A0A;
    public C98244r7 A0B;
    public Object A0C;
    public boolean A0D;
    public final C91614cK A0E;
    public final Object A0F = C36441kJ.A11();
    public final List A0G = AnonymousClass001.A0I();
    public final Context A0H;
    public final C118785oj A0I;
    public final Object A0J;
    public final Executor A0K;

    public C133146Wy(Context context, C118785oj r5, Object obj, Executor executor) {
        AnonymousClass00C.A0D(context, 1);
        this.A0H = context;
        this.A0I = r5;
        this.A0J = obj;
        this.A0K = executor;
        Looper mainLooper = Looper.getMainLooper();
        AnonymousClass00C.A08(mainLooper);
        this.A0E = new C91614cK(mainLooper, this);
        A0L.incrementAndGet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r2 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r1 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (X.AnonymousClass00C.A0J(r2.A01, r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        if (r1 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ad, code lost:
        r2.A04.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b2, code lost:
        r2.A01 = r1;
        r2.A03.requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C133146Wy r8) {
        /*
            monitor-enter(r8)
            X.5oj r1 = r8.A0I     // Catch:{ all -> 0x00ba }
            X.6Kq r0 = r8.A0A     // Catch:{ all -> 0x00ba }
            r5 = 0
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r0.A03     // Catch:{ all -> 0x00ba }
        L_0x000a:
            X.5ok r0 = (X.C118795ok) r0     // Catch:{ all -> 0x00ba }
            r1.A00 = r0     // Catch:{ all -> 0x00ba }
            X.6WZ r1 = r1.A01     // Catch:{ all -> 0x00ba }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x00ba }
            X.5xb r2 = r0.A01     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "Committing Variables and Bound tree is only supported from the UI Thread"
            X.C132926Vv.A02(r0)     // Catch:{ all -> 0x00ba }
            r1.A04 = r2     // Catch:{ all -> 0x00ba }
            java.util.Map r0 = r2.A06     // Catch:{ all -> 0x00ba }
            r1.A07 = r0     // Catch:{ all -> 0x00ba }
            java.lang.ref.WeakReference r0 = r1.A06     // Catch:{ all -> 0x00ba }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x00ba }
            X.67i r7 = (X.C1271967i) r7     // Catch:{ all -> 0x00ba }
            java.util.List r0 = r1.A0G     // Catch:{ all -> 0x00ba }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x003e
            r1.next()     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "onCommit"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x00ba }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x003e:
            if (r7 == 0) goto L_0x0081
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x00ba }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00ba }
        L_0x0046:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0081
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x00ba }
            X.5sa r1 = (X.C121095sa) r1     // Catch:{ all -> 0x00ba }
            X.6lc r0 = r1.A01     // Catch:{ all -> 0x00ba }
            java.lang.Object r4 = X.C133266Xn.A05(r7, r0)     // Catch:{ all -> 0x00ba }
            if (r4 != 0) goto L_0x0062
            java.lang.String r1 = "BloksTreeManager"
            java.lang.String r0 = "Binding was targeting a controller but the returned controller was null"
        L_0x005e:
            X.AnonymousClass6RS.A01(r1, r0)     // Catch:{ all -> 0x00ba }
            goto L_0x0046
        L_0x0062:
            int r3 = r0.A04     // Catch:{ all -> 0x00ba }
            int r2 = r1.A00     // Catch:{ all -> 0x00ba }
            java.lang.Object r1 = r1.A02     // Catch:{ all -> 0x00ba }
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r3 != r0) goto L_0x007a
            X.6oF r4 = (X.C142046oF) r4     // Catch:{ all -> 0x00ba }
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = "ViewTransformsBindControllerOverride"
            java.lang.String r0 = "Trying to set null value for a view transform property"
            goto L_0x005e
        L_0x0075:
            r0 = 0
            r4.BqD(r0, r1, r2)     // Catch:{ all -> 0x00ba }
            goto L_0x0046
        L_0x007a:
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0O(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x003d
        L_0x007f:
            r0 = r5
            goto L_0x000a
        L_0x0081:
            X.5vr r1 = r8.A00     // Catch:{ all -> 0x00ba }
            X.6Kq r0 = r8.A0A     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x008e
            X.5vr r0 = r0.A02     // Catch:{ all -> 0x00ba }
        L_0x0089:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x00ba }
            goto L_0x0090
        L_0x008e:
            r0 = r5
            goto L_0x0089
        L_0x0090:
            if (r0 == 0) goto L_0x0094
            monitor-exit(r8)
        L_0x0093:
            return
        L_0x0094:
            X.6Kq r0 = r8.A0A     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x009a
            X.5vr r5 = r0.A02     // Catch:{ all -> 0x00ba }
        L_0x009a:
            r8.A00 = r5     // Catch:{ all -> 0x00ba }
            monitor-exit(r8)
            X.63t r2 = r8.A01
            if (r2 == 0) goto L_0x0093
            X.5vr r1 = r8.A00
            X.5vr r0 = r2.A01
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 != 0) goto L_0x0093
            if (r1 != 0) goto L_0x00b2
            X.6Y3 r0 = r2.A04
            r0.A0D()
        L_0x00b2:
            r2.A01 = r1
            X.4ds r0 = r2.A03
            r0.requestLayout()
            return
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133146Wy.A00(X.6Wy):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r1.A01 == r12.A07) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r5 = (X.C130326Kq) r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (X.AnonymousClass000.A1Q((r6.A01 > r12.A07 ? 1 : (r6.A01 == r12.A07 ? 0 : -1))) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r1 <= r12.A03) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        if (X.AnonymousClass00C.A0J(r12.A0A, r5) != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        r12.A03 = r1;
        r12.A0A = r5;
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        if (X.AnonymousClass00C.A0J(r12.A08, r6) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        r12.A08 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0073, code lost:
        if (r13 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0075, code lost:
        r1 = r5.A02.A02.A03;
        r13[0] = r1.width();
        r13[1] = r1.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (X.C132926Vv.A03() == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        r2 = r12.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
        if (r2.hasMessages(99) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        r2.sendEmptyMessage(99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C133146Wy r12, int[] r13) {
        /*
            monitor-enter(r12)
            boolean r0 = r12.A0D     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r12)
            return
        L_0x0007:
            X.7ek r5 = r12.A09     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x00a1
            X.4r8 r1 = r12.A08     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x0024
            X.7ek r0 = r1.A02     // Catch:{ all -> 0x00ad }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0024
            long r3 = r12.A07     // Catch:{ all -> 0x00ad }
            long r1 = r1.A01     // Catch:{ all -> 0x00ad }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
        L_0x001f:
            X.4r8 r6 = r12.A08     // Catch:{ all -> 0x00ad }
            if (r6 == 0) goto L_0x00a8
            goto L_0x003c
        L_0x0024:
            android.content.Context r4 = r12.A0H     // Catch:{ all -> 0x00ad }
            java.lang.Object r7 = r12.A0J     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = r12.A0C     // Catch:{ all -> 0x00ad }
            int r9 = r12.A05     // Catch:{ all -> 0x00ad }
            int r0 = r9 + 1
            r12.A05 = r0     // Catch:{ all -> 0x00ad }
            X.6Kq r6 = r12.A0A     // Catch:{ all -> 0x00ad }
            long r10 = r12.A07     // Catch:{ all -> 0x00ad }
            X.4r8 r3 = new X.4r8     // Catch:{ all -> 0x00ad }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00ad }
            r12.A08 = r3     // Catch:{ all -> 0x00ad }
            goto L_0x001f
        L_0x003c:
            monitor-exit(r12)
            java.lang.Object r5 = r6.A00()
            X.6Kq r5 = (X.C130326Kq) r5
            monitor-enter(r12)
            long r2 = r12.A07     // Catch:{ all -> 0x00ad }
            long r0 = r6.A01     // Catch:{ all -> 0x00ad }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r4)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0066
            int r1 = r6.A00     // Catch:{ all -> 0x00ad }
            int r0 = r12.A03     // Catch:{ all -> 0x00ad }
            if (r1 <= r0) goto L_0x0066
            X.6Kq r0 = r12.A0A     // Catch:{ all -> 0x00ad }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0066
            r12.A03 = r1     // Catch:{ all -> 0x00ad }
            r12.A0A = r5     // Catch:{ all -> 0x00ad }
            r2 = 1
            goto L_0x0067
        L_0x0066:
            r2 = 0
        L_0x0067:
            X.4r8 r0 = r12.A08     // Catch:{ all -> 0x00ad }
            boolean r1 = X.AnonymousClass00C.A0J(r0, r6)     // Catch:{ all -> 0x00ad }
            r0 = 0
            if (r1 == 0) goto L_0x0072
            r12.A08 = r0     // Catch:{ all -> 0x00ad }
        L_0x0072:
            monitor-exit(r12)
            if (r13 == 0) goto L_0x0087
            X.5vr r0 = r5.A02
            com.facebook.rendercore.RenderTreeNode r0 = r0.A02
            android.graphics.Rect r1 = r0.A03
            int r0 = r1.width()
            r13[r4] = r0
            int r0 = r1.height()
            r13[r3] = r0
        L_0x0087:
            if (r2 == 0) goto L_0x0092
            boolean r0 = X.C132926Vv.A03()
            if (r0 == 0) goto L_0x0093
            A00(r12)
        L_0x0092:
            return
        L_0x0093:
            X.4cK r2 = r12.A0E
            r1 = 99
            boolean r0 = r2.hasMessages(r1)
            if (r0 != 0) goto L_0x0092
            r2.sendEmptyMessage(r1)
            return
        L_0x00a1:
            java.lang.String r0 = "Tried executing the layout step before resolving a tree"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ all -> 0x00ad }
            goto L_0x00ac
        L_0x00a8:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()     // Catch:{ all -> 0x00ad }
        L_0x00ac:
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133146Wy.A02(X.6Wy, int[]):void");
    }

    public static final synchronized boolean A03(C133146Wy r3, C98244r7 r4, C128096Aw r5) {
        boolean z;
        synchronized (r3) {
            z = false;
            int i = r4.A00;
            if (i > r3.A04) {
                r3.A04 = i;
                r3.A09 = r5.A00;
                r3.A0C = r5.A01;
                r3.A0G.removeAll(r4.A01);
                z = true;
            }
            if (AnonymousClass00C.A0J(r3.A0B, r4)) {
                r3.A0B = null;
            }
        }
        return z;
    }

    public void A04(C118805ol r6) {
        C115115iM r0;
        synchronized (this) {
            this.A0G.add(r6);
            r0 = this.A02;
        }
        if (r0 != null) {
            C91614cK r4 = this.A0E;
            Object obj = this.A0F;
            r4.removeCallbacksAndMessages(obj);
            r4.postAtTime(new AnonymousClass75B(this), obj, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r1 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        A03(r13, r1, (X.C128096Aw) r1.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        A02(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int[] r14, long r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.A0D     // Catch:{ all -> 0x00a5 }
            r4 = 1
            r7 = r15
            if (r0 == 0) goto L_0x002b
            long r1 = r13.A07     // Catch:{ all -> 0x00a5 }
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x002b
        L_0x000d:
            X.5vr r5 = r13.A00     // Catch:{ all -> 0x00a5 }
            r6 = 0
            if (r5 == 0) goto L_0x0045
            long r9 = r5.A00     // Catch:{ all -> 0x00a5 }
            com.facebook.rendercore.RenderTreeNode r0 = r5.A02     // Catch:{ all -> 0x00a5 }
            android.graphics.Rect r0 = r0.A03     // Catch:{ all -> 0x00a5 }
            int r1 = r0.width()     // Catch:{ all -> 0x00a5 }
            int r0 = r0.height()     // Catch:{ all -> 0x00a5 }
            long r2 = (long) r1     // Catch:{ all -> 0x00a5 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a5 }
            long r11 = X.C90474aD.A0C(r2, r0)     // Catch:{ all -> 0x00a5 }
            boolean r0 = X.C131696Qd.A02(r7, r9, r11)     // Catch:{ all -> 0x00a5 }
            goto L_0x0030
        L_0x002b:
            r13.A0D = r4     // Catch:{ all -> 0x00a5 }
            r13.A07 = r15     // Catch:{ all -> 0x00a5 }
            goto L_0x000d
        L_0x0030:
            if (r0 == 0) goto L_0x0045
            if (r14 == 0) goto L_0x0087
            com.facebook.rendercore.RenderTreeNode r0 = r5.A02     // Catch:{ all -> 0x00a5 }
            android.graphics.Rect r1 = r0.A03     // Catch:{ all -> 0x00a5 }
            int r0 = r1.width()     // Catch:{ all -> 0x00a5 }
            r14[r6] = r0     // Catch:{ all -> 0x00a5 }
            int r0 = r1.height()     // Catch:{ all -> 0x00a5 }
            r14[r4] = r0     // Catch:{ all -> 0x00a5 }
            goto L_0x0087
        L_0x0045:
            X.6Kq r5 = r13.A0A     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x007d
            X.5vr r0 = r5.A02     // Catch:{ all -> 0x00a5 }
            long r9 = r0.A00     // Catch:{ all -> 0x00a5 }
            com.facebook.rendercore.RenderTreeNode r0 = r0.A02     // Catch:{ all -> 0x00a5 }
            android.graphics.Rect r0 = r0.A03     // Catch:{ all -> 0x00a5 }
            int r1 = r0.width()     // Catch:{ all -> 0x00a5 }
            int r0 = r0.height()     // Catch:{ all -> 0x00a5 }
            long r2 = (long) r1     // Catch:{ all -> 0x00a5 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a5 }
            long r11 = X.C90474aD.A0C(r2, r0)     // Catch:{ all -> 0x00a5 }
            boolean r0 = X.C131696Qd.A02(r7, r9, r11)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x007d
            A00(r13)     // Catch:{ all -> 0x00a5 }
            if (r14 == 0) goto L_0x0087
            X.5vr r0 = r5.A02     // Catch:{ all -> 0x00a5 }
            com.facebook.rendercore.RenderTreeNode r0 = r0.A02     // Catch:{ all -> 0x00a5 }
            android.graphics.Rect r1 = r0.A03     // Catch:{ all -> 0x00a5 }
            int r0 = r1.width()     // Catch:{ all -> 0x00a5 }
            r14[r6] = r0     // Catch:{ all -> 0x00a5 }
            int r0 = r1.height()     // Catch:{ all -> 0x00a5 }
            r14[r4] = r0     // Catch:{ all -> 0x00a5 }
            goto L_0x0087
        L_0x007d:
            X.5iM r0 = r13.A02     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0089
            if (r14 == 0) goto L_0x0087
            r14[r6] = r6     // Catch:{ all -> 0x00a5 }
            r14[r4] = r6     // Catch:{ all -> 0x00a5 }
        L_0x0087:
            monitor-exit(r13)
            return
        L_0x0089:
            X.7ek r0 = r13.A09     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            X.4r7 r1 = r13.A0B     // Catch:{ all -> 0x00a5 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            monitor-exit(r13)
            if (r1 == 0) goto L_0x00a1
            java.lang.Object r0 = r1.A00()
            X.6Aw r0 = (X.C128096Aw) r0
            A03(r13, r1, r0)
        L_0x00a1:
            A02(r13, r14)
            return
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133146Wy.A05(int[], long):void");
    }

    public static final void A01(C133146Wy r10, C115115iM r11) {
        List A15;
        C10810fG r2 = new C10810fG();
        synchronized (r10) {
            if (r11 != null) {
                r10.A02 = r11;
            } else if (r10.A0G.isEmpty()) {
                return;
            }
            C115115iM r6 = r10.A02;
            if (r6 != null) {
                C118625oT r5 = new C118625oT(r10, r10.A0J);
                C157827ek r4 = r10.A09;
                Object obj = r10.A0C;
                List list = r10.A0G;
                if (list.isEmpty()) {
                    A15 = C023409w.A00;
                } else {
                    A15 = C36441kJ.A15(list);
                }
                int i = r10.A06;
                r10.A06 = i + 1;
                C98244r7 r3 = new C98244r7(r4, r5, r6, obj, A15, i);
                r2.element = r3;
                r10.A0B = r3;
                r10.A0K.execute(AnonymousClass74N.A00(r2, r10, 1));
                return;
            }
            throw C36381kD.A0k();
        }
    }
}

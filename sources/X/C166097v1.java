package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.7v1  reason: invalid class name and case insensitive filesystem */
public class C166097v1 extends Handler {
    public static final Object A0F = C36441kJ.A11();
    public int A00 = -1;
    public int A01;
    public Message A02;
    public C195999Xe A03;
    public C195999Xe A04;
    public C192839It A05 = new C192839It();
    public AnonymousClass81O A06;
    public AnonymousClass9TM A07;
    public ArrayList A08;
    public HashMap A09;
    public boolean A0A = false;
    public C194799Rh[] A0B;
    public C194799Rh[] A0C;
    public AnonymousClass81N A0D;
    public boolean A0E;

    public static final C194799Rh A00(C195999Xe r3, C195999Xe r4, C166097v1 r5) {
        C194799Rh r2;
        if (r4 != null) {
            r2 = (C194799Rh) r5.A09.get(r4);
            if (r2 == null) {
                r2 = A00(r4, (C195999Xe) null, r5);
            }
        } else {
            r2 = null;
        }
        HashMap hashMap = r5.A09;
        C194799Rh r1 = (C194799Rh) hashMap.get(r3);
        if (r1 == null) {
            r1 = new C194799Rh(r5);
            hashMap.put(r3, r1);
        }
        C194799Rh r0 = r1.A01;
        if (r0 == null || r0 == r2) {
            r1.A00 = r3;
            r1.A01 = r2;
            r1.A02 = false;
            return r1;
        }
        throw C90514aH.A0s("state already added");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r6 != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r14) {
        /*
            r13 = this;
            boolean r0 = r13.A0A
            if (r0 != 0) goto L_0x01f5
            r13.A02 = r14
            r9 = 0
            boolean r0 = r13.A0E
            if (r0 == 0) goto L_0x0090
            X.9Rh[] r1 = r13.A0B
            int r0 = r13.A00
            r6 = r1[r0]
            int r1 = r14.what
            r0 = -1
            if (r1 != r0) goto L_0x0042
            java.lang.Object r1 = r14.obj
            java.lang.Object r0 = A0F
            if (r1 != r0) goto L_0x0042
            X.81O r0 = r13.A06
            r13.A03 = r0
            if (r6 == 0) goto L_0x0024
        L_0x0022:
            X.9Xe r9 = r6.A00
        L_0x0024:
            X.9Rh[] r1 = r13.A0B
            int r0 = r13.A00
            r0 = r1[r0]
            X.9Xe r10 = r0.A00
            java.lang.Object r1 = r14.obj
            java.lang.Object r0 = A0F
            boolean r0 = X.C36371kC.A1W(r1, r0)
            X.9It r2 = r13.A05
            monitor-enter(r2)
            monitor-exit(r2)
            if (r0 == 0) goto L_0x00fc
            X.9TM r12 = r13.A07
            android.os.Message r8 = r13.A02
            X.9Xe r11 = r13.A03
            monitor-enter(r2)
            goto L_0x00b6
        L_0x0042:
            X.9Xe r8 = r6.A00
            boolean r0 = r8 instanceof X.AnonymousClass81P
            if (r0 == 0) goto L_0x008b
            X.81P r8 = (X.AnonymousClass81P) r8
            java.lang.Object r7 = r14.obj
            java.lang.String r0 = "null cannot be cast to non-null type T of com.facebook.common.debuggablestatemachine.DebuggableState"
            X.AnonymousClass00C.A0E(r7, r0)
            X.81Q r1 = r8.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.9UM r1 = r1.A01
            java.lang.String r5 = X.C90484aE.A0k(r7)
            X.AnonymousClass00C.A08(r5)
            X.9GT r0 = new X.9GT
            r0.<init>(r5)
            r1.A01(r0)
            java.lang.String r4 = "sup:MediaStreamState"
            java.lang.String r3 = r8.A02
            java.lang.String r2 = "[%s] processing %s"
            X.7m1 r1 = X.AnonymousClass6YR.A01
            r0 = 4
            boolean r0 = r1.BMH(r0)
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r3, r5)
            X.AnonymousClass6YR.A06(r4, r0)
        L_0x007e:
            X.9Ur r0 = r8.A01
            boolean r0 = r0.A09(r14, r7)
            if (r0 != 0) goto L_0x0022
        L_0x0086:
            X.9Rh r6 = r6.A01
            if (r6 != 0) goto L_0x0042
            goto L_0x0024
        L_0x008b:
            boolean r0 = r8 instanceof X.AnonymousClass81O
            if (r0 == 0) goto L_0x0022
            goto L_0x0086
        L_0x0090:
            int r1 = r14.what
            r0 = -2
            if (r1 != r0) goto L_0x01d4
            java.lang.Object r1 = r14.obj
            java.lang.Object r0 = A0F
            if (r1 != r0) goto L_0x01d4
            r0 = 1
            r13.A0E = r0
            r2 = 0
        L_0x009f:
            int r0 = r13.A00
            if (r2 > r0) goto L_0x0024
            X.9Rh[] r0 = r13.A0B
            r0 = r0[r2]
            X.9Xe r0 = r0.A00
            r0.A01()
            X.9Rh[] r0 = r13.A0B
            r1 = r0[r2]
            r0 = 1
            r1.A02 = r0
            int r2 = r2 + 1
            goto L_0x009f
        L_0x00b6:
            int r0 = r2.A00     // Catch:{ all -> 0x01d1 }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ all -> 0x01d1 }
            java.util.Vector r3 = r2.A02     // Catch:{ all -> 0x01d1 }
            int r1 = r3.size()     // Catch:{ all -> 0x01d1 }
            r0 = 20
            if (r1 >= r0) goto L_0x00cf
            X.9SD r7 = new X.9SD     // Catch:{ all -> 0x01d1 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01d1 }
            r3.add(r7)     // Catch:{ all -> 0x01d1 }
            goto L_0x00fb
        L_0x00cf:
            int r0 = r2.A01     // Catch:{ all -> 0x01d1 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x01d1 }
            X.9SD r3 = (X.AnonymousClass9SD) r3     // Catch:{ all -> 0x01d1 }
            int r0 = r2.A01     // Catch:{ all -> 0x01d1 }
            int r1 = r0 + 1
            r2.A01 = r1     // Catch:{ all -> 0x01d1 }
            r0 = 20
            if (r1 < r0) goto L_0x00e4
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x01d1 }
        L_0x00e4:
            r3.A05 = r12     // Catch:{ all -> 0x01d1 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01d1 }
            r3.A01 = r0     // Catch:{ all -> 0x01d1 }
            if (r8 == 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r0 = 0
            goto L_0x00f3
        L_0x00f1:
            int r0 = r8.what     // Catch:{ all -> 0x01d1 }
        L_0x00f3:
            r3.A00 = r0     // Catch:{ all -> 0x01d1 }
            r3.A04 = r9     // Catch:{ all -> 0x01d1 }
            r3.A03 = r10     // Catch:{ all -> 0x01d1 }
            r3.A02 = r11     // Catch:{ all -> 0x01d1 }
        L_0x00fb:
            monitor-exit(r2)
        L_0x00fc:
            X.9Xe r5 = r13.A03
            if (r5 == 0) goto L_0x01f5
        L_0x0100:
            r0 = 0
            r13.A01 = r0
            java.util.HashMap r4 = r13.A09
            java.lang.Object r6 = r4.get(r5)
            X.9Rh r6 = (X.C194799Rh) r6
        L_0x010b:
            X.9Rh[] r3 = r13.A0C
            int r1 = r13.A01
            int r0 = r1 + 1
            r13.A01 = r0
            r3[r1] = r6
            X.9Rh r6 = r6.A01
            if (r6 == 0) goto L_0x011d
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x010b
        L_0x011d:
            int r1 = r13.A00
            if (r1 < 0) goto L_0x0169
            X.9Rh[] r0 = r13.A0B
            r0 = r0[r1]
            if (r0 == r6) goto L_0x0169
            X.9Xe r8 = r0.A00
            boolean r0 = r8 instanceof X.AnonymousClass81P
            if (r0 == 0) goto L_0x015b
            X.81P r8 = (X.AnonymousClass81P) r8
            java.lang.String r1 = "sup:MediaStreamState"
            java.lang.String r9 = r8.A02
            java.lang.String r0 = "[%s] exiting state"
            X.AnonymousClass6YR.A03(r9, r1, r0)
            X.81Q r0 = r8.A00
            r7 = 0
            X.9UM r3 = r0.A02
            if (r3 == 0) goto L_0x0156
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r7] = r9
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "Exit state [%s]"
            java.lang.String r1 = X.C90504aG.A0m(r0, r1)
            X.9GT r0 = new X.9GT
            r0.<init>(r1)
            r3.A01(r0)
        L_0x0156:
            X.9Ur r0 = r8.A01
            r0.A08()
        L_0x015b:
            X.9Rh[] r0 = r13.A0B
            int r3 = r13.A00
            r1 = r0[r3]
            r0 = 0
            r1.A02 = r0
            int r0 = r3 + -1
            r13.A00 = r0
            goto L_0x011d
        L_0x0169:
            int r3 = r1 + 1
            int r0 = r13.A01
            int r7 = r0 + -1
            r6 = r3
        L_0x0170:
            if (r7 < 0) goto L_0x017f
            X.9Rh[] r1 = r13.A0B
            X.9Rh[] r0 = r13.A0C
            r0 = r0[r7]
            r1[r6] = r0
            int r6 = r6 + 1
            int r7 = r7 + -1
            goto L_0x0170
        L_0x017f:
            int r0 = r6 + -1
            r13.A00 = r0
        L_0x0183:
            int r0 = r13.A00
            if (r3 > r0) goto L_0x019a
            X.9Rh[] r0 = r13.A0B
            r0 = r0[r3]
            X.9Xe r0 = r0.A00
            r0.A01()
            X.9Rh[] r0 = r13.A0B
            r1 = r0[r3]
            r0 = 1
            r1.A02 = r0
            int r3 = r3 + 1
            goto L_0x0183
        L_0x019a:
            java.util.ArrayList r3 = r13.A08
            int r1 = r3.size()
        L_0x01a0:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x01ae
            java.lang.Object r0 = r3.get(r1)
            android.os.Message r0 = (android.os.Message) r0
            r13.sendMessageAtFrontOfQueue(r0)
            goto L_0x01a0
        L_0x01ae:
            r3.clear()
            X.9Xe r0 = r13.A03
            if (r5 == r0) goto L_0x01b8
            r5 = r0
            goto L_0x0100
        L_0x01b8:
            r0 = 0
            r13.A03 = r0
            if (r5 == 0) goto L_0x01f5
            X.81O r0 = r13.A06
            if (r5 != r0) goto L_0x01f5
            X.9TM r0 = r13.A07
            r1 = 0
            r0.A00 = r1
            r13.A07 = r1
            r13.A02 = r1
            monitor-enter(r2)
            java.util.Vector r0 = r2.A02     // Catch:{ all -> 0x01d1 }
            r0.clear()     // Catch:{ all -> 0x01d1 }
            goto L_0x01e3
        L_0x01d1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StateMachine.handleMessage: The start method not called, received msg: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r14, r0, r1)
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x01e3:
            monitor-exit(r2)
            r13.A0B = r1
            r13.A0C = r1
            r4.clear()
            r13.A04 = r1
            r13.A03 = r1
            r3.clear()
            r0 = 1
            r13.A0A = r0
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166097v1.handleMessage(android.os.Message):void");
    }

    public C166097v1(Looper looper, AnonymousClass9TM r5) {
        super(looper);
        AnonymousClass81N r1 = new AnonymousClass81N(this);
        this.A0D = r1;
        this.A06 = new AnonymousClass81O(this);
        this.A09 = AnonymousClass001.A0J();
        this.A08 = AnonymousClass001.A0I();
        this.A07 = r5;
        A00(r1, (C195999Xe) null, this);
        A00(this.A06, (C195999Xe) null, this);
    }
}

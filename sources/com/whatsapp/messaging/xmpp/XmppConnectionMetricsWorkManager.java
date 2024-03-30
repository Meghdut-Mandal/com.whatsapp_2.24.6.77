package com.whatsapp.messaging.xmpp;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00M;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00U;
import X.AnonymousClass040;
import X.AnonymousClass0A2;
import X.AnonymousClass19S;
import X.AnonymousClass19T;
import X.AnonymousClass19U;
import X.AnonymousClass19V;
import X.AnonymousClass6EH;
import X.AnonymousClass6VR;
import X.C005502l;
import X.C007403e;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C1271667f;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21570zS;
import X.C97384pE;
import X.C97404pG;
import android.os.Build;
import android.os.Handler;

public final class XmppConnectionMetricsWorkManager implements AnonymousClass00M {
    public AnonymousClass00S A00;
    public final C20810yC A01;
    public final C21570zS A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass00T A05 = new AnonymousClass00U(new AnonymousClass19T(this));
    public final AnonymousClass00T A06 = new AnonymousClass00U(new AnonymousClass19U(this));
    public final AnonymousClass00T A07 = new AnonymousClass00U(new AnonymousClass19V(this));
    public final AnonymousClass00T A08 = new AnonymousClass00U(new AnonymousClass19S(this));
    public final C005502l A09;
    public volatile C007403e A0A;

    public XmppConnectionMetricsWorkManager(C20810yC r3, C21570zS r4, AnonymousClass005 r5, AnonymousClass005 r6, C005502l r7) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r7, 5);
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A01 = r3;
        this.A09 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6VR r6, com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r7, java.lang.String r8, X.C023509x r9) {
        /*
            boolean r0 = r9 instanceof X.C1514879s
            if (r0 == 0) goto L_0x006a
            r5 = r9
            X.79s r5 = (X.C1514879s) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006a
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 != r1) goto L_0x0070
            X.AnonymousClass0AN.A00(r2)
        L_0x0020:
            X.AnonymousClass00C.A0A(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = X.C007103b.A0M(r2)
            return r0
        L_0x002a:
            X.AnonymousClass0AN.A00(r2)
            X.4pl r3 = r6.A04(r8)
            X.AnonymousClass00C.A08(r3)
            r5.label = r1
            boolean r0 = r3.isDone()     // Catch:{ ExecutionException -> 0x0078 }
            if (r0 == 0) goto L_0x0041
            java.lang.Object r2 = X.C109755Yz.A00(r3)     // Catch:{ ExecutionException -> 0x0078 }
            goto L_0x0067
        L_0x0041:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0AR.A02
            X.09x r0 = X.AnonymousClass0AA.A01(r5)
            X.0AR r2 = new X.0AR
            r2.<init>(r1, r0)
            r2.A0J()
            r0 = 13
            X.72x r1 = new X.72x
            r1.<init>(r3, r2, r0)
            X.5UP r0 = X.AnonymousClass5UP.A01
            r3.B0P(r1, r0)
            X.7TX r0 = new X.7TX
            r0.<init>(r3)
            r2.BL1(r0)
            java.lang.Object r2 = r2.A0G()
        L_0x0067:
            if (r2 != r4) goto L_0x0020
            return r4
        L_0x006a:
            X.79s r5 = new X.79s
            r5.<init>(r7, r9)
            goto L_0x0012
        L_0x0070:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0078:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            X.AnonymousClass00C.A0B(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager.A00(X.6VR, com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager, java.lang.String, X.09x):java.lang.Object");
    }

    public static final void A01(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager) {
        C97384pE r2 = new C97384pE(XmppLogoutWorker.class);
        if (Build.VERSION.SDK_INT >= 31) {
            r2.A04(C023109s.A00);
        }
        C1271667f r1 = new C1271667f();
        r1.A00 = C023109s.A01;
        r2.A03(r1.A00());
        ((AnonymousClass6VR) xmppConnectionMetricsWorkManager.A02.get()).A07((C97404pG) r2.A00(), C023109s.A00, "xmpp-logout-worker");
    }

    public void A02() {
        Class cls;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (((Boolean) this.A08.getValue()).booleanValue()) {
                AnonymousClass00S r0 = this.A00;
                if (r0 != null) {
                    r0.invoke();
                }
                cls = XmppProcessingAndLogoutWorker.class;
            } else {
                cls = XmppLifecycleWorker.class;
            }
            C97384pE r1 = new C97384pE(cls);
            if (i >= 31) {
                r1.A04(C023109s.A00);
            }
            C1271667f r02 = new C1271667f();
            Integer num = C023109s.A01;
            r02.A00 = num;
            r1.A03(r02.A00());
            ((AnonymousClass6VR) this.A02.get()).A07((C97404pG) r1.A00(), num, "xmpp-lifecycle-worker");
        }
    }

    public void A03(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C20810yC r2 = this.A01;
            if (!C20800yB.A01(C21000yV.A01, r2, 3531)) {
                return;
            }
            if (C20800yB.A01(C21000yV.A02, r2, 7777)) {
                AnonymousClass00T r1 = this.A06;
                ((Handler) r1.getValue()).removeMessages(1);
                ((Handler) r1.getValue()).sendEmptyMessageDelayed(1, ((long) ((Number) this.A07.getValue()).intValue()) * 1000);
            } else if (((Boolean) this.A08.getValue()).booleanValue()) {
                C97384pE r5 = new C97384pE(XmppProcessingAndLogoutWorker.class);
                if (Build.VERSION.SDK_INT >= 31) {
                    r5.A04(C023109s.A00);
                }
                C1271667f r0 = new C1271667f();
                Integer num = C023109s.A01;
                r0.A00 = num;
                r5.A03(r0.A00());
                AnonymousClass6EH r3 = new AnonymousClass6EH();
                r3.A00.put("SKIP_PROCESSING", true);
                r5.A00.A0A = r3.A00();
                ((AnonymousClass6VR) this.A02.get()).A07((C97404pG) r5.A00(), num, "xmpp-lifecycle-worker");
            } else if (!z) {
                A01(this);
            } else if (this.A0A == null) {
                XmppConnectionMetricsWorkManager$startLogoutWork$1 xmppConnectionMetricsWorkManager$startLogoutWork$1 = new XmppConnectionMetricsWorkManager$startLogoutWork$1(this, (C023509x) null);
                C008903u r12 = C008903u.A00;
                this.A0A = AnonymousClass0A2.A02(C023109s.A00, r12, xmppConnectionMetricsWorkManager$startLogoutWork$1, (AnonymousClass040) this.A05.getValue());
            }
        }
    }
}

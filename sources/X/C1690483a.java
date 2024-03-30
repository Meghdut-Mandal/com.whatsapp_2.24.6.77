package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.83a  reason: invalid class name and case insensitive filesystem */
public class C1690483a extends C20970A1g implements C23107B5m, C22874AxV {
    public static final LinkedHashMap A0B = C36431kI.A1G();
    public int A00;
    public final C198549dl A01;
    public final C23112B5r A02;
    public final C198039cn A03;
    public final C204349pr A04;
    public final C204319po A05;
    public final C196809aZ A06;
    public final Handler A07;
    public final AnonymousClass9VM A08;
    public final C191189Bz A09;
    public volatile CountDownLatch A0A;

    public String BBR() {
        return "MediaGraphControllerImpl";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1690483a(X.B3B r22) {
        /*
            r21 = this;
            r13 = r21
            r3 = r22
            r13.<init>(r3)
            X.9VM r12 = new X.9VM
            r12.<init>(r13)
            r13.A08 = r12
            X.9Bz r11 = new X.9Bz
            r11.<init>(r13)
            r13.A09 = r11
            X.94T r1 = X.C23112B5r.A00
            X.B3B r10 = r13.A00
            java.util.Objects.requireNonNull(r10)
            boolean r0 = r10.BLS(r1)
            if (r0 == 0) goto L_0x01e2
            java.util.Objects.requireNonNull(r10)
            X.AxX r0 = r10.B9z(r1)
            X.B5r r0 = (X.C23112B5r) r0
        L_0x002b:
            r13.A02 = r0
            X.94Q r0 = X.B4H.A0A
            java.util.Objects.requireNonNull(r10)
            java.lang.Object r0 = r10.BA0(r0)
            X.9aZ r0 = (X.C196809aZ) r0
            r13.A06 = r0
            X.94Q r0 = X.B4H.A04
            r17 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            java.lang.Object r0 = r13.A04(r0, r2)
            boolean r16 = X.AnonymousClass000.A1X(r0)
            X.9CV r5 = new X.9CV
            r5.<init>()
            X.94R r14 = X.C197489bn.A02
            X.94Q r0 = X.B4H.A02
            java.lang.Object r9 = X.C198039cn.A05
            java.lang.Object r0 = r13.A04(r0, r9)
            java.util.Map r4 = r5.A00
            r4.put(r14, r0)
            X.94R r8 = X.C197489bn.A06
            X.94Q r1 = X.B4H.A0B
            java.lang.Integer r0 = X.C36371kC.A0n()
            java.lang.Object r0 = r13.A04(r1, r0)
            r4.put(r8, r0)
            X.94R r1 = X.C197489bn.A01
            X.94Q r0 = X.B4H.A01
            java.lang.Object r0 = r13.A04(r0, r2)
            r4.put(r1, r0)
            X.94R r7 = X.C197489bn.A03
            X.94Q r0 = X.B4H.A06
            java.lang.Object r0 = r13.A04(r0, r2)
            r4.put(r7, r0)
            X.94R r0 = X.C197489bn.A0A
            X.94Q r1 = X.B4H.A03
            java.util.Objects.requireNonNull(r10)
            java.lang.Object r1 = r10.BA0(r1)
            r4.put(r0, r1)
            X.94R r6 = X.C197489bn.A04
            X.94Q r1 = X.B4H.A08
            java.lang.Boolean r15 = X.C36371kC.A0m()
            java.lang.Object r1 = r13.A04(r1, r15)
            r4.put(r6, r1)
            X.94R r6 = X.C197489bn.A08
            X.94Q r1 = X.B4H.A0C
            java.lang.Object r1 = r13.A04(r1, r15)
            r4.put(r6, r1)
            X.94R r6 = X.C197489bn.A0C
            if (r16 != 0) goto L_0x01df
            r13.A03()
            r1 = 0
        L_0x00b3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.put(r6, r1)
            X.94R r6 = X.C197489bn.A0B
            if (r16 != 0) goto L_0x01dc
            r13.A03()
            r1 = 0
        L_0x00c2:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.put(r6, r1)
            X.94R r6 = X.C197489bn.A0D
            if (r16 != 0) goto L_0x01d8
            r13.A03()
        L_0x00d0:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            r4.put(r6, r1)
            X.94R r6 = X.C197489bn.A07
            boolean r1 = r13.A03()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.put(r6, r1)
            X.94R r6 = X.C197489bn.A05
            boolean r1 = r13.A03()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.put(r6, r1)
            X.94Q r1 = X.B4H.A05
            java.lang.Object r1 = r13.A04(r1, r2)
            boolean r1 = X.AnonymousClass000.A1X(r1)
            if (r1 != 0) goto L_0x01bc
            r13.A03()
        L_0x0100:
            java.util.Objects.requireNonNull(r10)
            android.content.Context r15 = r10.getContext()
            X.9bn r4 = new X.9bn
            r4.<init>(r5)
            X.94Q r2 = X.B4H.A07
            X.94S r1 = new X.94S
            r1.<init>()
            java.lang.Object r2 = r13.A04(r2, r1)
            X.94S r2 = (X.AnonymousClass94S) r2
            X.9Bx r1 = new X.9Bx
            r1.<init>(r13)
            X.9cn r6 = new X.9cn
            r6.<init>(r15, r1, r4, r2)
            r13.A03 = r6
            X.94Q r2 = X.B4H.A00
            X.9dl r1 = new X.9dl
            r1.<init>()
            java.lang.Object r5 = r13.A04(r2, r1)
            X.9dl r5 = (X.C198549dl) r5
            r13.A01 = r5
            android.os.Handler r1 = X.C1894193s.A00(r3)
            r13.A07 = r1
            android.os.Looper r16 = r1.getLooper()
            android.content.Context r15 = r6.A01
            X.9bn r4 = r6.A03
            X.94S r3 = r6.A04
            X.9Bx r2 = r6.A02
            java.util.Map r1 = r4.A00
            java.lang.Object r0 = r1.get(r0)
            X.6Xg r0 = (X.C133216Xg) r0
            if (r0 != 0) goto L_0x015e
            java.lang.Object r0 = r1.get(r7)
            java.util.Objects.requireNonNull(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x0199
            r0 = 0
        L_0x015e:
            X.9jv r14 = new X.9jv
            r19 = r4
            r20 = r3
            r17 = r2
            r18 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.9pp r0 = r14.A07
            r0.A00 = r11
            X.9pr r4 = new X.9pr
            r4.<init>(r12, r5, r14)
            r13.A04 = r4
            X.9dl r3 = r13.A01
            X.9jv r2 = r4.A05
            X.B5r r0 = r13.A02
            X.9Xt r1 = new X.9Xt
            r1.<init>(r3, r0, r2)
            X.9po r0 = new X.9po
            r0.<init>(r1, r4)
            r13.A05 = r0
            X.94Q r0 = X.B4H.A09
            java.util.Objects.requireNonNull(r10)
            java.lang.Object r0 = r10.BA0(r0)
            X.A1y r0 = (X.C20984A1y) r0
            if (r0 == 0) goto L_0x0198
            A02(r13, r0)
        L_0x0198:
            return
        L_0x0199:
            X.6Xg r0 = r6.A00
            if (r0 != 0) goto L_0x01b9
            java.lang.Object r0 = r1.get(r14)
            if (r0 == 0) goto L_0x01a4
            r9 = r0
        L_0x01a4:
            java.lang.Object r0 = r1.get(r8)
            java.util.Objects.requireNonNull(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            X.6Xg r1 = X.AnonymousClass6UN.A01(r9, r0)
            r6.A00 = r1
            r0 = 1
            r1.A06(r0)
        L_0x01b9:
            X.6Xg r0 = r6.A00
            goto L_0x015e
        L_0x01bc:
            X.94T r1 = X.C23111B5q.A00
            java.util.Objects.requireNonNull(r10)
            X.AxX r2 = r10.B9z(r1)
            X.B5q r2 = (X.C23111B5q) r2
            java.lang.String r1 = "Lite-GPU-Monitor-Thread"
            android.os.Handler r1 = r2.BCG(r1)
            android.os.Looper r2 = r1.getLooper()
            X.94R r1 = X.C197489bn.A09
            r4.put(r1, r2)
            goto L_0x0100
        L_0x01d8:
            r17 = 1
            goto L_0x00d0
        L_0x01dc:
            r1 = 1
            goto L_0x00c2
        L_0x01df:
            r1 = 1
            goto L_0x00b3
        L_0x01e2:
            r0 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690483a.<init>(X.B3B):void");
    }

    public static C196119Xt A00(C20973A1j a1j) {
        C196119Xt r0 = ((C1690483a) ((C23107B5m) a1j.B9y(C23107B5m.A00))).A05.A02;
        AnonymousClass00C.A08(r0);
        return r0;
    }

    public static void A01(C1690483a r9, AnonymousClass88Q r10) {
        String str;
        C23112B5r b5r = r9.A02;
        if (b5r != null) {
            AnonymousClass88Q r3 = r10;
            Throwable cause = r10.getCause();
            if ((cause instanceof Error) || (cause instanceof RuntimeException)) {
                str = "high";
            } else {
                str = "medium";
            }
            b5r.BOt(r3, "media_pipeline_error", "MediaGraphControllerImpl", str, "MediaGraphControllerImpl", (Map) null, (long) r9.hashCode());
        }
    }

    public static void A02(C1690483a r4, C20984A1y a1y) {
        C204349pr r3 = r4.A04;
        Handler handler = r3.A01;
        if (handler.getLooper() != Looper.myLooper()) {
            handler.sendMessage(Message.obtain(r3.A05.A00, 4, a1y));
        } else {
            C204349pr.A00(a1y, r3);
        }
        C20984A1y a1y2 = r3.A00;
        if (a1y2 != null) {
            Objects.requireNonNull(a1y2);
        }
        C204319po r1 = r4.A05;
        Objects.requireNonNull(r1);
        C196119Xt r2 = new C191179By(r1).A00.A02;
        r2.A01(new C23192B9a(a1y, 0), 0);
        r2.A01(new C23192B9a(a1y, 1), 1);
    }

    private boolean A03() {
        AnonymousClass94T r2 = C23110B5p.A00;
        B3B b3b = this.A00;
        Objects.requireNonNull(b3b);
        if (!b3b.BLS(r2)) {
            return false;
        }
        Objects.requireNonNull(b3b);
        b3b.B9z(r2);
        return false;
    }

    public void Bo5(Long l) {
        C204319po r1 = this.A05;
        if (r1.A03.A03.A01.A02 != null) {
            System.nanoTime();
        }
        Handler handler = r1.A01;
        Message obtain = Message.obtain(handler, 1);
        Objects.requireNonNull(obtain);
        handler.sendMessage(obtain);
    }

    public void Bwt(int i, int i2, int i3, int i4, int i5, boolean z) {
        C204349pr r2 = this.A05.A03;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        boolean z2 = z;
        r2.A02.put(0, new AnonymousClass9MK(i6, i7, i8, i9, z2));
        C20984A1y a1y = r2.A00;
        if (a1y != null) {
            try {
                a1y.A04(0, i6, i7, i8, i9, z2);
            } catch (Exception e) {
                r2.A03.A00(e);
            }
        }
    }

    public C1691688a BDJ() {
        return C23107B5m.A00;
    }
}

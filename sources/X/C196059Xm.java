package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.9Xm  reason: invalid class name and case insensitive filesystem */
public class C196059Xm {
    public final AnonymousClass9GP A00 = new AnonymousClass9GP();
    public final C197729cH A01 = new C197729cH();
    public final HashMap A02 = AnonymousClass001.A0J();

    public void A00(B2I b2i) {
        AnonymousClass905 r0;
        C197729cH r2 = this.A01;
        B2I[] b2iArr = r2.A01;
        switch (((C23229BAl) b2i).A01) {
            case 0:
                r0 = AnonymousClass905.INPUT_PREVIEW;
                break;
            case 1:
                r0 = AnonymousClass905.EXTERNAL_WORLD_TRACKING_EVENT;
                break;
            default:
                r0 = AnonymousClass905.PLATFORM_ALGORITHM_DATA_EVENT;
                break;
        }
        b2iArr[r0.ordinal()] = b2i;
        C197729cH.A00(r2);
    }

    public void A02(C23015B0g b0g, AnonymousClass905 r8) {
        AnonymousClass9GO r1;
        AnonymousClass9VB r5 = this.A00.A00;
        List list = r5.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                r1 = new AnonymousClass9GO(b0g);
                r5.A01(r1);
                break;
            }
            r1 = (AnonymousClass9GO) list.get(i);
            if (r1.A00 == b0g) {
                break;
            }
            i++;
        }
        r1.A01.add(r8);
        C197729cH r3 = this.A01;
        if (r8.shouldNotifyEventListenerRegistration) {
            int ordinal = r8.ordinal();
            r3.A02[ordinal] = true;
            B2I[] b2iArr = r3.A01;
            if (b2iArr[ordinal] != null && r3.A00.get()) {
                b2iArr[ordinal].B6O();
            }
        }
        C22884Axf axf = (C22884Axf) this.A02.get(r8);
        if (axf != null) {
            b0g.Beh(axf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r4 = r8.ordinal();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C23015B0g r7, X.AnonymousClass905 r8) {
        /*
            r6 = this;
            X.9GP r0 = r6.A00
            X.9VB r5 = r0.A00
            java.util.List r4 = r5.A00
            int r3 = r4.size()
            r2 = 0
        L_0x000b:
            if (r2 >= r3) goto L_0x0025
            java.lang.Object r1 = r4.get(r2)
            X.9GO r1 = (X.AnonymousClass9GO) r1
            X.B0g r0 = r1.A00
            if (r0 != r7) goto L_0x003f
            java.util.HashSet r0 = r1.A01
            r0.remove(r8)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0025
            r5.A02(r1)
        L_0x0025:
            java.util.List r3 = r5.A00
            int r2 = r3.size()
            r1 = 0
        L_0x002c:
            if (r1 >= r2) goto L_0x0042
            java.lang.Object r0 = r3.get(r1)
            X.9GO r0 = (X.AnonymousClass9GO) r0
            java.util.HashSet r0 = r0.A01
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0083
            int r1 = r1 + 1
            goto L_0x002c
        L_0x003f:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0042:
            X.9cH r1 = r6.A01
            boolean r0 = r8.shouldNotifyEventListenerRegistration
            if (r0 == 0) goto L_0x0083
            int r4 = r8.ordinal()
            X.B2I[] r0 = r1.A01
            r2 = r0[r4]
            if (r2 == 0) goto L_0x0083
            boolean[] r1 = r1.A02
            boolean r0 = r1[r4]
            if (r0 == 0) goto L_0x0083
            r3 = 0
            r1[r4] = r3
            X.BAl r2 = (X.C23229BAl) r2
            int r0 = r2.A01
            if (r0 != 0) goto L_0x0083
            java.lang.Object r0 = r2.A00
            X.A1y r0 = (X.C20984A1y) r0
            X.A1u r2 = r0.A0G
            if (r2 == 0) goto L_0x0083
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0083
            X.9pj r0 = r2.A05
            r0.A0D = r3
            android.os.Handler r1 = r0.A05
            java.lang.Runnable r0 = r0.A07
            r1.post(r0)
            X.A23 r1 = r2.A00
            if (r1 == 0) goto L_0x0081
            X.A1x r0 = r2.A01
            r0.A02(r1)
        L_0x0081:
            r2.A03 = r3
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196059Xm.A03(X.B0g, X.905):void");
    }

    public void A01(C22884Axf axf, C23015B0g b0g) {
        AnonymousClass905 BIb = axf.BIb();
        if (BIb.isCacheableEvent) {
            this.A02.put(BIb, axf);
        }
        AnonymousClass9GP r1 = this.A00;
        if (r1.A01.get()) {
            List list = r1.A00.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass9GO r12 = (AnonymousClass9GO) list.get(i);
                if ((b0g == null || b0g == r12.A00) && r12.A01.contains(BIb)) {
                    r12.A00.Beh(axf);
                }
            }
        }
    }
}

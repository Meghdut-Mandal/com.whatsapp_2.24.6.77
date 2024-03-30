package X;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.19c  reason: invalid class name and case insensitive filesystem */
public class C236019c {
    public final C21010yW A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final AnonymousClass173 A02;
    public final C19970wo A03;
    public volatile C21700zf A04;

    public static C21700zf A00(C236019c r4) {
        if (r4.A04 == null) {
            synchronized (r4) {
                if (r4.A04 == null) {
                    AnonymousClass173 r3 = r4.A02;
                    C21710zg r1 = new C21710zg(154475307);
                    r1.A04 = r1.A04;
                    r1.A03 = false;
                    r4.A04 = r3.A01(r1, "IqPerfTracker");
                }
            }
        }
        return r4.A04;
    }

    public void A01(Integer num, String str, int i) {
        C194009Nt r5 = (C194009Nt) this.A01.get(str);
        if (r5 != null && r5.A06 == 0) {
            r5.A06 = SystemClock.uptimeMillis();
            r5.A01 = Integer.valueOf(i);
            r5.A02 = num;
            C21700zf A002 = A00(this);
            int hashCode = str.hashCode();
            A002.A01(hashCode, "iq_send");
            A00(this).A02(hashCode, "iq_processing_queue");
        }
    }

    public void A02(String str) {
        C194009Nt r5 = (C194009Nt) this.A01.get(str);
        if (r5 != null && r5.A03 == 0) {
            r5.A03 = SystemClock.uptimeMillis();
            C21700zf A002 = A00(this);
            int hashCode = str.hashCode();
            A002.A01(hashCode, "iq_processing_queue");
            A00(this).A02(hashCode, "iq_processing");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.String r8, java.lang.Integer r9) {
        /*
            r7 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r7.A01
            java.lang.Object r5 = r0.remove(r8)
            X.9Nt r5 = (X.C194009Nt) r5
            if (r5 == 0) goto L_0x008c
            long r1 = r5.A04
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.A04 = r0
            if (r9 == 0) goto L_0x001c
            r5.A01 = r9
        L_0x001c:
            X.2Rv r6 = new X.2Rv
            r6.<init>()
            int r0 = r5.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A06 = r0
            long r2 = r5.A07
            long r0 = r5.A05
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A04 = r0
            long r2 = r5.A06
            long r0 = r5.A07
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A01 = r0
            long r2 = r5.A04
            long r0 = r5.A03
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A02 = r0
            long r2 = r5.A04
            long r0 = r5.A06
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A03 = r0
            long r2 = r5.A04
            long r0 = r5.A05
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A05 = r0
            java.lang.Integer r0 = r5.A01
            r3 = 1
            if (r0 != 0) goto L_0x008d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x006a:
            r6.A00 = r0
        L_0x006c:
            X.0yW r0 = r7.A00
            r0.Bly(r6)
            X.0zf r1 = A00(r7)
            int r3 = r8.hashCode()
            java.lang.String r0 = "iq_processing"
            r1.A01(r3, r0)
            X.0zf r2 = A00(r7)
            java.lang.Integer r1 = r5.A01
            r0 = 2
            if (r1 == 0) goto L_0x0089
            r0 = 87
        L_0x0089:
            r2.A04(r3, r0)
        L_0x008c:
            return
        L_0x008d:
            int r2 = r0.intValue()
            r1 = 2
            r0 = 3
            if (r0 == r2) goto L_0x009e
            if (r1 == r2) goto L_0x009e
            if (r3 == r2) goto L_0x009e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x006a
        L_0x009e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A00 = r0
            java.lang.Integer r0 = r5.A02
            if (r0 == 0) goto L_0x006c
            int r0 = r0.intValue()
            long r3 = (long) r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006c
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r6.A07 = r0
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C236019c.A03(java.lang.String, java.lang.Integer):void");
    }

    public C236019c(AnonymousClass173 r2, C19970wo r3, C21010yW r4) {
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = r2;
    }
}

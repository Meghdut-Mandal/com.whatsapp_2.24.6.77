package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6XD  reason: invalid class name */
public abstract class AnonymousClass6XD {
    public static final AnonymousClass6QC A00 = new AnonymousClass6QC(0.0f, 0.0f, 10.0f, 10.0f);

    public static final String A00(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3.A09 == null) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.graphics.Region r14, android.graphics.Region r15, X.AnonymousClass6WV r16, X.AnonymousClass6WV r17, java.util.Map r18) {
        /*
            r4 = r17
            X.6gp r3 = r4.A04
            X.6Et r0 = r3.A0P
            X.4ih r0 = r0.A0G
            boolean r0 = r0.A0C
            r5 = 1
            if (r0 == 0) goto L_0x0012
            X.7mZ r0 = r3.A09
            r2 = 0
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            r10 = r14
            boolean r0 = r14.isEmpty()
            r6 = r16
            if (r0 == 0) goto L_0x0022
            int r1 = r4.A02
            int r0 = r6.A02
            if (r1 != r0) goto L_0x0028
        L_0x0022:
            if (r2 == 0) goto L_0x0029
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            X.72a r2 = r4.A05
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x012c
            X.7nY r0 = X.AnonymousClass6GA.A00(r3)
            if (r0 == 0) goto L_0x012c
        L_0x0035:
            X.7bY r0 = (X.AnonymousClass7bY) r0
            X.6gq r0 = (X.C137856gq) r0
            X.6gq r1 = r0.A03
            X.62Q r0 = X.C114195gp.A08
            java.lang.Object r0 = X.AnonymousClass5XP.A02(r2, r0)
            boolean r2 = X.AnonymousClass000.A1V(r0)
            X.6gq r1 = r1.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0128
            X.4iy r3 = r1.A05
            X.AnonymousClass00C.A0B(r3)
            if (r2 != 0) goto L_0x00ae
            X.7la r0 = X.C109155Wm.A00(r3)
            X.6QC r7 = r0.BOQ(r3, r5)
        L_0x005a:
            float r0 = r7.A01
            int r11 = X.C14960mT.A01(r0)
            float r0 = r7.A03
            int r12 = X.C14960mT.A01(r0)
            float r0 = r7.A02
            int r13 = X.C14960mT.A01(r0)
            float r0 = r7.A00
            int r14 = X.C14960mT.A01(r0)
            r15.set(r11, r12, r13, r14)
            int r2 = r4.A02
            int r0 = r6.A02
            r7 = -1
            if (r2 != r0) goto L_0x007d
            r2 = -1
        L_0x007d:
            android.graphics.Region$Op r0 = android.graphics.Region.Op.INTERSECT
            boolean r0 = r15.op(r10, r0)
            r3 = r18
            if (r0 == 0) goto L_0x013c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Rect r1 = r15.getBounds()
            X.5nk r0 = new X.5nk
            r0.<init>(r1, r4)
            r3.put(r2, r0)
            r0 = 0
            java.util.List r2 = X.AnonymousClass6WV.A00(r4, r0, r5)
            int r1 = X.C36421kH.A06(r2, r5)
        L_0x00a0:
            if (r7 >= r1) goto L_0x0130
            java.lang.Object r0 = r2.get(r1)
            X.6WV r0 = (X.AnonymousClass6WV) r0
            A01(r10, r15, r6, r0, r3)
            int r1 = r1 + -1
            goto L_0x00a0
        L_0x00ae:
            X.6gq r0 = r3.A0M()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0128
            X.7la r2 = X.C109155Wm.A00(r3)
            X.675 r7 = r3.A02
            if (r7 != 0) goto L_0x00c5
            X.675 r7 = new X.675
            r7.<init>()
            r3.A02 = r7
        L_0x00c5:
            X.7ni r8 = r3.A08
            X.6gp r0 = r3.A0G
            X.7k5 r0 = r0.A0A
            long r0 = r0.BEJ()
            long r0 = r8.Bvs(r0)
            long r8 = r3.A0L(r0)
            float r0 = X.AnonymousClass6X0.A01(r8)
            float r0 = -r0
            r7.A01 = r0
            float r0 = X.AnonymousClass6X0.A00(r8)
            float r0 = -r0
            r7.A03 = r0
            int r0 = r3.A0C()
            float r1 = (float) r0
            float r0 = X.AnonymousClass6X0.A01(r8)
            float r1 = r1 + r0
            r7.A02 = r1
            int r0 = r3.A0B()
            float r1 = (float) r0
            float r0 = X.AnonymousClass6X0.A00(r8)
            float r1 = r1 + r0
            r7.A00 = r1
        L_0x00fd:
            if (r3 == r2) goto L_0x0119
            r0 = 0
            r3.A0T(r7, r0, r5)
            float r1 = r7.A01
            float r0 = r7.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0128
            float r1 = r7.A03
            float r0 = r7.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0128
            X.4iy r3 = r3.A06
            X.AnonymousClass00C.A0B(r3)
            goto L_0x00fd
        L_0x0119:
            float r3 = r7.A01
            float r2 = r7.A03
            float r1 = r7.A02
            float r0 = r7.A00
            X.6QC r7 = new X.6QC
            r7.<init>(r3, r2, r1, r0)
            goto L_0x005a
        L_0x0128:
            X.6QC r7 = X.AnonymousClass6QC.A04
            goto L_0x005a
        L_0x012c:
            X.6gq r0 = r4.A03
            goto L_0x0035
        L_0x0130:
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x0028
            android.graphics.Region$Op r15 = android.graphics.Region.Op.DIFFERENCE
            r10.op(r11, r12, r13, r14, r15)
            return
        L_0x013c:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0183
            X.6WV r1 = r4.A08()
            if (r1 == 0) goto L_0x0180
            X.6gp r0 = r1.A04
            if (r0 == 0) goto L_0x0180
            X.6Et r0 = r0.A0P
            X.4ih r0 = r0.A0G
            boolean r0 = r0.A0C
            if (r0 != r5) goto L_0x0180
            X.6QC r1 = r1.A04()
        L_0x0156:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            float r0 = r1.A01
            int r6 = X.C14960mT.A01(r0)
            float r0 = r1.A03
            int r5 = X.C14960mT.A01(r0)
            float r0 = r1.A02
            int r2 = X.C14960mT.A01(r0)
            float r0 = r1.A00
            int r0 = X.C14960mT.A01(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r5, r2, r0)
            X.5nk r0 = new X.5nk
            r0.<init>(r1, r4)
            r3.put(r7, r0)
            return
        L_0x0180:
            X.6QC r1 = A00
            goto L_0x0156
        L_0x0183:
            if (r2 != r7) goto L_0x0028
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.graphics.Rect r1 = r15.getBounds()
            X.5nk r0 = new X.5nk
            r0.<init>(r1, r4)
            r3.put(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XD.A01(android.graphics.Region, android.graphics.Region, X.6WV, X.6WV, java.util.Map):void");
    }

    public static final void A02(C92404dt r2, int i) {
        Object obj;
        Iterator A10 = C36371kC.A10(r2.A00);
        do {
            obj = null;
            if (!A10.hasNext()) {
                break;
            }
            obj = A10.next();
        } while (((C137846gp) ((Map.Entry) obj).getKey()).A01 != i);
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            entry.getValue();
        }
    }

    public static final boolean A05(AnonymousClass6WV r1) {
        C1496172a r12 = r1.A05;
        if (r12.A01) {
            return true;
        }
        Set<AnonymousClass62Q> keySet = r12.A02.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        for (AnonymousClass62Q r0 : keySet) {
            if (r0.A00) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A03(C137846gp r3, C137846gp r4) {
        C137846gp A0A = r4.A0A();
        if (A0A == null) {
            return false;
        }
        if (A0A.equals(r3) || A03(r3, A0A)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(AnonymousClass6WV r1) {
        return AnonymousClass000.A1W(AnonymousClass5XP.A02(r1.A07(), C114205gq.A03));
    }
}

package X;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.6hA  reason: invalid class name and case insensitive filesystem */
public final class C138036hA implements C159897k6 {
    public AnonymousClass62R A00;
    public final int A01;
    public final AnonymousClass6V8 A02;
    public final AnonymousClass6TJ A03;
    public final C157027bi A04;
    public final C91764ca A05;
    public final CharSequence A06;
    public final C161937ni A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B = AnonymousClass000.A1X(C112525e2.A00.getValue());

    public boolean BCJ() {
        AnonymousClass62R r0 = this.A00;
        if ((r0 == null || !r0.A00()) && (this.A0B || !AnonymousClass000.A1X(C112525e2.A00.getValue()))) {
            return false;
        }
        return true;
    }

    public float BDt() {
        return this.A03.A01();
    }

    public float BEH() {
        AnonymousClass6TJ r5 = this.A03;
        float f = r5.A00;
        if (Float.isNaN(f)) {
            CharSequence charSequence = r5.A05;
            TextPaint textPaint = r5.A04;
            BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
            lineInstance.setText(new AnonymousClass75P(charSequence, charSequence.length()));
            PriorityQueue priorityQueue = new PriorityQueue(10, C1504475h.A00);
            int i = 0;
            for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
                if (priorityQueue.size() >= 10) {
                    AnonymousClass011 r0 = (AnonymousClass011) priorityQueue.peek();
                    if (r0 != null && C90474aD.A08(r0) - C90484aE.A0H(r0) < next - i) {
                        priorityQueue.poll();
                    }
                    i = next;
                }
                priorityQueue.add(C36421kH.A0j(Integer.valueOf(i), next));
                i = next;
            }
            f = 0.0f;
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                AnonymousClass011 r02 = (AnonymousClass011) it.next();
                f = Math.max(f, Layout.getDesiredWidth(charSequence, C90484aE.A0H(r02), C90474aD.A08(r02), textPaint));
            }
            r5.A00 = f;
        }
        return f;
    }

    public static final float A00(C161937ni r5, float f, long j) {
        float A002;
        long A012 = AnonymousClass6WI.A01(j);
        if (A012 == 4294967296L) {
            if (((double) r5.BC0()) <= 1.05d) {
                return r5.Bvp(j);
            }
            A002 = C90464aC.A00(j) / C90464aC.A00(r5.Bvt(f));
        } else if (A012 != 8589934592L) {
            return Float.NaN;
        } else {
            A002 = C90464aC.A00(j);
        }
        return A002 * f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: android.text.Spannable} */
    /* JADX WARNING: type inference failed for: r1v27, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06d3, code lost:
        r1 = X.AnonymousClass68T.A00(r3.A01.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06e9, code lost:
        if (r1 == 1) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0189, code lost:
        if (X.C90464aC.A00(r3) != 0.0f) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0195, code lost:
        if (r1 == X.C133336Xx.A04) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01de, code lost:
        if (X.AnonymousClass6U3.A03(r6.A04) != false) goto L_0x01e0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x06a0  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06a3  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x06b7  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x06bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C138036hA(X.AnonymousClass6V8 r56, X.C157027bi r57, X.C161937ni r58, java.lang.String r59, java.util.List r60, java.util.List r61) {
        /*
            r55 = this;
            r16 = r60
            r0 = r55
            r0.<init>()
            r1 = r59
            r0.A08 = r1
            r3 = r56
            r0.A02 = r3
            r1 = r16
            r0.A0A = r1
            r1 = r61
            r0.A09 = r1
            r1 = r57
            r0.A04 = r1
            r8 = r58
            r0.A07 = r8
            float r1 = r8.BAy()
            X.4ca r7 = new X.4ca
            r7.<init>(r1)
            r0.A05 = r7
            r5 = 0
            X.6fZ r1 = X.C112525e2.A00
            java.lang.Object r1 = r1.getValue()
            boolean r1 = X.AnonymousClass000.A1X(r1)
            r0.A0B = r1
            X.6Eq r2 = r3.A00
            int r10 = r2.A03
            X.6FJ r6 = r3.A02
            X.75Q r3 = r6.A09
            r1 = 4
            if (r10 == r1) goto L_0x06eb
            r9 = 0
            r4 = 1
            r1 = 5
            if (r10 == r1) goto L_0x06ee
            if (r10 == r4) goto L_0x004d
            r1 = 2
            if (r10 != r1) goto L_0x06c3
            r9 = 1
        L_0x004d:
            r0.A01 = r9
            X.7aO r10 = new X.7aO
            r10.<init>(r0)
            X.6P7 r4 = r2.A07
            if (r4 != 0) goto L_0x005a
            X.6P7 r4 = X.AnonymousClass6P7.A02
        L_0x005a:
            boolean r2 = r4.A01
            int r1 = r7.getFlags()
            if (r2 == 0) goto L_0x06bf
            r1 = r1 | 128(0x80, float:1.794E-43)
        L_0x0064:
            r7.setFlags(r1)
            int r2 = r4.A00
            r1 = 1
            if (r2 != r1) goto L_0x06b7
            int r1 = r7.getFlags()
            r1 = r1 | 64
            r7.setFlags(r1)
            r7.setHinting(r5)
        L_0x0078:
            boolean r15 = X.C36401kF.A1a(r16)
            long r1 = r6.A01
            long r13 = X.AnonymousClass6WI.A01(r1)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x06a3
            float r4 = r8.Bvp(r1)
        L_0x008f:
            r7.setTextSize(r4)
        L_0x0092:
            X.6Im r11 = r6.A05
            if (r11 != 0) goto L_0x009e
            X.68R r1 = r6.A06
            if (r1 != 0) goto L_0x009e
            X.72W r1 = r6.A08
            if (r1 == 0) goto L_0x00c3
        L_0x009e:
            X.72W r9 = r6.A08
            if (r9 != 0) goto L_0x00a4
            X.72W r9 = X.AnonymousClass72W.A03
        L_0x00a4:
            X.68R r1 = r6.A06
            if (r1 == 0) goto L_0x06a0
            int r1 = r1.A00
        L_0x00aa:
            X.68R r4 = new X.68R
            r4.<init>(r1)
            X.68S r1 = r6.A07
            if (r1 == 0) goto L_0x069d
            int r2 = r1.A00
        L_0x00b5:
            X.68S r1 = new X.68S
            r1.<init>(r2)
            java.lang.Object r1 = r10.BKu(r11, r9, r4, r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r7.setTypeface(r1)
        L_0x00c3:
            if (r3 == 0) goto L_0x00da
            X.7e4 r4 = X.C129656Hy.A00
            X.75Q r1 = r4.BAX()
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x00da
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r2 < r1) goto L_0x0681
            X.AnonymousClass6GF.A01(r3, r7)
        L_0x00da:
            java.lang.String r2 = r6.A0E
            if (r2 == 0) goto L_0x00e9
            java.lang.String r1 = ""
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00e9
            r7.setFontFeatureSettings(r2)
        L_0x00e9:
            X.6TV r3 = r6.A0D
            if (r3 == 0) goto L_0x0109
            X.6TV r1 = X.AnonymousClass6TV.A02
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0109
            float r2 = r7.getTextScaleX()
            float r1 = r3.A00
            float r2 = r2 * r1
            r7.setTextScaleX(r2)
            float r2 = r7.getTextSkewX()
            float r1 = r3.A01
            float r2 = r2 + r1
            r7.setTextSkewX(r2)
        L_0x0109:
            X.7mU r3 = r6.A0C
            long r1 = r3.B9t()
            long r34 = X.C133336Xx.A05
            int r4 = (r1 > r34 ? 1 : (r1 == r34 ? 0 : -1))
            if (r4 == 0) goto L_0x0124
            X.7iI r4 = r7.A03
            r4.BqV(r1)
            r2 = 0
            X.6g6 r4 = (X.C137416g6) r4
            r4.A02 = r2
            android.graphics.Paint r1 = r4.A01
            r1.setShader(r2)
        L_0x0124:
            X.5zS r4 = r3.B8w()
            long r1 = X.AnonymousClass6X0.A01
            float r3 = r3.B8b()
            r7.A01(r4, r3, r1)
            X.6PD r1 = r6.A03
            r7.A02(r1)
            X.6Ot r1 = r6.A0B
            r7.A04(r1)
            X.5Wf r1 = r6.A04
            r7.A03(r1)
            long r3 = r6.A02
            long r13 = X.AnonymousClass6WI.A01(r3)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x066b
            float r1 = X.C90464aC.A00(r3)
            r11 = 0
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x066b
            float r9 = r7.getTextSize()
            float r1 = r7.getTextScaleX()
            float r9 = r9 * r1
            float r2 = r8.Bvp(r3)
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x016d
            float r2 = r2 / r9
            r7.setLetterSpacing(r2)
        L_0x016d:
            long r1 = r6.A00
            X.68U r7 = r6.A0A
            r13 = 1
            if (r15 == 0) goto L_0x018b
            long r11 = X.AnonymousClass6WI.A01(r3)
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x018b
            float r8 = X.C90464aC.A00(r3)
            r6 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r11 = 1
            if (r6 != 0) goto L_0x018c
        L_0x018b:
            r11 = 0
        L_0x018c:
            int r6 = (r1 > r34 ? 1 : (r1 == r34 ? 0 : -1))
            if (r6 == 0) goto L_0x0197
            long r8 = X.C133336Xx.A04
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r9 = 1
            if (r6 != 0) goto L_0x0198
        L_0x0197:
            r9 = 0
        L_0x0198:
            if (r7 == 0) goto L_0x01a3
            float r8 = r7.A00
            r6 = 0
            int r6 = java.lang.Float.compare(r8, r6)
            if (r6 != 0) goto L_0x01a4
        L_0x01a3:
            r13 = 0
        L_0x01a4:
            r6 = 0
            if (r11 != 0) goto L_0x0610
            if (r9 != 0) goto L_0x060e
            if (r13 != 0) goto L_0x060e
        L_0x01ab:
            java.lang.String r5 = r0.A08
            X.4ca r1 = r0.A05
            float r7 = r1.getTextSize()
            X.6V8 r4 = r0.A02
            java.util.List r1 = r0.A09
            r37 = r1
            X.7ni r1 = r0.A07
            r36 = r1
            X.4cc r1 = X.C112515e1.A00
            r3 = r5
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x01ee
            boolean r1 = r37.isEmpty()
            if (r1 == 0) goto L_0x01ee
            X.6Eq r6 = r4.A00
            X.6P5 r2 = r6.A06
            X.6P5 r1 = X.AnonymousClass6P5.A02
            boolean r1 = X.AnonymousClass00C.A0J(r2, r1)
            if (r1 == 0) goto L_0x01ee
            long r1 = r6.A04
            boolean r1 = X.AnonymousClass6U3.A03(r1)
            if (r1 == 0) goto L_0x01ee
        L_0x01e0:
            r0.A06 = r3
            X.4ca r4 = r0.A05
            int r2 = r0.A01
            X.6TJ r1 = new X.6TJ
            r1.<init>(r4, r3, r2)
            r0.A03 = r1
            return
        L_0x01ee:
            boolean r1 = r5 instanceof android.text.Spannable
            if (r1 != 0) goto L_0x01f6
            android.text.SpannableString r3 = X.C36441kJ.A0O(r5)
        L_0x01f6:
            android.text.Spannable r3 = (android.text.Spannable) r3
            X.6FJ r6 = r4.A02
            X.6Ot r2 = r6.A0B
            X.6Ot r1 = X.C131366Ot.A02
            boolean r1 = X.AnonymousClass00C.A0J(r2, r1)
            if (r1 == 0) goto L_0x0210
            X.4cc r8 = X.C112515e1.A00
            int r5 = r5.length()
            r2 = 0
            r1 = 33
            r3.setSpan(r8, r2, r5, r1)
        L_0x0210:
            X.69J r1 = r4.A01
            if (r1 == 0) goto L_0x02f5
            X.6Og r1 = r1.A00
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x02f5
            X.6Eq r4 = r4.A00
            long r1 = r4.A04
            r5 = r36
            float r2 = A00(r5, r7, r1)
            boolean r1 = java.lang.Float.isNaN(r2)
            if (r1 != 0) goto L_0x0239
            X.6cO r8 = new X.6cO
            r8.<init>(r2)
            int r5 = r3.length()
            r2 = 0
            r1 = 33
            r3.setSpan(r8, r2, r5, r1)
        L_0x0239:
            X.6P5 r11 = r4.A06
            if (r11 == 0) goto L_0x0252
            long r4 = r11.A00
            r9 = 0
            long r12 = X.AnonymousClass6U3.A02(r9)
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0284
            long r1 = r11.A01
            long r12 = X.AnonymousClass6U3.A02(r9)
            int r8 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x0284
        L_0x0252:
            java.util.ArrayList r8 = X.C36361kB.A0r(r16)
            int r4 = r16.size()
            r2 = 0
        L_0x025b:
            if (r2 >= r4) goto L_0x034b
            r1 = r16
            java.lang.Object r5 = r1.get(r2)
            r9 = r5
            X.6Bu r9 = (X.C128326Bu) r9
            java.lang.Object r7 = r9.A02
            X.6FJ r7 = (X.AnonymousClass6FJ) r7
            X.6Im r1 = r7.A05
            if (r1 != 0) goto L_0x027e
            X.68R r1 = r7.A06
            if (r1 != 0) goto L_0x027e
            X.72W r1 = r7.A08
            if (r1 != 0) goto L_0x027e
            java.lang.Object r1 = r9.A02
            X.6FJ r1 = (X.AnonymousClass6FJ) r1
            X.68S r1 = r1.A07
            if (r1 == 0) goto L_0x0281
        L_0x027e:
            r8.add(r5)
        L_0x0281:
            int r2 = r2 + 1
            goto L_0x025b
        L_0x0284:
            boolean r1 = X.AnonymousClass6U3.A03(r4)
            if (r1 != 0) goto L_0x0252
            long r1 = r11.A01
            boolean r8 = X.AnonymousClass6U3.A03(r1)
            if (r8 != 0) goto L_0x0252
            long r14 = X.AnonymousClass6WI.A01(r4)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            int r8 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            boolean r8 = X.AnonymousClass000.A1Q(r8)
            r13 = 0
            if (r8 == 0) goto L_0x02e4
            r8 = r36
            float r5 = r8.Bvp(r4)
        L_0x02aa:
            long r14 = X.AnonymousClass6WI.A01(r1)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x02d5
            r4 = r36
            float r13 = r4.Bvp(r1)
        L_0x02bd:
            int r2 = X.C90514aH.A04(r5)
            int r1 = X.C90514aH.A04(r13)
            android.text.style.LeadingMarginSpan$Standard r4 = new android.text.style.LeadingMarginSpan$Standard
            r4.<init>(r2, r1)
            int r2 = r3.length()
            r1 = 33
            r3.setSpan(r4, r9, r2, r1)
            goto L_0x0252
        L_0x02d5:
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            int r4 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x02bd
            float r13 = X.C90464aC.A00(r1)
            float r13 = r13 * r7
            goto L_0x02bd
        L_0x02e4:
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            int r8 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x02f3
            float r5 = X.C90464aC.A00(r4)
            float r5 = r5 * r7
            goto L_0x02aa
        L_0x02f3:
            r5 = 0
            goto L_0x02aa
        L_0x02f5:
            X.6Eq r4 = r4.A00
            long r1 = r4.A04
            r5 = r36
            float r18 = A00(r5, r7, r1)
            boolean r1 = java.lang.Float.isNaN(r18)
            if (r1 != 0) goto L_0x0239
            int r1 = r3.length()
            r5 = 0
            if (r1 == 0) goto L_0x031a
            int r1 = r3.length()
            if (r1 != 0) goto L_0x0321
            java.lang.String r1 = "Char sequence is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x031a:
            int r1 = r3.length()
            int r20 = r1 + 1
            goto L_0x0333
        L_0x0321:
            int r1 = r3.length()
            int r1 = r1 + -1
            char r2 = r3.charAt(r1)
            r1 = 10
            if (r2 == r1) goto L_0x031a
            int r20 = r3.length()
        L_0x0333:
            r21 = 1
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6cP r1 = new X.6cP
            r22 = 1
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            int r8 = r3.length()
            r2 = 33
            r3.setSpan(r1, r5, r8, r2)
            goto L_0x0239
        L_0x034b:
            X.6Im r4 = r6.A05
            if (r4 != 0) goto L_0x0560
            X.68R r1 = r6.A06
            if (r1 != 0) goto L_0x0560
            X.72W r1 = r6.A08
            if (r1 != 0) goto L_0x0560
            X.68S r1 = r6.A07
            if (r1 != 0) goto L_0x0560
            r9 = 0
        L_0x035c:
            X.7aD r13 = new X.7aD
            r13.<init>(r3, r10)
            int r2 = r8.size()
            r1 = 1
            r6 = 0
            if (r2 > r1) goto L_0x04d8
            boolean r1 = X.C36411kG.A1a(r8)
            if (r1 == 0) goto L_0x039a
            java.lang.Object r1 = r8.get(r6)
            X.6Bu r1 = (X.C128326Bu) r1
            java.lang.Object r4 = r1.A02
            X.6FJ r4 = (X.AnonymousClass6FJ) r4
            if (r9 == 0) goto L_0x037f
            X.6FJ r4 = r9.A01(r4)
        L_0x037f:
            java.lang.Object r1 = r8.get(r6)
            X.6Bu r1 = (X.C128326Bu) r1
            int r1 = r1.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r8.get(r6)
            X.6Bu r1 = (X.C128326Bu) r1
            int r1 = r1.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.BKt(r4, r2, r1)
        L_0x039a:
            int r10 = r16.size()
            r9 = 0
            r8 = 0
            r14 = 0
        L_0x03a1:
            if (r8 >= r10) goto L_0x058d
            r1 = r16
            java.lang.Object r7 = r1.get(r8)
            X.6Bu r7 = (X.C128326Bu) r7
            int r4 = r7.A01
            int r2 = r7.A00
            if (r4 < 0) goto L_0x04c2
            int r1 = r3.length()
            if (r4 >= r1) goto L_0x04c2
            if (r2 <= r4) goto L_0x04c2
            int r1 = r3.length()
            if (r2 > r1) goto L_0x04c2
            int r6 = r7.A01
            int r5 = r7.A00
            java.lang.Object r4 = r7.A02
            X.6FJ r4 = (X.AnonymousClass6FJ) r4
            X.68U r1 = r4.A0A
            if (r1 == 0) goto L_0x03d7
            float r1 = r1.A00
            X.4co r2 = new X.4co
            r2.<init>(r1)
            r1 = 33
            r3.setSpan(r2, r6, r5, r1)
        L_0x03d7:
            X.7mU r11 = r4.A0C
            long r1 = r11.B9t()
            X.AnonymousClass6QX.A00(r3, r6, r5, r1)
            X.5zS r12 = r11.B8w()
            float r11 = r11.B8b()
            if (r12 == 0) goto L_0x03f5
            boolean r1 = r12 instanceof X.C94484iI
            if (r1 == 0) goto L_0x04c6
            X.4iI r12 = (X.C94484iI) r12
            long r1 = r12.A00
            X.AnonymousClass6QX.A00(r3, r6, r5, r1)
        L_0x03f5:
            X.6Ot r1 = r4.A0B
            if (r1 == 0) goto L_0x0411
            int r2 = r1.A00
            r1 = 1
            r1 = r1 | r2
            boolean r11 = X.AnonymousClass000.A1S(r1, r2)
            r1 = 2
            r1 = r1 | r2
            boolean r1 = X.AnonymousClass000.A1S(r1, r2)
            X.4cf r2 = new X.4cf
            r2.<init>(r11, r1)
            r1 = 33
            r3.setSpan(r2, r6, r5, r1)
        L_0x0411:
            long r1 = r4.A01
            r17 = r3
            r18 = r36
            r19 = r6
            r20 = r5
            r21 = r1
            X.AnonymousClass6QX.A02(r17, r18, r19, r20, r21)
            java.lang.String r1 = r4.A0E
            if (r1 == 0) goto L_0x042e
            X.4cp r2 = new X.4cp
            r2.<init>(r1)
            r1 = 33
            r3.setSpan(r2, r6, r5, r1)
        L_0x042e:
            X.6TV r12 = r4.A0D
            if (r12 == 0) goto L_0x0448
            float r2 = r12.A00
            android.text.style.ScaleXSpan r1 = new android.text.style.ScaleXSpan
            r1.<init>(r2)
            r11 = 33
            r3.setSpan(r1, r6, r5, r11)
            float r2 = r12.A01
            X.4cs r1 = new X.4cs
            r1.<init>(r2)
            r3.setSpan(r1, r6, r5, r11)
        L_0x0448:
            X.75Q r1 = r4.A09
            X.AnonymousClass6QX.A01(r3, r1, r6, r5)
            long r1 = r4.A00
            int r11 = (r1 > r34 ? 1 : (r1 == r34 ? 0 : -1))
            if (r11 == 0) goto L_0x0467
            X.4iQ r11 = X.C114185go.A0G
            long r1 = X.C133336Xx.A06(r11, r1)
            int r1 = X.C90514aH.A0D(r1)
            android.text.style.BackgroundColorSpan r2 = new android.text.style.BackgroundColorSpan
            r2.<init>(r1)
            r1 = 33
            r3.setSpan(r2, r6, r5, r1)
        L_0x0467:
            X.6PD r11 = r4.A03
            if (r11 == 0) goto L_0x0493
            long r1 = r11.A01
            X.4iQ r12 = X.C114185go.A0G
            long r1 = X.C133336Xx.A06(r12, r1)
            int r13 = X.C90514aH.A0D(r1)
            long r1 = r11.A02
            float r12 = X.C133206Xf.A00(r1)
            float r1 = X.C133206Xf.A01(r1)
            float r11 = r11.A00
            r2 = 0
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0489
            r11 = 1
        L_0x0489:
            X.4cg r2 = new X.4cg
            r2.<init>(r12, r1, r11, r13)
            r1 = 33
            r3.setSpan(r2, r6, r5, r1)
        L_0x0493:
            X.5Wf r1 = r4.A04
            if (r1 == 0) goto L_0x04a1
            X.4ci r2 = new X.4ci
            r2.<init>(r1)
            r1 = 33
            r3.setSpan(r2, r6, r5, r1)
        L_0x04a1:
            java.lang.Object r1 = r7.A02
            X.6FJ r1 = (X.AnonymousClass6FJ) r1
            long r1 = r1.A02
            long r11 = X.AnonymousClass6WI.A01(r1)
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x04c1
            long r6 = X.AnonymousClass6WI.A01(r1)
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x04c2
        L_0x04c1:
            r14 = 1
        L_0x04c2:
            int r8 = r8 + 1
            goto L_0x03a1
        L_0x04c6:
            boolean r1 = r12 instanceof X.C94474iH
            if (r1 == 0) goto L_0x03f5
            X.4iH r12 = (X.C94474iH) r12
            X.4cj r2 = new X.4cj
            r2.<init>(r12, r11)
            r1 = 33
            r3.setSpan(r2, r6, r5, r1)
            goto L_0x03f5
        L_0x04d8:
            int r7 = r8.size()
            int r12 = r7 * 2
            java.lang.Integer[] r11 = new java.lang.Integer[r12]
            r1 = 0
        L_0x04e1:
            if (r1 >= r12) goto L_0x04e9
            X.AnonymousClass000.A1L(r11, r6, r1)
            int r1 = r1 + 1
            goto L_0x04e1
        L_0x04e9:
            int r5 = r8.size()
        L_0x04ed:
            if (r6 >= r5) goto L_0x0504
            java.lang.Object r4 = r8.get(r6)
            X.6Bu r4 = (X.C128326Bu) r4
            int r1 = r4.A01
            X.AnonymousClass000.A1L(r11, r1, r6)
            int r2 = r6 + r7
            int r1 = r4.A00
            X.AnonymousClass000.A1L(r11, r1, r2)
            int r6 = r6 + 1
            goto L_0x04ed
        L_0x0504:
            r2 = 0
            r1 = 1
            if (r12 <= r1) goto L_0x0556
            java.util.Arrays.sort(r11)
        L_0x050b:
            int r10 = X.C90524aI.A06(r11, r2)
            r7 = 0
        L_0x0510:
            if (r7 >= r12) goto L_0x039a
            int r6 = X.C90524aI.A06(r11, r7)
            if (r6 == r10) goto L_0x0553
            int r15 = r8.size()
            r5 = r9
            r4 = 0
        L_0x051e:
            if (r4 >= r15) goto L_0x0545
            java.lang.Object r2 = r8.get(r4)
            X.6Bu r2 = (X.C128326Bu) r2
            int r14 = r2.A01
            int r1 = r2.A00
            if (r14 == r1) goto L_0x053d
            int r14 = r2.A01
            int r1 = r2.A00
            boolean r1 = X.AnonymousClass6RF.A01(r10, r6, r14, r1)
            if (r1 == 0) goto L_0x053d
            java.lang.Object r1 = r2.A02
            X.6FJ r1 = (X.AnonymousClass6FJ) r1
            if (r5 != 0) goto L_0x0540
            r5 = r1
        L_0x053d:
            int r4 = r4 + 1
            goto L_0x051e
        L_0x0540:
            X.6FJ r5 = r5.A01(r1)
            goto L_0x053d
        L_0x0545:
            if (r5 == 0) goto L_0x0552
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r13.BKt(r5, r2, r1)
        L_0x0552:
            r10 = r6
        L_0x0553:
            int r7 = r7 + 1
            goto L_0x0510
        L_0x0556:
            if (r12 != 0) goto L_0x050b
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0560:
            X.72W r5 = r6.A08
            X.68R r2 = r6.A06
            X.68S r1 = r6.A07
            r18 = 0
            long r30 = X.AnonymousClass6WI.A01
            X.7mU r27 = X.AnonymousClass6RG.A00(r34)
            X.6FJ r9 = new X.6FJ
            r24 = r18
            r25 = r18
            r26 = r18
            r28 = r18
            r29 = r18
            r19 = r18
            r20 = r4
            r21 = r2
            r22 = r1
            r23 = r5
            r32 = r30
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34)
            goto L_0x035c
        L_0x058d:
            if (r14 == 0) goto L_0x05ea
            int r10 = r16.size()
        L_0x0593:
            if (r9 >= r10) goto L_0x05ea
            r1 = r16
            java.lang.Object r1 = r1.get(r9)
            X.6Bu r1 = (X.C128326Bu) r1
            int r11 = r1.A01
            int r8 = r1.A00
            java.lang.Object r2 = r1.A02
            X.6FJ r2 = (X.AnonymousClass6FJ) r2
            if (r11 < 0) goto L_0x05d4
            int r1 = r3.length()
            if (r11 >= r1) goto L_0x05d4
            if (r8 <= r11) goto L_0x05d4
            int r1 = r3.length()
            if (r8 > r1) goto L_0x05d4
            long r4 = r2.A02
            long r12 = X.AnonymousClass6WI.A01(r4)
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x05d7
            r1 = r36
            float r1 = r1.Bvp(r4)
            X.4cr r2 = new X.4cr
            r2.<init>(r1)
        L_0x05cf:
            r1 = 33
            r3.setSpan(r2, r11, r8, r1)
        L_0x05d4:
            int r9 = r9 + 1
            goto L_0x0593
        L_0x05d7:
            r6 = 8589934592(0x200000000, double:4.243991582E-314)
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x05d4
            float r1 = X.C90464aC.A00(r4)
            X.4cq r2 = new X.4cq
            r2.<init>(r1)
            goto L_0x05cf
        L_0x05ea:
            int r2 = r37.size()
            r1 = 0
            if (r1 >= r2) goto L_0x01e0
            r0 = r37
            java.lang.Object r0 = r0.get(r1)
            X.6Bu r0 = (X.C128326Bu) r0
            r4 = 0
            int r2 = r0.A01
            int r1 = r0.A00
            java.lang.Class<X.1mG> r0 = X.C37371mG.class
            java.lang.Object[] r0 = r3.getSpans(r2, r1, r0)
            int r1 = r0.length
            r0 = 0
        L_0x0606:
            if (r0 >= r1) goto L_0x06f1
            r3.removeSpan(r4)
            int r0 = r0 + 1
            goto L_0x0606
        L_0x060e:
            long r3 = X.AnonymousClass6WI.A01
        L_0x0610:
            if (r9 != 0) goto L_0x0614
            r1 = r34
        L_0x0614:
            if (r13 != 0) goto L_0x0617
            r7 = r6
        L_0x0617:
            r37 = 0
            long r49 = X.AnonymousClass6WI.A01
            X.7mU r46 = X.AnonymousClass6RG.A00(r34)
            X.6FJ r6 = new X.6FJ
            r39 = r37
            r40 = r37
            r41 = r37
            r42 = r37
            r43 = r37
            r45 = r37
            r47 = r37
            r48 = r37
            r38 = r37
            r44 = r7
            r51 = r3
            r53 = r1
            r36 = r6
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r51, r53)
            int r1 = r16.size()
            int r7 = r1 + 1
            java.util.ArrayList r16 = X.C36441kJ.A14(r7)
            r4 = 0
        L_0x0649:
            if (r4 >= r7) goto L_0x01ab
            if (r4 != 0) goto L_0x0662
            java.lang.String r1 = r0.A08
            int r3 = r1.length()
            java.lang.String r1 = ""
            X.6Bu r2 = new X.6Bu
            r2.<init>(r6, r1, r5, r3)
        L_0x065a:
            r1 = r16
            r1.add(r2)
            int r4 = r4 + 1
            goto L_0x0649
        L_0x0662:
            java.util.List r2 = r0.A0A
            int r1 = r4 + -1
            java.lang.Object r2 = r2.get(r1)
            goto L_0x065a
        L_0x066b:
            long r11 = X.AnonymousClass6WI.A01(r3)
            r8 = 8589934592(0x200000000, double:4.243991582E-314)
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x016d
            float r1 = X.C90464aC.A00(r3)
            r7.setLetterSpacing(r1)
            goto L_0x016d
        L_0x0681:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x069a
            X.75Q r1 = r4.BAX()
            java.util.List r1 = r1.A01
        L_0x068d:
            java.lang.Object r1 = r1.get(r5)
            java.util.Locale r1 = X.AnonymousClass68T.A00(r1)
            r7.setTextLocale(r1)
            goto L_0x00da
        L_0x069a:
            java.util.List r1 = r3.A01
            goto L_0x068d
        L_0x069d:
            r2 = 1
            goto L_0x00b5
        L_0x06a0:
            r1 = 0
            goto L_0x00aa
        L_0x06a3:
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x0092
            float r4 = r7.getTextSize()
            float r1 = X.C90464aC.A00(r1)
            float r4 = r4 * r1
            goto L_0x008f
        L_0x06b7:
            r7.getFlags()
            r7.setHinting(r1)
            goto L_0x0078
        L_0x06bf:
            r1 = r1 & -129(0xffffffffffffff7f, float:NaN)
            goto L_0x0064
        L_0x06c3:
            r1 = 3
            if (r10 == r1) goto L_0x06d1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r1) goto L_0x06d1
            java.lang.String r0 = "Invalid TextDirection."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x06d1:
            if (r3 == 0) goto L_0x06df
            java.util.List r1 = r3.A01
            java.lang.Object r1 = r1.get(r5)
            java.util.Locale r1 = X.AnonymousClass68T.A00(r1)
            if (r1 != 0) goto L_0x06e3
        L_0x06df:
            java.util.Locale r1 = java.util.Locale.getDefault()
        L_0x06e3:
            int r1 = X.AnonymousClass044.A00(r1)
            if (r1 == 0) goto L_0x06eb
            if (r1 == r4) goto L_0x06ee
        L_0x06eb:
            r9 = 2
            goto L_0x004d
        L_0x06ee:
            r9 = 3
            goto L_0x004d
        L_0x06f1:
            java.lang.String r0 = "getWidth-XSAIIZE"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138036hA.<init>(X.6V8, X.7bi, X.7ni, java.lang.String, java.util.List, java.util.List):void");
    }
}

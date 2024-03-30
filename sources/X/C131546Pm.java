package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.6Pm  reason: invalid class name and case insensitive filesystem */
public abstract class C131546Pm {
    public int A00;
    public long A01 = -1;
    public AnonymousClass2bS A02;
    public List A03 = AnonymousClass001.A0I();
    public List A04;
    public Map A05 = C36431kI.A1G();
    public final C001700s A06 = C36431kI.A0S();
    public final AnonymousClass16D A07;
    public final AnonymousClass171 A08;
    public final C19630wG A09;

    public final AnonymousClass2bS A01() {
        AnonymousClass2bS r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pollMessage");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0121, code lost:
        if (r13 <= 0) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r19 = this;
            r4 = r19
            boolean r0 = r4 instanceof X.AnonymousClass5HK
            if (r0 == 0) goto L_0x0023
            X.5HK r4 = (X.AnonymousClass5HK) r4
            X.0wU r2 = r4.A04
            r1 = 25
            X.72o r0 = new X.72o
            r0.<init>(r4, r1)
            r2.Boy(r0)
            java.lang.String r0 = "all_options"
            r4.A01 = r0
            r1 = 24
            X.72o r0 = new X.72o
            r0.<init>(r4, r1)
            r2.Boy(r0)
            return
        L_0x0023:
            X.5HJ r4 = (X.AnonymousClass5HJ) r4
            X.2bS r11 = r4.A01()
            java.util.List r0 = r4.A04
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            if (r0 != 0) goto L_0x00a7
            java.util.List r0 = r11.A05
            X.AnonymousClass00C.A08(r0)
            r9.addAll(r0)
            X.7a6 r1 = X.C156517a6.A00
            r0 = 16
            X.C163897qw.A00(r1, r9, r0)
        L_0x0040:
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r4.A03 = r0
            r4.A04 = r9
            X.2bS r0 = r4.A01()
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x00ee
            X.2bS r0 = r4.A01()
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            boolean r6 = X.AnonymousClass143.A0G(r0)
            r5 = 0
            if (r6 == 0) goto L_0x00d8
            X.17X r2 = r4.A00
            X.2bS r0 = r4.A01()
            X.3Qa r0 = r0.A1J
            X.11F r1 = r0.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.AnonymousClass00C.A0E(r1, r0)
            X.144 r1 = (X.AnonymousClass144) r1
            X.17r r0 = r2.A07
            int r5 = r0.A0A(r1)
            X.2bS r0 = r4.A01()
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x00d8
            java.util.HashSet r3 = X.C36441kJ.A16()
            java.util.Iterator r2 = r0.iterator()
        L_0x0088:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r1 = r2.next()
            X.2bM r1 = (X.AnonymousClass2bM) r1
            r0 = r1
            X.8mX r0 = (X.C180858mX) r0
            java.util.List r0 = r0.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0088
            X.11F r0 = r1.A0J()
            r3.add(r0)
            goto L_0x0088
        L_0x00a7:
            java.util.Iterator r10 = r0.iterator()
        L_0x00ab:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r8 = r10.next()
            X.3PS r8 = (X.AnonymousClass3PS) r8
            java.util.List r0 = r11.A05
            java.util.Iterator r7 = X.C90514aH.A14(r0)
        L_0x00bd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r3 = r7.next()
            r0 = r3
            X.3PS r0 = (X.AnonymousClass3PS) r0
            long r5 = r0.A01
            long r1 = r8.A01
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00bd
            if (r3 == 0) goto L_0x00ab
            r9.add(r3)
            goto L_0x00ab
        L_0x00d8:
            r3 = 0
            goto L_0x00de
        L_0x00da:
            int r3 = r3.size()
        L_0x00de:
            java.util.List r2 = r4.A03
            X.2bS r0 = r4.A01()
            java.lang.String r1 = r0.A03
            X.6xH r0 = new X.6xH
            r0.<init>(r5, r3, r1, r6)
            r2.add(r0)
        L_0x00ee:
            X.2bS r0 = r4.A01()
            java.util.List r0 = r0.A05
            X.AnonymousClass00C.A08(r0)
            int r0 = A00(r0)
            long r0 = (long) r0
            java.util.Iterator r10 = r9.iterator()
        L_0x0100:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0167
            java.lang.Object r6 = r10.next()
            X.3PS r6 = (X.AnonymousClass3PS) r6
            java.util.List r7 = r4.A03
            long r15 = r6.A01
            java.lang.String r12 = r6.A03
            X.AnonymousClass00C.A08(r12)
            int r13 = r6.A00
            int r14 = r4.A00
            long r2 = (long) r13
            r5 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0123
            r17 = 1
            if (r13 > 0) goto L_0x0125
        L_0x0123:
            r17 = 0
        L_0x0125:
            X.6xI r11 = new X.6xI
            r18 = 0
            r11.<init>(r12, r13, r14, r15, r17, r18)
            r7.add(r11)
            java.util.Map r7 = r4.A05
            long r2 = r6.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.List r9 = X.C90524aI.A0o(r2, r7)
            if (r9 == 0) goto L_0x0100
            java.util.Iterator r7 = r9.iterator()
        L_0x0141:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0100
            java.lang.Object r3 = r7.next()
            r2 = 5
            if (r5 < r2) goto L_0x015f
            java.util.List r8 = r4.A03
            long r6 = r6.A01
            int r3 = X.C36421kH.A06(r9, r5)
            X.6xF r2 = new X.6xF
            r2.<init>(r6, r3)
            r8.add(r2)
            goto L_0x0100
        L_0x015f:
            java.util.List r2 = r4.A03
            r2.add(r3)
            int r5 = r5 + 1
            goto L_0x0141
        L_0x0167:
            X.00s r1 = r4.A06
            java.util.List r0 = r4.A03
            r1.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131546Pm.A02():void");
    }

    public void A03() {
        Object obj;
        if (this instanceof AnonymousClass5HK) {
            AnonymousClass5HK r4 = (AnonymousClass5HK) this;
            if (AnonymousClass00C.A0J(r4.A01, "all_options")) {
                r4.A02();
                return;
            }
            String str = r4.A01;
            if (str != null) {
                Iterator A14 = C90514aH.A14(r4.A01().A05);
                while (true) {
                    if (!A14.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = A14.next();
                    if (AnonymousClass00C.A0J(((AnonymousClass3PS) obj).A02, str)) {
                        break;
                    }
                }
                AnonymousClass3PS r1 = (AnonymousClass3PS) obj;
                if (r1 != null) {
                    r4.A04(r1.A01);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        if (r7 <= 0) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(long r14) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.AnonymousClass5HK
            if (r0 == 0) goto L_0x0042
            r6 = r13
            X.5HK r6 = (X.AnonymousClass5HK) r6
            X.0wU r5 = r6.A04
            r1 = 25
            X.72o r0 = new X.72o
            r0.<init>(r6, r1)
            r5.Boy(r0)
            X.2bS r0 = r6.A01()
            java.util.List r0 = r0.A05
            java.util.Iterator r4 = X.C90514aH.A14(r0)
        L_0x001d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.3PS r0 = (X.AnonymousClass3PS) r0
            long r1 = r0.A01
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
        L_0x0030:
            X.3PS r3 = (X.AnonymousClass3PS) r3
            if (r3 == 0) goto L_0x003f
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x003f
            r6.A01 = r1
            r0 = 15
            X.C36421kH.A1H(r5, r6, r1, r0)
        L_0x003f:
            return
        L_0x0040:
            r3 = 0
            goto L_0x0030
        L_0x0042:
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r13.A03 = r0
            X.2bS r0 = r13.A01()
            java.util.List r0 = r0.A05
            X.AnonymousClass00C.A08(r0)
            int r2 = A00(r0)
            X.2bS r0 = r13.A01()
            java.util.List r0 = r0.A05
            java.util.ArrayList r6 = X.C36411kG.A13(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0063:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r1 = r5.next()
            r0 = r1
            X.3PS r0 = (X.AnonymousClass3PS) r0
            long r3 = r0.A01
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            r6.add(r1)
            goto L_0x0063
        L_0x007a:
            java.util.Iterator r4 = r6.iterator()
        L_0x007e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r1 = r4.next()
            X.3PS r1 = (X.AnonymousClass3PS) r1
            java.util.List r0 = r13.A03
            long r9 = r1.A01
            java.lang.String r6 = r1.A03
            X.AnonymousClass00C.A08(r6)
            int r7 = r1.A00
            int r8 = r13.A00
            if (r2 != r7) goto L_0x009c
            r11 = 1
            if (r7 > 0) goto L_0x009d
        L_0x009c:
            r11 = 0
        L_0x009d:
            r12 = 1
            X.6xI r5 = new X.6xI
            r5.<init>(r6, r7, r8, r9, r11, r12)
            r0.add(r5)
            java.util.Map r3 = r13.A05
            long r0 = r1.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r3.get(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x003f
            java.util.List r0 = r13.A03
            r0.addAll(r1)
            goto L_0x007e
        L_0x00bc:
            X.00s r1 = r13.A06
            java.util.List r0 = r13.A03
            r1.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131546Pm.A04(long):void");
    }

    public C131546Pm(AnonymousClass16D r3, AnonymousClass171 r4, C19630wG r5) {
        this.A09 = r5;
        this.A07 = r3;
        this.A08 = r4;
    }

    public static final int A00(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            int i = ((AnonymousClass3PS) it.next()).A00;
            while (it.hasNext()) {
                int i2 = ((AnonymousClass3PS) it.next()).A00;
                if (i < i2) {
                    i = i2;
                }
            }
            return i;
        }
        throw new NoSuchElementException();
    }
}

package X;

import android.os.SystemClock;

/* renamed from: X.1jp  reason: invalid class name and case insensitive filesystem */
public class C36141jp implements AnonymousClass08V {
    public Object A00;
    public final int A01;

    public C36141jp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static long A00(C001600r r1, C21690ze r2, C224214g r3, int i) {
        r3.A02("done");
        r1.A0C(Boolean.FALSE);
        r2.markerEnd(926875649, i, 2);
        return SystemClock.uptimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05cd, code lost:
        r11.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05d0, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0726, code lost:
        if ((r1 instanceof android.os.OperationCanceledException) == false) goto L_0x0c22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x07e9, code lost:
        if (r1 == -3) goto L_0x07eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0821, code lost:
        if (X.AnonymousClass143.A0H(r1.A0N) != false) goto L_0x0823;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0878, code lost:
        if (r0.B7L(r15) == false) goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0acc, code lost:
        if (r9 == null) goto L_0x0ace;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0b66, code lost:
        r2.A02("cancelled");
        r2.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0bf1, code lost:
        if ((r1 instanceof android.os.OperationCanceledException) == false) goto L_0x0c22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0c22, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x09d8  */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0c19  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r32) {
        /*
            r31 = this;
            r2 = r32
            r1 = r31
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x01e1;
                case 2: goto L_0x035c;
                case 3: goto L_0x05ec;
                case 4: goto L_0x074b;
                case 5: goto L_0x0988;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r6 = r1.A00
            X.1SD r6 = (X.AnonymousClass1SD) r6
            X.35p r2 = (X.C598735p) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Object r5 = r2.A01
            X.1S3 r5 = (X.AnonymousClass1S3) r5
            X.0fG r4 = new X.0fG
            r4.<init>()
            r7 = 0
            X.005 r0 = r6.A03     // Catch:{ 02S -> 0x01db }
            java.lang.Object r0 = r0.get()     // Catch:{ 02S -> 0x01db }
            X.18z r0 = (X.C235718z) r0     // Catch:{ 02S -> 0x01db }
            boolean r0 = r0.A0N()     // Catch:{ 02S -> 0x01db }
            if (r0 != 0) goto L_0x0032
            java.lang.Object r7 = r4.element     // Catch:{ 02S -> 0x01db }
            return r7
        L_0x0032:
            X.0Bk r3 = r2.A00     // Catch:{ 02S -> 0x01db }
            r3.A04()     // Catch:{ 02S -> 0x01db }
            int r0 = r5.A02     // Catch:{ 02S -> 0x01db }
            if (r0 != 0) goto L_0x01db
            X.11F r0 = r5.A04     // Catch:{ 02S -> 0x01db }
            if (r0 != 0) goto L_0x01db
            X.6bb r0 = r5.A06     // Catch:{ 02S -> 0x01db }
            if (r0 != 0) goto L_0x01db
            X.005 r0 = r6.A04     // Catch:{ 02S -> 0x01db }
            java.lang.Object r1 = r0.get()     // Catch:{ 02S -> 0x01db }
            X.3Kr r1 = (X.C63603Kr) r1     // Catch:{ 02S -> 0x01db }
            java.lang.String r0 = r5.A02()     // Catch:{ 02S -> 0x01db }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 02S -> 0x01db }
            X.2rS r1 = r1.A00(r0)     // Catch:{ 02S -> 0x01db }
            X.2Ec r0 = X.AnonymousClass2Ec.A00     // Catch:{ 02S -> 0x01db }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ 02S -> 0x01db }
            if (r0 == 0) goto L_0x01db
            r3.A04()     // Catch:{ 02S -> 0x01db }
            com.whatsapp.search.chatlock.ChatLockSearchManager$tryUnlockLockedChats$1 r1 = new com.whatsapp.search.chatlock.ChatLockSearchManager$tryUnlockLockedChats$1     // Catch:{ 02S -> 0x01db }
            r8 = r1
            r9 = r5
            r10 = r6
            r11 = r2
            r12 = r7
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ 02S -> 0x01db }
            X.03u r0 = X.C008903u.A00     // Catch:{ 02S -> 0x01db }
            X.C110515an.A00(r0, r1)     // Catch:{ 02S -> 0x01db }
            java.lang.Object r7 = r4.element     // Catch:{ 02S -> 0x01db }
            return r7
        L_0x0074:
            java.lang.Object r3 = r1.A00
            X.1S2 r3 = (X.AnonymousClass1S2) r3
            X.35p r2 = (X.C598735p) r2
            java.lang.String r12 = "filter"
            long r14 = android.os.SystemClock.uptimeMillis()
            X.00s r4 = r3.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.A0C(r0)
            java.lang.Object r1 = r2.A01
            X.1S3 r1 = (X.AnonymousClass1S3) r1
            r7 = 1
            int r8 = X.AnonymousClass6R7.A00(r7)
            X.0ze r6 = r3.A08
            r10 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerStart(r10, r8)
            int r5 = r1.A02
            java.lang.String r0 = "type"
            r6.markerAnnotate((int) r10, (int) r8, (java.lang.String) r0, (int) r5)
            X.11F r0 = r1.A04
            r5 = 0
            if (r0 == 0) goto L_0x00a5
            r5 = 1
        L_0x00a5:
            java.lang.String r0 = "jid"
            r6.markerAnnotate((int) r10, (int) r8, (java.lang.String) r0, (boolean) r5)
            A02(r6, r1, r8, r7)
            X.0Bk r9 = r2.A00
            java.lang.String r0 = X.AnonymousClass1S2.A00(r3, r1)
            X.14g r5 = new X.14g
            r5.<init>((java.lang.String) r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ 02S -> 0x01bb }
            int r0 = r1.A02     // Catch:{ 02S -> 0x01bb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 02S -> 0x01bb }
            boolean r0 = r2.equals(r0)     // Catch:{ 02S -> 0x01bb }
            if (r0 == 0) goto L_0x00e1
            X.11F r0 = r1.A04     // Catch:{ 02S -> 0x01bb }
            if (r0 != 0) goto L_0x00e1
            java.util.List r0 = r1.A03()     // Catch:{ 02S -> 0x01bb }
            boolean r0 = r0.isEmpty()     // Catch:{ 02S -> 0x01bb }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00f0
            X.6bb r0 = r1.A06     // Catch:{ 02S -> 0x01bb }
            if (r0 != 0) goto L_0x00f0
        L_0x00e1:
            java.lang.String r0 = "empty"
            r5.A02(r0)     // Catch:{ 02S -> 0x01bb }
            r6.markerDrop(r10, r8)     // Catch:{ 02S -> 0x01bb }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 02S -> 0x01bb }
            r4.A0C(r0)     // Catch:{ 02S -> 0x01bb }
            goto L_0x01d8
        L_0x00f0:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ 02S -> 0x01bb }
            X.1S0 r10 = r3.A09     // Catch:{ 02S -> 0x01bb }
            java.util.List r0 = r1.A03()     // Catch:{ 02S -> 0x01bb }
            X.3g3 r11 = r10.B42(r0)     // Catch:{ 02S -> 0x01bb }
            java.util.List r0 = r1.A03()     // Catch:{ 02S -> 0x01bb }
            boolean r0 = r0.isEmpty()     // Catch:{ 02S -> 0x01bb }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x010d
            r2.add(r11)     // Catch:{ 02S -> 0x01bb }
        L_0x010d:
            X.6bb r10 = r1.A06     // Catch:{ 02S -> 0x01bb }
            if (r10 == 0) goto L_0x011a
            X.1Rh r0 = r3.A0B     // Catch:{ 02S -> 0x01bb }
            X.4Q7 r0 = r0.A01(r10)     // Catch:{ 02S -> 0x01bb }
            r2.add(r0)     // Catch:{ 02S -> 0x01bb }
        L_0x011a:
            r5.A02(r12)     // Catch:{ 02S -> 0x01bb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ 02S -> 0x01bb }
            X.AnonymousClass6R7.A01(r6, r0, r12)     // Catch:{ 02S -> 0x01bb }
            r9.A04()     // Catch:{ 02S -> 0x01bb }
            X.1A6 r0 = r3.A05     // Catch:{ 02S -> 0x01bb }
            java.util.ArrayList r10 = r0.A04()     // Catch:{ 02S -> 0x01bb }
            java.lang.String r0 = "get"
            r5.A02(r0)     // Catch:{ 02S -> 0x01bb }
            java.util.Iterator r13 = r10.iterator()     // Catch:{ 02S -> 0x01bb }
        L_0x0136:
            boolean r0 = r13.hasNext()     // Catch:{ 02S -> 0x01bb }
            if (r0 == 0) goto L_0x0168
            java.lang.Object r10 = r13.next()     // Catch:{ 02S -> 0x01bb }
            X.11F r10 = (X.AnonymousClass11F) r10     // Catch:{ 02S -> 0x01bb }
            r9.A04()     // Catch:{ 02S -> 0x01bb }
            X.18z r12 = r3.A04     // Catch:{ 02S -> 0x01bb }
            boolean r0 = r12.A0O()     // Catch:{ 02S -> 0x01bb }
            if (r0 != 0) goto L_0x014e
            goto L_0x0155
        L_0x014e:
            boolean r0 = r12.A0P(r10)     // Catch:{ 02S -> 0x01bb }
            r0 = r0 ^ 1
            goto L_0x0156
        L_0x0155:
            r0 = 1
        L_0x0156:
            if (r0 == 0) goto L_0x0136
            boolean r0 = X.AnonymousClass1A5.A00(r10, r2)     // Catch:{ 02S -> 0x01bb }
            if (r0 == 0) goto L_0x0136
            X.1A5 r0 = r3.A06     // Catch:{ 02S -> 0x01bb }
            X.141 r0 = r0.A01(r10)     // Catch:{ 02S -> 0x01bb }
            r7.add(r0)     // Catch:{ 02S -> 0x01bb }
            goto L_0x0136
        L_0x0168:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 02S -> 0x01bb }
            r2.<init>()     // Catch:{ 02S -> 0x01bb }
            java.lang.String r0 = X.AnonymousClass1S2.A00(r3, r1)     // Catch:{ 02S -> 0x01bb }
            r2.append(r0)     // Catch:{ 02S -> 0x01bb }
            java.lang.String r0 = "/breakdown: get:"
            r2.append(r0)     // Catch:{ 02S -> 0x01bb }
            long r0 = r11.A00     // Catch:{ 02S -> 0x01bb }
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r9
            r2.append(r0)     // Catch:{ 02S -> 0x01bb }
            java.lang.String r0 = "; match: "
            r2.append(r0)     // Catch:{ 02S -> 0x01bb }
            long r0 = r11.A01     // Catch:{ 02S -> 0x01bb }
            long r0 = r0 / r9
            r2.append(r0)     // Catch:{ 02S -> 0x01bb }
            java.lang.String r0 = r2.toString()     // Catch:{ 02S -> 0x01bb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 02S -> 0x01bb }
            long r9 = A00(r4, r6, r5, r8)     // Catch:{ 02S -> 0x01bb }
            long r9 = r9 - r14
            X.2R3 r2 = new X.2R3     // Catch:{ 02S -> 0x01bb }
            r2.<init>()     // Catch:{ 02S -> 0x01bb }
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ 02S -> 0x01bb }
            r2.A02 = r0     // Catch:{ 02S -> 0x01bb }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ 02S -> 0x01bb }
            r2.A04 = r0     // Catch:{ 02S -> 0x01bb }
            boolean r0 = r3.A00     // Catch:{ 02S -> 0x01bb }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 02S -> 0x01bb }
            r2.A00 = r0     // Catch:{ 02S -> 0x01bb }
            r3.A00 = r1     // Catch:{ 02S -> 0x01bb }
            X.0yW r0 = r3.A07     // Catch:{ 02S -> 0x01bb }
            r0.Bly(r2)     // Catch:{ 02S -> 0x01bb }
            goto L_0x01d8
        L_0x01bb:
            java.lang.String r0 = "cancelled"
            r5.A02(r0)     // Catch:{ all -> 0x01dc }
            long r3 = r5.A00()     // Catch:{ all -> 0x01dc }
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d1
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerDrop(r0, r8)     // Catch:{ all -> 0x01dc }
            goto L_0x01d8
        L_0x01d1:
            r1 = 4
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerEnd(r0, r8, r1)     // Catch:{ all -> 0x01dc }
        L_0x01d8:
            r5.A01()
        L_0x01db:
            return r7
        L_0x01dc:
            r0 = move-exception
            r5.A01()
            throw r0
        L_0x01e1:
            java.lang.Object r4 = r1.A00
            X.1S5 r4 = (X.AnonymousClass1S5) r4
            X.35p r2 = (X.C598735p) r2
            java.lang.String r10 = "filter"
            long r16 = android.os.SystemClock.uptimeMillis()
            X.00s r3 = r4.A02
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A0C(r0)
            java.lang.Object r13 = r2.A01
            X.1S3 r13 = (X.AnonymousClass1S3) r13
            r9 = 0
            int r6 = X.AnonymousClass6R7.A00(r9)
            X.0ze r5 = r4.A08
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerStart(r0, r6)
            A02(r5, r13, r6, r9)
            X.0Bk r0 = r2.A00
            r18 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactSearchManager/getForContactsQuery/"
            X.14g r11 = A01(r13, r0, r1)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            r18.A04()     // Catch:{ 02S -> 0x033c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ 02S -> 0x033c }
            int r0 = r13.A02     // Catch:{ 02S -> 0x033c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 02S -> 0x033c }
            boolean r0 = r8.equals(r0)     // Catch:{ 02S -> 0x033c }
            if (r0 == 0) goto L_0x0242
            X.11F r0 = r13.A04     // Catch:{ 02S -> 0x033c }
            if (r0 != 0) goto L_0x0242
            java.util.List r0 = r13.A03()     // Catch:{ 02S -> 0x033c }
            boolean r0 = r0.isEmpty()     // Catch:{ 02S -> 0x033c }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0254
            X.6bb r0 = r13.A06     // Catch:{ 02S -> 0x033c }
            if (r0 != 0) goto L_0x0254
        L_0x0242:
            java.lang.String r0 = "empty"
            r11.A02(r0)     // Catch:{ 02S -> 0x033c }
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerDrop(r0, r6)     // Catch:{ 02S -> 0x033c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 02S -> 0x033c }
            r3.A0C(r0)     // Catch:{ 02S -> 0x033c }
            goto L_0x05cd
        L_0x0254:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ 02S -> 0x033c }
            java.util.List r0 = r13.A03()     // Catch:{ 02S -> 0x033c }
            boolean r0 = r0.isEmpty()     // Catch:{ 02S -> 0x033c }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0276
            X.16v r15 = r4.A0B     // Catch:{ 02S -> 0x033c }
            X.1A5 r14 = r4.A06     // Catch:{ 02S -> 0x033c }
            X.171 r12 = r4.A04     // Catch:{ 02S -> 0x033c }
            java.util.List r2 = r13.A03()     // Catch:{ 02S -> 0x033c }
            X.3g2 r0 = new X.3g2     // Catch:{ 02S -> 0x033c }
            r0.<init>(r12, r14, r15, r2)     // Catch:{ 02S -> 0x033c }
            r1.add(r0)     // Catch:{ 02S -> 0x033c }
        L_0x0276:
            X.6bb r2 = r13.A06     // Catch:{ 02S -> 0x033c }
            if (r2 == 0) goto L_0x0283
            X.1Rh r0 = r4.A0A     // Catch:{ 02S -> 0x033c }
            X.4Q7 r0 = r0.A01(r2)     // Catch:{ 02S -> 0x033c }
            r1.add(r0)     // Catch:{ 02S -> 0x033c }
        L_0x0283:
            r11.A02(r10)     // Catch:{ 02S -> 0x033c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 02S -> 0x033c }
            X.AnonymousClass6R7.A01(r5, r0, r10)     // Catch:{ 02S -> 0x033c }
            r18.A04()     // Catch:{ 02S -> 0x033c }
            X.1A5 r10 = r4.A06     // Catch:{ 02S -> 0x033c }
            java.util.List r2 = r10.A00     // Catch:{ 02S -> 0x033c }
            r0 = 0
            if (r2 != 0) goto L_0x0298
            r0 = 1
        L_0x0298:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 02S -> 0x033c }
            boolean r0 = r0.booleanValue()     // Catch:{ 02S -> 0x033c }
            r14 = 0
            if (r0 != 0) goto L_0x02a4
            r14 = 1
        L_0x02a4:
            java.util.List r0 = r10.A03()     // Catch:{ 02S -> 0x033c }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ 02S -> 0x033c }
        L_0x02ac:
            boolean r0 = r13.hasNext()     // Catch:{ 02S -> 0x033c }
            if (r0 == 0) goto L_0x02fc
            java.lang.Object r2 = r13.next()     // Catch:{ 02S -> 0x033c }
            X.141 r2 = (X.AnonymousClass141) r2     // Catch:{ 02S -> 0x033c }
            r18.A04()     // Catch:{ 02S -> 0x033c }
            X.3IL r0 = r2.A0F     // Catch:{ 02S -> 0x033c }
            if (r0 == 0) goto L_0x02ac
            java.lang.Class<X.11F> r10 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r12 = r2.A06(r10)     // Catch:{ 02S -> 0x033c }
            X.11F r12 = (X.AnonymousClass11F) r12     // Catch:{ 02S -> 0x033c }
            if (r12 == 0) goto L_0x02ac
            X.18z r0 = r4.A03     // Catch:{ 02S -> 0x033c }
            boolean r0 = r0.A0P(r12)     // Catch:{ 02S -> 0x033c }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02ac
            X.1A6 r0 = r4.A05     // Catch:{ 02S -> 0x033c }
            java.util.ArrayList r0 = r0.A04()     // Catch:{ 02S -> 0x033c }
            boolean r0 = r0.contains(r12)     // Catch:{ 02S -> 0x033c }
            if (r0 != 0) goto L_0x02ac
            com.whatsapp.jid.Jid r0 = r2.A06(r10)     // Catch:{ 02S -> 0x033c }
            X.11F r0 = (X.AnonymousClass11F) r0     // Catch:{ 02S -> 0x033c }
            X.C18740tg.A06(r0)     // Catch:{ 02S -> 0x033c }
            boolean r0 = X.AnonymousClass1A5.A00(r0, r1)     // Catch:{ 02S -> 0x033c }
            if (r0 == 0) goto L_0x02ac
            r7.add(r2)     // Catch:{ 02S -> 0x033c }
            X.11F r0 = r2.A0H     // Catch:{ 02S -> 0x033c }
            boolean r0 = X.AnonymousClass143.A0I(r0)     // Catch:{ 02S -> 0x033c }
            if (r0 == 0) goto L_0x02ac
            int r9 = r9 + 1
            goto L_0x02ac
        L_0x02fc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 02S -> 0x033c }
            r1.<init>()     // Catch:{ 02S -> 0x033c }
            java.lang.String r0 = "found: "
            r1.append(r0)     // Catch:{ 02S -> 0x033c }
            int r0 = r7.size()     // Catch:{ 02S -> 0x033c }
            r1.append(r0)     // Catch:{ 02S -> 0x033c }
            java.lang.String r0 = " | "
            r1.append(r0)     // Catch:{ 02S -> 0x033c }
            r1.append(r9)     // Catch:{ 02S -> 0x033c }
            java.lang.String r0 = r1.toString()     // Catch:{ 02S -> 0x033c }
            r11.A02(r0)     // Catch:{ 02S -> 0x033c }
            long r2 = A00(r3, r5, r11, r6)     // Catch:{ 02S -> 0x033c }
            long r2 = r2 - r16
            X.2R3 r1 = new X.2R3     // Catch:{ 02S -> 0x033c }
            r1.<init>()     // Catch:{ 02S -> 0x033c }
            r1.A02 = r8     // Catch:{ 02S -> 0x033c }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ 02S -> 0x033c }
            r1.A04 = r0     // Catch:{ 02S -> 0x033c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ 02S -> 0x033c }
            r1.A00 = r0     // Catch:{ 02S -> 0x033c }
            X.0yW r0 = r4.A07     // Catch:{ 02S -> 0x033c }
            r0.Bly(r1)     // Catch:{ 02S -> 0x033c }
            goto L_0x05cd
        L_0x033c:
            java.lang.String r0 = "cancelled"
            r11.A02(r0)     // Catch:{ all -> 0x05d1 }
            long r3 = r11.A00()     // Catch:{ all -> 0x05d1 }
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0353
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerDrop(r0, r6)     // Catch:{ all -> 0x05d1 }
            goto L_0x05cd
        L_0x0353:
            r1 = 4
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerEnd(r0, r6, r1)     // Catch:{ all -> 0x05d1 }
            goto L_0x05cd
        L_0x035c:
            java.lang.Object r10 = r1.A00
            X.1S8 r10 = (X.AnonymousClass1S8) r10
            X.35p r2 = (X.C598735p) r2
            java.lang.String r20 = "found groups in common"
            java.lang.String r1 = "filtered contacts"
            long r18 = android.os.SystemClock.uptimeMillis()
            X.00s r9 = r10.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.A0C(r0)
            java.lang.Object r4 = r2.A01
            X.1S9 r4 = (X.AnonymousClass1S9) r4
            r0 = 3
            int r8 = X.AnonymousClass6R7.A00(r0)
            X.0Bk r0 = r2.A00
            r21 = r0
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r0 = r4.A02
            r5 = 0
            if (r0 == 0) goto L_0x03b1
            int r3 = r0.size()
        L_0x038c:
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x0394
            int r5 = r0.size()
        L_0x0394:
            int r3 = r3 + r5
            if (r3 == 0) goto L_0x03cd
            r0 = 10
            if (r3 > r0) goto L_0x03cd
            java.util.Set r0 = r4.A02
            if (r0 == 0) goto L_0x03b3
            java.util.Iterator r3 = r0.iterator()
        L_0x03a3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03b3
            java.lang.Object r0 = r3.next()
            r2.add(r0)
            goto L_0x03a3
        L_0x03b1:
            r3 = 0
            goto L_0x038c
        L_0x03b3:
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x03cd
            java.util.Iterator r3 = r0.iterator()
        L_0x03bb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03cd
            java.lang.Object r0 = r3.next()
            X.141 r0 = (X.AnonymousClass141) r0
            X.11F r0 = r0.A0H
            r2.add(r0)
            goto L_0x03bb
        L_0x03cd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "GroupSearchManager/getGroupsForQuery/"
            r3.append(r0)
            int r0 = r2.size()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            X.14g r11 = new X.14g
            r11.<init>((java.lang.String) r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            int r0 = r4.A00
            if (r0 != 0) goto L_0x05d6
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x05d6
            boolean r0 = r2.isEmpty()     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x0410
            java.lang.String r0 = "empty"
            r11.A02(r0)     // Catch:{ 02S -> 0x05ac }
            r11.A01()     // Catch:{ 02S -> 0x05ac }
            X.0ze r1 = r10.A06     // Catch:{ 02S -> 0x05ac }
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r1.markerDrop(r0, r8)     // Catch:{ 02S -> 0x05ac }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 02S -> 0x05ac }
            r9.A0C(r0)     // Catch:{ 02S -> 0x05ac }
            goto L_0x05cd
        L_0x0410:
            r11.A02(r1)     // Catch:{ 02S -> 0x05ac }
            X.0ze r6 = r10.A06     // Catch:{ 02S -> 0x05ac }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ 02S -> 0x05ac }
            X.AnonymousClass6R7.A01(r6, r5, r1)     // Catch:{ 02S -> 0x05ac }
            r21.A04()     // Catch:{ 02S -> 0x05ac }
            X.1S7 r13 = r10.A05     // Catch:{ 02S -> 0x05ac }
            int r15 = r10.A00     // Catch:{ 02S -> 0x05ac }
            X.0wQ r1 = r13.A00     // Catch:{ 02S -> 0x05ac }
            r1.A0G()     // Catch:{ 02S -> 0x05ac }
            X.142 r0 = r1.A0E     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x057a
            X.11F r14 = r0.A0H     // Catch:{ 02S -> 0x05ac }
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ 02S -> 0x05ac }
            X.13w r12 = r1.A08()     // Catch:{ 02S -> 0x05ac }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ 02S -> 0x05ac }
            r1.<init>()     // Catch:{ 02S -> 0x05ac }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ 02S -> 0x05ac }
        L_0x043d:
            boolean r0 = r3.hasNext()     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x0457
            java.lang.Object r2 = r3.next()     // Catch:{ 02S -> 0x05ac }
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2     // Catch:{ 02S -> 0x05ac }
            boolean r0 = r2 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ 02S -> 0x05ac }
            if (r0 != 0) goto L_0x0453
            boolean r0 = X.AnonymousClass143.A0I(r2)     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x043d
        L_0x0453:
            r1.add(r2)     // Catch:{ 02S -> 0x05ac }
            goto L_0x043d
        L_0x0457:
            boolean r0 = r1.isEmpty()     // Catch:{ 02S -> 0x05ac }
            if (r0 != 0) goto L_0x057a
            r21.A04()     // Catch:{ 02S -> 0x05ac }
            java.util.HashMap r17 = new java.util.HashMap     // Catch:{ 02S -> 0x05ac }
            r17.<init>()     // Catch:{ 02S -> 0x05ac }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ 02S -> 0x05ac }
            r4.<init>()     // Catch:{ 02S -> 0x05ac }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ 02S -> 0x05ac }
            r3.<init>()     // Catch:{ 02S -> 0x05ac }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ 02S -> 0x05ac }
        L_0x0473:
            boolean r0 = r16.hasNext()     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x049f
            java.lang.Object r2 = r16.next()     // Catch:{ 02S -> 0x05ac }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ 02S -> 0x05ac }
            X.12O r0 = r13.A05     // Catch:{ 02S -> 0x05ac }
            com.whatsapp.jid.UserJid r1 = r0.A0B(r2)     // Catch:{ 02S -> 0x05ac }
            boolean r0 = r2 instanceof X.C223313w     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x0492
            r3.add(r2)     // Catch:{ 02S -> 0x05ac }
            if (r1 == 0) goto L_0x0473
            r4.add(r1)     // Catch:{ 02S -> 0x05ac }
            goto L_0x0473
        L_0x0492:
            boolean r0 = r2 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x0473
            r4.add(r2)     // Catch:{ 02S -> 0x05ac }
            if (r1 == 0) goto L_0x0473
            r3.add(r1)     // Catch:{ 02S -> 0x05ac }
            goto L_0x0473
        L_0x049f:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ 02S -> 0x05ac }
            r1.<init>()     // Catch:{ 02S -> 0x05ac }
            boolean r0 = r4.isEmpty()     // Catch:{ 02S -> 0x05ac }
            if (r0 != 0) goto L_0x04e2
            if (r14 == 0) goto L_0x04e2
            X.17X r0 = r13.A03     // Catch:{ 02S -> 0x05ac }
            X.17r r0 = r0.A07     // Catch:{ 02S -> 0x05ac }
            java.util.HashMap r0 = r0.A0D(r14, r4, r15)     // Catch:{ 02S -> 0x05ac }
            java.util.Set r0 = r0.entrySet()     // Catch:{ 02S -> 0x05ac }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ 02S -> 0x05ac }
        L_0x04bc:
            boolean r0 = r14.hasNext()     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x04e2
            java.lang.Object r4 = r14.next()     // Catch:{ 02S -> 0x05ac }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ 02S -> 0x05ac }
            X.17b r2 = r13.A06     // Catch:{ 02S -> 0x05ac }
            java.lang.Object r0 = r4.getKey()     // Catch:{ 02S -> 0x05ac }
            X.144 r0 = (X.AnonymousClass144) r0     // Catch:{ 02S -> 0x05ac }
            boolean r0 = r2.A02(r0)     // Catch:{ 02S -> 0x05ac }
            if (r0 != 0) goto L_0x04bc
            java.lang.Object r2 = r4.getKey()     // Catch:{ 02S -> 0x05ac }
            java.lang.Object r0 = r4.getValue()     // Catch:{ 02S -> 0x05ac }
            r1.put(r2, r0)     // Catch:{ 02S -> 0x05ac }
            goto L_0x04bc
        L_0x04e2:
            r21.A04()     // Catch:{ 02S -> 0x05ac }
            boolean r0 = r3.isEmpty()     // Catch:{ 02S -> 0x05ac }
            if (r0 != 0) goto L_0x0526
            if (r12 == 0) goto L_0x0526
            X.17X r0 = r13.A03     // Catch:{ 02S -> 0x05ac }
            X.17r r0 = r0.A07     // Catch:{ 02S -> 0x05ac }
            java.util.HashMap r0 = r0.A0D(r12, r3, r15)     // Catch:{ 02S -> 0x05ac }
            java.util.Set r0 = r0.entrySet()     // Catch:{ 02S -> 0x05ac }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ 02S -> 0x05ac }
        L_0x04fd:
            boolean r0 = r4.hasNext()     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x0526
            java.lang.Object r3 = r4.next()     // Catch:{ 02S -> 0x05ac }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ 02S -> 0x05ac }
            r21.A04()     // Catch:{ 02S -> 0x05ac }
            X.17b r2 = r13.A06     // Catch:{ 02S -> 0x05ac }
            java.lang.Object r0 = r3.getKey()     // Catch:{ 02S -> 0x05ac }
            X.144 r0 = (X.AnonymousClass144) r0     // Catch:{ 02S -> 0x05ac }
            boolean r0 = r2.A02(r0)     // Catch:{ 02S -> 0x05ac }
            if (r0 != 0) goto L_0x04fd
            java.lang.Object r2 = r3.getKey()     // Catch:{ 02S -> 0x05ac }
            java.lang.Object r0 = r3.getValue()     // Catch:{ 02S -> 0x05ac }
            r1.put(r2, r0)     // Catch:{ 02S -> 0x05ac }
            goto L_0x04fd
        L_0x0526:
            r0 = r17
            r0.putAll(r1)     // Catch:{ 02S -> 0x05ac }
            X.16D r1 = r13.A01     // Catch:{ 02S -> 0x05ac }
            java.util.Set r0 = r17.keySet()     // Catch:{ 02S -> 0x05ac }
            java.util.HashMap r12 = r1.A0K(r0)     // Catch:{ 02S -> 0x05ac }
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ 02S -> 0x05ac }
            java.util.Set r0 = r17.entrySet()     // Catch:{ 02S -> 0x05ac }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ 02S -> 0x05ac }
        L_0x0541:
            boolean r0 = r15.hasNext()     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x057e
            java.lang.Object r2 = r15.next()     // Catch:{ 02S -> 0x05ac }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ 02S -> 0x05ac }
            r21.A04()     // Catch:{ 02S -> 0x05ac }
            java.lang.Object r0 = r2.getKey()     // Catch:{ 02S -> 0x05ac }
            java.lang.Object r4 = r12.get(r0)     // Catch:{ 02S -> 0x05ac }
            X.141 r4 = (X.AnonymousClass141) r4     // Catch:{ 02S -> 0x05ac }
            X.1Cv r1 = r13.A04     // Catch:{ 02S -> 0x05ac }
            X.11F r0 = r4.A0H     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x0577
            X.3T1 r0 = r1.A05(r0)     // Catch:{ 02S -> 0x05ac }
            if (r0 == 0) goto L_0x0577
            long r0 = r0.A0I     // Catch:{ 02S -> 0x05ac }
        L_0x0568:
            java.lang.Object r3 = r2.getValue()     // Catch:{ 02S -> 0x05ac }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ 02S -> 0x05ac }
            X.5Jp r2 = new X.5Jp     // Catch:{ 02S -> 0x05ac }
            r2.<init>(r4, r3, r0)     // Catch:{ 02S -> 0x05ac }
            r14.add(r2)     // Catch:{ 02S -> 0x05ac }
            goto L_0x0541
        L_0x0577:
            r0 = -1
            goto L_0x0568
        L_0x057a:
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ 02S -> 0x05ac }
        L_0x057e:
            r7.addAll(r14)     // Catch:{ 02S -> 0x05ac }
            r0 = r20
            r11.A02(r0)     // Catch:{ 02S -> 0x05ac }
            X.AnonymousClass6R7.A01(r6, r5, r0)     // Catch:{ 02S -> 0x05ac }
            X.76E r0 = X.AnonymousClass76E.A00     // Catch:{ 02S -> 0x05ac }
            java.util.Collections.sort(r7, r0)     // Catch:{ 02S -> 0x05ac }
            long r2 = A00(r9, r6, r11, r8)     // Catch:{ 02S -> 0x05ac }
            long r2 = r2 - r18
            X.2R3 r1 = new X.2R3     // Catch:{ 02S -> 0x05ac }
            r1.<init>()     // Catch:{ 02S -> 0x05ac }
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 02S -> 0x05ac }
            r1.A02 = r0     // Catch:{ 02S -> 0x05ac }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ 02S -> 0x05ac }
            r1.A04 = r0     // Catch:{ 02S -> 0x05ac }
            X.0yW r0 = r10.A04     // Catch:{ 02S -> 0x05ac }
            r0.Bly(r1)     // Catch:{ 02S -> 0x05ac }
            goto L_0x05cd
        L_0x05ac:
            java.lang.String r0 = "cancelled"
            r11.A02(r0)     // Catch:{ all -> 0x05d1 }
            long r3 = r11.A00()     // Catch:{ all -> 0x05d1 }
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x05c4
            X.0ze r1 = r10.A06     // Catch:{ all -> 0x05d1 }
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r1.markerDrop(r0, r8)     // Catch:{ all -> 0x05d1 }
            goto L_0x05cd
        L_0x05c4:
            X.0ze r2 = r10.A06     // Catch:{ all -> 0x05d1 }
            r1 = 4
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r2.markerEnd(r0, r8, r1)     // Catch:{ all -> 0x05d1 }
        L_0x05cd:
            r11.A01()
            return r7
        L_0x05d1:
            r0 = move-exception
            r11.A01()
            throw r0
        L_0x05d6:
            java.lang.String r0 = "empty"
            r11.A02(r0)
            r11.A01()
            X.0ze r1 = r10.A06
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r1.markerDrop(r0, r8)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.A0C(r0)
            return r7
        L_0x05ec:
            java.lang.Object r4 = r1.A00
            X.1S6 r4 = (X.AnonymousClass1S6) r4
            X.35p r2 = (X.C598735p) r2
            X.0Bk r10 = r2.A00
            r4.A0O = r10
            java.lang.Object r1 = r2.A01
            X.1S3 r1 = (X.AnonymousClass1S3) r1
            int r0 = r1.A02
            if (r0 != 0) goto L_0x0610
            X.11F r2 = r1.A04
            r0 = 0
            if (r2 == 0) goto L_0x0604
            r0 = 1
        L_0x0604:
            if (r0 != 0) goto L_0x0616
            java.lang.String r0 = r1.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0616
        L_0x0610:
            android.util.SparseIntArray r7 = new android.util.SparseIntArray
            r7.<init>()
            return r7
        L_0x0616:
            X.00s r3 = r4.A09
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A0C(r0)
            X.0xu r6 = r4.A0C
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "FtsMessageStore/getMediaCounts/"
            X.14g r2 = A01(r1, r0, r2)
            android.util.SparseIntArray r7 = new android.util.SparseIntArray
            r7.<init>()
            boolean r0 = r6.A0N()
            if (r0 != 0) goto L_0x0643
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x0637:
            r2.A02(r0)
        L_0x063a:
            r2.A01()
        L_0x063d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.A0C(r0)
            return r7
        L_0x0643:
            boolean r0 = X.C20650xu.A07(r10)
            java.lang.String r11 = "cancelled"
            if (r0 != 0) goto L_0x0746
            long r8 = r6.A09()
            r4 = 1
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0658
            java.lang.String r0 = "v1"
            goto L_0x0637
        L_0x0658:
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.lang.String r0 = r1.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r14 = ""
            if (r0 == 0) goto L_0x06a5
            X.11F r0 = r1.A04
            if (r0 != 0) goto L_0x06a5
            r13 = r14
        L_0x0671:
            X.0ts r0 = r6.A04
            X.1S3 r9 = new X.1S3
            r9.<init>(r0)
            int[] r15 = X.C20650xu.A0P
            r5 = 7
            r4 = 0
        L_0x067c:
            if (r4 >= r5) goto L_0x06ab
            r1 = r15[r4]
            java.lang.String r0 = "SELECT count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? "
            r12.add(r0)
            r9.A02 = r1
            java.lang.String r0 = X.C20650xu.A02(r10, r6, r9, r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            r8.add(r0)
            int r4 = r4 + 1
            goto L_0x067c
        L_0x06a5:
            r0 = 0
            java.lang.String r13 = r6.A0E(r10, r1, r0)
            goto L_0x0671
        L_0x06ab:
            boolean r0 = X.C20650xu.A07(r10)
            if (r0 != 0) goto L_0x0746
            java.lang.String r0 = " UNION ALL "
            java.lang.String r5 = android.text.TextUtils.join(r0, r12)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r8.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String r0 = "matchterm"
            r2.A02(r0)
            X.12P r0 = r6.A0C     // Catch:{ SQLiteDatabaseCorruptException -> 0x0739, SQLiteException -> 0x0729, 02S -> 0x0742, Exception -> 0x0723 }
            X.1M0 r8 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0739, SQLiteException -> 0x0729, 02S -> 0x0742, Exception -> 0x0723 }
            X.14e r1 = r8.A02     // Catch:{ all -> 0x0719 }
            java.lang.String r0 = "GET_MEDIA_COUNTS"
            X.1lC r9 = r1.A0B(r10, r5, r0, r4)     // Catch:{ all -> 0x0719 }
            java.lang.String r0 = "count"
            int r5 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x070f }
            r4 = 0
        L_0x06da:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x0703
            boolean r0 = X.C20650xu.A07(r10)     // Catch:{ all -> 0x070f }
            if (r0 == 0) goto L_0x06ed
            r2.A02(r11)     // Catch:{ all -> 0x070f }
            r2.A01()     // Catch:{ all -> 0x070f }
            goto L_0x06fb
        L_0x06ed:
            int r1 = r9.getInt(r5)     // Catch:{ all -> 0x070f }
            if (r1 <= 0) goto L_0x06f8
            r0 = r15[r4]     // Catch:{ all -> 0x070f }
            r7.put(r0, r1)     // Catch:{ all -> 0x070f }
        L_0x06f8:
            int r4 = r4 + 1
            goto L_0x06da
        L_0x06fb:
            r9.close()     // Catch:{ all -> 0x0719 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0739, SQLiteException -> 0x0729, 02S -> 0x0742, Exception -> 0x0723 }
            goto L_0x063d
        L_0x0703:
            java.lang.String r0 = "counted"
            r2.A02(r0)     // Catch:{ all -> 0x070f }
            r9.close()     // Catch:{ all -> 0x0719 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0739, SQLiteException -> 0x0729, 02S -> 0x0742, Exception -> 0x0723 }
            goto L_0x0742
        L_0x070f:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0714 }
            goto L_0x0718
        L_0x0714:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0719 }
        L_0x0718:
            throw r1     // Catch:{ all -> 0x0719 }
        L_0x0719:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x071e }
            goto L_0x0722
        L_0x071e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0739, SQLiteException -> 0x0729, 02S -> 0x0742, Exception -> 0x0723 }
        L_0x0722:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0739, SQLiteException -> 0x0729, 02S -> 0x0742, Exception -> 0x0723 }
        L_0x0723:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 == 0) goto L_0x0c22
            goto L_0x0742
        L_0x0729:
            r1 = move-exception
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "error"
            r2.A02(r0)
            r2.A01()
            goto L_0x063d
        L_0x0739:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r6.A0B
            r0.A03()
        L_0x0742:
            java.lang.String r0 = "complete"
            goto L_0x0637
        L_0x0746:
            r2.A02(r11)
            goto L_0x063a
        L_0x074b:
            java.lang.Object r9 = r1.A00
            X.1S6 r9 = (X.AnonymousClass1S6) r9
            X.35p r2 = (X.C598735p) r2
            X.0Bk r12 = r2.A00
            r9.A0P = r12
            long r19 = android.os.SystemClock.uptimeMillis()
            X.00s r0 = r9.A0A
            r30 = r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.A0C(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A0J
            r29 = r0
            r1 = 1
            r0.set(r1)
            java.lang.Object r8 = r2.A01
            X.1S3 r8 = (X.AnonymousClass1S3) r8
            int r0 = r8.A00
            r28 = r0
            X.08S r0 = r9.A04
            java.lang.Object r7 = r0.A04()
            X.1Rt r7 = (X.C28211Rt) r7
            r3 = 2
            int r6 = X.AnonymousClass6R7.A00(r3)
            X.0ze r5 = r9.A0F
            r2 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerStart(r2, r6)
            int r1 = r8.A00
            java.lang.String r0 = "page"
            r5.markerAnnotate((int) r2, (int) r6, (java.lang.String) r0, (int) r1)
            int r1 = r8.A02
            java.lang.String r0 = "type"
            r5.markerAnnotate((int) r2, (int) r6, (java.lang.String) r0, (int) r1)
            X.11F r0 = r8.A04
            r1 = 0
            if (r0 == 0) goto L_0x079b
            r1 = 1
        L_0x079b:
            java.lang.String r0 = "jid"
            r5.markerAnnotate((int) r2, (int) r6, (java.lang.String) r0, (boolean) r1)
            A02(r5, r8, r6, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageSearchManager/getMessagesForQuery/"
            X.14g r21 = A01(r8, r0, r1)
            java.lang.Boolean r0 = r8.A08
            if (r0 == 0) goto L_0x0827
            java.lang.Boolean r0 = r8.A01()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0827
            r0 = 0
            r8.A08 = r0
            r3 = 1
        L_0x07c0:
            X.0xu r2 = r9.A0C
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            android.util.Pair r11 = r2.A0A(r12, r8, r13)
            java.lang.Object r0 = r11.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = -2
            if (r1 != r0) goto L_0x07dc
            r0 = 0
            r8.A0E = r0
            android.util.Pair r11 = r2.A0A(r12, r8, r13)
        L_0x07dc:
            java.lang.Object r0 = r11.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            if (r1 == 0) goto L_0x07eb
            r0 = -3
            r18 = 0
            if (r1 != r0) goto L_0x07ed
        L_0x07eb:
            r18 = 1
        L_0x07ed:
            java.lang.Object r0 = r11.second
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
            java.lang.String r0 = "search"
            X.AnonymousClass6R7.A01(r5, r13, r0)
        L_0x07fa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0829
            java.lang.Object r1 = r2.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            if (r3 == 0) goto L_0x0810
            boolean r0 = r1.A15
            if (r0 == 0) goto L_0x0810
        L_0x080c:
            r2.remove()
            goto L_0x07fa
        L_0x0810:
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass143.A0H(r0)
            if (r0 != 0) goto L_0x0823
            X.11F r0 = r1.A0N
            boolean r1 = X.AnonymousClass143.A0H(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0824
        L_0x0823:
            r0 = 1
        L_0x0824:
            if (r0 == 0) goto L_0x07fa
            goto L_0x080c
        L_0x0827:
            r3 = 0
            goto L_0x07c0
        L_0x0829:
            java.lang.String r0 = "remove starred"
            X.AnonymousClass6R7.A01(r5, r13, r0)
            java.lang.Object r1 = r11.second
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r17 = new java.util.ArrayList
            r0 = r17
            r0.<init>(r1)
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.1S3 r0 = r9.A0G
            X.6bb r14 = r0.A06
            java.util.Iterator r16 = r17.iterator()
        L_0x0851:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x08ac
            java.lang.Object r1 = r16.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            if (r1 == 0) goto L_0x087a
            boolean r0 = r1.A1P
            if (r0 != 0) goto L_0x087a
            if (r14 == 0) goto L_0x087e
            X.3Qa r0 = r1.A1J
            X.11F r15 = r0.A00
            if (r15 == 0) goto L_0x087e
            X.1Rh r0 = r9.A0I
            X.4Q7 r0 = r0.A01(r14)
            X.C18740tg.A06(r0)
            boolean r0 = r0.B7L(r15)
            if (r0 != 0) goto L_0x087e
        L_0x087a:
            r16.remove()
            goto L_0x0851
        L_0x087e:
            boolean r0 = r1.A15
            if (r0 == 0) goto L_0x089d
            r4.add(r1)
        L_0x0885:
            boolean r0 = r1 instanceof X.C46882bp
            if (r0 != 0) goto L_0x0891
            boolean r0 = r1 instanceof X.C47002cZ
            if (r0 != 0) goto L_0x0891
            boolean r0 = r1 instanceof X.C46812bi
            if (r0 == 0) goto L_0x0851
        L_0x0891:
            X.2bU r1 = (X.AnonymousClass2bU) r1
            boolean r0 = r1.A1g()
            if (r0 == 0) goto L_0x0851
            r2.add(r1)
            goto L_0x0851
        L_0x089d:
            int r0 = r1.A0E()
            r15 = 1
            if (r0 != r15) goto L_0x08a8
            r10.add(r1)
            goto L_0x0885
        L_0x08a8:
            r3.add(r1)
            goto L_0x0885
        L_0x08ac:
            java.lang.String r0 = "filter"
            X.AnonymousClass6R7.A01(r5, r13, r0)
            if (r7 == 0) goto L_0x08e5
            java.util.List r1 = r7.A02
            r0 = r17
            r1.addAll(r0)
            java.util.List r0 = r7.A00
            r0.addAll(r10)
            java.util.List r0 = r7.A03
            r0.addAll(r4)
            java.util.List r0 = r7.A04
            r0.addAll(r3)
            java.util.List r0 = r7.A01
            r0.addAll(r2)
        L_0x08ce:
            boolean r0 = r12.A06()
            if (r0 == 0) goto L_0x08ff
            long r3 = r21.A00()
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x08f7
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerDrop(r0, r6)
            return r7
        L_0x08e5:
            X.1Rt r7 = new X.1Rt
            r22 = r7
            r23 = r17
            r24 = r10
            r25 = r4
            r26 = r3
            r27 = r2
            r22.<init>(r23, r24, r25, r26, r27)
            goto L_0x08ce
        L_0x08f7:
            r1 = 4
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerEnd(r0, r6, r1)
            return r7
        L_0x08ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "found: "
            r1.append(r0)
            java.lang.Object r0 = r11.first
            r1.append(r0)
            java.lang.String r0 = "|:"
            r1.append(r0)
            java.lang.Object r0 = r11.second
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = r21
            r0.A02(r1)
            r21.A01()
            X.00s r1 = r9.A08
            if (r18 == 0) goto L_0x0980
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0C(r0)
            java.lang.Boolean r0 = r8.A01()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0947
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = r30
            r0.A0C(r1)
        L_0x0947:
            r1 = 0
            r0 = r29
            r0.set(r1)
            r1 = 2
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerEnd(r0, r6, r1)
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r19
            X.2R3 r2 = new X.2R3
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.A04 = r0
            java.lang.Boolean r0 = r8.A01()
            r2.A01 = r0
            int r0 = r8.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A03 = r0
            X.0yW r0 = r9.A0E
            r0.Bly(r2)
            return r7
        L_0x0980:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r1.A0C(r0)
            goto L_0x0947
        L_0x0988:
            java.lang.Object r6 = r1.A00
            X.1S6 r6 = (X.AnonymousClass1S6) r6
            X.35p r2 = (X.C598735p) r2
            X.0Bk r8 = r2.A00
            r6.A0N = r8
            java.lang.Object r7 = r2.A01
            X.1S3 r7 = (X.AnonymousClass1S3) r7
            X.11F r0 = r7.A04
            if (r0 == 0) goto L_0x09a6
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Set r2 = java.util.Collections.EMPTY_SET
        L_0x09a0:
            X.37M r7 = new X.37M
            r7.<init>(r6, r5, r2)
            return r7
        L_0x09a6:
            X.00s r4 = r6.A07
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.A0C(r0)
            X.0xu r3 = r6.A0C
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FtsMessageStore/findChats/"
            X.14g r2 = A01(r7, r0, r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            boolean r0 = r3.A0N()
            if (r0 != 0) goto L_0x0a05
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x09c6:
            r2.A02(r0)
        L_0x09c9:
            r2.A01()
        L_0x09cc:
            X.0yC r2 = r6.A0D
            r1 = 1448(0x5a8, float:2.029E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0c19
            r0 = 0
            java.util.ArrayList r0 = r3.A0I(r8, r7, r0)
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L_0x09e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c11
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            if (r2 != 0) goto L_0x09fd
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.Object r0 = r0.second
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            goto L_0x09e2
        L_0x09fd:
            java.lang.Object r0 = r0.second
            java.util.Collection r0 = (java.util.Collection) r0
            r2.retainAll(r0)
            goto L_0x09e2
        L_0x0a05:
            boolean r0 = X.C20650xu.A07(r8)
            java.lang.String r10 = "cancelled"
            if (r0 == 0) goto L_0x0a11
            r2.A02(r10)
            goto L_0x09c9
        L_0x0a11:
            java.util.List r0 = r7.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0a20
            java.lang.String r0 = "empty"
            goto L_0x09c6
        L_0x0a20:
            long r13 = r3.A09()
            r11 = 1
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0a2d
            java.lang.String r0 = "v1"
            goto L_0x09c6
        L_0x0a2d:
            java.util.List r0 = r7.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0a5a
            java.lang.String r9 = ""
        L_0x0a3b:
            r0 = 0
            java.lang.String r1 = r3.A0E(r8, r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r12 = " "
            r0.append(r12)
            r0.append(r9)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = "matchterm"
            r2.A02(r0)
            goto L_0x0ad2
        L_0x0a5a:
            r0 = 0
            java.util.ArrayList r0 = r3.A0I(r8, r7, r0)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x0a68:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0a8e
            java.lang.Object r0 = r12.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r11 = r0.iterator()
        L_0x0a7c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0a68
            java.lang.Object r1 = r11.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0a7c
            r9.add(r1)
            goto L_0x0a7c
        L_0x0a8e:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0ace
            int r0 = r9.size()
            java.lang.String[] r12 = new java.lang.String[r0]
            r14 = 0
            java.util.Iterator r13 = r9.iterator()
        L_0x0a9f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0ac6
            java.lang.Object r11 = r13.next()
            X.11F r11 = (X.AnonymousClass11F) r11
            int r9 = r14 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "fts_jid:"
            r1.append(r0)
            java.lang.String r0 = r3.A0F(r11)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12[r14] = r0
            r14 = r9
            goto L_0x0a9f
        L_0x0ac6:
            java.lang.String r0 = " OR "
            java.lang.String r9 = android.text.TextUtils.join(r0, r12)
            if (r9 != 0) goto L_0x0a3b
        L_0x0ace:
            java.lang.String r0 = "no user"
            goto L_0x09c6
        L_0x0ad2:
            X.12P r0 = r3.A0C     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c04, SQLiteException -> 0x0bf4, 02S -> 0x0c0d, Exception -> 0x0bee }
            X.1M0 r19 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c04, SQLiteException -> 0x0bf4, 02S -> 0x0c0d, Exception -> 0x0bee }
            r0 = r19
            X.14e r11 = r0.A02     // Catch:{ all -> 0x0be4 }
            java.lang.String r9 = "SELECT fts_jid, count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? GROUP BY fts_jid"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0be4 }
            r13 = 0
            r1[r13] = r14     // Catch:{ all -> 0x0be4 }
            java.lang.String r0 = "SEARCH_FTS_JID_SQL"
            X.1lC r9 = r11.A0B(r8, r9, r0, r1)     // Catch:{ all -> 0x0be4 }
            java.lang.String r0 = "fts_jid"
            int r18 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0bda }
            java.lang.String r0 = "count"
            int r17 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0bda }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x0bda }
            r11.<init>()     // Catch:{ all -> 0x0bda }
        L_0x0afb:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0bda }
            if (r0 == 0) goto L_0x0b3e
            boolean r0 = X.C20650xu.A07(r8)     // Catch:{ all -> 0x0bda }
            if (r0 != 0) goto L_0x0b66
            r0 = r18
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0bda }
            java.lang.String[] r14 = android.text.TextUtils.split(r0, r12)     // Catch:{ all -> 0x0bda }
            r0 = r17
            int r16 = r9.getInt(r0)     // Catch:{ all -> 0x0bda }
            int r15 = r14.length     // Catch:{ all -> 0x0bda }
        L_0x0b18:
            if (r13 >= r15) goto L_0x0b3c
            r1 = r14[r13]     // Catch:{ all -> 0x0bda }
            java.lang.Object r0 = r11.get(r1)     // Catch:{ all -> 0x0bda }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0bda }
            if (r0 != 0) goto L_0x0b2c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0bda }
            r11.put(r1, r0)     // Catch:{ all -> 0x0bda }
            goto L_0x0b39
        L_0x0b2c:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0bda }
            int r0 = r0 + r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0bda }
            r11.put(r1, r0)     // Catch:{ all -> 0x0bda }
        L_0x0b39:
            int r13 = r13 + 1
            goto L_0x0b18
        L_0x0b3c:
            r13 = 0
            goto L_0x0afb
        L_0x0b3e:
            java.lang.String r0 = "counted"
            r2.A02(r0)     // Catch:{ all -> 0x0bda }
            java.util.Set r0 = r11.entrySet()     // Catch:{ all -> 0x0bda }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0bda }
            r1.<init>(r0)     // Catch:{ all -> 0x0bda }
            boolean r0 = X.C20650xu.A07(r8)     // Catch:{ all -> 0x0bda }
            if (r0 != 0) goto L_0x0b66
            X.75y r0 = X.C1506175y.A00     // Catch:{ all -> 0x0bda }
            java.util.Collections.sort(r1, r0)     // Catch:{ all -> 0x0bda }
            java.lang.String r0 = "sorted"
            r2.A02(r0)     // Catch:{ all -> 0x0bda }
            java.util.Iterator r15 = r1.iterator()     // Catch:{ all -> 0x0bda }
            boolean r0 = X.C20650xu.A07(r8)     // Catch:{ all -> 0x0bda }
            if (r0 == 0) goto L_0x0b6d
        L_0x0b66:
            r2.A02(r10)     // Catch:{ all -> 0x0bda }
            r2.A01()     // Catch:{ all -> 0x0bda }
            goto L_0x0bc6
        L_0x0b6d:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0bda }
            if (r0 == 0) goto L_0x0bce
            int r1 = r5.size()     // Catch:{ all -> 0x0bda }
            r0 = 5
            if (r1 >= r0) goto L_0x0bce
            boolean r0 = X.C20650xu.A07(r8)     // Catch:{ all -> 0x0bda }
            if (r0 != 0) goto L_0x0b66
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x0bda }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0bda }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0bda }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0bda }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0bda }
            r12 = 0
            if (r0 != 0) goto L_0x0bb8
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0bda }
            if (r0 != 0) goto L_0x0bb8
            r0 = 36
            long r0 = java.lang.Long.parseLong(r1, r0)     // Catch:{ Exception -> 0x0ba2 }
            goto L_0x0bab
        L_0x0ba2:
            r11 = move-exception
            X.0wN r1 = r3.A01     // Catch:{ all -> 0x0bda }
            java.lang.String r0 = "ftsMessageStore/corrupt_db"
            r1.A0D(r0, r12, r11)     // Catch:{ all -> 0x0bda }
            goto L_0x0bb8
        L_0x0bab:
            X.12j r14 = r3.A09     // Catch:{ all -> 0x0bda }
            java.lang.Class<X.11F> r13 = X.AnonymousClass11F.class
            r11 = 10
            long r0 = r0 - r11
            com.whatsapp.jid.Jid r12 = r14.A0C(r13, r0)     // Catch:{ all -> 0x0bda }
            X.11F r12 = (X.AnonymousClass11F) r12     // Catch:{ all -> 0x0bda }
        L_0x0bb8:
            boolean r0 = r12 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x0bda }
            if (r0 == 0) goto L_0x0b6d
            X.1A5 r0 = r3.A07     // Catch:{ all -> 0x0bda }
            X.141 r0 = r0.A01(r12)     // Catch:{ all -> 0x0bda }
            r5.add(r0)     // Catch:{ all -> 0x0bda }
            goto L_0x0b6d
        L_0x0bc6:
            r9.close()     // Catch:{ all -> 0x0be4 }
            r19.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c04, SQLiteException -> 0x0bf4, 02S -> 0x0c0d, Exception -> 0x0bee }
            goto L_0x09cc
        L_0x0bce:
            java.lang.String r0 = "lookup"
            r2.A02(r0)     // Catch:{ all -> 0x0bda }
            r9.close()     // Catch:{ all -> 0x0be4 }
            r19.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c04, SQLiteException -> 0x0bf4, 02S -> 0x0c0d, Exception -> 0x0bee }
            goto L_0x0c0d
        L_0x0bda:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0bdf }
            goto L_0x0be3
        L_0x0bdf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0be4 }
        L_0x0be3:
            throw r1     // Catch:{ all -> 0x0be4 }
        L_0x0be4:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0be9 }
            goto L_0x0bed
        L_0x0be9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c04, SQLiteException -> 0x0bf4, 02S -> 0x0c0d, Exception -> 0x0bee }
        L_0x0bed:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c04, SQLiteException -> 0x0bf4, 02S -> 0x0c0d, Exception -> 0x0bee }
        L_0x0bee:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 == 0) goto L_0x0c22
            goto L_0x0c0d
        L_0x0bf4:
            r1 = move-exception
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "error"
            r2.A02(r0)
            r2.A01()
            goto L_0x09cc
        L_0x0c04:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r3.A0B
            r0.A03()
        L_0x0c0d:
            java.lang.String r0 = "complete"
            goto L_0x09c6
        L_0x0c11:
            if (r2 != 0) goto L_0x0c1b
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            goto L_0x0c1b
        L_0x0c19:
            java.util.Set r2 = java.util.Collections.EMPTY_SET
        L_0x0c1b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.A0C(r0)
            goto L_0x09a0
        L_0x0c22:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36141jp.apply(java.lang.Object):java.lang.Object");
    }

    public static C224214g A01(AnonymousClass1S3 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A02().length());
        return new C224214g(sb.toString());
    }

    public static void A02(C21690ze r3, AnonymousClass1S3 r4, int i, int i2) {
        r3.markerAnnotate(926875649, i, "token_count", r4.A03().size());
        r3.markerAnnotate(926875649, i, "domain", i2);
    }
}

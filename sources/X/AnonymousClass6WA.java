package X;

import android.net.Uri;
import android.util.LruCache;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.6WA  reason: invalid class name */
public final class AnonymousClass6WA {
    public static final String[] A0B = {"weak", "medium", "high"};
    public AnonymousClass6C9 A00;
    public String A01;
    public String A02;
    public Set A03;
    public ConcurrentLinkedQueue A04;
    public boolean A05;
    public final LruCache A06 = new LruCache(50);
    public final AnonymousClass66D A07;
    public final C124135xe A08;
    public final AnonymousClass11F A09;
    public volatile AnonymousClass6DU A0A;

    public static final C195979Xa A00(B5W b5w, C122115uK r12) {
        String str = r12.A00;
        if (str.length() <= 0) {
            str = r12.A01;
            if (str.length() == 0) {
                str = "";
            }
        }
        C207239um A002 = C207239um.A00(Uri.parse(str), (Uri) null, r12.A03, "wa-avatar", (String) null, AnonymousClass001.A0J());
        A002.A0R = true;
        AnonymousClass65L r1 = new AnonymousClass65L(AnonymousClass5RZ.IN_PLAY, A002, "WA_BOT", 0);
        r1.A0C = true;
        r1.A02 = 1000;
        r1.A09 = r12.A02;
        C195979Xa A003 = r1.A00();
        A003.A04 = b5w;
        return A003;
    }

    private final C128676De A01(AnonymousClass6B8 r5) {
        Object A0K;
        List list = r5.A01;
        C36331k8.A1I(list, AnonymousClass0XG.A00);
        if (list.isEmpty()) {
            A0K = null;
        } else {
            A0K = C007103b.A0K(list, AnonymousClass0XG.A01.A02(list.size()));
        }
        C128676De r1 = (C128676De) A0K;
        if (!this.A05) {
            return r1;
        }
        if (r5.A00 >= list.size()) {
            r5.A00 = 0;
        }
        C128676De r12 = (C128676De) C007103b.A0P(list, r5.A00);
        r5.A00++;
        return r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0219, code lost:
        if (r15.keySet().contains(r4) != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0232, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        if (r15.keySet().contains(r8) != false) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass6WA r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, int r45) {
        /*
            r7 = r44
            r8 = r43
            r20 = r42
            r32 = 0
            r9 = r41
            X.6DU r0 = r9.A0A
            java.lang.String r18 = "Required value was null."
            if (r0 == 0) goto L_0x0354
            X.6C9 r2 = r9.A00
            if (r2 == 0) goto L_0x034f
            java.util.Map r3 = r0.A03
            java.lang.String r0 = r2.A03
            java.lang.Object r0 = r3.get(r0)
            X.6B9 r0 = (X.AnonymousClass6B9) r0
            if (r0 == 0) goto L_0x034a
            java.util.Map r1 = r0.A01
            r19 = r45
            r0 = r19
            java.lang.Object r11 = X.C36371kC.A0r(r1, r0)
            X.6BA r11 = (X.AnonymousClass6BA) r11
            if (r11 != 0) goto L_0x002f
            return
        L_0x002f:
            java.lang.String r6 = r11.A02
            r26 = r6
            java.util.Set r0 = r3.keySet()
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x003f
            java.lang.String r6 = r2.A03
        L_0x003f:
            java.lang.Object r1 = r3.get(r6)
            X.6B9 r1 = (X.AnonymousClass6B9) r1
            if (r1 == 0) goto L_0x0345
            X.66D r0 = r9.A07
            r25 = r0
            X.11F r0 = r9.A09
            r24 = r0
            java.lang.String r0 = r2.A03
            r34 = r0
            java.lang.String r0 = r2.A00
            r21 = r0
            java.lang.String r0 = r2.A02
            r22 = r0
            java.lang.String r0 = r2.A01
            r23 = r0
            int r12 = r11.A01
            r2 = r24
            r0 = r25
            java.lang.String r4 = r0.A00(r2)
            X.0yW r3 = r0.A00
            X.58U r2 = new X.58U
            r2.<init>()
            r2.A00 = r4
            switch(r45) {
                case 0: goto L_0x024a;
                case 1: goto L_0x024e;
                case 2: goto L_0x0252;
                case 3: goto L_0x0256;
                case 4: goto L_0x025a;
                case 5: goto L_0x025e;
                case 6: goto L_0x0262;
                default: goto L_0x0075;
            }
        L_0x0075:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown value("
            r4.append(r0)
            r0 = r19
            java.lang.String r0 = X.C36321k7.A0G(r4, r0)
        L_0x0084:
            r2.A09 = r0
            r0 = r20
            r2.A01 = r0
            r2.A03 = r8
            r2.A02 = r7
            r0 = r34
            r2.A08 = r0
            r0 = r21
            r2.A05 = r0
            r0 = r22
            r2.A07 = r0
            r0 = r23
            r2.A06 = r0
            if (r12 == 0) goto L_0x0246
            r0 = 1
            if (r12 == r0) goto L_0x0242
            java.lang.String r0 = "QUEUE_DURATION_BASED"
        L_0x00a5:
            r2.A04 = r0
            r3.Bly(r2)
            java.util.Map r2 = r1.A00
            java.util.Set r0 = r2.keySet()
            java.lang.Object r4 = X.AnonymousClass3R6.A00(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = r9.A02
            java.lang.String r1 = r9.A01
            if (r42 == 0) goto L_0x022e
            int r0 = r20.length()
            if (r0 <= 0) goto L_0x022e
            if (r43 == 0) goto L_0x022e
            int r0 = r8.length()
            if (r0 <= 0) goto L_0x022e
            if (r44 == 0) goto L_0x022e
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x022e
            r9.A02 = r8
            r9.A01 = r7
        L_0x00d6:
            int r0 = r20.length()
            if (r0 == 0) goto L_0x0236
            java.util.Set r1 = r2.keySet()
            r0 = r20
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0236
            r5 = r20
        L_0x00ea:
            java.lang.Object r1 = r2.get(r5)
            X.69i r1 = (X.C1277069i) r1
            if (r1 == 0) goto L_0x0340
            r4 = r8
            if (r8 == 0) goto L_0x0203
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0203
            java.util.Map r15 = r1.A00
            java.util.Set r0 = r15.keySet()
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0203
        L_0x0107:
            java.lang.Object r13 = r15.get(r4)
            X.6B7 r13 = (X.AnonymousClass6B7) r13
            if (r13 == 0) goto L_0x033b
            r17 = 1
            if (r7 == 0) goto L_0x01a6
            int r0 = r7.length()
            if (r0 == 0) goto L_0x01a6
            java.util.Map r1 = r13.A00
            java.util.Set r0 = r1.keySet()
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x01a6
            r10 = r7
        L_0x0126:
            java.lang.Object r0 = r1.get(r10)
            X.6B8 r0 = (X.AnonymousClass6B8) r0
            if (r0 == 0) goto L_0x032e
            X.6De r3 = r9.A01(r0)
            r0 = r26
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 != 0) goto L_0x016d
            X.5Ta r2 = X.C108315Ta.MISSING_STATE
        L_0x013c:
            java.util.Set r0 = r9.A03
            r15 = r0
            java.util.Iterator r13 = r0.iterator()
        L_0x0143:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0266
            r13.next()
            if (r2 == 0) goto L_0x016a
            long r0 = r2.value
        L_0x0150:
            X.6Dy r33 = new X.6Dy
            r35 = r26
            r36 = r6
            r37 = r21
            r38 = r5
            r39 = r22
            r40 = r4
            r41 = r23
            r42 = r10
            r43 = r19
            r44 = r0
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            goto L_0x0143
        L_0x016a:
            r0 = -1
            goto L_0x0150
        L_0x016d:
            r0 = r20
            boolean r0 = X.AnonymousClass00C.A0J(r5, r0)
            if (r0 != 0) goto L_0x0178
            X.5Ta r2 = X.C108315Ta.MISSING_TRIGGERING_ACTION
            goto L_0x013c
        L_0x0178:
            boolean r0 = X.AnonymousClass00C.A0J(r4, r8)
            if (r0 != 0) goto L_0x019a
            X.6DU r0 = r9.A0A
            if (r0 == 0) goto L_0x0197
            java.lang.String r1 = r0.A01
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0197
            java.util.Set r0 = r15.keySet()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0197
            X.5Ta r2 = X.C108315Ta.MISSING_TRIGGERING_SENTIMENT
            goto L_0x013c
        L_0x0197:
            X.5Ta r2 = X.C108315Ta.MISSING_GLOBAL_SENTIMENT
            goto L_0x013c
        L_0x019a:
            boolean r0 = X.AnonymousClass00C.A0J(r10, r7)
            if (r0 != 0) goto L_0x01a3
            X.5Ta r2 = X.C108315Ta.MISSING_TRIGGERING_INTENSITY
            goto L_0x013c
        L_0x01a3:
            r2 = r32
            goto L_0x013c
        L_0x01a6:
            java.lang.String[] r10 = A0B
            int r3 = X.AnonymousClass02R.A07(r7, r10)
            r0 = -1
            if (r3 == r0) goto L_0x01e7
            r2 = 1
        L_0x01b0:
            int r0 = r3 - r2
            if (r0 < 0) goto L_0x01c8
            java.util.Map r1 = r13.A00
            java.util.Set r14 = r1.keySet()
            r0 = r10[r0]
            boolean r0 = r14.contains(r0)
            if (r0 == 0) goto L_0x01c8
            int r3 = r3 - r17
            r10 = r10[r3]
            goto L_0x0126
        L_0x01c8:
            int r1 = r3 + r2
            r0 = 3
            if (r1 >= r0) goto L_0x01e1
            java.util.Map r1 = r13.A00
            java.util.Set r14 = r1.keySet()
            int r16 = r3 + 1
            r0 = r10[r16]
            boolean r0 = r14.contains(r0)
            if (r0 == 0) goto L_0x01e1
            r10 = r10[r16]
            goto L_0x0126
        L_0x01e1:
            int r2 = r2 + 1
            r0 = 3
            if (r2 >= r0) goto L_0x01e7
            goto L_0x01b0
        L_0x01e7:
            java.util.Map r1 = r13.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r1)
        L_0x01f1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0333
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r2)
            if (r0 == 0) goto L_0x01f1
            java.lang.String r10 = X.C90494aF.A0f(r0)
            goto L_0x0126
        L_0x0203:
            X.6DU r0 = r9.A0A
            if (r0 == 0) goto L_0x021d
            java.lang.String r4 = r0.A01
        L_0x0209:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0220
            java.util.Map r15 = r1.A00
            java.util.Set r0 = r15.keySet()
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0220
            goto L_0x0107
        L_0x021d:
            java.lang.String r4 = ""
            goto L_0x0209
        L_0x0220:
            java.util.Map r15 = r1.A00
            java.util.Set r0 = r15.keySet()
            java.lang.Object r4 = X.AnonymousClass3R6.A00(r0)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0107
        L_0x022e:
            r20 = r4
            r8 = r3
            r7 = r1
            if (r4 == 0) goto L_0x0236
            goto L_0x00d6
        L_0x0236:
            java.util.Set r0 = r2.keySet()
            java.lang.Object r5 = X.AnonymousClass3R6.A00(r0)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00ea
        L_0x0242:
            java.lang.String r0 = "QUEUE_FLUSH_APPEND"
            goto L_0x00a5
        L_0x0246:
            java.lang.String r0 = "APPEND"
            goto L_0x00a5
        L_0x024a:
            java.lang.String r0 = "NEUTRAL"
            goto L_0x0084
        L_0x024e:
            java.lang.String r0 = "START_TYPING"
            goto L_0x0084
        L_0x0252:
            java.lang.String r0 = "STOP_TYPING"
            goto L_0x0084
        L_0x0256:
            java.lang.String r0 = "SEND_QUERY"
            goto L_0x0084
        L_0x025a:
            java.lang.String r0 = "LLM_STREAMING"
            goto L_0x0084
        L_0x025e:
            java.lang.String r0 = "LLM_FINISHED"
            goto L_0x0084
        L_0x0262:
            java.lang.String r0 = "VIDEO_ABOUT_TO_FINISH"
            goto L_0x0084
        L_0x0266:
            if (r2 == 0) goto L_0x026f
            r1 = r24
            r0 = r25
            r0.A01(r2, r1)
        L_0x026f:
            if (r3 == 0) goto L_0x0326
            if (r12 == 0) goto L_0x0323
            r0 = 1
            if (r12 == r0) goto L_0x0320
            X.5xe r0 = r9.A08
            X.6WC r14 = r0.A05
            int r0 = r14.A00
            int r0 = r0 % 2
            X.6E3[] r13 = r14.A0E
            r0 = r13[r0]
            X.9ps r0 = r0.A02
            if (r0 == 0) goto L_0x031c
            long r0 = r0.A09()
        L_0x028a:
            int r12 = r14.A00
            int r12 = r12 % 2
            r12 = r13[r12]
            X.9ps r12 = r12.A02
            if (r12 == 0) goto L_0x0318
            long r12 = r12.A08()
        L_0x0298:
            long r0 = r0 - r12
            java.util.concurrent.ConcurrentLinkedQueue r12 = r14.A0C
            int r13 = r12.size()
            X.6Ai r12 = new X.6Ai
            r12.<init>(r0, r13)
            long r12 = r12.A00
            int r0 = r11.A00
            long r0 = (long) r0
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0320
            java.lang.Integer r12 = X.C023109s.A0C
        L_0x02af:
            if (r2 == 0) goto L_0x02bb
            long r0 = r2.value
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r32 = r0.toString()
        L_0x02bb:
            X.6E8 r1 = new X.6E8
            r24 = r26
            r25 = r20
            r26 = r8
            r27 = r7
            r28 = r6
            r29 = r5
            r30 = r4
            r31 = r10
            r33 = r19
            r19 = r1
            r20 = r34
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            android.util.LruCache r0 = r9.A06
            java.lang.String r11 = r3.A03
            r0.put(r11, r1)
            X.5xe r8 = r9.A08
            java.lang.String r7 = r3.A04
            java.lang.String r2 = r3.A02
            java.lang.String r0 = r3.A01
            X.5uK r1 = new X.5uK
            r1.<init>(r7, r2, r0, r11)
            X.6WC r3 = r8.A05
            X.6kG r0 = new X.6kG
            r0.<init>(r3)
            X.9Xa r2 = A00(r0, r1)
            int r0 = r12.intValue()
            int r1 = X.C90514aH.A0B(r0)
            r0 = 3
            java.lang.Integer[] r0 = X.C023109s.A00(r0)
            r0 = r0[r1]
            X.AnonymousClass00C.A08(r0)
            r3.A04(r2, r0)
            java.util.Iterator r1 = r15.iterator()
        L_0x030e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0326
            r1.next()
            goto L_0x030e
        L_0x0318:
            r12 = 0
            goto L_0x0298
        L_0x031c:
            r0 = 0
            goto L_0x028a
        L_0x0320:
            java.lang.Integer r12 = X.C023109s.A01
            goto L_0x02af
        L_0x0323:
            java.lang.Integer r12 = X.C023109s.A00
            goto L_0x02af
        L_0x0326:
            X.6C9 r0 = new X.6C9
            r0.<init>(r6, r5, r4, r10)
            r9.A00 = r0
            return
        L_0x032e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r18)
            throw r0
        L_0x0333:
            java.lang.String r1 = "No element of the map was transformed to a non-null value."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x033b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r18)
            throw r0
        L_0x0340:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r18)
            throw r0
        L_0x0345:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r18)
            throw r0
        L_0x034a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r18)
            throw r0
        L_0x034f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r18)
            throw r0
        L_0x0354:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WA.A02(X.6WA, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public final void A03() {
        AnonymousClass6C9 r0;
        if (this.A0A != null && (r0 = this.A00) != null) {
            String str = null;
            String str2 = r0.A03;
            String str3 = r0.A00;
            String str4 = r0.A02;
            String str5 = r0.A01;
            AnonymousClass6DU r02 = this.A0A;
            if (r02 != null) {
                C108315Ta r2 = null;
                Map map = r02.A03;
                AnonymousClass6B9 r03 = (AnonymousClass6B9) map.get(str2);
                if (r03 == null) {
                    r03 = (AnonymousClass6B9) AnonymousClass3R6.A00(map.values());
                    r2 = C108315Ta.MISSING_STATE;
                }
                Map map2 = r03.A00;
                C1277069i r04 = (C1277069i) map2.get(str3);
                if (r04 == null) {
                    r04 = (C1277069i) AnonymousClass3R6.A00(map2.values());
                    r2 = C108315Ta.MISSING_TRIGGERING_ACTION;
                }
                Map map3 = r04.A00;
                AnonymousClass6B7 r05 = (AnonymousClass6B7) map3.get(str4);
                if (r05 == null) {
                    r05 = (AnonymousClass6B7) AnonymousClass3R6.A00(map3.values());
                    r2 = C108315Ta.MISSING_TRIGGERING_SENTIMENT;
                }
                Map map4 = r05.A00;
                AnonymousClass6B8 r06 = (AnonymousClass6B8) map4.get(str5);
                if (r06 == null) {
                    r06 = (AnonymousClass6B8) AnonymousClass3R6.A00(map4.values());
                    r2 = C108315Ta.MISSING_TRIGGERING_INTENSITY;
                }
                AnonymousClass011 A19 = C36441kJ.A19(A01(r06), r2);
                C128676De r22 = (C128676De) A19.first;
                C108315Ta r10 = (C108315Ta) A19.second;
                if (r22 != null) {
                    C124135xe r13 = this.A08;
                    C122115uK r1 = new C122115uK(r22.A04, r22.A02, r22.A01, r22.A03);
                    AnonymousClass6WC r9 = r13.A05;
                    C195979Xa A002 = A00(new C139636kG(r9), r1);
                    if (r9.A08) {
                        r9.A04(A002, C023109s.A00);
                    }
                    AnonymousClass6E3 r8 = r9.A0E[r9.A00 % 2];
                    r8.A01(A002, false);
                    C204359ps r07 = r8.A02;
                    if (r07 != null) {
                        r07.A0C();
                    }
                    r8.A0A.setAlpha(1.0f);
                    r9.A08 = true;
                    if (r10 != null) {
                        str = Long.valueOf(r10.value).toString();
                    }
                    String str6 = str3;
                    String str7 = str2;
                    this.A06.put(r22.A03, new AnonymousClass6E8("", "", "", "", "", "", "", "", str7, str6, str4, str5, str, 6));
                    Iterator it = this.A03.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                return;
            }
            throw C36381kD.A0l();
        }
    }

    public AnonymousClass6WA(AnonymousClass66D r3, C124135xe r4, AnonymousClass11F r5) {
        C36321k7.A0y(r3, r4);
        this.A07 = r3;
        this.A09 = r5;
        this.A08 = r4;
        r4.A01 = this;
        this.A03 = C36441kJ.A17();
        this.A04 = new ConcurrentLinkedQueue();
        this.A02 = "";
        this.A01 = "";
    }
}

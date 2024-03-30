package X;

import android.view.View;

/* renamed from: X.74q  reason: invalid class name and case insensitive filesystem */
public class C1502774q implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public C1502774q(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = str;
        this.A03 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00da, code lost:
        if (r0.equals(r9) != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x069b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x069c, code lost:
        X.C05600Qi.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x069f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r49 = this;
            r0 = r49
            int r1 = r0.A05
            switch(r1) {
                case 0: goto L_0x01bc;
                case 1: goto L_0x0363;
                case 2: goto L_0x002c;
                case 3: goto L_0x00af;
                case 4: goto L_0x03c1;
                case 5: goto L_0x03d7;
                case 6: goto L_0x040c;
                case 7: goto L_0x058e;
                case 8: goto L_0x0007;
                case 9: goto L_0x0007;
                case 10: goto L_0x05a4;
                case 11: goto L_0x05c9;
                case 12: goto L_0x0182;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A01
            X.9oR r3 = (X.C203639oR) r3
            java.lang.Object r1 = r0.A02
            java.lang.Object r5 = r0.A03
            X.7jg r5 = (X.C159637jg) r5
            int r2 = r1.hashCode()
            X.5Fp r0 = r3.A04
            r1 = 105(0x69, float:1.47E-43)
            X.0zf r0 = r0.A01
            r0.A04(r2, r1)
            java.lang.String r4 = "XMPP not connected"
            r3 = 0
            r1 = 1
            X.6Bf r0 = new X.6Bf
            r0.<init>(r4, r3, r1)
            r5.BXW(r0)
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r1 = r0.A00
            X.012 r1 = (X.AnonymousClass012) r1
            java.lang.Object r3 = r0.A01
            X.08g r3 = (X.C019408g) r3
            java.lang.Object r2 = r0.A02
            X.6Er r2 = (X.C129036Er) r2
            java.lang.String r6 = r0.A04
            java.lang.Object r7 = r0.A03
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r5 = 0
            r4 = 1
            r0 = 4
            X.AnonymousClass00C.A0D(r7, r0)
            X.01M r0 = r1.getLifecycle()
            X.01N r0 = (X.AnonymousClass01N) r0
            X.01P r1 = r0.A02
            X.01P r0 = X.AnonymousClass01P.DESTROYED
            if (r1 == r0) goto L_0x002b
            X.0wG r0 = r2.A05
            android.content.res.Resources r2 = X.C36421kH.A0B(r0)
            r1 = 2131886313(0x7f1200e9, float:1.9407201E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = X.C36411kG.A0w(r2, r6, r0, r5, r1)
            X.AnonymousClass00C.A08(r2)
            r0 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r4 = r3.BKt(r2, r1, r0)
            X.3ZU r4 = (X.AnonymousClass3ZU) r4
            X.4t3 r0 = r4.A01
            X.0Eq r6 = r0.A0J
            X.AnonymousClass00C.A08(r6)
            r0 = 2131434156(0x7f0b1aac, float:1.8490118E38)
            android.widget.TextView r3 = X.C36391kE.A0P(r6, r0)
            r0 = 0
            r3.setCompoundDrawablesWithIntrinsicBounds(r7, r0, r0, r0)
            r2 = 16
            float r1 = (float) r2
            android.util.DisplayMetrics r0 = X.C90484aE.A0P()
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.setCompoundDrawablePadding(r0)
            android.util.DisplayMetrics r0 = X.C90484aE.A0P()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = r6.getPaddingTop()
            X.C36341k9.A0z(r6, r1, r0)
            int r0 = r3.getPaddingTop()
            X.C36341k9.A0z(r3, r5, r0)
            r3.setGravity(r2)
            r4.A02()
            return
        L_0x00af:
            java.lang.Object r7 = r0.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r7 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r7
            java.lang.Object r4 = r0.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.String r3 = r0.A04
            java.lang.Object r9 = r0.A02
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r2 = r0.A03
            X.1A1 r1 = r7.A05
            X.3Qa r0 = X.C90504aG.A0T(r4, r3)
            X.3T1 r5 = r1.A03(r0)
            if (r5 == 0) goto L_0x002b
            X.60t r3 = r7.A04
            long r0 = r5.A1N
            java.lang.Integer r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r0.equals(r9)
            r13 = 1
            if (r0 == 0) goto L_0x00dd
        L_0x00dc:
            r13 = 0
        L_0x00dd:
            long r0 = r5.A1N
            X.12P r4 = r3.A00
            X.1M0 r6 = r4.A05()
            android.content.ContentValues r12 = X.C36441kJ.A0E()     // Catch:{ all -> 0x06db }
            java.lang.String r4 = "message_row_id"
            X.C36341k9.A0p(r12, r4, r0)     // Catch:{ all -> 0x06db }
            java.lang.String r4 = "rating"
            r12.put(r4, r9)     // Catch:{ all -> 0x06db }
            X.14e r11 = r6.A02     // Catch:{ all -> 0x06db }
            java.lang.String r10 = "message_rating"
            r8 = 5
            java.lang.String r4 = "INSERT_MESSAGE_RATING_SQL"
            long r10 = r11.A08(r10, r4, r12, r8)     // Catch:{ all -> 0x06db }
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1Q(r4)
            java.lang.String r0 = "MessageRatingStore/insertOrUpdateMessageRating/inserted row should have same messageRowId"
            X.C18740tg.A0F(r1, r0)     // Catch:{ all -> 0x06db }
            r6.close()
            com.whatsapp.jid.UserJid r0 = r5.A0L()
            java.lang.String r10 = X.AnonymousClass143.A03(r0)
            X.5lh r8 = r7.A02
            boolean r6 = r5 instanceof X.C88854Uh
            if (r6 == 0) goto L_0x0180
            r0 = r5
            X.4Uh r0 = (X.C88854Uh) r0
            X.3F4 r0 = r0.BIE()
            java.lang.String r4 = r0.A05
        L_0x0123:
            long r0 = r5.A1N
            java.lang.Integer r0 = r3.A00(r0)
            boolean r11 = X.AnonymousClass000.A1V(r0)
            r1 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            X.8Zx r0 = X.C175168Zx.A00
            if (r2 != r0) goto L_0x0137
            r1 = 1
        L_0x0137:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            X.58F r1 = new X.58F
            r1.<init>()
            r1.A05 = r10
            r1.A02 = r3
            r1.A03 = r0
            if (r9 == 0) goto L_0x0152
            java.lang.Long r0 = X.C90514aH.A0m(r9)
            r1.A04 = r0
        L_0x0152:
            r1.A01 = r2
            r1.A06 = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r1.A00 = r0
            X.0yW r0 = r8.A00
            r0.Blv(r1)
            X.0xM r7 = r7.A03
            if (r6 == 0) goto L_0x002b
            X.1F1 r4 = r7.A0q
            long r1 = r5.A1N
            r8 = 0
            r9 = 1
            r10 = 0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1R(r0)
            java.lang.String r0 = "TemplateMessageStore/removeCsatTrigger/parent message row must be set"
            X.C18740tg.A0E(r3, r0)
            X.12P r0 = r4.A00
            X.1M0 r6 = r0.A05()
            goto L_0x06a0
        L_0x0180:
            r4 = 0
            goto L_0x0123
        L_0x0182:
            java.lang.Object r2 = r0.A00
            X.6Uv r2 = (X.C132686Uv) r2
            java.lang.String r1 = "status_fragment"
            java.lang.Object r5 = r0.A01
            X.5vS r5 = (X.C122805vS) r5
            java.lang.Object r4 = r0.A02
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            java.lang.Object r3 = r0.A03
            X.0NP r3 = (X.AnonymousClass0NP) r3
            r0 = 3
            X.AnonymousClass00C.A0D(r4, r0)
            X.1Q1 r0 = r2.A03
            java.lang.ref.WeakReference r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r2 = r0.get()
            X.15K r2 = (X.AnonymousClass15K) r2
            if (r2 == 0) goto L_0x002b
            X.01P r1 = r2.BAc()
            X.01P r0 = X.AnonymousClass01P.STARTED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x002b
            X.1hp r1 = r5.A02
            android.content.Context r0 = r5.A00
            X.C34901hp.A00(r0, r4, r3, r2, r1)
            return
        L_0x01bc:
            java.lang.Object r12 = r0.A00
            X.6VR r12 = (X.AnonymousClass6VR) r12
            java.lang.String r2 = r0.A04
            java.lang.Object r11 = r0.A01
            X.6ig r11 = (X.C138776ig) r11
            java.lang.Object r4 = r0.A02
            X.00S r4 = (X.AnonymousClass00S) r4
            java.lang.Object r10 = r0.A03
            X.5s0 r10 = (X.C120745s0) r10
            r3 = 1
            X.C36321k7.A0z(r11, r4)
            androidx.work.impl.WorkDatabase r13 = r12.A04
            X.7lt r5 = r13.A0D()
            java.util.ArrayList r1 = r5.BJI(r2)
            int r0 = r1.size()
            if (r0 <= r3) goto L_0x01f1
            java.lang.String r0 = "Can't apply UPDATE policy to the chains of work."
        L_0x01e4:
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass001.A0E(r0)
        L_0x01e8:
            X.4pD r0 = new X.4pD
            r0.<init>(r1)
            r11.A00(r0)
            return
        L_0x01f1:
            java.lang.Object r3 = X.C007103b.A0M(r1)
            X.69M r3 = (X.AnonymousClass69M) r3
            if (r3 == 0) goto L_0x022d
            java.lang.String r9 = r3.A01
            X.6QA r0 = r5.BJH(r9)
            if (r0 != 0) goto L_0x021c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WorkSpec with "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", that matches a name \""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\", wasn't found"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0g(r0, r1)
            goto L_0x01e8
        L_0x021c:
            long r0 = r0.A05
            r17 = 0
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0231
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.C023109s.A0S
            if (r1 != r0) goto L_0x0234
            r5.B5B(r9)
        L_0x022d:
            r4.invoke()
            return
        L_0x0231:
            java.lang.String r0 = "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type."
            goto L_0x01e4
        L_0x0234:
            X.6QA r8 = r10.A00
            java.lang.Integer r0 = r8.A0E
            r48 = r0
            java.lang.String r0 = r8.A0G
            r27 = r0
            java.lang.String r0 = r8.A0F
            r28 = r0
            X.6X2 r0 = r8.A0A
            r47 = r0
            X.6X2 r0 = r8.A0B
            r23 = r0
            long r0 = r8.A04
            r34 = r0
            long r0 = r8.A05
            r36 = r0
            long r15 = r8.A03
            X.6Tb r0 = r8.A09
            r22 = r0
            int r0 = r8.A01
            r21 = r0
            java.lang.Integer r0 = r8.A0C
            r24 = r0
            long r6 = r8.A02
            long r4 = r8.A06
            long r2 = r8.A07
            long r0 = r8.A08
            boolean r14 = r8.A0H
            r20 = r14
            java.lang.Integer r14 = r8.A0D
            r25 = r14
            int r14 = r8.A00
            r19 = r14
            int r14 = r8.A0I
            X.6QA r8 = new X.6QA
            r26 = r9
            r29 = r21
            r30 = r19
            r31 = r14
            r32 = r34
            r34 = r36
            r36 = r15
            r38 = r6
            r40 = r4
            r42 = r2
            r44 = r0
            r46 = r20
            r19 = r8
            r20 = r22
            r21 = r47
            r22 = r23
            r23 = r48
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r40, r42, r44, r46)
            X.6im r7 = r12.A03     // Catch:{ all -> 0x0359 }
            X.AnonymousClass00C.A08(r7)     // Catch:{ all -> 0x0359 }
            X.0tv r4 = r12.A02     // Catch:{ all -> 0x0359 }
            X.AnonymousClass00C.A08(r4)     // Catch:{ all -> 0x0359 }
            java.util.List r5 = r12.A07     // Catch:{ all -> 0x0359 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ all -> 0x0359 }
            java.util.Set r6 = r10.A01     // Catch:{ all -> 0x0359 }
            java.lang.String r2 = r8.A0J     // Catch:{ all -> 0x0359 }
            X.7lt r0 = r13.A0D()     // Catch:{ all -> 0x0359 }
            X.6QA r3 = r0.BJH(r2)     // Catch:{ all -> 0x0359 }
            if (r3 == 0) goto L_0x0319
            java.lang.Integer r0 = r3.A0E     // Catch:{ all -> 0x0359 }
            boolean r0 = X.AnonymousClass6GL.A01(r0)     // Catch:{ all -> 0x0359 }
            if (r0 != 0) goto L_0x0313
            long r0 = r3.A05     // Catch:{ all -> 0x0359 }
            int r9 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            boolean r10 = X.AnonymousClass000.A1P(r9)
            long r0 = r8.A05     // Catch:{ all -> 0x0359 }
            int r9 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r9)
            r10 = r10 ^ r0
            if (r10 != 0) goto L_0x032c
            boolean r19 = r7.A05(r2)     // Catch:{ all -> 0x0359 }
            if (r19 != 0) goto L_0x02ef
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x0359 }
        L_0x02df:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0359 }
            if (r0 == 0) goto L_0x02ef
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0359 }
            X.7k7 r0 = (X.C159907k7) r0     // Catch:{ all -> 0x0359 }
            r0.B2R(r2)     // Catch:{ all -> 0x0359 }
            goto L_0x02df
        L_0x02ef:
            X.73j r12 = new X.73j     // Catch:{ all -> 0x0359 }
            r14 = r8
            r15 = r3
            r16 = r2
            r17 = r5
            r18 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0359 }
            r13.A06()     // Catch:{ all -> 0x0359 }
            r12.run()     // Catch:{ all -> 0x030b }
            r13.A07()     // Catch:{ all -> 0x030b }
            X.AnonymousClass6Q8.A01(r13)     // Catch:{ all -> 0x0359 }
            if (r19 != 0) goto L_0x0313
            goto L_0x0310
        L_0x030b:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r13)     // Catch:{ all -> 0x0359 }
            goto L_0x0358
        L_0x0310:
            X.AnonymousClass6RH.A01(r4, r13, r5)     // Catch:{ all -> 0x0359 }
        L_0x0313:
            X.4pC r0 = X.C161147mG.A01     // Catch:{ all -> 0x0359 }
            r11.A00(r0)     // Catch:{ all -> 0x0359 }
            return
        L_0x0319:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0359 }
            java.lang.String r0 = "Worker with "
            r1.append(r0)     // Catch:{ all -> 0x0359 }
            r1.append(r2)     // Catch:{ all -> 0x0359 }
            java.lang.String r0 = " doesn't exist"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)     // Catch:{ all -> 0x0359 }
            goto L_0x0358
        L_0x032c:
            X.7XM r2 = X.AnonymousClass7XM.A00     // Catch:{ all -> 0x0359 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0359 }
            java.lang.String r0 = "Can't update "
            r1.append(r0)     // Catch:{ all -> 0x0359 }
            java.lang.Object r0 = r2.invoke(r3)     // Catch:{ all -> 0x0359 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0359 }
            r1.append(r0)     // Catch:{ all -> 0x0359 }
            java.lang.String r0 = " Worker to "
            r1.append(r0)     // Catch:{ all -> 0x0359 }
            java.lang.Object r0 = r2.invoke(r8)     // Catch:{ all -> 0x0359 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0359 }
            r1.append(r0)     // Catch:{ all -> 0x0359 }
            java.lang.String r0 = " Worker. Update operation must preserve worker's type."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0359 }
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)     // Catch:{ all -> 0x0359 }
        L_0x0358:
            throw r0     // Catch:{ all -> 0x0359 }
        L_0x0359:
            r1 = move-exception
            X.4pD r0 = new X.4pD
            r0.<init>(r1)
            r11.A00(r0)
            return
        L_0x0363:
            java.lang.Object r6 = r0.A03
            X.6SN r6 = (X.AnonymousClass6SN) r6
            java.lang.Object r5 = r6.A03
            java.lang.Object r3 = r0.A01
            X.6Dm r3 = (X.C128756Dm) r3
            java.lang.Object r2 = r0.A02
            X.66B r2 = (X.AnonymousClass66B) r2
            java.lang.Object r1 = r0.A00
            X.4vP r1 = (X.C100674vP) r1
            monitor-enter(r5)
            java.lang.String r0 = "resolved_async"
            java.util.List r0 = X.AnonymousClass6SN.A00(r6, r1, r2, r3, r0)     // Catch:{ all -> 0x03be }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x03be }
        L_0x0380:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x03be }
            if (r0 == 0) goto L_0x03bc
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x03be }
            X.69T r1 = (X.AnonymousClass69T) r1     // Catch:{ all -> 0x03be }
            X.6WZ r4 = r6.A01     // Catch:{ all -> 0x03be }
            X.69S r0 = r1.A01     // Catch:{ all -> 0x03be }
            r4.A07(r0)     // Catch:{ all -> 0x03be }
            X.6Az r3 = r1.A00     // Catch:{ all -> 0x03be }
            if (r3 == 0) goto L_0x0380
            java.lang.String r2 = "Tree operations are only supported from the UI Thread"
            X.C132926Vv.A02(r2)     // Catch:{ all -> 0x03be }
            X.6XK r1 = r3.A00     // Catch:{ all -> 0x03be }
            boolean r0 = r4.A08     // Catch:{ all -> 0x03be }
            if (r0 != 0) goto L_0x03b4
            X.C132926Vv.A02(r2)     // Catch:{ all -> 0x03be }
            java.util.List r0 = r4.A0I     // Catch:{ all -> 0x03be }
            r0.add(r1)     // Catch:{ all -> 0x03be }
            android.os.Handler r1 = X.AnonymousClass6WZ.A0M     // Catch:{ all -> 0x03be }
            java.lang.Runnable r0 = r4.A0F     // Catch:{ all -> 0x03be }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x03be }
            r1.post(r0)     // Catch:{ all -> 0x03be }
        L_0x03b4:
            X.7fI r1 = r3.A01     // Catch:{ all -> 0x03be }
            X.65X r0 = r3.A02     // Catch:{ all -> 0x03be }
            r4.A08(r1, r0)     // Catch:{ all -> 0x03be }
            goto L_0x0380
        L_0x03bc:
            monitor-exit(r5)
            return
        L_0x03be:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x03c1:
            java.lang.Object r5 = r0.A00
            X.4V7 r5 = (X.AnonymousClass4V7) r5
            java.lang.String r4 = r0.A04
            java.lang.Object r3 = r0.A02
            java.lang.Object r2 = r0.A03
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            java.lang.String r1 = "menu_options"
            java.lang.String r0 = r3.toString()
            r5.Bpu(r2, r1, r4, r0)
            return
        L_0x03d7:
            java.lang.String r4 = r0.A04
            java.lang.Object r3 = r0.A01
            X.14u r3 = (X.C225314u) r3
            java.lang.Object r2 = r0.A02
            X.2K2 r2 = (X.AnonymousClass2K2) r2
            java.lang.Object r1 = r0.A03
            X.11F r1 = (X.AnonymousClass11F) r1
            if (r4 == 0) goto L_0x0400
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0400
            r0 = 2131896549(0x7f1228e5, float:1.9427962E38)
        L_0x03f0:
            java.lang.String r1 = X.C36361kB.A0m(r3, r0)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r1, r0)
            r0.show()
        L_0x03fc:
            r3.Bnv()
            return
        L_0x0400:
            X.12q r0 = r2.A05
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x03fc
            r0 = 2131896656(0x7f122950, float:1.942818E38)
            goto L_0x03f0
        L_0x040c:
            java.lang.Object r4 = r0.A00
            X.27v r4 = (X.AnonymousClass27v) r4
            java.lang.Object r2 = r0.A01
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            java.lang.Object r5 = r0.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r9 = r0.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.String r12 = r0.A04
            r15 = 0
            boolean r6 = X.C36341k9.A1a(r4, r2)
            X.C36321k7.A12(r5, r9, r12)
            java.util.List r0 = r4.A0P
            X.AnonymousClass00C.A07(r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r0.iterator()
        L_0x0433:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x044c
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.141 r0 = (X.AnonymousClass141) r0
            X.11F r0 = r0.A0H
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x0433
            r7.add(r1)
            goto L_0x0433
        L_0x044c:
            java.util.Iterator r1 = r7.iterator()
        L_0x0450:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0461
            X.141 r0 = X.C36391kE.A0f(r1)
            X.AnonymousClass00C.A0B(r0)
            r4.B2c(r0)
            goto L_0x0450
        L_0x0461:
            r7 = -1
            android.content.Intent r3 = X.C36431kI.A0D()
            int r0 = r2.size()
            long r0 = (long) r0
            java.lang.String r2 = "extra_invitees_count"
            android.content.Intent r0 = r3.putExtra(r2, r0)
            r4.setResult(r7, r0)
            java.util.ArrayList r11 = X.C36321k7.A0J(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x047c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x048e
            java.lang.Object r0 = r1.next()
            X.2YQ r0 = (X.AnonymousClass2YQ) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r11.add(r0)
            goto L_0x047c
        L_0x048e:
            X.0ts r8 = r4.A0I
            r7 = 2131755014(0x7f100006, float:1.9140895E38)
            int r0 = r9.size()
            long r2 = (long) r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r0 = r9.size()
            long r0 = (long) r0
            X.AnonymousClass000.A1M(r6, r15, r0)
            java.lang.String r0 = r8.A0L(r6, r7, r2)
            X.AnonymousClass00C.A08(r0)
            X.01z r10 = r4.getSupportFragmentManager()
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0v(r0)
            java.util.List r0 = r4.A0P
            X.AnonymousClass00C.A07(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r8 = r0.iterator()
        L_0x04be:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04f1
            java.lang.Object r6 = r8.next()
            r7 = r6
            X.141 r7 = (X.AnonymousClass141) r7
            java.util.ArrayList r2 = X.C36321k7.A0J(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x04d3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04e5
            java.lang.Object r0 = r1.next()
            X.2YQ r0 = (X.AnonymousClass2YQ) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r2.add(r0)
            goto L_0x04d3
        L_0x04e5:
            X.11F r0 = r7.A0H
            boolean r0 = X.C007103b.A0j(r2, r0)
            if (r0 == 0) goto L_0x04be
            r3.add(r6)
            goto L_0x04be
        L_0x04f1:
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r3.iterator()
        L_0x04f9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x050f
            X.141 r1 = X.C36391kE.A0f(r2)
            X.171 r0 = r4.A0B
            java.lang.String r0 = X.C36381kD.A0v(r0, r1)
            if (r0 == 0) goto L_0x04f9
            r14.add(r0)
            goto L_0x04f9
        L_0x050f:
            int r2 = r14.size()
            r13 = 1
            if (r2 == r13) goto L_0x0566
            r1 = 2
            if (r2 == r1) goto L_0x0554
            r0 = 3
            if (r2 == r0) goto L_0x0572
            X.0ts r8 = r4.A0I
            r7 = 2131755015(0x7f100007, float:1.9140897E38)
            int r2 = r14.size()
            long r5 = (long) r2
            long r3 = (long) r0
            long r5 = r5 - r3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.util.List r1 = r14.subList(r15, r0)
            java.lang.String r0 = ", "
            java.lang.String r0 = X.C36381kD.A0x(r0, r1)
            r2[r15] = r0
            int r0 = r14.size()
            long r0 = (long) r0
            long r0 = r0 - r3
            X.AnonymousClass000.A1M(r2, r13, r0)
            java.lang.String r0 = r8.A0L(r2, r7, r5)
        L_0x0543:
            X.AnonymousClass00C.A08(r0)
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r9)
            X.2oW r0 = X.C51872oW.INVITE
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C54812tb.A00(r0, r1, r12, r11)
            X.C65443Sb.A02(r0, r10)
            return
        L_0x0554:
            r2 = 2131886445(0x7f12016d, float:1.940747E38)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Object r0 = r14.get(r15)
            r3[r15] = r0
            java.lang.Object r0 = r14.get(r13)
            r3[r13] = r0
            goto L_0x0589
        L_0x0566:
            r2 = 2131886446(0x7f12016e, float:1.9407471E38)
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.Object r0 = r14.get(r15)
            r3[r15] = r0
            goto L_0x0589
        L_0x0572:
            r2 = 2131886444(0x7f12016c, float:1.9407467E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Object r0 = r14.get(r15)
            r3[r15] = r0
            java.lang.Object r0 = r14.get(r13)
            r3[r13] = r0
            java.lang.Object r0 = r14.get(r1)
            r3[r1] = r0
        L_0x0589:
            java.lang.String r0 = r4.getString(r2, r3)
            goto L_0x0543
        L_0x058e:
            java.lang.Object r4 = r0.A00
            com.whatsapp.notification.DirectReplyService r4 = (com.whatsapp.notification.DirectReplyService) r4
            java.lang.Object r3 = r0.A01
            X.3hR r3 = (X.C71853hR) r3
            java.lang.String r2 = r0.A04
            java.lang.Object r1 = r0.A02
            X.141 r1 = (X.AnonymousClass141) r1
            java.lang.Object r0 = r0.A03
            android.content.Intent r0 = (android.content.Intent) r0
            r4.A05(r0, r1, r3, r2)
            return
        L_0x05a4:
            java.lang.Object r1 = r0.A00
            X.6Pp r1 = (X.C131576Pp) r1
            java.lang.Object r7 = r0.A01
            X.6qP r7 = (X.C143356qP) r7
            java.lang.Object r6 = r0.A02
            X.67W r6 = (X.AnonymousClass67W) r6
            java.lang.Object r5 = r0.A03
            X.6bn r5 = (X.C134906bn) r5
            java.lang.String r4 = r0.A04
            X.1L4 r0 = r7.A07
            java.lang.String r3 = X.C110475aj.A00(r1, r0)
            java.lang.String r2 = r1.A0A
            X.54t r1 = r7.A04
            X.6tb r0 = new X.6tb
            r0.<init>(r6, r5, r7, r4)
            r1.A0G(r0, r2, r3)
            return
        L_0x05c9:
            java.lang.Object r11 = r0.A00
            X.1i0 r11 = (X.C35011i0) r11
            java.lang.Object r10 = r0.A01
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r15 = r0.A02
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r12 = r0.A03
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.String r14 = r0.A04
            java.lang.String r13 = X.AnonymousClass6Y4.A02()
            X.5Qd r9 = new X.5Qd
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.005 r0 = r11.A0E
            java.lang.Object r6 = r0.get()
            X.6V7 r6 = (X.AnonymousClass6V7) r6
            r8 = 1
            X.005 r0 = r6.A07
            java.lang.Object r0 = r0.get()
            X.3NV r0 = (X.AnonymousClass3NV) r0
            android.content.SharedPreferences r0 = X.AnonymousClass3NV.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_debug_session_id"
            X.C36341k9.A0x(r1, r0, r13)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewStatusEligibilityRequest called for session: "
            r3.append(r0)
            r3.append(r13)
            java.lang.String r0 = " with message "
            r3.append(r0)
            java.util.ArrayList r2 = X.C36351kA.A0z(r15)
            java.util.Iterator r1 = r15.iterator()
        L_0x061b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0625
            X.C90464aC.A1T(r2, r1)
            goto L_0x061b
        L_0x0625:
            java.lang.String r0 = X.AnonymousClass000.A0o(r2, r3)
            r5 = 0
            X.AnonymousClass00C.A0D(r0, r5)
            boolean r0 = X.AnonymousClass6Y4.A09(r15)
            if (r0 == 0) goto L_0x063e
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewStatusEligibilityRequest skip for audio status"
            X.AnonymousClass00C.A0D(r0, r5)
            r1 = -4
            r0 = 0
            r9.A02(r0, r13, r1, r8)
            return
        L_0x063e:
            X.005 r0 = r6.A0A
            java.lang.Object r0 = r0.get()
            X.66L r0 = (X.AnonymousClass66L) r0
            r0.A00(r13)
            X.005 r0 = r6.A09
            java.lang.Object r7 = r0.get()
            X.6Tl r7 = (X.C132396Tl) r7
            java.util.ArrayList r2 = X.C36351kA.A0z(r15)
            java.util.Iterator r1 = r15.iterator()
        L_0x0659:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0663
            X.C90464aC.A1T(r2, r1)
            goto L_0x0659
        L_0x0663:
            X.12P r0 = r7.A00
            X.1M0 r4 = r0.A05()
            X.14e r0 = r4.A02     // Catch:{ all -> 0x0699 }
            android.database.sqlite.SQLiteDatabase r3 = r0.A00     // Catch:{ all -> 0x0699 }
            r3.beginTransaction()     // Catch:{ all -> 0x0699 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0699 }
        L_0x0674:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0699 }
            if (r0 == 0) goto L_0x0682
            long r0 = X.C36391kE.A0D(r2)     // Catch:{ all -> 0x0699 }
            r7.A04(r13, r8, r0)     // Catch:{ all -> 0x0699 }
            goto L_0x0674
        L_0x0682:
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0699 }
            r3.endTransaction()     // Catch:{ all -> 0x0699 }
            r4.close()
            X.71h r1 = new X.71h
            r1.<init>(r9, r13)
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewStatusEligibilityRequest start text status burning and eligibility"
            X.AnonymousClass00C.A0D(r0, r5)
            X.AnonymousClass6V7.A00(r10, r6, r1, r13, r15)
            return
        L_0x0699:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x069b }
        L_0x069b:
            r1 = move-exception
            X.C05600Qi.A00(r4, r0)
            throw r1
        L_0x06a0:
            X.71s r3 = r6.B1k()     // Catch:{ all -> 0x06db }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x06d1 }
            r10.<init>(r9)     // Catch:{ all -> 0x06d1 }
            java.lang.String r0 = "csat_trigger_expiration_ts"
            r10.putNull(r0)     // Catch:{ all -> 0x06d1 }
            java.lang.String r12 = "message_row_id = ?"
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ all -> 0x06d1 }
            X.C36351kA.A1V(r14, r8, r1)     // Catch:{ all -> 0x06d1 }
            X.14e r9 = r6.A02     // Catch:{ all -> 0x06d1 }
            java.lang.String r11 = "message_template"
            java.lang.String r13 = "UPDATE_TEMPLATE_CSAT_TRIGGER_SQL"
            r9.A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x06d1 }
            r3.A00()     // Catch:{ all -> 0x06d1 }
            r3.close()     // Catch:{ all -> 0x06db }
            r6.close()
            r4.A01(r5)
            X.1DQ r1 = r7.A0T
            r0 = -1
            r1.A01(r5, r0)
            return
        L_0x06d1:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x06d6 }
            goto L_0x06da
        L_0x06d6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06db }
        L_0x06da:
            throw r1     // Catch:{ all -> 0x06db }
        L_0x06db:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x06e0 }
            throw r1
        L_0x06e0:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502774q.run():void");
    }

    public C1502774q(View.OnClickListener onClickListener, AnonymousClass0NP r3, C122805vS r4, C132686Uv r5) {
        this.A05 = 12;
        this.A00 = r5;
        this.A04 = "status_fragment";
        this.A01 = r4;
        this.A02 = onClickListener;
        this.A03 = r3;
    }
}

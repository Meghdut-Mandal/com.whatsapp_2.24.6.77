package X;

import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Uh  reason: invalid class name and case insensitive filesystem */
public final class C132566Uh {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final AnonymousClass1KK A03;
    public final AnonymousClass6MH A04;
    public final C29461Ws A05;
    public final C202279lS A06;
    public final AnonymousClass1KP A07;
    public final UserJid A08;
    public final C28201Rs A09 = C36441kJ.A0t();
    public final C28201Rs A0A = C36441kJ.A0t();
    public final C19770wU A0B;
    public final AtomicBoolean A0C = new AtomicBoolean();
    public final AnonymousClass6VE A0D;
    public final C202099l2 A0E;

    public C132566Uh(AnonymousClass1KK r2, AnonymousClass6MH r3, AnonymousClass6VE r4, C29461Ws r5, C202279lS r6, AnonymousClass1KP r7, C202099l2 r8, UserJid userJid, C19770wU r10) {
        AnonymousClass00C.A0D(userJid, 1);
        C36321k7.A1A(r2, r6, r5, r10, 3);
        C36361kB.A1J(r3, 7, r4);
        this.A08 = userJid;
        this.A07 = r7;
        this.A03 = r2;
        this.A06 = r6;
        this.A05 = r5;
        this.A0B = r10;
        this.A04 = r3;
        this.A0D = r4;
        this.A0E = r8;
    }

    public static final C102174zQ A00(C132566Uh r5, C128826Dt r6) {
        BigDecimal bigDecimal;
        C132386Tk r2;
        try {
            List list = (List) r5.A0D.A04(r5.A08).get();
            AnonymousClass00C.A0B(list);
            BigDecimal A022 = C202099l2.A02(list);
            BigDecimal A012 = C202099l2.A01(new Date(), list);
            if (A012 == null) {
                A012 = BigDecimal.ZERO;
            }
            if (A022 != null) {
                bigDecimal = A022.subtract(A012);
            } else {
                bigDecimal = null;
            }
            AnonymousClass6B4 r0 = (AnonymousClass6B4) C007103b.A0M(list);
            if (!(r0 == null || (r2 = r0.A02.A04) == null)) {
                BigDecimal A002 = C129676Ia.A00(r2, r6.A01);
                if (bigDecimal == null || bigDecimal.compareTo(A002) < 0) {
                    return new C102174zQ(r2, A002);
                }
                return null;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        if (java.lang.Long.valueOf(r20) != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C132566Uh r21, boolean r22) {
        /*
            r3 = r21
            X.6MH r9 = r3.A04
            com.whatsapp.jid.UserJid r8 = r3.A08
            r11 = 0
            X.1Wd r0 = r9.A00     // Catch:{ Exception -> 0x00dd }
            X.54c r0 = r0.A00()     // Catch:{ Exception -> 0x00dd }
            X.1M0 r7 = r0.get()     // Catch:{ Exception -> 0x00dd }
            X.14e r4 = r7.A02     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "SELECT promotion_id, promotion_name, promotion_discount, promotion_discount_type, promotion_minimum_cart_price, promotion_start_date, promotion_end_date, promotion_description, promotion_more_info FROM cart_applied_promotion WHERE business_id=? LIMIT 1"
            java.lang.String[] r1 = X.C90504aG.A1b(r8)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "cart_applied_promotion.SELECT_APPLIED_PROMOTIONS"
            android.database.Cursor r2 = r4.A09(r2, r0, r1)     // Catch:{ all -> 0x00d5 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "promotion_id"
            java.lang.String r12 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x00ce }
            X.AnonymousClass00C.A08(r12)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "promotion_name"
            java.lang.String r13 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x00ce }
            X.AnonymousClass00C.A08(r13)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "promotion_discount"
            java.lang.String r14 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x00ce }
            X.AnonymousClass00C.A08(r14)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "promotion_discount_type"
            int r4 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x00ce }
            r6 = 2
            r0 = 1
            if (r4 == r0) goto L_0x005f
            if (r4 == r6) goto L_0x0060
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "Unknown discount type "
            r1.append(r0)     // Catch:{ all -> 0x00ce }
            r1.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = " is retrieved from db"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)     // Catch:{ all -> 0x00ce }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x005f:
            r6 = 1
        L_0x0060:
            java.lang.String r0 = "promotion_minimum_cart_price"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ce }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x0083
            long r20 = r2.getLong(r1)     // Catch:{ all -> 0x00ce }
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0083
        L_0x0076:
            java.lang.String r0 = "promotion_start_date"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ce }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0088
            goto L_0x0086
        L_0x0083:
            r20 = 0
            goto L_0x0076
        L_0x0086:
            r4 = 0
            goto L_0x0091
        L_0x0088:
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x00ce }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x00ce }
            r4.<init>(r0)     // Catch:{ all -> 0x00ce }
        L_0x0091:
            java.lang.String r0 = "promotion_end_date"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ce }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x009f
            r5 = 0
            goto L_0x00a8
        L_0x009f:
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x00ce }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x00ce }
            r5.<init>(r0)     // Catch:{ all -> 0x00ce }
        L_0x00a8:
            java.lang.String r0 = "promotion_description"
            java.lang.String r15 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x00ce }
            X.AnonymousClass00C.A08(r15)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "promotion_more_info"
            java.lang.String r16 = X.C36341k9.A0f(r2, r0)     // Catch:{ all -> 0x00ce }
            X.AnonymousClass00C.A08(r16)     // Catch:{ all -> 0x00ce }
            X.6Dt r10 = new X.6Dt     // Catch:{ all -> 0x00ce }
            r19 = r6
            r18 = r5
            r17 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00ce }
            goto L_0x00c7
        L_0x00c6:
            r10 = r11
        L_0x00c7:
            r2.close()     // Catch:{ all -> 0x00d5 }
            r7.close()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00dc
        L_0x00ce:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ Exception -> 0x00dd }
            throw r0     // Catch:{ Exception -> 0x00dd }
        L_0x00dc:
            r11 = r10
        L_0x00dd:
            if (r11 == 0) goto L_0x0151
            if (r22 == 0) goto L_0x0126
            X.1Ws r0 = r3.A05
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r8)
            X.9ct r0 = (X.C198089ct) r0
            if (r0 == 0) goto L_0x00fb
            java.util.List r1 = r0.A02
            if (r1 == 0) goto L_0x00fb
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x010c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x010c
        L_0x00fb:
            X.4zR r1 = X.C102184zR.A00
        L_0x00fd:
            r9.A01(r8)
            X.1Rs r0 = r3.A0A
            r0.A0C(r1)
            X.00s r1 = r3.A00
            r0 = 0
            r1.A0C(r0)
            return
        L_0x010c:
            java.util.Iterator r2 = r1.iterator()
        L_0x0110:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r2.next()
            X.6Dt r0 = (X.C128826Dt) r0
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r11.A06
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0110
        L_0x0126:
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r0 = r11.A08
            if (r0 == 0) goto L_0x0136
            boolean r0 = r0.before(r1)
            if (r0 != 0) goto L_0x0136
            goto L_0x00fb
        L_0x0136:
            java.util.Date r0 = r11.A07
            if (r0 == 0) goto L_0x0141
            boolean r0 = r0.after(r1)
            if (r0 != 0) goto L_0x0141
            goto L_0x00fb
        L_0x0141:
            X.4zQ r1 = A00(r3, r11)
            if (r1 != 0) goto L_0x00fd
            X.1Rs r1 = r3.A0A
            X.4zT r0 = X.C102204zT.A00
            r1.A0C(r0)
            X.00s r0 = r3.A00
            goto L_0x0154
        L_0x0151:
            X.00s r0 = r3.A00
            r11 = 0
        L_0x0154:
            r0.A0C(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132566Uh.A01(X.6Uh, boolean):void");
    }
}

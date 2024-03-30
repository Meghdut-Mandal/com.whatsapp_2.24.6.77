package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Fo  reason: invalid class name and case insensitive filesystem */
public class C25251Fo {
    public final C19630wG A00;
    public final C24881Ed A01;
    public final C219612i A02;
    public final AnonymousClass1EU A03;
    public final C24611Dc A04 = C24611Dc.A00("MessagelessPaymentNotification", "notification", "COMMON");
    public final AnonymousClass1FR A05;
    public final C19770wU A06;
    public final C25271Fq A07;
    public final C18820ts A08;
    public final AnonymousClass12P A09;
    public final AnonymousClass1EV A0A;
    public final AnonymousClass1CR A0B;

    private synchronized void A00(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A04.A05("removeUnreadMessagelessPaymentTransaction empty transaction id");
        } else {
            C219612i r6 = this.A02;
            String A012 = r6.A01("unread_messageless_transaction_ids");
            if (A012 == null) {
                A012 = "";
            }
            HashSet hashSet = new HashSet(Arrays.asList(TextUtils.split(A012, ";")));
            if (hashSet.remove(str)) {
                C24611Dc r2 = this.A04;
                StringBuilder sb = new StringBuilder();
                sb.append("removeUnreadMessagelessPaymentTransaction/removed id:");
                sb.append(str);
                r2.A06(sb.toString());
            }
            r6.A04("unread_messageless_transaction_ids", TextUtils.join(";", hashSet));
        }
    }

    public synchronized void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A00((String) it.next());
        }
        if (TextUtils.isEmpty(this.A02.A01("unread_messageless_transaction_ids"))) {
            this.A07.A03(17, "MessagelessPaymentNotification4");
        }
    }

    public void A01() {
        C219612i r2 = this.A02;
        if (!TextUtils.isEmpty(r2.A01("unread_messageless_transaction_ids"))) {
            r2.A04("unread_messageless_transaction_ids", "");
            this.A07.A03(17, "MessagelessPaymentNotification3");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r19 = this;
            r10 = r19
            X.1EV r0 = r10.A0A
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x001a
            X.12P r0 = r10.A09
            r0.A06()
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x001b
            X.1Dc r1 = r10.A04
            java.lang.String r0 = "message store not yet ready"
            r1.A06(r0)
        L_0x001a:
            return
        L_0x001b:
            monitor-enter(r10)
            X.12i r1 = r10.A02     // Catch:{ all -> 0x0233 }
            java.lang.String r0 = "unread_messageless_transaction_ids"
            java.lang.String r2 = r1.A01(r0)     // Catch:{ all -> 0x0233 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0233 }
            if (r0 != 0) goto L_0x003b
            X.1Ed r1 = r10.A01     // Catch:{ all -> 0x0233 }
            java.lang.String r0 = ";"
            java.lang.String[] r0 = r2.split(r0)     // Catch:{ all -> 0x0233 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0233 }
            java.util.ArrayList r17 = r1.A0R(r0)     // Catch:{ all -> 0x0233 }
            goto L_0x0040
        L_0x003b:
            java.util.ArrayList r17 = new java.util.ArrayList     // Catch:{ all -> 0x0233 }
            r17.<init>()     // Catch:{ all -> 0x0233 }
        L_0x0040:
            monitor-exit(r10)
            X.0wG r0 = r10.A00
            android.content.Context r9 = r0.A00
            boolean r0 = r17.isEmpty()
            r8 = 17
            if (r0 == 0) goto L_0x005d
            X.1Fq r1 = r10.A07
            java.lang.String r0 = "MessagelessPaymentNotification1"
            r1.A03(r8, r0)
            X.1Dc r2 = r10.A04
            java.lang.String r1 = "no unread payment notifications"
            r0 = 0
            X.C24611Dc.A02(r2, r0, r1)
            return
        L_0x005d:
            X.0Yy r7 = X.C20600xp.A02(r9)
            java.lang.String r12 = "status"
            r7.A0L = r12
            r6 = 1
            r7.A09 = r6
            r7.A0I(r6)
            r0 = 4
            r7.A06(r0)
            r5 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r4 = r7.A0B
            r4.icon = r5
            int r0 = r17.size()
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = 335544320(0x14000000, float:6.4623485E-27)
            r2 = 0
            if (r0 != r6) goto L_0x01a5
            r0 = r17
            java.lang.Object r13 = r0.get(r2)
            X.9lY r13 = (X.C202319lY) r13
            X.8av r0 = r13.A0A
            if (r0 == 0) goto L_0x0182
            X.9ue r14 = r0.A00
            if (r14 == 0) goto L_0x0182
            int r1 = r13.A03
            r0 = 9
            if (r1 != r0) goto L_0x0182
            X.1Ed r1 = r10.A01
            java.lang.String r0 = r14.A03
            X.9lY r15 = r1.A0K(r0)
            X.1EU r0 = r10.A03
            r18 = r0
            X.B66 r0 = r18.A05()
            X.9Yc r1 = r0.BFZ()
            if (r1 == 0) goto L_0x0182
            if (r15 == 0) goto L_0x0182
            X.1FR r0 = r10.A05
            java.lang.String r16 = r0.A0O(r13)
            X.171 r14 = r1.A04
            X.16D r0 = r1.A03
            com.whatsapp.jid.UserJid r15 = r15.A0D
            X.141 r0 = r0.A0D(r15)
            java.lang.String r15 = r14.A0H(r0)
            android.content.res.Resources r14 = r9.getResources()
            int r1 = r1.A00()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r2] = r15
            java.lang.String r1 = r14.getString(r1, r0)
            X.356 r14 = new X.356
            r0 = r16
            r14.<init>(r0, r1)
        L_0x00da:
            java.lang.CharSequence r1 = r14.A00
            if (r1 == 0) goto L_0x0226
            java.lang.String r0 = r14.A01
            r7.A0F(r0)
            r7.A0G(r1)
            r7.A0E(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A0C(r1)
            r7.A0C(r0)
            X.B66 r0 = r18.A05()
            java.lang.Class r0 = r0.BFn()
            android.content.Intent r14 = new android.content.Intent
            r14.<init>(r9, r0)
            java.lang.String r1 = r13.A0K
            java.lang.String r0 = "extra_transaction_id"
            android.content.Intent r15 = r14.putExtra(r0, r1)
            X.11F r14 = r13.A0C
            boolean r1 = r13.A0Q
            java.lang.String r13 = r13.A0L
            X.3Qa r0 = new X.3Qa
            r0.<init>(r14, r13, r1)
            X.AnonymousClass3UJ.A00(r15, r0)
            r15.addFlags(r3)
            android.app.PendingIntent r0 = X.C65743Th.A00(r9, r2, r15, r11)
        L_0x011e:
            r7.A0D = r0
            X.0Yy r11 = X.C20600xp.A02(r9)
            r11.A0L = r12
            r11.A09 = r6
            r0 = 2131892146(0x7f1217b2, float:1.9419032E38)
            java.lang.String r0 = r9.getString(r0)
            r11.A0F(r0)
            X.0ts r13 = r10.A08
            r12 = 2131755239(0x7f1000e7, float:1.9141352E38)
            int r0 = r17.size()
            long r0 = (long) r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r3 = r17.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r2] = r3
            java.lang.String r0 = r13.A0L(r6, r12, r0)
            r11.A0E(r0)
            android.app.Notification r0 = r11.A05()
            r11.A0C = r0
            android.app.Notification r0 = r11.A0B
            r0.icon = r5
            java.lang.Class<X.1kf> r0 = X.C36631kf.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r9, r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C65743Th.A01(r9, r8, r1, r0)
            r4.deleteIntent = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x017c
            X.1CR r0 = r10.A0B
            X.3LI r0 = r0.A0R()
            X.2dt r0 = (X.C47192dt) r0
            java.lang.String r0 = r0.A0E()
            r7.A0M = r0
        L_0x017c:
            android.app.Notification r3 = r7.A05()
            goto L_0x0205
        L_0x0182:
            X.1EU r0 = r10.A03
            r18 = r0
            X.B66 r0 = r18.A05()
            X.9Tc r14 = r0.BAj()
            if (r14 == 0) goto L_0x0226
            java.lang.String r1 = r14.A02(r13)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0226
            java.lang.String r0 = r14.A01(r13)
            X.356 r14 = new X.356
            r14.<init>(r0, r1)
            goto L_0x00da
        L_0x01a5:
            r0 = 2131892146(0x7f1217b2, float:1.9419032E38)
            java.lang.String r0 = r9.getString(r0)
            r7.A0F(r0)
            X.0ts r15 = r10.A08
            r14 = 2131755239(0x7f1000e7, float:1.9141352E38)
            int r0 = r17.size()
            long r0 = (long) r0
            java.lang.Object[] r13 = new java.lang.Object[r6]
            int r16 = r17.size()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r13[r2] = r16
            java.lang.String r0 = r15.A0L(r13, r14, r0)
            r7.A0E(r0)
            java.util.Iterator r1 = r17.iterator()
        L_0x01d0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r0 = r1.next()
            X.9lY r0 = (X.C202319lY) r0
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x01d0
            X.1EU r0 = r10.A03
            X.B66 r0 = r0.A05()
            java.lang.Class r1 = r0.BFl()
        L_0x01ec:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r9, r1)
            r0.addFlags(r3)
            android.app.PendingIntent r0 = X.C65743Th.A00(r9, r2, r0, r11)
            goto L_0x011e
        L_0x01fa:
            X.1EU r0 = r10.A03
            X.B66 r0 = r0.A05()
            java.lang.Class r1 = r0.BFV()
            goto L_0x01ec
        L_0x0205:
            X.1Dc r1 = r10.A04     // Catch:{ SecurityException -> 0x0212 }
            java.lang.String r0 = "NotificationManager/notify"
            r1.A06(r0)     // Catch:{ SecurityException -> 0x0212 }
            X.1Fq r0 = r10.A07     // Catch:{ SecurityException -> 0x0212 }
            r0.A02(r8, r3)     // Catch:{ SecurityException -> 0x0212 }
            goto L_0x0225
        L_0x0212:
            r3 = move-exception
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            X.C18740tg.A0D(r2, r0)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x001a
            throw r3
        L_0x0225:
            return
        L_0x0226:
            X.1Dc r1 = r10.A04
            java.lang.String r0 = "no available payment notification text"
            r1.A06(r0)
            java.lang.String r0 = r13.A0K
            r10.A00(r0)
            return
        L_0x0233:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25251Fo.A02():void");
    }

    public C25251Fo(C19630wG r4, C25271Fq r5, C18820ts r6, AnonymousClass12P r7, C24881Ed r8, C219612i r9, AnonymousClass1EV r10, AnonymousClass1EU r11, AnonymousClass1FR r12, AnonymousClass1CR r13, C19770wU r14) {
        this.A00 = r4;
        this.A06 = r14;
        this.A05 = r12;
        this.A08 = r6;
        this.A03 = r11;
        this.A0B = r13;
        this.A02 = r9;
        this.A09 = r7;
        this.A0A = r10;
        this.A07 = r5;
        this.A01 = r8;
    }
}

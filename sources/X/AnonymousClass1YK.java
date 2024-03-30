package X;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1YK  reason: invalid class name */
public class AnonymousClass1YK {
    public final C219612i A00;
    public final AnonymousClass16S A01;
    public final C24611Dc A02 = C24611Dc.A00("PaymentMethodUpdateNotification", "notification", "COMMON");
    public final C19770wU A03;
    public final C19630wG A04;
    public final C25271Fq A05;
    public final C18820ts A06;
    public final AnonymousClass12P A07;
    public final AnonymousClass1EV A08;
    public final AnonymousClass1EU A09;
    public final AnonymousClass1CR A0A;

    private synchronized void A01(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A02.A05("removeUnreadPaymentMethodUpdate empty credentialId");
        } else {
            C219612i r8 = this.A00;
            String A012 = r8.A01("unread_payment_method_credential_ids");
            if (A012 == null) {
                A012 = "";
            }
            String[] split = TextUtils.split(A012, ";");
            HashSet hashSet = new HashSet();
            for (String str2 : split) {
                if (!TextUtils.equals(TextUtils.split(str2, ":")[0], str)) {
                    hashSet.add(str2);
                } else {
                    C24611Dc r2 = this.A02;
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeUnreadPaymentMethodUpdate/removed credentialId:");
                    sb.append(str);
                    r2.A06(sb.toString());
                }
            }
            r8.A04("unread_payment_method_credential_ids", TextUtils.join(";", hashSet));
        }
    }

    public synchronized void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A01((String) it.next());
        }
        if (TextUtils.isEmpty(this.A00.A01("unread_payment_method_credential_ids"))) {
            this.A05.A03(22, "PaymentMethodUpdateNotification4");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x025e, code lost:
        r15 = r8.A00;
        r14 = com.whatsapp.R.string.f12nameremoved;
        r0 = new java.lang.Object[]{r1};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0268, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x026b, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0272, code lost:
        r2.A0G(r1);
        r2.A0E(r1);
        r0 = new androidx.core.app.NotificationCompat$BigTextStyle();
        r0.A0C(r1);
        r2.A0C(r0);
        r2.A0D = r8.A00(r6, r7, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x028d, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) null) != false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x028f, code lost:
        r2.A08(com.whatsapp.R.drawable.ic_fab_check, (java.lang.CharSequence) null, r8.A00(r6, r7, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a8, code lost:
        r1 = r8.A00.getResources().getQuantityString(com.whatsapp.R.plurals.f10nameremoved, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b9, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bb, code lost:
        r3.A02.A06("no available payment notification text");
        r3.A01(r7.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ff, code lost:
        r1[0] = r12;
        r1 = r15.getString(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x020f, code lost:
        if (r13.equals(r0) == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0213, code lost:
        if ((r7 instanceof X.C175768b1) == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0215, code lost:
        r0 = (X.C175888bE) r7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0219, code lost:
        if (r0 == null) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021b, code lost:
        r1 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0221, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0223, code lost:
        r1 = r8.A02.A0A.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022b, code lost:
        r0 = r7.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022d, code lost:
        if (r0 == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x022f, code lost:
        r12 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0237, code lost:
        if ("MERCHANT_VERIFIED".equals(r13) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0239, code lost:
        r15 = r8.A00;
        r14 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x023e, code lost:
        r0 = new java.lang.Object[]{r12};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0242, code lost:
        r1 = r15.getString(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x024e, code lost:
        if ("MERCHANT_VERIFICATION_FAILURE".equals(r13) == false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0250, code lost:
        r15 = r8.A00;
        r14 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025c, code lost:
        if ("MERCHANT_DISABLED".equals(r13) == false) goto L_0x026b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0209  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass1YK r17) {
        /*
            r3 = r17
            X.1EV r1 = r3.A08
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x001b
            X.12P r0 = r3.A07
            r0.A06()
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x001c
            X.1Dc r1 = r3.A02
            java.lang.String r0 = "message store not yet ready"
        L_0x0018:
            r1.A06(r0)
        L_0x001b:
            return
        L_0x001c:
            monitor-enter(r3)
            X.12i r12 = r3.A00     // Catch:{ all -> 0x036d }
            java.lang.String r1 = "unread_payment_method_credential_ids"
            java.lang.String r6 = r12.A01(r1)     // Catch:{ all -> 0x036d }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0032
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x036d }
            r9.<init>()     // Catch:{ all -> 0x036d }
            goto L_0x0126
        L_0x0032:
            java.lang.String r0 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r6, r0)     // Catch:{ all -> 0x036d }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x036d }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x036d }
            r2.<init>()     // Catch:{ all -> 0x036d }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x036d }
        L_0x0045:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x005e
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x036d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x036d }
            java.lang.String r0 = ":"
            java.lang.String[] r4 = android.text.TextUtils.split(r4, r0)     // Catch:{ all -> 0x036d }
            r0 = 0
            r0 = r4[r0]     // Catch:{ all -> 0x036d }
            r2.add(r0)     // Catch:{ all -> 0x036d }
            goto L_0x0045
        L_0x005e:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x0121
            X.16S r6 = r3.A01     // Catch:{ all -> 0x036d }
            boolean r0 = r6.A09     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0121
            X.54d r0 = r6.A00     // Catch:{ all -> 0x036d }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x036d }
            X.14e r7 = r5.A02     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = X.AnonymousClass9B4.A03     // Catch:{ all -> 0x0362 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0362 }
            r8.<init>()     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = "SELECT "
            r8.append(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String[] r0 = X.AnonymousClass99c.A00     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = X.AnonymousClass96W.A00(r0)     // Catch:{ all -> 0x0362 }
            r8.append(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = " FROM "
            r8.append(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = "methods"
            r8.append(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = " WHERE "
            r8.append(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = "credential_id IN (\""
            r8.append(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r9 = "\", \""
            java.lang.String r0 = "delimiter"
            java.util.Objects.requireNonNull(r9, r0)     // Catch:{ all -> 0x0362 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0362 }
            r4.<init>()     // Catch:{ all -> 0x0362 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0362 }
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0362 }
            if (r0 == 0) goto L_0x00c4
        L_0x00b1:
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0362 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0362 }
            r4.append(r0)     // Catch:{ all -> 0x0362 }
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0362 }
            if (r0 == 0) goto L_0x00c4
            r4.append(r9)     // Catch:{ all -> 0x0362 }
            goto L_0x00b1
        L_0x00c4:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0362 }
            r8.append(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = "\")"
            r8.append(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = " LIMIT 100"
            r8.append(r0)     // Catch:{ all -> 0x0362 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0362 }
            r2 = 0
            java.lang.String r0 = "readPaymentMethodByCredentialIds/QUERY_SCHEMA_PAY_METHODS"
            android.database.Cursor r4 = r7.A09(r4, r0, r2)     // Catch:{ all -> 0x0362 }
            int r0 = r4.getCount()     // Catch:{ all -> 0x0356 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0356 }
            r9.<init>(r0)     // Catch:{ all -> 0x0356 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0356 }
            if (r0 == 0) goto L_0x0115
            X.9un r0 = X.AnonymousClass16S.A00(r4, r6)     // Catch:{ all -> 0x0356 }
            r9.add(r0)     // Catch:{ all -> 0x0356 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0356 }
            r2.<init>()     // Catch:{ all -> 0x0356 }
            java.lang.String r0 = "PAY: PaymentTransactionStore readPaymentMethodByCredentialIds returned: "
            r2.append(r0)     // Catch:{ all -> 0x0356 }
            int r0 = r9.size()     // Catch:{ all -> 0x0356 }
            r2.append(r0)     // Catch:{ all -> 0x0356 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0356 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0356 }
            r4.close()     // Catch:{ all -> 0x0362 }
            r5.close()     // Catch:{ all -> 0x036d }
            goto L_0x0126
        L_0x0115:
            r4.close()     // Catch:{ all -> 0x0362 }
            r5.close()     // Catch:{ all -> 0x036d }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x036d }
            r9.<init>()     // Catch:{ all -> 0x036d }
            goto L_0x0126
        L_0x0121:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x036d }
            r9.<init>()     // Catch:{ all -> 0x036d }
        L_0x0126:
            monitor-exit(r3)
            X.0wG r0 = r3.A04
            android.content.Context r6 = r0.A00
            X.1EU r0 = r3.A09
            X.B66 r0 = r0.A05()
            X.9S9 r8 = r0.BFe()
            boolean r0 = r9.isEmpty()
            r5 = 22
            if (r0 != 0) goto L_0x0349
            if (r8 == 0) goto L_0x0349
            X.0Yy r2 = X.C20600xp.A02(r6)
            java.lang.String r16 = "status"
            r0 = r16
            r2.A0L = r0
            r10 = 1
            r2.A09 = r10
            r2.A0I(r10)
            r0 = 4
            r2.A06(r0)
            android.app.Notification r0 = r2.A0B
            r17 = r0
            r4 = 2131231578(0x7f08035a, float:1.807924E38)
            r0.icon = r4
            int r0 = r9.size()
            r4 = 0
            r11 = 0
            if (r0 != r10) goto L_0x029a
            java.lang.Object r7 = r9.get(r4)
            X.9un r7 = (X.C207249un) r7
            java.lang.String r13 = r7.A0A
            java.lang.String r1 = r12.A01(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r12 = 0
            if (r0 != 0) goto L_0x026f
            java.lang.String r0 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r1, r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0185:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x026f
            java.lang.Object r1 = r14.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ":"
            java.lang.String[] r1 = android.text.TextUtils.split(r1, r0)
            r0 = r1[r4]
            boolean r0 = android.text.TextUtils.equals(r0, r13)
            if (r0 == 0) goto L_0x0185
            r13 = r1[r10]
        L_0x01a1:
            int r0 = r13.hashCode()
            switch(r0) {
                case -1573204880: goto L_0x01c8;
                case -945151213: goto L_0x01e2;
                case -863506419: goto L_0x01e5;
                case -188177059: goto L_0x0206;
                case 1084491615: goto L_0x0209;
                default: goto L_0x01a8;
            }
        L_0x01a8:
            android.content.Context r0 = r8.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755243(0x7f1000eb, float:1.914136E38)
            java.lang.String r1 = r1.getQuantityString(r0, r10)
        L_0x01b5:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0272
            X.1Dc r1 = r3.A02
            java.lang.String r0 = "no available payment notification text"
            r1.A06(r0)
            java.lang.String r0 = r7.A0A
            r3.A01(r0)
            return
        L_0x01c8:
            java.lang.String r0 = "MERCHANT_LINKED"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r7 instanceof X.C175768b1
            if (r0 == 0) goto L_0x01a8
            X.6c7 r0 = r7.A09
            android.content.Context r15 = r8.A00
            r14 = 2131887127(0x7f120417, float:1.9408852E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r12 = r0.A00
            goto L_0x01ff
        L_0x01e2:
            java.lang.String r0 = "MERCHANT_DISABLED"
            goto L_0x020b
        L_0x01e5:
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r7 instanceof X.C175798b4
            if (r0 == 0) goto L_0x01a8
            r0 = r7
            X.8b4 r0 = (X.C175798b4) r0
            android.content.Context r15 = r8.A00
            r14 = 2131887130(0x7f12041a, float:1.9408858E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r12 = X.C203449o2.A02(r15, r0)
        L_0x01ff:
            r1[r4] = r12
            java.lang.String r1 = r15.getString(r14, r1)
            goto L_0x01b5
        L_0x0206:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            goto L_0x020b
        L_0x0209:
            java.lang.String r0 = "MERCHANT_VERIFIED"
        L_0x020b:
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r7 instanceof X.C175768b1
            if (r0 == 0) goto L_0x01a8
            X.8bF r0 = r7.A08
            X.8bE r0 = (X.C175888bE) r0
            if (r0 == 0) goto L_0x0268
            java.lang.String r1 = r0.A03
        L_0x021d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x022b
            X.0wQ r0 = r8.A02
            X.0wh r0 = r0.A0A
            java.lang.String r1 = r0.A02()
        L_0x022b:
            X.6c7 r0 = r7.A09
            if (r0 == 0) goto L_0x0231
            java.lang.Object r12 = r0.A00
        L_0x0231:
            java.lang.String r0 = "MERCHANT_VERIFIED"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0248
            android.content.Context r15 = r8.A00
            r14 = 2131887129(0x7f120419, float:1.9408856E38)
        L_0x023e:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r4] = r12
        L_0x0242:
            java.lang.String r1 = r15.getString(r14, r0)
            goto L_0x01b5
        L_0x0248:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0256
            android.content.Context r15 = r8.A00
            r14 = 2131887128(0x7f120418, float:1.9408854E38)
            goto L_0x023e
        L_0x0256:
            java.lang.String r0 = "MERCHANT_DISABLED"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x026b
            android.content.Context r15 = r8.A00
            r14 = 2131887126(0x7f120416, float:1.940885E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r4] = r1
            goto L_0x0242
        L_0x0268:
            java.lang.String r1 = ""
            goto L_0x021d
        L_0x026b:
            java.lang.String r1 = ""
            goto L_0x01b5
        L_0x026f:
            r13 = r11
            goto L_0x01a1
        L_0x0272:
            r2.A0G(r1)
            r2.A0E(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A0C(r1)
            r2.A0C(r0)
            android.app.PendingIntent r0 = r8.A00(r6, r7, r13)
            r2.A0D = r0
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x02b9
            r1 = 2131232277(0x7f080615, float:1.8080659E38)
            android.app.PendingIntent r0 = r8.A00(r6, r7, r13)
            r2.A08(r1, r11, r0)
            goto L_0x02b9
        L_0x029a:
            int r7 = r9.size()
            X.0ts r14 = r3.A06
            r13 = 2131755243(0x7f1000eb, float:1.914136E38)
            long r0 = (long) r7
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12[r4] = r7
            java.lang.String r0 = r14.A0L(r12, r13, r0)
            r2.A0E(r0)
            android.app.PendingIntent r0 = r8.A00(r6, r11, r11)
            r2.A0D = r0
        L_0x02b9:
            X.0Yy r7 = X.C20600xp.A02(r6)
            r0 = r16
            r7.A0L = r0
            r7.A09 = r10
            X.0ts r13 = r3.A06
            r12 = 2131755243(0x7f1000eb, float:1.914136E38)
            int r0 = r9.size()
            long r0 = (long) r0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r4] = r9
            java.lang.String r0 = r13.A0L(r10, r12, r0)
            r7.A0E(r0)
            r9 = 2131232277(0x7f080615, float:1.8080659E38)
            android.content.Context r1 = r8.A00
            r0 = 2131895662(0x7f12256e, float:1.9426163E38)
            java.lang.String r1 = r1.getString(r0)
            android.app.PendingIntent r0 = r8.A00(r6, r11, r11)
            r7.A08(r9, r1, r0)
            android.app.Notification r0 = r7.A05()
            r7.A0C = r0
            android.app.Notification r1 = r7.A0B
            r0 = 2131231578(0x7f08035a, float:1.807924E38)
            r1.icon = r0
            java.lang.Class<X.1kg> r0 = X.C36641kg.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6, r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C65743Th.A01(r6, r5, r1, r0)
            r0 = r17
            r0.deleteIntent = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0325
            X.1CR r0 = r3.A0A
            X.3LI r0 = r0.A0R()
            X.2dt r0 = (X.C47192dt) r0
            java.lang.String r0 = r0.A0E()
            r2.A0M = r0
        L_0x0325:
            android.app.Notification r2 = r2.A05()
            X.1Dc r1 = r3.A02     // Catch:{ SecurityException -> 0x0336 }
            java.lang.String r0 = "NotificationManager/notify"
            r1.A06(r0)     // Catch:{ SecurityException -> 0x0336 }
            X.1Fq r0 = r3.A05     // Catch:{ SecurityException -> 0x0336 }
            r0.A02(r5, r2)     // Catch:{ SecurityException -> 0x0336 }
            goto L_0x036c
        L_0x0336:
            r2 = move-exception
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            X.C18740tg.A0D(r4, r0)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x001b
            throw r2
        L_0x0349:
            X.1Fq r1 = r3.A05
            java.lang.String r0 = "PaymentMethodUpdateNotification1"
            r1.A03(r5, r0)
            X.1Dc r1 = r3.A02
            java.lang.String r0 = "no unread payment notifications"
            goto L_0x0018
        L_0x0356:
            r1 = move-exception
            if (r4 == 0) goto L_0x0361
            r4.close()     // Catch:{ all -> 0x035d }
            goto L_0x0361
        L_0x035d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0362 }
        L_0x0361:
            throw r1     // Catch:{ all -> 0x0362 }
        L_0x0362:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0367 }
            goto L_0x036b
        L_0x0367:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x036d }
        L_0x036b:
            throw r1     // Catch:{ all -> 0x036d }
        L_0x036c:
            return
        L_0x036d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YK.A00(X.1YK):void");
    }

    public void A02() {
        C219612i r2 = this.A00;
        if (!TextUtils.isEmpty(r2.A01("unread_payment_method_credential_ids"))) {
            r2.A04("unread_payment_method_credential_ids", "");
            this.A05.A03(22, "PaymentMethodUpdateNotification3");
        }
    }

    public AnonymousClass1YK(C19630wG r4, C25271Fq r5, C18820ts r6, AnonymousClass12P r7, C219612i r8, AnonymousClass16S r9, AnonymousClass1EV r10, AnonymousClass1EU r11, AnonymousClass1CR r12, C19770wU r13) {
        this.A04 = r4;
        this.A03 = r13;
        this.A01 = r9;
        this.A06 = r6;
        this.A09 = r11;
        this.A0A = r12;
        this.A00 = r8;
        this.A07 = r7;
        this.A08 = r10;
        this.A05 = r5;
    }
}

package X;

/* renamed from: X.72v  reason: invalid class name and case insensitive filesystem */
public class C1498072v implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1498072v(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0363, code lost:
        if (r4 == false) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03ec, code lost:
        r5 = new X.C1498072v(r4, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04b6, code lost:
        r0 = r4.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04e2, code lost:
        r0.A0D(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x052a, code lost:
        r6.A0H(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x052d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x071b, code lost:
        r1.A01(r2, "newsletter-guidelines");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0720, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x073f, code lost:
        r2.invoke(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e6, code lost:
        r1.A0C(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0742, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0362  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r6 = r20
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x02c9;
                case 1: goto L_0x02d6;
                case 2: goto L_0x02e2;
                case 3: goto L_0x0030;
                case 4: goto L_0x02ee;
                case 5: goto L_0x032a;
                case 6: goto L_0x0377;
                case 7: goto L_0x038e;
                case 8: goto L_0x039c;
                case 9: goto L_0x0007;
                case 10: goto L_0x03ad;
                case 11: goto L_0x0007;
                case 12: goto L_0x03d3;
                case 13: goto L_0x03f3;
                case 14: goto L_0x0054;
                case 15: goto L_0x0420;
                case 16: goto L_0x0435;
                case 17: goto L_0x0071;
                case 18: goto L_0x044f;
                case 19: goto L_0x00b3;
                case 20: goto L_0x0498;
                case 21: goto L_0x0472;
                case 22: goto L_0x00f6;
                case 23: goto L_0x04ce;
                case 24: goto L_0x04e6;
                case 25: goto L_0x04fe;
                case 26: goto L_0x0513;
                case 27: goto L_0x0136;
                case 28: goto L_0x0136;
                case 29: goto L_0x052e;
                case 30: goto L_0x054e;
                case 31: goto L_0x0564;
                case 32: goto L_0x0155;
                case 33: goto L_0x0598;
                case 34: goto L_0x05a4;
                case 35: goto L_0x06a9;
                case 36: goto L_0x0174;
                case 37: goto L_0x0261;
                case 38: goto L_0x0275;
                case 39: goto L_0x06cb;
                case 40: goto L_0x0287;
                case 41: goto L_0x06db;
                case 42: goto L_0x06f5;
                case 43: goto L_0x0708;
                case 44: goto L_0x0721;
                case 45: goto L_0x072b;
                case 46: goto L_0x0735;
                case 47: goto L_0x0735;
                case 48: goto L_0x0721;
                case 49: goto L_0x072b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r6.A00
            X.7yZ r4 = (X.C167687yZ) r4
            java.lang.Object r3 = r6.A01
            X.9lY r3 = (X.C202319lY) r3
            X.00s r2 = r4.A01
            X.9IK r1 = new X.9IK
            r1.<init>()
            r0 = 1
            r1.A01 = r0
            r2.A0D(r1)
            X.1DR r0 = r4.A0F
            r0.A00(r3)
            r0 = 13
            X.9OX r1 = new X.9OX
            r1.<init>(r0)
            r1.A03 = r3
            X.1Rs r0 = r4.A09
            r0.A0C(r1)
        L_0x002f:
            return
        L_0x0030:
            java.lang.Object r1 = r6.A00
            X.02E r1 = (X.AnonymousClass02E) r1
            java.lang.Object r0 = r6.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            X.01I r4 = r1.A0h()
            if (r4 == 0) goto L_0x002f
            r3 = -1
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "extra_invitee_jid"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r4.setResult(r3, r0)
            r4.finish()
            return
        L_0x0054:
            java.lang.Object r2 = r6.A00
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r2 = (com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel) r2
            java.lang.Object r0 = r6.A01
            X.9lY r0 = (X.C202319lY) r0
            X.16S r1 = r2.A07
            java.lang.String r0 = r0.A0H
            X.9un r0 = r1.A07(r0)
            r2.A00 = r0
            if (r0 != 0) goto L_0x002f
            X.1Rs r1 = r2.A02
            r0 = 1
            X.9OA r3 = new X.9OA
            r3.<init>(r0)
            goto L_0x00e6
        L_0x0071:
            java.lang.Object r7 = r6.A00
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r7 = (com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel) r7
            java.lang.Object r6 = r6.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.1EU r0 = r7.A05
            X.B66 r0 = r0.A05()
            X.9Yc r5 = r0.BFZ()
            if (r5 == 0) goto L_0x002f
            X.0yC r1 = r5.A07
            r0 = 842(0x34a, float:1.18E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x002f
            X.1YQ r4 = r7.A06
            X.6O3 r3 = r4.A01()
            X.00s r2 = r7.A00
            r1 = 2
            r0 = 0
            X.C121835tn.A00(r2, r3, r0, r1)
            X.9dE r1 = r3.A01
            X.9cl r0 = r3.A02
            boolean r2 = r5.A04(r1, r0)
            X.6wo r0 = new X.6wo
            r0.<init>(r6, r7)
            X.9RV r1 = new X.9RV
            r1.<init>(r0, r4, r2)
            r0 = 0
            r4.A06(r1, r0)
            return
        L_0x00b3:
            java.lang.Object r0 = r6.A00
            X.5q2 r0 = (X.AnonymousClass5q2) r0
            java.lang.Object r3 = r6.A01
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r3 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r3
            X.9un r0 = r0.A00
            if (r0 == 0) goto L_0x002f
            X.1eV r1 = r3.A03
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x00f4
            X.1EU r0 = r1.A03
            X.AnonymousClass1EU.A00(r0)
            java.lang.String r0 = "PAY: removeMerchantPaymentMethod for nonSmbApp!"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x00d0:
            r2 = 0
            if (r0 == 0) goto L_0x00ea
            X.1Vv r0 = r3.A00
            r0.A07()
            X.00T r0 = r3.A08
            java.lang.Object r1 = r0.getValue()
            X.00r r1 = (X.C001600r) r1
            r0 = 0
        L_0x00e1:
            X.5tn r3 = new X.5tn
            r3.<init>(r2, r2, r0)
        L_0x00e6:
            r1.A0C(r3)
            return
        L_0x00ea:
            X.00T r0 = r3.A08
            java.lang.Object r1 = r0.getValue()
            X.00r r1 = (X.C001600r) r1
            r0 = 1
            goto L_0x00e1
        L_0x00f4:
            r0 = 1
            goto L_0x00d0
        L_0x00f6:
            java.lang.Object r7 = r6.A00
            X.7yq r7 = (X.C167797yq) r7
            java.lang.Object r6 = r6.A01
            X.8lG r6 = (X.C180138lG) r6
            java.lang.String r5 = r7.A0W()
            X.B66 r0 = r7.A0S()
            X.B1E r4 = r0.BFN()
            if (r4 == 0) goto L_0x002f
            r1 = 0
            int r0 = r6.A02
            if (r0 == 0) goto L_0x002f
            r0 = 4
            r6.A01 = r0
            r6.A02 = r1
            X.00s r1 = r7.A01
            java.lang.Object r0 = r1.A04()
            r1.A0D(r0)
            X.6vT r3 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "paymentHandle"
            X.6c7 r2 = new X.6c7
            r2.<init>(r3, r1, r5, r0)
            r1 = 1
            X.B9S r0 = new X.B9S
            r0.<init>(r6, r7, r5, r1)
            r4.BxJ(r2, r0)
            return
        L_0x0136:
            java.lang.Object r0 = r6.A00
            X.687 r0 = (X.AnonymousClass687) r0
            java.lang.Object r2 = r6.A01
            X.3J6 r2 = (X.AnonymousClass3J6) r2
            r1 = 1
            r0.A00()
            android.app.Activity r0 = r0.A00
            android.view.Window r0 = r0.getWindow()
            r0.setSoftInputMode(r1)
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x002f
            r2.A01(r1)
            return
        L_0x0155:
            java.lang.Object r1 = r6.A00
            com.whatsapp.pnh.RequestPhoneNumberViewModel r1 = (com.whatsapp.pnh.RequestPhoneNumberViewModel) r1
            java.lang.Object r4 = r6.A01
            X.13w r4 = (X.C223313w) r4
            com.whatsapp.pnh.RequestPhoneNumberViewModel.A01(r4, r1)
            java.util.Map r3 = r1.A07
            boolean r0 = r3.containsKey(r4)
            if (r0 != 0) goto L_0x002f
            X.3hJ r2 = new X.3hJ
            r2.<init>(r4, r1)
            X.1FV r0 = r1.A04
            java.util.Set r1 = r0.A08
            monitor-enter(r1)
            goto L_0x0743
        L_0x0174:
            java.lang.Object r3 = r6.A00
            X.39P r3 = (X.AnonymousClass39P) r3
            java.lang.Object r0 = r6.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.ContentResolver r4 = r0.getContentResolver()     // Catch:{ Exception -> 0x0775 }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ Exception -> 0x0775 }
            android.net.Uri r0 = X.C112795eT.A00     // Catch:{ Exception -> 0x0775 }
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch:{ Exception -> 0x0775 }
            java.lang.String r0 = "package"
            android.net.Uri$Builder r0 = r1.appendPath(r0)     // Catch:{ Exception -> 0x0775 }
            android.net.Uri$Builder r0 = r0.appendPath(r2)     // Catch:{ Exception -> 0x0775 }
            android.net.Uri r5 = r0.build()     // Catch:{ Exception -> 0x0775 }
            r6 = 0
            r8 = r6
            r9 = r6
            r7 = r6
            android.database.Cursor r7 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0775 }
            if (r7 == 0) goto L_0x076e
            boolean r0 = r7.moveToFirst()     // Catch:{ all -> 0x0769 }
            if (r0 == 0) goto L_0x0762
            java.lang.String r0 = "package_name"
            int r14 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "signature"
            int r5 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "is_managed"
            int r2 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "auto_updates"
            int r13 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "notif_update_available"
            int r12 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "notif_update_installed"
            int r11 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "rollout_token"
            int r10 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "terms_of_service_accepted"
            int r9 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "show_accept_tos"
            int r8 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "show_show_explicit_tos"
            int r4 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "is_restricted_mode"
            int r1 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            java.lang.String r0 = "wa_updates_enabled"
            int r6 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0769 }
            r7.getString(r14)     // Catch:{ all -> 0x0769 }
            r7.getString(r5)     // Catch:{ all -> 0x0769 }
            int r0 = r7.getInt(r2)     // Catch:{ all -> 0x0769 }
            r2 = 1
            boolean r5 = X.AnonymousClass000.A1P(r0)
            r7.getInt(r13)     // Catch:{ all -> 0x0769 }
            r7.getInt(r12)     // Catch:{ all -> 0x0769 }
            r7.getInt(r11)     // Catch:{ all -> 0x0769 }
            r7.getString(r10)     // Catch:{ all -> 0x0769 }
            if (r9 < 0) goto L_0x0210
            r7.getInt(r9)     // Catch:{ all -> 0x0769 }
        L_0x0210:
            if (r8 < 0) goto L_0x0218
            r7.getInt(r8)     // Catch:{ all -> 0x0769 }
            r7.getInt(r4)     // Catch:{ all -> 0x0769 }
        L_0x0218:
            r4 = 0
            if (r1 < 0) goto L_0x0228
            int r0 = r7.getInt(r1)     // Catch:{ all -> 0x0769 }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0769 }
            goto L_0x0229
        L_0x0228:
            r1 = r4
        L_0x0229:
            if (r6 < 0) goto L_0x0236
            int r0 = r7.getInt(r6)     // Catch:{ all -> 0x0769 }
            if (r0 != 0) goto L_0x0232
            r2 = 0
        L_0x0232:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0769 }
        L_0x0236:
            r7.close()     // Catch:{ Exception -> 0x0775 }
            if (r1 == 0) goto L_0x024e
            X.3NR r0 = r3.A02     // Catch:{ Exception -> 0x0775 }
            boolean r2 = r1.booleanValue()     // Catch:{ Exception -> 0x0775 }
            android.content.SharedPreferences r0 = X.AnonymousClass3NR.A00(r0)     // Catch:{ Exception -> 0x0775 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ Exception -> 0x0775 }
            java.lang.String r0 = "first_party_settings_restricted_mode"
            X.C36331k8.A0w(r1, r0, r2)     // Catch:{ Exception -> 0x0775 }
        L_0x024e:
            X.3NR r0 = r3.A02     // Catch:{ Exception -> 0x0775 }
            android.content.SharedPreferences r0 = X.AnonymousClass3NR.A00(r0)     // Catch:{ Exception -> 0x0775 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ Exception -> 0x0775 }
            java.lang.String r0 = "first_party_settings_managed"
            X.C36331k8.A0w(r1, r0, r5)     // Catch:{ Exception -> 0x0775 }
            if (r4 == 0) goto L_0x002f
            goto L_0x074e
        L_0x0261:
            java.lang.Object r4 = r6.A00
            X.39P r4 = (X.AnonymousClass39P) r4
            java.lang.Object r8 = r6.A01
            android.content.Context r8 = (android.content.Context) r8
            r2 = 0
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002f }
            java.lang.String r1 = X.C113705fy.A00     // Catch:{ NameNotFoundException -> 0x002f }
            r0.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x002f }
            goto L_0x0780
        L_0x0275:
            java.lang.Object r2 = r6.A00
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.Object r1 = r6.A01
            X.9Y2 r1 = (X.AnonymousClass9Y2) r1
            boolean r0 = r2 instanceof com.airbnb.lottie.LottieAnimationView
            if (r0 == 0) goto L_0x002f
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2
            r2.setComposition(r1)
            return
        L_0x0287:
            java.lang.Object r5 = r6.A00
            X.5wV r5 = (X.C123445wV) r5
            java.lang.Object r0 = r6.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r0 = r0.A1J
            X.11F r4 = r0.A00
            if (r4 == 0) goto L_0x002f
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r3 = r0.equals(r4)
            X.0yC r0 = r5.A00
            boolean r2 = X.AnonymousClass3RR.A00(r0, r4)
            X.1CF r0 = r5.A02
            boolean r1 = r0.A02(r4)
            X.0xf r0 = r5.A01
            boolean r0 = X.AnonymousClass3RB.A00(r0, r4)
            if (r3 != 0) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            if (r1 != 0) goto L_0x002f
            if (r0 != 0) goto L_0x002f
            int r3 = r4.getType()
            r0 = 3
            r2 = 0
            r1 = 1
            if (r3 != r0) goto L_0x02c5
            r1 = 2
        L_0x02bf:
            X.1eC r0 = r5.A03
            r0.A00(r1, r2)
            return
        L_0x02c5:
            if (r3 == r1) goto L_0x02bf
            r1 = 0
            goto L_0x02bf
        L_0x02c9:
            java.lang.Object r2 = r6.A00
            X.8i4 r2 = (X.C178888i4) r2
            java.lang.Object r1 = r6.A01
            X.9un r1 = (X.C207249un) r1
            r0 = 0
            r2.A3j(r1, r0)
            return
        L_0x02d6:
            java.lang.Object r1 = r6.A00
            X.B3K r1 = (X.B3K) r1
            java.lang.Object r0 = r6.A01
            X.9ua r0 = (X.C207119ua) r0
            r1.BgH(r0)
            return
        L_0x02e2:
            java.lang.Object r1 = r6.A00
            com.whatsapp.payments.ui.PaymentContactPickerFragment r1 = (com.whatsapp.payments.ui.PaymentContactPickerFragment) r1
            java.lang.Object r0 = r6.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r1.A26(r0)
            return
        L_0x02ee:
            java.lang.Object r5 = r6.A00
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r4 = r6.A01
            java.util.AbstractList r4 = (java.util.AbstractList) r4
            int r1 = r4.size()
            r0 = 1
            if (r1 != r0) goto L_0x0319
            r3 = -1
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.Object r0 = X.C36441kJ.A12(r4)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "extra_invitee_jid"
            android.content.Intent r0 = r2.putExtra(r0, r1)
        L_0x0312:
            r5.setResult(r3, r0)
            r5.finish()
            return
        L_0x0319:
            r3 = 501(0x1f5, float:7.02E-43)
            android.content.Intent r2 = X.C36431kI.A0D()
            int r1 = r4.size()
            java.lang.String r0 = "extra_inviter_count"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            goto L_0x0312
        L_0x032a:
            java.lang.Object r8 = r6.A00
            X.8r9 r8 = (X.C183658r9) r8
            java.lang.Object r7 = r6.A01
            java.util.List r7 = (java.util.List) r7
            r6 = 0
            r1 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x0338:
            int r0 = r7.size()
            if (r1 >= r0) goto L_0x035e
            java.lang.Object r0 = r7.get(r1)
            X.9lY r0 = (X.C202319lY) r0
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x0375
            r5 = 1
        L_0x0349:
            java.lang.Object r0 = r7.get(r1)
            X.9lY r0 = (X.C202319lY) r0
            boolean r0 = X.C202319lY.A02(r0)
            if (r0 == 0) goto L_0x0373
            r3 = 1
        L_0x0356:
            if (r5 == 0) goto L_0x0370
            if (r4 == 0) goto L_0x0370
            if (r3 == 0) goto L_0x0370
            if (r2 == 0) goto L_0x0370
        L_0x035e:
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r1 = r8.A03
            if (r5 == 0) goto L_0x0365
            r0 = 1
            if (r4 != 0) goto L_0x0366
        L_0x0365:
            r0 = 0
        L_0x0366:
            r1.A0R = r0
            if (r3 == 0) goto L_0x036d
            if (r2 == 0) goto L_0x036d
            r6 = 1
        L_0x036d:
            r1.A0N = r6
            return
        L_0x0370:
            int r1 = r1 + 1
            goto L_0x0338
        L_0x0373:
            r2 = 1
            goto L_0x0356
        L_0x0375:
            r4 = 1
            goto L_0x0349
        L_0x0377:
            java.lang.Object r3 = r6.A00
            X.9ei r3 = (X.C199109ei) r3
            java.lang.Object r2 = r6.A01
            X.1eV r0 = r3.A0H
            X.54i r1 = r0.A00()
            X.17Y r6 = r3.A00
            r0 = 32
            X.736 r5 = new X.736
            r5.<init>(r3, r1, r2, r0)
            goto L_0x052a
        L_0x038e:
            java.lang.Object r0 = r6.A00
            X.8rL r0 = (X.C183778rL) r0
            java.lang.Object r1 = r6.A01
            java.util.List r1 = (java.util.List) r1
            X.1Fo r0 = r0.A01
            r0.A03(r1)
            return
        L_0x039c:
            java.lang.Object r2 = r6.A00
            X.7yZ r2 = (X.C167687yZ) r2
            java.lang.Object r1 = r6.A01
            X.9lY r1 = (X.C202319lY) r1
            X.1DR r0 = r2.A0F
            r0.A00(r1)
            X.C167687yZ.A02(r2)
            return
        L_0x03ad:
            java.lang.Object r4 = r6.A00
            X.7yZ r4 = (X.C167687yZ) r4
            java.lang.Object r3 = r6.A01
            X.9lY r3 = (X.C202319lY) r3
            X.1EU r0 = r4.A0G
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r2 = r0.A05
            java.lang.String r1 = r3.A0L
            r0 = 0
            r2.A0c(r3, r0, r1)
            X.1Db r0 = r4.A0E
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r0)
            java.lang.String r0 = "payment_has_received_upi_mandate_request"
            X.C36331k8.A0w(r1, r0, r2)
            X.17Y r6 = r4.A0B
            r0 = 9
            goto L_0x03ec
        L_0x03d3:
            java.lang.Object r4 = r6.A00
            X.7yZ r4 = (X.C167687yZ) r4
            java.lang.Object r3 = r6.A01
            X.9lY r3 = (X.C202319lY) r3
            X.1EU r0 = r4.A0G
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r2 = r0.A05
            java.lang.String r1 = r3.A0L
            r0 = 0
            r2.A0c(r3, r0, r1)
            X.17Y r6 = r4.A0B
            r0 = 11
        L_0x03ec:
            X.72v r5 = new X.72v
            r5.<init>(r4, r3, r0)
            goto L_0x052a
        L_0x03f3:
            java.lang.Object r2 = r6.A00
            X.7yZ r2 = (X.C167687yZ) r2
            java.lang.Object r0 = r6.A01
            X.8bI r0 = (X.C175928bI) r0
            X.9jw r0 = r0.A0G
            X.9iz r1 = r0.A0B
            if (r1 == 0) goto L_0x0409
            java.lang.String r0 = "RESUME"
            r1.A02 = r0
            java.lang.String r0 = "PENDING"
            r1.A03 = r0
        L_0x0409:
            X.1EU r0 = r2.A0G
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r1 = r0.A05
            X.9lY r0 = r2.A07
            r1.A0a(r0)
            X.17Y r6 = r2.A0B
            r0 = 49
            X.AVY r5 = new X.AVY
            r5.<init>(r2, r0)
            goto L_0x052a
        L_0x0420:
            java.lang.Object r2 = r6.A00
            X.7yq r2 = (X.C167797yq) r2
            java.lang.Object r1 = r6.A01
            X.9un r1 = (X.C207249un) r1
            r0 = 115(0x73, float:1.61E-43)
            X.8lU r3 = new X.8lU
            r3.<init>(r0)
            r3.A04 = r1
            X.1Rs r0 = r2.A08
            goto L_0x04e2
        L_0x0435:
            java.lang.Object r0 = r6.A00
            X.6Jr r0 = (X.C130096Jr) r0
            java.lang.Object r2 = r6.A01
            X.9lY r2 = (X.C202319lY) r2
            X.8lb r1 = r0.A01
            X.1DR r0 = r1.A06
            r0.A00(r2)
            r0 = 111(0x6f, float:1.56E-43)
            X.8lU r3 = new X.8lU
            r3.<init>(r0)
            X.1Rs r0 = r1.A08
            goto L_0x04e2
        L_0x044f:
            java.lang.Object r1 = r6.A00
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r1 = (com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel) r1
            java.lang.Object r0 = r6.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            int r4 = com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.A01(r0, r1)
            X.00s r3 = r1.A02
            X.1YQ r0 = r1.A06
            X.9dE r1 = r0.A02()
            X.9cl r0 = r0.A03()
            X.6O3 r2 = new X.6O3
            r2.<init>(r1, r0, r4)
            r1 = 0
            r0 = 0
            X.C121835tn.A00(r3, r2, r0, r1)
            return
        L_0x0472:
            java.lang.Object r4 = r6.A00
            X.7yq r4 = (X.C167797yq) r4
            java.lang.Object r2 = r6.A01
            X.9un r2 = (X.C207249un) r2
            X.B66 r1 = r4.A0S()
            java.lang.Class r0 = r1.B9Z()
            if (r0 == 0) goto L_0x04b9
            if (r2 == 0) goto L_0x04b9
            r0 = 16
            X.9Og r3 = new X.9Og
            r3.<init>(r0)
            r3.A04 = r2
            java.lang.String r0 = r1.B9a()
            r3.A0A = r0
            X.1Rs r0 = r4.A08
            goto L_0x04e2
        L_0x0498:
            java.lang.Object r4 = r6.A00
            X.7yq r4 = (X.C167797yq) r4
            java.lang.Object r2 = r6.A01
            X.9un r2 = (X.C207249un) r2
            X.B66 r0 = r4.A0S()
            java.lang.Class r1 = r0.BFv()
            if (r1 == 0) goto L_0x04b9
            if (r2 == 0) goto L_0x04b9
            r0 = 7
            X.9Og r3 = new X.9Og
            r3.<init>(r0)
            r3.A09 = r1
            r3.A04 = r2
        L_0x04b6:
            X.1Rs r0 = r4.A08
            goto L_0x04e2
        L_0x04b9:
            r0 = 8
            X.9Og r3 = new X.9Og
            r3.<init>(r0)
            X.0wG r0 = r4.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131894979(0x7f1222c3, float:1.9424778E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0C = r0
            goto L_0x04b6
        L_0x04ce:
            java.lang.Object r2 = r6.A00
            X.7yq r2 = (X.C167797yq) r2
            java.lang.Object r1 = r6.A01
            X.8lG r1 = (X.C180138lG) r1
            r0 = 4
            X.9Og r3 = new X.9Og
            r3.<init>(r0)
            X.141 r0 = r1.A05
            r3.A03 = r0
            X.1Rs r0 = r2.A08
        L_0x04e2:
            r0.A0D(r3)
            return
        L_0x04e6:
            java.lang.Object r0 = r6.A00
            X.8rJ r0 = (X.C183758rJ) r0
            java.lang.Object r2 = r6.A01
            X.9Ml r2 = (X.C193689Ml) r2
            X.7yq r0 = r0.A03
            X.1Fo r1 = r0.A0S
            X.9lY r0 = r2.A01
            java.lang.String r0 = r0.A0K
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A03(r0)
            return
        L_0x04fe:
            java.lang.Object r3 = r6.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r6.A01
            X.141 r2 = (X.AnonymousClass141) r2
            X.190 r1 = X.C36441kJ.A0j()
            r0 = 0
            android.content.Intent r0 = r1.A1X(r3, r2, r0)
            r3.startActivity(r0)
            return
        L_0x0513:
            java.lang.Object r3 = r6.A00
            X.8li r3 = (X.C180388li) r3
            java.lang.Object r2 = r6.A01
            X.9lY r2 = (X.C202319lY) r2
            X.1VZ r0 = r3.A0N
            X.3T1 r1 = r0.A00(r2)
            X.17Y r6 = r3.A0A
            r0 = 40
            X.736 r5 = new X.736
            r5.<init>(r3, r2, r1, r0)
        L_0x052a:
            r6.A0H(r5)
            return
        L_0x052e:
            java.lang.Object r1 = r6.A00
            X.1uS r1 = (X.C39991uS) r1
            java.lang.Object r0 = r6.A01
            X.2ps r0 = (X.C52612ps) r0
            X.3T1 r3 = X.C39991uS.A01(r1)
            if (r3 == 0) goto L_0x0548
            X.3PQ r2 = r1.A05
            r1 = 39
            int r0 = r0.A00()
            r2.A00(r3, r1, r0)
            return
        L_0x0548:
            java.lang.String r0 = "PinInChatExpirationDialogViewModel/pinExpirationOptionSelected selected is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x054e:
            java.lang.Object r2 = r6.A00
            X.1uS r2 = (X.C39991uS) r2
            java.lang.Object r0 = r6.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.1hi r1 = r2.A06
            boolean r0 = r2.A0S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0E(r0)
            return
        L_0x0564:
            java.lang.Object r5 = r6.A00
            X.3PQ r5 = (X.AnonymousClass3PQ) r5
            java.lang.Object r4 = r6.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            X.3O7 r3 = r5.A01
            r2 = 80
            r0 = 37
            X.3Ks r1 = new X.3Ks
            r1.<init>(r3, r2, r0)
            X.3O7 r0 = r1.A08
            java.lang.String r0 = X.AnonymousClass3O7.A00(r0)
            r1.A02 = r0
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            r1.A01(r0)
            r1.A02(r0)
            r1.A03(r4)
            X.2S8 r2 = r1.A00()
            X.0yW r1 = r5.A00
            X.0u5 r0 = X.AnonymousClass3PQ.A03
            r1.Blx(r2, r0)
            return
        L_0x0598:
            java.lang.Object r1 = r6.A00
            com.whatsapp.pnh.RequestPhoneNumberViewModel r1 = (com.whatsapp.pnh.RequestPhoneNumberViewModel) r1
            java.lang.Object r0 = r6.A01
            X.13w r0 = (X.C223313w) r0
            com.whatsapp.pnh.RequestPhoneNumberViewModel.A01(r0, r1)
            return
        L_0x05a4:
            java.lang.Object r1 = r6.A00
            X.2bS r1 = (X.AnonymousClass2bS) r1
            java.lang.Object r0 = r6.A01
            com.whatsapp.polls.PollResultsViewModel r0 = (com.whatsapp.polls.PollResultsViewModel) r0
            r0.A00 = r1
            X.6Pm r5 = r0.A03
            r5.A02 = r1
            java.util.List r0 = r1.A05
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x05b9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05c9
            java.lang.Object r0 = r2.next()
            X.3PS r0 = (X.AnonymousClass3PS) r0
            int r0 = r0.A00
            int r1 = r1 + r0
            goto L_0x05b9
        L_0x05c9:
            r5.A00 = r1
            X.2bS r0 = r5.A01()
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x0699
            java.util.Map r4 = r5.A05
            r4.clear()
            X.2bS r0 = r5.A01()
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x0699
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x05e8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05fa
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C180858mX
            if (r0 == 0) goto L_0x05e8
            r3.add(r1)
            goto L_0x05e8
        L_0x05fa:
            java.util.Iterator r10 = r3.iterator()
        L_0x05fe:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0699
            java.lang.Object r13 = r10.next()
            X.8mX r13 = (X.C180858mX) r13
            java.util.List r0 = r13.A06
            java.util.Iterator r9 = r0.iterator()
        L_0x0610:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x05fe
            java.lang.Object r0 = r9.next()
            java.util.List r3 = X.C90524aI.A0o(r0, r4)
            if (r3 != 0) goto L_0x0624
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
        L_0x0624:
            X.AnonymousClass00C.A0B(r0)
            r4.put(r0, r3)
            X.0wG r0 = r5.A09
            android.content.Context r1 = r0.A00
            X.16D r6 = r5.A07
            X.171 r8 = r5.A08
            r12 = 0
            X.3Qa r0 = r13.A1J
            boolean r2 = r0.A02
            java.lang.String r16 = ""
            if (r2 == 0) goto L_0x0667
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r15 = r1.getString(r0)
        L_0x0642:
            X.AnonymousClass00C.A07(r15)
            long r0 = r13.A0I
            X.6xJ r11 = new X.6xJ
            r14 = r12
            r17 = r0
            r19 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)
            r1 = 1
            r0 = 0
            if (r2 != 0) goto L_0x0665
            java.lang.Object r0 = X.C007103b.A0P(r3, r0)
            X.6xJ r0 = (X.C147496xJ) r0
            if (r0 == 0) goto L_0x0665
            boolean r0 = r0.A05
            if (r0 != r1) goto L_0x0665
        L_0x0661:
            r3.add(r1, r11)
            goto L_0x0610
        L_0x0665:
            r1 = 0
            goto L_0x0661
        L_0x0667:
            X.11F r1 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x0678
            X.11F r0 = r13.A0J()
        L_0x0673:
            if (r0 != 0) goto L_0x067a
            r15 = r16
            goto L_0x0642
        L_0x0678:
            r0 = r1
            goto L_0x0673
        L_0x067a:
            X.141 r7 = r6.A0D(r0)
            int r6 = r8.A0A(r1)
            r1 = 0
            r0 = 1
            X.34G r0 = r8.A0E(r7, r6, r1, r0)
            java.lang.String r15 = r0.A01
            if (r15 != 0) goto L_0x068e
            r15 = r16
        L_0x068e:
            X.2ol r0 = r0.A00
            java.lang.String r0 = r8.A0G(r0, r7, r6)
            if (r0 == 0) goto L_0x0642
            r16 = r0
            goto L_0x0642
        L_0x0699:
            long r3 = r5.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x06a5
            r5.A02()
            return
        L_0x06a5:
            r5.A04(r3)
            return
        L_0x06a9:
            java.lang.Object r4 = r6.A00
            X.5HK r4 = (X.AnonymousClass5HK) r4
            java.lang.Object r3 = r6.A01
            r1 = 0
            X.AnonymousClass00C.A0D(r4, r1)
            r0 = 1
            java.lang.Object r2 = r4.A05
            monitor-enter(r2)
            X.7l5[] r0 = new X.C160487l5[r0]     // Catch:{ all -> 0x06c8 }
            r0[r1] = r3     // Catch:{ all -> 0x06c8 }
            java.util.ArrayList r1 = X.AnonymousClass03T.A03(r0)     // Catch:{ all -> 0x06c8 }
            r4.A03 = r1     // Catch:{ all -> 0x06c8 }
            X.00s r0 = r4.A06     // Catch:{ all -> 0x06c8 }
            r0.A0C(r1)     // Catch:{ all -> 0x06c8 }
            monitor-exit(r2)
            return
        L_0x06c8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x06cb:
            java.lang.Object r2 = r6.A00
            X.3TS r2 = (X.AnonymousClass3TS) r2
            java.lang.Object r0 = r6.A01
            int r1 = X.AnonymousClass000.A0I(r0)
            r0 = 9
            X.AnonymousClass3TS.A03(r2, r1, r0)
            return
        L_0x06db:
            java.lang.Object r1 = r6.A00
            com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment r1 = (com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment) r1
            java.lang.Object r0 = r6.A01
            r2 = 1
            X.1X4 r1 = r1.A00
            if (r1 == 0) goto L_0x06ee
            java.util.Set r0 = X.C36411kG.A15(r0)
            r1.A0d(r0, r2)
            return
        L_0x06ee:
            java.lang.String r0 = "userActions"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06f5:
            java.lang.Object r0 = r6.A00
            com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesDecisionProcessBottomSheet r0 = (com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesDecisionProcessBottomSheet) r0
            java.lang.Object r2 = r6.A01
            X.01I r2 = (X.AnonymousClass01I) r2
            X.1fs r1 = r0.A00
            if (r1 != 0) goto L_0x071b
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0708:
            java.lang.Object r0 = r6.A00
            com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesRequirementsBottomSheet r0 = (com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesRequirementsBottomSheet) r0
            java.lang.Object r2 = r6.A01
            X.01I r2 = (X.AnonymousClass01I) r2
            X.1fs r1 = r0.A00
            if (r1 != 0) goto L_0x071b
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x071b:
            java.lang.String r0 = "newsletter-guidelines"
            r1.A01(r2, r0)
            return
        L_0x0721:
            java.lang.Object r1 = r6.A00
            X.02t r1 = (X.C006302t) r1
            java.lang.Object r0 = r6.A01
            r1.invoke(r0)
            return
        L_0x072b:
            java.lang.Object r2 = r6.A00
            X.02t r2 = (X.C006302t) r2
            java.lang.Object r1 = r6.A01
            X.C36321k7.A0w(r2, r1)
            goto L_0x073f
        L_0x0735:
            java.lang.Object r2 = r6.A00
            X.02t r2 = (X.C006302t) r2
            java.lang.Object r1 = r6.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
        L_0x073f:
            r2.invoke(r1)
            return
        L_0x0743:
            r1.add(r2)     // Catch:{ all -> 0x074b }
            monitor-exit(r1)
            r3.put(r4, r2)
            return
        L_0x074b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x074e:
            X.3NR r0 = r3.A02     // Catch:{ Exception -> 0x0775 }
            boolean r2 = r4.booleanValue()     // Catch:{ Exception -> 0x0775 }
            android.content.SharedPreferences r0 = X.AnonymousClass3NR.A00(r0)     // Catch:{ Exception -> 0x0775 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ Exception -> 0x0775 }
            java.lang.String r0 = "first_party_settings_updates_enabled"
            X.C36331k8.A0w(r1, r0, r2)     // Catch:{ Exception -> 0x0775 }
            return
        L_0x0762:
            java.lang.String r0 = "Failed to fetch settings: empty cursor"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0769 }
            throw r0     // Catch:{ all -> 0x0769 }
        L_0x0769:
            r0 = move-exception
            r7.close()     // Catch:{ Exception -> 0x0775 }
            goto L_0x0774
        L_0x076e:
            java.lang.String r0 = "Failed to fetch settings: null cursor."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ Exception -> 0x0775 }
        L_0x0774:
            throw r0     // Catch:{ Exception -> 0x0775 }
        L_0x0775:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PreloadsManager/syncFirstPartySettings/querySettings Exception: "
            X.C36321k7.A1J(r2, r0, r1)
            return
        L_0x0780:
            X.32c r3 = r4.A03
            java.lang.Class<com.facebook.oxygen.preloads.sdk.firstparty.settings.wa.ITA> r5 = com.facebook.oxygen.preloads.sdk.firstparty.settings.wa.ITA.class
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0806 }
            r0.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0806 }
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch:{ 5VH -> 0x0817 }
            java.lang.String r7 = r8.getPackageName()     // Catch:{ 5VH -> 0x0817 }
            android.content.ContentResolver r6 = r8.getContentResolver()     // Catch:{ 5VH -> 0x0817 }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ 5VH -> 0x0817 }
            r1.<init>(r8, r5)     // Catch:{ 5VH -> 0x0817 }
            int r0 = r2.getComponentEnabledSetting(r1)     // Catch:{ 5VH -> 0x0817 }
            r5 = 1
            if (r0 == r5) goto L_0x0806
            r2.setComponentEnabledSetting(r1, r5, r5)     // Catch:{ 5VH -> 0x0817 }
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch:{ 5VH -> 0x0817 }
            X.60F r0 = new X.60F     // Catch:{ 5VH -> 0x0817 }
            r0.<init>(r1)     // Catch:{ 5VH -> 0x0817 }
            X.33h r2 = r0.A00()     // Catch:{ 5VH -> 0x0817 }
            if (r2 == 0) goto L_0x0806
            r1 = 24
            boolean r0 = r2.A01     // Catch:{ 5VH -> 0x0817 }
            if (r0 == 0) goto L_0x0806
            int r0 = r2.A00     // Catch:{ 5VH -> 0x0817 }
            if (r0 < r1) goto L_0x0806
            android.content.ContentValues r2 = X.C36441kJ.A0E()     // Catch:{ 5VH -> 0x0817 }
            java.lang.String r0 = "terms_of_service_accepted"
            X.C36341k9.A0o(r2, r0, r5)     // Catch:{ 5VH -> 0x0817 }
            android.net.Uri r0 = X.C112795eT.A00     // Catch:{ 5VH -> 0x0817 }
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch:{ 5VH -> 0x0817 }
            java.lang.String r0 = "package"
            android.net.Uri$Builder r0 = r1.appendPath(r0)     // Catch:{ 5VH -> 0x0817 }
            android.net.Uri$Builder r0 = r0.appendPath(r7)     // Catch:{ 5VH -> 0x0817 }
            android.net.Uri r1 = r0.build()     // Catch:{ 5VH -> 0x0817 }
            r0 = 0
            int r2 = r6.update(r1, r2, r0, r0)     // Catch:{ IllegalArgumentException -> 0x07f3, all -> 0x07fc }
            if (r2 == r5) goto L_0x0806
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5VH -> 0x0817 }
            java.lang.String r0 = "Expected 1 row changed, actually "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)     // Catch:{ 5VH -> 0x0817 }
            X.5VH r3 = new X.5VH     // Catch:{ 5VH -> 0x0817 }
            r3.<init>(r0)     // Catch:{ 5VH -> 0x0817 }
            goto L_0x0805
        L_0x07f3:
            r1 = move-exception
            java.lang.String r0 = "Could not resolve content uri for firstparty settings"
            X.5VH r3 = new X.5VH     // Catch:{ 5VH -> 0x0817 }
            r3.<init>(r0, r1, r5)     // Catch:{ 5VH -> 0x0817 }
            goto L_0x0805
        L_0x07fc:
            r2 = move-exception
            r1 = 0
            java.lang.String r0 = "Unexpected failure."
            X.5VH r3 = new X.5VH     // Catch:{ 5VH -> 0x0817 }
            r3.<init>(r0, r2, r1)     // Catch:{ 5VH -> 0x0817 }
        L_0x0805:
            throw r3     // Catch:{ 5VH -> 0x0817 }
        L_0x0806:
            X.3NR r0 = r3.A00     // Catch:{ 5VH -> 0x0817 }
            r2 = 1
            android.content.SharedPreferences r0 = X.AnonymousClass3NR.A00(r0)     // Catch:{ 5VH -> 0x0817 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ 5VH -> 0x0817 }
            java.lang.String r0 = "tos_state"
            X.C36341k9.A0v(r1, r0, r2)     // Catch:{ 5VH -> 0x0817 }
            goto L_0x081c
        L_0x0817:
            java.lang.String r0 = "TosAcceptanceHelper/notifyAppManagerOnTosAcceptance Unable to push WA ToS accepted setting to AppManager"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x081c:
            X.0v0 r0 = r4.A01
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)
            java.lang.String r1 = "is_ita_broadcasted"
            r0 = 1
            X.C36331k8.A0w(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1498072v.run():void");
    }
}

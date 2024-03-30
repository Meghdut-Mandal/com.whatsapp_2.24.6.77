package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.1j1  reason: invalid class name and case insensitive filesystem */
public class C35641j1 implements Runnable {
    public Object A00;
    public final int A01;

    public C35641j1(HomeActivity homeActivity, int i) {
        this.A01 = i;
        switch (i) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 36:
                this.A00 = homeActivity;
                return;
            default:
                this.A00 = homeActivity;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0586, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0588, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x058b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0744, code lost:
        r2.A06(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0747, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0777, code lost:
        r2.A0H(new X.C35641j1(r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x077f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x05a6;
                case 2: goto L_0x05ae;
                case 3: goto L_0x05b6;
                case 4: goto L_0x05be;
                case 5: goto L_0x05c6;
                case 6: goto L_0x05c6;
                case 7: goto L_0x05ce;
                case 8: goto L_0x0043;
                case 9: goto L_0x05d6;
                case 10: goto L_0x05de;
                case 11: goto L_0x0065;
                case 12: goto L_0x00a9;
                case 13: goto L_0x00bf;
                case 14: goto L_0x00e1;
                case 15: goto L_0x00ef;
                case 16: goto L_0x0750;
                case 17: goto L_0x011a;
                case 18: goto L_0x05fe;
                case 19: goto L_0x017d;
                case 20: goto L_0x021e;
                case 21: goto L_0x0607;
                case 22: goto L_0x0288;
                case 23: goto L_0x029e;
                case 24: goto L_0x0617;
                case 25: goto L_0x02bf;
                case 26: goto L_0x02d8;
                case 27: goto L_0x0758;
                case 28: goto L_0x062f;
                case 29: goto L_0x0638;
                case 30: goto L_0x076c;
                case 31: goto L_0x064f;
                case 32: goto L_0x0306;
                case 33: goto L_0x04e3;
                case 34: goto L_0x050d;
                case 35: goto L_0x0657;
                case 36: goto L_0x053a;
                case 37: goto L_0x06b2;
                case 38: goto L_0x06db;
                case 39: goto L_0x054d;
                case 40: goto L_0x0703;
                case 41: goto L_0x0563;
                case 42: goto L_0x0715;
                case 43: goto L_0x071d;
                case 44: goto L_0x0728;
                case 45: goto L_0x058c;
                case 46: goto L_0x0732;
                case 47: goto L_0x073a;
                case 48: goto L_0x0748;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            X.17Y r2 = r0.A02
            r1 = 2131891041(0x7f121361, float:1.941679E38)
            r0 = 1
            r2.A04(r1, r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r3 = r10.A00
            com.google.firebase.iid.FirebaseInstanceId r3 = (com.google.firebase.iid.FirebaseInstanceId) r3
            X.0uo r0 = r3.A02
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0012
            X.0u7 r0 = r3.A01
            java.lang.String r1 = X.C19270uf.A01(r0)
            java.lang.String r0 = "*"
            X.6KS r0 = com.google.firebase.iid.FirebaseInstanceId.A00(r1, r0)
            boolean r0 = r3.A0A(r0)
            if (r0 != 0) goto L_0x003f
            X.0un r2 = r3.A05
            monitor-enter(r2)
            java.lang.String r1 = X.C19350un.A00(r2)     // Catch:{ all -> 0x0769 }
            r0 = 0
            if (r1 == 0) goto L_0x003c
            r0 = 1
        L_0x003c:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0012
        L_0x003f:
            com.google.firebase.iid.FirebaseInstanceId.A03(r3)
            return
        L_0x0043:
            java.lang.Object r3 = r10.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.1ML r0 = r3.A12
            int r1 = r0.A00
            r0 = 3
            if (r1 == r0) goto L_0x0051
            r0 = 2
            if (r1 != r0) goto L_0x0012
        L_0x0051:
            X.005 r0 = r3.A1z
            java.lang.Object r0 = r0.get()
            X.1Uz r0 = (X.C29011Uz) r0
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0012
            X.17Y r2 = r3.A05
            r1 = 25
            goto L_0x0777
        L_0x0065:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 0
            com.whatsapp.HomeActivity.A12(r1, r0)
            int r0 = r1.A03
            int r0 = com.whatsapp.HomeActivity.A0G(r0)
            X.1ce r3 = com.whatsapp.HomeActivity.A0M(r1, r0)
            boolean r0 = r3 instanceof com.whatsapp.conversationslist.ConversationsFragment
            if (r0 == 0) goto L_0x0012
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.1Ri r0 = r3.A2A
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0012
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0G
            if (r0 == 0) goto L_0x0012
            android.view.View r0 = r3.A05
            if (r0 == 0) goto L_0x0012
            r1 = 0
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0G
            r0.setVisibility(r1)
            int r2 = r3.A01
            r1 = -1
            if (r2 == r1) goto L_0x0012
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0G
            X.0CZ r0 = r0.A0G
            if (r0 == 0) goto L_0x0012
            X.4ma r0 = (X.C95974ma) r0
            r0.A0L(r2)
            r3.A01 = r1
            return
        L_0x00a9:
            java.lang.Object r2 = r10.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r1 = r2.A03
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0012
            X.005 r0 = r2.A1j
            java.lang.Object r0 = r0.get()
            X.1gO r0 = (X.C34061gO) r0
            r0.A02()
            return
        L_0x00bf:
            java.lang.Object r2 = r10.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r1 = r2.A03
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0012
            X.005 r0 = r2.A1h
            java.lang.Object r1 = r0.get()
            X.1Si r1 = (X.C28361Si) r1
            r0 = 1
            r1.A0H(r0)
            X.005 r0 = r2.A1j
            java.lang.Object r0 = r0.get()
            X.1gO r0 = (X.C34061gO) r0
            r0.A03()
            return
        L_0x00e1:
            java.lang.Object r2 = r10.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r1 = r2.A03
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 != r0) goto L_0x0012
            com.whatsapp.HomeActivity.A0v(r2)
            return
        L_0x00ef:
            java.lang.Object r3 = r10.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            int r0 = r3.A03
            r2 = 600(0x258, float:8.41E-43)
            if (r0 != r2) goto L_0x0012
            java.util.List r1 = com.whatsapp.HomeActivity.A2Y
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0012
            X.1RF r1 = r3.A0j
            int r0 = com.whatsapp.HomeActivity.A0G(r2)
            X.1RG r1 = X.AnonymousClass1RF.A00(r1, r0)
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r1.A01 = r0
            r3.A3q()
            return
        L_0x011a:
            java.lang.Object r3 = r10.A00
            X.15J r3 = (X.AnonymousClass15J) r3
            android.view.Window r1 = r3.getWindow()
            r0 = 0
            X.AnonymousClass0Q4.A00(r1, r0)
            X.1re r1 = new X.1re
            r1.<init>()
            r0 = 2131431358(0x7f0b0fbe, float:1.8484443E38)
            android.view.View r0 = r3.findViewById(r0)
            X.C07460Xt.A01(r0, r1)
            X.C011004s.A07(r0, r1)
            android.view.View r2 = r3.A00
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = 2131430217(0x7f0b0b49, float:1.8482129E38)
            android.view.View r0 = r3.findViewById(r0)
            r1.add(r0)
            r0 = 2131430219(0x7f0b0b4b, float:1.8482133E38)
            android.view.View r0 = r3.findViewById(r0)
            r1.add(r0)
            if (r2 == 0) goto L_0x0161
            r0 = 2131428160(0x7f0b0340, float:1.8477957E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x0161
            r1.add(r2)
        L_0x0161:
            java.util.Iterator r3 = r1.iterator()
        L_0x0165:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r2 = r3.next()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0165
            r1 = 1
            X.1rd r0 = new X.1rd
            r0.<init>(r2, r1, r1)
            X.C07460Xt.A01(r2, r0)
            goto L_0x0165
        L_0x017d:
            java.lang.Object r6 = r10.A00
            com.whatsapp.HomeActivity r6 = (com.whatsapp.HomeActivity) r6
            X.005 r0 = r6.A1Y
            java.lang.Object r7 = r0.get()
            X.1KW r7 = (X.AnonymousClass1KW) r7
            X.0yC r2 = r6.A0D
            X.0wo r5 = r6.A07
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 2
            X.AnonymousClass00C.A0D(r5, r0)
            r1 = 7126(0x1bd6, float:9.986E-42)
            X.0yV r0 = X.C21000yV.A02
            int r3 = X.C20800yB.A00(r0, r2, r1)
            r0 = 7125(0x1bd5, float:9.984E-42)
            java.lang.String r0 = r2.A09(r0)     // Catch:{ MalformedURLException -> 0x01ad }
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01ad }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x01ad }
            goto L_0x01c7
        L_0x01ad:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FlowsLogger/FlowsWebCacheCleanerHelper.initFLowsWebCacheCleaner -- Invalid cache cleanup url "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 0
        L_0x01c7:
            if (r3 <= 0) goto L_0x0218
            if (r1 == 0) goto L_0x0218
            X.3lP r0 = new X.3lP
            r0.<init>(r1)
        L_0x01d0:
            X.4Qb r0 = (X.C87764Qb) r0
            X.67O r4 = new X.67O
            r4.<init>(r5, r7, r0, r3)
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r6)
            X.C18740tg.A01()
            r4.A00()
            X.6AD r0 = r4.A00()
            r5 = 0
            java.util.Date r0 = r0.A01
            long r1 = r0.getTime()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            long r2 = java.lang.System.currentTimeMillis()
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            X.6AD r0 = r4.A00()
            java.util.Date r0 = r0.A01
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x0012
            X.4Qb r2 = r4.A03
            java.lang.Object r1 = r7.get()
            android.content.Context r1 = (android.content.Context) r1
            X.7Sr r0 = new X.7Sr
            r0.<init>(r4)
            r2.BmX(r1, r0)
            return
        L_0x0218:
            X.6ti r0 = new X.6ti
            r0.<init>()
            goto L_0x01d0
        L_0x021e:
            java.lang.Object r4 = r10.A00
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            X.005 r0 = r4.A1T
            java.lang.Object r0 = r0.get()
            X.1eg r0 = (X.C33081eg) r0
            X.0yC r2 = r0.A01
            r1 = 5288(0x14a8, float:7.41E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0012
            X.005 r0 = r4.A1T
            java.lang.Object r0 = r0.get()
            X.1eg r0 = (X.C33081eg) r0
            X.0v0 r0 = r0.A00
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r3 = "one_of_create_group_tool_tip_activated"
            r2 = 0
            boolean r1 = r0.getBoolean(r3, r2)
            X.005 r0 = r4.A1T
            java.lang.Object r0 = r0.get()
            X.1eg r0 = (X.C33081eg) r0
            X.0v0 r0 = r0.A00
            if (r1 == 0) goto L_0x026c
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r2)
            r0.apply()
        L_0x0266:
            X.1R8 r0 = r4.A03
            r0.A03()
            return
        L_0x026c:
            X.005 r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "create_group_tool_tip_temp_dismissed"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0012
            X.005 r0 = r4.A1T
            java.lang.Object r0 = r0.get()
            X.1eg r0 = (X.C33081eg) r0
            r0.A01()
            goto L_0x0266
        L_0x0288:
            java.lang.Object r2 = r10.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r0 = r2.A03
            int r0 = com.whatsapp.HomeActivity.A0G(r0)
            X.1ce r1 = com.whatsapp.HomeActivity.A0M(r2, r0)
            if (r1 == 0) goto L_0x0012
            X.15i r0 = r2.A2M
            r1.B0Y(r0)
            return
        L_0x029e:
            java.lang.Object r3 = r10.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            int r0 = r3.A03
            int r0 = com.whatsapp.HomeActivity.A0G(r0)
            X.1ce r2 = com.whatsapp.HomeActivity.A0M(r3, r0)
            if (r2 == 0) goto L_0x0012
            X.1R8 r1 = r3.A03
            r0 = r2
            X.1RK r0 = (X.AnonymousClass1RK) r0
            X.C18740tg.A06(r0)
            X.AnonymousClass1R8.A02(r0, r1)
            X.15i r0 = r3.A2M
            r2.B0Y(r0)
            return
        L_0x02bf:
            java.lang.Object r2 = r10.A00
            X.14u r2 = (X.C225314u) r2
            X.01N r0 = r2.A06
            X.01P r1 = r0.A02
            X.01P r0 = X.AnonymousClass01P.STARTED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x0012
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r0 = new com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment
            r0.<init>()
            r2.Btm(r0)
            return
        L_0x02d8:
            java.lang.Object r3 = r10.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            r0 = 2131428164(0x7f0b0344, float:1.8477965E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x0012
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0012
            X.1RJ r1 = new X.1RJ
            r1.<init>(r2)
            r3.A1B = r1
            r0 = 0
            r1.A03(r0)
            X.1RJ r0 = r3.A1B
            android.view.View r2 = r0.A01()
            r1 = 3
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.setOnClickListener(r0)
            return
        L_0x0306:
            java.lang.Object r8 = r10.A00
            com.whatsapp.HomeActivity r8 = (com.whatsapp.HomeActivity) r8
            int r0 = r8.A03
            int r7 = com.whatsapp.HomeActivity.A0G(r0)
            r6 = 0
        L_0x0311:
            X.1RF r1 = r8.A0j
            int r0 = r1.A00
            if (r6 >= r0) goto L_0x0012
            X.1RG r5 = X.AnonymousClass1RF.A00(r1, r6)
            r4 = 0
            if (r6 != r7) goto L_0x031f
            r4 = 1
        L_0x031f:
            int r3 = com.whatsapp.HomeActivity.A0J(r8, r6)
            r9 = 200(0xc8, float:2.8E-43)
            if (r3 == r9) goto L_0x044e
            r9 = 300(0x12c, float:4.2E-43)
            if (r3 == r9) goto L_0x0433
            r1 = 400(0x190, float:5.6E-43)
            if (r3 == r1) goto L_0x03c8
            r9 = 600(0x258, float:8.41E-43)
            if (r3 != r9) goto L_0x0367
            X.1NB r0 = r8.A3p()
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x0463
            int r0 = r5.A01
            r2 = 0
            r1 = 0
            if (r0 <= 0) goto L_0x0342
            r1 = 1
        L_0x0342:
            boolean r0 = X.C222013h.A05
            if (r0 == 0) goto L_0x03bf
            android.widget.ImageView r0 = r5.A03
            if (r0 == 0) goto L_0x0351
            if (r1 != 0) goto L_0x034e
            r2 = 8
        L_0x034e:
            r0.setVisibility(r2)
        L_0x0351:
            r2 = 2131234093(0x7f080d2d, float:1.8084342E38)
            if (r4 == 0) goto L_0x0359
            r2 = 2131234088(0x7f080d28, float:1.8084332E38)
        L_0x0359:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 0
            X.04n r1 = X.C010804n.A00(r0, r1, r2)
            android.widget.ImageView r0 = r5.A04
            r0.setImageDrawable(r1)
        L_0x0367:
            X.1NB r0 = r8.A3p()
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0390
            X.1NB r0 = r8.A08
            X.07V r1 = r0.A01
            if (r1 == 0) goto L_0x038d
            if (r4 == 0) goto L_0x038d
            X.07f r0 = r1.A04
            int r0 = r0.A0A
            if (r0 == r3) goto L_0x038d
            r0 = 0
            r1.A01 = r0
            r1.A00 = r0
            r1.setSelectedItemId(r3)
            X.02I r0 = r8.A2K
            r1.A01 = r0
            X.02L r0 = r8.A2J
            r1.A00 = r0
        L_0x038d:
            int r6 = r6 + 1
            goto L_0x0311
        L_0x0390:
            android.view.View r0 = r5.A02
            r0.setSelected(r4)
            boolean r0 = X.C222013h.A05
            if (r0 != 0) goto L_0x038d
            android.widget.ImageView r0 = r5.A04
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x03a6
            android.widget.ImageView r0 = r5.A04
            r0.setSelected(r4)
        L_0x03a6:
            android.widget.TextView r2 = r5.A06
            r0 = 2131101041(0x7f060571, float:1.781448E38)
            if (r4 == 0) goto L_0x03b7
            r1 = 2130969775(0x7f0404af, float:1.7548241E38)
            r0 = 2131101040(0x7f060570, float:1.7814478E38)
            int r0 = X.C224514j.A00(r8, r1, r0)
        L_0x03b7:
            int r0 = X.AnonymousClass00F.A00(r8, r0)
            r2.setTextColor(r0)
            goto L_0x038d
        L_0x03bf:
            r2 = 2131234091(0x7f080d2b, float:1.8084338E38)
            if (r1 == 0) goto L_0x0359
            r2 = 2131234092(0x7f080d2c, float:1.808434E38)
            goto L_0x0359
        L_0x03c8:
            X.1NB r0 = r8.A3p()
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0402
            int r9 = com.whatsapp.HomeActivity.A0G(r1)
            X.005 r0 = r8.A20
            java.lang.Object r0 = r0.get()
            X.1gN r0 = (X.C34051gN) r0
            X.C34051gN.A00(r0)
            java.util.Set r0 = r0.A00
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03f5
            X.8dR r2 = X.C177218dR.A00
        L_0x03e9:
            X.8dT r1 = new X.8dT
            r1.<init>(r2)
        L_0x03ee:
            X.1NB r0 = r8.A08
            r0.A05(r8, r1, r9)
            goto L_0x0367
        L_0x03f5:
            int r0 = r5.A01
            if (r0 <= 0) goto L_0x03ff
            X.8dQ r2 = new X.8dQ
            r2.<init>(r0)
            goto L_0x03e9
        L_0x03ff:
            X.8dU r1 = X.C177248dU.A00
            goto L_0x03ee
        L_0x0402:
            X.005 r0 = r8.A20
            java.lang.Object r0 = r0.get()
            X.1gN r0 = (X.C34051gN) r0
            X.C34051gN.A00(r0)
            java.util.Set r0 = r0.A00
            int r0 = r0.size()
            r1 = 8
            if (r0 <= 0) goto L_0x0479
            android.widget.TextView r0 = r5.A05
            r0.setVisibility(r1)
            android.widget.ImageView r1 = r5.A04
            r0 = 0
            r1.setVisibility(r0)
            X.0BQ r0 = r8.A0N
            if (r0 == 0) goto L_0x0367
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0367
            X.0BQ r0 = r8.A0N
            r0.start()
            goto L_0x0367
        L_0x0433:
            X.1NB r0 = r8.A3p()
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x0463
            android.widget.TextView r0 = r5.A05
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r1 = r5.A04
            int r0 = r5.A01
            if (r0 <= 0) goto L_0x0449
            r2 = 0
        L_0x0449:
            r1.setVisibility(r2)
            goto L_0x0367
        L_0x044e:
            X.1NB r0 = r8.A3p()
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x048d
            int r1 = r5.A01
            if (r1 <= 0) goto L_0x0460
            X.8dQ r0 = new X.8dQ
            r0.<init>(r1)
            goto L_0x0469
        L_0x0460:
            X.8dU r2 = X.C177248dU.A00
            goto L_0x046e
        L_0x0463:
            int r0 = r5.A01
            if (r0 <= 0) goto L_0x0460
            X.8dS r0 = X.C177228dS.A00
        L_0x0469:
            X.8dT r2 = new X.8dT
            r2.<init>(r0)
        L_0x046e:
            X.1NB r1 = r8.A08
            int r0 = com.whatsapp.HomeActivity.A0G(r9)
            r1.A05(r8, r2, r0)
            goto L_0x0367
        L_0x0479:
            android.widget.ImageView r0 = r5.A04
            r0.setVisibility(r1)
            X.0BQ r0 = r8.A0N
            if (r0 == 0) goto L_0x048d
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x048d
            X.0BQ r0 = r8.A0N
            r0.stop()
        L_0x048d:
            int r0 = r5.A01
            android.widget.TextView r1 = r5.A05
            if (r0 <= 0) goto L_0x04dc
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r9 = r5.A05
            X.0ts r0 = r8.A00
            java.text.NumberFormat r2 = r0.A0M()
            int r0 = r5.A01
            long r0 = (long) r0
            java.lang.String r0 = r2.format(r0)
            r9.setText(r0)
            r1 = 2130969775(0x7f0404af, float:1.7548241E38)
            r0 = 2131101040(0x7f060570, float:1.7814478E38)
            int r1 = X.C224514j.A00(r8, r1, r0)
            boolean r0 = X.C222013h.A05
            if (r0 != 0) goto L_0x04bc
            if (r4 != 0) goto L_0x04bc
            r1 = 2131101041(0x7f060571, float:1.781448E38)
        L_0x04bc:
            int r0 = X.AnonymousClass00F.A00(r8, r1)
            X.1lM r2 = new X.1lM
            r2.<init>(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168571(0x7f070d3b, float:1.7951448E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.graphics.Rect r0 = r2.A01
            r0.set(r1, r1, r1, r1)
            android.widget.TextView r0 = r5.A05
            r0.setBackground(r2)
            goto L_0x0367
        L_0x04dc:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0367
        L_0x04e3:
            java.lang.Object r0 = r10.A00
            X.1SI r0 = (X.AnonymousClass1SI) r0
            com.whatsapp.HomeActivity r0 = r0.A01
            java.util.List r0 = r0.A2m()
            java.util.Iterator r2 = r0.iterator()
        L_0x04f1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r2.next()
            X.02E r1 = (X.AnonymousClass02E) r1
            boolean r0 = r1 instanceof X.C31921ce
            if (r0 == 0) goto L_0x04f1
            X.1ce r1 = (X.C31921ce) r1
            boolean r0 = r1.B7g()
            if (r0 == 0) goto L_0x04f1
            r1.BYN()
            goto L_0x04f1
        L_0x050d:
            java.lang.Object r6 = r10.A00
            com.whatsapp.HomeActivity r6 = (com.whatsapp.HomeActivity) r6
            boolean r0 = com.whatsapp.HomeActivity.A1G(r6)
            if (r0 == 0) goto L_0x0012
            X.0yC r1 = r6.A0D
            X.0wx r0 = r6.A08
            long r2 = X.AnonymousClass1V2.A01(r0, r1)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x0527
            r1 = 1
        L_0x0527:
            java.lang.String r0 = "required free space should be > 0"
            X.C18740tg.A0D(r1, r0)
            android.content.Intent r1 = X.AnonymousClass190.A0M(r6, r2)
            boolean r0 = r6.BLh()
            if (r0 != 0) goto L_0x0780
            r6.startActivity(r1)
            return
        L_0x053a:
            java.lang.Object r0 = r10.A00
            X.15J r0 = (X.AnonymousClass15J) r0
            X.1RK r2 = r0.A3o()
            if (r2 == 0) goto L_0x0012
            X.1R8 r1 = r0.A03
            r0 = 0
            r1.A03 = r0
            X.AnonymousClass1R8.A02(r2, r1)
            return
        L_0x054d:
            java.lang.Object r1 = r10.A00
            X.0xL r1 = (X.C20300xL) r1
            X.18I r0 = r1.A0C
            X.79X r3 = r0.A07()
            X.189 r0 = r1.A0A     // Catch:{ all -> 0x0786 }
            r0.A0M()     // Catch:{ all -> 0x0786 }
            r0.A0N()     // Catch:{ all -> 0x0786 }
            r1.A07()     // Catch:{ all -> 0x0786 }
            goto L_0x0586
        L_0x0563:
            java.lang.Object r2 = r10.A00
            X.0xL r2 = (X.C20300xL) r2
            X.18I r0 = r2.A0C
            X.79X r3 = r0.A07()
            X.189 r1 = r2.A0A     // Catch:{ all -> 0x0786 }
            boolean r0 = r1.A0Y()     // Catch:{ all -> 0x0786 }
            if (r0 == 0) goto L_0x057e
            java.lang.String r0 = "pre key is not yet sent to server; scheduling pre key sending"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0786 }
            r2.A07()     // Catch:{ all -> 0x0786 }
            goto L_0x0586
        L_0x057e:
            java.lang.String r0 = "no prekeys to send on new axolotl store, generating more keys"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0786 }
            r1.A0N()     // Catch:{ all -> 0x0786 }
        L_0x0586:
            if (r3 == 0) goto L_0x0012
            r3.close()
            return
        L_0x058c:
            java.lang.Object r0 = r10.A00
            X.1Nv r0 = (X.C27341Nv) r0
            java.util.Set r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0596:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r1.next()
            X.4P2 r0 = (X.AnonymousClass4P2) r0
            r0.BgP()
            goto L_0x0596
        L_0x05a6:
            java.lang.Object r0 = r10.A00
            X.2ZK r0 = (X.AnonymousClass2ZK) r0
            r0.A00()
            return
        L_0x05ae:
            java.lang.Object r0 = r10.A00
            com.whatsapp.AbstractAppShellDelegate r0 = (com.whatsapp.AbstractAppShellDelegate) r0
            r0.m0lambda$installAnrDetector$0$comwhatsappAbstractAppShellDelegate()
            return
        L_0x05b6:
            java.lang.Object r0 = r10.A00
            com.whatsapp.AbstractAppShellDelegate r0 = (com.whatsapp.AbstractAppShellDelegate) r0
            r0.m1lambda$installAnrDetector$2$comwhatsappAbstractAppShellDelegate()
            return
        L_0x05be:
            java.lang.Object r0 = r10.A00
            com.whatsapp.AbstractAppShellDelegate r0 = (com.whatsapp.AbstractAppShellDelegate) r0
            r0.m3lambda$queueAsyncInit$5$comwhatsappAbstractAppShellDelegate()
            return
        L_0x05c6:
            java.lang.Object r0 = r10.A00
            X.10Q r0 = (X.AnonymousClass10Q) r0
            r0.A00()
            return
        L_0x05ce:
            java.lang.Object r0 = r10.A00
            X.14u r0 = (X.C225314u) r0
            r0.Bnv()
            return
        L_0x05d6:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 0
            r1.A15 = r0
            return
        L_0x05de:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            X.005 r0 = r1.A1X
            java.lang.Object r0 = r0.get()
            X.1Ck r0 = (X.C24431Ck) r0
            X.3py r4 = new X.3py
            r4.<init>(r1)
            X.0wU r3 = r0.A06
            X.1Cl r2 = r0.A04
            X.1Cm r1 = r0.A05
            X.4xq r0 = new X.4xq
            r0.<init>(r4, r2, r1, r3)
            r0.A02()
            return
        L_0x05fe:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 0
            com.whatsapp.HomeActivity.A13(r1, r0)
            return
        L_0x0607:
            java.lang.Object r0 = r10.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            X.005 r0 = r0.A1I
            java.lang.Object r0 = r0.get()
            X.6Er r0 = (X.C129036Er) r0
            r0.A00()
            return
        L_0x0617:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            java.lang.String r0 = "home/loginFailed companionMode"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.005 r0 = r1.A1Q
            java.lang.Object r3 = r0.get()
            X.1Ih r3 = (X.C25951Ih) r3
            r2 = 0
            r1 = 0
            r0 = 1
            r3.A01(r1, r2, r0)
            return
        L_0x062f:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 0
            com.whatsapp.HomeActivity.A15(r1, r0)
            return
        L_0x0638:
            java.lang.Object r3 = r10.A00
            X.14u r3 = (X.C225314u) r3
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoReminder"
            r2.setClassName(r1, r0)
            r0 = 0
            r3.A33(r2, r0)
            return
        L_0x064f:
            java.lang.Object r0 = r10.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            com.whatsapp.HomeActivity.A10(r0)
            return
        L_0x0657:
            java.lang.Object r8 = r10.A00
            X.14u r8 = (X.C225314u) r8
            boolean r0 = X.C19550w8.A03()
            r7 = 2131892840(0x7f121a68, float:1.942044E38)
            r6 = 2131891724(0x7f12160c, float:1.9418176E38)
            r5 = 2131891726(0x7f12160e, float:1.941818E38)
            r4 = 2131232765(0x7f0807fd, float:1.8081648E38)
            r3 = 2131232738(0x7f0807e2, float:1.8081594E38)
            r2 = 2131232852(0x7f080854, float:1.8081825E38)
            if (r0 == 0) goto L_0x0685
            r7 = 2131891722(0x7f12160a, float:1.9418172E38)
            r6 = 2131891723(0x7f12160b, float:1.9418174E38)
            r5 = 2131891725(0x7f12160d, float:1.9418178E38)
            r4 = 2131231783(0x7f080427, float:1.8079657E38)
            r3 = 2131231709(0x7f0803dd, float:1.8079507E38)
            r2 = 2131232765(0x7f0807fd, float:1.8081648E38)
        L_0x0685:
            X.3FD r1 = new X.3FD
            r1.<init>()
            r0 = 2131891728(0x7f121610, float:1.9418184E38)
            r1.A08 = r0
            r0 = 2131891727(0x7f12160f, float:1.9418182E38)
            r1.A07 = r0
            r0 = 2131232738(0x7f0807e2, float:1.8081594E38)
            r1.A00 = r0
            r1.A01 = r4
            r1.A03 = r3
            r1.A05 = r2
            r1.A02 = r7
            r1.A04 = r6
            r1.A06 = r5
            r0 = 1
            r1.A09 = r0
            com.whatsapp.permissions.NotificationPermissionBottomSheet r1 = r1.A00()
            java.lang.String r0 = "notification_bottomsheet"
            r8.Btl(r1, r0)
            return
        L_0x06b2:
            java.lang.Object r0 = r10.A00
            X.1RX r0 = (X.AnonymousClass1RX) r0
            com.whatsapp.HomeActivity r3 = r0.A00
            X.0yC r2 = r3.A0D
            r1 = 4023(0xfb7, float:5.637E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x06d7
            X.1RJ r0 = r3.A1C
            if (r0 == 0) goto L_0x06d7
            X.005 r0 = r3.A1G
            r0.get()
            X.1RJ r1 = r3.A1C
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A03(r0)
            return
        L_0x06d7:
            r0 = 1
            r3.A28 = r0
            return
        L_0x06db:
            java.lang.Object r3 = r10.A00
            X.0xL r3 = (X.C20300xL) r3
            X.189 r0 = r3.A0A
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x06f4
            X.0wU r2 = r3.A0F
            r1 = 40
            X.1j1 r0 = new X.1j1
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Boy(r0)
            return
        L_0x06f4:
            X.187 r2 = r3.A0B
            r0 = 40
            X.1j1 r1 = new X.1j1
            r1.<init>((java.lang.Object) r3, (int) r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00
            r0.execute(r1)
            return
        L_0x0703:
            java.lang.Object r1 = r10.A00
            X.0xL r1 = (X.C20300xL) r1
            monitor-enter(r1)
            boolean r0 = r1.A02     // Catch:{ all -> 0x0712 }
            if (r0 == 0) goto L_0x0710
            r0 = 0
            X.C20300xL.A02(r1, r0)     // Catch:{ all -> 0x0712 }
        L_0x0710:
            monitor-exit(r1)     // Catch:{ all -> 0x0712 }
            return
        L_0x0712:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0712 }
            throw r0
        L_0x0715:
            java.lang.Object r0 = r10.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            r0.A01()
            return
        L_0x071d:
            java.lang.Object r0 = r10.A00
            X.1Nv r0 = (X.C27341Nv) r0
            X.17Y r2 = r0.A00
            r1 = 2131889558(0x7f120d96, float:1.9413783E38)
            r0 = 1
            goto L_0x0744
        L_0x0728:
            java.lang.Object r0 = r10.A00
            X.1Nv r0 = (X.C27341Nv) r0
            X.1Nx r0 = r0.A01
            r0.A05()
            return
        L_0x0732:
            java.lang.Object r0 = r10.A00
            X.4UL r0 = (X.AnonymousClass4UL) r0
            r0.BXH()
            return
        L_0x073a:
            java.lang.Object r0 = r10.A00
            X.1XY r0 = (X.AnonymousClass1XY) r0
            X.17Y r2 = r0.A01
            r1 = 2131895543(0x7f1224f7, float:1.9425922E38)
            r0 = 0
        L_0x0744:
            r2.A06(r1, r0)
            return
        L_0x0748:
            java.lang.Object r0 = r10.A00
            X.1Si r0 = (X.C28361Si) r0
            r0.A09()
            return
        L_0x0750:
            java.lang.String r1 = "reverse"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0758:
            java.lang.Object r0 = r10.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            X.0v5 r0 = r0.A0S
            r0.A02()
            java.lang.String r1 = "getOnboardingActivity"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0769:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x076c:
            java.lang.Object r3 = r10.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            com.whatsapp.HomeActivity.A0w(r3)
            X.17Y r2 = r3.A05
            r1 = 32
        L_0x0777:
            X.1j1 r0 = new X.1j1
            r0.<init>((com.whatsapp.HomeActivity) r3, (int) r1)
            r2.A0H(r0)
            return
        L_0x0780:
            java.lang.String r0 = "home/show-low-free-space-on-internal-storage/cannot-start/home-activity-ended"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0786:
            r1 = move-exception
            if (r3 == 0) goto L_0x0791
            r3.close()     // Catch:{ all -> 0x078d }
            throw r1
        L_0x078d:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0791:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35641j1.run():void");
    }

    public C35641j1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}

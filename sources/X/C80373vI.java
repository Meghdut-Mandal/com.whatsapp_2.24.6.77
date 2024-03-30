package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

/* renamed from: X.3vI  reason: invalid class name and case insensitive filesystem */
public class C80373vI implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C80373vI(Object obj, String str, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = i;
    }

    public static void A00(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, int i) {
        C142616pA r4 = businessDirectoryContextualSearchViewModel.A0L;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass593 r2 = new AnonymousClass593();
        r2.A0C = 46;
        r2.A0G = 1L;
        r2.A0B = valueOf;
        C142616pA.A01(r4, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0154, code lost:
        r2.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0198, code lost:
        X.C70803fk.A1K(r1, r3, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r5 = r18
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x019c;
                case 1: goto L_0x0137;
                case 2: goto L_0x010e;
                case 3: goto L_0x018d;
                case 4: goto L_0x0181;
                case 5: goto L_0x00de;
                case 6: goto L_0x00ac;
                case 7: goto L_0x0045;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A01
            X.3pD r0 = (X.C76643pD) r0
            java.lang.String r8 = r5.A02
            int r7 = r5.A00
            X.37H r0 = r0.A02
            java.lang.ref.WeakReference r0 = r0.A01
            java.lang.Object r2 = r0.get()
            X.2cj r2 = (X.C47052cj) r2
            if (r2 == 0) goto L_0x0041
            if (r8 != 0) goto L_0x001f
            if (r7 == 0) goto L_0x0028
        L_0x001f:
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r2)
            java.lang.String r0 = "contact_qr_code"
            X.C36341k9.A0x(r1, r0, r8)
        L_0x0028:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r2.A00
            long r5 = r5 - r0
            X.17Y r4 = r2.A05
            r0 = 7
            X.3vI r3 = new X.3vI
            r3.<init>(r2, r8, r7, r0)
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            long r1 = r1 - r5
        L_0x003e:
            r4.A0I(r3, r1)
        L_0x0041:
            return
        L_0x0042:
            r1 = 0
            goto L_0x003e
        L_0x0045:
            java.lang.Object r4 = r5.A01
            X.2cj r4 = (X.C47052cj) r4
            java.lang.String r3 = r5.A02
            int r1 = r5.A00
            r0 = 0
            r4.A0X = r0
            r4.Bnv()
            if (r3 == 0) goto L_0x0079
            r4.A0V = r3
            com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment r0 = r4.A0S
            if (r0 == 0) goto L_0x006e
            r0.A02 = r3
            com.whatsapp.qrcode.contactqr.ContactQrContactCardView r2 = r0.A01
            if (r2 == 0) goto L_0x006e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://wa.me/qr/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            r2.setQrCode(r0)
        L_0x006e:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0041
            r1 = 2131888319(0x7f1208bf, float:1.941127E38)
        L_0x0075:
            r4.BO5(r1)
            return
        L_0x0079:
            if (r1 != 0) goto L_0x0089
            java.lang.String r0 = r4.A0V
            if (r0 != 0) goto L_0x0041
            X.17Y r2 = r4.A05
            r1 = 2131891607(0x7f121597, float:1.9417939E38)
            r0 = 1
            r2.A06(r1, r0)
            return
        L_0x0089:
            boolean r0 = r4.A01
            r1 = 2131888316(0x7f1208bc, float:1.9411264E38)
            if (r0 != 0) goto L_0x0075
            r7 = 2131888331(0x7f1208cb, float:1.9411294E38)
            r8 = 2131888310(0x7f1208b6, float:1.9411252E38)
            r10 = 2131888309(0x7f1208b5, float:1.941125E38)
            r0 = 6
            X.4Xi r5 = new X.4Xi
            r5.<init>(r4, r0)
            r0 = 4
            X.4Xi r6 = new X.4Xi
            r6.<init>(r4, r0)
            r9 = 2131888331(0x7f1208cb, float:1.9411294E38)
            r4.A39(r5, r6, r7, r8, r9, r10)
            return
        L_0x00ac:
            java.lang.Object r7 = r5.A01
            X.3Jk r7 = (X.C63273Jk) r7
            java.lang.String r1 = r5.A02
            int r6 = r5.A00
            java.util.Map r0 = r7.A02
            java.lang.Object r1 = r0.get(r1)
            X.37C r1 = (X.AnonymousClass37C) r1
            if (r1 == 0) goto L_0x0041
            int r0 = r1.A01
            int r5 = r1.A00
            com.whatsapp.jid.UserJid r4 = r1.A02
            java.lang.Integer r3 = X.C200469hS.A00(r0)
            if (r3 == 0) goto L_0x0041
            java.lang.String r1 = "smax"
            r0 = 0
            X.5vO r2 = new X.5vO
            r2.<init>(r4, r1, r0, r0)
            X.6TX r1 = r7.A00
            int r0 = r3.intValue()
            if (r6 != 0) goto L_0x024c
            r1.A04(r2, r0, r5)
            return
        L_0x00de:
            java.lang.Object r0 = r5.A01
            X.31t r0 = (X.C589731t) r0
            int r1 = r5.A00
            java.lang.String r3 = r5.A02
            X.2k1 r0 = r0.A00
            java.lang.ref.WeakReference r0 = r0.A07
            java.lang.Object r4 = r0.get()
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            if (r4 == 0) goto L_0x0041
            r0 = 403(0x193, float:5.65E-43)
            r8 = 0
            if (r1 == r0) goto L_0x0108
            r0 = 406(0x196, float:5.69E-43)
            if (r1 == r0) goto L_0x02a7
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x0250
            X.17Y r1 = r4.A05
            r0 = 2131890149(0x7f120fe5, float:1.9414982E38)
        L_0x0104:
            r1.A06(r0, r8)
            return
        L_0x0108:
            X.17Y r1 = r4.A05
            r0 = 2131890151(0x7f120fe7, float:1.9414986E38)
            goto L_0x0104
        L_0x010e:
            java.lang.Object r3 = r5.A01
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r3 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r3
            int r2 = r5.A00
            java.lang.String r4 = r5.A02
            android.os.Handler r1 = r3.A0B
            java.lang.Runnable r0 = r3.A03
            r1.removeCallbacks(r0)
            r0 = -1
            if (r2 == r0) goto L_0x02c3
            r0 = 1
            if (r2 == r0) goto L_0x02d2
            r0 = 2
            if (r2 == r0) goto L_0x02d2
            r0 = 3
            if (r2 == r0) goto L_0x02d2
            r0 = 4
            if (r2 != r0) goto L_0x0041
            r0 = 6
            A00(r3, r0)
            X.1Rs r2 = r3.A0d
            java.lang.Integer r0 = X.C36361kB.A0j()
            goto L_0x0154
        L_0x0137:
            java.lang.Object r4 = r5.A01
            X.4kj r4 = (X.C95384kj) r4
            int r2 = r5.A00
            java.lang.String r5 = r5.A02
            r0 = -1
            if (r2 == r0) goto L_0x02f1
            r1 = 1
            if (r2 == r1) goto L_0x0158
            r0 = 2
            if (r2 == r0) goto L_0x0158
            r0 = 3
            if (r2 == r0) goto L_0x0158
            r0 = 4
            if (r2 != r0) goto L_0x0041
            X.1Rs r2 = r4.A0I
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0154:
            r2.A0C(r0)
            return
        L_0x0158:
            X.08S r3 = r4.A05
            X.5EQ[] r2 = new X.AnonymousClass5EQ[r1]
            r0 = 3
            X.50p r1 = new X.50p
            r1.<init>(r4, r5, r0)
            r0 = 0
            r2[r0] = r1
            java.util.ArrayList r0 = X.AnonymousClass6XV.newArrayList(r2)
            r3.A0C(r0)
            X.60k r1 = r4.A0A
            java.lang.String r0 = r4.A0J
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0041
            X.6OF r0 = r4.A0F
            r2 = -1
            r1 = 0
            r4 = -1
            r0.A02(r1, r2, r4)
            return
        L_0x0181:
            java.lang.Object r0 = r5.A01
            X.31M r0 = (X.AnonymousClass31M) r0
            java.lang.String r3 = r5.A02
            int r2 = r5.A00
            X.3fk r1 = r0.A00
            r0 = 0
            goto L_0x0198
        L_0x018d:
            java.lang.Object r0 = r5.A01
            X.31M r0 = (X.AnonymousClass31M) r0
            java.lang.String r3 = r5.A02
            int r2 = r5.A00
            X.3fk r1 = r0.A00
            r0 = 1
        L_0x0198:
            X.C70803fk.A1K(r1, r3, r2, r0)
            return
        L_0x019c:
            java.lang.Object r4 = r5.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r4 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r4
            java.lang.String r7 = r5.A02
            int r6 = r5.A00
            java.lang.String r3 = "restore>RestoreFromBackupActivity/auth-request"
            r5 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.String r0 = "restore>RestoreFromBackupActivity/auth-request/asking GoogleAuthUtil for token for "
            r1.append(r0)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.String r0 = X.C34191gb.A07(r7)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            X.C36321k7.A1a(r1, r0)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.String r1 = "com.google"
            android.accounts.Account r0 = new android.accounts.Account     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            r0.<init>(r7, r1)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.String r0 = X.AnonymousClass0Z2.A03(r0, r4)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            r4.A0e = r0     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.String r0 = "restore>RestoreFromBackupActivity/auth-request/for account "
            r1.append(r0)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.String r0 = X.C34191gb.A07(r7)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            r1.append(r0)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.String r0 = ", token has been received."
            X.C36321k7.A1a(r1, r0)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            android.content.Intent r2 = X.C36431kI.A0D()     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.String r1 = "authtoken"
            java.lang.String r0 = r4.A0e     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            r2.putExtra(r1, r0)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            java.lang.String r0 = "authAccount"
            r2.putExtra(r0, r7)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            r0 = -1
            r4.onActivityResult(r6, r0, r2)     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            android.os.ConditionVariable r0 = r4.A0q     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            r0.open()     // Catch:{ 0Im -> 0x0237, UserRecoverableAuthException -> 0x0208, IOException -> 0x01f3, 0OD | SecurityException -> 0x021f }
            return
        L_0x01f3:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r4.A0e = r5
            android.os.ConditionVariable r0 = r4.A0q
            r0.open()
            X.17Y r3 = r4.A05
            r0 = 16
            X.72l r2 = new X.72l
            r2.<init>(r4, r0)
            goto L_0x0233
        L_0x0208:
            r1 = move-exception
            android.os.ConditionVariable r0 = r4.A0q
            r0.close()
            r4.A0e = r5
            r0 = 25
            r4.A3r(r5, r0)
            X.17Y r3 = r4.A05
            r0 = 9
            X.3wq r2 = new X.3wq
            r2.<init>(r4, r6, r0, r1)
            goto L_0x0233
        L_0x021f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r4.A0e = r5
            android.os.ConditionVariable r0 = r4.A0q
            r0.open()
            X.17Y r3 = r4.A05
            r0 = 16
            X.751 r2 = new X.751
            r2.<init>(r0, r7, r4)
        L_0x0233:
            r3.A0H(r2)
            return
        L_0x0237:
            r3 = move-exception
            X.17Y r2 = r4.A05
            r1 = 15
            X.72l r0 = new X.72l
            r0.<init>(r4, r1)
            r2.A0H(r0)
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable"
            com.whatsapp.util.Log.e(r0, r3)
            r4.A0e = r5
            return
        L_0x024c:
            r1.A03(r2, r0, r5)
            return
        L_0x0250:
            X.0xg r7 = r4.A1P
            X.147 r10 = r4.A1Y
            java.lang.String r0 = "GroupXmppMethods/sendGetGroupDescription"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19A r11 = r7.A05
            java.lang.String r14 = r11.A09()
            r6 = 1
            X.1AL[] r1 = new X.AnonymousClass1AL[r6]
            java.lang.String r0 = "request"
            java.lang.String r2 = "description"
            X.C36341k9.A1L(r0, r2, r1, r8)
            java.lang.String r0 = "query"
            X.9nx r9 = new X.9nx
            r9.<init>(r0, r1)
            r0 = 4
            X.1AL[] r5 = new X.AnonymousClass1AL[r0]
            X.C36331k8.A1R(r14, r5, r8)
            X.C36341k9.A1S(r5, r6)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C36351kA.A1N(r1, r0, r5)
            java.lang.String r0 = "to"
            X.1AL r1 = new X.1AL
            r1.<init>((com.whatsapp.jid.Jid) r10, (java.lang.String) r0)
            r0 = 3
            r5[r0] = r1
            X.9nx r13 = X.C36391kE.A0m(r9, r5)
            X.3T7 r12 = new X.3T7
            r12.<init>(r7, r6)
            r15 = 158(0x9e, float:2.21E-43)
            r16 = 32000(0x7d00, double:1.581E-319)
            r11.A0K(r12, r13, r14, r15, r16)
            com.whatsapp.group.GroupChatInfoActivity$DescriptionConflictDialogFragment r1 = new com.whatsapp.group.GroupChatInfoActivity$DescriptionConflictDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.C36431kI.A0I(r2, r3)
            X.C36381kD.A17(r0, r1, r4)
            return
        L_0x02a7:
            X.3Cc r0 = r4.A1L
            int r3 = r0.A00()
            X.17Y r2 = r4.A05
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755072(0x7f100040, float:1.9141013E38)
            java.lang.String r0 = X.C36321k7.A0B(r1, r3, r8, r0)
            r2.A0E(r0, r8)
            X.1C4 r0 = r4.A1d
            r0.A05(r8)
            return
        L_0x02c3:
            X.6qg r0 = r3.A0R
            r0.A0C()
            java.util.List r0 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A07(r3)
            java.util.ArrayList r2 = X.C36441kJ.A15(r0)
            r1 = 1
            goto L_0x02e0
        L_0x02d2:
            X.6qg r0 = r3.A0R
            r0.A0C()
            java.util.List r0 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A07(r3)
            java.util.ArrayList r2 = X.C36441kJ.A15(r0)
            r1 = 2
        L_0x02e0:
            X.5E1 r0 = new X.5E1
            r0.<init>(r3, r4, r1)
            r2.add(r0)
            A00(r3, r1)
            X.08S r0 = r3.A0F
            r0.A0C(r2)
            return
        L_0x02f1:
            X.08S r3 = r4.A05
            r0 = 1
            X.5EQ[] r2 = new X.AnonymousClass5EQ[r0]
            r0 = 2
            X.50p r1 = new X.50p
            r1.<init>(r4, r5, r0)
            r0 = 0
            r2[r0] = r1
            java.util.ArrayList r0 = X.AnonymousClass6XV.newArrayList(r2)
            r3.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80373vI.run():void");
    }
}

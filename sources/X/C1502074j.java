package X;

import android.os.PowerManager;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.74j  reason: invalid class name and case insensitive filesystem */
public class C1502074j implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1502074j(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            Log.i("ExportFlowManager/onStartCommand/wakelock released");
            wakeLock.release();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.whatsapp.newsletter.ui.NewsletterCreationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: X.2Y2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.2Y2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v134, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v432, resolved type: X.2Y2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: X.2Y2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v72, resolved type: com.whatsapp.newsletter.ui.NewsletterCreationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v73, resolved type: com.whatsapp.newsletter.ui.NewsletterCreationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v74, resolved type: com.whatsapp.newsletter.ui.NewsletterCreationActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x098b, code lost:
        r0 = r0.A1Y(r3, r1);
        X.AnonymousClass00C.A08(r0);
        r3.startActivity(r0);
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0998, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x09be, code lost:
        r0.A02();
        r2.BiG(X.C023409w.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x09c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r3.A3q(r0, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0792  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x07ca  */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x03c7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r2 = r22
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0bfc;
                case 1: goto L_0x085d;
                case 2: goto L_0x0834;
                case 3: goto L_0x07fa;
                case 4: goto L_0x0bf0;
                case 5: goto L_0x0bd4;
                case 6: goto L_0x0b85;
                case 7: goto L_0x0b49;
                case 8: goto L_0x0b29;
                case 9: goto L_0x0b1b;
                case 10: goto L_0x0b0a;
                case 11: goto L_0x0739;
                case 12: goto L_0x0afc;
                case 13: goto L_0x0aed;
                case 14: goto L_0x0ade;
                case 15: goto L_0x0ab2;
                case 16: goto L_0x06ec;
                case 17: goto L_0x0400;
                case 18: goto L_0x0a86;
                case 19: goto L_0x027d;
                case 20: goto L_0x025e;
                case 21: goto L_0x0a65;
                case 22: goto L_0x0a57;
                case 23: goto L_0x0240;
                case 24: goto L_0x0212;
                case 25: goto L_0x0169;
                case 26: goto L_0x011c;
                case 27: goto L_0x0a20;
                case 28: goto L_0x0057;
                case 29: goto L_0x09f4;
                case 30: goto L_0x09e8;
                case 31: goto L_0x0020;
                case 32: goto L_0x0020;
                case 33: goto L_0x09da;
                case 34: goto L_0x09c7;
                case 35: goto L_0x09b0;
                case 36: goto L_0x09a5;
                case 37: goto L_0x0999;
                case 38: goto L_0x0977;
                case 39: goto L_0x0017;
                case 40: goto L_0x0007;
                case 41: goto L_0x0007;
                case 42: goto L_0x0964;
                case 43: goto L_0x0956;
                case 44: goto L_0x0943;
                case 45: goto L_0x0902;
                case 46: goto L_0x08d6;
                case 47: goto L_0x08c2;
                case 48: goto L_0x08ae;
                case 49: goto L_0x089f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r2.A00
            X.2Yd r3 = (X.C46512Yd) r3
            java.lang.Object r0 = r2.A01
            X.3KA r0 = (X.AnonymousClass3KA) r0
            X.1Uw r0 = r0.A02
        L_0x0011:
            r2 = 1
            r1 = 0
            r3.A3q(r0, r2, r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r3 = r2.A00
            X.2Yd r3 = (X.C46512Yd) r3
            java.lang.Object r0 = r2.A01
            X.11F r0 = (X.AnonymousClass11F) r0
            goto L_0x0011
        L_0x0020:
            java.lang.Object r5 = r2.A00
            X.3F8 r5 = (X.AnonymousClass3F8) r5
            java.lang.Object r4 = r2.A01
            X.1Uw r4 = (X.C28981Uw) r4
            X.1Uw r0 = r5.A07
            if (r0 == 0) goto L_0x0016
            X.19A r6 = r5.A03
            java.lang.String r9 = r6.A09()
            X.8vH r3 = new X.8vH
            r3.<init>((X.C28981Uw) r4, (java.lang.String) r9)
            X.1Ja r2 = r5.A01
            X.1Zi r0 = r5.A05
            X.9UD r1 = new X.9UD
            r1.<init>(r2, r4, r0)
            X.9Ex r0 = new X.9Ex
            r0.<init>(r1)
            X.9nx r8 = r3.A00
            X.AnonymousClass00C.A08(r8)
            X.BAc r7 = new X.BAc
            r7.<init>(r4, r5, r0, r3)
            r11 = 32000(0x7d00, double:1.581E-319)
            r10 = 404(0x194, float:5.66E-43)
            r6.A0E(r7, r8, r9, r10, r11)
            return
        L_0x0057:
            java.lang.Object r5 = r2.A00
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.Object r7 = r2.A01
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r7 = (com.whatsapp.newsletter.NewsletterInfoMembersListViewModel) r7
            boolean r0 = r5 instanceof X.C223313w
            r6 = 0
            if (r0 == 0) goto L_0x0072
            r1 = r5
            X.13w r1 = (X.C223313w) r1
            if (r1 == 0) goto L_0x0072
            X.12O r0 = r7.A08
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x0072
            r5 = r0
        L_0x0072:
            X.16D r0 = r7.A07
            X.141 r4 = r0.A0D(r5)
            X.00s r3 = r7.A05
            java.util.List r0 = X.C36401kF.A0w(r3)
            if (r0 == 0) goto L_0x00c8
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x0088:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass2Y2
            if (r0 == 0) goto L_0x0088
            r8.add(r1)
            goto L_0x0088
        L_0x009a:
            java.util.Iterator r2 = r8.iterator()
        L_0x009e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2Y2 r0 = (X.AnonymousClass2Y2) r0
            X.378 r0 = r0.A00
            X.141 r0 = r0.A00
            X.11F r0 = r0.A0H
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)
            if (r0 == 0) goto L_0x009e
        L_0x00b7:
            X.2Y2 r1 = (X.AnonymousClass2Y2) r1
            if (r1 == 0) goto L_0x00c8
            X.378 r0 = r1.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.A04()
            if (r0 == 0) goto L_0x00c8
            r3.A0C(r0)
        L_0x00c8:
            X.00s r3 = r7.A04
            java.util.List r0 = X.C36401kF.A0w(r3)
            if (r0 == 0) goto L_0x0016
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x00d8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass2Y2
            if (r0 == 0) goto L_0x00d8
            r7.add(r1)
            goto L_0x00d8
        L_0x00ea:
            r1 = r6
            goto L_0x00b7
        L_0x00ec:
            java.util.Iterator r2 = r7.iterator()
        L_0x00f0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2Y2 r0 = (X.AnonymousClass2Y2) r0
            X.378 r0 = r0.A00
            X.141 r0 = r0.A00
            X.11F r0 = r0.A0H
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)
            if (r0 == 0) goto L_0x00f0
            r6 = r1
        L_0x010a:
            X.2Y2 r6 = (X.AnonymousClass2Y2) r6
            if (r6 == 0) goto L_0x0016
            X.378 r0 = r6.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.A04()
            if (r0 == 0) goto L_0x0016
            r3.A0C(r0)
            return
        L_0x011c:
            java.lang.Object r4 = r2.A00
            X.6NJ r4 = (X.AnonymousClass6NJ) r4
            java.lang.Object r3 = r2.A01
            X.5Tk r3 = (X.C108415Tk) r3
            X.6Nx r2 = r4.A02
            java.lang.String r0 = r3.id
            int r1 = r2.A01(r0)
            r0 = 5
            if (r1 == r0) goto L_0x0016
            X.66S r0 = r4.A03
            X.5qc r0 = r0.A00(r3)
            X.5Tj r0 = r0.A00
            java.lang.String r1 = r0.fileName
            X.005 r0 = r4.A05
            java.lang.Object r0 = r0.get()
            X.0wG r0 = (X.C19630wG) r0
            android.net.Uri r0 = X.AnonymousClass6XA.A01(r0, r1)
            if (r0 == 0) goto L_0x0151
            java.io.File r0 = X.C90484aE.A0c(r0)
            boolean r0 = r0.delete()
            if (r0 == 0) goto L_0x0016
        L_0x0151:
            java.lang.String r3 = r3.id
            android.content.SharedPreferences r0 = X.C131146Nx.A00(r2)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "downloadstate/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            X.C36341k9.A0u(r2, r0)
            return
        L_0x0169:
            java.lang.Object r8 = r2.A00
            com.whatsapp.mute.ui.MuteDialogViewModel r8 = (com.whatsapp.mute.ui.MuteDialogViewModel) r8
            java.lang.Object r9 = r2.A01
            java.util.List r9 = (java.util.List) r9
            X.2pb r0 = r8.A01
            long r3 = r0.durationInMillis
            r0 = -1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0180
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r3
        L_0x0180:
            java.util.Iterator r13 = r9.iterator()
        L_0x0184:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x01f1
            X.11F r12 = X.C36401kF.A0a(r13)
            boolean r2 = r8.A03
            if (r2 == 0) goto L_0x01a2
            if (r12 == 0) goto L_0x0184
            boolean r2 = r12 instanceof X.C177618e5
            if (r2 != 0) goto L_0x0184
            boolean r2 = r12 instanceof X.AnonymousClass146
            if (r2 != 0) goto L_0x0184
            X.1CR r2 = r8.A0E
            r2.A0c(r12, r0)
            goto L_0x0184
        L_0x01a2:
            if (r12 == 0) goto L_0x0184
            boolean r2 = r12 instanceof X.C177618e5
            if (r2 != 0) goto L_0x0184
            boolean r2 = r12 instanceof X.AnonymousClass146
            if (r2 != 0) goto L_0x0184
            X.1dx r11 = r8.A0D
            X.2oi r2 = r8.A00
            if (r2 != 0) goto L_0x01b4
            X.2oi r2 = X.C51992oi.CHAT_LIST_SCREEN
        L_0x01b4:
            X.C32641dx.A00(r12, r2, r11, r0)
            X.196 r10 = r11.A01
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01cc
            X.0wo r2 = r11.A02
            long r6 = X.C19970wo.A00(r2)
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r0 - r4
            long r6 = r6 + r2
        L_0x01cc:
            r2 = 1
            java.util.Set r3 = r10.A03(r12, r6, r2)
            X.AnonymousClass00C.A08(r3)
            X.1CR r2 = r11.A04
            boolean r2 = r2.A0m(r12, r0)
            if (r2 == 0) goto L_0x01ed
            r10.A0Q(r3)
        L_0x01df:
            boolean r2 = X.AnonymousClass143.A0G(r12)
            if (r2 == 0) goto L_0x0184
            X.0wG r2 = r11.A03
            android.content.Context r2 = r2.A00
            com.whatsapp.push.RegistrationIntentService.A04(r2)
            goto L_0x0184
        L_0x01ed:
            r10.A0P(r3)
            goto L_0x01df
        L_0x01f1:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x0202
            X.17Y r3 = r8.A05
            r0 = 39
            X.72n r2 = new X.72n
            r2.<init>(r8, r0)
        L_0x01fe:
            r3.A0H(r2)
            return
        L_0x0202:
            java.lang.Object r1 = X.C007103b.A0M(r9)
            if (r1 == 0) goto L_0x0016
            X.17Y r3 = r8.A05
            r0 = 24
            X.74j r2 = new X.74j
            r2.<init>(r1, r8, r0)
            goto L_0x01fe
        L_0x0212:
            java.lang.Object r3 = r2.A00
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Object r1 = r2.A01
            com.whatsapp.mute.ui.MuteDialogViewModel r1 = (com.whatsapp.mute.ui.MuteDialogViewModel) r1
            boolean r0 = X.AnonymousClass143.A0G(r3)
            if (r0 == 0) goto L_0x0016
            X.16D r0 = r1.A08
            X.141 r0 = r0.A0D(r3)
            boolean r0 = r0.A0d
            if (r0 == 0) goto L_0x0016
            X.1Cd r0 = r1.A07
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x0230:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.1cn r0 = (X.C32001cn) r0
            r0.A00(r3)
            goto L_0x0230
        L_0x0240:
            java.lang.Object r0 = r2.A00
            X.3d2 r0 = (X.C69133d2) r0
            java.lang.Object r4 = r2.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            X.1CR r3 = r0.A07
            X.3LI r2 = X.C36361kB.A0d(r4, r3)
            int r1 = r2.A02
            r0 = 1
            if (r1 != r0) goto L_0x0016
            boolean r0 = r2.A0A()
            if (r0 != 0) goto L_0x0016
            r0 = 2
            r3.A0b(r4, r0)
            return
        L_0x025e:
            java.lang.Object r4 = r2.A00
            com.whatsapp.migration.transfer.service.WifiGroupScannerP2pTransferService r4 = (com.whatsapp.migration.transfer.service.WifiGroupScannerP2pTransferService) r4
            java.lang.Object r3 = r2.A01
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.String r2 = "details_key"
            boolean r1 = r3.hasExtra(r2)
            java.lang.String r0 = "intent.getExtras()[EXTRA_DETAILS_KEY] is required but is not present"
            X.C18740tg.A0E(r1, r0)
            java.lang.String r0 = r3.getStringExtra(r2)     // Catch:{ 5V3 -> 0x0016 }
            X.6Lc r0 = X.C130446Lc.A00(r0)     // Catch:{ 5V3 -> 0x0016 }
            r4.A06 = r0     // Catch:{ 5V3 -> 0x0016 }
            goto L_0x0c37
        L_0x027d:
            java.lang.Object r3 = r2.A00
            com.whatsapp.migration.transfer.service.WifiGroupCreatorP2pTransferService r3 = (com.whatsapp.migration.transfer.service.WifiGroupCreatorP2pTransferService) r3
            java.lang.Object r1 = r2.A01
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r0 = "authToken"
            java.io.Serializable r7 = r1.getSerializableExtra(r0)     // Catch:{ IOException -> 0x0c60 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0c60 }
            java.lang.String r0 = "privateKey"
            java.io.Serializable r6 = r1.getSerializableExtra(r0)     // Catch:{ IOException -> 0x0c60 }
            java.security.PrivateKey r6 = (java.security.PrivateKey) r6     // Catch:{ IOException -> 0x0c60 }
            java.lang.String r0 = "certificate"
            java.io.Serializable r5 = r1.getSerializableExtra(r0)     // Catch:{ IOException -> 0x0c60 }
            java.security.cert.Certificate r5 = (java.security.cert.Certificate) r5     // Catch:{ IOException -> 0x0c60 }
            java.lang.String r0 = "shouldSkipAuth"
            boolean r9 = X.C36421kH.A1T(r1, r0)     // Catch:{ IOException -> 0x0c60 }
            X.5jk r4 = r3.A00     // Catch:{ IOException -> 0x0c60 }
            X.79a r2 = new X.79a     // Catch:{ IOException -> 0x0c60 }
            r2.<init>(r6, r5)     // Catch:{ IOException -> 0x0c60 }
            r0 = 8988(0x231c, float:1.2595E-41)
            java.net.ServerSocket r8 = r2.createServerSocket(r0)     // Catch:{ IOException -> 0x0c60 }
            X.5mP r6 = new X.5mP     // Catch:{ IOException -> 0x0c60 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0c60 }
            X.1bM r0 = r4.A00     // Catch:{ IOException -> 0x0c60 }
            X.0tq r0 = r0.A00     // Catch:{ IOException -> 0x0c60 }
            X.0tt r0 = r0.A00     // Catch:{ IOException -> 0x0c60 }
            X.004 r0 = r0.A36     // Catch:{ IOException -> 0x0c60 }
            java.lang.Object r5 = r0.get()     // Catch:{ IOException -> 0x0c60 }
            X.5Fa r5 = (X.C105535Fa) r5     // Catch:{ IOException -> 0x0c60 }
            X.5N7 r4 = new X.5N7     // Catch:{ IOException -> 0x0c60 }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x0c60 }
            r3.A06 = r4     // Catch:{ IOException -> 0x0c60 }
            r4.start()     // Catch:{ IOException -> 0x0c60 }
            java.lang.String r0 = "sessionId"
            java.io.Serializable r5 = r1.getSerializableExtra(r0)     // Catch:{ IOException -> 0x0c60 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0c60 }
            java.lang.String r0 = "shouldCreateWifiDirectGroup"
            boolean r1 = X.C36421kH.A1T(r1, r0)     // Catch:{ IOException -> 0x0c60 }
            java.lang.String r0 = "fpm/WifiGroupCreatorP2pTransferService/Started discovery service, waiting for connections..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0c60 }
            X.0wU r4 = r3.A07     // Catch:{ IOException -> 0x0c60 }
            X.5Fa r2 = r3.A04     // Catch:{ IOException -> 0x0c60 }
            if (r1 == 0) goto L_0x0309
            r0 = 0
            X.7sW r1 = new X.7sW     // Catch:{ IOException -> 0x0c60 }
            r1.<init>(r3, r0)     // Catch:{ IOException -> 0x0c60 }
        L_0x02ec:
            X.64J r6 = new X.64J     // Catch:{ IOException -> 0x0c60 }
            r6.<init>(r2, r1, r4, r5)     // Catch:{ IOException -> 0x0c60 }
            r3.A05 = r6     // Catch:{ IOException -> 0x0c60 }
            X.0wU r2 = r6.A04     // Catch:{ IOException -> 0x0c60 }
            r0 = 60000(0xea60, float:8.4078E-41)
            long r4 = (long) r0     // Catch:{ IOException -> 0x0c60 }
            r0 = 27
            X.72n r1 = new X.72n     // Catch:{ IOException -> 0x0c60 }
            r1.<init>(r6, r0)     // Catch:{ IOException -> 0x0c60 }
            java.lang.String r0 = "fpm/WifiDirectCreatorConnectionHandler/unableToFindPeer"
            X.1jE r0 = r2.BpM(r1, r0, r4)     // Catch:{ IOException -> 0x0c60 }
            r6.A01 = r0     // Catch:{ IOException -> 0x0c60 }
            goto L_0x0310
        L_0x0309:
            r0 = 1
            X.7sW r1 = new X.7sW     // Catch:{ IOException -> 0x0c60 }
            r1.<init>(r3, r0)     // Catch:{ IOException -> 0x0c60 }
            goto L_0x02ec
        L_0x0310:
            r5 = 0
        L_0x0311:
            X.7h4 r1 = r6.A03     // Catch:{ InterruptedException -> 0x0c5a }
            X.7sW r1 = (X.C164877sW) r1     // Catch:{ InterruptedException -> 0x0c5a }
            int r0 = r1.A01     // Catch:{ InterruptedException -> 0x0c5a }
            if (r0 == 0) goto L_0x03d0
            java.lang.Object r0 = r1.A00     // Catch:{ InterruptedException -> 0x0c5a }
            com.whatsapp.migration.transfer.service.WifiGroupCreatorP2pTransferService r0 = (com.whatsapp.migration.transfer.service.WifiGroupCreatorP2pTransferService) r0     // Catch:{ InterruptedException -> 0x0c5a }
            X.0wG r0 = r0.A02     // Catch:{ InterruptedException -> 0x0c5a }
            X.5D5 r2 = new X.5D5     // Catch:{ InterruptedException -> 0x0c5a }
            r2.<init>(r0)     // Catch:{ InterruptedException -> 0x0c5a }
        L_0x0324:
            r6.A00 = r2     // Catch:{ InterruptedException -> 0x0c5a }
            java.lang.String r1 = r6.A05     // Catch:{ InterruptedException -> 0x0c5a }
            X.6wS r0 = new X.6wS     // Catch:{ InterruptedException -> 0x0c5a }
            r0.<init>(r6)     // Catch:{ InterruptedException -> 0x0c5a }
            r2.A01(r0, r1)     // Catch:{ InterruptedException -> 0x0c5a }
            X.5D7 r7 = r6.A00     // Catch:{ InterruptedException -> 0x0c5a }
            boolean r0 = r7 instanceof X.AnonymousClass5D5     // Catch:{ InterruptedException -> 0x0c5a }
            if (r0 == 0) goto L_0x0394
            android.net.wifi.p2p.WifiP2pManager r0 = r7.A01     // Catch:{ InterruptedException -> 0x0c5a }
            if (r0 != 0) goto L_0x0361
            java.lang.String r0 = "fpm/ReceiverWifiDirectManager/Trying to start service without manager"
        L_0x033c:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0c5a }
        L_0x033f:
            X.5D7 r0 = r6.A00     // Catch:{ InterruptedException -> 0x0c5a }
            r0.A00()     // Catch:{ InterruptedException -> 0x0c5a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ InterruptedException -> 0x0c5a }
            java.lang.String r0 = "fpm/WifiDirectCreatorConnectionHandler/Unable to start discoverable service, attempt #"
            r1.append(r0)     // Catch:{ InterruptedException -> 0x0c5a }
            int r5 = r5 + 1
            java.lang.String r0 = X.C36381kD.A10(r1, r5)     // Catch:{ InterruptedException -> 0x0c5a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0c5a }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0c5a }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0c5a }
            r0 = 3
            if (r5 < r0) goto L_0x0311
            goto L_0x0c52
        L_0x0361:
            java.lang.String r2 = r7.A03     // Catch:{ InterruptedException -> 0x0c5a }
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ InterruptedException -> 0x0c5a }
            java.lang.String r0 = "_presence._tcp"
            android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo r2 = android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo.newInstance(r2, r0, r1)     // Catch:{ InterruptedException -> 0x0c5a }
            java.lang.String r0 = "add local service"
            X.6Zq r4 = new X.6Zq     // Catch:{ InterruptedException -> 0x0c5a }
            r4.<init>(r0)     // Catch:{ InterruptedException -> 0x0c5a }
            android.net.wifi.p2p.WifiP2pManager r1 = r7.A01     // Catch:{ InterruptedException -> 0x0c5a }
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r7.A00     // Catch:{ InterruptedException -> 0x0c5a }
            r1.addLocalService(r0, r2, r4)     // Catch:{ InterruptedException -> 0x0c5a }
            java.lang.String r0 = "discoverPeers"
            X.6Zq r2 = new X.6Zq     // Catch:{ InterruptedException -> 0x0c5a }
            r2.<init>(r0)     // Catch:{ InterruptedException -> 0x0c5a }
            android.net.wifi.p2p.WifiP2pManager r1 = r7.A01     // Catch:{ InterruptedException -> 0x0c5a }
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r7.A00     // Catch:{ InterruptedException -> 0x0c5a }
            r1.discoverPeers(r0, r2)     // Catch:{ InterruptedException -> 0x0c5a }
            boolean r0 = r4.A00()     // Catch:{ InterruptedException -> 0x0c5a }
            if (r0 == 0) goto L_0x033f
            boolean r0 = r2.A00()     // Catch:{ InterruptedException -> 0x0c5a }
            goto L_0x03c5
        L_0x0394:
            android.net.wifi.p2p.WifiP2pManager r2 = r7.A01     // Catch:{ InterruptedException -> 0x0c5a }
            if (r2 != 0) goto L_0x039b
            java.lang.String r0 = "fpm/WifiDirectCreatorManager/Trying to start service without manager"
            goto L_0x033c
        L_0x039b:
            android.net.wifi.p2p.WifiP2pManager$Channel r1 = r7.A00     // Catch:{ SecurityException -> 0x03c8 }
            X.6Zp r0 = new X.6Zp     // Catch:{ SecurityException -> 0x03c8 }
            r0.<init>(r7)     // Catch:{ SecurityException -> 0x03c8 }
            r2.createGroup(r1, r0)     // Catch:{ SecurityException -> 0x03c8 }
            java.lang.String r2 = r7.A03     // Catch:{ SecurityException -> 0x03c8 }
            java.lang.String r1 = "_presence._tcp"
            X.00f r0 = X.C000400e.A0D()     // Catch:{ SecurityException -> 0x03c8 }
            android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo r4 = android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo.newInstance(r2, r1, r0)     // Catch:{ SecurityException -> 0x03c8 }
            java.lang.String r0 = "add local service"
            X.6Zq r2 = new X.6Zq     // Catch:{ SecurityException -> 0x03c8 }
            r2.<init>(r0)     // Catch:{ SecurityException -> 0x03c8 }
            android.net.wifi.p2p.WifiP2pManager r1 = r7.A01     // Catch:{ SecurityException -> 0x03c8 }
            if (r1 == 0) goto L_0x03c1
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r7.A00     // Catch:{ SecurityException -> 0x03c8 }
            r1.addLocalService(r0, r4, r2)     // Catch:{ SecurityException -> 0x03c8 }
        L_0x03c1:
            boolean r0 = r2.A00()     // Catch:{ SecurityException -> 0x03c8 }
        L_0x03c5:
            if (r0 == 0) goto L_0x033f
            goto L_0x03e4
        L_0x03c8:
            r1 = move-exception
            java.lang.String r0 = "fpm/WifiDirectCreatorManager/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ InterruptedException -> 0x0c5a }
            goto L_0x033f
        L_0x03d0:
            java.lang.Object r2 = r1.A00     // Catch:{ InterruptedException -> 0x0c5a }
            com.whatsapp.migration.transfer.service.WifiGroupCreatorP2pTransferService r2 = (com.whatsapp.migration.transfer.service.WifiGroupCreatorP2pTransferService) r2     // Catch:{ InterruptedException -> 0x0c5a }
            android.content.IntentFilter r0 = X.AnonymousClass6ON.A07     // Catch:{ InterruptedException -> 0x0c5a }
            X.0wG r1 = r2.A02     // Catch:{ InterruptedException -> 0x0c5a }
            X.6wR r0 = new X.6wR     // Catch:{ InterruptedException -> 0x0c5a }
            r0.<init>(r2)     // Catch:{ InterruptedException -> 0x0c5a }
            X.5D7 r2 = new X.5D7     // Catch:{ InterruptedException -> 0x0c5a }
            r2.<init>(r1, r0)     // Catch:{ InterruptedException -> 0x0c5a }
            goto L_0x0324
        L_0x03e4:
            X.5Fa r0 = r6.A02     // Catch:{ InterruptedException -> 0x0c5a }
            java.util.Iterator r2 = X.C36361kB.A0s(r0)     // Catch:{ InterruptedException -> 0x0c5a }
        L_0x03ea:
            boolean r0 = r2.hasNext()     // Catch:{ InterruptedException -> 0x0c5a }
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r2.next()     // Catch:{ InterruptedException -> 0x0c5a }
            X.6wP r0 = (X.C146936wP) r0     // Catch:{ InterruptedException -> 0x0c5a }
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r0.A00     // Catch:{ InterruptedException -> 0x0c5a }
            X.6TQ r1 = r0.A0Y     // Catch:{ InterruptedException -> 0x0c5a }
            r0 = 16
            r1.A02(r0)     // Catch:{ InterruptedException -> 0x0c5a }
            goto L_0x03ea
        L_0x0400:
            java.lang.Object r0 = r2.A00
            com.whatsapp.migration.export.service.MessagesExporterService r0 = (com.whatsapp.migration.export.service.MessagesExporterService) r0
            java.lang.Object r1 = r2.A01
            android.content.Intent r1 = (android.content.Intent) r1
            X.6WX r7 = r0.A00
            java.lang.String r0 = "IS_FIRST_PARTY"
            r6 = 0
            boolean r19 = r1.getBooleanExtra(r0, r6)
            monitor-enter(r7)
            X.14g r2 = r7.A0H     // Catch:{ all -> 0x0daa }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x0daa }
            r2.A00 = r0     // Catch:{ all -> 0x0daa }
            r2.A03()     // Catch:{ all -> 0x0daa }
            monitor-exit(r7)
            X.6wO r8 = r7.A0C
            r8.A00 = r6
            monitor-enter(r7)
            android.os.CancellationSignal r0 = r7.A00     // Catch:{ all -> 0x0da7 }
            if (r0 != 0) goto L_0x0da0
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0da7 }
            if (r0 != 0) goto L_0x0da0
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ all -> 0x0da7 }
            r0.<init>()     // Catch:{ all -> 0x0da7 }
            r7.A00 = r0     // Catch:{ all -> 0x0da7 }
            r5 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0da7 }
            r0.<init>(r5)     // Catch:{ all -> 0x0da7 }
            r7.A01 = r0     // Catch:{ all -> 0x0da7 }
            android.os.CancellationSignal r12 = r7.A00     // Catch:{ all -> 0x0da7 }
            monitor-exit(r7)     // Catch:{ all -> 0x0da7 }
            r4 = 16
            java.lang.String r1 = "ExportFlowManager/"
            X.0yb r0 = r7.A03
            android.os.PowerManager r0 = r0.A0G()
            if (r0 != 0) goto L_0x0453
            java.lang.String r0 = "OsUtil/acquireWakeLock()/pm=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 0
        L_0x044f:
            r2 = 0
            if (r3 == 0) goto L_0x0463
            goto L_0x0458
        L_0x0453:
            android.os.PowerManager$WakeLock r3 = X.C111765co.A00(r0, r1, r5)
            goto L_0x044f
        L_0x0458:
            java.lang.String r0 = "ExportFlowManager/onStartCommand/wakelock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            r3.acquire(r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
        L_0x0463:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r0 = 3
            X.AnonymousClass6WX.A03(r7, r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.58W r10 = new X.58W     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r10.<init>()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.58W r9 = new X.58W     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r9.<init>()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.58W r1 = X.AnonymousClass6WX.A01(r7, r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.lang.Integer r0 = X.C36421kH.A0U()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r10.A05 = r0     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r9.A05 = r0     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            monitor-enter(r7)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.util.List r13 = r7.A0K     // Catch:{ all -> 0x0c98 }
            r13.clear()     // Catch:{ all -> 0x0c98 }
            r13.add(r10)     // Catch:{ all -> 0x0c98 }
            r13.add(r9)     // Catch:{ all -> 0x0c98 }
            r13.add(r1)     // Catch:{ all -> 0x0c98 }
            monitor-exit(r7)     // Catch:{ all -> 0x0c98 }
            X.5FY r0 = r7.A0D     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r21 = r0
            java.util.Iterator r1 = X.C36361kB.A0s(r21)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
        L_0x049e:
            boolean r0 = r1.hasNext()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            if (r0 == 0) goto L_0x04ae
            java.lang.Object r0 = r1.next()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.7lX r0 = (X.C160757lX) r0     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r0.BXC()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            goto L_0x049e
        L_0x04ae:
            r7.A07()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.6F7 r1 = r7.A0A     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r1.A02(r12)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r1.A00()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.1Ww r9 = r7.A0G     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r9.A0G()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.0xJ r0 = r7.A06     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r0.A04(r6)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.65w r10 = r7.A0B     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.lang.String r0 = "messages"
            java.io.File r14 = r10.A00(r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.6Xj r0 = r7.A07     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r0.A0H(r12, r14)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.lang.String r0 = "ExportFlowManager/doExport()/data-exported"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.6F6 r11 = r7.A0F     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.lang.String r0 = "migration/messages_export.zip"
            long r14 = r11.A02(r14, r0, r5)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r17 = 0
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x0c9b
            X.6FO r0 = r7.A09     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r20 = r0
            java.lang.String r0 = "enc-metadata"
            java.io.File r16 = r10.A00(r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            X.0yC r10 = r7.A04     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r0 = 1387(0x56b, float:1.944E-42)
            boolean r14 = r10.A0E(r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r0 = 10
            X.58W r0 = X.AnonymousClass6WX.A01(r7, r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r13.add(r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.io.FileOutputStream r0 = X.C90524aI.A0W(r16)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.util.zip.ZipOutputStream r10 = new java.util.zip.ZipOutputStream     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r10.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r1.A03(r12, r10, r5)     // Catch:{ all -> 0x0c8e }
            X.5tg r1 = r7.A0E     // Catch:{ all -> 0x0c8e }
            if (r14 != 0) goto L_0x0512
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0c8e }
        L_0x0512:
            java.lang.String r12 = "attempt.json"
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0c8e }
            r0.<init>(r12)     // Catch:{ all -> 0x0c8e }
            r10.putNextEntry(r0)     // Catch:{ all -> 0x0c8e }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0c8e }
            r12.<init>(r10)     // Catch:{ all -> 0x0c8e }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0c8e }
            r0.<init>(r12)     // Catch:{ all -> 0x0c8e }
            android.util.JsonWriter r12 = new android.util.JsonWriter     // Catch:{ all -> 0x0c8e }
            r12.<init>(r0)     // Catch:{ all -> 0x0c8e }
            r12.beginObject()     // Catch:{ all -> 0x0c8e }
            X.6FO r0 = r1.A01     // Catch:{ all -> 0x0c7e }
            java.lang.String r14 = r0.A02()     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "attemptInfo"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            r12.beginObject()     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "attemptId"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            r12.value(r14)     // Catch:{ all -> 0x0c7e }
            r12.endObject()     // Catch:{ all -> 0x0c7e }
            X.0yb r14 = r1.A00     // Catch:{ all -> 0x0c7e }
            X.0wg r1 = r1.A02     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "donorInfo"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            r12.beginObject()     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "deviceName"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0c7e }
            r15.append(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "-"
            r15.append(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r15)     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "appVersion"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "2.24.6.77"
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "osVersion"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "buildType"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.Integer r0 = X.C36371kC.A0o()     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "yearClass2016"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            int r0 = X.AnonymousClass1K2.A02(r14, r1)     // Catch:{ all -> 0x0c7e }
            long r0 = (long) r0     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
            r12.endObject()     // Catch:{ all -> 0x0c7e }
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0c7e }
            if (r0 != 0) goto L_0x0633
            java.lang.String r0 = "loggingEvents"
            android.util.JsonWriter r0 = r12.name(r0)     // Catch:{ all -> 0x0c7e }
            r0.beginArray()     // Catch:{ all -> 0x0c7e }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0c7e }
        L_0x05b5:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0c7e }
            if (r0 == 0) goto L_0x0630
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0c7e }
            X.58W r1 = (X.AnonymousClass58W) r1     // Catch:{ all -> 0x0c7e }
            java.lang.Integer r0 = r1.A05     // Catch:{ all -> 0x0c7e }
            if (r0 == 0) goto L_0x05b5
            int r0 = r0.intValue()     // Catch:{ all -> 0x0c7e }
            if (r0 == 0) goto L_0x05b5
            r12.beginObject()     // Catch:{ all -> 0x0c7e }
            java.lang.String r0 = "eventTypeCode"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.Integer r0 = r1.A05     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.Long r0 = r1.A07     // Catch:{ all -> 0x0c7e }
            if (r0 == 0) goto L_0x05e6
            java.lang.String r0 = "duration"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.Long r0 = r1.A07     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
        L_0x05e6:
            java.lang.Long r0 = r1.A08     // Catch:{ all -> 0x0c7e }
            if (r0 == 0) goto L_0x05f4
            java.lang.String r0 = "progress"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.Long r0 = r1.A08     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
        L_0x05f4:
            java.lang.Double r0 = r1.A02     // Catch:{ all -> 0x0c7e }
            if (r0 == 0) goto L_0x0602
            java.lang.String r0 = "exportedDbSize"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.Double r0 = r1.A02     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
        L_0x0602:
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x0c7e }
            if (r0 == 0) goto L_0x0610
            java.lang.String r0 = "storageAvailableSize"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
        L_0x0610:
            java.lang.Double r0 = r1.A00     // Catch:{ all -> 0x0c7e }
            if (r0 == 0) goto L_0x061e
            java.lang.String r0 = "waDbSize"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.Double r0 = r1.A00     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
        L_0x061e:
            java.lang.Double r0 = r1.A01     // Catch:{ all -> 0x0c7e }
            if (r0 == 0) goto L_0x062c
            java.lang.String r0 = "mediaSize"
            r12.name(r0)     // Catch:{ all -> 0x0c7e }
            java.lang.Double r0 = r1.A01     // Catch:{ all -> 0x0c7e }
            r12.value(r0)     // Catch:{ all -> 0x0c7e }
        L_0x062c:
            r12.endObject()     // Catch:{ all -> 0x0c7e }
            goto L_0x05b5
        L_0x0630:
            r12.endArray()     // Catch:{ all -> 0x0c7e }
        L_0x0633:
            r12.endObject()     // Catch:{ all -> 0x0c8e }
            r12.flush()     // Catch:{ all -> 0x0c8e }
            r10.closeEntry()     // Catch:{ all -> 0x0c8e }
            r10.close()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.lang.String r12 = "migration/enc.zip"
            X.6MK r0 = r11.A00     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.lang.String r11 = r16.getCanonicalPath()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            long r14 = r16.length()     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            java.lang.String r13 = ""
            r16 = 1
            r10 = r0
            long r10 = r10.A01(r11, r12, r13, r14, r16)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x0c74
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r7)
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0c71 }
            r0.countDown()     // Catch:{ all -> 0x0c71 }
            r7.A01 = r2     // Catch:{ all -> 0x0c71 }
            r7.A00 = r2     // Catch:{ all -> 0x0c71 }
            monitor-exit(r7)     // Catch:{ all -> 0x0c71 }
            A00(r3)
            r0 = 10
            X.AnonymousClass6WX.A03(r7, r0)
            X.AnonymousClass6WX.A02(r7)
            if (r19 != 0) goto L_0x06d8
            X.6Q7 r2 = r7.A08
            X.6FO r0 = r2.A02
            X.005 r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C90464aC.A0C(r0)
            java.lang.String r0 = "/export/provider_closed/timestamp"
            X.C36341k9.A0u(r1, r0)
            r2.A03()
            android.content.pm.PackageManager r1 = r2.A01
            android.content.ComponentName r0 = r2.A00
            r1.setComponentEnabledSetting(r0, r5, r5)
            java.lang.String r0 = "RegistrationManager/unregisterUserFromDevice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1C4 r0 = r9.A0K
            r0.A00()
            X.005 r0 = r9.A0O
            java.lang.Object r0 = r0.get()
            X.0y3 r0 = (X.C20720y3) r0
            r0.A0G(r5, r4)
            X.1Si r0 = r9.A0L
            r0.A0H(r5)
            X.0wQ r0 = r9.A05
            r0.A0D()
            r0.A0E()
            java.lang.String r0 = "RegistrationManager/setMigrationExportStage"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r0 = r9.A0F
            r0.A0y()
            r0 = 11
            X.C29501Ww.A02(r9, r0, r5)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            X.005 r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C90464aC.A0C(r0)
            java.lang.String r0 = "/export/start_time"
            X.C36341k9.A0w(r1, r0, r2)
            r20.A03()
            java.lang.String r0 = "ExportFlowManager/exportProviderAndLogout/complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x06d8:
            java.util.Iterator r1 = X.C36361kB.A0s(r21)
        L_0x06dc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.7lX r0 = (X.C160757lX) r0
            r0.BXA()
            goto L_0x06dc
        L_0x06ec:
            java.lang.Object r7 = r2.A00
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r7 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r7
            java.lang.Object r6 = r2.A01
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            X.0yb r0 = r7.A01
            android.os.PowerManager r2 = r0.A0G()
            java.lang.String r1 = "GoogleMigrateService/"
            if (r2 != 0) goto L_0x0709
            java.lang.String r0 = "OsUtil/acquireWakeLock()/pm=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 0
        L_0x0704:
            java.lang.String r4 = "GoogleMigrateService/onStartCommand/wakelock released"
            if (r5 == 0) goto L_0x071a
            goto L_0x070f
        L_0x0709:
            r0 = 1
            android.os.PowerManager$WakeLock r5 = X.C111765co.A00(r2, r1, r0)
            goto L_0x0704
        L_0x070f:
            java.lang.String r0 = "GoogleMigrateService/onStartCommand/wakelock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x071e }
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            r5.acquire(r0)     // Catch:{ Exception -> 0x071e }
        L_0x071a:
            r6.run()     // Catch:{ Exception -> 0x071e }
            goto L_0x072a
        L_0x071e:
            r3 = move-exception
            X.0wN r2 = r7.A00     // Catch:{ all -> 0x0dad }
            java.lang.String r1 = "xpm-gms-async"
            java.lang.String r0 = X.AnonymousClass000.A0k(r6)     // Catch:{ all -> 0x0dad }
            r2.A0D(r1, r0, r3)     // Catch:{ all -> 0x0dad }
        L_0x072a:
            if (r5 == 0) goto L_0x0016
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x0016
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r5.release()
            return
        L_0x0739:
            java.lang.Object r4 = r2.A00
            X.6S6 r4 = (X.AnonymousClass6S6) r4
            java.lang.Object r3 = r2.A01
            X.9nx r3 = (X.C203399nx) r3
            X.C36321k7.A0w(r4, r3)
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "to"
            com.whatsapp.jid.Jid r1 = r3.A0X(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "enc"
            X.AnonymousClass6S6.A00(r4, r3, r0, r2)
            java.lang.String r0 = "plaintext"
            X.AnonymousClass6S6.A00(r4, r3, r0, r5)
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x07b7
            boolean r0 = X.C36411kG.A1a(r2)
            if (r0 == 0) goto L_0x0775
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Trying to send enc nodes to newsletter jid! "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)
            X.AnonymousClass6S6.A01(r4, r0)
        L_0x0775:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0788
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Sending empty message to newsletter jid! "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)
        L_0x0785:
            X.AnonymousClass6S6.A01(r4, r0)
        L_0x0788:
            java.util.Iterator r3 = r2.iterator()
        L_0x078c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07c0
            X.9nx r2 = X.C36431kI.A0s(r3)
            byte[] r1 = r2.A01
            if (r1 == 0) goto L_0x078c
            int r0 = r1.length
            if (r0 == 0) goto L_0x078c
            X.8SX r0 = X.AnonymousClass8SX.A0i(r1)     // Catch:{ 186 -> 0x078c }
            if (r0 == 0) goto L_0x078c
            int r0 = X.C202839mk.A00(r0)     // Catch:{ 186 -> 0x078c }
            if (r0 != 0) goto L_0x078c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 186 -> 0x078c }
            java.lang.String r0 = "Detected not encrypted blob in the enc node. "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ 186 -> 0x078c }
            X.AnonymousClass6S6.A01(r4, r0)     // Catch:{ 186 -> 0x078c }
            goto L_0x078c
        L_0x07b7:
            boolean r0 = X.C36411kG.A1a(r5)
            if (r0 == 0) goto L_0x0788
            java.lang.String r0 = "Trying to send plaintext nodes to not newsletter jid!"
            goto L_0x0785
        L_0x07c0:
            java.util.Iterator r3 = r5.iterator()
        L_0x07c4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0016
            X.9nx r2 = X.C36431kI.A0s(r3)
            byte[] r0 = r2.A01
            if (r0 == 0) goto L_0x07c4
            X.8SX r0 = X.AnonymousClass8SX.A0i(r0)     // Catch:{ 186 -> 0x07ec }
            if (r0 == 0) goto L_0x07c4
            int r0 = X.C202839mk.A00(r0)     // Catch:{ 186 -> 0x07ec }
            if (r0 == 0) goto L_0x07c4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 186 -> 0x07ec }
            java.lang.String r0 = "Was able to parse but was invalid message in the end. "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ 186 -> 0x07ec }
            X.AnonymousClass6S6.A01(r4, r0)     // Catch:{ 186 -> 0x07ec }
            goto L_0x07c4
        L_0x07ec:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Detected encrypted blob in the plaintext node. "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
            X.AnonymousClass6S6.A01(r4, r0)
            goto L_0x07c4
        L_0x07fa:
            java.lang.Object r0 = r2.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            java.lang.Object r2 = r2.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            android.content.Context r1 = r0.A1D()
            java.lang.Class<X.14u> r0 = X.C225314u.class
            android.app.Activity r4 = X.C18860tw.A01(r1, r0)
            X.01I r4 = (X.AnonymousClass01I) r4
            X.4Uq r3 = r2.A0J
            if (r4 == 0) goto L_0x0016
            if (r3 == 0) goto L_0x0016
            X.3Qa r0 = r2.A1J
            X.11F r0 = r0.A00
            X.C18740tg.A06(r0)
            r1 = 0
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r2 = new com.whatsapp.reactions.ReactionsBottomSheetDialogFragment
            r2.<init>()
            r2.A0J = r0
            r2.A07 = r3
            r0 = 0
            r2.A0O = r0
            r2.A0D = r1
            X.01z r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "reactionsheet"
            r2.A1f(r1, r0)
            return
        L_0x0834:
            java.lang.Object r1 = r2.A00
            X.3IY r1 = (X.AnonymousClass3IY) r1
            java.lang.Object r0 = r2.A01
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r0 = (com.whatsapp.mediaview.MediaViewCurrentMessageViewModel) r0
            X.2bU r3 = r1.A01
            X.00s r2 = r0.A00
            java.lang.Object r0 = r2.A04()
            X.3IY r0 = (X.AnonymousClass3IY) r0
            if (r0 == 0) goto L_0x085b
            X.2bU r0 = r0.A01
        L_0x084a:
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0016
            X.4Uq r1 = r3.A0J
            X.3IY r0 = new X.3IY
            r0.<init>(r1, r3)
            r2.A0D(r0)
            return
        L_0x085b:
            r0 = 0
            goto L_0x084a
        L_0x085d:
            java.lang.Object r0 = r2.A00
            X.6tU r0 = (X.C145186tU) r0
            java.lang.Object r7 = r2.A01
            java.util.AbstractMap r7 = (java.util.AbstractMap) r7
            X.4me r6 = r0.A00
            r0 = 0
            r6.A00 = r0
            java.util.Iterator r5 = X.C90484aE.A0s(r7)
            r4 = 0
        L_0x086f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0899
            java.lang.Object r1 = r5.next()
            java.util.Map r0 = X.C129876Iu.A01
            java.lang.Object r0 = r0.get(r1)
            X.5te r0 = (X.C121745te) r0
            int r3 = r0.A00
            r0 = 1
            int r3 = r3 - r0
            java.lang.Object r0 = r7.get(r1)
            if (r3 < 0) goto L_0x086f
            boolean r2 = X.AnonymousClass000.A1V(r0)
            boolean[] r1 = r6.A02
            boolean r0 = r1[r3]
            if (r2 == r0) goto L_0x0896
            r4 = 1
        L_0x0896:
            r1[r3] = r2
            goto L_0x086f
        L_0x0899:
            if (r4 == 0) goto L_0x0016
            r6.A06()
            return
        L_0x089f:
            java.lang.Object r1 = r2.A00
            X.14u r1 = (X.C225314u) r1
            java.lang.Object r0 = r2.A01
            X.00S r0 = (X.AnonymousClass00S) r0
            r1.Bnv()
            r0.invoke()
            return
        L_0x08ae:
            java.lang.Object r3 = r2.A00
            com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity r3 = (com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity) r3
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            r3.Bnv()
            X.190 r0 = r3.A09
            if (r0 != 0) goto L_0x098b
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x08c2:
            java.lang.Object r3 = r2.A00
            com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity r3 = (com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity) r3
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            r3.Bnv()
            X.190 r0 = r3.A07
            if (r0 != 0) goto L_0x098b
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x08d6:
            java.lang.Object r3 = r2.A00
            X.14u r3 = (X.C225314u) r3
            java.lang.Object r0 = r2.A01
            com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet r0 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet) r0
            r8 = 0
            android.view.View r2 = r3.A00
            X.AnonymousClass00C.A08(r2)
            r6 = 2131893733(0x7f121de5, float:1.942225E38)
            java.util.List r5 = java.util.Collections.emptyList()
            X.AnonymousClass00C.A08(r5)
            X.0yb r4 = r0.A02
            if (r4 == 0) goto L_0x08fd
            r7 = 2000(0x7d0, float:2.803E-42)
            X.3ZU r1 = new X.3ZU
            r1.<init>((android.view.View) r2, (X.AnonymousClass012) r3, (X.C21060yb) r4, (java.util.List) r5, (int) r6, (int) r7, (boolean) r8)
            r1.A02()
            return
        L_0x08fd:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x0902:
            java.lang.Object r3 = r2.A00
            com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet r3 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet) r3
            java.lang.Object r7 = r2.A01
            X.1Uw r7 = (X.C28981Uw) r7
            r11 = 0
            com.whatsapp.newsletter.NewsletterLinkLauncher r4 = r3.A04
            if (r4 == 0) goto L_0x093c
            android.content.Context r5 = r3.A0a()
            X.1Ts r8 = X.C28711Ts.ADMIN_INVITE
            r9 = 0
            r12 = -1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "whatsapp://channel/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r9, r1)
            android.net.Uri r6 = android.net.Uri.parse(r0)
            r10 = r9
            r4.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            X.17Y r1 = r3.A1m()
            r0 = 2131886143(0x7f12003f, float:1.9406857E38)
            java.lang.String r0 = r3.A0n(r0)
            r1.A0F(r0, r11)
            r3.A1b()
            return
        L_0x093c:
            java.lang.String r0 = "newsletterLinkLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0943:
            java.lang.Object r4 = r2.A00
            X.14p r4 = (X.C224914p) r4
            java.lang.Object r3 = r2.A01
            X.0wU r2 = r4.A04
            r1 = 43
            X.74j r0 = new X.74j
            r0.<init>(r4, r3, r1)
            r2.Bp1(r0)
            return
        L_0x0956:
            java.lang.Object r3 = r2.A00
            X.2Yd r3 = (X.C46512Yd) r3
            java.lang.Object r2 = r2.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            r1 = 1
            r0 = 0
            r3.A3q(r2, r0, r1)
            return
        L_0x0964:
            java.lang.Object r3 = r2.A00
            X.2Yd r3 = (X.C46512Yd) r3
            java.lang.Object r0 = r2.A01
            X.3Ia r0 = (X.C62913Ia) r0
            r2 = 1
            X.AnonymousClass00C.A0D(r0, r2)
            X.1Uw r1 = r0.A00
            r0 = 0
            r3.A3q(r1, r2, r0)
            return
        L_0x0977:
            java.lang.Object r3 = r2.A00
            com.whatsapp.newsletter.ui.NewsletterCreationActivity r3 = (com.whatsapp.newsletter.ui.NewsletterCreationActivity) r3
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            r3.Bnv()
            X.190 r0 = r3.A00
            if (r0 != 0) goto L_0x098b
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x098b:
            android.content.Intent r0 = r0.A1Y(r3, r1)
            X.AnonymousClass00C.A08(r0)
            r3.startActivity(r0)
            r3.finish()
            return
        L_0x0999:
            java.lang.Object r1 = r2.A00
            X.7jd r1 = (X.C159607jd) r1
            java.lang.Object r0 = r2.A01
            java.util.Map r0 = (java.util.Map) r0
            r1.BiH(r0)
            return
        L_0x09a5:
            java.lang.Object r0 = r2.A00
            X.3Ga r0 = (X.C62403Ga) r0
            java.lang.Object r2 = r2.A01
            X.4TP r2 = (X.AnonymousClass4TP) r2
            X.17Y r0 = r0.A01
            goto L_0x09be
        L_0x09b0:
            java.lang.Object r1 = r2.A00
            X.3Ga r1 = (X.C62403Ga) r1
            java.lang.Object r2 = r2.A01
            X.4TP r2 = (X.AnonymousClass4TP) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.17Y r0 = r1.A01
        L_0x09be:
            r0.A02()
            X.09w r0 = X.C023409w.A00
            r2.BiG(r0)
            return
        L_0x09c7:
            java.lang.Object r3 = r2.A00
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r3 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r3
            java.lang.Object r1 = r2.A01
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.util.List r0 = r3.A49(r1)
            r3.A06 = r0
            return
        L_0x09da:
            java.lang.Object r0 = r2.A00
            X.39I r0 = (X.AnonymousClass39I) r0
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Cd r0 = r0.A01
            r0.A00(r1)
            return
        L_0x09e8:
            java.lang.Object r1 = r2.A00
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r0 = r2.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1.setImageBitmap(r0)
            return
        L_0x09f4:
            java.lang.Object r5 = r2.A00
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r5 = (com.whatsapp.newsletter.NewsletterInfoMembersListViewModel) r5
            java.lang.Object r4 = r2.A01
            X.2p0 r4 = (X.C52172p0) r4
            r3 = 0
            r0 = 0
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel.A01(r4, r5, r0)
            X.2p0 r0 = X.C52172p0.SHORT
            if (r4 == r0) goto L_0x0a09
            X.2p0 r0 = X.C52172p0.FULL
            if (r4 != r0) goto L_0x0a10
        L_0x0a09:
            X.Aue r0 = r5.A00
            if (r0 == 0) goto L_0x0a10
            r0.cancel()
        L_0x0a10:
            X.1ZV r2 = r5.A0D
            X.1Uw r1 = r5.A09
            X.3nt r0 = new X.3nt
            r0.<init>(r4, r5)
            X.2Y9 r0 = r2.A00(r4, r1, r0, r3)
            r5.A00 = r0
            return
        L_0x0a20:
            java.lang.Object r5 = r2.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            java.lang.Object r4 = r2.A01
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            r2 = 2131893729(0x7f121de1, float:1.9422243E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.3On r0 = r5.A0s
            if (r0 == 0) goto L_0x0a50
            java.lang.String r0 = r0.A01(r4)
            java.lang.String r3 = X.C36391kE.A0v(r5, r0, r1, r3, r2)
            X.AnonymousClass00C.A08(r3)
            X.01z r2 = r5.getSupportFragmentManager()
            X.2oW r1 = X.C51872oW.REVOKE
            r0 = 0
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C54812tb.A00(r1, r3, r0, r4)
            X.C65443Sb.A02(r0, r2)
            return
        L_0x0a50:
            java.lang.String r0 = "newsletterMultiAdminUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a57:
            java.lang.Object r3 = r2.A00
            X.1fs r3 = (X.C33751fs) r3
            java.lang.Object r1 = r2.A01
            X.01I r1 = (X.AnonymousClass01I) r1
            java.lang.String r0 = "chat-transfer-help"
            r3.A01(r1, r0)
            return
        L_0x0a65:
            java.lang.Object r3 = r2.A00
            X.5DB r3 = (X.AnonymousClass5DB) r3
            java.lang.Object r0 = r2.A01
            com.airbnb.lottie.LottieAnimationView r2 = r3.A00
            java.lang.String r1 = r0.toString()
            X.5Tj r0 = X.C108405Tj.ANDROID_TO_ANDROID_LOTTIE_ANIMATION
            java.lang.String r0 = r0.fileName
            r2.setAnimationFromJson(r1, r0)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r3.A06
            X.00s r0 = r0.A0H
            java.lang.Object r0 = r0.A04()
            X.5zA r0 = (X.C125005zA) r0
            r3.A3l(r0)
            return
        L_0x0a86:
            java.lang.Object r3 = r2.A00
            X.6NX r3 = (X.AnonymousClass6NX) r3
            java.lang.Object r2 = r2.A01
            X.5mR r2 = (X.C117545mR) r2
            X.0v0 r1 = r3.A05
            java.lang.String r0 = "chat_transfer_intent_to_migrate_last_set_timestamp"
            r1.A1Z(r0)
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
            X.1Ww r0 = r3.A0K
            r0.A0G()
            X.0xJ r1 = r3.A0A
            r0 = 0
            r1.A04(r0)
            java.lang.String r0 = "fpm/ExportHelper/disconnectFromServer()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r2.A00
            r0.A0U()
            java.lang.String r0 = "fpm/ExportHelper/prepareForAuthentication()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0ab2:
            java.lang.Object r0 = r2.A00
            X.9Sr r0 = (X.C195149Sr) r0
            java.lang.Object r5 = r2.A01
            X.AHp r5 = (X.C21337AHp) r5
            X.1aQ r0 = r0.A00
            X.1Jd r4 = r0.A06
            X.3Qa r3 = r5.BE4()
            long r0 = r5.A18
            X.5J1 r2 = new X.5J1
            r2.<init>(r3, r0)
            X.11F r0 = r5.BFC()
            r2.A0q(r0)
            r0 = -1
            r2.A01 = r0
            r0 = 16
            r2.A0n(r0)
            r0 = 0
            X.C26171Jd.A00(r4, r2, r0)
            return
        L_0x0ade:
            java.lang.Object r0 = r2.A00
            X.9Sr r0 = (X.C195149Sr) r0
            java.lang.Object r2 = r2.A01
            X.AHp r2 = (X.C21337AHp) r2
            X.1aQ r1 = r0.A00
            r0 = 0
            X.C30571aQ.A00(r1, r0, r2)
            return
        L_0x0aed:
            java.lang.Object r0 = r2.A00
            X.9cw r0 = (X.C198119cw) r0
            java.lang.Object r2 = r2.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.16J r1 = r0.A01
            r0 = 5
            r1.A04(r2, r0)
            return
        L_0x0afc:
            java.lang.Object r1 = r2.A00
            X.Ayk r1 = (X.C22934Ayk) r1
            java.lang.Object r0 = r2.A01
            X.630 r0 = (X.AnonymousClass630) r0
            byte[] r0 = r0.A02
            r1.BJg(r0)
            return
        L_0x0b0a:
            java.lang.Object r0 = r2.A00
            X.AAF r0 = (X.AAF) r0
            java.lang.Object r1 = r2.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.16D r0 = r0.A09
            r0.A0D(r1)
            r0.A0N()
            return
        L_0x0b1b:
            java.lang.Object r0 = r2.A00
            X.AAF r0 = (X.AAF) r0
            java.lang.Object r1 = r2.A01
            X.9lY r1 = (X.C202319lY) r1
            X.1DR r0 = r0.A0c
            r0.A00(r1)
            return
        L_0x0b29:
            java.lang.Object r1 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            java.lang.Object r4 = r2.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            int r0 = r4.A1I
            r3 = 2
            r2 = 3
            if (r0 == r2) goto L_0x0b38
            r2 = 2
        L_0x0b38:
            X.1Dw r1 = r1.A18
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 != 0) goto L_0x0b45
            r3 = 1
        L_0x0b45:
            r1.A02(r2, r3)
            return
        L_0x0b49:
            java.lang.Object r5 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r5 = (com.whatsapp.mediaview.MediaViewFragment) r5
            java.lang.Object r4 = r2.A01
            X.196 r1 = r5.A0Q
            java.util.Set r0 = java.util.Collections.singleton(r4)
            r3 = 0
            java.util.Set r2 = r1.A0D(r0, r3)
            X.1NO r1 = r5.A0t
            java.util.Set r0 = java.util.Collections.singleton(r4)
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0b7f
            X.17Y r1 = r5.A0H
            r0 = 2131895246(0x7f1223ce, float:1.942532E38)
            r1.A07(r0, r3)
            X.196 r0 = r5.A0Q
            r0.A0P(r2)
        L_0x0b73:
            X.17Y r2 = r5.A0H
            r1 = 2
            X.72n r0 = new X.72n
            r0.<init>(r5, r1)
            r2.A0H(r0)
            return
        L_0x0b7f:
            X.196 r0 = r5.A0Q
            r0.A0Q(r2)
            goto L_0x0b73
        L_0x0b85:
            java.lang.Object r4 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r5 = r2.A01
            X.3CU r0 = r4.A0c
            r3 = 1
            r0.A00(r3, r3)
            X.3CU r0 = r4.A0c
            X.0zf r0 = r0.A00
            java.lang.String r2 = "update_star_message_store"
            r0.A07(r2)
            X.1NO r1 = r4.A0t
            java.util.Set r0 = java.util.Collections.singleton(r5)
            r1.A02(r0)
            X.3CU r0 = r4.A0c
            X.0zf r0 = r0.A00
            r0.A06(r2)
            X.3CU r0 = r4.A0c
            X.0zf r0 = r0.A00
            java.lang.String r2 = "sync"
            r0.A07(r2)
            X.196 r1 = r4.A0Q
            java.util.Set r0 = java.util.Collections.singleton(r5)
            java.util.Set r1 = r1.A0D(r0, r3)
            X.196 r0 = r4.A0Q
            r0.A0Q(r1)
            X.3CU r0 = r4.A0c
            X.0zf r0 = r0.A00
            r0.A06(r2)
            X.17Y r1 = r4.A0H
            X.72n r0 = new X.72n
            r0.<init>(r4, r3)
            r1.A0H(r0)
            return
        L_0x0bd4:
            java.lang.Object r3 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r2 = r2.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.1A1 r1 = r3.A1e
            X.3Qa r0 = r2.A1J
            X.3T1 r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0bea
            com.whatsapp.mediaview.MediaViewFragment.A0L(r3, r0, r2)
            return
        L_0x0bea:
            java.lang.String r0 = "MediaViewFragment/onOptionsItemSelected/no-main-message-to-view-in-chat"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0bf0:
            java.lang.Object r1 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            java.lang.Object r0 = r2.A01
            X.2bU r0 = (X.AnonymousClass2bU) r0
            com.whatsapp.mediaview.MediaViewFragment.A0N(r1, r0)
            return
        L_0x0bfc:
            java.lang.Object r5 = r2.A00
            X.3nZ r5 = (X.C75643nZ) r5
            java.lang.Object r4 = r2.A01
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r4 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r4
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r4.A03
            java.lang.String r3 = "doodleEditText"
            if (r0 != 0) goto L_0x0c0f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0c0f:
            android.text.Editable r2 = r0.getEditableText()
            X.AnonymousClass00C.A08(r2)
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r4.A03
            if (r0 != 0) goto L_0x0c1f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0c1f:
            int r1 = r0.getWidth()
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r4.A03
            if (r0 != 0) goto L_0x0c2c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0c2c:
            android.text.TextPaint r0 = r0.getPaint()
            X.AnonymousClass00C.A08(r0)
            r5.A00(r2, r1)
            return
        L_0x0c37:
            java.lang.String r10 = r0.A06
            X.0wU r9 = r4.A09
            X.5Fa r6 = r4.A05
            X.5mQ r8 = new X.5mQ
            r8.<init>(r4)
            X.615 r7 = new X.615
            r7.<init>(r4)
            X.6TN r5 = new X.6TN
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A07 = r5
            r5.A02()
            return
        L_0x0c52:
            X.5Fa r1 = r6.A02     // Catch:{ IOException -> 0x0c60 }
            r0 = 602(0x25a, float:8.44E-43)
            r1.A02(r0)     // Catch:{ IOException -> 0x0c60 }
            return
        L_0x0c5a:
            java.lang.String r0 = "fpm/WifiDirectCreatorConnectionHandler/interrupted while starting discoverable service"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0c60 }
            return
        L_0x0c60:
            r1 = move-exception
            java.lang.String r0 = "fpm/WifiGroupCreatorP2pTransferService/failed to start receiver service"
            com.whatsapp.util.Log.i(r0, r1)
            X.5Fa r1 = r3.A04
            r0 = 601(0x259, float:8.42E-43)
            r1.A02(r0)
            r3.stopSelf()
            return
        L_0x0c71:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0c71 }
            throw r1
        L_0x0c74:
            r1 = 503(0x1f7, float:7.05E-43)
            java.lang.String r0 = "ExportFlowManager/Failed to register encryption metadata file."
            X.5R7 r9 = new X.5R7     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r9.<init>(r1, r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            goto L_0x0ca4
        L_0x0c7e:
            r1 = move-exception
            r12.endObject()     // Catch:{ all -> 0x0c89 }
            r12.flush()     // Catch:{ all -> 0x0c89 }
            r10.closeEntry()     // Catch:{ all -> 0x0c89 }
            goto L_0x0c8d
        L_0x0c89:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c8e }
        L_0x0c8d:
            throw r1     // Catch:{ all -> 0x0c8e }
        L_0x0c8e:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0c93 }
            goto L_0x0c97
        L_0x0c93:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
        L_0x0c97:
            throw r1     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
        L_0x0c98:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0c98 }
            goto L_0x0ca4
        L_0x0c9b:
            r1 = 502(0x1f6, float:7.03E-43)
            java.lang.String r0 = "ExportFlowManager/Failed to register master file."
            X.5R7 r9 = new X.5R7     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
            r9.<init>(r1, r0)     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
        L_0x0ca4:
            throw r9     // Catch:{ OperationCanceledException -> 0x0d1d, Exception -> 0x0ca5 }
        L_0x0ca5:
            r11 = move-exception
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/failed"
            com.whatsapp.util.Log.e(r0, r11)     // Catch:{ all -> 0x0d07 }
            boolean r0 = r11 instanceof X.AnonymousClass7h1     // Catch:{ all -> 0x0d07 }
            if (r0 == 0) goto L_0x0cd6
            r0 = r11
            X.7h1 r0 = (X.AnonymousClass7h1) r0     // Catch:{ all -> 0x0d07 }
            int r5 = r0.BEE()     // Catch:{ all -> 0x0d07 }
            r0 = 103(0x67, float:1.44E-43)
            if (r5 == r0) goto L_0x0cd4
            switch(r5) {
                case 501: goto L_0x0ccb;
                case 502: goto L_0x0cce;
                case 503: goto L_0x0cd1;
                default: goto L_0x0cbd;
            }     // Catch:{ all -> 0x0d07 }
        L_0x0cbd:
            X.0wN r4 = r7.A02     // Catch:{ all -> 0x0d07 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0d07 }
            java.lang.String r0 = "xpm-export-unexpected-migration-error-code"
            r4.A0E(r0, r1, r6)     // Catch:{ all -> 0x0d07 }
            r4 = 16
            goto L_0x0cd6
        L_0x0ccb:
            r4 = 9
            goto L_0x0cd6
        L_0x0cce:
            r4 = 8
            goto L_0x0cd6
        L_0x0cd1:
            r4 = 12
            goto L_0x0cd6
        L_0x0cd4:
            r4 = 13
        L_0x0cd6:
            boolean r0 = r11 instanceof X.C105015Cy     // Catch:{ all -> 0x0d07 }
            if (r0 == 0) goto L_0x0cee
            java.lang.String r10 = "EncryptionKeyException"
        L_0x0cdc:
            X.0wN r9 = r7.A02     // Catch:{ all -> 0x0d07 }
            java.lang.String r6 = "xpm-export-failed"
            java.lang.StringBuilder r1 = X.C90504aG.A0q(r5)     // Catch:{ all -> 0x0d07 }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r10, r1)     // Catch:{ all -> 0x0d07 }
            r9.A0D(r6, r0, r11)     // Catch:{ all -> 0x0d07 }
            goto L_0x0cf3
        L_0x0cee:
            java.lang.String r10 = X.C90484aE.A0k(r11)     // Catch:{ all -> 0x0d07 }
            goto L_0x0cdc
        L_0x0cf3:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r7)
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0d04 }
            r0.countDown()     // Catch:{ all -> 0x0d04 }
            r7.A01 = r2     // Catch:{ all -> 0x0d04 }
            r7.A00 = r2     // Catch:{ all -> 0x0d04 }
            monitor-exit(r7)     // Catch:{ all -> 0x0d04 }
            goto L_0x0d31
        L_0x0d04:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0d04 }
            throw r1
        L_0x0d07:
            r1 = move-exception
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r7)
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0d1a }
            r0.countDown()     // Catch:{ all -> 0x0d1a }
            r7.A01 = r2     // Catch:{ all -> 0x0d1a }
            r7.A00 = r2     // Catch:{ all -> 0x0d1a }
            monitor-exit(r7)     // Catch:{ all -> 0x0d1a }
            goto L_0x0dbd
        L_0x0d1a:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0d1a }
            throw r1
        L_0x0d1d:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r7)
            java.util.concurrent.CountDownLatch r0 = r7.A01     // Catch:{ all -> 0x0d9d }
            r0.countDown()     // Catch:{ all -> 0x0d9d }
            r7.A01 = r2     // Catch:{ all -> 0x0d9d }
            r7.A00 = r2     // Catch:{ all -> 0x0d9d }
            monitor-exit(r7)     // Catch:{ all -> 0x0d9d }
            A00(r3)
            goto L_0x0d94
        L_0x0d31:
            A00(r3)
            X.6FO r6 = r7.A09
            java.lang.String r2 = r6.A02()
            X.005 r0 = r7.A0I
            java.lang.Object r11 = r0.get()
            X.15v r11 = (X.C227915v) r11
            X.005 r0 = r7.A0J
            java.lang.Object r0 = r0.get()
            X.0wx r0 = (X.C20060wx) r0
            long r0 = r0.A02()
            X.58W r3 = new X.58W
            r3.<init>()
            r3.A09 = r2
            java.lang.Integer r2 = X.C36361kB.A0i()
            r3.A03 = r2
            java.lang.Integer r2 = X.C36371kC.A0o()
            r3.A05 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3.A04 = r2
            long r9 = X.AnonymousClass6WX.A00(r7)
            long r9 = X.C36391kE.A0B(r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r3.A07 = r2
            int r2 = r8.A00
            java.lang.Long r2 = X.C36441kJ.A0y(r2)
            r3.A08 = r2
            long r0 = r11.A00(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A06 = r0
            X.0yW r0 = r7.A05
            r0.Blv(r3)
            r6.A03()
            X.5FY r0 = r7.A0D
            r0.A00(r5)
        L_0x0d94:
            X.5FY r0 = r7.A0D
            r0.unregisterObserver(r8)
            r7.A07()
            return
        L_0x0d9d:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0d9d }
            throw r1
        L_0x0da0:
            java.lang.String r0 = "ExportFlowManager/prepareExportData() already running, cannot start another export."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0da7 }
            throw r0     // Catch:{ all -> 0x0da7 }
        L_0x0da7:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0da7 }
            throw r1
        L_0x0daa:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0dad:
            r1 = move-exception
            if (r5 == 0) goto L_0x0dc0
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x0dc0
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r5.release()
            throw r1
        L_0x0dbd:
            A00(r3)
        L_0x0dc0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502074j.run():void");
    }

    public C1502074j(C52172p0 r2, NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel) {
        this.A02 = 29;
        this.A00 = newsletterInfoMembersListViewModel;
        this.A01 = r2;
    }
}

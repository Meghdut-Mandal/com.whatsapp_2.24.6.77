package X;

import com.whatsapp.settings.Settings;

/* renamed from: X.3wZ  reason: invalid class name and case insensitive filesystem */
public class C81163wZ implements Runnable {
    public Object A00;
    public final int A01;

    public C81163wZ(Settings settings, int i) {
        this.A01 = i;
        if (17 - i != 0) {
            this.A00 = settings;
        } else {
            this.A00 = settings;
        }
    }

    public static void A00(C19770wU r1, Object obj, int i) {
        r1.Boy(new C81163wZ(obj, i));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:357|358) */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02eb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02ec, code lost:
        com.whatsapp.util.Log.i("msgstore/unsentstatusreadreceipts/IllegalStateException ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02f3, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r6.A03.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a7, code lost:
        r1.A0g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x052b, code lost:
        if (r0 == 0) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x060a, code lost:
        X.AnonymousClass3NA.A00(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x060d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00dd, code lost:
        if (r2 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06ea, code lost:
        r0 = new X.C81163wZ((java.lang.Object) r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06ef, code lost:
        r4.A0H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0750, code lost:
        r3.A0J(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0753, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("DownloadableWallpaperStorage/store : rename failed, from ");
        r1.append(r6);
        X.C36321k7.A1J(r2, " to ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x08d2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x08d3, code lost:
        r6.A02.A00(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x08d8, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:357:0x0825 */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x08d2 A[ExcHandler: SQLiteFullException (r1v78 'e' android.database.sqlite.SQLiteFullException A[CUSTOM_DECLARE]), Splitter:B:90:0x01f9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x006e;
                case 1: goto L_0x0080;
                case 2: goto L_0x009e;
                case 3: goto L_0x0433;
                case 4: goto L_0x0446;
                case 5: goto L_0x00ab;
                case 6: goto L_0x044e;
                case 7: goto L_0x0456;
                case 8: goto L_0x045e;
                case 9: goto L_0x046e;
                case 10: goto L_0x0104;
                case 11: goto L_0x0136;
                case 12: goto L_0x0476;
                case 13: goto L_0x0485;
                case 14: goto L_0x017d;
                case 15: goto L_0x0194;
                case 16: goto L_0x0491;
                case 17: goto L_0x04a1;
                case 18: goto L_0x04ac;
                case 19: goto L_0x04b7;
                case 20: goto L_0x04cc;
                case 21: goto L_0x0509;
                case 22: goto L_0x01d8;
                case 23: goto L_0x053a;
                case 24: goto L_0x054e;
                case 25: goto L_0x0561;
                case 26: goto L_0x05bb;
                case 27: goto L_0x05c3;
                case 28: goto L_0x05cc;
                case 29: goto L_0x05de;
                case 30: goto L_0x05f9;
                case 31: goto L_0x060e;
                case 32: goto L_0x061b;
                case 33: goto L_0x01e4;
                case 34: goto L_0x0628;
                case 35: goto L_0x0653;
                case 36: goto L_0x06f3;
                case 37: goto L_0x06ca;
                case 38: goto L_0x06f3;
                case 39: goto L_0x06fb;
                case 40: goto L_0x06fb;
                case 41: goto L_0x0707;
                case 42: goto L_0x0725;
                case 43: goto L_0x073a;
                case 44: goto L_0x0007;
                case 45: goto L_0x0007;
                case 46: goto L_0x03e1;
                case 47: goto L_0x075b;
                case 48: goto L_0x0877;
                case 49: goto L_0x0889;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsUserProxyActivity r0 = (com.whatsapp.settings.SettingsUserProxyActivity) r0
            com.whatsapp.settings.SettingsUserProxyViewModel r8 = r0.A09
            r0 = 1
            r8.A03 = r0
            X.3ce r3 = r8.A0G
            X.17Y r2 = r3.A01
            r1 = 5
            X.3wa r0 = new X.3wa
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0H(r0)
            r1 = 0
            r8.A02 = r1
            X.1BX r7 = r8.A0D
            r7.A04(r1)
            X.00s r0 = r8.A05
            r0.A0C(r1)
            X.1VS r0 = r8.A0E
            X.1BX r6 = r0.A00
            r6.A04(r1)
            r5 = 0
            r6.A03(r5)
            r6.A02(r5)
            r2 = 587(0x24b, float:8.23E-43)
            X.0wg r4 = r6.A01
            java.lang.String r3 = "user_proxy_setting_pref"
            android.content.SharedPreferences$Editor r1 = X.C36381kD.A0G(r4, r3)
            java.lang.String r0 = "proxy_media_port"
            X.C36341k9.A0v(r1, r0, r2)
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C36381kD.A0G(r4, r3)
            java.lang.String r0 = "proxy_use_tls"
            X.C36331k8.A0w(r1, r0, r2)
            r6.A05(r5)
            X.3Ch r0 = r8.A0C
            r0.A00(r5)
            r8.A0T()
            r8.A01 = r5
            r8.A0V(r5, r5)
            int r0 = r8.A00
            r7.A03(r0)
            int r0 = r8.A01
            r7.A02(r0)
            r8.A04 = r5
        L_0x006d:
            return
        L_0x006e:
            java.lang.Object r1 = r1.A00
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            com.whatsapp.search.SearchViewModel r0 = r1.A1d
            if (r0 == 0) goto L_0x006d
            android.content.Context r0 = r1.A1D()
            if (r0 == 0) goto L_0x006d
            com.whatsapp.search.SearchViewModel r1 = r1.A1d
            r0 = 3
            goto L_0x00a7
        L_0x0080:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchViewModel r0 = r0.A1d
            if (r0 == 0) goto L_0x006d
            java.lang.Boolean r2 = X.C36371kC.A0m()
            X.00s r1 = r0.A0j
            java.lang.Object r0 = r1.A04()
            boolean r0 = r2.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006d
            r1.A0C(r2)
            return
        L_0x009e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchViewModel r1 = r0.A1d
            if (r1 == 0) goto L_0x006d
            r0 = 5
        L_0x00a7:
            r1.A0g(r0)
            return
        L_0x00ab:
            java.lang.Object r5 = r1.A00
            X.688 r5 = (X.AnonymousClass688) r5
            X.00S r0 = r5.A0F
            java.lang.Object r4 = r0.invoke()
            X.6bf r4 = (X.C134826bf) r4
            if (r4 == 0) goto L_0x006d
            java.util.ArrayList r0 = r4.A01
            if (r0 == 0) goto L_0x006d
            boolean r0 = X.C36411kG.A1a(r0)
            if (r0 == 0) goto L_0x006d
            java.util.ArrayList r3 = r4.A01
            if (r3 == 0) goto L_0x00df
            int r0 = r4.A00
            java.lang.Object r2 = r3.get(r0)
            X.AnonymousClass00C.A08(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r4.A00
            int r1 = r0 + 1
            int r0 = r3.size()
            int r1 = r1 % r0
            r4.A00 = r1
            if (r2 != 0) goto L_0x00e1
        L_0x00df:
            java.lang.String r2 = ""
        L_0x00e1:
            java.lang.String r0 = r5.A09
            r5.A08 = r0
            r5.A09 = r2
            android.animation.ObjectAnimator r0 = r5.A03
            if (r0 == 0) goto L_0x00ee
            r0.start()
        L_0x00ee:
            android.animation.ObjectAnimator r0 = r5.A04
            if (r0 == 0) goto L_0x00f5
            r0.start()
        L_0x00f5:
            android.animation.ObjectAnimator r0 = r5.A02
            if (r0 == 0) goto L_0x00fc
            r0.start()
        L_0x00fc:
            android.animation.ObjectAnimator r0 = r5.A01
            if (r0 == 0) goto L_0x006d
            r0.start()
            return
        L_0x0104:
            java.lang.Object r3 = r1.A00
            X.8pD r3 = (X.C182518pD) r3
            com.whatsapp.search.views.itemviews.AudioPlayerView r2 = r3.A09
            java.lang.Object r0 = r2.getTag()
            if (r0 == 0) goto L_0x006d
            X.2bi r0 = r3.A09
            X.3Qa r1 = r0.A1J
            java.lang.Object r0 = r2.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            X.2bi r0 = r3.A09
            X.3Kh r0 = r0.A00
            java.lang.Object r0 = r0.A00
            X.3QP r0 = (X.AnonymousClass3QP) r0
            if (r0 == 0) goto L_0x006d
            X.00T r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x006d
            r2.A03(r0)
            return
        L_0x0136:
            java.lang.Object r2 = r1.A00
            com.whatsapp.search.views.itemviews.MessageGifVideoPlayer r2 = (com.whatsapp.search.views.itemviews.MessageGifVideoPlayer) r2
            X.8o2 r5 = r2.A05
            if (r5 == 0) goto L_0x006d
            X.3Xb r3 = new X.3Xb
            r3.<init>()
            X.3Qj r4 = r5.A01
            if (r4 == 0) goto L_0x016c
            java.io.File r0 = r4.A0I
            r1 = 1
            if (r0 == 0) goto L_0x0172
            boolean r0 = r0.exists()
            if (r0 != r1) goto L_0x0172
            java.io.File r0 = r4.A0I
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = r0.getAbsolutePath()
        L_0x015a:
            r3.A03 = r0
        L_0x015c:
            java.lang.String r0 = r5.A04
            r3.A04 = r0
            int r0 = r4.A0A
            r3.A02 = r0
            int r0 = r4.A06
            r3.A01 = r0
            int r0 = r4.A05
            r3.A00 = r0
        L_0x016c:
            r2.A04 = r3
            goto L_0x0891
        L_0x0170:
            r0 = 0
            goto L_0x015a
        L_0x0172:
            java.lang.String r0 = r5.A1b()
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = r5.A1b()
            goto L_0x015a
        L_0x017d:
            java.lang.Object r2 = r1.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r2 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r2
            X.16J r1 = r2.A01
            X.191 r0 = r2.A08
            r1.unregisterObserver(r0)
            android.app.job.JobParameters r1 = r2.A00
            if (r1 == 0) goto L_0x006d
            r0 = 0
            r2.jobFinished(r1, r0)
            r0 = 0
            r2.A00 = r0
            return
        L_0x0194:
            java.lang.Object r4 = r1.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r4 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r4
            X.12P r0 = r4.A02
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x01cc
            X.1YR r0 = r4.A03
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01cc
            android.os.Handler r3 = r4.A07
            r1 = 13
            X.3wZ r0 = new X.3wZ
            r0.<init>((java.lang.Object) r4, (int) r1)
            r3.post(r0)
            java.lang.String r0 = "Unsent messages found, scheduling timeout task"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Runnable r2 = r4.A0A
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.postDelayed(r2, r0)
            X.0y3 r0 = r4.A04
            r1 = 0
            r3 = 1
            r2 = 0
            r4 = 0
            r5 = 0
            r0.A0C(r1, r2, r3, r4, r5)
            return
        L_0x01cc:
            android.app.job.JobParameters r1 = r4.A00
            if (r1 == 0) goto L_0x006d
            r0 = 0
            r4.jobFinished(r1, r0)
            r0 = 0
            r4.A00 = r0
            return
        L_0x01d8:
            java.lang.Object r0 = r1.A00
            com.whatsapp.WaPreferenceFragment r0 = (com.whatsapp.WaPreferenceFragment) r0
            X.4vr r0 = r0.A00
            if (r0 == 0) goto L_0x006d
            r0.Bnv()
            return
        L_0x01e4:
            java.lang.Object r11 = r1.A00
            com.whatsapp.settings.SettingsPrivacy r11 = (com.whatsapp.settings.SettingsPrivacy) r11
            X.1DO r6 = r11.A0b
            r10 = 0
            X.14g r2 = new X.14g
            r2.<init>((boolean) r10)
            java.lang.String r0 = "msgstore/unsendreadreceipts"
            r2.A04(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.12P r0 = r6.A04     // Catch:{ IllegalStateException -> 0x025a, SQLiteDatabaseCorruptException -> 0x0261, SQLiteFullException -> 0x08d2 }
            X.1M0 r9 = r0.get()     // Catch:{ IllegalStateException -> 0x025a, SQLiteDatabaseCorruptException -> 0x0261, SQLiteFullException -> 0x08d2 }
            X.14e r5 = r9.A02     // Catch:{ all -> 0x0250 }
            java.lang.String r3 = X.C56282w2.A00     // Catch:{ all -> 0x0250 }
            r1 = 0
            java.lang.String r0 = "UNSENT_MESSAGE_READ_RECEIPTS_SQL"
            android.database.Cursor r12 = r5.A09(r3, r0, r1)     // Catch:{ all -> 0x0250 }
        L_0x020a:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0244 }
            if (r0 == 0) goto L_0x023d
            X.163 r0 = r6.A00     // Catch:{ all -> 0x0244 }
            X.11F r1 = r0.A0B(r12)     // Catch:{ all -> 0x0244 }
            if (r1 != 0) goto L_0x021e
            java.lang.String r0 = "msgstore/unsendreadreceipts/jid is null!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0244 }
            goto L_0x020a
        L_0x021e:
            X.1C5 r0 = r6.A06     // Catch:{ all -> 0x0244 }
            boolean r0 = r0.A04(r1)     // Catch:{ all -> 0x0244 }
            if (r0 == 0) goto L_0x020a
            X.1A1 r0 = r6.A07     // Catch:{ all -> 0x0244 }
            X.3T1 r5 = r0.A01(r12, r1)     // Catch:{ all -> 0x0244 }
            if (r5 == 0) goto L_0x020a
            long r0 = r5.A0I     // Catch:{ all -> 0x0244 }
            r7 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x020a
            r4.add(r5)     // Catch:{ all -> 0x0244 }
            goto L_0x020a
        L_0x023d:
            r12.close()     // Catch:{ all -> 0x0250 }
            r9.close()     // Catch:{ IllegalStateException -> 0x025a, SQLiteDatabaseCorruptException -> 0x0261, SQLiteFullException -> 0x08d2 }
            goto L_0x026a
        L_0x0244:
            r1 = move-exception
            if (r12 == 0) goto L_0x024f
            r12.close()     // Catch:{ all -> 0x024b }
            goto L_0x024f
        L_0x024b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0250 }
        L_0x024f:
            throw r1     // Catch:{ all -> 0x0250 }
        L_0x0250:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0255 }
            goto L_0x0259
        L_0x0255:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x025a, SQLiteDatabaseCorruptException -> 0x0261, SQLiteFullException -> 0x08d2 }
        L_0x0259:
            throw r1     // Catch:{ IllegalStateException -> 0x025a, SQLiteDatabaseCorruptException -> 0x0261, SQLiteFullException -> 0x08d2 }
        L_0x025a:
            r1 = move-exception
            java.lang.String r0 = "msgstore/unsendreadreceipts/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x026a
        L_0x0261:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r6.A03
            r0.A03()
        L_0x026a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "msgstore/unsendreadreceipts "
            X.C36341k9.A1N(r0, r1, r4)
            java.lang.String r5 = " | time spent:"
            X.C36321k7.A0t(r2, r5, r1)
            X.14g r3 = new X.14g
            r3.<init>((boolean) r10)
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts"
            r3.A04(r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.String[] r9 = X.C36441kJ.A1R()
            X.163 r0 = r6.A00
            X.8dw r12 = X.C177528dw.A00
            X.C36331k8.A19(r0, r12, r9, r10)
            java.lang.String r8 = X.C56342w8.A00
            java.lang.String r1 = "UNSENT_STATUS_READ_RECEIPTS_SQL"
            X.12P r0 = r6.A04     // Catch:{ IllegalStateException -> 0x02eb, SQLiteDatabaseCorruptException -> 0x02f2, SQLiteFullException -> 0x08d2 }
            X.1M0 r7 = r0.get()     // Catch:{ IllegalStateException -> 0x02eb, SQLiteDatabaseCorruptException -> 0x02f2, SQLiteFullException -> 0x08d2 }
            X.14e r0 = r7.A02     // Catch:{ all -> 0x02e1 }
            android.database.Cursor r9 = r0.A09(r8, r1, r9)     // Catch:{ all -> 0x02e1 }
        L_0x02a1:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x02d5 }
            if (r0 == 0) goto L_0x02ce
            X.1A1 r0 = r6.A07     // Catch:{ all -> 0x02d5 }
            X.3T1 r8 = r0.A01(r9, r12)     // Catch:{ all -> 0x02d5 }
            if (r8 == 0) goto L_0x02a1
            long r0 = r8.A0I     // Catch:{ all -> 0x02d5 }
            r14 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x02a1
            boolean r0 = r8 instanceof X.AnonymousClass2bI     // Catch:{ all -> 0x02d5 }
            if (r0 != 0) goto L_0x02a1
            X.1C5 r1 = r6.A06     // Catch:{ all -> 0x02d5 }
            X.11F r0 = r8.A0J()     // Catch:{ all -> 0x02d5 }
            boolean r0 = r1.A04(r0)     // Catch:{ all -> 0x02d5 }
            if (r0 == 0) goto L_0x02a1
            r2.add(r8)     // Catch:{ all -> 0x02d5 }
            goto L_0x02a1
        L_0x02ce:
            r9.close()     // Catch:{ all -> 0x02e1 }
            r7.close()     // Catch:{ IllegalStateException -> 0x02eb, SQLiteDatabaseCorruptException -> 0x02f2, SQLiteFullException -> 0x08d2 }
            goto L_0x02fb
        L_0x02d5:
            r1 = move-exception
            if (r9 == 0) goto L_0x02e0
            r9.close()     // Catch:{ all -> 0x02dc }
            goto L_0x02e0
        L_0x02dc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02e1 }
        L_0x02e0:
            throw r1     // Catch:{ all -> 0x02e1 }
        L_0x02e1:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x02e6 }
            goto L_0x02ea
        L_0x02e6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x02eb, SQLiteDatabaseCorruptException -> 0x02f2, SQLiteFullException -> 0x08d2 }
        L_0x02ea:
            throw r1     // Catch:{ IllegalStateException -> 0x02eb, SQLiteDatabaseCorruptException -> 0x02f2, SQLiteFullException -> 0x08d2 }
        L_0x02eb:
            r1 = move-exception
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x02fb
        L_0x02f2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r6.A03
            r0.A03()
        L_0x02fb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts "
            X.C36341k9.A1N(r0, r1, r2)
            X.C36321k7.A0t(r3, r5, r1)
            r4.addAll(r2)
            X.1DL r0 = r11.A0k
            r0.A0F(r4)
            X.1CM r0 = r11.A0j
            X.0yC r1 = r0.A00
            r0 = 361(0x169, float:5.06E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x006d
            X.34Z r9 = r11.A0Z
            java.util.HashSet r15 = X.C36441kJ.A16()
            X.12P r0 = r9.A01
            X.1M0 r14 = r0.get()
            X.14e r3 = r14.A02     // Catch:{ all -> 0x0956 }
            java.lang.String r2 = "SELECT * FROM played_self_receipt ORDER BY message_row_id DESC  LIMIT 4096"
            java.lang.String r1 = "GET_PLAYED_SELF_RECEIPT_SQL"
            r0 = 0
            android.database.Cursor r8 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x0956 }
            java.lang.String r1 = "message_row_id"
            int r7 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x094a }
            java.lang.String r1 = "to_jid_row_id"
            int r6 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x094a }
            java.lang.String r1 = "participant_jid_row_id"
            int r5 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x094a }
            java.lang.String r1 = "message_id"
            int r4 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x094a }
        L_0x034a:
            boolean r1 = r8.moveToNext()     // Catch:{ all -> 0x094a }
            if (r1 == 0) goto L_0x038c
            X.12j r13 = r9.A00     // Catch:{ all -> 0x094a }
            java.lang.Class<X.11F> r12 = X.AnonymousClass11F.class
            long r1 = r8.getLong(r6)     // Catch:{ all -> 0x094a }
            com.whatsapp.jid.Jid r3 = r13.A0C(r12, r1)     // Catch:{ all -> 0x094a }
            X.11F r3 = (X.AnonymousClass11F) r3     // Catch:{ all -> 0x094a }
            boolean r1 = r8.isNull(r5)     // Catch:{ all -> 0x094a }
            if (r1 != 0) goto L_0x036e
            long r0 = r8.getLong(r5)     // Catch:{ all -> 0x094a }
            com.whatsapp.jid.Jid r0 = r13.A0C(r12, r0)     // Catch:{ all -> 0x094a }
            X.11F r0 = (X.AnonymousClass11F) r0     // Catch:{ all -> 0x094a }
        L_0x036e:
            long r1 = r8.getLong(r7)     // Catch:{ all -> 0x094a }
            java.lang.String r16 = r8.getString(r4)     // Catch:{ all -> 0x094a }
            if (r3 == 0) goto L_0x038a
            r13 = 1
            java.lang.Long[] r12 = new java.lang.Long[r13]     // Catch:{ all -> 0x094a }
            X.AnonymousClass000.A1M(r12, r10, r1)     // Catch:{ all -> 0x094a }
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ all -> 0x094a }
            r2[r10] = r16     // Catch:{ all -> 0x094a }
            X.9Rs r1 = new X.9Rs     // Catch:{ all -> 0x094a }
            r1.<init>(r3, r0, r12, r2)     // Catch:{ all -> 0x094a }
            r15.add(r1)     // Catch:{ all -> 0x094a }
        L_0x038a:
            r0 = 0
            goto L_0x034a
        L_0x038c:
            r8.close()     // Catch:{ all -> 0x0956 }
            r14.close()
            java.util.HashSet r5 = X.AnonymousClass1CM.A01(r15)
            X.1C4 r4 = r11.A0l
            java.util.HashSet r0 = X.AnonymousClass1CM.A01(r5)
            java.util.Iterator r3 = r0.iterator()
        L_0x03a0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03b7
            java.lang.Object r2 = r3.next()
            X.9Rs r2 = (X.C194909Rs) r2
            X.164 r1 = r4.A00
            com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = new com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2
            r0.<init>(r2, r10)
            r1.A01(r0)
            goto L_0x03a0
        L_0x03b7:
            X.34Z r6 = r11.A0Z
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x006d
            java.util.HashSet r7 = X.C36441kJ.A16()
            java.util.Iterator r3 = r5.iterator()
        L_0x03c7:
            boolean r0 = r3.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x08d9
            java.lang.Object r0 = r3.next()
            X.9Rs r0 = (X.C194909Rs) r0
            java.lang.Long[] r2 = r0.A02
            int r1 = r2.length
        L_0x03d7:
            if (r5 >= r1) goto L_0x03c7
            r0 = r2[r5]
            r7.add(r0)
            int r5 = r5 + 1
            goto L_0x03d7
        L_0x03e1:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsUserProxyViewModel r5 = (com.whatsapp.settings.SettingsUserProxyViewModel) r5
            boolean r0 = r5.A0W()
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r5.A02
            boolean r0 = X.AnonymousClass3RW.A01(r0)
            if (r0 == 0) goto L_0x006d
            X.3ce r1 = r5.A0G
            r0 = 1
            X.1Hk r1 = r1.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04(r0)
            X.3QR r0 = r5.A0S()
            X.3NU r6 = r5.A0F
            java.lang.String r3 = r0.A03
            int r2 = r0.A01
            X.3mz r4 = new X.3mz
            r4.<init>(r0, r5)
            java.lang.String r7 = "mmg.whatsapp.net"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://"
            r1.append(r0)
            r1.append(r3)
            r0 = 58
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "/mms/HEALTHCHECK"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.net.URL r1 = new java.net.URL
            r1.<init>(r0)
            r0 = 6
            r5 = 0
            goto L_0x0960
        L_0x0433:
            java.lang.Object r0 = r1.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r1 = r0.A00
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            X.4ms r0 = r1.A1c
            if (r0 == 0) goto L_0x0442
            r0.A06()
        L_0x0442:
            X.C36421kH.A1E(r1)
            return
        L_0x0446:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchFragment.A07(r0)
            return
        L_0x044e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.views.TokenizedSearchInput r0 = (com.whatsapp.search.views.TokenizedSearchInput) r0
            r0.A0J()
            return
        L_0x0456:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.views.TokenizedSearchInput r0 = (com.whatsapp.search.views.TokenizedSearchInput) r0
            com.whatsapp.search.views.TokenizedSearchInput.A04(r0)
            return
        L_0x045e:
            java.lang.Object r3 = r1.A00
            com.whatsapp.search.views.TokenizedSearchInput r3 = (com.whatsapp.search.views.TokenizedSearchInput) r3
            com.whatsapp.text.FinalBackspaceAwareEntry r2 = r3.A0Y
            r1 = 6
            X.3wZ r0 = new X.3wZ
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
            return
        L_0x046e:
            java.lang.Object r0 = r1.A00
            X.8pE r0 = (X.C182528pE) r0
            X.C182528pE.setUpViewBasedOnMessageState$lambda$3(r0)
            return
        L_0x0476:
            java.lang.Object r0 = r1.A00
            com.whatsapp.service.RestoreChatConnectionWorker r0 = (com.whatsapp.service.RestoreChatConnectionWorker) r0
            X.4pl r1 = r0.A01
            X.4ov r0 = new X.4ov
            r0.<init>()
            r1.A06(r0)
            return
        L_0x0485:
            java.lang.Object r0 = r1.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r0 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r0
            X.16J r1 = r0.A01
            X.191 r0 = r0.A08
            r1.registerObserver(r0)
            return
        L_0x0491:
            java.lang.Object r0 = r1.A00
            X.4a5 r0 = (X.C90394a5) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r0 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r0
            X.16J r1 = r0.A01
            X.191 r0 = r0.A08
            r1.unregisterObserver(r0)
            return
        L_0x04a1:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.Settings r0 = (com.whatsapp.settings.Settings) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A05
            r0 = 0
            r1.A0h(r0)
            return
        L_0x04ac:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.Settings r0 = (com.whatsapp.settings.Settings) r0
            X.1YZ r1 = r0.A0b
            r0 = 0
            r1.A03(r0)
            return
        L_0x04b7:
            java.lang.Object r0 = r1.A00
            X.28W r0 = (X.AnonymousClass28W) r0
            com.whatsapp.settings.Settings r1 = r0.A00
            X.005 r0 = r1.A0v
            r0.get()
            X.1RJ r1 = r1.A0r
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A03(r0)
            return
        L_0x04cc:
            java.lang.Object r2 = r1.A00
            X.0y0 r2 = (X.C20690y0) r2
            X.3BP r0 = r2.A08()
            java.io.File r0 = r0.A01
            X.C20690y0.A05(r2, r0)
            X.3BP r0 = r2.A08()
            java.io.File r0 = r0.A00
            X.C20690y0.A05(r2, r0)
            X.3BP r0 = r2.A08()
            java.io.File r0 = r0.A0N
            X.C20690y0.A05(r2, r0)
            X.3BP r0 = r2.A08()
            java.io.File r0 = r0.A05
            X.C20690y0.A05(r2, r0)
            X.3BP r0 = r2.A08()
            java.io.File r1 = r0.A02
            r0 = 0
            X.C20690y0.A07(r1, r0)
            X.C20690y0.A05(r2, r1)
            java.io.File r0 = r2.A0H()
            X.C20690y0.A05(r2, r0)
            return
        L_0x0509:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsChatHistoryFragment r3 = (com.whatsapp.settings.SettingsChatHistoryFragment) r3
            X.4vr r0 = r3.A00
            if (r0 == 0) goto L_0x0514
            r0.Bnv()
        L_0x0514:
            java.lang.String r0 = "msgstore_archive_all_chats"
            androidx.preference.Preference r2 = r3.B7M(r0)
            X.1A6 r0 = r3.A05
            int r1 = r0.A03()
            X.1A6 r0 = r3.A05
            int r0 = r0.A02()
            if (r1 > 0) goto L_0x052d
            r1 = 2131895156(0x7f122374, float:1.9425137E38)
            if (r0 != 0) goto L_0x0530
        L_0x052d:
            r1 = 2131896325(0x7f122805, float:1.9427508E38)
        L_0x0530:
            android.content.Context r0 = r2.A05
            java.lang.String r0 = r0.getString(r1)
            r2.A0I(r0)
            return
        L_0x053a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsChatViewModel r0 = (com.whatsapp.settings.SettingsChatViewModel) r0
            X.00s r2 = r0.A00
            X.1Q9 r0 = r0.A01
            long r0 = r0.A0E()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C(r0)
            return
        L_0x054e:
            java.lang.Object r1 = r1.A00
            com.whatsapp.settings.SettingsCompanionLogoutDialog r1 = (com.whatsapp.settings.SettingsCompanionLogoutDialog) r1
            java.lang.String r0 = "SettingsCompanionLogoutDialog/onCreateDialog click deregister"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Ih r3 = r1.A03
            r2 = 1
            java.lang.String r1 = "user_initiated"
            r0 = 0
            r3.A01(r1, r2, r0)
            return
        L_0x0561:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            X.0ww r0 = r5.A0H
            com.whatsapp.Statistics$Data r10 = r0.A01()
            r7 = 2131894119(0x7f121f67, float:1.9423034E38)
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            X.0ts r8 = r5.A00
            long r2 = r10.A0E
            long r0 = r10.A0G
            long r2 = r2 + r0
            long r0 = r10.A0M
            long r2 = r2 + r0
            long r0 = r10.A0D
            long r2 = r2 + r0
            long r0 = r10.A0J
            long r2 = r2 + r0
            java.lang.String r0 = X.AnonymousClass3TF.A04(r8, r2)
            java.lang.String r0 = r8.A0G(r0)
            r8 = 0
            java.lang.String r6 = X.C36391kE.A0v(r5, r0, r6, r8, r7)
            r7 = 2131894118(0x7f121f66, float:1.9423032E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.0ts r9 = r5.A00
            long r2 = r10.A01
            long r0 = r10.A03
            long r2 = r2 + r0
            long r0 = r10.A0B
            long r2 = r2 + r0
            long r0 = r10.A00
            long r2 = r2 + r0
            long r0 = r10.A08
            long r2 = r2 + r0
            java.lang.String r0 = X.AnonymousClass3TF.A04(r9, r2)
            java.lang.String r0 = r9.A0G(r0)
            java.lang.String r1 = X.C36391kE.A0v(r5, r0, r4, r8, r7)
            X.0ts r0 = r5.A00
            java.lang.String r1 = X.AnonymousClass14B.A04(r0, r6, r1)
            android.widget.TextView r0 = r5.A06
            r0.setText(r1)
            return
        L_0x05bb:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsDataUsageViewModel r0 = (com.whatsapp.settings.SettingsDataUsageViewModel) r0
            r0.A0S()
            return
        L_0x05c3:
            java.lang.Object r1 = r1.A00
            com.whatsapp.settings.SettingsNetworkUsage r1 = (com.whatsapp.settings.SettingsNetworkUsage) r1
            r0 = 0
            com.whatsapp.settings.SettingsNetworkUsage.A07(r1, r0)
            return
        L_0x05cc:
            java.lang.Object r1 = r1.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.3NA r2 = new X.3NA
            r2.<init>(r1)
            r1 = 0
            r0 = 2131892115(0x7f121793, float:1.941897E38)
            goto L_0x060a
        L_0x05de:
            java.lang.Object r1 = r1.A00
            X.14u r1 = (X.C225314u) r1
            r4 = 0
            X.AnonymousClass00C.A0D(r1, r4)
            X.3NA r0 = new X.3NA
            r0.<init>(r1)
            r3 = 2131892118(0x7f121796, float:1.9418975E38)
            X.14u r2 = r0.A00
            r1 = 2131892116(0x7f121794, float:1.9418971E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r2.BO9(r0, r1, r3)
            return
        L_0x05f9:
            java.lang.Object r1 = r1.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.3NA r2 = new X.3NA
            r2.<init>(r1)
            r1 = 0
            r0 = 2131892119(0x7f121797, float:1.9418977E38)
        L_0x060a:
            X.AnonymousClass3NA.A00(r2, r1, r0)
            return
        L_0x060e:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 1
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x061b:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 1
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x0628:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            r0 = 1
            r3.A1A = r0
            java.util.Set r2 = r3.A18
            X.1NG r0 = r3.A0U
            java.util.Set r0 = r0.A0A()
            r2.addAll(r0)
            X.1Nm r0 = r3.A0h
            java.util.Set r1 = r0.A02
            monitor-enter(r1)
            java.util.List r0 = X.C007103b.A0Y(r1)     // Catch:{ all -> 0x0650 }
            monitor-exit(r1)
            r2.addAll(r0)
            r0 = 0
            r3.A1A = r0
            X.17Y r4 = r3.A05
            r1 = 36
            goto L_0x06ea
        L_0x0650:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0653:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            X.16E r0 = r3.A0a
            int r1 = r0.A05()
            if (r1 == 0) goto L_0x06a5
            r4 = 0
            r0 = 1
            if (r1 == r0) goto L_0x06a9
            r0 = 2
            if (r1 != r0) goto L_0x06c3
            X.16E r0 = r3.A0a
            java.util.ArrayList r0 = r0.A0B()
            int r2 = r0.size()
            if (r2 == 0) goto L_0x06a5
            X.0ts r1 = r3.A00
            r0 = 2131755339(0x7f10014b, float:1.9141554E38)
        L_0x0677:
            java.lang.String r2 = X.C36331k8.A0g(r1, r2, r4, r0)
        L_0x067b:
            X.1UM r1 = r3.A10
            X.1US r0 = X.AnonymousClass1US.STATUS_PRIVACY_ACTIVITY
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x069b
            X.1Ua r0 = r3.A11
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x069b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)
            r0 = 2131893958(0x7f121ec6, float:1.9422707E38)
            X.C36351kA.A14(r3, r1, r0)
            java.lang.String r2 = r1.toString()
        L_0x069b:
            X.17Y r4 = r3.A05
            r1 = 22
            X.74v r0 = new X.74v
            r0.<init>(r1, r2, r3)
            goto L_0x06ef
        L_0x06a5:
            r0 = 2131893214(0x7f121bde, float:1.9421198E38)
            goto L_0x06b8
        L_0x06a9:
            X.16E r0 = r3.A0a
            java.util.ArrayList r0 = r0.A0A()
            int r2 = r0.size()
            if (r2 != 0) goto L_0x06bd
            r0 = 2131891591(0x7f121587, float:1.9417906E38)
        L_0x06b8:
            java.lang.String r2 = r3.getString(r0)
            goto L_0x067b
        L_0x06bd:
            X.0ts r1 = r3.A00
            r0 = 2131755340(0x7f10014c, float:1.9141557E38)
            goto L_0x0677
        L_0x06c3:
            java.lang.String r0 = "unknown status distribution mode"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x06ca:
            java.lang.Object r0 = r1.A00
            X.4W3 r0 = (X.AnonymousClass4W3) r0
            java.lang.Object r3 = r0.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            r0 = 1
            r3.A1A = r0
            java.util.Set r1 = r3.A18
            r1.clear()
            X.1NG r0 = r3.A0U
            java.util.Set r0 = r0.A0A()
            r1.addAll(r0)
            r0 = 0
            r3.A1A = r0
            X.17Y r4 = r3.A05
            r1 = 38
        L_0x06ea:
            X.3wZ r0 = new X.3wZ
            r0.<init>((java.lang.Object) r3, (int) r1)
        L_0x06ef:
            r4.A0H(r0)
            return
        L_0x06f3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            com.whatsapp.settings.SettingsPrivacy.A0G(r0)
            return
        L_0x06fb:
            java.lang.Object r0 = r1.A00
            X.2sf r0 = (X.C54262sf) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            com.whatsapp.settings.SettingsPrivacy.A0H(r0)
            return
        L_0x0707:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r0 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r0
            X.196 r3 = r0.A03
            if (r3 == 0) goto L_0x071e
            boolean r0 = r0.A07
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            X.3I4 r2 = new X.3I4
            r2.<init>(r1, r0)
            X.1Ld r0 = X.C26691Ld.PRIVACY_SETTING_DISABLE_LINK_PREVIEWS
            goto L_0x0750
        L_0x071e:
            java.lang.String r0 = "syncManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0725:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            X.1fs r1 = r2.A04
            if (r1 == 0) goto L_0x0733
            java.lang.String r0 = "call-relaying"
            r1.A01(r2, r0)
            return
        L_0x0733:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x073a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r0 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r0
            X.196 r3 = r0.A03
            if (r3 == 0) goto L_0x0754
            boolean r0 = r0.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            X.3I4 r2 = new X.3I4
            r2.<init>(r1, r0)
            X.1Ld r0 = X.C26691Ld.PRIVACY_SETTING_RELAY_ALL_CALLS
        L_0x0750:
            r3.A0J(r2, r0)
            return
        L_0x0754:
            java.lang.String r0 = "syncManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x075b:
            java.lang.Object r4 = r1.A00
            X.3Nt r4 = (X.C64383Nt) r4
            X.3Qb r7 = r4.A02
            X.35Z r1 = r7.A01()
            if (r1 == 0) goto L_0x0773
            X.00s r3 = r4.A00
            r0 = 2
            X.35a r2 = new X.35a
            r2.<init>(r1, r0)
        L_0x076f:
            r3.A0C(r2)
            return
        L_0x0773:
            X.0wD r0 = r4.A01
            boolean r0 = r0.A09()
            X.00s r3 = r4.A00
            if (r0 != 0) goto L_0x0785
            r1 = 3
            r0 = 0
            X.35a r2 = new X.35a
            r2.<init>(r0, r1)
            goto L_0x076f
        L_0x0785:
            r2 = 1
            r1 = 0
            X.35a r0 = new X.35a
            r0.<init>(r1, r2)
            r3.A0C(r0)
            X.3Nu r5 = r4.A03     // Catch:{ IOException -> 0x0864 }
            java.util.HashMap r4 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x0864 }
            java.lang.String r1 = "category"
            java.lang.String r0 = "wallpaper"
            r4.put(r1, r0)     // Catch:{ IOException -> 0x0864 }
            X.0yC r2 = r5.A01     // Catch:{ IOException -> 0x0864 }
            X.1Be r1 = r5.A03     // Catch:{ IOException -> 0x0864 }
            java.lang.String r0 = "wa/static/downloadable"
            android.net.Uri$Builder r0 = X.AnonymousClass6XA.A00(r2, r1, r0)     // Catch:{ IOException -> 0x0864 }
            java.lang.String r1 = X.AnonymousClass6XA.A03(r0, r4)     // Catch:{ IOException -> 0x0864 }
            X.13E r0 = r5.A02     // Catch:{ IOException -> 0x0864 }
            X.6v1 r4 = X.C64393Nu.A00(r0, r5, r1)     // Catch:{ IOException -> 0x0864 }
            if (r4 != 0) goto L_0x07be
            r2 = 4
            r1 = 0
            X.35a r0 = new X.35a     // Catch:{ all -> 0x0858 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0858 }
            r3.A0C(r0)     // Catch:{ all -> 0x0858 }
            goto L_0x086e
        L_0x07be:
            r0 = 0
            X.0ww r2 = r7.A00     // Catch:{ IOException -> 0x0844 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0844 }
            java.lang.Integer r0 = X.C36431kI.A13()     // Catch:{ IOException -> 0x0844 }
            X.5RE r0 = r4.B8D(r2, r1, r0)     // Catch:{ IOException -> 0x0844 }
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x0844 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0844 }
            X.0wG r2 = r7.A01     // Catch:{ all -> 0x083a }
            android.content.Context r0 = r2.A00     // Catch:{ all -> 0x083a }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ all -> 0x083a }
            java.lang.String r0 = "downloadable/wallpaper_tmp"
            java.io.File r6 = X.C36441kJ.A0w(r1, r0)     // Catch:{ all -> 0x083a }
            boolean r0 = X.AnonymousClass6YY.A0R(r6)     // Catch:{ all -> 0x083a }
            if (r0 != 0) goto L_0x07ec
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare temporary cache subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x083a }
            goto L_0x0836
        L_0x07ec:
            X.2TC r0 = new X.2TC     // Catch:{ all -> 0x083a }
            r0.<init>(r6)     // Catch:{ all -> 0x083a }
            boolean r0 = r0.A01(r5)     // Catch:{ all -> 0x083a }
            if (r0 == 0) goto L_0x0836
            android.content.Context r0 = r2.A00     // Catch:{ all -> 0x083a }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ all -> 0x083a }
            java.lang.String r0 = "downloadable/wallpaper"
            java.io.File r2 = X.C36441kJ.A0w(r1, r0)     // Catch:{ all -> 0x083a }
            boolean r0 = X.AnonymousClass6YY.A0R(r2)     // Catch:{ all -> 0x083a }
            if (r0 != 0) goto L_0x080f
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare wallpaper subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x083a }
            goto L_0x0836
        L_0x080f:
            X.1Aw r0 = r7.A02     // Catch:{ IOException -> 0x0825 }
            X.AnonymousClass6YY.A0C(r0, r6, r2)     // Catch:{ IOException -> 0x0825 }
            r5.close()     // Catch:{ IOException -> 0x0844 }
            X.35Z r1 = r7.A01()     // Catch:{ all -> 0x0858 }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x0858 }
            r0 = 2
            X.35a r2 = new X.35a     // Catch:{ all -> 0x0858 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0858 }
            goto L_0x0851
        L_0x0825:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x083a }
            java.lang.String r0 = "DownloadableWallpaperStorage/store : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x083a }
            r1.append(r6)     // Catch:{ all -> 0x083a }
            java.lang.String r0 = " to "
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ all -> 0x083a }
        L_0x0836:
            r5.close()     // Catch:{ IOException -> 0x0844 }
            goto L_0x084a
        L_0x083a:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x083f }
            goto L_0x0843
        L_0x083f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0844 }
        L_0x0843:
            throw r1     // Catch:{ IOException -> 0x0844 }
        L_0x0844:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0858 }
        L_0x084a:
            r1 = 5
            r0 = 0
            X.35a r2 = new X.35a     // Catch:{ all -> 0x0858 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0858 }
        L_0x0851:
            r3.A0C(r2)     // Catch:{ all -> 0x0858 }
            r4.close()     // Catch:{ IOException -> 0x0864 }
            goto L_0x086e
        L_0x0858:
            r1 = move-exception
            if (r4 == 0) goto L_0x0863
            r4.close()     // Catch:{ all -> 0x085f }
            goto L_0x0863
        L_0x085f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0864 }
        L_0x0863:
            throw r1     // Catch:{ IOException -> 0x0864 }
        L_0x0864:
            r2 = 4
            r1 = 0
            X.35a r0 = new X.35a     // Catch:{ all -> 0x0872 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0872 }
            r3.A0C(r0)     // Catch:{ all -> 0x0872 }
        L_0x086e:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x0872:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0877:
            java.lang.Object r2 = r1.A00
            X.2e6 r2 = (X.C47232e6) r2
            X.00s r1 = r2.A00
            r0 = 1
            X.C36341k9.A17(r1, r0)
            X.C47232e6.A05(r2)
            r0 = 2
            X.C36341k9.A17(r1, r0)
            return
        L_0x0889:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r0 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r0
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment.A00(r0)
            return
        L_0x0891:
            android.media.MediaPlayer r0 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            if (r0 != 0) goto L_0x08bd
            android.media.MediaPlayer r0 = new android.media.MediaPlayer     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            r0.<init>()     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            r2.A02 = r0     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
        L_0x089c:
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            r0 = 1
            r1.setLooping(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            java.lang.String r0 = r3.A03     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            r1.setDataSource(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            android.media.MediaPlayer$OnPreparedListener r0 = r2.A01     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            r1.setOnPreparedListener(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            android.media.MediaPlayer$OnErrorListener r0 = r2.A00     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            r1.setOnErrorListener(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            android.media.MediaPlayer r0 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            r0.prepareAsync()     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            goto L_0x08c1
        L_0x08bd:
            r0.reset()     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x08c2 }
            goto L_0x089c
        L_0x08c1:
            return
        L_0x08c2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageGifVideoPlayer/"
            r1.append(r0)
            java.lang.String r0 = "prepareMediaPlayer failed to prepare mediaplayer"
            X.C36351kA.A1Q(r0, r1, r2)
            return
        L_0x08d2:
            r1 = move-exception
            X.12T r0 = r6.A02
            r0.A00(r10)
            throw r1
        L_0x08d9:
            int r0 = r7.size()
            java.lang.String[] r4 = new java.lang.String[r0]
            java.util.Iterator r3 = r7.iterator()
        L_0x08e3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x08f4
            long r1 = X.C36391kE.A0D(r3)
            int r0 = r5 + 1
            X.C36401kF.A1T(r4, r5, r1)
            r5 = r0
            goto L_0x08e3
        L_0x08f4:
            r0 = 975(0x3cf, float:1.366E-42)
            X.72Z r1 = new X.72Z
            r1.<init>(r4, r0)
            X.12P r0 = r6.A01
            X.1M0 r7 = r0.A05()
            X.71s r6 = r7.B1k()     // Catch:{ all -> 0x0945 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x093b }
        L_0x0909:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x093b }
            if (r0 == 0) goto L_0x0931
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x093b }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x093b }
            X.14e r3 = r7.A02     // Catch:{ all -> 0x093b }
            java.lang.String r2 = "played_self_receipt"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x093b }
            java.lang.String r0 = "message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x093b }
            int r0 = r4.length     // Catch:{ all -> 0x093b }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r0)     // Catch:{ all -> 0x093b }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x093b }
            java.lang.String r0 = "clearPlayedSelfReceiptTable"
            r3.A03(r2, r1, r0, r4)     // Catch:{ all -> 0x093b }
            goto L_0x0909
        L_0x0931:
            r6.A00()     // Catch:{ all -> 0x093b }
            r6.close()     // Catch:{ all -> 0x0945 }
            r7.close()
            return
        L_0x093b:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0940 }
            goto L_0x0944
        L_0x0940:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0945 }
        L_0x0944:
            throw r1     // Catch:{ all -> 0x0945 }
        L_0x0945:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x095b }
            throw r1
        L_0x094a:
            r1 = move-exception
            if (r8 == 0) goto L_0x0955
            r8.close()     // Catch:{ all -> 0x0951 }
            goto L_0x0955
        L_0x0951:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0956 }
        L_0x0955:
            throw r1     // Catch:{ all -> 0x0956 }
        L_0x0956:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x095b }
            throw r1
        L_0x095b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0960:
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x09c3 }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ all -> 0x09c3 }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ all -> 0x09c3 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x09c3 }
            X.0yd r1 = r6.A00     // Catch:{ all -> 0x09c3 }
            X.8qR r0 = r1.A02()     // Catch:{ all -> 0x09c3 }
            r3.setSSLSocketFactory(r0)     // Catch:{ all -> 0x09c3 }
            r1.A02()     // Catch:{ all -> 0x09c3 }
            java.lang.String r0 = "POST"
            r3.setRequestMethod(r0)     // Catch:{ all -> 0x09c3 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)     // Catch:{ all -> 0x09c3 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)     // Catch:{ all -> 0x09c3 }
            r2 = 1
            r3.setDoOutput(r2)     // Catch:{ all -> 0x09c3 }
            java.lang.String r0 = "Host"
            r3.setRequestProperty(r0, r7)     // Catch:{ all -> 0x09c3 }
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ all -> 0x09c3 }
            X.77d r0 = new X.77d     // Catch:{ all -> 0x09c3 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x09c3 }
            r3.setHostnameVerifier(r0)     // Catch:{ all -> 0x09c3 }
            r3.connect()     // Catch:{ all -> 0x09c3 }
            int r1 = r3.getResponseCode()     // Catch:{ all -> 0x09c3 }
            r3.getHeaderFields()     // Catch:{ all -> 0x09c3 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x09b4
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x09c3 }
            X.AnonymousClass3NU.A00(r6, r0, r2)     // Catch:{ all -> 0x09c3 }
            return
        L_0x09b4:
            java.lang.Long r0 = X.C36441kJ.A0y(r1)     // Catch:{ all -> 0x09c3 }
            X.AnonymousClass3NU.A00(r6, r0, r5)     // Catch:{ all -> 0x09c3 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x09c3 }
            r4.BWo(r0)     // Catch:{ all -> 0x09c3 }
            return
        L_0x09c3:
            r3 = move-exception
            r2 = 0
            X.AnonymousClass3NU.A00(r6, r2, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaHealthChecker/check exception occurred: "
            X.C36321k7.A1J(r3, r0, r1)
            r4.BWo(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81163wZ.run():void");
    }

    public C81163wZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}

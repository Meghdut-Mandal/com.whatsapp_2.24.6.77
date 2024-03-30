package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.6Lu  reason: invalid class name and case insensitive filesystem */
public final class C130626Lu {
    public Map A00;
    public final C19700wN A01;
    public final C132716Uy A02;
    public final AnonymousClass7fU A03;
    public final C33101ei A04;
    public final AnonymousClass6FS A05;
    public final C33131el A06;
    public final C133226Xi A07;
    public final AnonymousClass179 A08;
    public final C20830yE A09;
    public final C19420v0 A0A;
    public final AnonymousClass1Q9 A0B;
    public final C220612s A0C;
    public final C21520zN A0D;
    public final C1041458l A0E;
    public final AnonymousClass3T0 A0F;
    public final String A0G;
    public final Context A0H;
    public final C24461Cn A0I;
    public final C19970wo A0J;
    public final String A0K;

    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3 A[SYNTHETIC, Splitter:B:46:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C132346Te r11, X.C130626Lu r12, java.util.Map r13) {
        /*
            X.0v0 r2 = r12.A0A
            java.lang.String r3 = r12.A0K
            r2.A1R(r3)
            long r0 = r11.A05
            r2.A1e(r3, r0)
            long r0 = r11.A04
            r2.A1f(r3, r0)
            java.lang.String r0 = "mediaSize"
            long r0 = X.C132346Te.A00(r11, r0)
            r2.A1d(r3, r0)
            java.lang.String r0 = "videoSize"
            long r0 = X.C132346Te.A00(r11, r0)
            r2.A1g(r3, r0)
            org.json.JSONObject r4 = r11.A0B
            r1 = 0
            if (r4 == 0) goto L_0x002e
            java.lang.String r0 = "encryptedBackupEnabled"
            boolean r1 = r4.optBoolean(r0, r1)
        L_0x002e:
            r2.A1o(r3, r1)
            java.lang.String r1 = "backupFrequency"
            r3 = -1
            if (r4 == 0) goto L_0x00d0
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x00c4
            int r0 = r4.optInt(r1, r3)
        L_0x0040:
            if (r0 < 0) goto L_0x00d0
            boolean r10 = r2.A2R(r0)
        L_0x0046:
            java.lang.String r1 = "backupNetworkSettings"
            if (r4 == 0) goto L_0x005d
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x00b9
            int r1 = r4.optInt(r1, r3)
        L_0x0054:
            if (r1 < 0) goto L_0x005d
            X.1ei r0 = r12.A04
            boolean r0 = r0.A0F(r1)
            r10 = r10 & r0
        L_0x005d:
            java.lang.String r1 = "includeVideosInBackup"
            r3 = 1
            if (r4 == 0) goto L_0x00b7
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r4.optBoolean(r1, r3)
        L_0x006c:
            r2.A1u(r0)
            X.1Cn r7 = r12.A0I
            java.lang.String r5 = "_new_user"
            r1 = 0
            if (r4 == 0) goto L_0x00aa
            boolean r0 = r4.has(r5)
            if (r0 == 0) goto L_0x009f
            boolean r0 = r4.optBoolean(r5, r1)
        L_0x0080:
            r7.A07(r0)
            java.lang.String r6 = "bg_gpb_eligible_timestamp"
            long r0 = X.C132346Te.A00(r11, r6)
            X.00T r5 = r7.A01
            android.content.SharedPreferences$Editor r5 = X.C36351kA.A0A(r5)
            X.C36341k9.A0w(r5, r6, r0)
            java.lang.String r6 = "gdrive-api-v2/backup/get-local-settings/failed to parse"
            java.lang.String r5 = "localSettings"
            if (r4 == 0) goto L_0x00d8
            boolean r0 = r4.has(r5)
            if (r0 == 0) goto L_0x00d8
            goto L_0x00d3
        L_0x009f:
            org.json.JSONObject r0 = X.C132346Te.A01(r11)
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.optBoolean(r5, r1)
            goto L_0x0080
        L_0x00aa:
            r0 = 0
            goto L_0x0080
        L_0x00ac:
            org.json.JSONObject r0 = X.C132346Te.A01(r11)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r0.optBoolean(r1, r3)
            goto L_0x006c
        L_0x00b7:
            r0 = 1
            goto L_0x006c
        L_0x00b9:
            org.json.JSONObject r0 = X.C132346Te.A01(r11)
            if (r0 == 0) goto L_0x005d
            int r1 = r0.optInt(r1, r3)
            goto L_0x0054
        L_0x00c4:
            org.json.JSONObject r0 = X.C132346Te.A01(r11)
            if (r0 == 0) goto L_0x00d0
            int r0 = r0.optInt(r1, r3)
            goto L_0x0040
        L_0x00d0:
            r10 = 1
            goto L_0x0046
        L_0x00d3:
            org.json.JSONObject r0 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x00e9 }
            goto L_0x00f9
        L_0x00d8:
            org.json.JSONObject r1 = X.C132346Te.A01(r11)
            if (r1 == 0) goto L_0x00ee
            boolean r0 = r1.has(r5)
            if (r0 == 0) goto L_0x00ee
            org.json.JSONObject r0 = r1.getJSONObject(r5)     // Catch:{ JSONException -> 0x00e9 }
            goto L_0x00f9
        L_0x00e9:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            goto L_0x00f3
        L_0x00ee:
            java.lang.String r0 = "gdrive-api-v2/backup/get-local-settings/localSettings-is-missing"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00f3:
            java.lang.String r0 = "restore>RestoreAction/restore-user-settings/local settings are empty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00fe
        L_0x00f9:
            if (r0 == 0) goto L_0x00f3
            r2.A1p(r0)
        L_0x00fe:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            X.179 r4 = r12.A08
            java.io.File r0 = r4.A02()
            java.lang.String r5 = X.C34191gb.A05(r4, r0)
            if (r5 == 0) goto L_0x0138
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r13)
        L_0x0112:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0138
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r2)
            java.lang.String r0 = X.C90494aF.A0f(r1)
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = X.C90494aF.A0f(r1)
            java.lang.String r0 = X.C34191gb.A06(r4, r0)
            if (r0 == 0) goto L_0x0112
            java.io.File r0 = X.C90524aI.A0S(r0)
            r6.add(r0)
            goto L_0x0112
        L_0x0138:
            java.util.Iterator r9 = r6.iterator()
            r8 = 1
        L_0x013d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01a8
            java.io.File r5 = X.C90504aG.A0a(r9)
            java.lang.String r0 = X.C34191gb.A05(r4, r5)
            if (r0 != 0) goto L_0x0156
            java.lang.String r0 = "restore>RestoreAction/restore-backups-dir/skipping/null-title"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.getAbsolutePath()
            goto L_0x013d
        L_0x0156:
            java.lang.Object r7 = r13.get(r0)
            X.6Pk r7 = (X.C131526Pk) r7
            if (r7 != 0) goto L_0x0164
            java.lang.String r0 = "restore>RestoreAction/restore-backups-dir/skipping/google-drive-file-not-found"
        L_0x0160:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x013d
        L_0x0164:
            X.6Cl r0 = r7.A02
            if (r0 == 0) goto L_0x017d
            java.lang.String r6 = r0.A03
        L_0x016a:
            X.0yE r2 = r12.A09
            long r0 = r5.length()
            java.lang.String r0 = X.C34191gb.A04(r4, r2, r5, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = "restore>RestoreAction/restore-backups-dir/skipping/already-downloaded"
            goto L_0x0160
        L_0x017d:
            java.lang.String r6 = r7.A03
            goto L_0x016a
        L_0x0180:
            X.1el r2 = r12.A06     // Catch:{ 4yT -> 0x01a1 }
            X.7fU r1 = r12.A03     // Catch:{ 4yT -> 0x01a1 }
            X.6Xi r0 = r12.A07     // Catch:{ 4yT -> 0x01a1 }
            boolean r0 = X.AnonymousClass6YN.A0B(r1, r2, r0, r7, r5)     // Catch:{ 4yT -> 0x01a1 }
            r8 = r8 & r0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 4yT -> 0x01a1 }
            java.lang.String r0 = "restore>RestoreAction/restore-backups-dir/success "
            X.C90464aC.A1A(r5, r0, r2)     // Catch:{ 4yT -> 0x01a1 }
            java.lang.String r0 = " size: "
            r2.append(r0)     // Catch:{ 4yT -> 0x01a1 }
            long r0 = r5.length()     // Catch:{ 4yT -> 0x01a1 }
            X.C36351kA.A1S(r2, r0)     // Catch:{ 4yT -> 0x01a1 }
            goto L_0x013d
        L_0x01a1:
            r1 = move-exception
            java.lang.String r0 = "restore>RestoreAction/restore-backups-dir/file-not-found"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x013d
        L_0x01a8:
            X.3T0 r0 = r12.A0F
            r0.A00 = r3
            r8 = r8 & r10
            if (r8 != 0) goto L_0x01b4
            java.lang.String r0 = "restore>RestoreAction/restore-user-settings/unable to save user settings from google drive to shared prefs"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130626Lu.A00(X.6Te, X.6Lu, java.util.Map):void");
    }

    public C130626Lu(Context context, C19700wN r3, C24461Cn r4, C132716Uy r5, AnonymousClass7fU r6, C33101ei r7, AnonymousClass6FS r8, C33131el r9, C133226Xi r10, AnonymousClass179 r11, C19970wo r12, C20830yE r13, C19420v0 r14, AnonymousClass1Q9 r15, C220612s r16, C21520zN r17, C1041458l r18, AnonymousClass3T0 r19, String str) {
        this.A0G = str;
        this.A0H = context;
        this.A0J = r12;
        this.A01 = r3;
        this.A08 = r11;
        this.A0E = r18;
        this.A06 = r9;
        this.A0D = r17;
        this.A07 = r10;
        this.A0F = r19;
        this.A0B = r15;
        this.A02 = r5;
        this.A05 = r8;
        this.A09 = r13;
        this.A0A = r14;
        this.A03 = r6;
        this.A0I = r4;
        this.A0C = r16;
        this.A04 = r7;
        this.A0K = r10.A08;
    }
}

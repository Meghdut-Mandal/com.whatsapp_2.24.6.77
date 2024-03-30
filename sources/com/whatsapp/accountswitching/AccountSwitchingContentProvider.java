package com.whatsapp.accountswitching;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass12P;
import X.AnonymousClass14B;
import X.AnonymousClass19J;
import X.AnonymousClass1C4;
import X.AnonymousClass1RU;
import X.AnonymousClass1Z0;
import X.AnonymousClass3KU;
import X.AnonymousClass3LV;
import X.AnonymousClass6C2;
import X.C007103b;
import X.C133346Xy;
import X.C19380ur;
import X.C19420v0;
import X.C19650wI;
import X.C19770wU;
import X.C19880wf;
import X.C20060wx;
import X.C20720y3;
import X.C229616q;
import X.C229716r;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccountSwitchingContentProvider extends C19380ur {
    public AnonymousClass19J A00;
    public C19420v0 A01;
    public C20060wx A02;
    public AnonymousClass12P A03;
    public C20720y3 A04;
    public AnonymousClass1C4 A05;
    public C19880wf A06;
    public C19650wI A07;
    public C19770wU A08;
    public C229716r A09;
    public AnonymousClass005 A0A;
    public AnonymousClass005 A0B;
    public AnonymousClass005 A0C;
    public AnonymousClass005 A0D;
    public AnonymousClass005 A0E;
    public AnonymousClass005 A0F;
    public AnonymousClass005 A0G;
    public AnonymousClass005 A0H;
    public AnonymousClass005 A0I;
    public AnonymousClass005 A0J;
    public AnonymousClass005 A0K;
    public AnonymousClass005 A0L;
    public AnonymousClass005 A0M;
    public AnonymousClass005 A0N;
    public AnonymousClass005 A0O;
    public AnonymousClass005 A0P;

    private final String A00() {
        String obj;
        Log.i("AccountSwitchingContentProvider/maybeCorrectMakeActiveLid");
        String str = (String) C007103b.A0M(((C133346Xy) A0B().get()).A0A());
        if (str == null) {
            obj = "AccountSwitchingFileManager/getMakeActiveLidFromStagedDir/null";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("AccountSwitchingFileManager/getMakeActiveLidFromStagedDir/");
            sb.append(AnonymousClass3LV.A01(str));
            obj = sb.toString();
        }
        Log.i(obj);
        if (str == null || str.length() == 0) {
            throw new IllegalStateException("AccountSwitchingContentProvider/maybeCorrectMakeActiveLid/correctMakeActiveLid isNullOrEmpty");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AccountSwitchingContentProvider/maybeCorrectMakeActiveLid/correctMakeActiveLid ");
        sb2.append(AnonymousClass3LV.A01(str));
        Log.i(sb2.toString());
        return str;
    }

    public static final void A01(AnonymousClass1RU r8, AnonymousClass1Z0 r9, C133346Xy r10, C19420v0 r11, C20060wx r12) {
        String str;
        String str2;
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r9, 4);
        AnonymousClass00C.A0D(r10, 5);
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitchingContentProvider/healthState");
        sb.append("/current account lid: ");
        AnonymousClass3KU A032 = r8.A03();
        if (A032 != null) {
            str = AnonymousClass3LV.A01(A032.A08);
        } else {
            str = null;
        }
        sb.append(str);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AccountSwitchingContentProvider/healthState");
        sb2.append("/numberOfInactiveAccounts: ");
        sb2.append(r11.A0I());
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("AccountSwitchingContentProvider/healthState");
        sb3.append("/available internal phone storage: ");
        sb3.append(r12.A02() / SearchActionVerificationClientService.MS_TO_NS);
        sb3.append(" MB");
        Log.i(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("AccountSwitchingContentProvider/healthState");
        sb4.append("/stagingDirLogString/");
        sb4.append(AnonymousClass3LV.A00(r10));
        Log.i(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("AccountSwitchingContentProvider/healthState");
        sb5.append("/accounts file content: ");
        synchronized (r9) {
            AnonymousClass6C2 A002 = AnonymousClass1Z0.A00(r9);
            try {
                JSONArray jSONArray = new JSONArray();
                for (AnonymousClass3KU r7 : A002.A01) {
                    AnonymousClass00C.A0D(r7, 0);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lid", AnonymousClass3LV.A01(r7.A08));
                    String str3 = r7.A07;
                    String A0B2 = AnonymousClass14B.A0B(str3, 4);
                    if (A0B2 != null) {
                        str3 = A0B2;
                    }
                    jSONObject.put("jid", str3);
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r7.A09);
                    jSONObject.put("badge_count", r7.A00);
                    jSONObject.put("is_logged_in", r7.A03);
                    jSONObject.put("unread_message_count", r7.A01);
                    jSONObject.put("last_active_timestamp_ms", r7.A05);
                    jSONObject.put("last_buzzed_timestamp_ms", r7.A06);
                    jSONObject.put("account_added_timestamp_ms", r7.A04);
                    String obj = jSONObject.toString();
                    AnonymousClass00C.A08(obj);
                    jSONArray.put(obj);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("inactiveAccounts", jSONArray);
                String str4 = A002.A00;
                if (!(str4 == null || str4.length() == 0)) {
                    jSONObject2.put("paymentsOnboardedLid", AnonymousClass3LV.A01(str4));
                }
                jSONObject2.put("shownMeTabMenuItemToolTip", A002.A03);
                jSONObject2.put("isCompanionModeEnabled", A002.A02);
                str2 = jSONObject2.toString();
                AnonymousClass00C.A08(str2);
            } catch (JSONException e) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("AccountSwitchingDataRepo/readDataForLogging/JSONException : ");
                sb6.append(e);
                Log.e(sb6.toString());
                str2 = "";
            }
        }
        sb5.append(str2);
        Log.i(sb5.toString());
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b2, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b5, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(X.C159957kE r9, java.lang.String r10, X.AnonymousClass00S r11) {
        /*
            r8 = this;
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing preCheckpointOps..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.Bm0()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed preCheckpointOps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.005 r0 = r8.A0C()
            java.lang.Object r0 = r0.get()
            X.6Nr r0 = (X.C131086Nr) r0
            X.0wG r0 = r0.A00
            android.content.Context r2 = r0.A00
            java.lang.String r1 = "account_switching"
            r0 = 0
            java.io.File r1 = r2.getDir(r1, r0)
            java.lang.String r0 = "checkpoint"
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x01b6
            boolean r2 = r3.createNewFile()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/createCheckpointFile = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "rws"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            r2.<init>(r3, r0)
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/checkpoint file created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01af }
            X.005 r0 = r8.A0A()     // Catch:{ all -> 0x01af }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x01af }
            X.1Z0 r5 = (X.AnonymousClass1Z0) r5     // Catch:{ all -> 0x01af }
            monitor-enter(r5)     // Catch:{ all -> 0x01af }
            r4 = 0
            java.lang.String r0 = "accounts"
            java.io.File r7 = r5.A04(r0)     // Catch:{ SecurityException -> 0x00b5 }
            boolean r0 = r7.exists()     // Catch:{ SecurityException -> 0x00b5 }
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/accounts file does not exist, attempting to create an empty one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x00b5 }
            X.09w r3 = X.C023409w.A00     // Catch:{ SecurityException -> 0x00b5 }
            r1 = 0
            X.6C2 r0 = new X.6C2     // Catch:{ SecurityException -> 0x00b5 }
            r0.<init>(r1, r3, r4, r4)     // Catch:{ SecurityException -> 0x00b5 }
            boolean r0 = X.AnonymousClass1Z0.A01(r0, r5)     // Catch:{ SecurityException -> 0x00b5 }
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/unable to create accounts file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x00b5 }
            goto L_0x00bb
        L_0x0084:
            java.lang.String r0 = "accounts.bak"
            java.io.File r6 = r5.A04(r0)     // Catch:{ SecurityException -> 0x00b5 }
            boolean r0 = r6.exists()     // Catch:{ SecurityException -> 0x00b5 }
            if (r0 == 0) goto L_0x00a8
            boolean r3 = r6.delete()     // Catch:{ SecurityException -> 0x00b5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00b5 }
            r1.<init>()     // Catch:{ SecurityException -> 0x00b5 }
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/deleted previous backup file: "
            r1.append(r0)     // Catch:{ SecurityException -> 0x00b5 }
            r1.append(r3)     // Catch:{ SecurityException -> 0x00b5 }
            java.lang.String r0 = r1.toString()     // Catch:{ SecurityException -> 0x00b5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x00b5 }
        L_0x00a8:
            X.005 r0 = r5.A00     // Catch:{ SecurityException -> 0x00b5 }
            java.lang.Object r0 = r0.get()     // Catch:{ SecurityException -> 0x00b5 }
            X.0yF r0 = (X.C20840yF) r0     // Catch:{ SecurityException -> 0x00b5 }
            boolean r4 = X.AnonymousClass6YY.A0O(r0, r7, r6)     // Catch:{ SecurityException -> 0x00b5 }
            goto L_0x00bb
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01ac }
        L_0x00bb:
            monitor-exit(r5)     // Catch:{ all -> 0x01af }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01af }
            r1.<init>()     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/accounts file backed up:"
            r1.append(r0)     // Catch:{ all -> 0x01af }
            r1.append(r4)     // Catch:{ all -> 0x01af }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01af }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01af }
            if (r4 == 0) goto L_0x0197
            X.005 r0 = r8.A0C()     // Catch:{ all -> 0x01af }
            r0.get()     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "accounts_backup_created\n"
            r2.writeBytes(r0)     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing data repo ops..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01af }
            r11.invoke()     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed data repo ops"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing checkpointOps..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01af }
            r9.B2m(r2)     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed checkpointOps"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01af }
            r2.close()
            X.005 r0 = r8.A0C()
            java.lang.Object r0 = r0.get()
            X.6Nr r0 = (X.C131086Nr) r0
            r0.A02()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/checkpoint file deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing postCheckpointOps..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.Blr()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed postCheckpointOps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.005 r0 = r8.A0A()
            java.lang.Object r5 = r0.get()
            X.1Z0 r5 = (X.AnonymousClass1Z0) r5
            monitor-enter(r5)
            java.lang.String r4 = "AccountSwitchingDataRepo/deleteBackup/"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0194 }
            r3 = 0
            java.lang.String r0 = "accounts.bak"
            java.io.File r1 = r5.A04(r0)     // Catch:{ SecurityException -> 0x0156 }
            boolean r0 = r1.exists()     // Catch:{ SecurityException -> 0x0156 }
            if (r0 == 0) goto L_0x0150
            boolean r2 = r1.delete()     // Catch:{ SecurityException -> 0x0156 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0156 }
            r1.<init>()     // Catch:{ SecurityException -> 0x0156 }
            java.lang.String r0 = "AccountSwitchingDataRepo/deleteBackup/deleted backup file: "
            r1.append(r0)     // Catch:{ SecurityException -> 0x0156 }
            r1.append(r2)     // Catch:{ SecurityException -> 0x0156 }
            java.lang.String r0 = r1.toString()     // Catch:{ SecurityException -> 0x0156 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x0156 }
            goto L_0x015b
        L_0x0150:
            java.lang.String r0 = "AccountSwitchingDataRepo/deleteBackup/backup file does not exist"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x0156 }
            goto L_0x015c
        L_0x0156:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)     // Catch:{ all -> 0x0194 }
            goto L_0x015c
        L_0x015b:
            r3 = 1
        L_0x015c:
            monitor-exit(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/deleteBackupResult:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r10 == 0) goto L_0x0186
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0186
            X.005 r0 = r8.A0J
            if (r0 == 0) goto L_0x0187
            java.lang.Object r0 = r0.get()
            X.6V1 r0 = (X.AnonymousClass6V1) r0
            r0.A04(r10)
        L_0x0186:
            return
        L_0x0187:
            java.lang.String r0 = "inactiveAccountNotificationManagerLazy"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0194:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x0197:
            X.005 r0 = r8.A0C()     // Catch:{ all -> 0x01af }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01af }
            X.6Nr r0 = (X.C131086Nr) r0     // Catch:{ all -> 0x01af }
            r0.A02()     // Catch:{ all -> 0x01af }
            java.lang.String r1 = "Could not create backup for accounts file"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01af }
            r0.<init>(r1)     // Catch:{ all -> 0x01af }
            goto L_0x01ae
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01af }
        L_0x01ae:
            throw r0     // Catch:{ all -> 0x01af }
        L_0x01af:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01b1 }
        L_0x01b1:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)
            throw r1
        L_0x01b6:
            java.lang.String r0 = "Checkpoint file already exists"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountswitching.AccountSwitchingContentProvider.A02(X.7kE, java.lang.String, X.00S):void");
    }

    public static final void A03(C229616q r5) {
        try {
            boolean tryLock = r5.A02.writeLock().tryLock(5, TimeUnit.SECONDS);
            StringBuilder sb = new StringBuilder();
            sb.append("AccountSwitchingContentProvider/disconnect/");
            sb.append(r5.getDatabaseName());
            sb.append(" lock acquired: ");
            sb.append(tryLock);
            Log.i(sb.toString());
        } catch (InterruptedException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccountSwitchingContentProvider/disconnect/");
            sb2.append(r5.getDatabaseName());
            sb2.append(" lock exception");
            Log.e(sb2.toString(), e);
        }
    }

    public final AnonymousClass005 A09() {
        AnonymousClass005 r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("accountSwitcher");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass005 A0A() {
        AnonymousClass005 r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("accountSwitchingDataRepo");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass005 A0B() {
        AnonymousClass005 r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("accountSwitchingFileManager");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass005 A0C() {
        AnonymousClass005 r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("accountSwitchingRecoveryManager");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:37|38|39|40|41|42|(2:43|44)) */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0400, code lost:
        com.whatsapp.util.Log.i("AccountSwitchingContentProvider/call/kill process");
        com.whatsapp.util.Log.flush();
        android.os.Process.killProcess(android.os.Process.myPid());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x040f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x06d3, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06d4, code lost:
        com.whatsapp.util.Log.e("AccountSwitchingContentProvider/call/exception when handling account switching", r6);
        com.whatsapp.util.Log.i("AccountSwitchingContentProvider/recoverFromAccountSwitchingFailure");
        ((X.C131086Nr) A0C().get()).A03(false);
        r5 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06ee, code lost:
        if (r5 != null) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x06f0, code lost:
        r4 = A09().get();
        X.AnonymousClass00C.A08(r4);
        r4 = (X.AnonymousClass1RU) r4;
        r3 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06ff, code lost:
        if (r3 != null) goto L_0x0701;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0701, code lost:
        r1 = A0A().get();
        X.AnonymousClass00C.A08(r1);
        r0 = A0B().get();
        X.AnonymousClass00C.A08(r0);
        A01(r4, (X.AnonymousClass1Z0) r1, (X.C133346Xy) r0, r3, r5);
        r0 = getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0722, code lost:
        if (r0 == null) goto L_0x0724;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0729, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x072a, code lost:
        X.C21410zC.A00(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x072d, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x072e, code lost:
        X.AnonymousClass00C.A0G("waSharedPreferences");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x073a, code lost:
        throw new java.lang.RuntimeException("Redex: Unreachable code after no-return invoke");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x073b, code lost:
        X.AnonymousClass00C.A0G("storageUtils");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0747, code lost:
        throw new java.lang.RuntimeException("Redex: Unreachable code after no-return invoke");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x0273 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00eb */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0290 A[Catch:{ IllegalStateException -> 0x06d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0306  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle call(java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
        /*
            r10 = this;
            java.lang.String r3 = "AccountSwitchingContentProvider/call/remove account action/lid: "
            java.lang.String r7 = "kill_process"
            java.lang.String r2 = "Required value was null."
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            java.lang.String r0 = "AccountSwitchingContentProvider/call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A08()
            X.0wx r6 = r10.A02     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r6 == 0) goto L_0x06b9
            X.005 r0 = r10.A09()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r5 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1RU r5 = (X.AnonymousClass1RU) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0v0 r4 = r10.A01     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r4 == 0) goto L_0x06ac
            X.005 r0 = r10.A0A()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r1 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1Z0 r1 = (X.AnonymousClass1Z0) r1     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r0 = r10.A0B()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.6Xy r0 = (X.C133346Xy) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            A01(r5, r1, r0, r4, r6)     // Catch:{ IllegalStateException -> 0x06d3 }
            boolean r9 = r11.equals(r7)     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r9 != 0) goto L_0x03f6
            r0 = 1
            java.util.concurrent.CountDownLatch r7 = new java.util.concurrent.CountDownLatch     // Catch:{ IllegalStateException -> 0x06d3 }
            r7.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.19J r0 = r10.A00     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x03d8
            int r0 = r0.A04     // Catch:{ IllegalStateException -> 0x06d3 }
            r4 = 2
            r1 = 0
            if (r0 != r4) goto L_0x005b
            r1 = 1
        L_0x005b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/isXmppConnected: "
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r5.append(r1)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = ", isXmppConnecting: "
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.19J r0 = r10.A00     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x03ca
            int r1 = r0.A04     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 1
            if (r1 == r0) goto L_0x0077
            r0 = 0
        L_0x0077:
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r5.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0wI r5 = r10.A07     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x03bc
            r1 = 34
            X.1iz r0 = new X.1iz     // Catch:{ IllegalStateException -> 0x06d3 }
            r0.<init>(r10, r7, r1)     // Catch:{ IllegalStateException -> 0x06d3 }
            r5.A00(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1C4 r0 = r10.A05     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x03ae
            r0.A00()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0y3 r1 = r10.A04     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r1 == 0) goto L_0x03a0
            r6 = 0
            r0 = 12
            r1.A0G(r6, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00ab }
            boolean r0 = r7.await(r0, r5)     // Catch:{ InterruptedException -> 0x00ab }
            r6 = r0 ^ 1
            goto L_0x00b1
        L_0x00ab:
            r1 = move-exception
            java.lang.String r0 = "AccountSwitchingContentProvider/exception while waiting for xmpp disconnect"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x00b1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/xmpp disconnect timed out: "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r6)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown waJobManager"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r0 = r10.A0P     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0392
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.164 r0 = (X.AnonymousClass164) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            X.650 r7 = r0.A00     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r7 == 0) goto L_0x00fc
            boolean r0 = r7.A00     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 != 0) goto L_0x00fc
            r0 = 1
            r7.A00 = r0     // Catch:{ IllegalStateException -> 0x06d3 }
            java.util.concurrent.ExecutorService r6 = r7.A02     // Catch:{ IllegalStateException -> 0x06d3 }
            r6.shutdown()     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00eb }
            r6.awaitTermination(r0, r5)     // Catch:{ InterruptedException -> 0x00eb }
        L_0x00eb:
            X.78c r5 = r7.A04     // Catch:{ IllegalStateException -> 0x06d3 }
            java.util.concurrent.ThreadPoolExecutor r6 = r5.A00     // Catch:{ IllegalStateException -> 0x06d3 }
            r6.shutdown()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.77C r5 = X.AnonymousClass77C.A00     // Catch:{ IllegalStateException -> 0x06d3 }
            r6.setRejectedExecutionHandler(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00fc }
            r6.awaitTermination(r0, r5)     // Catch:{ InterruptedException -> 0x00fc }
        L_0x00fc:
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown waJobManager completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 5
            X.12P r5 = r10.A03     // Catch:{ InterruptedException -> 0x0134 }
            if (r5 == 0) goto L_0x0127
            r5.A06()     // Catch:{ InterruptedException -> 0x0134 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.A04     // Catch:{ InterruptedException -> 0x0134 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0134 }
            boolean r7 = r6.tryLock(r0, r5)     // Catch:{ InterruptedException -> 0x0134 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0134 }
            r6.<init>()     // Catch:{ InterruptedException -> 0x0134 }
            java.lang.String r5 = "AccountSwitchingContentProvider/disconnect/messageStoreManager lock acquired: "
            r6.append(r5)     // Catch:{ InterruptedException -> 0x0134 }
            r6.append(r7)     // Catch:{ InterruptedException -> 0x0134 }
            java.lang.String r5 = r6.toString()     // Catch:{ InterruptedException -> 0x0134 }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ InterruptedException -> 0x0134 }
            goto L_0x013a
        L_0x0127:
            java.lang.String r5 = "messageStoreManager"
            X.AnonymousClass00C.A0G(r5)     // Catch:{ InterruptedException -> 0x0134 }
            java.lang.String r6 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x0134 }
            r5.<init>(r6)     // Catch:{ InterruptedException -> 0x0134 }
            throw r5     // Catch:{ InterruptedException -> 0x0134 }
        L_0x0134:
            r6 = move-exception
            java.lang.String r5 = "AccountSwitchingContentProvider/disconnect/messageStoreManager lock exception"
            com.whatsapp.util.Log.e(r5, r6)     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x013a:
            X.005 r5 = r10.A0P     // Catch:{ InterruptedException -> 0x0178 }
            if (r5 == 0) goto L_0x016b
            java.lang.Object r5 = r5.get()     // Catch:{ InterruptedException -> 0x0178 }
            X.164 r5 = (X.AnonymousClass164) r5     // Catch:{ InterruptedException -> 0x0178 }
            X.650 r5 = X.AnonymousClass164.A00(r5)     // Catch:{ InterruptedException -> 0x0178 }
            X.6NH r5 = r5.A06     // Catch:{ InterruptedException -> 0x0178 }
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r5.A02     // Catch:{ InterruptedException -> 0x0178 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.writeLock()     // Catch:{ InterruptedException -> 0x0178 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0178 }
            boolean r7 = r6.tryLock(r0, r5)     // Catch:{ InterruptedException -> 0x0178 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0178 }
            r6.<init>()     // Catch:{ InterruptedException -> 0x0178 }
            java.lang.String r5 = "AccountSwitchingContentProvider/disconnect/waJobManagerLockAcquired lock acquired: "
            r6.append(r5)     // Catch:{ InterruptedException -> 0x0178 }
            r6.append(r7)     // Catch:{ InterruptedException -> 0x0178 }
            java.lang.String r5 = r6.toString()     // Catch:{ InterruptedException -> 0x0178 }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ InterruptedException -> 0x0178 }
            goto L_0x017e
        L_0x016b:
            java.lang.String r5 = "waJobManager"
            X.AnonymousClass00C.A0G(r5)     // Catch:{ InterruptedException -> 0x0178 }
            java.lang.String r6 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x0178 }
            r5.<init>(r6)     // Catch:{ InterruptedException -> 0x0178 }
            throw r5     // Catch:{ InterruptedException -> 0x0178 }
        L_0x0178:
            r6 = move-exception
            java.lang.String r5 = "AccountSwitchingContentProvider/disconnect/waJobManagerLockAcquired lock exception"
            com.whatsapp.util.Log.e(r5, r6)     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x017e:
            X.005 r5 = r10.A0O     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x0384
            java.lang.Object r5 = r5.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.16q r5 = (X.C229616q) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            A03(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r5 = r10.A0L     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x0376
            java.lang.Object r5 = r5.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.16q r5 = (X.C229616q) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            A03(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r5 = r10.A0F     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x0368
            java.lang.Object r5 = r5.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.16q r5 = (X.C229616q) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            A03(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r5 = r10.A0K     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x035a
            java.lang.Object r5 = r5.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.16q r5 = (X.C229616q) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            A03(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r5 = r10.A0N     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x034c
            java.lang.Object r5 = r5.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.16q r5 = (X.C229616q) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            A03(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.16r r5 = r10.A09     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x033e
            A03(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r5 = r10.A0G     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x0330
            java.lang.Object r5 = r5.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1CR r5 = (X.AnonymousClass1CR) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1gM r5 = r5.A0P()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            A03(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r5 = r10.A0H     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x0322
            java.lang.Object r5 = r5.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1Wd r5 = (X.C29311Wd) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            X.54c r5 = r5.A00()     // Catch:{ IllegalStateException -> 0x06d3 }
            A03(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r5 = r10.A0M     // Catch:{ InterruptedException -> 0x023d }
            if (r5 == 0) goto L_0x0230
            java.lang.Object r7 = r5.get()     // Catch:{ InterruptedException -> 0x023d }
            X.16S r7 = (X.AnonymousClass16S) r7     // Catch:{ InterruptedException -> 0x023d }
            monitor-enter(r7)     // Catch:{ InterruptedException -> 0x023d }
            X.54d r5 = r7.A00     // Catch:{ all -> 0x022d }
            if (r5 != 0) goto L_0x020b
            r5 = 0
            goto L_0x0217
        L_0x020b:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r5.A02     // Catch:{ all -> 0x022d }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r5.writeLock()     // Catch:{ all -> 0x022d }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x022d }
            boolean r5 = r6.tryLock(r0, r5)     // Catch:{ all -> 0x022d }
        L_0x0217:
            monitor-exit(r7)     // Catch:{ InterruptedException -> 0x023d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x023d }
            r1.<init>()     // Catch:{ InterruptedException -> 0x023d }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/paymentStore lock acquired: "
            r1.append(r0)     // Catch:{ InterruptedException -> 0x023d }
            r1.append(r5)     // Catch:{ InterruptedException -> 0x023d }
            java.lang.String r0 = r1.toString()     // Catch:{ InterruptedException -> 0x023d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x023d }
            goto L_0x0243
        L_0x022d:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ InterruptedException -> 0x023d }
            goto L_0x023c
        L_0x0230:
            java.lang.String r0 = "paymentStore"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ InterruptedException -> 0x023d }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x023d }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x023d }
        L_0x023c:
            throw r1     // Catch:{ InterruptedException -> 0x023d }
        L_0x023d:
            r1 = move-exception
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/paymentStore lock exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x0243:
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown worker threads"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0wU r0 = r10.A08     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0314
            X.779 r0 = new X.779     // Catch:{ IllegalStateException -> 0x06d3 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0wb r5 = X.C19780wV.A05     // Catch:{ IllegalStateException -> 0x06d3 }
            r5.setRejectedExecutionHandler(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.util.concurrent.ThreadPoolExecutor r8 = X.C19780wV.A08     // Catch:{ IllegalStateException -> 0x06d3 }
            r8.setRejectedExecutionHandler(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r5.shutdown()     // Catch:{ IllegalStateException -> 0x06d3 }
            r8.shutdown()     // Catch:{ IllegalStateException -> 0x06d3 }
            r7 = 0
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0273 }
            r0 = 1
            boolean r5 = r5.awaitTermination(r0, r6)     // Catch:{ InterruptedException -> 0x0273 }
            if (r5 == 0) goto L_0x0273
            boolean r0 = r8.awaitTermination(r0, r6)     // Catch:{ InterruptedException -> 0x0273 }
            if (r0 == 0) goto L_0x0273
            r7 = 1
        L_0x0273:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown worker threads terminated: "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r7)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown asyncCommitManager"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r0 = r10.A0E     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0306
            java.lang.Object r7 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1C7 r7 = (X.AnonymousClass1C7) r7     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AsyncCommitManager/shutdown"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch     // Catch:{ IllegalStateException -> 0x06d3 }
            r5.<init>(r4)     // Catch:{ IllegalStateException -> 0x06d3 }
            r6 = 32
            X.1j6 r0 = new X.1j6     // Catch:{ IllegalStateException -> 0x06d3 }
            r0.<init>(r5, r6)     // Catch:{ IllegalStateException -> 0x06d3 }
            r4 = 72
            r7.A01(r0, r4)     // Catch:{ IllegalStateException -> 0x06d3 }
            android.os.HandlerThread r1 = r7.A02     // Catch:{ IllegalStateException -> 0x06d3 }
            boolean r0 = r1.isAlive()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x02b7
            r1.quitSafely()     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x02b7:
            X.1j6 r0 = new X.1j6     // Catch:{ IllegalStateException -> 0x06d3 }
            r0.<init>(r5, r6)     // Catch:{ IllegalStateException -> 0x06d3 }
            r7.A02(r0, r4)     // Catch:{ IllegalStateException -> 0x06d3 }
            android.os.HandlerThread r1 = r7.A03     // Catch:{ IllegalStateException -> 0x06d3 }
            boolean r0 = r1.isAlive()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x02ca
            r1.quitSafely()     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x02ca:
            r0 = 1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x02d1 }
            r5.await(r0, r4)     // Catch:{ InterruptedException -> 0x02d1 }
        L_0x02d1:
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown asyncCommitManager completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown light shared pref writes"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0wf r6 = r10.A06     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r6 == 0) goto L_0x06c6
            boolean r0 = r6.A04     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 != 0) goto L_0x03f1
            r0 = 1
            r6.A04 = r0     // Catch:{ IllegalStateException -> 0x06d3 }
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch     // Catch:{ IllegalStateException -> 0x06d3 }
            r5.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            android.os.Handler r7 = r6.A00     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 32
            X.1j6 r4 = new X.1j6     // Catch:{ IllegalStateException -> 0x06d3 }
            r4.<init>(r5, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 100
            r7.postDelayed(r4, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x03e6 }
            r0 = 1
            long r0 = r4.toMillis(r0)     // Catch:{ InterruptedException -> 0x03e6 }
            r5.await(r0, r4)     // Catch:{ InterruptedException -> 0x03e6 }
            goto L_0x03e6
        L_0x0306:
            java.lang.String r0 = "asyncCommitManager"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0314:
            java.lang.String r0 = "waWorkers"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0322:
            java.lang.String r0 = "commerceDbManager"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0330:
            java.lang.String r0 = "chatSettingsStore"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x033e:
            java.lang.String r0 = "waDatabaseHelper"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x034c:
            java.lang.String r0 = "stickersDbHelper"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x035a:
            java.lang.String r0 = "locationDbHelper"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0368:
            java.lang.String r0 = "axolotlDbHelper"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0376:
            java.lang.String r0 = "mediaDbHelper"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0384:
            java.lang.String r0 = "syncDbHelper"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0392:
            java.lang.String r0 = "waJobManager"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x03a0:
            java.lang.String r0 = "messageHandlerBridge"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x03ae:
            java.lang.String r0 = "sendMethods"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x03bc:
            java.lang.String r0 = "mainThreadHandler"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x03ca:
            java.lang.String r0 = "xmppStateManager"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x03d8:
            java.lang.String r0 = "xmppStateManager"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x03e6:
            android.os.HandlerThread r1 = r6.A01     // Catch:{ IllegalStateException -> 0x06d3 }
            boolean r0 = r1.isAlive()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x03f1
            r1.quitSafely()     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x03f1:
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown light shared pref completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x03f6:
            int r0 = r11.hashCode()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r1 = "switch_to_account_lid"
            r4 = 0
            switch(r0) {
                case -478190222: goto L_0x0579;
                case -274828254: goto L_0x0502;
                case 141981839: goto L_0x04b1;
                case 318873029: goto L_0x0422;
                case 1594147470: goto L_0x0410;
                default: goto L_0x0400;
            }
        L_0x0400:
            java.lang.String r0 = "AccountSwitchingContentProvider/call/kill process"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.util.Log.flush()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return r4
        L_0x0410:
            if (r9 == 0) goto L_0x0400
            java.lang.String r0 = "AccountSwitchingContentProvider/call/kill process action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.flush()     // Catch:{ IllegalStateException -> 0x06d3 }
            int r0 = android.os.Process.myPid()     // Catch:{ IllegalStateException -> 0x06d3 }
            android.os.Process.killProcess(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x0400
        L_0x0422:
            java.lang.String r0 = "abandon_add_account"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0400
            java.lang.String r0 = "AccountSwitchingContentProvider/call/abandon add account action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0fG r7 = new X.0fG     // Catch:{ IllegalStateException -> 0x06d3 }
            r7.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r13 == 0) goto L_0x0437
            goto L_0x0439
        L_0x0437:
            r3 = r4
            goto L_0x043d
        L_0x0439:
            java.lang.String r3 = r13.getString(r1)     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x043d:
            r7.element = r3     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r3 == 0) goto L_0x0447
            int r0 = r3.length()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 != 0) goto L_0x045b
        L_0x0447:
            X.005 r0 = r10.A0A()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1Z0 r0 = (X.AnonymousClass1Z0) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r3 = r0.A05()     // Catch:{ IllegalStateException -> 0x06d3 }
            r7.element = r3     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r3 != 0) goto L_0x045b
            goto L_0x067b
        L_0x045b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/call/abandon add account action/restore lid: "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r0 = r10.A0B()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r6 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.6Xy r6 = (X.C133346Xy) r6     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r5 = r7.element     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingFileManager/restoreAccount/"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 1
            X.7rZ r3 = new X.7rZ     // Catch:{ IllegalStateException -> 0x06d3 }
            r3.<init>(r6, r5, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r1 = r7.element     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IllegalStateException -> 0x06d3 }
            X.7Nc r0 = new X.7Nc     // Catch:{ IllegalStateException -> 0x06d3 }
            r0.<init>(r10, r7)     // Catch:{ IllegalStateException -> 0x06d3 }
            r10.A02(r3, r1, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x0400
        L_0x04b1:
            java.lang.String r0 = "add_account"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0400
            java.lang.String r0 = "AccountSwitchingContentProvider/call/add new account action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r0 = r10.A09()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1RU r0 = (X.AnonymousClass1RU) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            X.3KU r6 = r0.A03()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r6 == 0) goto L_0x0681
            X.005 r0 = r10.A0B()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r5 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.6Xy r5 = (X.C133346Xy) r5     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r3 = r6.A08     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingFileManager/prepForAddingNewAccount/"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 0
            X.7rZ r1 = new X.7rZ     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r5, r3, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.7Nb r0 = new X.7Nb     // Catch:{ IllegalStateException -> 0x06d3 }
            r0.<init>(r10, r6)     // Catch:{ IllegalStateException -> 0x06d3 }
            r10.A02(r1, r4, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x0400
        L_0x0502:
            java.lang.String r0 = "switch_account"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0400
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0fG r6 = new X.0fG     // Catch:{ IllegalStateException -> 0x06d3 }
            r6.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r13 == 0) goto L_0x0517
            goto L_0x0519
        L_0x0517:
            r3 = r4
            goto L_0x051d
        L_0x0519:
            java.lang.String r3 = r13.getString(r1)     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x051d:
            r6.element = r3     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r3 == 0) goto L_0x068d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/lid: "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r0 = r10.A09()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1RU r0 = (X.AnonymousClass1RU) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            X.3KU r5 = r0.A03()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r5 == 0) goto L_0x0687
            java.lang.Object r0 = r6.element     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r3 = r5.A08     // Catch:{ IllegalStateException -> 0x06d3 }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0559
            java.lang.String r0 = r10.A00()     // Catch:{ IllegalStateException -> 0x06d3 }
            r6.element = r0     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x0559:
            X.005 r0 = r10.A0B()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r1 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.6Xy r1 = (X.C133346Xy) r1     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r0 = r6.element     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            X.6p3 r3 = r1.A08(r0, r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r1 = r6.element     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IllegalStateException -> 0x06d3 }
            X.7OW r0 = new X.7OW     // Catch:{ IllegalStateException -> 0x06d3 }
            r0.<init>(r10, r5, r6)     // Catch:{ IllegalStateException -> 0x06d3 }
            r10.A02(r3, r1, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x0400
        L_0x0579:
            java.lang.String r0 = "remove_account"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0400
            java.lang.String r0 = "AccountSwitchingContentProvider/call/remove account action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0fG r6 = new X.0fG     // Catch:{ IllegalStateException -> 0x06d3 }
            r6.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.005 r0 = r10.A0A()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1Z0 r0 = (X.AnonymousClass1Z0) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r0.A05()     // Catch:{ IllegalStateException -> 0x06d3 }
            r6.element = r0     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x06a6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.0fG r5 = new X.0fG     // Catch:{ IllegalStateException -> 0x06d3 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r13 == 0) goto L_0x05bb
            goto L_0x05bd
        L_0x05bb:
            r0 = r4
            goto L_0x05c3
        L_0x05bd:
            java.lang.String r0 = "remove_account_lid"
            java.lang.String r0 = r13.getString(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x05c3:
            r5.element = r0     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 != 0) goto L_0x05db
            X.005 r0 = r10.A09()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1RU r0 = (X.AnonymousClass1RU) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            X.3KU r0 = r0.A03()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x06a0
            java.lang.String r0 = r0.A08     // Catch:{ IllegalStateException -> 0x06d3 }
            r5.element = r0     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x05db:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r1 = r6.element     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r0 = r5.element     // Catch:{ IllegalStateException -> 0x06d3 }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0601
            java.lang.String r0 = r10.A00()     // Catch:{ IllegalStateException -> 0x06d3 }
            r6.element = r0     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x0601:
            X.005 r0 = r10.A0B()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r7 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.6Xy r7 = (X.C133346Xy) r7     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r8 = r6.element     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r3 = r5.element     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "AccountSwitchingFileManager/removeAndSwitchAccount/active:"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r8)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "/removeLid:"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.6p3 r0 = r7.A08(r8, r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.6p2 r1 = new X.6p2     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r7, r0, r3)     // Catch:{ IllegalStateException -> 0x06d3 }
            X.7OX r0 = new X.7OX     // Catch:{ IllegalStateException -> 0x06d3 }
            r0.<init>(r10, r6, r5)     // Catch:{ IllegalStateException -> 0x06d3 }
            r10.A02(r1, r4, r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x06d3 }
            r0 = 26
            if (r1 < r0) goto L_0x0400
            X.005 r0 = r10.A0A()     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.1Z0 r0 = (X.AnonymousClass1Z0) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            X.6C2 r0 = X.AnonymousClass1Z0.A00(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.util.List r0 = r0.A01     // Catch:{ IllegalStateException -> 0x06d3 }
            boolean r0 = r0.isEmpty()     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0400
            X.005 r0 = r10.A0I     // Catch:{ IllegalStateException -> 0x06d3 }
            if (r0 == 0) goto L_0x0693
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x06d3 }
            X.3S9 r0 = (X.AnonymousClass3S9) r0     // Catch:{ IllegalStateException -> 0x06d3 }
            r0.A02()     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x0400
        L_0x067b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0681:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0687:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x068d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x0693:
            java.lang.String r0 = "inactiveAccountNotification"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x06a0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x06a6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x06ac:
            java.lang.String r0 = "waSharedPreferences"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x06b9:
            java.lang.String r0 = "storageUtils"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            goto L_0x06d2
        L_0x06c6:
            java.lang.String r0 = "lightPreferencesDiskIoHandler"
            X.AnonymousClass00C.A0G(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x06d3 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x06d2:
            throw r1     // Catch:{ IllegalStateException -> 0x06d3 }
        L_0x06d3:
            r6 = move-exception
            java.lang.String r0 = "AccountSwitchingContentProvider/call/exception when handling account switching"
            com.whatsapp.util.Log.e(r0, r6)
            java.lang.String r0 = "AccountSwitchingContentProvider/recoverFromAccountSwitchingFailure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.005 r0 = r10.A0C()
            java.lang.Object r1 = r0.get()
            X.6Nr r1 = (X.C131086Nr) r1
            r0 = 0
            r1.A03(r0)
            X.0wx r5 = r10.A02
            if (r5 == 0) goto L_0x073b
            X.005 r0 = r10.A09()
            java.lang.Object r4 = r0.get()
            X.AnonymousClass00C.A08(r4)
            X.1RU r4 = (X.AnonymousClass1RU) r4
            X.0v0 r3 = r10.A01
            if (r3 == 0) goto L_0x072e
            X.005 r0 = r10.A0A()
            java.lang.Object r1 = r0.get()
            X.AnonymousClass00C.A08(r1)
            X.1Z0 r1 = (X.AnonymousClass1Z0) r1
            X.005 r0 = r10.A0B()
            java.lang.Object r0 = r0.get()
            X.AnonymousClass00C.A08(r0)
            X.6Xy r0 = (X.C133346Xy) r0
            A01(r4, r1, r0, r3, r5)
            android.content.Context r0 = r10.getContext()
            if (r0 != 0) goto L_0x072a
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        L_0x072a:
            X.C21410zC.A00(r0, r6)
            throw r6
        L_0x072e:
            java.lang.String r0 = "waSharedPreferences"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x073b:
            java.lang.String r0 = "storageUtils"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountswitching.AccountSwitchingContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}

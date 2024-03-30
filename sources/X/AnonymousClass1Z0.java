package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Z0  reason: invalid class name */
public final class AnonymousClass1Z0 {
    public final AnonymousClass005 A00;
    public final C19630wG A01;
    public final AnonymousClass005 A02;

    public AnonymousClass1Z0(C19630wG r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("AccountSwitchingDataRepo/setAccountSwitchingData/JSONException : ");
        r1.append(r2);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.AnonymousClass6C2 r8, X.AnonymousClass1Z0 r9) {
        /*
            r3 = 0
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00da }
            r4.<init>()     // Catch:{ JSONException -> 0x00da }
            java.util.List r0 = r8.A01     // Catch:{ JSONException -> 0x00da }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ JSONException -> 0x00da }
        L_0x000c:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x00da }
            if (r0 == 0) goto L_0x0071
            java.lang.Object r6 = r7.next()     // Catch:{ JSONException -> 0x00da }
            X.3KU r6 = (X.AnonymousClass3KU) r6     // Catch:{ JSONException -> 0x00da }
            X.AnonymousClass00C.A0D(r6, r3)     // Catch:{ JSONException -> 0x00da }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00da }
            r5.<init>()     // Catch:{ JSONException -> 0x00da }
            java.lang.String r1 = r6.A08     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "lid"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            java.lang.String r1 = r6.A07     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "jid"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            java.lang.String r1 = r6.A09     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "name"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            int r1 = r6.A00     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "badge_count"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            boolean r1 = r6.A03     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "is_logged_in"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            boolean r1 = r6.A02     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "is_companion"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            int r1 = r6.A01     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "unread_message_count"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            long r1 = r6.A05     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "last_active_timestamp_ms"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            long r1 = r6.A06     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "last_buzzed_timestamp_ms"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            long r1 = r6.A04     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "account_added_timestamp_ms"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x00da }
            X.AnonymousClass00C.A08(r0)     // Catch:{ JSONException -> 0x00da }
            r4.put(r0)     // Catch:{ JSONException -> 0x00da }
            goto L_0x000c
        L_0x0071:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00da }
            r2.<init>()     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "inactiveAccounts"
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x00da }
            java.lang.String r1 = r8.A00     // Catch:{ JSONException -> 0x00da }
            if (r1 == 0) goto L_0x008a
            int r0 = r1.length()     // Catch:{ JSONException -> 0x00da }
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "paymentsOnboardedLid"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00da }
        L_0x008a:
            java.lang.String r1 = "shownMeTabMenuItemToolTip"
            boolean r0 = r8.A03     // Catch:{ JSONException -> 0x00da }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x00da }
            java.lang.String r1 = "isCompanionModeEnabled"
            boolean r0 = r8.A02     // Catch:{ JSONException -> 0x00da }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x00da }
            java.lang.String r4 = r2.toString()     // Catch:{ JSONException -> 0x00da }
            X.AnonymousClass00C.A08(r4)     // Catch:{ JSONException -> 0x00da }
            monitor-enter(r9)     // Catch:{ JSONException -> 0x00da }
            java.lang.String r0 = "accounts"
            java.io.File r1 = r9.A04(r0)     // Catch:{ IOException -> 0x00bf }
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ IOException -> 0x00bf }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00bf }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00bf }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00bf }
            r2.write(r4)     // Catch:{ all -> 0x00b8 }
            r2.close()     // Catch:{ IOException -> 0x00bf }
            r0 = 1
            goto L_0x00d5
        L_0x00b8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x00bf }
            throw r0     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r1.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = "AccountSwitchingDataRepo/writeJsonToFile/IOException : "
            r1.append(r0)     // Catch:{ all -> 0x00d7 }
            r1.append(r2)     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d7 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d7 }
            r0 = 0
        L_0x00d5:
            monitor-exit(r9)     // Catch:{ JSONException -> 0x00da }
            return r0
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ JSONException -> 0x00da }
            throw r0     // Catch:{ JSONException -> 0x00da }
        L_0x00da:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccountSwitchingDataRepo/setAccountSwitchingData/JSONException : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Z0.A01(X.6C2, X.1Z0):boolean");
    }

    public final File A04(String str) {
        return new File(this.A01.A00.getDir("account_switching", 0), str);
    }

    public final void A06(AnonymousClass3KU r6) {
        AnonymousClass00C.A0D(r6, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitchingDataRepo/addAccount/");
        String str = r6.A08;
        sb.append(AnonymousClass3LV.A01(str));
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList();
        AnonymousClass6C2 A002 = A00(this);
        arrayList.addAll(A002.A01);
        if (A02(str, arrayList)) {
            Log.e("AccountSwitchingDataRepo/addAccount/Account already exists");
            return;
        }
        arrayList.add(r6);
        A01(new AnonymousClass6C2(A002.A00, arrayList, A002.A03, A002.A02), this);
    }

    public final synchronized boolean A08() {
        String str;
        Log.i("AccountSwitchingDataRepo/restoreBackup/");
        try {
            File A04 = A04("accounts.bak");
            if (!A04.exists()) {
                Log.e("AccountSwitchingDataRepo/restoreBackup/backup file does not exist");
            } else {
                File A042 = A04("accounts");
                if (A042.exists()) {
                    boolean delete = A042.delete();
                    StringBuilder sb = new StringBuilder();
                    sb.append("AccountSwitchingDataRepo/restoreBackup/deleted previous accounts file: ");
                    sb.append(delete);
                    str = sb.toString();
                } else {
                    str = "AccountSwitchingDataRepo/restoreBackup/previous accounts file does not exist";
                }
                Log.i(str);
                boolean renameTo = A04.renameTo(A042);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AccountSwitchingDataRepo/restoreBackup/restored accounts file from backup file: ");
                sb2.append(renameTo);
                Log.i(sb2.toString());
                return renameTo;
            }
        } catch (SecurityException e) {
            Log.e("AccountSwitchingDataRepo/restoreBackup/", e);
        }
        return false;
    }

    public final boolean A09(String str) {
        AnonymousClass00C.A0D(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitchingDataRepo/removeAccount/");
        sb.append(AnonymousClass3LV.A01(str));
        Log.i(sb.toString());
        AnonymousClass6C2 A002 = A00(this);
        List list = A002.A01;
        if (!A02(str, list)) {
            Log.e("AccountSwitchingDataRepo/removeAccount/Account doesn't exist");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!AnonymousClass00C.A0J(((AnonymousClass3KU) next).A08, str)) {
                arrayList.add(next);
            }
        }
        return A01(new AnonymousClass6C2(A002.A00, arrayList, A002.A03, A002.A02), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0100, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("AccountSwitchingDataRepo/getAccountSwitchingData/JSONException : ");
        r1.append(r2);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0120, code lost:
        return new X.AnonymousClass6C2((java.lang.String) null, new java.util.ArrayList(), false, false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass6C2 A00(X.AnonymousClass1Z0 r19) {
        /*
            r4 = r19
            monitor-enter(r4)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "accounts"
            java.io.File r1 = r4.A04(r0)     // Catch:{ IOException -> 0x0036 }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            java.lang.String r2 = "{}"
            goto L_0x004d
        L_0x0012:
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0036 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0036 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0036 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0036 }
            long r1 = r1.length()     // Catch:{ all -> 0x002f }
            int r0 = (int) r1     // Catch:{ all -> 0x002f }
            char[] r0 = new char[r0]     // Catch:{ all -> 0x002f }
            r3.read(r0)     // Catch:{ all -> 0x002f }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x002f }
            r2.<init>(r0)     // Catch:{ all -> 0x002f }
            r3.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x004d
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ IOException -> 0x0036 }
            throw r0     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r1.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "AccountSwitchingDataRepo/readJsonFromFile/IOException : "
            r1.append(r0)     // Catch:{ all -> 0x00fc }
            r1.append(r2)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00fc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "{}"
        L_0x004d:
            monitor-exit(r4)     // Catch:{ JSONException -> 0x00ff }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ff }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "inactiveAccounts"
            org.json.JSONArray r2 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x00ff }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00ff }
            r0.<init>()     // Catch:{ JSONException -> 0x00ff }
            if (r2 == 0) goto L_0x00df
            int r3 = r2.length()     // Catch:{ JSONException -> 0x00ff }
            if (r3 != 0) goto L_0x006b
            java.lang.String r3 = "AccountSwitchingDataRepo/getAccountSwitchingData/accountsJsonArray length is 0"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ JSONException -> 0x00ff }
        L_0x006b:
            r4 = 0
            int r3 = r2.length()     // Catch:{ JSONException -> 0x00ff }
            X.0mZ r3 = X.C15040mb.A05(r4, r3)     // Catch:{ JSONException -> 0x00ff }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ JSONException -> 0x00ff }
        L_0x0078:
            boolean r3 = r5.hasNext()     // Catch:{ JSONException -> 0x00ff }
            if (r3 == 0) goto L_0x00e4
            r3 = r5
            X.0hl r3 = (X.C12260hl) r3     // Catch:{ JSONException -> 0x00ff }
            int r3 = r3.A00()     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ JSONException -> 0x00ff }
            X.AnonymousClass00C.A08(r3)     // Catch:{ JSONException -> 0x00ff }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ff }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "lid"
            java.lang.String r7 = r4.getString(r3)     // Catch:{ JSONException -> 0x00ff }
            X.AnonymousClass00C.A08(r7)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "jid"
            java.lang.String r8 = r4.getString(r3)     // Catch:{ JSONException -> 0x00ff }
            X.AnonymousClass00C.A08(r8)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "name"
            java.lang.String r9 = r4.getString(r3)     // Catch:{ JSONException -> 0x00ff }
            X.AnonymousClass00C.A08(r9)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "badge_count"
            int r10 = r4.optInt(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "is_logged_in"
            boolean r18 = r4.getBoolean(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "is_companion"
            boolean r19 = r4.optBoolean(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "unread_message_count"
            int r11 = r4.getInt(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "last_active_timestamp_ms"
            long r12 = r4.getLong(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "last_buzzed_timestamp_ms"
            long r14 = r4.optLong(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "account_added_timestamp_ms"
            long r16 = r4.optLong(r3)     // Catch:{ JSONException -> 0x00ff }
            X.3KU r6 = new X.3KU     // Catch:{ JSONException -> 0x00ff }
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16, r18, r19)     // Catch:{ JSONException -> 0x00ff }
            r0.add(r6)     // Catch:{ JSONException -> 0x00ff }
            goto L_0x0078
        L_0x00df:
            java.lang.String r2 = "AccountSwitchingDataRepo/getAccountSwitchingData/accountsJsonArray is null"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ JSONException -> 0x00ff }
        L_0x00e4:
            java.lang.String r2 = "paymentsOnboardedLid"
            java.lang.String r5 = r1.optString(r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r2 = "shownMeTabMenuItemToolTip"
            boolean r4 = r1.optBoolean(r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r2 = "isCompanionModeEnabled"
            boolean r1 = r1.optBoolean(r2)     // Catch:{ JSONException -> 0x00ff }
            X.6C2 r3 = new X.6C2     // Catch:{ JSONException -> 0x00ff }
            r3.<init>(r5, r0, r4, r1)     // Catch:{ JSONException -> 0x00ff }
            return r3
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ JSONException -> 0x00ff }
            throw r0     // Catch:{ JSONException -> 0x00ff }
        L_0x00ff:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccountSwitchingDataRepo/getAccountSwitchingData/JSONException : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1 = 0
            r0 = 0
            X.6C2 r3 = new X.6C2
            r3.<init>(r1, r2, r0, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Z0.A00(X.1Z0):X.6C2");
    }

    public static final boolean A02(String str, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass00C.A0J(((AnonymousClass3KU) it.next()).A08, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A07(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitchingDataRepo/setPaymentsOnboardedLid/");
        if (str != null) {
            str2 = AnonymousClass3LV.A01(str);
        } else {
            str2 = null;
        }
        sb.append(str2);
        Log.i(sb.toString());
        AnonymousClass6C2 A002 = A00(this);
        A01(new AnonymousClass6C2(str, A002.A01, A002.A03, A002.A02), this);
    }

    public final AnonymousClass3KU A03(String str) {
        Object obj;
        Iterator it = A00(this).A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AnonymousClass00C.A0J(((AnonymousClass3KU) obj).A08, str)) {
                break;
            }
        }
        return (AnonymousClass3KU) obj;
    }

    public final String A05() {
        Object next;
        List list = A00(this).A01;
        if (list.isEmpty()) {
            Log.e("AccountSwitchingDataRepo/getLastActiveLid/No inactive accounts");
        } else {
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    long j = ((AnonymousClass3KU) next).A05;
                    do {
                        Object next2 = it.next();
                        long j2 = ((AnonymousClass3KU) next2).A05;
                        if (j < j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
            }
            AnonymousClass3KU r8 = (AnonymousClass3KU) next;
            if (r8 != null) {
                return r8.A08;
            }
            Log.w("AccountSwitchingDataRepo/getLastActiveLid/cannot find last active account");
            ((C19700wN) this.A02.get()).A0E("AccountSwitchingDataRepo/getLastActiveLid/cannot find last active account", (String) null, false);
            AnonymousClass3KU r0 = (AnonymousClass3KU) C007103b.A0M(list);
            if (r0 != null) {
                return r0.A08;
            }
        }
        return null;
    }
}

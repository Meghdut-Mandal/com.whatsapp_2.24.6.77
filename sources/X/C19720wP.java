package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0wP  reason: invalid class name and case insensitive filesystem */
public class C19720wP extends C19700wN implements C19710wO {
    public C19680wL A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C21340z3 A02;
    public final C19730wQ A03;
    public final C20050ww A04;
    public final C19600wD A05;
    public final C21060yb A06;
    public final C19630wG A07;
    public final C21010yW A08;
    public final C20840yF A09;
    public final C21080yd A0A;
    public final C20020wt A0B;
    public final C19770wU A0C;
    public final C19420v0 A0D;

    public static String A03(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_version_code", 240677001);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("memclass", i);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("android_version", Build.VERSION.RELEASE);
            jSONObject.put("app_version_name", "2.24.6.77");
            jSONObject.put("app", "Whatsapp");
            jSONObject.put("process_name", "Main Process");
            jSONObject.put("uid", "1");
            jSONObject.putOpt("dump_cause", str);
            jSONObject.put("platform_abi", C131896Re.A02());
            return jSONObject.toString();
        } catch (JSONException e) {
            return String.format(Locale.US, "{ 'error' : '%s' }", new Object[]{e.getMessage()});
        }
    }

    public String BIB() {
        return "CrashLogsImpl";
    }

    public /* synthetic */ void BRM() {
    }

    public static File A00(C19720wP r2) {
        File file = new File(r2.A07.A00.getCacheDir(), "Crashes");
        file.mkdirs();
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0054, code lost:
        if (r5 == null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0040 A[SYNTHETIC, Splitter:B:31:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004a A[SYNTHETIC, Splitter:B:36:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A02(java.io.File r7, java.io.File r8) {
        /*
            java.lang.String r3 = "app/CrashLogs/copyFileToCache: Could not close stream"
            r6 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0036, all -> 0x0069 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0036, all -> 0x0069 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            r4.<init>(r8)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x002e }
        L_0x0011:
            int r1 = r5.read(r2)     // Catch:{ IOException -> 0x002e }
            if (r1 <= 0) goto L_0x001c
            r0 = 0
            r4.write(r2, r0, r1)     // Catch:{ IOException -> 0x002e }
            goto L_0x0011
        L_0x001c:
            r5.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x0024:
            r4.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x002d
        L_0x0028:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
            return r8
        L_0x002d:
            return r8
        L_0x002e:
            r1 = move-exception
            goto L_0x0039
        L_0x0030:
            r1 = move-exception
            r4 = r6
            goto L_0x0056
        L_0x0033:
            r1 = move-exception
            r4 = r6
            goto L_0x0039
        L_0x0036:
            r1 = move-exception
            r4 = r6
            r5 = r6
        L_0x0039:
            java.lang.String r0 = "app/CrashLogs/copyFileToCache: Could not copy file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x0048:
            if (r4 == 0) goto L_0x0052
            r4.close()     // Catch:{ IOException -> 0x004e }
            return r6
        L_0x004e:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x0052:
            return r6
        L_0x0053:
            r1 = move-exception
            if (r5 == 0) goto L_0x005e
        L_0x0056:
            r5.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x005e:
            if (r4 == 0) goto L_0x006a
            r4.close()     // Catch:{ IOException -> 0x0064 }
            throw r1
        L_0x0064:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
            throw r1
        L_0x0069:
            r1 = move-exception
        L_0x006a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19720wP.A02(java.io.File, java.io.File):java.io.File");
    }

    public static String A04(HashSet hashSet) {
        StringBuilder sb = new StringBuilder();
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f5, code lost:
        if (r8.A06.nextInt(r7.A00) == 0) goto L_0x01f7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.AnonymousClass78T r15, X.C19720wP r16, java.lang.String r17, java.lang.String r18, java.util.Map r19, boolean r20) {
        /*
            X.2PR r2 = new X.2PR
            r2.<init>()
            r3 = r17
            r2.A02 = r3
            r17 = r18
            r0 = r17
            r2.A01 = r0
            r18 = r15
            if (r20 == 0) goto L_0x0019
            java.lang.String r0 = X.C224714l.A00(r18)
            r2.A00 = r0
        L_0x0019:
            r4 = r16
            X.0yW r1 = r4.A08
            X.0u5 r0 = X.C20890yK.DEFAULT_SAMPLING_RATE
            r1.Blx(r2, r0)
            X.0z3 r8 = r4.A02
            java.lang.String r0 = "AppMessagingXmppHandler/onLogNotification"
            boolean r0 = r0.equals(r3)
            r11 = 1
            if (r0 != 0) goto L_0x01f7
            monitor-enter(r8)
            android.content.SharedPreferences r5 = r8.A00     // Catch:{ all -> 0x027b }
            if (r5 != 0) goto L_0x003c
            X.0wg r1 = r8.A05     // Catch:{ all -> 0x027b }
            java.lang.String r0 = "critical_event_client_prefs"
            android.content.SharedPreferences r5 = r1.A00(r0)     // Catch:{ all -> 0x027b }
            r8.A00 = r5     // Catch:{ all -> 0x027b }
        L_0x003c:
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x027b }
            if (r0 != 0) goto L_0x01c5
            r2 = 240677001(0xe587089, float:2.667824E-30)
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x027b }
            java.lang.String r1 = "build_version"
            r0 = -1
            int r0 = r5.getInt(r1, r0)     // Catch:{ all -> 0x027b }
            java.lang.String r5 = "critical_event_client_config"
            if (r2 == r0) goto L_0x0077
            android.content.SharedPreferences r0 = r8.A00     // Catch:{ all -> 0x027b }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x027b }
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)     // Catch:{ all -> 0x027b }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)     // Catch:{ all -> 0x027b }
            boolean r2 = r0.commit()     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r1.<init>()     // Catch:{ all -> 0x027b }
            java.lang.String r0 = "CriticalEventConfigManager/updateConfigFromAbProp/clearing client config due to app upgrade "
            r1.append(r0)     // Catch:{ all -> 0x027b }
            r1.append(r2)     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x027b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x027b }
        L_0x0077:
            X.0yC r1 = r8.A04     // Catch:{ all -> 0x027b }
            r0 = 414(0x19e, float:5.8E-43)
            java.lang.String r2 = r1.A09(r0)     // Catch:{ all -> 0x027b }
            android.content.SharedPreferences r1 = r8.A00     // Catch:{ all -> 0x027b }
            java.lang.String r0 = ""
            java.lang.String r15 = r1.getString(r5, r0)     // Catch:{ all -> 0x027b }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x027b }
            r6.<init>()     // Catch:{ all -> 0x027b }
            java.lang.String r14 = ";"
            java.lang.String[] r13 = r2.split(r14)     // Catch:{ all -> 0x027b }
            int r12 = r13.length     // Catch:{ all -> 0x027b }
            if (r12 <= 0) goto L_0x00d5
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x027b }
            r9 = 3888000000(0xe7be2c00, double:1.920927231E-314)
            long r0 = r0 + r9
            r10 = 0
        L_0x00a0:
            r7 = r13[r10]     // Catch:{ all -> 0x027b }
            java.lang.String r2 = ":"
            java.lang.String[] r7 = r7.split(r2)     // Catch:{ all -> 0x027b }
            int r9 = r7.length     // Catch:{ all -> 0x027b }
            r2 = 2
            if (r9 != r2) goto L_0x00d0
            r9 = 0
            r2 = r7[r9]     // Catch:{ all -> 0x027b }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x027b }
            if (r2 != 0) goto L_0x00d0
            r2 = r7[r11]     // Catch:{ all -> 0x027b }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x027b }
            if (r2 != 0) goto L_0x00d0
            r9 = r7[r9]     // Catch:{ all -> 0x027b }
            r7 = r7[r11]     // Catch:{ all -> 0x027b }
            r2 = -1
            int r7 = X.AnonymousClass6R8.A00(r7, r2)     // Catch:{ all -> 0x027b }
            if (r7 < r11) goto L_0x00d0
            X.3Io r2 = new X.3Io     // Catch:{ all -> 0x027b }
            r2.<init>(r9, r7, r0)     // Catch:{ all -> 0x027b }
            r6.add(r2)     // Catch:{ all -> 0x027b }
        L_0x00d0:
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x00d5
            goto L_0x00a0
        L_0x00d5:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x027b }
            r2.<init>()     // Catch:{ all -> 0x027b }
            java.lang.String[] r13 = r15.split(r14)     // Catch:{ all -> 0x027b }
            int r12 = r13.length     // Catch:{ all -> 0x027b }
            if (r12 <= 0) goto L_0x012e
            r10 = 0
        L_0x00e2:
            r1 = r13[r10]     // Catch:{ all -> 0x027b }
            java.lang.String r0 = ":"
            java.lang.String[] r14 = r1.split(r0)     // Catch:{ all -> 0x027b }
            int r1 = r14.length     // Catch:{ all -> 0x027b }
            r0 = 3
            if (r1 != r0) goto L_0x0129
            r1 = 0
            r0 = r14[r1]     // Catch:{ all -> 0x027b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x027b }
            if (r0 != 0) goto L_0x0129
            r0 = r14[r11]     // Catch:{ all -> 0x027b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x027b }
            if (r0 != 0) goto L_0x0129
            r15 = 2
            r0 = r14[r15]     // Catch:{ all -> 0x027b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x027b }
            if (r0 != 0) goto L_0x0129
            r9 = r14[r1]     // Catch:{ all -> 0x027b }
            r1 = r14[r11]     // Catch:{ all -> 0x027b }
            r0 = -1
            int r7 = X.AnonymousClass6R8.A00(r1, r0)     // Catch:{ all -> 0x027b }
            if (r7 < r11) goto L_0x0129
            r14 = r14[r15]     // Catch:{ all -> 0x027b }
            r0 = -1
            long r0 = X.AnonymousClass6R8.A01(r14, r0)     // Catch:{ all -> 0x027b }
            r15 = 1
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x0129
            X.3Io r14 = new X.3Io     // Catch:{ all -> 0x027b }
            r14.<init>(r9, r7, r0)     // Catch:{ all -> 0x027b }
            r2.add(r14)     // Catch:{ all -> 0x027b }
        L_0x0129:
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x012e
            goto L_0x00e2
        L_0x012e:
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x027b }
            r10.<init>()     // Catch:{ all -> 0x027b }
            r8.A02 = r10     // Catch:{ all -> 0x027b }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x027b }
            r12.<init>()     // Catch:{ all -> 0x027b }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x027b }
        L_0x013e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x027b }
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x027b }
            X.3Io r0 = (X.C63053Io) r0     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x027b }
            r12.add(r0)     // Catch:{ all -> 0x027b }
            goto L_0x013e
        L_0x0150:
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x027b }
            r9.<init>()     // Catch:{ all -> 0x027b }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x027b }
            r7.<init>()     // Catch:{ all -> 0x027b }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x027b }
        L_0x015e:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x027b }
            if (r0 == 0) goto L_0x0179
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x027b }
            X.3Io r2 = (X.C63053Io) r2     // Catch:{ all -> 0x027b }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x027b }
            boolean r0 = r12.contains(r1)     // Catch:{ all -> 0x027b }
            if (r0 == 0) goto L_0x015e
            r7.add(r2)     // Catch:{ all -> 0x027b }
            r9.add(r1)     // Catch:{ all -> 0x027b }
            goto L_0x015e
        L_0x0179:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x027b }
        L_0x017d:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x027b }
            if (r0 == 0) goto L_0x0198
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x027b }
            X.3Io r2 = (X.C63053Io) r2     // Catch:{ all -> 0x027b }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x027b }
            boolean r0 = r9.contains(r1)     // Catch:{ all -> 0x027b }
            if (r0 != 0) goto L_0x017d
            r7.add(r2)     // Catch:{ all -> 0x027b }
            r9.add(r1)     // Catch:{ all -> 0x027b }
            goto L_0x017d
        L_0x0198:
            r10.addAll(r7)     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r2.<init>()     // Catch:{ all -> 0x027b }
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x027b }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x027b }
        L_0x01a6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x027b }
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x027b }
            r2.append(r0)     // Catch:{ all -> 0x027b }
            goto L_0x01a6
        L_0x01b4:
            android.content.SharedPreferences r0 = r8.A00     // Catch:{ all -> 0x027b }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x027b }
            android.content.SharedPreferences$Editor r0 = r1.putString(r5, r0)     // Catch:{ all -> 0x027b }
            r0.apply()     // Catch:{ all -> 0x027b }
        L_0x01c5:
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x027b }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x027b }
            monitor-exit(r8)
            java.util.Iterator r9 = r0.iterator()
        L_0x01cf:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x027e
            java.lang.Object r7 = r9.next()
            X.3Io r7 = (X.C63053Io) r7
            java.lang.String r0 = r7.A02
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x01cf
            long r5 = java.lang.System.currentTimeMillis()
            long r1 = r7.A01
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01cf
            java.util.Random r1 = r8.A06
            int r0 = r7.A00
            int r0 = r1.nextInt(r0)
            if (r0 != 0) goto L_0x027e
        L_0x01f7:
            java.lang.String r1 = "UNCAUGHT EXCEPTION"
            r0 = r18
            com.whatsapp.util.Log.e(r1, r0)
            X.C224714l.A01()
            java.lang.String r7 = r18.getMessage()
            monitor-enter(r8)
            java.util.Set r6 = r8.A01     // Catch:{ all -> 0x027b }
            if (r6 != 0) goto L_0x0231
            X.0yC r1 = r8.A04     // Catch:{ all -> 0x027b }
            r0 = 426(0x1aa, float:5.97E-43)
            java.lang.String r1 = r1.A09(r0)     // Catch:{ all -> 0x027b }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x027b }
            r6.<init>()     // Catch:{ all -> 0x027b }
            java.lang.String r0 = ";"
            java.lang.String[] r5 = r1.split(r0)     // Catch:{ all -> 0x027b }
            int r3 = r5.length     // Catch:{ all -> 0x027b }
            r2 = 0
        L_0x021f:
            if (r2 >= r3) goto L_0x022f
            r1 = r5[r2]     // Catch:{ all -> 0x027b }
            int r0 = r1.length()     // Catch:{ all -> 0x027b }
            if (r0 <= 0) goto L_0x022c
            r6.add(r1)     // Catch:{ all -> 0x027b }
        L_0x022c:
            int r2 = r2 + 1
            goto L_0x021f
        L_0x022f:
            r8.A01 = r6     // Catch:{ all -> 0x027b }
        L_0x0231:
            X.C18740tg.A06(r6)     // Catch:{ all -> 0x027b }
            monitor-exit(r8)
            java.util.Iterator r1 = r6.iterator()
        L_0x0239:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x024c
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0239
            return
        L_0x024c:
            X.0wU r2 = r4.A0C     // Catch:{ Exception -> 0x025b }
            r1 = 24
            X.1j5 r0 = new X.1j5     // Catch:{ Exception -> 0x025b }
            r3 = r19
            r0.<init>(r4, r3, r1)     // Catch:{ Exception -> 0x025b }
            r2.Boy(r0)     // Catch:{ Exception -> 0x025b }
            return
        L_0x025b:
            r3 = move-exception
            java.lang.String r0 = "crashlogs/upload/failed"
            com.whatsapp.util.Log.e(r0, r3)
            r2 = 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "wa-worker-error-"
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            A08(r4, r0, r2)
            return
        L_0x027b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x027e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CRITICAL EVENT = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ":"
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19720wP.A06(X.78T, X.0wP, java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }

    public static void A08(C19720wP r3, String str, boolean z) {
        if (z) {
            new AnonymousClass78T("crash-log-upload-failure");
            AnonymousClass2PR r2 = new AnonymousClass2PR();
            r2.A02 = "crash-log-upload-failure";
            r2.A01 = str;
            r3.A08.Blx(r2, C20890yK.DEFAULT_SAMPLING_RATE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ("log_files_upload".equals(r7) != false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01db A[Catch:{ IOException -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e3 A[Catch:{ IOException -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0208 A[Catch:{ IOException -> 0x021f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0209 A[Catch:{ IOException -> 0x021f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(X.C19720wP r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.Map r28, boolean r29, boolean r30) {
        /*
            java.lang.String r5 = "report_source"
            r4 = 0
            r0 = r24
            r2 = r29
            java.lang.String r1 = "mp4_failure"
            r7 = r27
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x021f }
            r13 = 1
            if (r1 != 0) goto L_0x001b
            java.lang.String r1 = "log_files_upload"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x021f }
            r3 = 1
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            java.lang.String r1 = "crashlog"
            r10 = r26
            java.lang.String r3 = r0.A0C(r10, r1, r3)     // Catch:{ IOException -> 0x021f }
            java.lang.String r1 = "no_upload"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x021f }
            if (r1 == 0) goto L_0x002f
            if (r29 != 0) goto L_0x002f
            return r4
        L_0x002f:
            X.3my r6 = new X.3my     // Catch:{ IOException -> 0x021f }
            r6.<init>(r0, r2)     // Catch:{ IOException -> 0x021f }
            X.0yd r9 = r0.A0A     // Catch:{ IOException -> 0x021f }
            java.lang.String r18 = "https://crashlogs.whatsapp.net/wa_clb_data"
            X.0wt r8 = r0.A0B     // Catch:{ IOException -> 0x021f }
            java.lang.String r19 = r8.A02()     // Catch:{ IOException -> 0x021f }
            X.0ww r15 = r0.A04     // Catch:{ IOException -> 0x021f }
            r1 = 0
            r21 = 6
            r22 = 0
            r23 = 0
            r24 = 0
            X.6VO r14 = new X.6VO     // Catch:{ IOException -> 0x021f }
            r20 = r1
            r16 = r6
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x021f }
            java.lang.String r9 = "access_token"
            java.lang.String r6 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r14.A06(r9, r6)     // Catch:{ IOException -> 0x021f }
            java.lang.String r6 = "exception_and_logs"
            boolean r6 = r6.equals(r3)     // Catch:{ IOException -> 0x021f }
            if (r6 == 0) goto L_0x007e
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x021f }
            r9 = r25
            r6.<init>(r9)     // Catch:{ IOException -> 0x021f }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ IOException -> 0x021f }
            r15.<init>(r6)     // Catch:{ IOException -> 0x021f }
            java.lang.String r16 = "file"
            java.lang.String r17 = r6.getName()     // Catch:{ IOException -> 0x021f }
            r18 = 0
            long r20 = r6.length()     // Catch:{ IOException -> 0x021f }
            r14.A05(r15, r16, r17, r18, r20)     // Catch:{ IOException -> 0x021f }
        L_0x007e:
            java.util.Set r6 = r28.entrySet()     // Catch:{ IOException -> 0x021f }
            java.util.Iterator r12 = r6.iterator()     // Catch:{ IOException -> 0x021f }
        L_0x0086:
            boolean r6 = r12.hasNext()     // Catch:{ IOException -> 0x021f }
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r9 = r12.next()     // Catch:{ IOException -> 0x021f }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ IOException -> 0x021f }
            java.lang.Object r6 = r9.getKey()     // Catch:{ IOException -> 0x021f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x021f }
            java.lang.Object r11 = r9.getValue()     // Catch:{ IOException -> 0x021f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x021f }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x021f }
            r9.<init>(r11)     // Catch:{ IOException -> 0x021f }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ IOException -> 0x021f }
            r15.<init>(r9)     // Catch:{ IOException -> 0x021f }
            java.lang.String r17 = r9.getName()     // Catch:{ IOException -> 0x021f }
            r18 = 0
            long r20 = r9.length()     // Catch:{ IOException -> 0x021f }
            r16 = r6
            r14.A05(r15, r16, r17, r18, r20)     // Catch:{ IOException -> 0x021f }
            goto L_0x0086
        L_0x00b8:
            java.lang.String r6 = "from_jid"
            r14.A07(r6, r10)     // Catch:{ IOException -> 0x021f }
            boolean r6 = r7.isEmpty()     // Catch:{ IOException -> 0x021f }
            if (r6 != 0) goto L_0x00c8
            java.lang.String r6 = "tags"
            r14.A07(r6, r7)     // Catch:{ IOException -> 0x021f }
        L_0x00c8:
            java.lang.String r7 = "true"
            if (r29 == 0) goto L_0x00d1
            java.lang.String r6 = "forced"
            r14.A07(r6, r7)     // Catch:{ IOException -> 0x021f }
        L_0x00d1:
            if (r30 == 0) goto L_0x00d8
            java.lang.String r6 = "detailed"
            r14.A07(r6, r7)     // Catch:{ IOException -> 0x021f }
        L_0x00d8:
            X.0v0 r10 = r0.A0D     // Catch:{ IOException -> 0x021f }
            X.005 r12 = r10.A00     // Catch:{ IOException -> 0x021f }
            java.lang.Object r9 = r12.get()     // Catch:{ IOException -> 0x021f }
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9     // Catch:{ IOException -> 0x021f }
            java.lang.String r6 = "voip_call_id"
            java.lang.String r11 = r9.getString(r6, r1)     // Catch:{ IOException -> 0x021f }
            java.lang.String r6 = "session_id_for_voip_call_id"
            java.lang.String r9 = r9.getString(r6, r1)     // Catch:{ IOException -> 0x021f }
            X.00I r6 = new X.00I     // Catch:{ IOException -> 0x021f }
            r6.<init>(r11, r9)     // Catch:{ IOException -> 0x021f }
            java.lang.Object r11 = r6.A00     // Catch:{ IOException -> 0x021f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x021f }
            java.lang.Object r9 = r6.A01     // Catch:{ IOException -> 0x021f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x021f }
            java.lang.String r6 = X.C21870zw.A00     // Catch:{ IOException -> 0x021f }
            boolean r6 = android.text.TextUtils.equals(r9, r6)     // Catch:{ IOException -> 0x021f }
            if (r6 != 0) goto L_0x011d
            if (r11 == 0) goto L_0x010a
            java.lang.String r6 = "call_id"
            r14.A07(r6, r11)     // Catch:{ IOException -> 0x021f }
        L_0x010a:
            java.lang.Object r9 = r12.get()     // Catch:{ IOException -> 0x021f }
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9     // Catch:{ IOException -> 0x021f }
            java.lang.String r6 = "voip_call_ab_test_bucket"
            java.lang.String r9 = r9.getString(r6, r1)     // Catch:{ IOException -> 0x021f }
            if (r9 == 0) goto L_0x011d
            java.lang.String r6 = "abtest_bucket"
            r14.A07(r6, r9)     // Catch:{ IOException -> 0x021f }
        L_0x011d:
            boolean r6 = r10.A2H()     // Catch:{ IOException -> 0x021f }
            if (r6 == 0) goto L_0x0128
            java.lang.String r6 = "md_opt_in"
            r14.A07(r6, r7)     // Catch:{ IOException -> 0x021f }
        L_0x0128:
            java.lang.String r6 = "exception_only"
            boolean r3 = r6.equals(r3)     // Catch:{ IOException -> 0x021f }
            if (r3 == 0) goto L_0x0135
            java.lang.String r3 = "exception_only_upload"
            r14.A07(r3, r7)     // Catch:{ IOException -> 0x021f }
        L_0x0135:
            java.lang.String r9 = "build_id"
            r6 = 581200649(0x22a46b09, double:2.87151274E-315)
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x021f }
            r14.A07(r9, r3)     // Catch:{ IOException -> 0x021f }
            boolean r3 = X.C18750th.A0D()     // Catch:{ IOException -> 0x021f }
            if (r3 == 0) goto L_0x01d3
            java.lang.String r3 = "fb.report_source"
            java.lang.String r3 = X.C18750th.A03(r3)     // Catch:{ IOException -> 0x021f }
            r14.A07(r5, r3)     // Catch:{ IOException -> 0x021f }
            X.0wG r3 = r0.A07     // Catch:{ IOException -> 0x021f }
            android.content.Context r6 = r3.A00     // Catch:{ IOException -> 0x021f }
            java.lang.String r3 = "errorreporting"
            java.io.File r7 = r6.getDir(r3, r4)     // Catch:{ IOException -> 0x021f }
            boolean r3 = r7.exists()     // Catch:{ IOException -> 0x021f }
            if (r3 == 0) goto L_0x01d3
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x021f }
            r6.<init>(r7, r5)     // Catch:{ IOException -> 0x021f }
            boolean r3 = r6.exists()     // Catch:{ IOException -> 0x021f }
            if (r3 == 0) goto L_0x01d3
            java.lang.String r3 = "report_source_ref.txt"
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x021f }
            r7.<init>(r6, r3)     // Catch:{ IOException -> 0x021f }
            boolean r3 = r7.exists()     // Catch:{ IOException -> 0x021f }
            if (r3 == 0) goto L_0x01d3
            long r9 = r7.length()     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            r5 = 1024(0x400, double:5.06E-321)
            long r9 = r9 / r5
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            int r6 = java.lang.Integer.parseInt(r3)     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            r3 = 100
            if (r6 <= r3) goto L_0x01a5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            r5.<init>()     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            java.lang.String r3 = "FileUtils/readFile/File size is too big to read into string "
            r5.append(r3)     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            r5.append(r6)     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            java.lang.String r3 = "KB. Max allowed is 100KB"
            r5.append(r3)     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            goto L_0x01d3
        L_0x01a5:
            byte[] r3 = X.AnonymousClass14R.A00(r7)     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x01c5, NumberFormatException -> 0x01c1 }
            boolean r3 = r6.isEmpty()     // Catch:{ IOException -> 0x021f }
            if (r3 != 0) goto L_0x01d3
            java.lang.String r3 = "report_source_ref="
            boolean r3 = r6.startsWith(r3)     // Catch:{ IOException -> 0x021f }
            java.lang.String r5 = "report_source_ref"
            if (r3 == 0) goto L_0x01d0
            r3 = 18
            goto L_0x01cc
        L_0x01c1:
            r5 = move-exception
            java.lang.String r3 = "FileUtils/readFile/error in getting file size"
            goto L_0x01c8
        L_0x01c5:
            r5 = move-exception
            java.lang.String r3 = "FileUtils/readFile/ioerror"
        L_0x01c8:
            com.whatsapp.util.Log.e(r3, r5)     // Catch:{ IOException -> 0x021f }
            goto L_0x01d3
        L_0x01cc:
            java.lang.String r6 = r6.substring(r3)     // Catch:{ IOException -> 0x021f }
        L_0x01d0:
            r14.A07(r5, r6)     // Catch:{ IOException -> 0x021f }
        L_0x01d3:
            X.0yb r3 = r0.A06     // Catch:{ IOException -> 0x021f }
            android.app.ActivityManager r3 = r3.A04()     // Catch:{ IOException -> 0x021f }
            if (r3 != 0) goto L_0x01e3
            java.lang.String r3 = "memorydumpuploadservice/get-upload-params am=null"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ IOException -> 0x021f }
            r6 = 16
            goto L_0x01e7
        L_0x01e3:
            int r6 = r3.getMemoryClass()     // Catch:{ IOException -> 0x021f }
        L_0x01e7:
            X.0wG r5 = r0.A07     // Catch:{ IOException -> 0x021f }
            java.lang.String r3 = X.C18930u3.A01()     // Catch:{ IOException -> 0x021f }
            X.C20020wt.A00(r5, r8, r3)     // Catch:{ IOException -> 0x021f }
            java.lang.String r3 = "2.24.6.77"
            java.util.Objects.requireNonNull(r3)     // Catch:{ IOException -> 0x021f }
            java.lang.String r5 = "android_hprof_extras"
            java.lang.String r3 = A03(r1, r6)     // Catch:{ IOException -> 0x021f }
            r14.A07(r5, r3)     // Catch:{ IOException -> 0x021f }
            int r5 = r14.A04(r1)     // Catch:{ IOException -> 0x021f }
            if (r5 <= 0) goto L_0x0209
            r1 = 400(0x190, float:5.6E-43)
            if (r5 >= r1) goto L_0x0209
            return r13
        L_0x0209:
            r13 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x021f }
            r3.<init>()     // Catch:{ IOException -> 0x021f }
            java.lang.String r1 = "upload-response-"
            r3.append(r1)     // Catch:{ IOException -> 0x021f }
            r3.append(r5)     // Catch:{ IOException -> 0x021f }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x021f }
            A08(r0, r1, r2)     // Catch:{ IOException -> 0x021f }
            return r13
        L_0x021f:
            r3 = move-exception
            java.lang.String r1 = "app/CrashLogs/uploadCrashData: could not upload crash data"
            com.whatsapp.util.Log.w(r1, r3)
            java.lang.String r1 = "io-error"
            A08(r0, r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19720wP.A09(X.0wP, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean):boolean");
    }

    public void BRL() {
        this.A01.post(new C35691j6(this, 24));
    }

    public C19720wP(C21340z3 r3, C19730wQ r4, C20050ww r5, C19600wD r6, C21060yb r7, C19630wG r8, C19420v0 r9, C21010yW r10, C20840yF r11, C21080yd r12, C20020wt r13, C19770wU r14) {
        this.A07 = r8;
        this.A03 = r4;
        this.A0B = r13;
        this.A0C = r14;
        this.A04 = r5;
        this.A08 = r10;
        this.A06 = r7;
        this.A0A = r12;
        this.A0D = r9;
        this.A05 = r6;
        this.A02 = r3;
        this.A09 = r11;
    }

    public static File A01(C19720wP r2, File file, long j) {
        File A002 = A00(r2);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(".log");
        return A02(file, new File(A002, sb.toString()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049 A[Catch:{ IOException -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083 A[Catch:{ IOException -> 0x008b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map A05(X.C19720wP r7, java.util.Map r8) {
        /*
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0007
            return r8
        L_0x0007:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.io.File r1 = A00(r7)     // Catch:{ IOException -> 0x008b }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x008b }
            r3 = 24
            java.lang.String r0 = r0.substring(r3)     // Catch:{ IOException -> 0x008b }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x008b }
            r0 = 0
        L_0x0024:
            int r2 = r0 + 1
            r1 = 10
            if (r0 >= r1) goto L_0x0047
            boolean r0 = r6.mkdirs()     // Catch:{ IOException -> 0x008b }
            if (r0 != 0) goto L_0x0047
            java.io.File r1 = A00(r7)     // Catch:{ IOException -> 0x008b }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.substring(r3)     // Catch:{ IOException -> 0x008b }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x008b }
            r0 = r2
            goto L_0x0024
        L_0x0047:
            if (r2 > r1) goto L_0x0083
            java.util.Set r0 = r8.entrySet()     // Catch:{ IOException -> 0x008b }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ IOException -> 0x008b }
        L_0x0051:
            boolean r0 = r4.hasNext()     // Catch:{ IOException -> 0x008b }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r4.next()     // Catch:{ IOException -> 0x008b }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x008b }
            java.lang.Object r3 = r0.getKey()     // Catch:{ IOException -> 0x008b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x008b }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x008b }
            java.lang.String r1 = r2.getName()     // Catch:{ IOException -> 0x008b }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r0.<init>(r6, r1)     // Catch:{ IOException -> 0x008b }
            java.io.File r0 = A02(r2, r0)     // Catch:{ IOException -> 0x008b }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x008b }
            r5.put(r3, r0)     // Catch:{ IOException -> 0x008b }
            goto L_0x0051
        L_0x0083:
            java.lang.String r1 = "max retries reached while creating attachment temp directory"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x008b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x008b }
            throw r0     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19720wP.A05(X.0wP, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bd, code lost:
        if (r7 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b3 A[SYNTHETIC, Splitter:B:20:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.AnonymousClass3AG r8, X.C19720wP r9) {
        /*
            java.io.File r2 = A00(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r3 = r8.A00
            r1.append(r3)
            java.lang.String r0 = ".crash"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            java.lang.String r5 = "app/CrashLogs/serializeCrashData: Could not close stream"
            r7 = 0
            r0 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x009c }
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x009c }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            r7.<init>()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.util.Map r0 = r8.A04     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
        L_0x0034:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            r7.put(r1, r0)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            goto L_0x0034
        L_0x004e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            r2.<init>()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r1 = r8.A02     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r0 = "logFilePath"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r1 = r8.A01     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r0 = "fromParam"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            boolean r1 = r8.A06     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r0 = "forcedUpload"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            boolean r1 = r8.A05     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r0 = "detailedException"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r1 = r8.A03     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r0 = "tagsString"
            org.json.JSONObject r1 = r2.put(r0, r1)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r0 = "attachments"
            org.json.JSONObject r1 = r1.put(r0, r7)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r0 = "timeMillis"
            org.json.JSONObject r0 = r1.put(r0, r3)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            r6.write(r0)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            r6.close()     // Catch:{ IOException -> 0x00b7 }
            return
        L_0x0096:
            r1 = move-exception
            r7 = r6
            goto L_0x00bf
        L_0x0099:
            r2 = move-exception
            r7 = r6
            goto L_0x009d
        L_0x009c:
            r2 = move-exception
        L_0x009d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r1.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "app/CrashLogs/serializeCrashData: could not serialize crash data at time: "
            r1.append(r0)     // Catch:{ all -> 0x00bc }
            r1.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bc }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x00bc }
            if (r7 == 0) goto L_0x00bb
            r7.close()     // Catch:{ IOException -> 0x00b7 }
            return
        L_0x00b7:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x00bb:
            return
        L_0x00bc:
            r1 = move-exception
            if (r7 == 0) goto L_0x00c7
        L_0x00bf:
            r7.close()     // Catch:{ IOException -> 0x00c3 }
            throw r1
        L_0x00c3:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x00c7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19720wP.A07(X.3AG, X.0wP):void");
    }
}

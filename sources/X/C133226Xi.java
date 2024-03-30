package X;

import android.accounts.Account;
import android.content.Context;
import android.net.TrafficStats;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.ApiException;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.6Xi  reason: invalid class name and case insensitive filesystem */
public final class C133226Xi {
    public boolean A00;
    public String A01;
    public boolean A02 = true;
    public final C19700wN A03;
    public final C24461Cn A04;
    public final C24431Ck A05;
    public final AnonymousClass782 A06;
    public final C20810yC A07;
    public final String A08;
    public final String A09;
    public final AtomicInteger A0A = C90484aE.A0v();
    public final Context A0B;
    public final C20050ww A0C;
    public final C131096Ns A0D;
    public final C19600wD A0E;
    public final AnonymousClass179 A0F;
    public final C20830yE A0G;
    public final C24051Aw A0H;
    public final C19770wU A0I;
    public final String A0J;
    public final SSLSocketFactory A0K;

    public C133226Xi(Context context, C19700wN r18, C20050ww r19, C24461Cn r20, C24431Ck r21, C131096Ns r22, C19600wD r23, AnonymousClass179 r24, C20830yE r25, C20810yC r26, C24051Aw r27, C20020wt r28, C19770wU r29, String str, String str2) {
        String str3;
        C20810yC r6 = r26;
        C19700wN r14 = r18;
        Context context2 = context;
        C36321k7.A16(context2, r6, r14, 1);
        C20020wt r4 = r28;
        C20050ww r9 = r19;
        C36421kH.A1J(r4, 4, r9);
        C24051Aw r5 = r27;
        C20830yE r7 = r25;
        AnonymousClass179 r8 = r24;
        C131096Ns r11 = r22;
        C24431Ck r12 = r21;
        C36321k7.A1C(r8, r12, r11, r7, r5);
        String str4 = str;
        C19600wD r10 = r23;
        C24461Cn r13 = r20;
        C36321k7.A15(r13, str4, r10);
        C19770wU r3 = r29;
        AnonymousClass00C.A0D(r3, 14);
        this.A0B = context2;
        this.A07 = r6;
        this.A03 = r14;
        this.A0C = r9;
        this.A0F = r8;
        this.A05 = r12;
        this.A0D = r11;
        this.A0G = r7;
        this.A0H = r5;
        this.A04 = r13;
        this.A08 = str4;
        this.A0E = r10;
        this.A0I = r3;
        synchronized (r4) {
            str3 = r4.A00;
            if (str3 == null) {
                C19630wG r1 = r4.A05;
                Objects.requireNonNull("2.24.6.77");
                str3 = C20020wt.A00(r1, r4, "2.24.6.77");
                r4.A00 = str3;
            }
        }
        AnonymousClass00C.A08(str3);
        this.A0J = str3;
        this.A0K = new C21915Acl(r9);
        this.A06 = new AnonymousClass782(r9);
        this.A09 = str2;
    }

    public static final String A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        String aSCIIString = new URI("https", (String) null, "backup.googleapis.com", -1, str, (String) null, (String) null).toASCIIString();
        AnonymousClass00C.A08(aSCIIString);
        return new C10880fN("\\+").A00(aSCIIString, "%2B");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: android.util.Pair} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r5.length() == 0) goto L_0x003e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A06(java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22) {
        /*
            r18 = this;
            r13 = 0
            java.lang.String r2 = " transaction="
            r8 = r18
            boolean r0 = r8.A0D()
            r14 = 0
            r3 = r19
            r5 = r21
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GoogleBackupApi/list-files/api is disabled for "
            r1.append(r0)
            r1.append(r3)
            X.C36321k7.A1R(r2, r5, r1)
            return r14
        L_0x0020:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r4 = 1
            X.011[] r2 = new X.AnonymousClass011[r4]     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            java.lang.String r1 = "pageSize"
            java.lang.String r0 = java.lang.String.valueOf(r22)     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            X.C36341k9.A1J(r1, r0, r2, r13)     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            java.util.LinkedHashMap r12 = X.C000400e.A08(r2)     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            if (r21 == 0) goto L_0x003e
            int r1 = r5.length()     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            r0 = 0
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "transaction_id"
            r12.put(r0, r5)     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
        L_0x0046:
            r1 = r20
            if (r20 == 0) goto L_0x0051
            int r0 = r1.length()     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            if (r0 == 0) goto L_0x0051
            r4 = 0
        L_0x0051:
            if (r4 != 0) goto L_0x0058
            java.lang.String r0 = "pageToken"
            r12.put(r0, r1)     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
        L_0x0058:
            java.lang.String r9 = "GET"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            java.lang.String r1 = "clients/wa/backups/"
            r2.append(r1)     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            r2.append(r3)     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            java.lang.String r0 = "/files"
            java.lang.String r10 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            java.lang.String r11 = "application/json; charset=UTF-8"
            javax.net.ssl.HttpsURLConnection r2 = r8.A09(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0149, all -> 0x0147 }
            int r5 = r2.getResponseCode()     // Catch:{ IOException -> 0x0145 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 == r0) goto L_0x00c4
            r0 = 401(0x191, float:5.62E-43)
            if (r5 == r0) goto L_0x00c0
            r0 = 403(0x193, float:5.65E-43)
            if (r5 == r0) goto L_0x013f
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r4 = "list-files"
            if (r5 != r0) goto L_0x009b
            X.0yC r1 = r8.A07     // Catch:{ IOException -> 0x0145 }
            r0 = 916(0x394, float:1.284E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ IOException -> 0x0145 }
            X.AnonymousClass6UB.A02(r4, r2, r0)     // Catch:{ IOException -> 0x0145 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0145 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)     // Catch:{ IOException -> 0x0145 }
            throw r1     // Catch:{ IOException -> 0x0145 }
        L_0x009b:
            java.lang.String r3 = X.C90474aD.A0h(r2)     // Catch:{ IOException -> 0x0145 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0145 }
            java.lang.String r0 = "GoogleBackupApi/list-files weird status code: "
            r1.append(r0)     // Catch:{ IOException -> 0x0145 }
            r1.append(r5)     // Catch:{ IOException -> 0x0145 }
            r0 = 32
            r1.append(r0)     // Catch:{ IOException -> 0x0145 }
            X.C36321k7.A1Z(r1, r3)     // Catch:{ IOException -> 0x0145 }
            X.0wN r0 = r8.A03     // Catch:{ IOException -> 0x0145 }
            X.C109805Ze.A00(r0, r4, r5)     // Catch:{ IOException -> 0x0145 }
            r1 = -1
            X.4yS r0 = new X.4yS     // Catch:{ IOException -> 0x0145 }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x0145 }
            goto L_0x0144
        L_0x00c0:
            r8.A0C()     // Catch:{ IOException -> 0x0145 }
            goto L_0x0127
        L_0x00c4:
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x0145 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ IOException -> 0x0145 }
            org.json.JSONObject r6 = X.AnonymousClass14X.A01(r0)     // Catch:{ JSONException -> 0x0133 }
            if (r6 == 0) goto L_0x012e
            java.lang.String r0 = "files"
            org.json.JSONArray r7 = r6.optJSONArray(r0)     // Catch:{ JSONException -> 0x0133 }
            if (r7 != 0) goto L_0x00e3
            X.09w r0 = X.C023409w.A00     // Catch:{ JSONException -> 0x0133 }
            android.util.Pair r14 = android.util.Pair.create(r0, r14)     // Catch:{ JSONException -> 0x0133 }
            X.AnonymousClass00C.A08(r14)     // Catch:{ JSONException -> 0x0133 }
            goto L_0x0127
        L_0x00e3:
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r1, r3)     // Catch:{ JSONException -> 0x0133 }
            java.lang.String r0 = "/files/"
            java.lang.String r13 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ JSONException -> 0x0133 }
            int r0 = r7.length()     // Catch:{ JSONException -> 0x0133 }
            java.util.ArrayList r5 = X.C36441kJ.A14(r0)     // Catch:{ JSONException -> 0x0133 }
            int r4 = r7.length()     // Catch:{ JSONException -> 0x0133 }
            r3 = 0
        L_0x00fa:
            if (r3 >= r4) goto L_0x011a
            org.json.JSONObject r15 = r7.getJSONObject(r3)     // Catch:{ JSONException -> 0x0133 }
            X.1Ck r12 = r8.A05     // Catch:{ JSONException -> 0x0133 }
            r16 = -1
            X.6Pk r0 = X.C131526Pk.A00(r12, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x0133 }
            if (r0 == 0) goto L_0x010e
            r5.add(r0)     // Catch:{ JSONException -> 0x0133 }
            goto L_0x0117
        L_0x010e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x0133 }
            java.lang.String r0 = "GoogleBackupApi/list-files/missing some attrs "
            X.C36321k7.A1J(r15, r0, r1)     // Catch:{ JSONException -> 0x0133 }
        L_0x0117:
            int r3 = r3 + 1
            goto L_0x00fa
        L_0x011a:
            java.lang.String r0 = "nextPageToken"
            java.lang.String r0 = r6.optString(r0, r14)     // Catch:{ JSONException -> 0x0133 }
            android.util.Pair r14 = android.util.Pair.create(r5, r0)     // Catch:{ JSONException -> 0x0133 }
            X.AnonymousClass00C.A0B(r14)     // Catch:{ JSONException -> 0x0133 }
        L_0x0127:
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r14
        L_0x012e:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()     // Catch:{ JSONException -> 0x0133 }
            throw r0     // Catch:{ JSONException -> 0x0133 }
        L_0x0133:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/list-files/invalid stream"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0145 }
            X.4yS r0 = new X.4yS     // Catch:{ IOException -> 0x0145 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0145 }
            goto L_0x0144
        L_0x013f:
            X.4yH r0 = new X.4yH     // Catch:{ IOException -> 0x0145 }
            r0.<init>()     // Catch:{ IOException -> 0x0145 }
        L_0x0144:
            throw r0     // Catch:{ IOException -> 0x0145 }
        L_0x0145:
            r1 = move-exception
            goto L_0x014b
        L_0x0147:
            r0 = move-exception
            goto L_0x0158
        L_0x0149:
            r1 = move-exception
            r2 = r14
        L_0x014b:
            java.lang.String r0 = "GoogleBackupApi/list-files failed with exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0156 }
            X.4yS r0 = new X.4yS     // Catch:{ all -> 0x0156 }
            r0.<init>(r1)     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            r14 = r2
        L_0x0158:
            if (r14 == 0) goto L_0x015d
            r14.disconnect()
        L_0x015d:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133226Xi.A06(java.lang.String, java.lang.String, java.lang.String, int):android.util.Pair");
    }

    public final HttpsURLConnection A09(String str, String str2, String str3, Map map, boolean z) {
        AnonymousClass00C.A0D(str2, 1);
        try {
            String aSCIIString = new URI("https", (String) null, "backup.googleapis.com", -1, AnonymousClass000.A0p("/v1/", str2, AnonymousClass000.A0u()), (String) null, (String) null).toASCIIString();
            AnonymousClass00C.A08(aSCIIString);
            return A0A(str, aSCIIString, str3, map, z);
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }
    }

    public final synchronized void A0B(boolean z) {
        String str;
        if (this.A02 != z) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GoogleBackupApi/");
            if (z) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            C36321k7.A1a(A0u, str);
            this.A02 = z;
        }
    }

    public final synchronized boolean A0D() {
        return !this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0340, code lost:
        if (r14 == null) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        if (A05(r6, r3, r0) != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(X.AnonymousClass7fU r37, X.C33131el r38, X.C131526Pk r39, java.io.File r40) {
        /*
            r36 = this;
            r8 = 0
            r12 = 1
            r1 = 3
            r35 = r38
            r0 = r35
            X.AnonymousClass00C.A0D(r0, r1)
            r7 = r36
            boolean r0 = r7.A0D()
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "restore>GoogleBackupApi/save-file/api disabled"
        L_0x0014:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r8
        L_0x0018:
            java.lang.String r1 = "restore>GoogleBackupApi/save-file/check "
            r13 = r39
            java.lang.String r2 = r13.A05
            r34 = r40
            r34.getAbsolutePath()
            long r9 = r13.A00
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            java.lang.String r0 = "restore>GoogleBackupApi/save-file/check size cannot be negative, exiting."
        L_0x002d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r8
        L_0x0031:
            boolean r0 = r34.exists()
            if (r0 == 0) goto L_0x004d
            boolean r0 = r34.isDirectory()
            if (r0 == 0) goto L_0x004d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r1)
            r0 = r34
            r2.append(r0)
            java.lang.String r0 = " exists and is a directory, cannot proceed further."
        L_0x0048:
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            goto L_0x002d
        L_0x004d:
            java.io.File r1 = r34.getParentFile()
            if (r1 == 0) goto L_0x006a
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x006a
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L_0x006a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>GoogleBackupApi/save-file/check failed to create "
            java.lang.String r0 = X.C90514aH.A0x(r1, r0, r2)
            goto L_0x0048
        L_0x006a:
            java.io.File r3 = r34.getParentFile()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r34.getName()
            r1.append(r0)
            java.lang.String r0 = ".incomplete"
            java.io.File r6 = X.C90464aC.A0K(r3, r0, r1)
            boolean r0 = r6.exists()
            r4 = 1
            if (r0 != 0) goto L_0x00a4
            r6.getAbsolutePath()
        L_0x0089:
            r14 = 0
            if (r4 != 0) goto L_0x00d4
            boolean r0 = r6.delete()
            if (r0 != 0) goto L_0x00d8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>GoogleBackupApi/delete-local-file/failed "
            java.lang.String r0 = X.C90514aH.A0x(r6, r0, r1)
            X.C36321k7.A1Z(r1, r0)
            r6.getAbsolutePath()
            return r8
        L_0x00a4:
            long r0 = r6.length()
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c2
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "restore>GoogleBackupApi/is-invalid-download-file/true size of a file ("
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = ") is more than size of remote file "
            X.C36321k7.A1K(r13, r0, r4)
            r6.getAbsolutePath()
        L_0x00c0:
            r4 = 0
            goto L_0x0089
        L_0x00c2:
            if (r3 != 0) goto L_0x0089
            long r0 = r6.length()
            java.lang.String r3 = r13.A03
            X.AnonymousClass00C.A07(r3)
            boolean r0 = r7.A05(r6, r3, r0)
            if (r0 == 0) goto L_0x00c0
            goto L_0x0089
        L_0x00d4:
            r6.length()
            goto L_0x00db
        L_0x00d8:
            r6.getAbsolutePath()
        L_0x00db:
            long r0 = r6.length()
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r11 = r37
            if (r3 != 0) goto L_0x00f4
            A03(r13, r6)
            r2 = r34
            boolean r2 = r7.A04(r6, r2)
            if (r2 == 0) goto L_0x0101
            r11.BV9(r0)
            return r12
        L_0x00f4:
            r11.BV9(r0)
            boolean r3 = r35.A00()
            if (r3 != 0) goto L_0x010e
            java.lang.String r0 = "restore>GoogleBackupApi/save-file/failed-waiting-for-suitable-conditions"
            goto L_0x0014
        L_0x0101:
            java.lang.String r0 = r34.getName()
            X.AnonymousClass00C.A08(r0)
            X.4yN r4 = new X.4yN
            r4.<init>(r0)
            throw r4
        L_0x010e:
            r3 = 13
            android.net.TrafficStats.setThreadStatsTag(r3)
            X.011[] r5 = new X.AnonymousClass011[r12]     // Catch:{ IOException -> 0x0411 }
            java.lang.String r4 = "alt"
            java.lang.String r3 = "media"
            X.C36341k9.A1J(r4, r3, r5, r8)     // Catch:{ IOException -> 0x0411 }
            java.util.LinkedHashMap r20 = X.C000400e.A08(r5)     // Catch:{ IOException -> 0x0411 }
            java.lang.String r17 = "GET"
            X.AnonymousClass00C.A07(r2)     // Catch:{ IOException -> 0x0411 }
            r19 = 0
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ URISyntaxException -> 0x040a }
            java.lang.String r3 = "/v1/"
            java.lang.String r2 = X.AnonymousClass000.A0p(r3, r2, r4)     // Catch:{ URISyntaxException -> 0x040a }
            java.lang.String r18 = A00(r2)     // Catch:{ URISyntaxException -> 0x040a }
            r21 = 0
            r16 = r7
            javax.net.ssl.HttpsURLConnection r26 = r16.A0A(r17, r18, r19, r20, r21)     // Catch:{ URISyntaxException -> 0x040a }
            r26.getURL()
            r26.getRequestMethod()
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x0162
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.Object[] r2 = new java.lang.Object[r12]
            X.AnonymousClass000.A1M(r2, r8, r0)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r12)
            java.lang.String r2 = "bytes=%d-"
            java.lang.String r4 = X.C90494aF.A0e(r4, r2, r3)
            java.lang.String r3 = "Range"
            r2 = r26
            r2.setRequestProperty(r3, r4)
            r2.getRequestProperty(r3)
        L_0x0162:
            int r3 = r26.getResponseCode()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 == r2) goto L_0x01c4
            r2 = 206(0xce, float:2.89E-43)
            if (r3 == r2) goto L_0x01c4
            r2 = 401(0x191, float:5.62E-43)
            java.lang.String r6 = " statusLine "
            java.lang.String r5 = "restore>GoogleBackupApi/save-file status of the response is "
            if (r3 == r2) goto L_0x01bc
            r2 = 403(0x193, float:5.65E-43)
            if (r3 == r2) goto L_0x01b5
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.C36351kA.A1M(r5, r6, r4, r3)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.String r2 = r26.getResponseMessage()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.C36321k7.A1Z(r4, r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.String r5 = X.C90474aD.A0h(r26)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.String r2 = "restore>GoogleBackupApi/save-file "
            X.C36321k7.A1P(r2, r5, r4)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r2 = 404(0x194, float:5.66E-43)
            if (r3 == r2) goto L_0x01ae
            r2 = 429(0x1ad, float:6.01E-43)
            java.lang.String r4 = "save-file"
            if (r3 != r2) goto L_0x01a1
            goto L_0x0304
        L_0x01a1:
            X.0wN r2 = r7.A03     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.C109805Ze.A00(r2, r4, r3)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r2 = -1
            X.4yS r3 = new X.4yS     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r3.<init>(r5, r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            goto L_0x0318
        L_0x01ae:
            X.4yT r3 = new X.4yT     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r3.<init>()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            goto L_0x0318
        L_0x01b5:
            X.4yH r3 = new X.4yH     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r3.<init>()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            goto L_0x0318
        L_0x01bc:
            r26.getResponseMessage()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r7.A0C()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            goto L_0x03ef
        L_0x01c4:
            r6.getAbsolutePath()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.String r3 = "Content-Length"
            r2 = r26
            r2.getHeaderField(r3)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.0wD r2 = r7.A0E     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r33 = r2
            X.0wU r3 = r7.A0I     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.util.concurrent.Executor r2 = X.AnonymousClass6Y6.A00     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            android.os.Handler r25 = X.C36341k9.A0H()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.util.concurrent.atomic.AtomicBoolean r15 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r15.<init>(r12)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r23 = -1
            r14 = 0
            java.io.InputStream r4 = r26.getInputStream()     // Catch:{ all -> 0x0349 }
            java.io.BufferedInputStream r22 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0349 }
            r2 = r22
            r2.<init>(r4)     // Catch:{ all -> 0x0349 }
            java.io.FileOutputStream r21 = new java.io.FileOutputStream     // Catch:{ all -> 0x0333 }
            r2 = r21
            r2.<init>(r6, r12)     // Catch:{ all -> 0x0333 }
            X.6s5 r20 = new X.6s5     // Catch:{ all -> 0x0321 }
            r27 = r20
            r28 = r3
            r29 = r22
            r30 = r6
            r31 = r15
            r32 = r26
            r27.<init>(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0321 }
            r5 = 7
            r4 = r33
            r3 = r20
            r2 = r25
            A01(r2, r4, r3, r5)     // Catch:{ all -> 0x0321 }
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0323 }
            r16 = r2
            r4 = 0
        L_0x0217:
            boolean r2 = r35.A00()     // Catch:{ all -> 0x031d }
            if (r2 != 0) goto L_0x0226
            r15.set(r8)     // Catch:{ all -> 0x031d }
            r26.disconnect()     // Catch:{ all -> 0x031d }
            X.AnonymousClass14X.A02(r22)     // Catch:{ all -> 0x031d }
        L_0x0226:
            boolean r2 = r15.get()     // Catch:{ all -> 0x031d }
            if (r2 != 0) goto L_0x0255
            java.util.Locale r19 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x031d }
            java.lang.String r18 = "gdrive-util/write-file/disconnected after downloading %d bytes from %s to %s (new size: %d)"
            r2 = 4
            java.lang.Object[] r15 = new java.lang.Object[r2]     // Catch:{ all -> 0x031d }
            X.AnonymousClass000.A1M(r15, r8, r4)     // Catch:{ all -> 0x031d }
            java.net.URL r2 = r26.getURL()     // Catch:{ all -> 0x031d }
            r15[r12] = r2     // Catch:{ all -> 0x031d }
            r3 = 2
            java.lang.String r2 = r6.getAbsolutePath()     // Catch:{ all -> 0x031d }
            r15[r3] = r2     // Catch:{ all -> 0x031d }
            long r16 = r6.length()     // Catch:{ all -> 0x031d }
            r14 = 3
            r2 = r16
            X.AnonymousClass000.A1M(r15, r14, r2)     // Catch:{ all -> 0x031d }
            r3 = r18
            r2 = r19
            X.C90494aF.A1J(r3, r2, r15)     // Catch:{ all -> 0x031d }
            goto L_0x0272
        L_0x0255:
            r14 = 8192(0x2000, float:1.14794E-41)
            r3 = r22
            r2 = r16
            int r14 = r3.read(r2, r8, r14)     // Catch:{ IllegalStateException -> 0x026c }
            if (r14 <= 0) goto L_0x0272
            r3 = r21
            r3.write(r2, r8, r14)     // Catch:{ all -> 0x031d }
            long r2 = (long) r14     // Catch:{ all -> 0x031d }
            long r4 = r4 + r2
            r11.BV9(r2)     // Catch:{ all -> 0x031d }
            goto L_0x0217
        L_0x026c:
            r3 = move-exception
            java.lang.String r2 = "gdrive-util/write-file/connection-disconnected-during-read"
            com.whatsapp.util.Log.i(r2, r3)     // Catch:{ all -> 0x031d }
        L_0x0272:
            r21.close()     // Catch:{ all -> 0x0319 }
            r22.close()     // Catch:{ all -> 0x0343 }
            r15 = 8
            r14 = r33
            r3 = r20
            r2 = r25
            A01(r2, r14, r3, r15)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            long r4 = r4 * r23
            r11.BV9(r4)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r6.getAbsolutePath()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r6.length()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            long r3 = r6.length()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x02bb
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.String r2 = "restore>GoogleBackupApi/"
            r13.append(r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.util.Locale r14 = java.util.Locale.ENGLISH     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.String r5 = "save-file/incomplete download, expected: %d bytes, received: %d bytes"
            java.lang.Object[] r4 = X.AnonymousClass001.A0M()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.AnonymousClass000.A1M(r4, r8, r9)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            long r2 = r6.length()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.AnonymousClass000.A1M(r4, r12, r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r2 = 2
            java.lang.String r2 = X.C36391kE.A0y(r5, r14, r4, r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.C36321k7.A1a(r13, r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            goto L_0x03ef
        L_0x02bb:
            long r2 = r6.length()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.String r4 = r13.A03     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.AnonymousClass00C.A07(r4)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            boolean r2 = r7.A05(r6, r4, r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            if (r2 != 0) goto L_0x02df
            boolean r2 = r6.delete()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            if (r2 != 0) goto L_0x03ef
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.String r2 = "restore>GoogleBackupApi/delete-local-file/failed "
            java.lang.String r2 = X.C90514aH.A0x(r6, r2, r3)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.C36321k7.A1Z(r3, r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            goto L_0x03ef
        L_0x02df:
            A03(r13, r6)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r2 = r34
            boolean r2 = r7.A04(r6, r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            if (r2 == 0) goto L_0x02f7
            r2 = -1
            long r2 = (long) r2
            long r2 = r2 * r0
            r11.BV9(r2)
            r26.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r12
        L_0x02f7:
            java.lang.String r2 = r34.getName()     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.AnonymousClass00C.A08(r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            X.4yN r3 = new X.4yN     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r3.<init>(r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            goto L_0x0318
        L_0x0304:
            X.0yC r3 = r7.A07     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r2 = 916(0x394, float:1.284E-42)
            boolean r3 = r3.A0E(r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            r2 = r26
            X.AnonymousClass6UB.A02(r4, r2, r3)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            java.lang.String r2 = "Redex: Unreachable code after no-return invoke"
            r3.<init>(r2)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
        L_0x0318:
            throw r3     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
        L_0x0319:
            r3 = move-exception
            r14 = r20
            goto L_0x0336
        L_0x031d:
            r3 = move-exception
            r14 = r20
            goto L_0x0328
        L_0x0321:
            r3 = move-exception
            goto L_0x0326
        L_0x0323:
            r3 = move-exception
            r14 = r20
        L_0x0326:
            r4 = 0
        L_0x0328:
            r21.close()     // Catch:{ all -> 0x032c }
            goto L_0x0330
        L_0x032c:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ all -> 0x0331 }
        L_0x0330:
            throw r3     // Catch:{ all -> 0x0331 }
        L_0x0331:
            r3 = move-exception
            goto L_0x0336
        L_0x0333:
            r3 = move-exception
            r4 = 0
        L_0x0336:
            r22.close()     // Catch:{ all -> 0x033a }
            goto L_0x033e
        L_0x033a:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ all -> 0x033f }
        L_0x033e:
            throw r3     // Catch:{ all -> 0x033f }
        L_0x033f:
            r9 = move-exception
            if (r14 == 0) goto L_0x0354
            goto L_0x0346
        L_0x0343:
            r9 = move-exception
            r14 = r20
        L_0x0346:
            r6 = 8
            goto L_0x034d
        L_0x0349:
            r9 = move-exception
            r4 = 0
            goto L_0x0354
        L_0x034d:
            r3 = r33
            r2 = r25
            A01(r2, r3, r14, r6)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
        L_0x0354:
            long r4 = r4 * r23
            r11.BV9(r4)     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
            throw r9     // Catch:{ UnknownHostException -> 0x03da, IOException -> 0x035a }
        L_0x035a:
            r3 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03fc }
            java.lang.String r4 = "restore>GoogleBackupApi/save-file error while downloading file "
            r2 = r34
            X.C36321k7.A1M(r2, r4, r5, r3)     // Catch:{ all -> 0x03fc }
            java.lang.String r5 = r3.getMessage()     // Catch:{ all -> 0x03fc }
            if (r5 == 0) goto L_0x039a
            java.lang.String r2 = "ENOSPC"
            boolean r2 = X.AnonymousClass099.A0O(r5, r2, r8)     // Catch:{ all -> 0x03fc }
            if (r2 != 0) goto L_0x038f
            java.lang.String r2 = "ENAMETOOLONG"
            boolean r2 = X.AnonymousClass099.A0O(r5, r2, r8)     // Catch:{ all -> 0x03fc }
            if (r2 != 0) goto L_0x0384
            java.lang.String r2 = "(File name too long)"
            boolean r2 = X.AnonymousClass099.A0O(r5, r2, r8)     // Catch:{ all -> 0x03fc }
            if (r2 == 0) goto L_0x039a
        L_0x0384:
            java.lang.String r2 = "restore>GoogleBackupApi/save-file name too long"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x03fc }
            X.4yT r2 = new X.4yT     // Catch:{ all -> 0x03fc }
            r2.<init>(r5)     // Catch:{ all -> 0x03fc }
        L_0x038e:
            throw r2     // Catch:{ all -> 0x03fc }
        L_0x038f:
            java.lang.String r2 = "restore>GoogleBackupApi/save-file no space left on the device."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x03fc }
            X.4yL r2 = new X.4yL     // Catch:{ all -> 0x03fc }
            r2.<init>()     // Catch:{ all -> 0x03fc }
            goto L_0x038e
        L_0x039a:
            X.179 r4 = r7.A0F     // Catch:{ all -> 0x03fc }
            r2 = r34
            boolean r2 = r4.A0B(r2)     // Catch:{ all -> 0x03fc }
            if (r2 == 0) goto L_0x03b2
            X.0yE r2 = r7.A0G     // Catch:{ all -> 0x03fc }
            boolean r2 = r2.A0H()     // Catch:{ all -> 0x03fc }
            if (r2 == 0) goto L_0x03b2
            X.4yP r2 = new X.4yP     // Catch:{ all -> 0x03fc }
            r2.<init>(r3)     // Catch:{ all -> 0x03fc }
            goto L_0x038e
        L_0x03b2:
            if (r5 == 0) goto L_0x03ef
            java.lang.String r2 = "EACCES"
            boolean r2 = X.AnonymousClass099.A0O(r5, r2, r8)     // Catch:{ all -> 0x03fc }
            if (r2 != 0) goto L_0x03cf
            java.lang.String r2 = "EPERM"
            boolean r2 = X.AnonymousClass099.A0O(r5, r2, r8)     // Catch:{ all -> 0x03fc }
            if (r2 == 0) goto L_0x03ef
            java.lang.String r2 = "restore>GoogleBackupApi/save-file EPERM"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x03fc }
            X.4yM r2 = new X.4yM     // Catch:{ all -> 0x03fc }
            r2.<init>(r3)     // Catch:{ all -> 0x03fc }
            goto L_0x038e
        L_0x03cf:
            java.lang.String r2 = "restore>GoogleBackupApi/save-file EACCES"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x03fc }
            X.4yP r2 = new X.4yP     // Catch:{ all -> 0x03fc }
            r2.<init>(r3)     // Catch:{ all -> 0x03fc }
            goto L_0x038e
        L_0x03da:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03fc }
            java.lang.String r2 = "restore>GoogleBackupApi/save-file unable to access "
            r3.append(r2)     // Catch:{ all -> 0x03fc }
            java.net.URL r2 = r26.getURL()     // Catch:{ all -> 0x03fc }
            java.lang.String r2 = X.AnonymousClass000.A0o(r2, r3)     // Catch:{ all -> 0x03fc }
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x03fc }
        L_0x03ef:
            r2 = -1
            long r2 = (long) r2     // Catch:{ all -> 0x03fc }
            long r2 = r2 * r0
            r11.BV9(r2)
            r26.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r8
        L_0x03fc:
            r4 = move-exception
            r2 = -1
            long r2 = (long) r2
            long r2 = r2 * r0
            r11.BV9(r2)
            r26.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r4
        L_0x040a:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0411 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0411 }
            throw r0     // Catch:{ IOException -> 0x0411 }
        L_0x0411:
            r1 = move-exception
            java.lang.String r0 = "restore>GoogleBackupApi/save-file"
            com.whatsapp.util.Log.e(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133226Xi.A0E(X.7fU, X.1el, X.6Pk, java.io.File):boolean");
    }

    public static void A01(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new AVa(obj, obj2, i));
    }

    public static void A02(C130606Ls r4, HttpURLConnection httpURLConnection, AtomicLong atomicLong, long j) {
        r4.A03.BVA(((long) -1) * (atomicLong.get() + j));
        httpURLConnection.disconnect();
        TrafficStats.clearThreadStatsTag();
    }

    public static final void A03(C131526Pk r5, File file) {
        String str;
        long j = r5.A01;
        if (j <= 0) {
            str = C36381kD.A0z("GoogleBackupApi/set-local-creation-date-from-remote-file remote file update time is:", AnonymousClass000.A0u(), j);
        } else if (!file.setLastModified(j)) {
            str = "GoogleBackupApi/set-local-creation-date-from-remote-file/set-last-modified time failed";
        } else {
            return;
        }
        Log.i(str);
    }

    private final boolean A04(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C90464aC.A1A(file, "restore>GoogleBackupApi/rename-local/file/failed copying and deleting:", A0u);
        C36341k9.A1O(A0u, C90514aH.A0x(file2, " -> ", A0u));
        try {
            AnonymousClass6YY.A0B(this.A0H, file, file2);
            if (AnonymousClass6YY.A0P(file)) {
                return true;
            }
            Log.e("restore>GoogleBackupApi/rename-local/file/failed to delete file after copy");
            return false;
        } catch (IOException | SecurityException e) {
            Log.e("restore>GoogleBackupApi/rename-local/file/failed with exception", e);
            return false;
        }
    }

    private final boolean A05(File file, String str, long j) {
        String A042 = C34191gb.A04(this.A0F, this.A0G, file, j);
        if (str.equals(A042)) {
            return true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C90464aC.A1A(file, "restore>GoogleBackupApi/save-file/check-md5 ", A0u);
        A0u.append(" downloaded but its MD5(");
        A0u.append(A042);
        A0u.append(") does not match remote md5(");
        A0u.append(str);
        C36321k7.A1Z(A0u, ").");
        return false;
    }

    public final C132346Te A07(String str) {
        HttpsURLConnection httpsURLConnection;
        Throwable th;
        C132346Te r13 = null;
        if (A0D()) {
            Log.i("GoogleBackupApi/get-backup/api disabled");
            return null;
        }
        TrafficStats.setThreadStatsTag(13);
        try {
            String str2 = str;
            String A0p = AnonymousClass000.A0p("clients/wa/backups/", str2, AnonymousClass000.A0u());
            httpsURLConnection = A09("GET", A0p, (String) null, (Map) null, C36371kC.A1V(A0p));
            try {
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    C20810yC r7 = this.A07;
                    C19700wN r3 = this.A03;
                    C24431Ck r5 = this.A05;
                    C24461Cn r4 = this.A04;
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    AnonymousClass00C.A08(inputStream);
                    r13 = C109795Zd.A00(r3, r4, r5, this, r7, inputStream, str2);
                } else if (responseCode == 401) {
                    A0C();
                } else if (responseCode != 429) {
                    if (responseCode == 403) {
                        th = new C101784yH();
                    } else if (responseCode != 404) {
                        httpsURLConnection.getURL();
                        String A0h = C90474aD.A0h(httpsURLConnection);
                        C36321k7.A1P("GoogleBackupApi/get-backup/failed ", A0h, AnonymousClass000.A0u());
                        th = new C101894yS(A0h, -1);
                    } else {
                        th = new C101764yF(C90474aD.A0h(httpsURLConnection));
                    }
                    throw th;
                } else {
                    AnonymousClass6UB.A02("get-backup", httpsURLConnection, this.A07.A0E(916));
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                httpsURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                return r13;
            } catch (IOException e) {
                e = e;
                try {
                    Log.e((Throwable) e);
                    throw new C101894yS(e);
                } catch (Throwable th2) {
                    th = th2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            httpsURLConnection = null;
            Log.e((Throwable) e);
            throw new C101894yS(e);
        } catch (Throwable th3) {
            th = th3;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0554, code lost:
        if (r6.length() == 0) goto L_0x0556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0595, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        X.C05600Qi.A00(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0608, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        X.C05600Qi.A00(r17, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x060e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x060f, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0611, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0613, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:?, code lost:
        A01(r7, r10, r9, 18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0621, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0677, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0683, code lost:
        X.C05600Qi.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01e3, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x061b  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0621 A[ExcHandler: FileNotFoundException (r0v23 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), PHI: r9 
      PHI: (r9v3 X.6s3) = (r9v6 X.6s3), (r9v9 X.6s3), (r9v9 X.6s3), (r9v9 X.6s3), (r9v9 X.6s3), (r9v9 X.6s3), (r9v9 X.6s3) binds: [B:275:0x060b, B:248:0x05e1, B:249:?, B:179:0x04ef, B:180:?, B:153:0x0469, B:154:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:128:0x03db] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:248:0x05e1=Splitter:B:248:0x05e1, B:260:0x05f3=Splitter:B:260:0x05f3} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:312:0x0671=Splitter:B:312:0x0671, B:122:0x03c5=Splitter:B:122:0x03c5} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C131526Pk A08(X.AnonymousClass7fV r34, X.C33131el r35, X.C132346Te r36, X.AnonymousClass6FR r37, int r38) {
        /*
            r33 = this;
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.util.regex.Pattern r0 = X.C130606Ls.A0G     // Catch:{ all -> 0x06be }
            r9 = r33
            X.0yC r8 = r9.A07     // Catch:{ all -> 0x06be }
            X.0wN r7 = r9.A03     // Catch:{ all -> 0x06be }
            X.179 r6 = r9.A0F     // Catch:{ all -> 0x06be }
            X.1Ck r5 = r9.A05     // Catch:{ all -> 0x06be }
            X.6Ns r4 = r9.A0D     // Catch:{ all -> 0x06be }
            X.0yE r3 = r9.A0G     // Catch:{ all -> 0x06be }
            X.0wD r1 = r9.A0E     // Catch:{ all -> 0x06be }
            X.0wU r0 = r9.A0I     // Catch:{ all -> 0x06be }
            X.6Ls r2 = new X.6Ls     // Catch:{ all -> 0x06be }
            r13 = r34
            r15 = r35
            r16 = r36
            r18 = r37
            r10 = r2
            r11 = r7
            r12 = r5
            r14 = r4
            r17 = r9
            r19 = r1
            r20 = r6
            r21 = r3
            r22 = r8
            r23 = r0
            r24 = r38
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x06be }
            X.6FR r0 = r2.A08     // Catch:{ all -> 0x06be }
            r32 = r0
            java.io.File r0 = r32.A01()     // Catch:{ all -> 0x06be }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x06be }
            if (r0 == 0) goto L_0x0699
            java.lang.String r7 = " are not identical to ones on the disk, so, we will have to re-upload them"
            X.6Ns r0 = r2.A04     // Catch:{ all -> 0x06be }
            r31 = r0
            java.lang.String r12 = r2.A0E     // Catch:{ all -> 0x06be }
            r0 = r32
            java.lang.String r8 = r0.A03     // Catch:{ all -> 0x06be }
            android.content.SharedPreferences r1 = X.C131096Ns.A00(r31)     // Catch:{ all -> 0x06be }
            java.lang.String r4 = "-"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x06be }
            java.lang.String r3 = "gbackup-ResumableUrl-"
            X.C36321k7.A1O(r3, r12, r4, r8, r0)     // Catch:{ all -> 0x06be }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x06be }
            java.lang.String r10 = X.C36371kC.A0t(r1, r0)     // Catch:{ all -> 0x06be }
            if (r10 != 0) goto L_0x006f
            android.util.Pair r0 = X.C130606Ls.A0F     // Catch:{ all -> 0x06be }
            goto L_0x01ed
        L_0x006f:
            X.1el r0 = r2.A05     // Catch:{ all -> 0x06be }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x06be }
            r5 = 0
            if (r0 != 0) goto L_0x007a
            goto L_0x01ec
        L_0x007a:
            long r0 = r32.A00()     // Catch:{ IOException -> 0x01e4 }
            X.6Xi r9 = r2.A07     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r14 = "PUT"
            r11 = 0
            r17 = r5
            r18 = 0
            r16 = r5
            r15 = r10
            r13 = r9
            javax.net.ssl.HttpsURLConnection r14 = r13.A0A(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x01e4 }
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x01e4 }
            r13 = 1
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ IOException -> 0x01e4 }
            X.AnonymousClass000.A1M(r15, r11, r0)     // Catch:{ IOException -> 0x01e4 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r15, r13)     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r0 = "bytes */%d"
            java.lang.String r1 = X.C90494aF.A0e(r6, r0, r1)     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r0 = "Content-Range"
            r14.addRequestProperty(r0, r1)     // Catch:{ IOException -> 0x01e4 }
            r14.connect()     // Catch:{ IOException -> 0x01e4 }
            r14.getURL()     // Catch:{ IOException -> 0x01e4 }
            r14.getRequestMethod()     // Catch:{ IOException -> 0x01e4 }
            X.5Ae r6 = new X.5Ae     // Catch:{ IOException -> 0x01e4 }
            r6.<init>(r14)     // Catch:{ IOException -> 0x01e4 }
            java.net.HttpURLConnection r14 = r6.A01     // Catch:{ all -> 0x01dd }
            int r15 = r14.getResponseCode()     // Catch:{ all -> 0x01dd }
            r0 = 308(0x134, float:4.32E-43)
            if (r15 == r0) goto L_0x010a
            r0 = 401(0x191, float:5.62E-43)
            if (r15 == r0) goto L_0x0104
            r0 = 403(0x193, float:5.65E-43)
            if (r15 == r0) goto L_0x00ea
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "GoogleBackupApi/upload-file/unexpected-response-code "
            r1.append(r0)     // Catch:{ all -> 0x01dd }
            r1.append(r15)     // Catch:{ all -> 0x01dd }
            r0 = 32
            r1.append(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r14.getResponseMessage()     // Catch:{ all -> 0x01dd }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x01dd }
            r14.getResponseCode()     // Catch:{ all -> 0x01dd }
            r14.getResponseMessage()     // Catch:{ all -> 0x01dd }
            r0 = r31
            r0.A02(r12, r8)     // Catch:{ all -> 0x01dd }
            goto L_0x0107
        L_0x00ea:
            javax.net.ssl.HttpsURLConnection r0 = r6.A00     // Catch:{ all -> 0x01dd }
            java.lang.String r7 = X.C90474aD.A0h(r0)     // Catch:{ all -> 0x01dd }
            r0 = r31
            r0.A02(r12, r8)     // Catch:{ all -> 0x01dd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "GoogleBackupApi/api disabled upload-file "
            X.C36321k7.A1P(r0, r7, r1)     // Catch:{ all -> 0x01dd }
            X.4yH r0 = new X.4yH     // Catch:{ all -> 0x01dd }
            r0.<init>()     // Catch:{ all -> 0x01dd }
            throw r0     // Catch:{ all -> 0x01dd }
        L_0x0104:
            r9.A0C()     // Catch:{ all -> 0x01dd }
        L_0x0107:
            r0 = r5
            goto L_0x01d9
        L_0x010a:
            r14.getResponseCode()     // Catch:{ all -> 0x01dd }
            r14.getResponseMessage()     // Catch:{ all -> 0x01dd }
            java.lang.String r1 = "Range"
            java.util.Map r0 = r14.getHeaderFields()     // Catch:{ all -> 0x01dd }
            java.util.List r9 = X.C90524aI.A0o(r1, r0)     // Catch:{ all -> 0x01dd }
            if (r9 == 0) goto L_0x01d2
            int r0 = r9.size()     // Catch:{ all -> 0x01dd }
            if (r0 != r13) goto L_0x01b5
            java.util.regex.Pattern r1 = X.C130606Ls.A0G     // Catch:{ all -> 0x01dd }
            java.lang.Object r0 = r9.get(r11)     // Catch:{ all -> 0x01dd }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x01dd }
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ all -> 0x01dd }
            boolean r0 = r1.find()     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = r1.group(r13)     // Catch:{ all -> 0x01dd }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x01dd }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x01dd }
            r15 = 1
            long r0 = r0 + r15
            java.lang.String r9 = "X-Range-MD5"
            java.lang.String r11 = r14.getHeaderField(r9)     // Catch:{ all -> 0x01dd }
            X.179 r13 = r2.A0A     // Catch:{ all -> 0x01dd }
            X.0yE r9 = r2.A0B     // Catch:{ all -> 0x01dd }
            java.io.File r14 = r32.A01()     // Catch:{ all -> 0x01dd }
            java.lang.String r13 = X.C34191gb.A04(r13, r9, r14, r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r9 = "gdrive-api/save-file/check-md5 "
            if (r11 != 0) goto L_0x0176
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            X.C90464aC.A1A(r14, r9, r10)     // Catch:{ all -> 0x01dd }
            java.lang.String r9 = " downloaded but its remote md5 is null."
        L_0x0161:
            X.C36321k7.A1Z(r10, r9)     // Catch:{ all -> 0x01dd }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            java.lang.String r9 = "GoogleBackupApi/upload-file for a file bytes already uploaded: "
            r10.append(r9)     // Catch:{ all -> 0x01dd }
            r10.append(r0)     // Catch:{ all -> 0x01dd }
            X.C36341k9.A1O(r10, r7)     // Catch:{ all -> 0x01dd }
            android.util.Pair r0 = X.C130606Ls.A0F     // Catch:{ all -> 0x01dd }
            goto L_0x01d9
        L_0x0176:
            boolean r15 = r11.equals(r13)     // Catch:{ all -> 0x01dd }
            if (r15 != 0) goto L_0x0196
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            X.C90464aC.A1A(r14, r9, r10)     // Catch:{ all -> 0x01dd }
            java.lang.String r9 = " downloaded but its MD5("
            r10.append(r9)     // Catch:{ all -> 0x01dd }
            r10.append(r13)     // Catch:{ all -> 0x01dd }
            java.lang.String r9 = ") does not match remote md5("
            r10.append(r9)     // Catch:{ all -> 0x01dd }
            r10.append(r11)     // Catch:{ all -> 0x01dd }
            java.lang.String r9 = ")."
            goto L_0x0161
        L_0x0196:
            r32.A00()     // Catch:{ all -> 0x01dd }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01dd }
            android.util.Pair r0 = android.util.Pair.create(r10, r0)     // Catch:{ all -> 0x01dd }
            goto L_0x01d9
        L_0x01a2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "GoogleBackupApi/upload-file cannot find uploaded length in "
            r1.append(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = X.C36401kF.A0s(r9, r11)     // Catch:{ all -> 0x01dd }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x01dd }
            android.util.Pair r0 = X.C130606Ls.A0F     // Catch:{ all -> 0x01dd }
            goto L_0x01d9
        L_0x01b5:
            int r0 = r9.size()     // Catch:{ all -> 0x01dd }
            if (r0 <= r13) goto L_0x01d2
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "GoogleBackupApi/upload-file error: multiple range headers, ignoring: "
            r7.append(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r1 = " "
            java.lang.String r0 = ""
            java.lang.String r0 = X.C007103b.A0Q(r1, r0, r0, r9, r5)     // Catch:{ all -> 0x01dd }
            X.C36321k7.A1Z(r7, r0)     // Catch:{ all -> 0x01dd }
            android.util.Pair r0 = X.C130606Ls.A0F     // Catch:{ all -> 0x01dd }
            goto L_0x01d9
        L_0x01d2:
            r0 = r31
            r0.A02(r12, r8)     // Catch:{ all -> 0x01dd }
            android.util.Pair r0 = X.C130606Ls.A0F     // Catch:{ all -> 0x01dd }
        L_0x01d9:
            r6.close()     // Catch:{ IOException -> 0x01e4 }
            goto L_0x01ed
        L_0x01dd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01df }
        L_0x01df:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ IOException -> 0x01e4 }
            throw r0     // Catch:{ IOException -> 0x01e4 }
        L_0x01e4:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x06be }
            r0 = r5
            goto L_0x01ed
        L_0x01ec:
            r0 = r5
        L_0x01ed:
            r26 = 0
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = "GoogleBackupApi/upload-file/error-while-fetching-previous-upload-session"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x06be }
            goto L_0x0695
        L_0x01f8:
            java.lang.Object r10 = r0.first     // Catch:{ all -> 0x06be }
            if (r10 == 0) goto L_0x0213
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x06be }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x06be }
            X.AnonymousClass00C.A07(r0)     // Catch:{ all -> 0x06be }
            long r0 = X.C36431kI.A09(r0)     // Catch:{ all -> 0x06be }
            X.7fV r3 = r2.A03     // Catch:{ all -> 0x06be }
            r3.BVA(r0)     // Catch:{ all -> 0x06be }
            if (r10 != 0) goto L_0x03ce
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()     // Catch:{ FileNotFoundException -> 0x062c }
            throw r0     // Catch:{ FileNotFoundException -> 0x062c }
        L_0x0213:
            X.1el r0 = r2.A05     // Catch:{ all -> 0x06be }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x06be }
            if (r0 == 0) goto L_0x068d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ URISyntaxException -> 0x067c }
            java.lang.String r0 = "/upload/v1/clients/wa/backups/"
            r1.append(r0)     // Catch:{ URISyntaxException -> 0x067c }
            X.6Te r6 = r2.A06     // Catch:{ URISyntaxException -> 0x067c }
            java.lang.String r0 = r6.A0A     // Catch:{ URISyntaxException -> 0x067c }
            r1.append(r0)     // Catch:{ URISyntaxException -> 0x067c }
            java.lang.String r0 = "/files/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r8, r1)     // Catch:{ URISyntaxException -> 0x067c }
            java.lang.String r15 = A00(r0)     // Catch:{ URISyntaxException -> 0x067c }
            r0 = 3
            X.011[] r5 = new X.AnonymousClass011[r0]     // Catch:{ IOException -> 0x0687 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0687 }
            java.lang.String r1 = r6.A00     // Catch:{ all -> 0x0679 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x0687 }
            X.C18740tg.A06(r1)     // Catch:{ IOException -> 0x0687 }
            java.lang.String r0 = "transaction_id"
            X.C90464aC.A1E(r0, r1, r5)     // Catch:{ IOException -> 0x0687 }
            int r0 = r2.A00     // Catch:{ IOException -> 0x0687 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0687 }
            java.lang.String r0 = "retryCount"
            X.C90464aC.A1F(r0, r1, r5)     // Catch:{ IOException -> 0x0687 }
            java.lang.String r1 = "uploadType"
            java.lang.String r0 = "resumable"
            X.C90474aD.A1F(r1, r0, r5)     // Catch:{ IOException -> 0x0687 }
            java.util.LinkedHashMap r17 = X.C000400e.A08(r5)     // Catch:{ IOException -> 0x0687 }
            r0 = r32
            X.6Cl r11 = r0.A01     // Catch:{ IOException -> 0x0687 }
            if (r11 == 0) goto L_0x02a5
            X.1Ck r6 = r11.A02     // Catch:{ IOException -> 0x0687 }
            X.0v0 r0 = r6.A03     // Catch:{ IOException -> 0x0687 }
            boolean r0 = r0.A2I()     // Catch:{ IOException -> 0x0687 }
            r5 = 0
            if (r0 == 0) goto L_0x02ad
            android.text.format.Time r7 = new android.text.format.Time     // Catch:{ JSONException -> 0x02a7 }
            r7.<init>()     // Catch:{ JSONException -> 0x02a7 }
            long r0 = r11.A01     // Catch:{ JSONException -> 0x02a7 }
            r7.set(r0)     // Catch:{ JSONException -> 0x02a7 }
            org.json.JSONObject r9 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x02a7 }
            java.lang.String r1 = "name"
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x02a7 }
            org.json.JSONObject r9 = r9.put(r1, r0)     // Catch:{ JSONException -> 0x02a7 }
            java.lang.String r1 = "md5Hash"
            java.lang.String r0 = r11.A03     // Catch:{ JSONException -> 0x02a7 }
            org.json.JSONObject r10 = r9.put(r1, r0)     // Catch:{ JSONException -> 0x02a7 }
            java.lang.String r9 = "sizeBytes"
            long r0 = r11.A00     // Catch:{ JSONException -> 0x02a7 }
            org.json.JSONObject r9 = r10.put(r9, r0)     // Catch:{ JSONException -> 0x02a7 }
            java.lang.String r1 = "updateTime"
            r0 = 0
            java.lang.String r0 = r7.format3339(r0)     // Catch:{ JSONException -> 0x02a7 }
            org.json.JSONObject r0 = r9.put(r1, r0)     // Catch:{ JSONException -> 0x02a7 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x02a7 }
            java.lang.String r5 = r6.A01(r0)     // Catch:{ JSONException -> 0x02a7 }
            goto L_0x02ad
        L_0x02a5:
            r5 = 0
            goto L_0x02ad
        L_0x02a7:
            r1 = move-exception
            java.lang.String r0 = "gdrive/file-metadata/failed to create metadata"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0687 }
        L_0x02ad:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0687 }
            java.lang.String r0 = "{\"mimeType\":\"application/binary\""
            r6.append(r0)     // Catch:{ IOException -> 0x0687 }
            if (r5 == 0) goto L_0x02cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0687 }
            java.lang.String r0 = ",\"metadata\":\""
            r1.append(r0)     // Catch:{ IOException -> 0x0687 }
            r1.append(r5)     // Catch:{ IOException -> 0x0687 }
            r0 = 34
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r0)     // Catch:{ IOException -> 0x0687 }
            goto L_0x02cd
        L_0x02cb:
            java.lang.String r0 = ""
        L_0x02cd:
            r6.append(r0)     // Catch:{ IOException -> 0x0687 }
            java.lang.String r9 = X.AnonymousClass000.A0s(r6)     // Catch:{ IOException -> 0x0687 }
            X.6Xi r0 = r2.A07     // Catch:{ IOException -> 0x0687 }
            r1 = 1
            java.lang.String r14 = "PUT"
            java.lang.String r16 = "application/json; charset=UTF-8"
            r18 = 1
            r13 = r0
            javax.net.ssl.HttpsURLConnection r7 = r13.A0A(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0687 }
            long r5 = r32.A00()     // Catch:{ IOException -> 0x0687 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0687 }
            java.lang.String r5 = "X-Upload-Content-Length"
            r7.setRequestProperty(r5, r6)     // Catch:{ IOException -> 0x0687 }
            r7.getURL()     // Catch:{ IOException -> 0x0687 }
            r7.getRequestMethod()     // Catch:{ IOException -> 0x0687 }
            r7.connect()     // Catch:{ IOException -> 0x0687 }
            java.io.OutputStream r6 = r7.getOutputStream()     // Catch:{ IOException -> 0x0687 }
            byte[] r5 = X.C36351kA.A1b(r9)     // Catch:{ IOException -> 0x0687 }
            r6.write(r5)     // Catch:{ IOException -> 0x0687 }
            r7.getResponseCode()     // Catch:{ IOException -> 0x0687 }
            r7.getResponseMessage()     // Catch:{ IOException -> 0x0687 }
            X.5Ae r5 = new X.5Ae     // Catch:{ IOException -> 0x0687 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0687 }
            java.net.HttpURLConnection r10 = r5.A01     // Catch:{ all -> 0x0675 }
            int r6 = r10.getResponseCode()     // Catch:{ all -> 0x0675 }
            r10.getResponseMessage()     // Catch:{ all -> 0x0675 }
            r9 = 200(0xc8, float:2.8E-43)
            r7 = 0
            if (r6 == r9) goto L_0x0382
            r1 = 401(0x191, float:5.62E-43)
            if (r6 == r1) goto L_0x037d
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r4 = "upload-file"
            if (r6 == r0) goto L_0x035e
            r0 = 403(0x193, float:5.65E-43)
            if (r6 == r0) goto L_0x0349
            r0 = 404(0x194, float:5.66E-43)
            if (r6 == r0) goto L_0x0371
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0675 }
            java.lang.String r0 = "GoogleBackupApi/upload-file/unexpected-response/"
            X.C36321k7.A1S(r0, r1, r6)     // Catch:{ all -> 0x0675 }
            javax.net.ssl.HttpsURLConnection r0 = r5.A00     // Catch:{ all -> 0x0675 }
            java.lang.String r3 = X.C90474aD.A0h(r0)     // Catch:{ all -> 0x0675 }
            X.0wN r0 = r2.A01     // Catch:{ all -> 0x0675 }
            X.C109805Ze.A00(r0, r4, r6)     // Catch:{ all -> 0x0675 }
            r1 = -1
            X.4yS r0 = new X.4yS     // Catch:{ all -> 0x0675 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0675 }
            throw r0     // Catch:{ all -> 0x0675 }
        L_0x0349:
            javax.net.ssl.HttpsURLConnection r0 = r5.A00     // Catch:{ all -> 0x0675 }
            java.lang.String r2 = X.C90474aD.A0h(r0)     // Catch:{ all -> 0x0675 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0675 }
            java.lang.String r0 = "GoogleBackupApi/api disabled upload-file "
            X.C36321k7.A1P(r0, r2, r1)     // Catch:{ all -> 0x0675 }
            X.4yH r1 = new X.4yH     // Catch:{ all -> 0x0675 }
            r1.<init>()     // Catch:{ all -> 0x0675 }
            goto L_0x037c
        L_0x035e:
            X.0yC r1 = r2.A0C     // Catch:{ all -> 0x0675 }
            r0 = 916(0x394, float:1.284E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0675 }
            X.AnonymousClass6UB.A00(r5, r4, r0)     // Catch:{ all -> 0x0675 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0675 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)     // Catch:{ all -> 0x0675 }
            goto L_0x037c
        L_0x0371:
            javax.net.ssl.HttpsURLConnection r0 = r5.A00     // Catch:{ all -> 0x0675 }
            java.lang.String r0 = X.C90474aD.A0h(r0)     // Catch:{ all -> 0x0675 }
            X.4yF r1 = new X.4yF     // Catch:{ all -> 0x0675 }
            r1.<init>(r0)     // Catch:{ all -> 0x0675 }
        L_0x037c:
            throw r1     // Catch:{ all -> 0x0675 }
        L_0x037d:
            r0.A0C()     // Catch:{ all -> 0x0675 }
            goto L_0x0671
        L_0x0382:
            javax.net.ssl.HttpsURLConnection r0 = r5.A00     // Catch:{ all -> 0x0675 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ all -> 0x0675 }
            X.AnonymousClass14X.A00(r0)     // Catch:{ all -> 0x0675 }
            java.lang.String r6 = "Location"
            java.util.Map r0 = r10.getHeaderFields()     // Catch:{ all -> 0x0675 }
            java.util.List r6 = X.C90524aI.A0o(r6, r0)     // Catch:{ all -> 0x0675 }
            if (r6 == 0) goto L_0x0652
            int r0 = r6.size()     // Catch:{ all -> 0x0675 }
            if (r0 != r1) goto L_0x0652
            r6.get(r7)     // Catch:{ all -> 0x0675 }
            java.lang.String r10 = X.C36401kF.A0s(r6, r7)     // Catch:{ all -> 0x0675 }
            android.content.SharedPreferences r0 = X.C131096Ns.A00(r31)     // Catch:{ all -> 0x0675 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0675 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0675 }
            X.C36321k7.A1O(r3, r12, r4, r8, r0)     // Catch:{ all -> 0x0675 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0675 }
            r1.putString(r0, r10)     // Catch:{ all -> 0x0675 }
            boolean r0 = r1.commit()     // Catch:{ all -> 0x0675 }
            if (r0 != 0) goto L_0x03c5
            java.lang.String r0 = "gdrive-api/insert-resumable-uri unable to commit resumable uri to shared prefs."
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0675 }
        L_0x03c5:
            r5.close()     // Catch:{ IOException -> 0x0687 }
            r0 = 0
            if (r10 != 0) goto L_0x03ce
            goto L_0x068d
        L_0x03ce:
            long r18 = r32.A00()     // Catch:{ FileNotFoundException -> 0x062c }
            r5 = 1
            long r3 = r18 - r5
            android.os.Handler r7 = X.C36341k9.A0H()     // Catch:{ FileNotFoundException -> 0x062c }
            r9 = 0
            java.io.File r5 = r32.A01()     // Catch:{ FileNotFoundException -> 0x0621, IOException -> 0x0613, all -> 0x0611 }
            java.io.FileInputStream r17 = X.C90524aI.A0U(r5)     // Catch:{ FileNotFoundException -> 0x0621, IOException -> 0x0613, all -> 0x0611 }
            r5 = r17
            long r5 = r5.skip(r0)     // Catch:{ IOException -> 0x05fa }
            int r11 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x0408
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x05fa }
            java.lang.String r11 = "GoogleBackupApi/upload-file/ "
            r13.append(r11)     // Catch:{ IOException -> 0x05fa }
            java.lang.String r11 = "<file>"
            r13.append(r11)     // Catch:{ IOException -> 0x05fa }
            java.lang.String r11 = " seek required: "
            r13.append(r11)     // Catch:{ IOException -> 0x05fa }
            r13.append(r0)     // Catch:{ IOException -> 0x05fa }
            java.lang.String r11 = " seek actual: "
            X.C36341k9.A1M(r11, r13, r5)     // Catch:{ IOException -> 0x05fa }
        L_0x0408:
            X.1el r5 = r2.A05     // Catch:{ all -> 0x0605 }
            r27 = r5
            boolean r5 = r27.A00()     // Catch:{ all -> 0x0605 }
            if (r5 == 0) goto L_0x05f3
            X.6Xi r5 = r2.A07     // Catch:{ all -> 0x0605 }
            r20 = r5
            boolean r5 = r20.A0D()     // Catch:{ all -> 0x0605 }
            if (r5 == 0) goto L_0x0426
            java.lang.String r0 = "GoogleBackupApi/upload-file/interrupted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0423 }
            goto L_0x05f3
        L_0x0423:
            r3 = move-exception
            goto L_0x0607
        L_0x0426:
            r5 = 1
            X.011[] r9 = new X.AnonymousClass011[r5]     // Catch:{ all -> 0x0605 }
            java.lang.String r6 = "retryCount"
            int r5 = r2.A00     // Catch:{ all -> 0x0605 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0605 }
            X.011 r6 = X.C36441kJ.A19(r6, r5)     // Catch:{ all -> 0x0605 }
            r5 = 0
            r9[r5] = r6     // Catch:{ all -> 0x0605 }
            java.util.LinkedHashMap r24 = X.C000400e.A08(r9)     // Catch:{ all -> 0x0605 }
            r6 = 13
            android.net.TrafficStats.setThreadStatsTag(r6)     // Catch:{ all -> 0x0605 }
            java.lang.String r21 = "PUT"
            java.lang.String r23 = "application/binary"
            r25 = 1
            r22 = r10
            javax.net.ssl.HttpsURLConnection r11 = r20.A0A(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0605 }
            java.util.concurrent.atomic.AtomicBoolean r16 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0605 }
            r6 = r16
            r6.<init>(r5)     // Catch:{ all -> 0x0605 }
            X.6s3 r9 = new X.6s3     // Catch:{ all -> 0x0605 }
            r9.<init>(r2, r6, r11)     // Catch:{ all -> 0x0605 }
            r5 = 17
            A01(r7, r2, r9, r5)     // Catch:{ all -> 0x05f1 }
            boolean r5 = r16.get()     // Catch:{ all -> 0x05f1 }
            if (r5 == 0) goto L_0x0473
            java.lang.String r0 = "GoogleBackupApi/upload-file/request-aborted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05f1 }
            r17.close()     // Catch:{ FileNotFoundException -> 0x0621, IOException -> 0x060f }
            r0 = 18
            A01(r7, r2, r9, r0)     // Catch:{ FileNotFoundException -> 0x062c }
            goto L_0x0695
        L_0x0473:
            r5 = 0
            java.util.concurrent.atomic.AtomicLong r10 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x05f1 }
            r10.<init>(r5)     // Catch:{ all -> 0x05f1 }
            java.lang.String r13 = "Content-Range"
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.String r5 = "bytes "
            r14.append(r5)     // Catch:{ IllegalStateException -> 0x05d1 }
            r14.append(r0)     // Catch:{ IllegalStateException -> 0x05d1 }
            r5 = 45
            r14.append(r5)     // Catch:{ IllegalStateException -> 0x05d1 }
            r14.append(r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            r5 = 47
            r14.append(r5)     // Catch:{ IllegalStateException -> 0x05d1 }
            r5 = r18
            java.lang.String r5 = X.C36411kG.A11(r14, r5)     // Catch:{ IllegalStateException -> 0x05d1 }
            r11.addRequestProperty(r13, r5)     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.String r13 = "Content-Length"
            long r3 = r3 - r0
            r5 = 1
            long r3 = r3 + r5
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            r11.addRequestProperty(r13, r5)     // Catch:{ IllegalStateException -> 0x05d1 }
            r11.setFixedLengthStreamingMode(r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            r11.getURL()     // Catch:{ IllegalStateException -> 0x05d1 }
            r11.getRequestMethod()     // Catch:{ IllegalStateException -> 0x05d1 }
            r11.connect()     // Catch:{ IllegalStateException -> 0x05d1 }
            java.io.OutputStream r3 = r11.getOutputStream()     // Catch:{ IllegalStateException -> 0x05d1 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            java.io.BufferedOutputStream r14 = new java.io.BufferedOutputStream     // Catch:{ IllegalStateException -> 0x05d1 }
            r14.<init>(r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            r3 = 16384(0x4000, float:2.2959E-41)
            byte[] r15 = new byte[r3]     // Catch:{ all -> 0x058e }
        L_0x04c7:
            boolean r3 = r27.A00()     // Catch:{ all -> 0x058e }
            r13 = 0
            if (r3 != 0) goto L_0x04cf
            goto L_0x04e6
        L_0x04cf:
            r4 = 16384(0x4000, float:2.2959E-41)
            r3 = r17
            int r6 = r3.read(r15, r13, r4)     // Catch:{ all -> 0x058e }
            if (r6 <= 0) goto L_0x04f9
            long r3 = (long) r6     // Catch:{ all -> 0x058e }
            r10.addAndGet(r3)     // Catch:{ all -> 0x058e }
            X.7fV r5 = r2.A03     // Catch:{ all -> 0x058e }
            r5.BVA(r3)     // Catch:{ all -> 0x058e }
            r14.write(r15, r13, r6)     // Catch:{ all -> 0x058e }
            goto L_0x04c7
        L_0x04e6:
            X.AnonymousClass14X.A02(r17)     // Catch:{ all -> 0x0593 }
            r14.close()     // Catch:{ IllegalStateException -> 0x05d1 }
            A02(r2, r11, r10, r0)     // Catch:{ all -> 0x05f1 }
            r17.close()     // Catch:{ FileNotFoundException -> 0x0621, IOException -> 0x060f }
            r0 = 18
            A01(r7, r2, r9, r0)     // Catch:{ FileNotFoundException -> 0x062c }
            goto L_0x0695
        L_0x04f9:
            r14.flush()     // Catch:{ all -> 0x058e }
            X.AnonymousClass14X.A02(r17)     // Catch:{ all -> 0x0593 }
            r14.close()     // Catch:{ IllegalStateException -> 0x05d1 }
            int r13 = r11.getResponseCode()     // Catch:{ IllegalStateException -> 0x05d1 }
            r11.getResponseCode()     // Catch:{ IllegalStateException -> 0x05d1 }
            r11.getResponseMessage()     // Catch:{ IllegalStateException -> 0x05d1 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r13 == r3) goto L_0x0540
            r3 = 201(0xc9, float:2.82E-43)
            if (r13 == r3) goto L_0x0540
            r3 = 401(0x191, float:5.62E-43)
            r14 = 0
            if (r13 == r3) goto L_0x0537
            r3 = 403(0x193, float:5.65E-43)
            if (r13 == r3) goto L_0x051e
            goto L_0x059a
        L_0x051e:
            r3 = r31
            r3.A02(r12, r8)     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.String r5 = X.C90474aD.A0h(r11)     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.String r3 = "GoogleBackupApi/api disabled upload-file "
            X.C36321k7.A1P(r3, r5, r4)     // Catch:{ IllegalStateException -> 0x05d1 }
            X.4yH r4 = new X.4yH     // Catch:{ IllegalStateException -> 0x05d1 }
            r4.<init>()     // Catch:{ IllegalStateException -> 0x05d1 }
            goto L_0x05b7
        L_0x0537:
            java.lang.String r3 = "GoogleBackupApi/upload-file/unauthorized"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            r20.A0C()     // Catch:{ IllegalStateException -> 0x05d1 }
            goto L_0x058a
        L_0x0540:
            java.io.InputStream r3 = r11.getInputStream()     // Catch:{ IOException -> 0x0549 }
            java.lang.String r6 = X.AnonymousClass14X.A00(r3)     // Catch:{ IOException -> 0x0549 }
            goto L_0x054a
        L_0x0549:
            r6 = 0
        L_0x054a:
            X.AnonymousClass00C.A07(r8)     // Catch:{ IllegalStateException -> 0x05d1 }
            if (r6 == 0) goto L_0x0556
            int r4 = r6.length()     // Catch:{ IllegalStateException -> 0x05d1 }
            r3 = 0
            if (r4 != 0) goto L_0x0557
        L_0x0556:
            r3 = 1
        L_0x0557:
            r14 = 0
            if (r3 == 0) goto L_0x0560
            java.lang.String r3 = "GoogleBackupApi/upload-file/unexpected-response/file-uploaded-but-no-entity-in-response"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            goto L_0x058a
        L_0x0560:
            org.json.JSONObject r28 = X.C36441kJ.A1C(r6)     // Catch:{ JSONException -> 0x0580 }
            X.1Ck r3 = r2.A02     // Catch:{ JSONException -> 0x0580 }
            r25 = r3
            r27 = r8
            r29 = r18
            X.6Pk r4 = X.C131526Pk.A00(r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x0580 }
            if (r4 != 0) goto L_0x0577
            java.lang.String r3 = "GoogleBackupApi/upload-file/some attributes are missing"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ JSONException -> 0x0580 }
        L_0x0577:
            r14 = r4
            if (r4 == 0) goto L_0x058a
            r3 = r31
            r3.A02(r12, r8)     // Catch:{ IllegalStateException -> 0x05d1 }
            goto L_0x058a
        L_0x0580:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.String r3 = "GoogleBackupApi/upload-file/malformed-json-response/"
            X.C90464aC.A1L(r3, r6, r4, r5)     // Catch:{ IllegalStateException -> 0x05d1 }
        L_0x058a:
            A02(r2, r11, r10, r0)     // Catch:{ all -> 0x05f1 }
            goto L_0x05e1
        L_0x058e:
            r3 = move-exception
            X.AnonymousClass14X.A02(r17)     // Catch:{ all -> 0x0593 }
            throw r3     // Catch:{ all -> 0x0593 }
        L_0x0593:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0595 }
        L_0x0595:
            r4 = move-exception
            X.C05600Qi.A00(r14, r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            goto L_0x05b7
        L_0x059a:
            r3 = 429(0x1ad, float:6.01E-43)
            java.lang.String r6 = "upload-file"
            if (r13 != r3) goto L_0x05b8
            X.0yC r4 = r2.A0C     // Catch:{ IllegalStateException -> 0x05d1 }
            r3 = 916(0x394, float:1.284E-42)
            boolean r4 = r4.A0E(r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            X.5Ae r3 = new X.5Ae     // Catch:{ IllegalStateException -> 0x05d1 }
            r3.<init>(r11)     // Catch:{ IllegalStateException -> 0x05d1 }
            X.AnonymousClass6UB.A00(r3, r6, r4)     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.String r3 = "Redex: Unreachable code after no-return invoke"
            r4.<init>(r3)     // Catch:{ IllegalStateException -> 0x05d1 }
        L_0x05b7:
            throw r4     // Catch:{ IllegalStateException -> 0x05d1 }
        L_0x05b8:
            java.lang.String r5 = X.C90474aD.A0h(r11)     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ IllegalStateException -> 0x05d1 }
            java.lang.String r3 = "GoogleBackupApi/upload-file/unexpected-response/"
            X.C36321k7.A1Q(r3, r5, r4)     // Catch:{ IllegalStateException -> 0x05d1 }
            X.0wN r3 = r2.A01     // Catch:{ IllegalStateException -> 0x05d1 }
            X.C109805Ze.A00(r3, r6, r13)     // Catch:{ IllegalStateException -> 0x05d1 }
            r3 = -1
            X.4yS r4 = new X.4yS     // Catch:{ IllegalStateException -> 0x05d1 }
            r4.<init>(r5, r3)     // Catch:{ IllegalStateException -> 0x05d1 }
            goto L_0x05b7
        L_0x05d1:
            r4 = move-exception
            boolean r3 = r16.get()     // Catch:{ all -> 0x05ec }
            if (r3 == 0) goto L_0x05eb
            java.lang.String r3 = "GoogleBackupApi/upload-file/aborted"
            com.whatsapp.util.Log.i(r3, r4)     // Catch:{ all -> 0x05ec }
            A02(r2, r11, r10, r0)     // Catch:{ all -> 0x05f1 }
            r14 = 0
        L_0x05e1:
            r17.close()     // Catch:{ FileNotFoundException -> 0x0621, IOException -> 0x060f }
            r0 = 18
            A01(r7, r2, r9, r0)     // Catch:{ FileNotFoundException -> 0x062c }
            goto L_0x0693
        L_0x05eb:
            throw r4     // Catch:{ all -> 0x05ec }
        L_0x05ec:
            r3 = move-exception
            A02(r2, r11, r10, r0)     // Catch:{ all -> 0x05f1 }
            throw r3     // Catch:{ all -> 0x05f1 }
        L_0x05f1:
            r3 = move-exception
            goto L_0x0607
        L_0x05f3:
            r17.close()     // Catch:{ FileNotFoundException -> 0x0621, IOException -> 0x05f8 }
            goto L_0x0695
        L_0x05f8:
            r1 = move-exception
            goto L_0x0614
        L_0x05fa:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file/error-during-seek"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0605 }
            r17.close()     // Catch:{ FileNotFoundException -> 0x0621, IOException -> 0x0613, all -> 0x0611 }
            goto L_0x0695
        L_0x0605:
            r3 = move-exception
            r9 = 0
        L_0x0607:
            throw r3     // Catch:{ all -> 0x0608 }
        L_0x0608:
            r1 = move-exception
            r0 = r17
            X.C05600Qi.A00(r0, r3)     // Catch:{ FileNotFoundException -> 0x0621, IOException -> 0x060f }
            throw r1     // Catch:{ FileNotFoundException -> 0x0621, IOException -> 0x060f }
        L_0x060f:
            r1 = move-exception
            goto L_0x0614
        L_0x0611:
            r1 = move-exception
            goto L_0x062b
        L_0x0613:
            r1 = move-exception
        L_0x0614:
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0623 }
            if (r9 == 0) goto L_0x0695
            r0 = 18
            A01(r7, r2, r9, r0)     // Catch:{ FileNotFoundException -> 0x062c }
            goto L_0x0695
        L_0x0621:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0623 }
        L_0x0623:
            r1 = move-exception
            if (r9 == 0) goto L_0x062b
            r0 = 18
            A01(r7, r2, r9, r0)     // Catch:{ FileNotFoundException -> 0x062c }
        L_0x062b:
            throw r1     // Catch:{ FileNotFoundException -> 0x062c }
        L_0x062c:
            r3 = move-exception
            X.179 r1 = r2.A0A     // Catch:{ all -> 0x06be }
            java.io.File r0 = r32.A01()     // Catch:{ all -> 0x06be }
            boolean r0 = r1.A0B(r0)     // Catch:{ all -> 0x06be }
            if (r0 == 0) goto L_0x06bd
            X.0yE r0 = r2.A0B     // Catch:{ all -> 0x06be }
            boolean r0 = r0.A0H()     // Catch:{ all -> 0x06be }
            if (r0 == 0) goto L_0x06bd
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x06be }
            java.lang.String r1 = "GoogleBackupApi/upload-file/missing-read-external-storage-permission/ "
            r0 = r32
            X.C36321k7.A1M(r0, r1, r2, r3)     // Catch:{ all -> 0x06be }
            X.4yP r0 = new X.4yP     // Catch:{ all -> 0x06be }
            r0.<init>(r3)     // Catch:{ all -> 0x06be }
            throw r0     // Catch:{ all -> 0x06be }
        L_0x0652:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0675 }
            java.lang.String r0 = "GoogleBackupApi/upload-file exactly one location header should have been returned by Google drive, it returned "
            r1.append(r0)     // Catch:{ all -> 0x0675 }
            if (r6 == 0) goto L_0x065e
            goto L_0x0661
        L_0x065e:
            java.lang.String r0 = "no"
            goto L_0x0669
        L_0x0661:
            int r0 = r6.size()     // Catch:{ all -> 0x0675 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0675 }
        L_0x0669:
            r1.append(r0)     // Catch:{ all -> 0x0675 }
            java.lang.String r0 = " headers."
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x0675 }
        L_0x0671:
            r5.close()     // Catch:{ IOException -> 0x0687 }
            goto L_0x068d
        L_0x0675:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0677 }
        L_0x0677:
            r1 = move-exception
            goto L_0x0683
        L_0x0679:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x0687 }
            goto L_0x0686
        L_0x067c:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0687 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0687 }
            goto L_0x0686
        L_0x0683:
            X.C05600Qi.A00(r5, r0)     // Catch:{ IOException -> 0x0687 }
        L_0x0686:
            throw r1     // Catch:{ IOException -> 0x0687 }
        L_0x0687:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x06be }
        L_0x068d:
            java.lang.String r0 = "GoogleBackupApi/upload-file/error-creating-new-session"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06be }
            goto L_0x0695
        L_0x0693:
            r26 = r14
        L_0x0695:
            android.net.TrafficStats.clearThreadStatsTag()
            return r26
        L_0x0699:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x06be }
            java.lang.String r0 = "GoogleBackupApi/upload-file file "
            r1.append(r0)     // Catch:{ all -> 0x06be }
            java.lang.String r3 = "<file>"
            r1.append(r3)     // Catch:{ all -> 0x06be }
            java.lang.String r2 = " does not exist."
            X.C36321k7.A1Z(r1, r2)     // Catch:{ all -> 0x06be }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x06be }
            java.lang.String r0 = "file "
            X.AnonymousClass000.A1D(r0, r3, r2, r1)     // Catch:{ all -> 0x06be }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06be }
            java.io.FileNotFoundException r3 = X.C90524aI.A0V(r0)     // Catch:{ all -> 0x06be }
        L_0x06bd:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x06be:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133226Xi.A08(X.7fV, X.1el, X.6Te, X.6FR, int):X.6Pk");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r8 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.net.ssl.HttpsURLConnection A0A(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map r8, boolean r9) {
        /*
            r4 = this;
            java.lang.String r3 = r4.A09
            if (r3 == 0) goto L_0x003e
            if (r8 != 0) goto L_0x000a
            java.util.LinkedHashMap r8 = X.C36431kI.A1G()
        L_0x000a:
            java.lang.String r2 = "mode"
            boolean r0 = r8.containsKey(r2)
            r1 = r0 ^ 1
            java.lang.String r0 = "mode param should not be included in params"
            X.C18740tg.A0D(r1, r0)
            r8.put(r2, r3)
        L_0x001a:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0045
            android.net.Uri$Builder r3 = X.C90504aG.A0I(r6)
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r8)
        L_0x0028:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0041
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r2)
            java.lang.String r1 = X.C90494aF.A0f(r0)
            java.lang.String r0 = X.C90514aH.A10(r0)
            r3.appendQueryParameter(r1, r0)
            goto L_0x0028
        L_0x003e:
            if (r8 == 0) goto L_0x0045
            goto L_0x001a
        L_0x0041:
            java.lang.String r6 = X.C90474aD.A0b(r3)
        L_0x0045:
            X.AnonymousClass00C.A08(r6)
            java.net.URLConnection r2 = X.C90504aG.A0r(r6)
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            X.AnonymousClass00C.A0E(r2, r0)
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2
            javax.net.ssl.SSLSocketFactory r0 = r4.A0K
            r2.setSSLSocketFactory(r0)
            java.lang.String r0 = "Host"
            java.lang.String r3 = "backup.googleapis.com"
            r2.setRequestProperty(r0, r3)
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            org.apache.http.conn.ssl.BrowserCompatHostnameVerifier r1 = new org.apache.http.conn.ssl.BrowserCompatHostnameVerifier
            r1.<init>()
            X.77d r0 = new X.77d
            r0.<init>(r3, r1)
            r2.setHostnameVerifier(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Bearer "
            r1.append(r0)
            java.lang.String r0 = r4.A01
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = "Authorization"
            r2.setRequestProperty(r0, r1)
            java.lang.String r1 = r4.A0J
            java.lang.String r0 = "User-Agent"
            r2.setRequestProperty(r0, r1)
            X.C90464aC.A1S(r2)
            r2.setRequestMethod(r5)
            if (r7 == 0) goto L_0x0096
            java.lang.String r0 = "Content-Type"
            r2.setRequestProperty(r0, r7)
        L_0x0096:
            r2.setDoOutput(r9)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0A
            r0.incrementAndGet()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133226Xi.A0A(java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean):javax.net.ssl.HttpsURLConnection");
    }

    public final boolean A0C() {
        String str = this.A08;
        try {
            C90464aC.A1I("GoogleBackupApi/auth-request asking GoogleAuthUtil for auth token: ", str, AnonymousClass000.A0u());
            String str2 = this.A01;
            if (str2 != null) {
                Context context = this.A0B;
                AnonymousClass0UT r0 = AnonymousClass0Z2.A01;
                AnonymousClass006.A04("Calling this from your main thread can lead to deadlock");
                AnonymousClass0Z2.A05(context);
                Bundle A072 = AnonymousClass001.A07();
                AnonymousClass0Z2.A06(context, A072);
                AnonymousClass0Y9.A00(context);
                AnonymousClass0eS.A01.A00.ByC();
                if (AnonymousClass000.A1X(AnonymousClass0WE.A0A.A02()) && AnonymousClass0Z2.A07(context)) {
                    AnonymousClass0JJ r6 = new AnonymousClass0JJ(context);
                    C04470Kt r10 = new C04470Kt();
                    r10.A00 = str2;
                    C07180Wq r2 = new C07180Wq((AnonymousClass0OR) null);
                    r2.A03 = new C04520Ky[]{AnonymousClass0SB.A09};
                    r2.A01 = new C10250dw(r6, r10);
                    r2.A00 = 1513;
                    try {
                        AnonymousClass0Z2.A02(C07590Yl.A01(r6, r2.A00(), 1), "clear token");
                    } catch (ApiException e) {
                        AnonymousClass0UT r62 = AnonymousClass0Z2.A01;
                        Object[] A1b = C36411kG.A1b("clear token");
                        A1b[1] = android.util.Log.getStackTraceString(e);
                        r62.A01("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", A1b);
                    }
                }
                AnonymousClass0Z2.A01(AnonymousClass0Z2.A00, context, new C10040db(str2, A072));
            }
            this.A01 = AnonymousClass0Z2.A03(new Account(str, "com.google"), this.A0B);
            Log.i("GoogleBackupApi/auth-request/received-auth-token");
            return true;
        } catch (C03930Im e2) {
            Log.e("GoogleBackupApi/auth-request Google Play services is unavailable, if it was unavailable from the beginning code would not have reached here, so, most likely it became unavailable while the backup/restore was in progress");
            Log.e("GoogleBackupApi/auth-request", e2);
            this.A01 = null;
            throw new C101884yR(e2);
        } catch (UserRecoverableAuthException e3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C90474aD.A1J("GoogleBackupApi/auth-request permission to access Google Drive for ", str, A0u);
            C36321k7.A1a(A0u, " is not available and we cannot ask user for permission either.");
            throw new C101884yR(e3);
        } catch (C03920Il e4) {
            Log.i("GoogleBackupApi/auth-request user recoverable exception happened and notification was published by the system to resolve it.");
            throw new C101884yR(e4);
        } catch (IOException e5) {
            Log.e("GoogleBackupApi/auth-request", e5);
            this.A01 = null;
            return false;
        } catch (AnonymousClass0OD e6) {
            Log.e("GoogleBackupApi/auth-request", e6);
            if (!"BadUsername".equals(e6.getMessage())) {
                if (!"ServiceUnavailable".equals(e6.getMessage())) {
                    this.A01 = null;
                    throw new C101884yR(e6);
                }
                return false;
            }
            throw new C101874yQ(e6);
        } catch (SecurityException e7) {
            Log.e("GoogleBackupApi/auth-request", e7);
            this.A01 = null;
            throw new C101884yR(e7);
        } catch (NullPointerException e8) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("GoogleBackupApi/auth-request unexpected NullPointerException while trying to get  auth token for the account ");
            C36321k7.A1Z(A0u2, C34191gb.A07(str));
            Log.e("GoogleBackupApi/auth-request", e8);
            this.A01 = null;
            throw new C101884yR(e8);
        }
    }
}

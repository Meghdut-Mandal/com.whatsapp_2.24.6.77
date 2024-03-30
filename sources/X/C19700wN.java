package X;

import android.app.ActivityManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

/* renamed from: X.0wN  reason: invalid class name and case insensitive filesystem */
public abstract class C19700wN {
    public String A0A() {
        StringBuilder sb;
        C19720wP r3 = (C19720wP) this;
        C19730wQ r2 = r3.A03;
        r2.A0G();
        Me me = r2.A00;
        int A04 = r2.A04();
        if (me != null) {
            sb = new StringBuilder();
            sb.append(me.jabber_id);
            sb.append(":");
            sb.append(A04);
        } else {
            String replaceAll = r2.A0A.A02().toLowerCase(Locale.US).replaceAll("\\W", "-");
            if (!replaceAll.equals("")) {
                return replaceAll;
            }
            C21050ya A0O = r3.A06.A0O();
            if (A0O == null) {
                Log.w("crashlogs/get-from-parameter cr=null");
                return replaceAll;
            }
            String A01 = C18750th.A01(A0O);
            if (A01 == null || A01.length() < 6) {
                A01 = "123456";
            }
            sb = new StringBuilder();
            sb.append("new-");
            sb.append(A01.substring(A01.length() - 6));
        }
        return sb.toString();
    }

    public String A0B(String str) {
        int memoryClass;
        C19720wP r1 = (C19720wP) this;
        ActivityManager A04 = r1.A06.A04();
        if (A04 == null) {
            Log.w("memorydumpuploadservice/get-upload-params am=null");
            memoryClass = 16;
        } else {
            memoryClass = A04.getMemoryClass();
        }
        C20020wt.A00(r1.A07, r1.A0B, C18930u3.A01());
        Objects.requireNonNull("2.24.6.77");
        return C19720wP.A03(str, memoryClass);
    }

    public String A0C(String str, String str2, boolean z) {
        C19720wP r2 = (C19720wP) this;
        C115245iZ r1 = new C115245iZ();
        AnonymousClass6VO r3 = new AnonymousClass6VO(r2.A04, new C146106v2(r1, r2), r2.A0A, "https://crashlogs.whatsapp.net/wa_fls_upload_check", r2.A0B.A02(), (String) null, 6, false, false, false);
        r3.A06("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
        r3.A06("from_jid", str);
        r3.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        r3.A06("support_exception_only_upload", String.valueOf(z));
        int A04 = r3.A04((C1265864p) null);
        if (A04 == 200) {
            return r1.A00;
        }
        if (A04 == 403) {
            r1.A00 = "no_upload";
            return "no_upload";
        } else if (A04 != 500) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown response code ");
            sb.append(A04);
            sb.append(" from crash upload server");
            throw new IOException(sb.toString());
        } else {
            throw new IOException("Response 500 received from server");
        }
    }

    public void A0D(String str, String str2, Throwable th) {
        Log.e(str, th);
        C19720wP.A06(new AnonymousClass78T(str, th), (C19720wP) this, str, str2, new HashMap(), true);
    }

    public void A0E(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        C19720wP.A06(new AnonymousClass78T(str), (C19720wP) this, str, str2, hashMap, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c2, code lost:
        r1 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0146, code lost:
        r1.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(java.util.HashSet r22, java.util.Map r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r21 = this;
            r0 = r21
            X.0wP r0 = (X.C19720wP) r0
            boolean r1 = com.whatsapp.util.Log.rotate()
            r12 = 0
            r5 = r25
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "crash-log/whatsapp/no_file"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.lang.String r1 = "no-file"
            X.C19720wP.A08(r0, r1, r5)
        L_0x0017:
            return
        L_0x0018:
            r1 = 0
            r4 = r23
            r20 = r27
            java.io.File r7 = com.whatsapp.util.Log.compress()     // Catch:{ Exception -> 0x00fe, all -> 0x014c }
            X.0yF r6 = r0.A09     // Catch:{ Exception -> 0x00fe, all -> 0x014c }
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = 5242880(0x500000, float:7.34684E-39)
            if (r26 == 0) goto L_0x002d
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r2 = 41943040(0x2800000, float:1.880791E-37)
        L_0x002d:
            android.util.Pair r3 = X.AnonymousClass6YY.A02(r6, r7, r3, r2)     // Catch:{ Exception -> 0x00fe, all -> 0x014c }
            java.lang.Object r2 = r3.first     // Catch:{ Exception -> 0x00fe, all -> 0x014c }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x00fe, all -> 0x014c }
            boolean r11 = r2.booleanValue()     // Catch:{ Exception -> 0x00fe, all -> 0x014c }
            java.lang.Object r3 = r3.second     // Catch:{ Exception -> 0x00fc, all -> 0x014a }
            java.io.File r3 = (java.io.File) r3     // Catch:{ Exception -> 0x00fc, all -> 0x014a }
            if (r3 == 0) goto L_0x0056
            java.lang.String r14 = r3.getPath()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r15 = r0.A0A()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r16 = X.C19720wP.A04(r22)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            r13 = r0
            r17 = r4
            r18 = r5
            r19 = r20
            boolean r12 = X.C19720wP.A09(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
        L_0x0056:
            if (r24 == 0) goto L_0x00be
            java.io.File r7 = com.whatsapp.util.Log.logFile     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r6 = ".gz"
            java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            r2.<init>()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r1 = r7.getName()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r9 = X.AnonymousClass6UF.A03(r1, r2)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r1 = r7.getName()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r8 = X.AnonymousClass6UF.A02(r1, r6)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r10 = X.AnonymousClass6UF.A00(r7, r6, r2)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            int r1 = r9.length()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            int r6 = r1 + 1
            int r2 = r10.length()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            int r1 = r8.length()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            int r2 = r2 - r1
            if (r6 >= r2) goto L_0x0095
            java.lang.String r1 = r10.substring(r6, r2)     // Catch:{ NumberFormatException -> 0x0095 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0095 }
            int r1 = r1 + 1
            java.lang.String r6 = java.lang.Integer.toString(r1)     // Catch:{ NumberFormatException -> 0x0095 }
            goto L_0x0097
        L_0x0095:
            java.lang.String r6 = "1"
        L_0x0097:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            r2.<init>()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            r2.append(r9)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r1 = "."
            r2.append(r1)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            r2.append(r6)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            r2.append(r8)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.lang.String r2 = r7.getParent()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            r1.<init>(r2, r6)     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            r1.createNewFile()     // Catch:{ Exception -> 0x00bb, all -> 0x0150 }
            goto L_0x00be
        L_0x00bb:
            r6 = move-exception
            r1 = r3
            goto L_0x0100
        L_0x00be:
            if (r3 == 0) goto L_0x00f4
            if (r12 != 0) goto L_0x00f4
            long r1 = java.lang.System.currentTimeMillis()
            java.io.File r6 = X.C19720wP.A01(r0, r3, r1)
            if (r6 == 0) goto L_0x00f4
            java.util.Map r16 = X.C19720wP.A05(r0, r4)
            java.lang.String r13 = r6.getPath()
            java.lang.String r14 = r0.A0A()
            java.lang.String r15 = X.C19720wP.A04(r22)
            X.3AG r12 = new X.3AG
            r19 = r5
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r19, r20)
            X.C19720wP.A07(r12, r0)
            android.os.Handler r4 = r0.A01
            r2 = 24
            X.1j6 r1 = new X.1j6
            r1.<init>(r0, r2)
            r4.post(r1)
        L_0x00f4:
            if (r11 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x0017
            r3.delete()
            return
        L_0x00fc:
            r6 = move-exception
            goto L_0x0100
        L_0x00fe:
            r6 = move-exception
            r11 = 0
        L_0x0100:
            java.lang.String r2 = "crash-log/failedupload"
            com.whatsapp.util.Log.e(r2, r6)     // Catch:{ all -> 0x014e }
            java.lang.String r2 = r6.getMessage()     // Catch:{ all -> 0x014e }
            X.C19720wP.A08(r0, r2, r5)     // Catch:{ all -> 0x014e }
            if (r1 == 0) goto L_0x0142
            if (r12 != 0) goto L_0x0142
            long r2 = java.lang.System.currentTimeMillis()
            java.io.File r6 = X.C19720wP.A01(r0, r1, r2)
            if (r6 == 0) goto L_0x0142
            java.util.Map r16 = X.C19720wP.A05(r0, r4)
            java.lang.String r13 = r6.getPath()
            java.lang.String r14 = r0.A0A()
            java.lang.String r15 = X.C19720wP.A04(r22)
            X.3AG r12 = new X.3AG
            r19 = r5
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r19, r20)
            X.C19720wP.A07(r12, r0)
            android.os.Handler r4 = r0.A01
            r3 = 24
            X.1j6 r2 = new X.1j6
            r2.<init>(r0, r3)
            r4.post(r2)
        L_0x0142:
            if (r11 == 0) goto L_0x0017
            if (r1 == 0) goto L_0x0017
            r1.delete()
            return
        L_0x014a:
            r7 = move-exception
            goto L_0x0188
        L_0x014c:
            r7 = move-exception
            throw r7
        L_0x014e:
            r7 = move-exception
            goto L_0x0152
        L_0x0150:
            r7 = move-exception
            r1 = r3
        L_0x0152:
            if (r1 == 0) goto L_0x0188
            if (r12 != 0) goto L_0x0188
            long r2 = java.lang.System.currentTimeMillis()
            java.io.File r6 = X.C19720wP.A01(r0, r1, r2)
            if (r6 == 0) goto L_0x0188
            java.util.Map r16 = X.C19720wP.A05(r0, r4)
            java.lang.String r13 = r6.getPath()
            java.lang.String r14 = r0.A0A()
            java.lang.String r15 = X.C19720wP.A04(r22)
            X.3AG r12 = new X.3AG
            r19 = r5
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r19, r20)
            X.C19720wP.A07(r12, r0)
            android.os.Handler r4 = r0.A01
            r3 = 24
            X.1j6 r2 = new X.1j6
            r2.<init>(r0, r3)
            r4.post(r2)
        L_0x0188:
            if (r11 == 0) goto L_0x018f
            if (r1 == 0) goto L_0x018f
            r1.delete()
        L_0x018f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19700wN.A0F(java.util.HashSet, java.util.Map, boolean, boolean, boolean, boolean):void");
    }
}

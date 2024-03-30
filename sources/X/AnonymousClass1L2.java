package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1L2  reason: invalid class name */
public final class AnonymousClass1L2 implements C236119d {
    public AnonymousClass1L8 A00;
    public C1262863h A01;
    public final AnonymousClass19A A02;
    public final C18820ts A03;

    public AnonymousClass1L2(C18820ts r2, AnonymousClass19A r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A02 = r3;
        this.A03 = r2;
    }

    public static final JSONObject A00(C131576Pp r4) {
        AnonymousClass00C.A0D(r4, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", r4.A0A);
        jSONObject.put("locale", r4.A06);
        jSONObject.put("expiresData", r4.A01);
        jSONObject.put("appId", r4.A03);
        jSONObject.put("version", r4.A00);
        jSONObject.put("platform", r4.A08);
        jSONObject.put("bizJid", r4.A04);
        jSONObject.put("flowVersionId", r4.A02);
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, r4.A09);
        String str = r4.A07;
        if (str != null) {
            jSONObject.put("minAppVersion", str);
        }
        String str2 = r4.A05;
        if (str2 != null) {
            jSONObject.put("bloksVersionId", str2);
        }
        List<C131576Pp> list = r4.A0B;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (C131576Pp A002 : list) {
                jSONArray.put(A00(A002));
            }
            jSONObject.put("extraVersions", jSONArray);
        }
        return jSONObject;
    }

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("GetCommerceMetadataProtocolHelper/onDeliveryFailure: Network failed  while sending the payload: ");
        sb.append(str);
        Log.e(sb.toString());
        AnonymousClass1L8 r0 = this.A00;
        if (r0 == null) {
            AnonymousClass00C.A0G("listener");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            r0.A00.A04.set(false);
        }
    }

    public void BWw(C203399nx r4, String str) {
        AnonymousClass00C.A0D(r4, 1);
        Log.e("GetCommerceMetadataProtocolHelper/response-error");
        C203399nx A0c = r4.A0c("error");
        if (A0c != null) {
            A0c.A0S("code", 0);
            AnonymousClass1L8 r0 = this.A00;
            if (r0 == null) {
                AnonymousClass00C.A0G("listener");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C1262863h r2 = this.A01;
            r0.A00.A04.set(false);
            if (r2 != null) {
                r2.A00();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        if (r7 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0144, code lost:
        r7 = X.C023409w.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0146, code lost:
        r2 = new X.C116625kt(r7);
        r6 = r1.A01;
        r3 = r0.A00;
        r3.A04.set(false);
        r1 = r2.A00;
        r13 = new java.util.ArrayList(X.AnonymousClass03U.A06(r1, 10));
        r16 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016a, code lost:
        if (r16.hasNext() == false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016c, code lost:
        r1 = (X.C131576Pp) r16.next();
        r14 = r1.A03;
        r15 = r1.A06;
        r4 = r1.A01;
        r11 = r1.A08;
        r10 = r1.A04;
        r13.add(new X.C131576Pp(r1.A02, r1.A0A, r15, r14, (java.lang.String) ((java.util.Map) r3.A05.getValue()).get(r14), r11, r10, r1.A09, r1.A07, r1.A05, r1.A0B, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01bb, code lost:
        r0 = new X.C116625kt(r13);
        r5 = r3.A01;
        r2 = new org.json.JSONArray();
        r4 = r0.A00;
        r1 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d1, code lost:
        if (r1.hasNext() == false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d3, code lost:
        r2.put(A00((X.C131576Pp) r1.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e1, code lost:
        r1 = new org.json.JSONObject();
        r1.put("bloksLinks", r2);
        X.C19420v0.A00(r5).putString("commerce_metadata", r1.toString()).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fc, code lost:
        if (r6 == null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01fe, code lost:
        r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020b, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r3.A02, 2175) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020d, code lost:
        r3 = r3.A03;
        r8 = new java.util.ArrayList();
        r7 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021c, code lost:
        if (r7.hasNext() == false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021e, code lost:
        r6 = r7.next();
        r2 = (X.C131576Pp) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x022d, code lost:
        if (X.AnonymousClass00C.A0J(r2.A08, "android") == false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x022f, code lost:
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0231, code lost:
        if (r0 == null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023b, code lost:
        if (r0.longValue() > 0) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x023d, code lost:
        r8.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0241, code lost:
        r4 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0249, code lost:
        if (r4.hasNext() == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x024b, code lost:
        java.util.Objects.requireNonNull("2.24.6.77");
        r1 = ((X.C131576Pp) r4.next()).A01();
        r2 = X.C110475aj.A00(r1, r3.A06);
        r7 = r3.A01;
        r11 = r3.A05;
        r6 = r3.A00;
        r10 = r3.A04;
        new X.C1033054t(r6, r7, r3.A02, r3.A03, r10, r11).A0G(new X.C145196tV(), r1.A0A, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r42, java.lang.String r43) {
        /*
            r41 = this;
            r0 = 0
            r1 = r43
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 1
            r1 = r42
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r20 = "commerce_metadata"
            r0 = r20
            X.9nx r1 = r1.A0c(r0)
            if (r1 == 0) goto L_0x012e
            java.lang.String r0 = "bloks_links"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x012e
            X.9nx[] r6 = r0.A02
            if (r6 == 0) goto L_0x012e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r4 = r6.length
            r3 = 0
        L_0x0029:
            if (r3 >= r4) goto L_0x003d
            r2 = r6[r3]
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "link"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x003a
            r5.add(r2)
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r19 = r5.iterator()
        L_0x0046:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r19.next()
            X.9nx r0 = (X.C203399nx) r0
            java.lang.String r1 = "language"
            r2 = 0
            java.lang.String r24 = r0.A0i(r1, r2)
            java.lang.String r35 = ""
            if (r24 != 0) goto L_0x0067
            java.lang.String r1 = "locale"
            java.lang.String r24 = r0.A0i(r1, r2)
            if (r24 != 0) goto L_0x0067
            r24 = r35
        L_0x0067:
            java.lang.String r1 = "extra_versions"
            X.9nx r1 = r0.A0c(r1)
            java.lang.String r18 = "signature"
            java.lang.String r15 = "biz_jid"
            java.lang.String r14 = "flow_version_id"
            java.lang.String r13 = "platform"
            java.lang.String r12 = "bloks_app_id"
            java.lang.String r11 = "expires_at"
            java.lang.String r9 = "url"
            if (r1 == 0) goto L_0x00e0
            X.9nx[] r6 = r1.A02
            if (r6 == 0) goto L_0x00e0
            int r8 = r6.length
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r8)
            r2 = 0
        L_0x0088:
            if (r2 >= r8) goto L_0x00e1
            r5 = r6[r2]
            r1 = 0
            java.lang.String r25 = r0.A0i(r12, r1)
            if (r25 != 0) goto L_0x0095
            r25 = r35
        L_0x0095:
            java.lang.String r27 = r0.A0i(r13, r1)
            if (r27 != 0) goto L_0x009d
            r27 = r35
        L_0x009d:
            r3 = -1
            long r16 = r0.A0V(r14, r3)
            java.lang.String r28 = r0.A0i(r15, r1)
            java.lang.String r23 = r5.A0i(r9, r1)
            if (r23 != 0) goto L_0x00af
            r23 = r35
        L_0x00af:
            r3 = r18
            java.lang.String r29 = r5.A0i(r3, r1)
            if (r29 != 0) goto L_0x00b9
            r29 = r35
        L_0x00b9:
            r3 = 0
            long r33 = r5.A0V(r11, r3)
            java.lang.String r3 = "min_app_version"
            java.lang.String r30 = r5.A0i(r3, r1)
            java.lang.String r3 = "bloks_version_id"
            java.lang.String r31 = r5.A0i(r3, r1)
            java.lang.Long r22 = java.lang.Long.valueOf(r16)
            X.6Pp r3 = new X.6Pp
            r32 = r1
            r21 = r3
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r10.add(r3)
            int r2 = r2 + 1
            goto L_0x0088
        L_0x00e0:
            r10 = 0
        L_0x00e1:
            r3 = 0
            java.lang.String r29 = r0.A0i(r9, r3)
            if (r29 != 0) goto L_0x00ea
            r29 = r35
        L_0x00ea:
            r1 = 0
            long r39 = r0.A0V(r11, r1)
            java.lang.String r31 = r0.A0i(r12, r3)
            if (r31 != 0) goto L_0x00f8
            r31 = r35
        L_0x00f8:
            java.lang.String r33 = r0.A0i(r13, r3)
            if (r33 != 0) goto L_0x0100
            r33 = r35
        L_0x0100:
            r1 = -1
            long r4 = r0.A0V(r14, r1)
            java.lang.String r34 = r0.A0i(r15, r3)
            r1 = r18
            java.lang.String r0 = r0.A0i(r1, r3)
            if (r0 == 0) goto L_0x0114
            r35 = r0
        L_0x0114:
            java.lang.Long r28 = java.lang.Long.valueOf(r4)
            X.6Pp r0 = new X.6Pp
            r36 = r3
            r37 = r3
            r27 = r0
            r30 = r24
            r32 = r3
            r38 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r7.add(r0)
            goto L_0x0046
        L_0x012e:
            r7 = 0
        L_0x012f:
            r1 = r41
            X.1L8 r0 = r1.A00
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "listener"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0142:
            if (r7 != 0) goto L_0x0146
            X.09w r7 = X.C023409w.A00
        L_0x0146:
            X.5kt r2 = new X.5kt
            r2.<init>(r7)
            X.63h r6 = r1.A01
            r1 = 0
            X.1L1 r3 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A04
            r0.set(r1)
            java.util.List r1 = r2.A00
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r0)
            java.util.Iterator r16 = r1.iterator()
        L_0x0166:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r1 = r16.next()
            X.6Pp r1 = (X.C131576Pp) r1
            X.00T r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r14 = r1.A03
            java.lang.Object r12 = r0.get(r14)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r0 = r1.A0A
            r17 = r0
            java.lang.String r15 = r1.A06
            long r4 = r1.A01
            java.lang.String r11 = r1.A08
            java.lang.String r10 = r1.A04
            java.lang.Long r9 = r1.A02
            java.lang.String r8 = r1.A09
            java.lang.String r7 = r1.A07
            java.lang.String r2 = r1.A05
            java.util.List r1 = r1.A0B
            X.6Pp r0 = new X.6Pp
            r21 = r0
            r22 = r9
            r23 = r17
            r24 = r15
            r25 = r14
            r26 = r12
            r27 = r11
            r28 = r10
            r29 = r8
            r30 = r7
            r31 = r2
            r32 = r1
            r33 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r13.add(r0)
            goto L_0x0166
        L_0x01bb:
            X.5kt r0 = new X.5kt
            r0.<init>(r13)
            X.0v0 r5 = r3.A01
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.List r4 = r0.A00
            java.util.Iterator r1 = r4.iterator()
        L_0x01cd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r1.next()
            X.6Pp r0 = (X.C131576Pp) r0
            org.json.JSONObject r0 = A00(r0)
            r2.put(r0)
            goto L_0x01cd
        L_0x01e1:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "bloksLinks"
            r1.put(r0, r2)
            java.lang.String r2 = r1.toString()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r5)
            r0 = r20
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            if (r6 == 0) goto L_0x0201
            r6.A00()
        L_0x0201:
            X.0yC r2 = r3.A02
            r1 = 2175(0x87f, float:3.048E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x027c
            X.1L3 r3 = r3.A03
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r4.iterator()
        L_0x0218:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0241
            java.lang.Object r6 = r7.next()
            r2 = r6
            X.6Pp r2 = (X.C131576Pp) r2
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "android"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0218
            java.lang.Long r0 = r2.A02
            if (r0 == 0) goto L_0x023d
            long r4 = r0.longValue()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0218
        L_0x023d:
            r8.add(r6)
            goto L_0x0218
        L_0x0241:
            java.util.Iterator r4 = r8.iterator()
        L_0x0245:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x027c
            java.lang.Object r1 = r4.next()
            X.6Pp r1 = (X.C131576Pp) r1
            java.lang.String r0 = "2.24.6.77"
            java.util.Objects.requireNonNull(r0)
            X.6Pp r1 = r1.A01()
            X.1L4 r0 = r3.A06
            java.lang.String r2 = X.C110475aj.A00(r1, r0)
            X.0wG r7 = r3.A01
            X.0wU r11 = r3.A05
            X.0ww r6 = r3.A00
            X.0yd r10 = r3.A04
            X.13E r9 = r3.A03
            X.0yC r8 = r3.A02
            X.54t r5 = new X.54t
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = r1.A0A
            X.6tV r0 = new X.6tV
            r0.<init>()
            r5.A0G(r0, r1, r2)
            goto L_0x0245
        L_0x027c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L2.BiM(X.9nx, java.lang.String):void");
    }
}

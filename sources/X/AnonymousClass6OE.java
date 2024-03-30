package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.6OE  reason: invalid class name */
public final class AnonymousClass6OE {
    public final AnonymousClass1KW A00;
    public final C25851Hx A01;
    public final AnonymousClass1VZ A02;
    public final C19700wN A03;
    public final C20810yC A04;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.03N] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x003b
            org.json.JSONObject r1 = X.C36441kJ.A1C(r5)     // Catch:{ all -> 0x0017 }
            java.lang.String r0 = "error_msg"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x001d
            int r1 = r3.length()     // Catch:{ all -> 0x0017 }
            r0 = 0
            if (r1 != 0) goto L_0x001e
            goto L_0x001d
        L_0x0017:
            r0 = move-exception
            X.03N r3 = X.C90524aI.A0t(r0)
            goto L_0x0021
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 == 0) goto L_0x0021
            r3 = r4
        L_0x0021:
            java.lang.Throwable r2 = X.AnonymousClass0AK.A00(r3)
            if (r2 == 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsDataUtil/processErrorPayload() - null payload "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0034:
            boolean r0 = r3 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x0039
            r4 = r3
        L_0x0039:
            java.lang.String r4 = (java.lang.String) r4
        L_0x003b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OE.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (r12 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r12 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        if (r12 != null) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.app.Activity r12, X.AnonymousClass185 r13, X.AnonymousClass6NP r14, java.lang.String r15) {
        /*
            r11 = this;
            r4 = 0
            r8 = 0
            if (r12 == 0) goto L_0x0071
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x0071
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0071
            java.lang.String r0 = "action_name"
            java.lang.String r5 = r1.getString(r0)
        L_0x0016:
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x0075
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = "flow_id"
            java.lang.String r6 = r1.getString(r0)
        L_0x0028:
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x0079
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r1.getString(r0)
        L_0x003a:
            X.11F r3 = X.C36421kH.A0N(r0)
            if (r12 == 0) goto L_0x006d
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x006d
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = "message_id"
            java.lang.String r7 = r1.getString(r0)
        L_0x0052:
            android.content.Intent r0 = r12.getIntent()
            if (r0 == 0) goto L_0x0064
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0064
            java.lang.String r0 = "session_id"
            java.lang.String r8 = r1.getString(r0)
        L_0x0064:
            r0 = r11
            r1 = r13
            r2 = r14
            r9 = r15
            r10 = r4
            r0.A02(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x006d:
            r7 = r4
            if (r12 == 0) goto L_0x0064
            goto L_0x0052
        L_0x0071:
            r5 = r4
            if (r12 == 0) goto L_0x0075
            goto L_0x0016
        L_0x0075:
            r6 = r4
            if (r12 == 0) goto L_0x0079
            goto L_0x0028
        L_0x0079:
            r0 = r4
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OE.A01(android.app.Activity, X.185, X.6NP, java.lang.String):void");
    }

    public final void A02(AnonymousClass185 r14, AnonymousClass6NP r15, AnonymousClass11F r16, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass3T1 r6;
        String str7;
        UserJid userJid;
        Integer num;
        AnonymousClass9Xu r0;
        String str8;
        String str9 = str3;
        AnonymousClass11F r5 = r16;
        JSONObject A1B = C36441kJ.A1B();
        String str10 = null;
        if (str3 != null) {
            r6 = this.A02.A02(new C64933Qa(r5, str9, false));
            A1B.put("extensions_message_id", C132586Uj.A00.A02(this.A00, str9, false));
        } else {
            r6 = null;
        }
        A1B.put("cta", str);
        A1B.put("flow_id", str2);
        String str11 = str5;
        A1B.put("error_type", str11);
        if (str4 != null) {
            str7 = C90464aC.A0b(str4);
            AnonymousClass00C.A08(str7);
        } else {
            str7 = null;
        }
        A1B.put("session_id", str7);
        if (bool != null) {
            A1B.put("extension_restored_from_cache", bool.booleanValue() ? 1 : 0);
        }
        if (r5 instanceof UserJid) {
            userJid = (UserJid) r5;
            if (userJid != null) {
                num = Integer.valueOf(C110465ai.A00(r14.A01(userJid)));
            }
            num = null;
        } else {
            userJid = null;
            num = null;
        }
        if (r6 != null) {
            C66013Ui.A0q(r6);
        }
        if (userJid != null) {
            r0 = this.A01.A01.A01(userJid);
        } else {
            r0 = null;
        }
        String A0y = C36381kD.A0y(A1B);
        if (r0 != null) {
            str8 = r0.A06;
            str10 = r0.A05;
        } else {
            str8 = null;
        }
        if (str3 == null) {
            str9 = "";
        }
        r15.A01(userJid, r6, num, A0y, str8, str10, str9, 3);
        if (this.A04.A0E(3178)) {
            this.A03.A0E(str11, str6, false);
        }
    }

    public AnonymousClass6OE(C19700wN r1, AnonymousClass1KW r2, C25851Hx r3, AnonymousClass1VZ r4, C20810yC r5) {
        C36321k7.A1B(r1, r5, r4, r3, r2);
        this.A03 = r1;
        this.A04 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}

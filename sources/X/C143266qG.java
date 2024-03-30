package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.6qG  reason: invalid class name and case insensitive filesystem */
public final class C143266qG implements C159977kG {
    public final C20810yC A00;
    public final AnonymousClass6MG A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass6OE A03;
    public final C117105li A04;
    public final C20310xM A05;
    public final AnonymousClass1KZ A06;
    public final AnonymousClass1A1 A07;
    public final C19770wU A08;
    public final AnonymousClass67S A09;

    public String B9X(Activity activity) {
        Bundle extras;
        String string;
        AnonymousClass00C.A0D(activity, 0);
        Intent intent = activity.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("chat_id")) != null && string.length() != 0) {
            return string;
        }
        Jid jid = (Jid) this.A04.A00.get("chat_jid");
        if (jid != null) {
            return jid.getRawString();
        }
        return null;
    }

    public String BEN(Activity activity) {
        Bundle extras;
        String string;
        AnonymousClass00C.A0D(activity, 0);
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("message_id")) == null || string.length() == 0) {
            return C90504aG.A0l("key_msg_id", this.A04.A00);
        }
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        if ("100".equalsIgnoreCase(r12) != false) goto L_0x0082;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bpp(android.app.Activity r35, X.C1260062e r36, java.util.Map r37) {
        /*
            r34 = this;
            r16 = r35
            if (r35 == 0) goto L_0x0148
            android.content.Intent r0 = r16.getIntent()
            if (r0 == 0) goto L_0x0148
            android.os.Bundle r8 = r0.getExtras()
            if (r8 == 0) goto L_0x0148
            java.lang.String r0 = "chat_id"
            java.lang.String r10 = r8.getString(r0)
            com.whatsapp.jid.UserJid r4 = X.C36431kI.A0l(r10)
            java.lang.String r7 = "flow_token"
            java.lang.String r1 = r8.getString(r7)
            java.lang.String r0 = "flow_message_version"
            java.lang.String r26 = r8.getString(r0)
            javax.crypto.SecretKey r3 = X.C90494aF.A0l()
            r0 = 16
            byte[] r2 = new byte[r0]
            X.C90504aG.A1Q(r2)
            X.AnonymousClass00C.A0B(r3)
            r9 = 0
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            java.lang.String r6 = "user_locale"
            java.lang.String r5 = r8.getString(r6)
            java.lang.String r0 = "flow_id"
            java.lang.String r0 = r8.getString(r0)
            r12 = 0
            X.011 r0 = X.C36441kJ.A19(r9, r0)
            java.lang.Object r8 = r0.second
            java.lang.String r8 = (java.lang.String) r8
            if (r26 == 0) goto L_0x0148
            if (r10 == 0) goto L_0x0148
            if (r4 == 0) goto L_0x0148
            if (r1 == 0) goto L_0x0148
            if (r5 == 0) goto L_0x0148
            r10 = r37
            if (r37 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x0148
            r10.put(r7, r1)
            r0 = r34
            X.0yC r7 = r0.A00
            r1 = 5374(0x14fe, float:7.53E-42)
            boolean r1 = r7.A0E(r1)
            java.lang.String r11 = "version"
            if (r1 == 0) goto L_0x0082
            java.lang.Object r13 = r10.get(r11)
            boolean r1 = r13 instanceof java.lang.String
            if (r1 == 0) goto L_0x007a
            r12 = r13
            java.lang.String r12 = (java.lang.String) r12
        L_0x007a:
            java.lang.String r1 = "100"
            boolean r1 = r1.equalsIgnoreCase(r12)
            if (r1 == 0) goto L_0x0085
        L_0x0082:
            r10.put(r6, r5)
        L_0x0085:
            r1 = 3945(0xf69, float:5.528E-42)
            java.lang.String r1 = X.C36431kI.A19(r7, r1)
            org.json.JSONObject r5 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r1 = "jids"
            org.json.JSONArray r12 = r5.getJSONArray(r1)     // Catch:{ JSONException -> 0x00c8 }
            int r6 = r12.length()     // Catch:{ JSONException -> 0x00c8 }
            r5 = 0
        L_0x009a:
            if (r5 >= r6) goto L_0x00ce
            java.lang.String r13 = r12.getString(r5)     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r1 = r4.user     // Catch:{ JSONException -> 0x00c8 }
            if (r13 != 0) goto L_0x00a5
            goto L_0x00ac
        L_0x00a5:
            boolean r1 = r13.equalsIgnoreCase(r1)     // Catch:{ JSONException -> 0x00c8 }
            if (r1 == 0) goto L_0x00c5
            goto L_0x00ae
        L_0x00ac:
            if (r1 != 0) goto L_0x00c5
        L_0x00ae:
            r1 = 200(0xc8, float:2.8E-43)
            X.C36421kH.A1M(r11, r10, r1)
            r1 = 16
            r11 = 16
            byte[] r6 = new byte[r1]
            r5 = 0
        L_0x00ba:
            byte r1 = r2[r5]
            int r1 = ~r1
            byte r1 = (byte) r1
            r6[r5] = r1
            int r5 = r5 + 1
            if (r5 >= r11) goto L_0x00cf
            goto L_0x00ba
        L_0x00c5:
            int r5 = r5 + 1
            goto L_0x009a
        L_0x00c8:
            r5 = move-exception
            java.lang.String r1 = "FlowsLogger/isMitigatedAlphaPartner()"
            com.whatsapp.util.Log.e(r1, r5)
        L_0x00ce:
            r6 = r2
        L_0x00cf:
            java.lang.String r12 = "show_loading"
            boolean r1 = r10.containsKey(r12)
            if (r1 == 0) goto L_0x0146
            boolean r11 = X.C90474aD.A1W(r10, r12)
        L_0x00db:
            java.lang.String r5 = "show_full_screen_error"
            boolean r1 = r10.containsKey(r5)
            if (r1 == 0) goto L_0x0143
            boolean r33 = X.C90474aD.A1W(r10, r5)
        L_0x00e7:
            r10.remove(r12)
            r10.remove(r5)
            r1 = r16
            X.7i0 r1 = (X.AnonymousClass7i0) r1
            r1.BsW(r11)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>(r10)
            java.lang.String r29 = X.C36381kD.A0y(r5)
            X.67S r14 = r0.A09
            X.6MG r13 = r0.A01
            X.17Y r12 = r0.A02
            X.0wU r11 = r0.A08
            X.0xM r10 = r0.A05
            X.6OE r1 = r0.A03
            X.1A1 r0 = r0.A07
            r32 = 1
            X.6tl r15 = new X.6tl
            r19 = r36
            r25 = r14
            r27 = r9
            r28 = r8
            r30 = r3
            r31 = r6
            r20 = r1
            r21 = r10
            r22 = r7
            r23 = r0
            r24 = r11
            r18 = r12
            r17 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.String r11 = X.C36381kD.A0y(r5)
            r16 = 0
            java.lang.String r13 = "UNKNOWN"
            r17 = 0
            r18 = 0
            r8 = r14
            r9 = r15
            r10 = r4
            r12 = r26
            r14 = r3
            r15 = r2
            r8.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0143:
            r33 = 0
            goto L_0x00e7
        L_0x0146:
            r11 = 0
            goto L_0x00db
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143266qG.Bpp(android.app.Activity, X.62e, java.util.Map):void");
    }

    public C143266qG(AnonymousClass6MG r2, AnonymousClass17Y r3, AnonymousClass6OE r4, C117105li r5, C20310xM r6, AnonymousClass1KZ r7, C20810yC r8, AnonymousClass1A1 r9, C19770wU r10, AnonymousClass67S r11) {
        C36321k7.A1B(r10, r6, r9, r3, r5);
        C36361kB.A1J(r2, 6, r8);
        AnonymousClass00C.A0D(r7, 10);
        this.A08 = r10;
        this.A05 = r6;
        this.A07 = r9;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A09 = r11;
        this.A00 = r8;
        this.A03 = r4;
        this.A06 = r7;
    }
}

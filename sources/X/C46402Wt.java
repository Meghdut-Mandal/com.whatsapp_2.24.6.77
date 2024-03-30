package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.2Wt  reason: invalid class name and case insensitive filesystem */
public class C46402Wt extends C54642tH {
    public final AnonymousClass16D A00;
    public final AnonymousClass171 A01;
    public final C21060yb A02;
    public final C20810yC A03;
    public final AnonymousClass1VC A04;
    public final AnonymousClass3G0 A05;
    public final AnonymousClass3G1 A06;
    public final C28371Sj A07;
    public final AnonymousClass1CR A08;
    public final C19730wQ A09;
    public final C19630wG A0A;
    public final C220412q A0B;
    public final C19890wg A0C;
    public final AnonymousClass1AW A0D;

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0177 A[Catch:{ JSONException -> 0x01cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017e A[Catch:{ JSONException -> 0x01cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0188 A[Catch:{ JSONException -> 0x01cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cb A[Catch:{ JSONException -> 0x01cf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject A04(X.AnonymousClass3T1 r10, X.C128946Ef r11) {
        /*
            r9 = this;
            r8 = 0
            org.json.JSONObject r3 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x01cf }
            X.3Qa r4 = r10.A1J     // Catch:{ JSONException -> 0x01cf }
            X.11F r5 = r4.A00     // Catch:{ JSONException -> 0x01cf }
            boolean r0 = r5 instanceof X.C177528dw     // Catch:{ JSONException -> 0x01cf }
            if (r0 != 0) goto L_0x01ce
            boolean r0 = r10 instanceof X.AnonymousClass2bV     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x005c
            int r0 = r10.A1I     // Catch:{ JSONException -> 0x01cf }
            if (r0 != 0) goto L_0x005c
            java.lang.String r2 = "text"
            r6 = r2
            X.9lY r7 = r10.A0M     // Catch:{ JSONException -> 0x01cf }
            if (r7 == 0) goto L_0x004e
            int r1 = r7.A03     // Catch:{ JSONException -> 0x01cf }
            r0 = 5
            if (r1 == r0) goto L_0x01ce
            X.0wQ r1 = r9.A09     // Catch:{ JSONException -> 0x01cf }
            com.whatsapp.jid.UserJid r0 = r7.A0D     // Catch:{ JSONException -> 0x01cf }
            boolean r0 = r1.A0M(r0)     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x01ce
            java.lang.String r2 = "payment"
        L_0x002d:
            java.lang.String r1 = r10.A0b()     // Catch:{ JSONException -> 0x01cf }
            java.util.List r0 = r10.A0w     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = r9.A00(r1, r0)     // Catch:{ JSONException -> 0x01cf }
            r3.put(r6, r0)     // Catch:{ JSONException -> 0x01cf }
        L_0x003a:
            r9.A02(r10, r3)     // Catch:{ JSONException -> 0x01cf }
        L_0x003d:
            java.lang.String r0 = "type"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x01cf }
        L_0x0042:
            X.11F r2 = r10.A0J()     // Catch:{ JSONException -> 0x01cf }
            boolean r1 = X.AnonymousClass143.A0G(r5)     // Catch:{ JSONException -> 0x01cf }
            if (r1 == 0) goto L_0x017e
            goto L_0x0175
        L_0x004e:
            r0 = r10
            X.2bV r0 = (X.AnonymousClass2bV) r0     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = r0.A05     // Catch:{ JSONException -> 0x01cf }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01cf }
            if (r0 != 0) goto L_0x002d
            java.lang.String r2 = "link"
            goto L_0x002d
        L_0x005c:
            boolean r0 = r10 instanceof X.C46852bm     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r1 = "image"
            if (r0 == 0) goto L_0x0075
            java.lang.String r2 = r10.A0b()     // Catch:{ JSONException -> 0x01cf }
            java.util.List r0 = r10.A0w     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r2 = r9.A00(r2, r0)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = "text"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x01cf }
            r9.A01(r10, r3)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x00d4
        L_0x0075:
            boolean r0 = r10 instanceof X.C46842bl     // Catch:{ JSONException -> 0x01cf }
            if (r0 != 0) goto L_0x01cf
            boolean r0 = r10 instanceof X.C88854Uh     // Catch:{ JSONException -> 0x01cf }
            if (r0 != 0) goto L_0x01cf
            boolean r0 = r10 instanceof X.C46882bp     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x00db
            r7 = r10
            X.2bU r7 = (X.AnonymousClass2bU) r7     // Catch:{ JSONException -> 0x01cf }
            r9.A01(r7, r3)     // Catch:{ JSONException -> 0x01cf }
            r9.A02(r10, r3)     // Catch:{ JSONException -> 0x01cf }
            X.0yC r2 = r9.A03     // Catch:{ JSONException -> 0x01cf }
            r0 = 6160(0x1810, float:8.632E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x00d4
            X.3Kz r2 = r7.A0V()     // Catch:{ JSONException -> 0x01cf }
            boolean r0 = r7.A1Q()     // Catch:{ JSONException -> 0x01cf }
            r6 = 1
            if (r0 == 0) goto L_0x00ae
            byte[] r0 = r2.A02()     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x00ae
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r6)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = "thumbnail"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x01cf }
        L_0x00ae:
            X.3Qj r0 = r7.A01     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x00d4
            byte[] r0 = r0.A0a     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r6 = android.util.Base64.encodeToString(r0, r6)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r2 = r7.A07     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = "media_url"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = "media_key"
            r3.put(r0, r6)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r2 = r7.A03     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = "media_enc_hash"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r2 = r7.A04     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = "media_dec_hash"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x01cf }
        L_0x00d4:
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x0042
        L_0x00db:
            boolean r0 = r10 instanceof X.C46812bi     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x0111
            java.lang.String r1 = "audio"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01cf }
            r0 = r10
            X.2bU r0 = (X.AnonymousClass2bU) r0     // Catch:{ JSONException -> 0x01cf }
            int r2 = r0.A0B     // Catch:{ JSONException -> 0x01cf }
            X.1VC r0 = r9.A04     // Catch:{ JSONException -> 0x01cf }
            X.0yC r1 = r0.A01     // Catch:{ JSONException -> 0x01cf }
            r0 = 5650(0x1612, float:7.917E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x0042
            r1 = 0
            int r0 = r2 + -1
            int r0 = r0 / 10
            int r0 = java.lang.Math.max(r1, r0)     // Catch:{ JSONException -> 0x01cf }
            r1 = 500(0x1f4, float:7.0E-43)
            int r0 = r0 + 1
            int r0 = r0 * 10
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = "media_duration"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x0042
        L_0x0111:
            boolean r0 = r10 instanceof X.C181798o3     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r2 = "video"
            if (r0 == 0) goto L_0x0118
            goto L_0x0167
        L_0x0118:
            boolean r0 = r10 instanceof X.C46962bx     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x0125
            java.lang.String r1 = "sticker"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x0042
        L_0x0125:
            boolean r0 = r10 instanceof X.C181788o2     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x0138
            r9.A01(r10, r3)     // Catch:{ JSONException -> 0x01cf }
            r9.A02(r10, r3)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r1 = "gif"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x0042
        L_0x0138:
            boolean r0 = r10 instanceof X.AnonymousClass2bL     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x0148
            r9.A01(r10, r3)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r1 = "location"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x0042
        L_0x0148:
            boolean r0 = r10 instanceof X.AnonymousClass2bX     // Catch:{ JSONException -> 0x01cf }
            if (r0 != 0) goto L_0x016c
            boolean r0 = r10 instanceof X.AnonymousClass2bW     // Catch:{ JSONException -> 0x01cf }
            if (r0 != 0) goto L_0x016c
            boolean r0 = r10 instanceof X.C46972by     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x015d
            java.lang.String r1 = "document"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x0042
        L_0x015d:
            boolean r0 = r10 instanceof X.C46892bq     // Catch:{ JSONException -> 0x01cf }
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r10 instanceof X.C47012ca     // Catch:{ JSONException -> 0x01cf }
            if (r0 == 0) goto L_0x01ce
            goto L_0x003d
        L_0x0167:
            r9.A01(r10, r3)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x003a
        L_0x016c:
            java.lang.String r1 = "contact"
            java.lang.String r0 = "type"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x0042
        L_0x0175:
            if (r2 == 0) goto L_0x017e
            X.16D r0 = r9.A00     // Catch:{ JSONException -> 0x01cf }
            X.141 r6 = r0.A0D(r2)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x0184
        L_0x017e:
            X.16D r0 = r9.A00     // Catch:{ JSONException -> 0x01cf }
            X.141 r6 = X.C36441kJ.A0i(r0, r5)     // Catch:{ JSONException -> 0x01cf }
        L_0x0184:
            java.lang.String r2 = "group_name"
            if (r1 == 0) goto L_0x01cb
            X.141 r1 = X.C36441kJ.A0i(r0, r5)     // Catch:{ JSONException -> 0x01cf }
            X.171 r0 = r9.A01     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = r0.A0H(r1)     // Catch:{ JSONException -> 0x01cf }
        L_0x0192:
            r3.putOpt(r2, r0)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r2 = "author_name"
            X.171 r1 = r9.A01     // Catch:{ JSONException -> 0x01cf }
            r0 = 0
            X.34G r0 = r1.A0F(r6, r0)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = r0.A01     // Catch:{ JSONException -> 0x01cf }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r1 = "author_id"
            X.3G0 r2 = r9.A05     // Catch:{ JSONException -> 0x01cf }
            X.11F r0 = r6.A0H     // Catch:{ JSONException -> 0x01cf }
            X.C18740tg.A06(r0)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = r2.A01(r0, r11)     // Catch:{ JSONException -> 0x01cf }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r1 = "chat_id"
            X.C18740tg.A06(r5)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = r2.A01(r5, r11)     // Catch:{ JSONException -> 0x01cf }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r1 = "message_id"
            X.3G1 r0 = r9.A06     // Catch:{ JSONException -> 0x01cf }
            java.lang.String r0 = r0.A01(r4, r11)     // Catch:{ JSONException -> 0x01cf }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x01cf }
            goto L_0x01cd
        L_0x01cb:
            r0 = 0
            goto L_0x0192
        L_0x01cd:
            return r3
        L_0x01ce:
            return r8
        L_0x01cf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46402Wt.A04(X.3T1, X.6Ef):org.json.JSONObject");
    }

    private void A01(AnonymousClass3T1 r3, JSONObject jSONObject) {
        jSONObject.put("text", A00(C20600xp.A05(this.A0A.A00, r3, this.A0D), r3.A0w));
    }

    private void A02(AnonymousClass3T1 r5, JSONObject jSONObject) {
        jSONObject.put("user_mentioned", false);
        List<C80163ux> list = r5.A0w;
        if (list != null) {
            for (C80163ux r0 : list) {
                if (this.A09.A0M(r0.A00)) {
                    jSONObject.put("user_mentioned", true);
                    return;
                }
            }
        }
    }

    public C46402Wt(C19730wQ r1, AnonymousClass16D r2, AnonymousClass171 r3, C21060yb r4, C19630wG r5, C220412q r6, C20810yC r7, AnonymousClass1VC r8, AnonymousClass3G0 r9, AnonymousClass3G1 r10, C28371Sj r11, C19890wg r12, AnonymousClass1AW r13, AnonymousClass1CR r14) {
        this.A03 = r7;
        this.A0A = r5;
        this.A07 = r11;
        this.A09 = r1;
        this.A0B = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A08 = r14;
        this.A04 = r8;
        this.A0C = r12;
        this.A05 = r9;
        this.A06 = r10;
        this.A0D = r13;
    }

    private String A00(String str, List list) {
        CharSequence A082 = AnonymousClass6YV.A08(this.A02, this.A0C, AnonymousClass3TB.A02(str));
        SpannableStringBuilder spannableStringBuilder = A082;
        if (list != null) {
            spannableStringBuilder = A082;
            if (!list.isEmpty()) {
                boolean isEmpty = TextUtils.isEmpty(A082);
                spannableStringBuilder = A082;
                if (!isEmpty) {
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(A082);
                    ArrayList A0I = AnonymousClass001.A0I();
                    this.A07.A05(valueOf, new C90374a3(A0I, 1), list);
                    Collections.sort(A0I, Collections.reverseOrder());
                    Iterator it = A0I.iterator();
                    while (it.hasNext()) {
                        int A0A2 = C36341k9.A0A(it);
                        valueOf.delete(A0A2, A0A2 + 1);
                    }
                    spannableStringBuilder = valueOf;
                }
            }
        }
        CharSequence A022 = AnonymousClass14B.A02(spannableStringBuilder);
        if (A022 == null) {
            return null;
        }
        return A022.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r0.isBlocked() != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C596234q A03(X.AnonymousClass3T1 r7, X.C128946Ef r8) {
        /*
            r6 = this;
            X.11F r5 = X.C64933Qa.A01(r7)
            boolean r0 = r5 instanceof X.C28981Uw
            r4 = 0
            if (r0 != 0) goto L_0x004b
            X.1CR r2 = r6.A08
            boolean r0 = r2.A0j(r5)
            if (r0 != 0) goto L_0x004b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x004c
            X.3LI r0 = X.C36361kB.A0d(r5, r2)
            X.2dt r0 = (X.C47192dt) r0
            java.lang.String r1 = r0.A0E()
            X.0yb r0 = r6.A02
            android.app.NotificationManager r3 = r0.A07()
            if (r3 == 0) goto L_0x004c
            android.app.NotificationChannel r2 = r3.getNotificationChannel(r1)
            if (r2 == 0) goto L_0x004c
            int r0 = r2.getImportance()
            if (r0 == 0) goto L_0x004b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x004c
            java.lang.String r0 = r2.getGroup()
            android.app.NotificationChannelGroup r0 = r3.getNotificationChannelGroup(r0)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.isBlocked()
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            return r4
        L_0x004c:
            X.12q r0 = r6.A0B
            boolean r0 = r0.A0N(r5)
            if (r0 != 0) goto L_0x004b
            org.json.JSONObject r1 = r6.A04(r7, r8)
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = "incoming_message"
            X.34q r4 = new X.34q
            r4.<init>(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46402Wt.A03(X.3T1, X.6Ef):X.34q");
    }
}

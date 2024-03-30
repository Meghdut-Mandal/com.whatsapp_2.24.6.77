package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3PD  reason: invalid class name */
public class AnonymousClass3PD {
    public AnonymousClass11F A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04 = null;
    public String A05 = null;
    public String A06;
    public String A07;
    public String A08;
    public String A09 = null;
    public String A0A;
    public List A0B;
    public JSONObject A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0086 A[SYNTHETIC, Splitter:B:9:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3PE A00(android.os.Bundle r30) {
        /*
            java.lang.String r3 = "banner"
            r0 = r30
            java.lang.String r1 = r0.getString(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = r0.getString(r3)     // Catch:{ JSONException -> 0x0018 }
            org.json.JSONObject r23 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x0018 }
            goto L_0x001e
        L_0x0018:
            r1 = move-exception
            r1.printStackTrace()
        L_0x001c:
            r23 = r2
        L_0x001e:
            java.lang.String r1 = "data"
            java.lang.String r12 = r0.getString(r1, r2)
            java.lang.String r1 = "source"
            java.lang.String r13 = r0.getString(r1, r2)
            java.lang.String r1 = "entry_point"
            java.lang.String r14 = r0.getString(r1, r2)
            java.lang.String r1 = "has_ib"
            boolean r24 = r0.getBoolean(r1)
            java.lang.String r1 = "has_wm"
            boolean r25 = r0.getBoolean(r1)
            java.lang.String r1 = "ads_logging_requires_tos"
            boolean r26 = r0.getBoolean(r1)
            java.lang.String r1 = "show_ad_attribution"
            boolean r27 = r0.getBoolean(r1)
            java.lang.String r1 = "show_keyboard"
            boolean r28 = r0.getBoolean(r1)
            java.lang.String r1 = "source_url"
            java.lang.String r15 = r0.getString(r1)
            java.lang.String r1 = "ctwa_context"
            java.lang.String r16 = r0.getString(r1)
            java.lang.String r1 = "icebreaker"
            java.lang.String r17 = r0.getString(r1)
            java.lang.String r1 = "lid"
            X.11F r10 = X.C36351kA.A0i(r0, r1)
            java.lang.String r1 = "jid"
            com.whatsapp.jid.UserJid r11 = X.C36391kE.A0h(r0, r1)
            java.lang.String r1 = "productId"
            java.lang.String r18 = r0.getString(r1)
            java.lang.String r1 = "land_on_whatsapp_catalog"
            java.lang.String r19 = r0.getString(r1)
            java.lang.String r1 = "categoryId"
            java.lang.String r20 = r0.getString(r1)
            java.lang.String r1 = "client_filters"
            java.util.ArrayList r1 = r0.getStringArrayList(r1)
            if (r1 == 0) goto L_0x00d1
            java.util.ArrayList r8 = X.C36321k7.A0J(r1)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x00c7 }
        L_0x008e:
            boolean r1 = r9.hasNext()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            if (r1 == 0) goto L_0x00c2
            java.lang.String r3 = X.AnonymousClass001.A0C(r9)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            X.2ox[] r5 = X.C52142ox.values()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            int r7 = r5.length     // Catch:{ IllegalArgumentException -> 0x00c7 }
        L_0x00a1:
            if (r1 >= r7) goto L_0x00b4
            r4 = r5[r1]     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.String r6 = r4.label     // Catch:{ IllegalArgumentException -> 0x00c7 }
            boolean r6 = X.AnonymousClass00C.A0J(r6, r3)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            if (r6 == 0) goto L_0x00b1
            r8.add(r4)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            goto L_0x008e
        L_0x00b1:
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00b4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.String r4 = "Not a valid client filter: "
            r1.append(r4)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0c(r3, r1)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x00c7 }
        L_0x00c2:
            java.util.List r2 = X.C007103b.A0Y(r8)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            goto L_0x00d1
        L_0x00c7:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Failed to convert client filter from string to CTWAClientFilter, message: "
            X.C36321k7.A1W(r1, r3, r4)
        L_0x00d1:
            java.lang.String r1 = "consumer_disclosure"
            boolean r29 = r0.getBoolean(r1)
            java.lang.String r1 = "ctwa_context_override_phone_number"
            java.lang.String r21 = r0.getString(r1)
            java.lang.String r1 = "always_show_ad_attribution"
            boolean r30 = r0.getBoolean(r1)
            X.3PE r9 = new X.3PE
            r22 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PD.A00(android.os.Bundle):X.3PE");
    }

    public AnonymousClass3PE A01() {
        String str = this.A04;
        String str2 = this.A09;
        String str3 = this.A05;
        boolean z = this.A0G;
        boolean z2 = this.A0H;
        boolean z3 = this.A0D;
        boolean z4 = this.A0I;
        boolean z5 = this.A0J;
        String str4 = this.A0A;
        String str5 = this.A03;
        String str6 = this.A06;
        AnonymousClass11F r8 = this.A00;
        UserJid userJid = this.A01;
        String str7 = this.A08;
        String str8 = this.A07;
        String str9 = this.A02;
        JSONObject jSONObject = this.A0C;
        List list = this.A0B;
        boolean z6 = z;
        String str10 = str3;
        return new AnonymousClass3PE(r8, userJid, str, str2, str10, str4, str5, str6, str7, str8, str9, (String) null, list, jSONObject, z6, z2, z3, z4, z5, this.A0F, this.A0E);
    }
}

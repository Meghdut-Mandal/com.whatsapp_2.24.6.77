package X;

import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.3pe  reason: invalid class name and case insensitive filesystem */
public class C76913pe implements C236119d {
    public C20420xX A00;
    public boolean A01 = false;
    public boolean A02 = true;
    public final AnonymousClass17Y A03;
    public final AnonymousClass19J A04;
    public final AnonymousClass3E3 A05;
    public final AnonymousClass19A A06;
    public final C19770wU A07;

    public void BVN(String str) {
        if (!this.A01) {
            AnonymousClass17Y r3 = this.A03;
            AnonymousClass3E3 r2 = this.A05;
            Objects.requireNonNull(r2);
            r3.Bp3(new C81113wU(r2, 23));
        }
    }

    public void BWw(C203399nx r5, String str) {
        if (!this.A01) {
            Log.e("GetCTWAContextIQ/response-error");
            C203399nx A0c = r5.A0c("error");
            if (A0c != null) {
                this.A03.Bp3(new C81283wl((Object) this, A0c.A0S("code", 0), 27));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.34R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r19, java.lang.String r20) {
        /*
            r18 = this;
            r2 = r18
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "context"
            r1 = r19
            X.9nx r4 = r1.A0c(r0)
            if (r4 == 0) goto L_0x00d3
            java.lang.String r0 = "headline"
            java.lang.String r12 = A00(r4, r0)
            java.lang.String r0 = "body"
            java.lang.String r13 = A00(r4, r0)
            java.lang.String r0 = "click_id"
            java.lang.String r15 = A00(r4, r0)
            java.lang.String r0 = "referral_parameter"
            java.lang.String r16 = A00(r4, r0)
            java.lang.String r0 = "source"
            X.9nx r3 = r4.A0c(r0)
            if (r3 == 0) goto L_0x00d3
            java.lang.String r0 = "id"
            java.lang.String r6 = A00(r3, r0)
            java.lang.String r0 = "type"
            java.lang.String r5 = A00(r3, r0)
            java.lang.String r1 = "url"
            java.lang.String r3 = A00(r3, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00d3
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00d3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00d3
            X.36c r9 = new X.36c
            r9.<init>(r6, r5, r3)
            java.lang.String r0 = "thumbnail"
            X.9nx r5 = r4.A0c(r0)
            r10 = 0
            if (r5 == 0) goto L_0x007c
            java.lang.String r3 = A00(r5, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "bytes"
            X.9nx r0 = r5.A0c(r0)
            if (r0 == 0) goto L_0x0076
            byte[] r10 = r0.A01
        L_0x0076:
            X.34R r0 = new X.34R
            r0.<init>(r3, r10)
            r10 = r0
        L_0x007c:
            java.lang.String r0 = "welcome_message"
            X.9nx r0 = r4.A0c(r0)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r14 = r0.A0e()
        L_0x0088:
            java.lang.String r0 = "icebreaker"
            java.util.List r0 = r4.A0j(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            if (r0 == 0) goto L_0x00f0
            java.util.Iterator r8 = r0.iterator()
        L_0x0098:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f0
            X.9nx r7 = X.C36431kI.A0s(r8)
            java.lang.String r0 = "question"
            X.9nx r5 = r7.A0c(r0)
            if (r5 == 0) goto L_0x0098
            java.lang.String r0 = r5.A0e()
            if (r0 == 0) goto L_0x0098
            java.lang.String r6 = r5.A0e()
            java.lang.String r0 = "response"
            X.9nx r5 = r7.A0c(r0)
            if (r5 == 0) goto L_0x00cf
            java.lang.String r0 = r5.A0e()
            if (r0 == 0) goto L_0x00cf
            java.lang.String r5 = r5.A0e()
        L_0x00c6:
            X.3Fw r0 = new X.3Fw
            r0.<init>(r6, r5)
            r3.add(r0)
            goto L_0x0098
        L_0x00cf:
            r5 = 0
            goto L_0x00c6
        L_0x00d1:
            r14 = 0
            goto L_0x0088
        L_0x00d3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetCTWAContextIQ/onSuccess corrupted-response context iq="
            r1.append(r0)
            r0 = r20
            r1.append(r0)
            java.lang.String r0 = ""
            X.C36321k7.A1Z(r1, r0)
            X.17Y r3 = r2.A03
            r0 = 24
            X.3wU r1 = new X.3wU
            r1.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x0118
        L_0x00f0:
            java.lang.String r0 = "video"
            X.9nx r0 = r4.A0c(r0)
            r11 = 0
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = A00(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0108
            X.31Z r11 = new X.31Z
            r11.<init>(r1)
        L_0x0108:
            X.3Ah r8 = new X.3Ah
            r17 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.17Y r3 = r2.A03
            r0 = 15
            X.3wc r1 = new X.3wc
            r1.<init>(r2, r8, r0)
        L_0x0118:
            r3.Bp3(r1)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76913pe.BiM(X.9nx, java.lang.String):void");
    }

    public C76913pe(AnonymousClass17Y r2, AnonymousClass19J r3, AnonymousClass3E3 r4, AnonymousClass19A r5, C19770wU r6) {
        this.A03 = r2;
        this.A07 = r6;
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
    }

    public static String A00(C203399nx r0, String str) {
        C203399nx A0c = r0.A0c(str);
        if (A0c == null) {
            return null;
        }
        return A0c.A0e();
    }
}

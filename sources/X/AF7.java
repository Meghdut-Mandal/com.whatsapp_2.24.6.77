package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import org.json.JSONObject;

public class AF7 implements C23075B3f {
    public C20810yC A00;
    public Integer A01;
    public final C21010yW A02;
    public final AE0 A03;
    public final C1271267b A04;

    public C176658cT A04(Integer num, Integer num2, String str, String str2) {
        return A03((C131606Ps) null, num, num2, str, str2, (String) null, (String) null, false);
    }

    public void A09(Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z) {
        this.A02.Bly(A03((C131606Ps) null, num, num2, str, str2, str3, str4, z));
    }

    public void BOp(C131606Ps r11, Integer num, Integer num2, String str, String str2) {
        BOq(r11, num, num2, str, str2, (String) null, (String) null, false, false);
    }

    public void BOq(C131606Ps r12, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C176658cT.A03(A03((C131606Ps) null, num, num2, str, str2, str3, str4, z2), r12, this, z);
    }

    public static String A00(C207249un r2) {
        if (!(r2 instanceof C175758b0)) {
            return SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
        }
        String str = (String) ((C175758b0) r2).A00.A00;
        if (str == null) {
            return null;
        }
        C188568zn A002 = AnonymousClass973.A00(str);
        if (A002 != null) {
            return A002.methodName;
        }
        if ("other".equals(str)) {
            return "other";
        }
        return null;
    }

    public static void A01(C176658cT r3, C131606Ps r4) {
        if (r4 != null) {
            JSONObject jSONObject = r4.A01;
            if (jSONObject.has("is_payment_account_setup")) {
                r3.A01 = Boolean.valueOf(jSONObject.optBoolean("is_payment_account_setup"));
                jSONObject.remove("is_payment_account_setup");
            }
            C165587tf.A18(r3, r4, jSONObject);
        }
    }

    public C131606Ps A05(C207249un r3, C131606Ps r4) {
        if (r4 == null) {
            r4 = C165567td.A0F();
        }
        String A002 = A00(r3);
        if (A002 != null) {
            r4.A03("payment_method", A002);
        }
        return r4;
    }

    public C176658cT B4W() {
        C176658cT r1 = new C176658cT();
        r1.A0V = this.A04.A00();
        C202159l8 r0 = C202159l8.A0E;
        r1.A0R = "IN";
        A0A(this.A03.A0B());
        r1.A0F = this.A01;
        return r1;
    }

    public void BOZ(C21667AUj aUj, Integer num, Integer num2, String str, String str2) {
        int i;
        C176488cC r1 = new C176488cC();
        r1.A01 = num;
        r1.A08 = str;
        if (num2 != null) {
            r1.A00 = num2;
        }
        r1.A06 = str2;
        if (aUj != null) {
            r1.A05 = aUj.A06;
            r1.A07 = aUj.A08;
            r1.A04 = aUj.A05;
            r1.A02 = Integer.valueOf(aUj.A01);
            i = 1;
        } else {
            i = 2;
        }
        r1.A03 = Integer.valueOf(i);
        this.A02.Bly(r1);
    }

    public void BOl(C176658cT r2) {
        r2.A0V = this.A04.A00();
        C202159l8 r0 = C202159l8.A0E;
        r2.A0R = "IN";
        this.A02.Bly(r2);
    }

    public void Buu() {
        this.A04.A01();
    }

    public void reset() {
        C165587tf.A1B(this.A04);
    }

    public AF7(C21010yW r1, AE0 ae0, C1271267b r3) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = ae0;
    }

    public C176658cT A02(C202059ky r3, int i) {
        C176658cT B4W = B4W();
        B4W.A0C = Integer.valueOf(C176658cT.A00(B4W, r3, i));
        B4W.A08 = C36371kC.A0n();
        return B4W;
    }

    public C176658cT A03(C131606Ps r4, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z) {
        C176658cT B4W = B4W();
        B4W.A0b = str;
        B4W.A06 = Boolean.valueOf(z);
        B4W.A08 = num;
        if (this.A00.A0E(1330)) {
            B4W.A0W = str3;
            B4W.A0X = str4;
        }
        if (num2 != null) {
            B4W.A07 = num2;
        }
        if (str2 != null) {
            B4W.A0a = str2;
        }
        A01(B4W, r4);
        return B4W;
    }

    public void A06(C207249un r3, C202059ky r4, int i) {
        String str;
        C176658cT A022 = A02(r4, i);
        C175898bF r0 = r3.A08;
        if (r0 == null) {
            str = "";
        } else {
            str = ((C175818b6) r0).A0B;
        }
        A022.A0O = str;
        this.A02.Bly(A022);
    }

    public void A07(C202059ky r3, int i, int i2) {
        C176658cT B4W = B4W();
        B4W.A0B = Integer.valueOf(i);
        if (r3 != null) {
            B4W.A0S = String.valueOf(r3.A00);
            B4W.A0T = r3.A07;
        }
        B4W.A0A = Integer.valueOf(i2);
        B4W.A08 = C36371kC.A0n();
        B4W.A0b = "api_event";
        C18740tg.A06(B4W);
        BOl(B4W);
    }

    public void A08(C131606Ps r3, Integer num, Integer num2, String str, String str2, String str3) {
        C176658cT A042 = A04(num, num2, str2, str3);
        A042.A0Y = str;
        A01(A042, r3);
        this.A02.Bly(A042);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r3.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Integer r2 = X.C36361kB.A0i()
            if (r4 == 0) goto L_0x000e
            int r0 = r4.hashCode()
            r1 = 2
            switch(r0) {
                case 81882: goto L_0x0011;
                case 2023329: goto L_0x001b;
                case 2212537: goto L_0x0029;
                default: goto L_0x000e;
            }
        L_0x000e:
            r3.A01 = r2
            return
        L_0x0011:
            java.lang.String r0 = "SBI"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 4
            goto L_0x0024
        L_0x001b:
            java.lang.String r0 = "AXIS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 3
        L_0x0024:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0035
        L_0x0029:
            java.lang.String r0 = "HDFC"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0035:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AF7.A0A(java.lang.String):void");
    }

    public void BOb(C202059ky r2, int i) {
        BOl(A02(r2, i));
    }

    public void BOm(Integer num, Integer num2, String str, String str2) {
        this.A02.Bly(A04(num, num2, str, str2));
    }

    public void BOn(Integer num, Integer num2, String str, String str2, boolean z) {
        C176658cT A042 = A04(num, num2, str, str2);
        A042.A05 = Boolean.valueOf(z);
        this.A02.Bly(A042);
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.2KD  reason: invalid class name */
public abstract class AnonymousClass2KD extends C196209Yd {
    public String A05() {
        return "menu_options";
    }

    public String A06(Context context, C206969uL r6) {
        String str;
        String str2;
        String str3;
        if (this instanceof AnonymousClass2KB) {
            String str4 = null;
            if (!(r6 == null || (str3 = r6.A01) == null)) {
                JSONObject A1C = C36441kJ.A1C(str3);
                str = C63893Lv.A00("title", A1C, false);
                str4 = C63893Lv.A00("display_text", A1C, false);
                if (str == null) {
                    return str4;
                }
            }
            return str4;
        }
        str = null;
        if (!(r6 == null || (str2 = r6.A01) == null)) {
            return C63893Lv.A00("title", C36441kJ.A1C(str2), false);
        }
        return str;
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (X.AnonymousClass099.A0O(r1, "display_text", false) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(X.C20810yC r4, X.AnonymousClass8SX r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass2KB
            if (r0 == 0) goto L_0x004f
            r2 = 0
            X.C36331k8.A1I(r5, r4)
            boolean r0 = X.C203099nI.A05(r5)
            if (r0 == 0) goto L_0x0046
            X.8SV r0 = X.C203099nI.A00(r5)
            int r1 = r0.interactiveMessageCase_
            r0 = 6
            if (r1 != r0) goto L_0x0046
            X.8SV r0 = X.C203099nI.A00(r5)
            X.8Q1 r0 = r0.A0u()
            X.B6c r0 = r0.buttons_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0046
            X.8SV r0 = X.C203099nI.A00(r5)
            X.8Q1 r0 = r0.A0u()
            X.B6c r0 = r0.buttons_
            java.lang.Object r0 = r0.get(r2)
            X.8P5 r0 = (X.AnonymousClass8P5) r0
            java.lang.String r1 = r0.buttonParamsJson_
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "display_text"
            boolean r1 = X.AnonymousClass099.A0O(r1, r0, r2)
            r0 = 4001(0xfa1, float:5.607E-42)
            if (r1 != 0) goto L_0x0048
        L_0x0046:
            r0 = 2960(0xb90, float:4.148E-42)
        L_0x0048:
            boolean r0 = r4.A0E(r0)
            r0 = r0 ^ 1
            return r0
        L_0x004f:
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KD.A0B(X.0yC, X.8SX):boolean");
    }
}

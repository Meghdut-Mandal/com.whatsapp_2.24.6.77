package X;

import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.50e  reason: invalid class name and case insensitive filesystem */
public final class C1024850e extends C104555Ad {
    public final C18820ts A00;
    public final Set A01 = AnonymousClass02N.A02("en", "fr", "ar");

    public void A09(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        super.A09(jSONObject);
        jSONObject.put("tos_version", 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1024850e(X.C20050ww r19, X.C19420v0 r20, X.C18820ts r21, X.C20810yC r22, X.AnonymousClass1WF r23, X.C20020wt r24, X.AnonymousClass005 r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, X.AnonymousClass004 r29, X.AnonymousClass004 r30, long r31) {
        /*
            r18 = this;
            r4 = r19
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            X.C36321k7.A1B(r7, r6, r9, r4, r8)
            r5 = r20
            r10 = r25
            r14 = r29
            X.C36321k7.A13(r5, r10, r14)
            r15 = r30
            r12 = r26
            X.C90474aD.A18(r15, r12)
            r16 = r31
            r3 = r18
            r13 = r27
            r11 = r28
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.A00 = r6
            java.lang.String r2 = "en"
            java.lang.String r1 = "fr"
            java.lang.String r0 = "ar"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            java.util.Set r0 = X.AnonymousClass02N.A02(r0)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1024850e.<init>(X.0ww, X.0v0, X.0ts, X.0yC, X.1WF, X.0wt, X.005, java.lang.String, java.lang.String, java.lang.String, X.004, X.004, long):void");
    }

    public String A04() {
        C18820ts r0 = this.A00;
        String A09 = r0.A09();
        AnonymousClass00C.A08(A09);
        if (!this.A01.contains(C26621Kw.A05(C36401kF.A0x(r0)))) {
            return "en-US";
        }
        return A09;
    }
}

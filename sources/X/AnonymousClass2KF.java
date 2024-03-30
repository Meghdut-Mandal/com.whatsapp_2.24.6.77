package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.2KF  reason: invalid class name */
public final class AnonymousClass2KF extends C196209Yd {
    public final C20310xM A00;
    public final C30801an A01;
    public final C19770wU A02;
    public final AnonymousClass1X4 A03;
    public final AnonymousClass30X A04;
    public final C19630wG A05;

    public String A05() {
        return "form_message";
    }

    public String A06(Context context, C206969uL r3) {
        AnonymousClass00C.A0D(context, 0);
        return C36361kB.A0m(context, R.string.f12nameremoved);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.app.Activity r13, X.AnonymousClass3T1 r14, X.C206969uL r15, int r16) {
        /*
            r12 = this;
            r1 = 2
            X.AnonymousClass00C.A0D(r14, r1)
            boolean r0 = r14 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x0087
            r0 = r14
            X.B1o r0 = (X.C23043B1o) r0
            X.9uk r0 = r0.BA8()
            r6 = 0
            if (r0 == 0) goto L_0x0014
            X.9uX r6 = r0.A04
        L_0x0014:
            r10 = 1
            r3 = 0
            if (r6 == 0) goto L_0x0020
            int r0 = r6.A01
            if (r0 != r1) goto L_0x0087
            java.util.List r0 = r6.A04
            if (r0 != 0) goto L_0x0022
        L_0x0020:
            X.09w r0 = X.C023409w.A00
        L_0x0022:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x002a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C181968oK
            if (r0 == 0) goto L_0x002a
            r5.add(r1)
            goto L_0x002a
        L_0x003c:
            int r0 = X.C36331k8.A01(r5)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.util.Iterator r2 = r5.iterator()
        L_0x0049:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r2.next()
            X.8oK r0 = (X.C181968oK) r0
            java.lang.String r1 = r0.A01
            X.9sy r0 = r0.A00
            java.lang.Object r0 = r0.A00
            r4.put(r1, r0)
            goto L_0x0049
        L_0x005f:
            java.util.Iterator r2 = r1.iterator()
        L_0x0063:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r1 = r2.next()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0063
            X.30X r2 = r12.A04
            X.0wG r1 = r12.A05
            r0 = 2131888973(0x7f120b4d, float:1.9412596E38)
            java.lang.String r1 = r1.A01(r0)
            X.17Y r0 = r2.A00
            r0.A0F(r1, r3)
        L_0x0087:
            return
        L_0x0088:
            java.util.Collection r1 = r4.values()
            if (r1 == 0) goto L_0x005f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x005f
        L_0x0094:
            com.whatsapp.jid.UserJid r5 = r14.A0L()
            if (r5 == 0) goto L_0x0087
            if (r6 == 0) goto L_0x00a3
            X.9tV r0 = new X.9tV
            r0.<init>(r10)
            r6.A00 = r0
        L_0x00a3:
            X.1X4 r7 = r12.A03
            long r2 = r14.A1N
            X.0wG r1 = r12.A05
            r0 = 2131889645(0x7f120ded, float:1.941396E38)
            java.lang.String r6 = r1.A01(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r4)
            java.lang.String r8 = r0.toString()
            java.lang.String r4 = "form_message"
            X.19w r0 = r7.A11
            X.3Qa r9 = r0.A02(r5, r10)
            X.0wo r0 = r7.A0K
            long r0 = X.C19970wo.A00(r0)
            X.2cT r5 = new X.2cT
            r5.<init>(r9, r0)
            X.1A1 r0 = r7.A1H
            X.3T1 r1 = X.C36421kH.A0R(r0, r2)
            if (r1 == 0) goto L_0x00d9
            X.1FO r0 = r7.A14
            r0.A00(r5, r1)
        L_0x00d9:
            X.9uD r2 = new X.9uD
            r2.<init>(r4, r8)
            X.90O r1 = X.AnonymousClass90O.EXTENSIONS_1
            X.9ud r0 = new X.9ud
            r0.<init>(r1, r2, r6)
            r5.A00 = r0
            X.0xM r0 = r7.A0X
            r0.A0h(r5)
            X.1an r3 = r12.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "{\"cta\":\""
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "\"}"
            java.lang.String r6 = X.AnonymousClass000.A0q(r0, r1)
            r8 = 0
            r9 = 4
            r4 = 0
            r7 = r4
            r11 = 1
            r5 = r4
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            X.0wU r1 = r12.A02
            r0 = 27
            X.C80283v9.A00(r1, r14, r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KF.A08(android.app.Activity, X.3T1, X.9uL, int):void");
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        AnonymousClass00C.A0D(r2, 1);
        return r2.A0E(5124);
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass2KF(AnonymousClass1X4 r2, AnonymousClass30X r3, C19630wG r4, C20310xM r5, C30801an r6, C19770wU r7) {
        C36321k7.A19(r4, r7, r2, r5);
        AnonymousClass00C.A0D(r6, 6);
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r7;
        this.A03 = r2;
        this.A00 = r5;
        this.A01 = r6;
    }
}

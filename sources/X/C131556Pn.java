package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.6Pn  reason: invalid class name and case insensitive filesystem */
public class C131556Pn {
    public AnonymousClass66C A00;
    public AnonymousClass66C A01;
    public AnonymousClass17Z A02;
    public final AnonymousClass6MZ A03;
    public final C130176Ka A04;
    public final C130996Nh A05;
    public final AnonymousClass1UA A06;
    public final C19770wU A07;
    public final AnonymousClass005 A08;
    public final Set A09;
    public final C116715l2 A0A;

    public void A03(C134906bn r10, C160217ke r11, Boolean bool, String str, String str2, String str3) {
        A04(r10, r11, bool, str, str2, str3, this.A09.contains(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r27.booleanValue() == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C131556Pn r22, X.C128936Ee r23, X.C122855vX r24, X.C134906bn r25, X.C160217ke r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, boolean r31) {
        /*
            if (r27 == 0) goto L_0x0009
            boolean r0 = r27.booleanValue()
            r15 = 0
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            r15 = 1
        L_0x000a:
            r5 = r22
            X.6Ka r0 = r5.A04
            r11 = r28
            X.5pM r4 = X.C130176Ka.A00(r0, r11)
            r3 = 0
            X.5pL r1 = r4.A01
            X.6P0 r2 = r1.A01
            r12 = r29
            if (r2 != 0) goto L_0x0038
            X.5l3 r0 = r4.A00
            long r1 = r1.A00
            X.7fo r0 = r0.A00
            r20 = r3
            r16 = r0
            r17 = r3
            r18 = r11
            r19 = r12
            r21 = r1
            X.5Ad r7 = r16.B4s(r17, r18, r19, r20, r21)
        L_0x0033:
            r14 = r30
            if (r30 == 0) goto L_0x0056
            goto L_0x0044
        L_0x0038:
            X.1UG r1 = r0.A00
            X.6uk r0 = new X.6uk
            r0.<init>(r4, r11, r12)
            X.6uw r7 = r1.B4Z(r2, r3, r0, r3)
            goto L_0x0033
        L_0x0044:
            org.json.JSONObject r1 = X.C36441kJ.A1C(r14)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r0 = "FDS_INSTANCE_KEY"
            java.lang.String r13 = r1.getString(r0)     // Catch:{ JSONException -> 0x0051 }
            if (r13 != 0) goto L_0x005e
            goto L_0x0056
        L_0x0051:
            java.lang.String r0 = "qpl params parsing failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0056:
            int r0 = r7.hashCode()
            java.lang.String r13 = java.lang.String.valueOf(r0)
        L_0x005e:
            X.71K r10 = new X.71K
            r18 = r26
            r16 = r10
            r17 = r5
            r19 = r13
            r20 = r12
            r21 = r15
            r16.<init>(r17, r18, r19, r20, r21)
            X.0wU r0 = r5.A07
            X.74J r4 = new X.74J
            r6 = r23
            r8 = r24
            r9 = r25
            r16 = r31
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.Boy(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131556Pn.A00(X.6Pn, X.6Ee, X.5vX, X.6bn, X.7ke, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public void A01(C122855vX r3, C134906bn r4, C160217ke r5, String str, boolean z) {
        if (r4 != null && r4.A01 == "ASYNC_COMPONENT") {
            r5.BfG(str);
        } else if (z) {
            C131816Qt.A00(new C143196q9(this, r3, r5), this.A00, str);
        } else {
            C131816Qt.A01(new C143226qC(this, r3, r5), this.A00, str);
        }
    }

    public void A02(C122855vX r3, C160217ke r4, String str) {
        if (r3.A00 != 5) {
            if (r3.A02 == null) {
                r3.A02 = C90514aH.A0s(str);
            }
            r4.BfE(r3);
            return;
        }
        throw AnonymousClass001.A09("Successful responses should not be processed as errors");
    }

    public void A04(C134906bn r13, C160217ke r14, Boolean bool, String str, String str2, String str3, boolean z) {
        String str4 = str;
        C18740tg.A06(str4);
        C122855vX r5 = new C122855vX();
        Iterator A0y = AnonymousClass000.A0y(this.A0A.A00);
        while (true) {
            C134906bn r6 = r13;
            C160217ke r7 = r14;
            String str5 = str2;
            String str6 = str3;
            boolean z2 = z;
            if (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                if (C36361kB.A1Z(str4, (Pattern) A11.getKey()) && ((C119155pK) A11.getValue()).A01.BLe(str4, str5)) {
                    this.A07.Boy(new AnonymousClass749(this, ((C119155pK) A11.getValue()).A00, r5, r6, r7, str4, str5, str6, z2));
                    return;
                }
            } else {
                A00(this, C128936Ee.A00(), r5, r13, r14, bool, str4, str5, str6, z2);
                return;
            }
        }
    }

    public C131556Pn(AnonymousClass6MZ r1, AnonymousClass66C r2, C116715l2 r3, C130176Ka r4, C130996Nh r5, AnonymousClass1UA r6, C19770wU r7, AnonymousClass005 r8, Set set) {
        this.A00 = r2;
        this.A09 = set;
        this.A08 = r8;
        this.A07 = r7;
        this.A03 = r1;
        this.A05 = r5;
        this.A06 = r6;
        this.A0A = r3;
        this.A04 = r4;
    }
}

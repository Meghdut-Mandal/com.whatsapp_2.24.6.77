package X;

import org.json.JSONException;

/* renamed from: X.8bF  reason: invalid class name and case insensitive filesystem */
public abstract class C175898bF extends C206279t0 {
    public static C207249un A02(AnonymousClass16T r1, C175898bF r2, C203399nx r3) {
        r2.A04(r1, r3, 0);
        return r2.A07();
    }

    public C207249un A07() {
        C202159l8 A00;
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        String str4;
        int i;
        C175868bC r2;
        if (this instanceof C175738ay) {
            return null;
        }
        if (this instanceof AnonymousClass8b7) {
            AnonymousClass8b7 r3 = (AnonymousClass8b7) this;
            C202159l8 A002 = C202159l8.A00("BR");
            String str5 = r3.A0H;
            int i2 = r3.A00;
            int A03 = C165587tf.A03(r3.A0W ? 1 : 0);
            int A032 = C165587tf.A03(r3.A0V ? 1 : 0);
            int A033 = C165587tf.A03(r3.A0S ? 1 : 0);
            int A034 = C165587tf.A03(r3.A0R ? 1 : 0);
            String str6 = r3.A0J;
            long j = r3.A05;
            C175798b4 r4 = new C175798b4(A002, str5, (String) C165577te.A0g(r3.A08), str6, i2, A03, A032, A033, A034, r3.A01);
            r4.A05 = j;
            r4.A08 = r3;
            r4.A04 = r3.A01;
            return r4;
        } else if (this instanceof C175808b5) {
            C175808b5 r42 = (C175808b5) this;
            C202159l8 A003 = C202159l8.A00("BR");
            String str7 = r42.A06;
            C175748az r5 = new C175748az(A003, 0, 0, r42.A00, -1);
            r5.A0A = str7;
            r5.A0E("");
            r5.A0B = (String) C165577te.A0g(r42.A01);
            r5.A0D = null;
            r5.A08 = r42;
            r5.A04 = r42.A00;
            return r5;
        } else if (this instanceof C175818b6) {
            return null;
        } else {
            if (this instanceof C175868bC) {
                C175868bC r22 = (C175868bC) this;
                A00 = C202159l8.A00("BR");
                str = r22.A05;
                str2 = r22.A08;
                str3 = r22.A09;
                z = r22.A0E;
                z2 = r22.A0F;
                str4 = r22.A03;
                i = r22.A00;
                r2 = r22;
            } else {
                C175888bE r23 = (C175888bE) this;
                A00 = C202159l8.A00("IN");
                str = r23.A05;
                str2 = r23.A08;
                str3 = r23.A09;
                z = r23.A0E;
                z2 = r23.A0F;
                str4 = r23.A03;
                i = 0;
                r2 = r23;
            }
            return new C175768b1(A00, r2, str, str2, str3, str4, i, z, z2);
        }
    }

    public C135086c7 A08() {
        Object obj;
        if ((this instanceof C175738ay) || (this instanceof C175808b5) || !(this instanceof C175818b6)) {
            return null;
        }
        C175818b6 r1 = (C175818b6) this;
        if (!C202349ld.A02(r1.A02)) {
            return r1.A02;
        }
        try {
            C135086c7 r0 = r1.A05;
            if (r0 == null) {
                obj = null;
            } else {
                obj = r0.A00;
            }
            return C165617ti.A0P(C146356vT.A00(), String.class, C36441kJ.A1C((String) obj).optString("account_name"), "accountHolderName");
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean A09() {
        if (this instanceof C175858bB) {
            return ((C175858bB) this).A0a;
        }
        return true;
    }
}

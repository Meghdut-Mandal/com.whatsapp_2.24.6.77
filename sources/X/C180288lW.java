package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8lW  reason: invalid class name and case insensitive filesystem */
public class C180288lW extends C183758rJ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ C180228lP A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C180288lW(C180228lP r2, String str, String str2, String str3, boolean z) {
        super(r2, (C64933Qa) null, str, z);
        this.A03 = r2;
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public C193689Ml A0G() {
        long j;
        boolean equalsIgnoreCase;
        boolean equalsIgnoreCase2;
        if (this.A02 != null) {
            C193689Ml A0G = super.A0G();
            C175708av r4 = A0G.A01.A0A;
            if (r4 instanceof C175928bI) {
                C175928bI r42 = (C175928bI) r4;
                if (r42.A0G != null) {
                    String str = this.A00;
                    AnonymousClass16U r3 = C180228lP.A0K;
                    AnonymousClass16X A0R = C165607th.A0R(r3, str);
                    C18740tg.A06(A0R);
                    C180228lP r1 = this.A03;
                    C207119ua A022 = r1.A01.A02(r3, A0R);
                    r42.A0G.A0C = new C201459je(A022, C202349ld.A00(str, "money"), r1.A02.A04(this.A01, false));
                }
            }
            return A0G;
        }
        C199449fK r6 = new C199449fK();
        C180228lP r0 = this.A03;
        AnonymousClass16U r12 = C180228lP.A0K;
        String str2 = r0.A0A;
        if (str2 != null) {
            j = ((long) Float.parseFloat(str2)) * 100;
        } else {
            j = 0;
        }
        r6.A01 = j;
        AnonymousClass16U r13 = C180228lP.A0K;
        r6.A02 = r13;
        r6.A00 = 100;
        C207119ua A012 = r6.A01();
        String str3 = ((AnonymousClass16V) r13).A02;
        AnonymousClass16X r14 = A012.A02;
        C19970wo r15 = r0.A00;
        long A002 = C19970wo.A00(r15);
        long A003 = C19970wo.A00(r15);
        C202159l8 r16 = C202159l8.A0E;
        C202319lY r122 = new C202319lY(r13, r14, (UserJid) null, (UserJid) null, str3, (String) null, (String) null, (String) null, (String) null, (String) null, "IN", 40, 115, 1, 1, 0, A002, A003);
        C175928bI r62 = new C175928bI();
        r62.A0U(r0.A09);
        r62.A0O = r0.A0J;
        C202699mR r7 = r0.A02;
        String str4 = r0.A0I;
        r62.A04 = r7.A04(str4, false);
        r62.A0M = r0.A08;
        String str5 = r0.A0E;
        if (str5 == null) {
            equalsIgnoreCase = true;
        } else {
            equalsIgnoreCase = "Y".equalsIgnoreCase(str5);
        }
        String str6 = r0.A0F;
        if (str6 == null) {
            equalsIgnoreCase2 = true;
        } else {
            equalsIgnoreCase2 = "Y".equalsIgnoreCase(str6);
        }
        long A04 = r7.A04(str4, true);
        long A042 = r7.A04(r0.A0H, false);
        String str7 = r0.A03;
        if (str7 == null) {
            str7 = "MAX";
        }
        r62.A0G = new C201599jw(str7, r0.A0G, r0.A07, r0.A0B, str2, r0.A05, r0.A0D, r0.A0C, r0.A0C, r0.A06, A04, A042, equalsIgnoreCase, equalsIgnoreCase2);
        r122.A0A = r62;
        return new C193689Ml((C207249un) null, r122, (AnonymousClass3T1) null, (AnonymousClass2bZ) null, false);
    }
}

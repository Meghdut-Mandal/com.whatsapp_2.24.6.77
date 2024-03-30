package X;

import java.util.List;

/* renamed from: X.8uE  reason: invalid class name and case insensitive filesystem */
public class C185438uE extends C118095nK implements B07 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C185438uE(C203399nx r12, int i) {
        this.A02 = i;
        C203399nx r4 = r12;
        switch (i) {
            case 0:
                C203399nx.A09(r12);
                this.A00 = C203539oF.A02(r12, APS.A00, 0);
                C22993Azj[] azjArr = new C22993Azj[2];
                azjArr[0] = APT.A00;
                this.A01 = C203379ns.A06(r12, "NewsletterText|NewsletterMedia", C165567td.A0c(APU.A00, azjArr), new String[0]);
                break;
            case 1:
                C203399nx.A09(r12);
                this.A01 = C203539oF.A03(r12, C21549APt.A00, "plaintext");
                this.A00 = C203539oF.A00(r12, C21550APu.A00);
                break;
            default:
                C203399nx.A09(r12);
                this.A00 = C203539oF.A02(r12, AQ0.A00, 0);
                this.A01 = C203539oF.A02(r12, AQ1.A00, 0);
                C203379ns.A0C(r4, AQ2.A00, new String[]{"plaintext"}, 1, 1);
                break;
        }
        this.A00 = r12;
    }

    public void B02(AnonymousClass9OW r34) {
        AnonymousClass9OW r4 = r34;
        switch (this.A02) {
            case 0:
                AnonymousClass1TZ r32 = r4.A05;
                C28981Uw r31 = r4.A04;
                long j = r4.A02;
                long j2 = r4.A00;
                boolean z = r4.A0B;
                long j3 = r4.A01;
                List list = r4.A09;
                List list2 = r4.A0A;
                long j4 = r4.A03;
                boolean z2 = r4.A0C;
                Long l = r4.A07;
                long j5 = j;
                long j6 = j2;
                Long l2 = r4.A06;
                String str = r4.A08;
                List list3 = list;
                List list4 = list2;
                C28981Uw r14 = r31;
                AnonymousClass1TZ r15 = r32;
                Long l3 = l;
                ((B06) this.A01).B01(new AnonymousClass9OV(r14, r15, l3, l2, str, list3, list4, j5, j6, j3, j4, z, z2));
                return;
            case 1:
                AnonymousClass1TZ r152 = r4.A05;
                C28981Uw r142 = r4.A04;
                String str2 = r4.A08;
                long j7 = r4.A02;
                long j8 = r4.A00;
                boolean z3 = r4.A0B;
                long j9 = r4.A01;
                List list5 = r4.A09;
                List list6 = r4.A0A;
                long j10 = r4.A03;
                long j11 = j8;
                byte[] bArr = (byte[]) ((C184078rr) this.A01).A00;
                long j12 = j7;
                String str3 = str2;
                List list7 = list5;
                List list8 = list6;
                AnonymousClass1TZ.A00(r142, r152, (Integer) null, (Long) null, (Long) null, str3, list7, list8, bArr, j12, j11, j9, j10, z3, r4.A0C);
                return;
            default:
                AnonymousClass1TZ r3 = r4.A05;
                AnonymousClass1TZ.A00(r4.A04, r3, (Integer) null, (Long) null, (Long) null, r4.A08, (List) null, (List) null, (byte[]) null, r4.A02, r4.A00, r4.A01, 0, r4.A0B, r4.A0C);
                return;
        }
    }
}

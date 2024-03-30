package X;

import com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6pl  reason: invalid class name and case insensitive filesystem */
public class C142966pl implements C159227j1 {
    public final /* synthetic */ ComplianceInfoViewModel A00;
    public final /* synthetic */ String A01;

    public C142966pl(ComplianceInfoViewModel complianceInfoViewModel, String str) {
        this.A00 = complianceInfoViewModel;
        this.A01 = str;
    }

    public void BXn(String str, int i) {
        C001700s r1;
        int i2;
        boolean equals = this.A01.equals(str);
        ComplianceInfoViewModel complianceInfoViewModel = this.A00;
        if (equals) {
            complianceInfoViewModel.A04.A0N.remove(this);
            r1 = complianceInfoViewModel.A01;
            i2 = 3;
        } else {
            r1 = complianceInfoViewModel.A01;
            i2 = 2;
        }
        C36341k9.A16(r1, i2);
    }

    public void BXo(AnonymousClass9NZ r5, String str) {
        C001700s r1;
        int i;
        C206589te r12;
        String str2 = this.A01;
        if (str2.equals(str)) {
            ComplianceInfoViewModel complianceInfoViewModel = this.A00;
            complianceInfoViewModel.A04.A0N.remove(this);
            C207269up A06 = complianceInfoViewModel.A02.A06((UserJid) null, str2);
            if (!(A06 == null || (r12 = A06.A0A) == null)) {
                complianceInfoViewModel.A00.A0D(r12);
                r1 = complianceInfoViewModel.A01;
                i = 1;
                C36341k9.A16(r1, i);
            }
        }
        r1 = this.A00.A01;
        i = 2;
        C36341k9.A16(r1, i);
    }
}

package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2j7  reason: invalid class name and case insensitive filesystem */
public final class C49442j7 extends C132446Tt {
    public final AnonymousClass16D A00;
    public final AnonymousClass1FF A01;
    public final AnonymousClass32a A02;
    public final C64313Nm A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass35A r9 = (AnonymousClass35A) obj;
        AnonymousClass00C.A0D(r9, 0);
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A02.A00;
        List list = r9.A00;
        indiaUpiPaymentSettingsFragment.A0W = list;
        IndiaUpiPaymentSettingsFragment.A09(indiaUpiPaymentSettingsFragment, list);
        List list2 = r9.A01;
        indiaUpiPaymentSettingsFragment.A0W.size();
        if (!list2.isEmpty()) {
            AnonymousClass19A r5 = indiaUpiPaymentSettingsFragment.A0B;
            C21159AAt aAt = indiaUpiPaymentSettingsFragment.A07;
            C50162kJ r1 = new C50162kJ(indiaUpiPaymentSettingsFragment.A05, indiaUpiPaymentSettingsFragment.A0K, aAt, r5, indiaUpiPaymentSettingsFragment, list2);
            indiaUpiPaymentSettingsFragment.A06 = r1;
            C36391kE.A1Q(r1, indiaUpiPaymentSettingsFragment.A0t);
            return;
        }
        IndiaUpiPaymentSettingsFragment.A09(indiaUpiPaymentSettingsFragment, indiaUpiPaymentSettingsFragment.A0W);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49442j7(AnonymousClass16D r2, AnonymousClass1FF r3, AnonymousClass32a r4, PaymentSettingsFragment paymentSettingsFragment, C64313Nm r6) {
        super(paymentSettingsFragment, true);
        C36321k7.A12(r2, r3, r6);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r6;
        this.A02 = r4;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A002;
        List A0I;
        AnonymousClass011 A19;
        C207219uk r0;
        C207199ui r1;
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A00.A0n(A0I2);
        ArrayList A022 = this.A01.A02();
        C64313Nm r12 = this.A03;
        if (r12.A02) {
            List list = r12.A01;
            AnonymousClass00C.A08(list);
            ArrayList A0I3 = AnonymousClass001.A0I();
            if (A022.isEmpty()) {
                A19 = C36441kJ.A19(A0I3, list);
            } else {
                HashMap A0J = AnonymousClass001.A0J();
                Iterator it = A0I2.iterator();
                while (it.hasNext()) {
                    AnonymousClass141 A0f = C36391kE.A0f(it);
                    AnonymousClass11F r02 = A0f.A0H;
                    if (r02 != null) {
                        A0J.put(r02.getRawString(), A0f);
                    }
                }
                A022.size();
                ArrayList A0I4 = AnonymousClass001.A0I();
                Iterator it2 = A022.iterator();
                while (it2.hasNext()) {
                    AnonymousClass2bZ r13 = (AnonymousClass2bZ) it2.next();
                    AnonymousClass11F r03 = r13.A1J.A00;
                    String str = null;
                    if (r03 != null) {
                        str = r03.getRawString();
                    }
                    Object obj = A0J.get(str);
                    if (!(obj == null || A0I3.contains(obj) || (r0 = r13.A00) == null || (r1 = r0.A01) == null)) {
                        if (C207199ui.A00(r1.A09.A01) != 1 || r1.A06 != null || r1.A07) {
                            A0I4.add(String.valueOf(str));
                            A0I3.add(obj);
                        }
                    }
                }
                ArrayList A0I5 = AnonymousClass001.A0I();
                if (A0I3.size() < 3) {
                    int i = 0;
                    int i2 = 0;
                    while (i < Math.min(3 - (A0I3.size() - i2), list.size())) {
                        String A0s = C36401kF.A0s(list, i);
                        UserJid userJid = PhoneUserJid.WHATSAPP_CAPS_SURVEY;
                        i++;
                        if (A0I4.contains(C222913s.A00(A0s).getRawString())) {
                            i2++;
                        } else {
                            A0I5.add(A0s);
                        }
                    }
                }
                A0I3.size();
                A0I5.size();
                A19 = C36441kJ.A19(A0I3, A0I5);
            }
            A002 = (List) A19.first;
            A0I = (List) A19.second;
        } else {
            A002 = C54982ts.A00(A0I2, A022);
            A0I = AnonymousClass001.A0I();
        }
        return new AnonymousClass35A(A002, A0I);
    }
}

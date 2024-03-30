package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.28m  reason: invalid class name */
public class AnonymousClass28m extends C101344xO {
    public final AnonymousClass3T1 A00;
    public final AnonymousClass2XJ A01;

    public /* bridge */ /* synthetic */ Object A0F() {
        List list;
        UserJid userJid;
        AnonymousClass141 A08;
        AnonymousClass2XJ r3 = this.A01;
        AnonymousClass3T1 r11 = this.A00;
        List A02 = AnonymousClass3RN.A02(r11, r3.A06);
        C65643Sx r14 = null;
        if (A02 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Couldn't load vcard for message ");
            throw new AnonymousClass1YJ(AnonymousClass000.A0o(r11.A1J, A0u));
        }
        ArrayList A14 = C36441kJ.A14(3);
        C65643Sx r10 = null;
        int i = 0;
        int i2 = 0;
        while (i < A02.size() && i < 100 && i2 < 3) {
            try {
                C19630wG r9 = r3.A04;
                AnonymousClass16D r8 = r3.A01;
                C65033Ql r1 = new C65033Ql(r8, r3.A03, r9, r3.A05);
                r1.A05(C36401kF.A0s(A02, i));
                C65643Sx r7 = r1.A04;
                if (r14 == null) {
                    r14 = r7;
                }
                byte[] bArr = r7.A0B;
                if (bArr == null || bArr.length <= 0) {
                    List list2 = r7.A06;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                UserJid userJid2 = ((C607439e) it.next()).A01;
                                if (userJid2 != null && (A08 = r8.A08(userJid2)) != null && r3.A02.A07(A08)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    i++;
                }
                A14.add(r7);
                if (r10 == null) {
                    r10 = r7;
                }
                i2++;
            } catch (AnonymousClass1YJ e) {
                Log.e("Invalid VCard.", e);
            }
            i++;
        }
        String str = null;
        if (!(r14 == null || (list = r14.A06) == null || list.isEmpty() || (userJid = ((C607439e) C36391kE.A0t(r14.A06)).A01) == null || !C197029b1.A00(userJid))) {
            str = r3.A00.A03(userJid);
        }
        if (r10 != null) {
            r14 = r10;
        }
        return new C607139b(r11, str, A14, r14, A02.size());
    }

    public AnonymousClass28m(AnonymousClass3T1 r1, AnonymousClass2XJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}

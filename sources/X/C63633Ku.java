package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3Ku  reason: invalid class name and case insensitive filesystem */
public class C63633Ku {
    public final AnonymousClass1X4 A00;
    public final AnonymousClass1NG A01;
    public final C25361Fz A02;
    public final C30131Zi A03;
    public final AnonymousClass17Y A04;
    public final C19600wD A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass1NM A07;
    public final C24381Cf A08;
    public final C20350xQ A09;
    public final C20510xg A0A;

    public void A00(C87664Pr r12, AnonymousClass141 r13, boolean z, boolean z2) {
        C87664Pr r3 = r12;
        this.A0A.A0A(new AnonymousClass2VS(r3, this, this.A08, r13, this.A09, (AnonymousClass147) C36381kD.A0e(r13, AnonymousClass147.class), z, z2));
    }

    public void A01(AnonymousClass141 r19, String str, List list) {
        C203399nx r6;
        AnonymousClass141 r2 = r19;
        List list2 = list;
        AnonymousClass11F A0G = C36331k8.A0G(r2);
        this.A07.A0C(A0G, list2);
        AnonymousClass1X4 r0 = this.A00;
        C18740tg.A00();
        AnonymousClass1X4.A08(r0, A0G);
        if (r0.A07.A06) {
            boolean z = true;
            String str2 = str;
            if (list == null) {
                if (!r0.A0U.A0O(A0G) || !C36401kF.A1Z(r0.A0j)) {
                    z = false;
                }
                list2 = C24541Cv.A01(r0.A0Z, A0G, 5, true, z);
                r0.A09.A02(A0G, (Integer) null, (String) null, (String) null, C65143Qx.A01(str2), 7, z);
            } else {
                r0.A09.A04(list2, 3);
            }
            C605838k r7 = (C605838k) r0.A1S.get();
            AnonymousClass19A r4 = r7.A02;
            String A092 = r4.A09();
            try {
                if (A0G instanceof UserJid) {
                    AnonymousClass39T r8 = r7.A03;
                    UserJid userJid = (UserJid) A0G;
                    AnonymousClass00C.A0D(userJid, 1);
                    AnonymousClass00C.A0D(str2, 3);
                    AnonymousClass3Fj r11 = r8.A02;
                    String str3 = str2;
                    r6 = r11.A00(userJid, r11.A00.A01(userJid), A092, str3, list2, C023409w.A00).A00;
                    AnonymousClass00C.A08(r6);
                } else if (A0G instanceof AnonymousClass147) {
                    AnonymousClass39T r62 = r7.A03;
                    AnonymousClass147 r82 = (AnonymousClass147) A0G;
                    C36321k7.A0y(r82, str2);
                    r6 = r62.A01.A00(r82, A092, str2, list2);
                } else if ((A0G instanceof C177528dw) && list2.size() > 0) {
                    AnonymousClass39T r9 = r7.A03;
                    C177528dw r83 = (C177528dw) A0G;
                    AnonymousClass3T1 r63 = (AnonymousClass3T1) C36391kE.A0t(list2);
                    C36321k7.A11(r83, r63, str2);
                    r6 = r9.A04.A00(r83, r63, A092, str2);
                } else if (A0G instanceof C28981Uw) {
                    AnonymousClass39T r64 = r7.A03;
                    C28981Uw r84 = (C28981Uw) A0G;
                    C36321k7.A0y(r84, str2);
                    r6 = r64.A03.A00(r84, A092, str2, list2);
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Unrecognized Jid of type: ");
                    C36321k7.A1Y(A0u, A0G.getType());
                    r7.A01.A00(C188648zz.A0e, str2);
                    ((AnonymousClass1NJ) r0.A1L.get()).A03(r2, A0G);
                }
                r4.A0K(new AnonymousClass3T7(r7, 2), r6, A092, 98, 32000);
            } catch (Exception e) {
                r7.A01.A01(C188648zz.A0c, str2, e);
            }
            ((AnonymousClass1NJ) r0.A1L.get()).A03(r2, A0G);
        }
        r2.A0w = true;
        this.A06.A0O(r2);
    }

    public boolean A02(Context context) {
        if (this.A05.A09()) {
            return true;
        }
        Log.w("spamreportmanager/spam/report/no-network-cannot-report");
        boolean A022 = C19600wD.A02(context);
        int i = R.string.f12nameremoved;
        if (A022) {
            i = R.string.f12nameremoved;
        }
        this.A04.A06(i, 0);
        return false;
    }

    public C63633Ku(AnonymousClass17Y r1, AnonymousClass1X4 r2, AnonymousClass1NG r3, C19600wD r4, AnonymousClass16D r5, AnonymousClass1NM r6, C24381Cf r7, C25361Fz r8, C20350xQ r9, C20510xg r10, C30131Zi r11) {
        this.A04 = r1;
        this.A00 = r2;
        this.A06 = r5;
        this.A01 = r3;
        this.A09 = r9;
        this.A0A = r10;
        this.A07 = r6;
        this.A03 = r11;
        this.A08 = r7;
        this.A05 = r4;
        this.A02 = r8;
    }
}

package X;

import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.3le  reason: invalid class name and case insensitive filesystem */
public final class C74463le implements AnonymousClass4U1 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final Set A03 = C36411kG.A15(Integer.valueOf(R.id.lazy_field_call_log));

    public void BOL(C63503Kh r8) {
        AnonymousClass3T1 r6 = r8.A03;
        if (r6 instanceof C106265Iz) {
            C106265Iz r62 = (C106265Iz) r6;
            long A002 = ((AnonymousClass1FB) this.A01.get()).A00(r62);
            if (A002 != -1) {
                AnonymousClass005 r4 = this.A00;
                C107265Nh A05 = ((AnonymousClass1HJ) r4.get()).A05(A002);
                if (A05 != null || (A05 = ((AnonymousClass1HJ) r4.get()).A06(A002)) != null) {
                    r62.A01.A01(A05);
                    r62.A00 = (AnonymousClass1HQ) this.A02.get();
                }
            }
        }
    }

    public C74463le(AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        C36321k7.A11(r2, r3, r4);
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }

    public Set BI3() {
        return this.A03;
    }

    public /* synthetic */ boolean BJq(C63503Kh r2) {
        return true;
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3E2  reason: invalid class name */
public final class AnonymousClass3E2 {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1EL A01;
    public final AnonymousClass3P3 A02;
    public final AnonymousClass1X4 A03;

    public final void A00(Context context, List list, boolean z) {
        boolean A1a = C36341k9.A1a(list, context);
        if (C36401kF.A1a(list)) {
            AnonymousClass11F r1 = C36411kG.A0n(list, 0).A1J.A00;
            if (AnonymousClass143.A0G(r1) && this.A01.A02(r1)) {
                if (z) {
                    this.A00.A04(R.string.f12nameremoved, A1a ? 1 : 0);
                    return;
                }
                return;
            }
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            AnonymousClass2bU r3 = (AnonymousClass2bU) next;
            if (AnonymousClass2tU.A00(r3)) {
                AnonymousClass3P3 r0 = this.A02;
                C18740tg.A06(r0);
                r0.A01(r3);
            } else {
                C65013Qj A002 = AnonymousClass2bU.A00(r3);
                if (!A002.A0V && !A002.A0f && r3.A1h() && A002.A09 != A1a) {
                    A0I.add(next);
                }
            }
        }
        AnonymousClass1X4 r32 = this.A03;
        Activity A0A = C36381kD.A0A(context);
        if (A0I.size() != 0) {
            C24341Cb r9 = r32.A0J;
            C20060wx r10 = r32.A0O;
            if (r9.A04(new C71053g9(A0A, r10))) {
                AnonymousClass2XM r5 = new AnonymousClass2XM(A0A, r32.A02, r32.A0G, r9, r10, C66013Ui.A04(r32.A0V, C36411kG.A0n(A0I, 0)), r32.A0l);
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    r32.A0u.A0C(r5, C36441kJ.A0r(it), 0);
                }
            }
        }
    }

    public AnonymousClass3E2(AnonymousClass17Y r1, AnonymousClass1X4 r2, AnonymousClass1EL r3, AnonymousClass3P3 r4) {
        C36321k7.A18(r1, r3, r4, r2);
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r2;
    }
}

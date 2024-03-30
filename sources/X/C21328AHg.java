package X;

import com.whatsapp.payments.phoenix.flowconfigurationservice.clientdaslquery.BrazilDeviceResolver$resolve$1;
import java.util.Map;

/* renamed from: X.AHg  reason: case insensitive filesystem */
public final class C21328AHg implements C159667jj {
    public String A00;
    public String A01;
    public String A02;
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final C19970wo A05;
    public final C19630wG A06;
    public final AnonymousClass6VM A07;
    public final C29221Vu A08;
    public final C29121Vk A09;
    public final AnonymousClass1EU A0A;
    public final AnonymousClass646 A0B;

    public Class B7I() {
        return AnonymousClass5UN.class;
    }

    public /* bridge */ /* synthetic */ Object Bod(Enum enumR, Object obj, Map map) {
        AnonymousClass6JQ r5 = (AnonymousClass6JQ) obj;
        AnonymousClass5UN r4 = (AnonymousClass5UN) enumR;
        C36321k7.A0w(r5, r4);
        C175798b4 r0 = ((C105715Fu) r5).A00;
        if (r0 != null) {
            return C110515an.A00(C008903u.A00, new BrazilDeviceResolver$resolve$1(r0, this, r4, (C023509x) null));
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        C36321k7.A1Z(A0u, "/resolveObject credential does not exists");
        return null;
    }

    public C21328AHg(AnonymousClass17Y r2, C19730wQ r3, C19970wo r4, C19630wG r5, AnonymousClass6VM r6, C29221Vu r7, C29121Vk r8, AnonymousClass1EU r9, AnonymousClass646 r10) {
        C36321k7.A1B(r4, r2, r5, r3, r9);
        C36321k7.A13(r8, r10, r6);
        AnonymousClass00C.A0D(r7, 9);
        this.A05 = r4;
        this.A03 = r2;
        this.A06 = r5;
        this.A04 = r3;
        this.A0A = r9;
        this.A09 = r8;
        this.A0B = r10;
        this.A07 = r6;
        this.A08 = r7;
    }
}

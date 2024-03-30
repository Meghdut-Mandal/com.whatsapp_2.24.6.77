package X;

import android.content.Context;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.9oM  reason: invalid class name and case insensitive filesystem */
public class C203589oM implements B1H {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C203589oM(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj4;
    }

    public void BWg(C202059ky r3) {
        switch (this.A04) {
            case 0:
                ((AnonymousClass9Qw) this.A02).A00(r3);
                return;
            case 1:
                ((B6I) this.A01).BWh(r3, (Integer) this.A02);
                return;
            default:
                ((PinBottomSheetDialogFragment) this.A03).A1p();
                ((C202239lN) this.A00).A03();
                return;
        }
    }

    public void BiD(String str) {
        String str2 = str;
        switch (this.A04) {
            case 0:
                AnonymousClass9ON r7 = (AnonymousClass9ON) this.A00;
                C198799eD r1 = r7.A09;
                String str3 = str2;
                byte[] A002 = C198799eD.A00(C36371kC.A0m(), str3, "RECOVERACCOUNT", (String) null, (byte[]) null, C90524aI.A0w(), C36371kC.A09(r1.A01));
                AF3 af3 = ((C194449Pt) this.A03).A00;
                C185718ug r12 = new C185718ug(C36431kI.A15(af3.A04), af3.A05, af3.A03, AF3.A00(af3, A002));
                Object obj = this.A02;
                C29121Vk r10 = r7.A03;
                String A09 = r10.A06.A09();
                C186018vH r8 = new C186018vH(r12, A09);
                r10.A0G(new B7K((Context) this.A01, r7.A02, r7.A00, obj, r7, r8, 1), r8.A00, A09, 0);
                return;
            case 1:
                C201009id r4 = (C201009id) this.A00;
                C198799eD r13 = r4.A0O;
                String str4 = str2;
                C201009id.A01(r4, (B6I) this.A01, ((C194449Pt) this.A03).A01(C198799eD.A00(C36371kC.A0m(), str4, "AUTH", (String) null, (byte[]) null, C90524aI.A0w(), C36371kC.A09(r13.A01))), C237919w.A00(r4.A02, r4.A03));
                return;
            default:
                ((C202239lN) this.A00).A06((PinBottomSheetDialogFragment) this.A03, ((C194449Pt) this.A01).A01(C198799eD.A00(C36371kC.A0m(), str2, "AUTH", (String) null, (byte[]) null, C90524aI.A0w(), C36371kC.A09(((C198799eD) this.A02).A01))));
                return;
        }
    }
}

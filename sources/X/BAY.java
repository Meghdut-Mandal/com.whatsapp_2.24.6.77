package X;

import com.whatsapp.util.Log;

public class BAY implements C236119d {
    public Object A00;
    public final int A01;

    public BAY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVN(String str) {
        switch (this.A01) {
            case 0:
                ((C023509x) this.A00).resumeWith(C177788eN.A00);
                return;
            case 1:
                ((AnonymousClass777) this.A00).BVM(C90524aI.A0X("disconnected while waiting for response"));
                return;
            default:
                Log.i("marketing_disclosure/SetMMDisclosureAcceptanceRequest delivery fail");
                AnonymousClass9R2 r5 = (AnonymousClass9R2) this.A00;
                C30921az r4 = r5.A01;
                r4.A08.A00(C19970wo.A00(r4.A00), false);
                C30921az.A00(r4, new C22244Aj5(r5.A00, r4));
                return;
        }
    }

    public void BWw(C203399nx r7, String str) {
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(r7, 1);
                ((C023509x) this.A00).resumeWith(new C177768eL(r7));
                return;
            case 1:
                AnonymousClass00C.A0D(r7, 1);
                ((AnonymousClass777) this.A00).BVO(r7);
                return;
            default:
                C36321k7.A1S("marketing_disclosure/SetMMDisclosureAcceptanceRequest/", AnonymousClass000.A0u(), C165597tg.A05(r7));
                AnonymousClass9R2 r5 = (AnonymousClass9R2) this.A00;
                C30921az r4 = r5.A01;
                r4.A08.A00(C19970wo.A00(r4.A00), false);
                C30921az.A00(r4, new C22244Aj5(r5.A00, r4));
                return;
        }
    }

    public void BiM(C203399nx r4, String str) {
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(r4, 1);
                ((C023509x) this.A00).resumeWith(new C177778eM(r4));
                return;
            case 1:
                AnonymousClass00C.A0D(r4, 1);
                ((AnonymousClass777) this.A00).BVO(r4);
                return;
            default:
                AnonymousClass9R2 r0 = (AnonymousClass9R2) this.A00;
                C30921az r2 = r0.A01;
                C30921az.A00(r2, new C22245Aj6(r0.A00, r2));
                return;
        }
    }
}

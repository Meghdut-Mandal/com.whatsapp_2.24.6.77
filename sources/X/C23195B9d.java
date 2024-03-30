package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;

/* renamed from: X.B9d  reason: case insensitive filesystem */
public class C23195B9d implements B1Q {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23195B9d(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void Bdl(C202059ky r2) {
        switch (this.A02) {
            case 0:
                ((C194739Ra) this.A01).A00(r2);
                return;
            case 2:
                ((AGG) this.A00).A01.A03();
                return;
            default:
                Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
                return;
        }
    }

    public void Bdm(AF3 af3) {
        switch (this.A02) {
            case 0:
                C194449Pt r3 = new C194449Pt(af3);
                C198279dC r2 = (C198279dC) this.A00;
                C198279dC.A00(r2, r3, (C194739Ra) this.A01, r2.A0B);
                return;
            case 1:
                String str = af3.A05;
                BrazilPayBloksActivity.A0H((AnonymousClass6C8) this.A01, (BrazilPayBloksActivity) this.A00, str);
                return;
            case 2:
                C203399nx A012 = new C194449Pt(af3).A01((byte[]) this.A01);
                AGG agg = (AGG) this.A00;
                agg.A00.A1c();
                agg.A01.A06((PinBottomSheetDialogFragment) null, A012);
                return;
            default:
                String str2 = af3.A05;
                C167737yi.A01((C175868bC) this.A01, (C167737yi) this.A00, str2);
                return;
        }
    }
}

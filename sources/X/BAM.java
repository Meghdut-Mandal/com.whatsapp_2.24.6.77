package X;

import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BAM implements B1Z {
    public Object A00;
    public Object A01;
    public final int A02;

    public BAM(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BU3(String str) {
        BAF baf;
        int i;
        if (this.A02 != 0) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A01;
            pinBottomSheetDialogFragment.A1q();
            C202239lN r3 = (C202239lN) this.A00;
            AnonymousClass155 r6 = r3.A05;
            AnonymousClass17Y r7 = r3.A04;
            C29121Vk r9 = r3.A09;
            C29221Vu r8 = r3.A07;
            C200049gU r10 = r3.A0A;
            AnonymousClass9SR r5 = new AnonymousClass9SR(r6, r7, r8, r9, r10, "PIN");
            AF3 A012 = r10.A01("FB", "PIN");
            if (A012 != null) {
                C202239lN.A01(new C194449Pt(A012), pinBottomSheetDialogFragment, r3, str);
            } else {
                r5.A00(new C21255AEl(this, str), "FB");
            }
        } else {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = (PinBottomSheetDialogFragment) this.A01;
            pinBottomSheetDialogFragment2.A1q();
            C195069Sj r2 = (C195069Sj) this.A00;
            int A022 = r2.A04.A02();
            C200959iX r32 = r2.A05;
            if (A022 == 1) {
                baf = new BAF(pinBottomSheetDialogFragment2, this, 4);
                i = 1;
            } else {
                baf = new BAF(pinBottomSheetDialogFragment2, this, 5);
                i = 2;
            }
            C200959iX.A00(new C23197B9f(baf, r32, str, i), baf, r32, "FB");
        }
    }

    public void BYJ(View view) {
        if (this.A02 != 0) {
            C202239lN r4 = (C202239lN) this.A00;
            AnonymousClass155 r1 = r4.A05;
            if (r4 instanceof C179668kV) {
                C179668kV r42 = (C179668kV) r4;
                C191919Ez r3 = new C191919Ez(r1);
                C36331k8.A1F(new C183478qr(r3, r42.A00), r42.A01);
                return;
            }
            return;
        }
        C195069Sj r12 = (C195069Sj) this.A00;
        C191919Ez r32 = new C191919Ez(r12.A01);
        C36331k8.A1F(new C183478qr(r32, r12.A03), r12.A08);
    }
}

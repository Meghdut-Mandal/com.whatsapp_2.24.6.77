package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

public class AGJ implements B1Z {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;
    public final /* synthetic */ C202199lE A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public void BYJ(View view) {
    }

    public AGJ(AnonymousClass155 r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C202199lE r3, boolean z, boolean z2) {
        this.A02 = r3;
        this.A01 = pinBottomSheetDialogFragment;
        this.A00 = r1;
        this.A03 = z;
        this.A04 = z2;
    }

    public void BU3(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1q();
        } else {
            AnonymousClass155 r3 = this.A00;
            if (r3 instanceof BrazilAccountRecoveryPinActivity) {
                r3.Bu1(R.string.f12nameremoved);
                r3.Bwu(r3.getResources().getString(R.string.f12nameremoved));
            }
        }
        C202199lE r1 = this.A02;
        C19970wo r8 = r1.A02;
        AnonymousClass17Y r6 = r1.A00;
        C19730wQ r7 = r1.A01;
        AnonymousClass9SJ r14 = r1.A0F;
        AnonymousClass1EU r13 = r1.A0E;
        AnonymousClass1VY r0 = r1.A0M;
        AnonymousClass9ON r5 = new AnonymousClass9ON(r6, r7, r8, r1.A05, r1.A08, r1.A0A, r1.A0C, r13, r14, r1.A0H, r0);
        AnonymousClass155 r72 = this.A00;
        C23075B3f b3f = r1.A0I;
        String str2 = str;
        AnonymousClass9Qw r12 = new AnonymousClass9Qw(this, str2);
        C176658cT B4W = b3f.B4W();
        B4W.A08 = C36371kC.A0n();
        B4W.A0b = "api_event";
        B4W.A0B = C165597tg.A0d();
        b3f.BOl(B4W);
        C200049gU r11 = r5.A07;
        AF3 A012 = r11.A01("FB", "PIN");
        if (A012 != null) {
            C194449Pt r2 = new C194449Pt(A012);
            r5.A06.A00(new C203589oM(r72, r5, r2, r12, 0), r2, str2);
            return;
        }
        new AnonymousClass9SR(r72, r5.A00, r5.A02, r5.A03, r11, "PIN").A00(new C23193B9b(r72, r5, r12, str2, 0), "FB");
    }
}

package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;

/* renamed from: X.4WH  reason: invalid class name */
public class AnonymousClass4WH extends C129156Fn {
    public Object A00;
    public final int A01;

    public AnonymousClass4WH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A04() {
        if (this.A01 != 0) {
            super.A04();
            return;
        }
        C70803fk r1 = (C70803fk) this.A00;
        if (r1.A2a()) {
            AnonymousClass6YP r0 = r1.A5Z;
            C18740tg.A06(r0);
            r0.A0K();
        }
    }

    public void A06(C135066c4 r3, Integer num, String str, int i) {
        if (this.A01 != 0) {
            super.A06(r3, num, str, i);
            return;
        }
        C70803fk r1 = (C70803fk) this.A00;
        if (str.equals(r1.A45.getRawString())) {
            r1.A78.Bhl(C36421kH.A0N(str), r3, num, i);
        }
    }

    public void A0B(String str, String str2) {
        if (1 - this.A01 != 0) {
            super.A0B(str, str2);
            return;
        }
        AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = (AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) this.A00;
        if (str.equals(addStickerPackDialogFragment.A02) && str2.equals(addStickerPackDialogFragment.A03)) {
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = addStickerPackDialogFragment.A04;
            addStickerPackDialogFragment.A00.A0K(C36401kF.A0q(addStickerPackDialogFragment, addStickerPackDialogFragment.A0n(R.string.f12nameremoved), A0M, 1, R.string.f12nameremoved), 1);
            AnonymousClass01I A0h = addStickerPackDialogFragment.A0h();
            if (A0h != null) {
                Intent A0D = C36431kI.A0D();
                A0D.putExtra("add_successful", true);
                A0h.setResult(-1, A0D);
                addStickerPackDialogFragment.A1c();
            }
        }
    }
}

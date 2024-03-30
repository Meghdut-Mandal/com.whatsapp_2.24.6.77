package com.whatsapp.bonsai.waitlist;

import X.AnonymousClass00C;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1KA;
import X.AnonymousClass1KB;
import X.AnonymousClass30Z;
import X.C203399nx;
import X.C21010yW;
import X.C35911jS;
import X.C35921jT;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C45162Qh;
import X.C61683Da;
import X.C69613do;
import X.C71483gq;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public abstract class BonsaiWaitlistBottomSheet extends Hilt_BonsaiWaitlistBottomSheet {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C36391kE.A0N(view, R.id.image).setImageResource(this.A01);
        C36351kA.A0E(view).setText(this.A03);
        TextView A0P = C36391kE.A0P(view, R.id.description);
        int i = this.A00;
        if (i == 0) {
            A0P.setVisibility(8);
        } else {
            A0P.setText(i);
        }
        TextView A0P2 = C36391kE.A0P(view, R.id.positive_button);
        A0P2.setText(this.A02);
        C36361kB.A18(A0P2, this, 21);
        View findViewById = view.findViewById(R.id.negative_button);
        AnonymousClass00C.A0B(findViewById);
        findViewById.setVisibility(8);
    }

    public void A1m() {
        if (this instanceof BonsaiWaitlistJoinBottomSheet) {
            BonsaiWaitlistJoinBottomSheet bonsaiWaitlistJoinBottomSheet = (BonsaiWaitlistJoinBottomSheet) this;
            AnonymousClass17Y r2 = bonsaiWaitlistJoinBottomSheet.A00;
            if (r2 != null) {
                r2.A05(0, R.string.f12nameremoved);
                C71483gq r0 = bonsaiWaitlistJoinBottomSheet.A01;
                if (r0 != null) {
                    Integer num = bonsaiWaitlistJoinBottomSheet.A03;
                    C21010yW r22 = r0.A00;
                    C45162Qh r1 = new C45162Qh();
                    r1.A00 = 44;
                    r1.A01 = num;
                    r22.Bly(r1);
                    AnonymousClass1KA r23 = bonsaiWaitlistJoinBottomSheet.A02;
                    if (r23 != null) {
                        C69613do r12 = new C69613do(bonsaiWaitlistJoinBottomSheet);
                        AnonymousClass1KB r02 = r23.A01;
                        C61683Da r3 = new C61683Da(bonsaiWaitlistJoinBottomSheet, r12, r23);
                        AnonymousClass19A r4 = r02.A00;
                        String A09 = r4.A09();
                        C35911jS r24 = new C35911jS(A09, 4);
                        C203399nx r6 = r24.A00;
                        AnonymousClass00C.A08(r6);
                        r4.A0E(new C35921jT(r24, new AnonymousClass30Z(r3), 1), r6, A09, 425, 32000);
                        return;
                    }
                    throw C36331k8.A0d("bonsaiWaitlistSyncManager");
                }
                throw C36331k8.A0d("bonsaiWaitlistLogger");
            }
            throw C36321k7.A06();
        }
        A1c();
    }

    public BonsaiWaitlistBottomSheet(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}

package com.whatsapp.interopui.compose;

import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass040;
import X.AnonymousClass04R;
import X.C001600r;
import X.C001700s;
import X.C005502l;
import X.C023509x;
import X.C109325Xd;
import X.C230416y;
import X.C32831eG;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C66743Xd;
import java.util.List;

public final class InteropComposeEnterInfoViewModel extends AnonymousClass04R {
    public final C001600r A00;
    public final C001700s A01;
    public final C230416y A02;
    public final C32831eG A03;
    public final C005502l A04;

    public final void A0S(C66743Xd r8, String str) {
        AnonymousClass00C.A0D(str, 1);
        AnonymousClass011 A0j = C36421kH.A0j(str, r8.A00);
        List A11 = C36371kC.A11(A0j);
        AnonymousClass040 A002 = C109325Xd.A00(this);
        C36331k8.A1T(new InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1(this, str, A11, A0j, (C023509x) null), A002);
    }

    public InteropComposeEnterInfoViewModel(C230416y r2, C32831eG r3, C005502l r4) {
        C36321k7.A0z(r2, r4);
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        C001700s A0S = C36431kI.A0S();
        this.A01 = A0S;
        this.A00 = A0S;
    }
}

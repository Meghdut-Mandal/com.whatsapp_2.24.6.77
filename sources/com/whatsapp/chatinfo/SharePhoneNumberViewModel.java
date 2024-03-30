package com.whatsapp.chatinfo;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass1FX;
import X.AnonymousClass1X4;
import X.C001700s;
import X.C19730wQ;
import X.C20380xT;
import X.C36321k7;
import X.C36381kD;
import X.C36431kI;
import X.C62803Hp;
import android.net.Uri;

public final class SharePhoneNumberViewModel extends AnonymousClass04R {
    public final C001700s A00;
    public final AnonymousClass1X4 A01;
    public final AnonymousClass1FX A02;

    public SharePhoneNumberViewModel(C19730wQ r5, AnonymousClass1X4 r6, AnonymousClass1FX r7, C20380xT r8) {
        C36321k7.A18(r5, r8, r6, r7);
        this.A01 = r6;
        this.A02 = r7;
        C001700s A0S = C36431kI.A0S();
        this.A00 = A0S;
        String A0C = r5.A0C();
        Uri A022 = r8.A02("626403979060997");
        AnonymousClass00C.A08(A022);
        A0S.A0C(new C62803Hp(A0C, C36381kD.A0y(A022)));
    }
}

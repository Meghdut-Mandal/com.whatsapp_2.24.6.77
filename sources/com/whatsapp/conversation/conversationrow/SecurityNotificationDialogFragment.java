package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1H2;
import X.AnonymousClass3UG;
import X.C18820ts;
import X.C19730wQ;
import X.C19770wU;
import X.C20380xT;
import X.C24801Dv;
import X.C36401kF;

public abstract class SecurityNotificationDialogFragment extends Hilt_SecurityNotificationDialogFragment {
    public C24801Dv A00;
    public C19730wQ A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public AnonymousClass1H2 A04;
    public C20380xT A05;
    public C19770wU A06;

    public CharSequence A1k(AnonymousClass141 r4, int i) {
        String A0G;
        Object[] A0L = AnonymousClass001.A0L();
        C18820ts r1 = this.A01;
        String A0H = this.A03.A0H(r4);
        if (A0H == null) {
            A0G = null;
        } else {
            A0G = r1.A0G(A0H);
        }
        return AnonymousClass3UG.A05(A1D(), this.A04, C36401kF.A0q(this, A0G, A0L, 0, i));
    }
}

package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass04R;
import X.AnonymousClass16T;
import X.AnonymousClass16U;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass5GM;
import X.AnonymousClass8gJ;
import X.AnonymousClass8gL;
import X.C135086c7;
import X.C165607th;
import X.C175928bI;
import X.C193529Lv;
import X.C196129Xv;
import X.C19630wG;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C202269lR;
import X.C20810yC;
import X.C24611Dc;
import X.C24881Ed;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;

public class IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel extends AnonymousClass04R {
    public C19630wG A00;
    public C19730wQ A01;
    public C19970wo A02;
    public AnonymousClass16X A03;
    public C135086c7 A04;
    public C135086c7 A05;
    public C175928bI A06;
    public C24611Dc A07 = C165607th.A0a("IndiaUpiPaymentTransactionConfirmationViewModel");
    public C19770wU A08;
    public String A09;
    public final C24881Ed A0A;
    public final AnonymousClass16U A0B;
    public final C202269lR A0C;
    public final AnonymousClass8gJ A0D;
    public final AnonymousClass8gL A0E;
    public final C193529Lv A0F;

    public void A0R() {
        C193529Lv r0 = this.A0F;
        r0.A03.unregisterObserver(r0.A02);
    }

    public IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel(AnonymousClass17Y r16, C19730wQ r17, C19970wo r18, C19630wG r19, C24881Ed r20, AnonymousClass16T r21, C20810yC r22, AnonymousClass19A r23, C196129Xv r24, C202269lR r25, C29221Vu r26, C29121Vk r27, C193529Lv r28, AnonymousClass5GM r29, C29131Vl r30, C19770wU r31) {
        C19970wo r10 = r18;
        this.A02 = r10;
        C19630wG r1 = r19;
        this.A00 = r1;
        this.A01 = r17;
        this.A08 = r31;
        this.A0A = r20;
        C202269lR r6 = r25;
        this.A0C = r6;
        this.A0F = r28;
        C29121Vk r8 = r27;
        AnonymousClass19A r4 = r23;
        this.A0D = new AnonymousClass8gJ(r10, r22, r4, r6, r8);
        this.A0B = AnonymousClass16W.A05;
        AnonymousClass17Y r2 = r16;
        AnonymousClass16T r3 = r21;
        C196129Xv r5 = r24;
        this.A0E = new AnonymousClass8gL(r1.A00, r2, r3, r4, r5, r6, r26, r8, r29, r30);
    }
}

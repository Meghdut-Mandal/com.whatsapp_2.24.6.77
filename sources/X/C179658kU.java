package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.8kU  reason: invalid class name and case insensitive filesystem */
public class C179658kU extends C202239lN {
    public final AnonymousClass1EU A00;
    public final C19770wU A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C179658kU(X.AnonymousClass17Y r20, X.C19730wQ r21, X.AnonymousClass155 r22, X.C19970wo r23, X.AnonymousClass1EW r24, X.AnonymousClass1EZ r25, X.AnonymousClass1YM r26, X.C29221Vu r27, X.C24601Db r28, X.C29121Vk r29, X.C202939my r30, X.AnonymousClass1EU r31, X.AnonymousClass9SJ r32, X.C200049gU r33, X.C23075B3f r34, X.AnonymousClass6VG r35, X.C196039Xk r36, X.C23038B1j r37, X.C19770wU r38) {
        /*
            r19 = this;
            r12 = r30
            r11 = r29
            r10 = r28
            r9 = r27
            r8 = r26
            r7 = r25
            r18 = r37
            r6 = r24
            r17 = r36
            r5 = r23
            r16 = r35
            r4 = r22
            r15 = r34
            r3 = r21
            r14 = r33
            r2 = r20
            r13 = r32
            r1 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r38
            r1.A01 = r0
            r0 = r31
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179658kU.<init>(X.17Y, X.0wQ, X.155, X.0wo, X.1EW, X.1EZ, X.1YM, X.1Vu, X.1Db, X.1Vk, X.9my, X.1EU, X.9SJ, X.9gU, X.B3f, X.6VG, X.9Xk, X.B1j, X.0wU):void");
    }

    public void A05(C21667AUj aUj) {
        C206269sz r2;
        List list = this.A03;
        String str = aUj.A06;
        list.add(str);
        C206359tF r0 = aUj.A03;
        this.A02 = r0;
        if (r0 != null && (r2 = r0.A00) != null && r2.A00.equals("WEBVIEW")) {
            if (((C178748hC) r2).A00) {
                this.A01.Box(new C183518qv(this.A05, this.A00, new C21300AGe(this, str)), new AnonymousClass012[0]);
            } else {
                A06((PinBottomSheetDialogFragment) null, (C203399nx) null);
            }
        }
    }
}

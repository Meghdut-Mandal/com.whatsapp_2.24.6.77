package X;

import com.whatsapp.newsletter.viewmodel.InvertNewsletterFollowStateUseCase$invoke$1;

/* renamed from: X.3E9  reason: invalid class name */
public final class AnonymousClass3E9 {
    public final AnonymousClass1ZX A00;
    public final C30131Zi A01;
    public final AnonymousClass040 A02;
    public final C32241dD A03;

    public AnonymousClass3E9(AnonymousClass1ZX r1, C30131Zi r2, C32241dD r3, AnonymousClass040 r4) {
        C36321k7.A18(r2, r3, r1, r4);
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r1;
        this.A02 = r4;
    }

    public final void A00(C44072La r10, C52512pY r11, Long l, C006302t r13) {
        boolean A0N = r10.A0N();
        C32241dD r1 = this.A03;
        C28981Uw A0J = r10.A0J();
        C52512pY r3 = r11;
        Long l2 = l;
        C52512pY r4 = r11;
        if (A0N) {
            r1.A0C(A0J, r3, r4, l2, (String) null, (String) null, -1);
        } else {
            r1.A0D(A0J, r3, r4, l2, (String) null, (String) null, -1);
        }
        C36331k8.A1T(new InvertNewsletterFollowStateUseCase$invoke$1(r10, this, (C023509x) null, r13), this.A02);
    }
}

package X;

import java.util.ArrayList;

/* renamed from: X.9SJ  reason: invalid class name */
public class AnonymousClass9SJ {
    public final C19600wD A00;
    public final C24601Db A01;
    public final C29121Vk A02;
    public final C117705mh A03;
    public final C111495cN A04;
    public final C19770wU A05;

    public void A00(B1H b1h, C194449Pt r13, String str) {
        B1H b1h2 = b1h;
        if ("token".equals(r13.A00.A03)) {
            ArrayList A0I = AnonymousClass001.A0I();
            C36341k9.A1H("fbpay_pin", str, A0I);
            C19770wU r0 = this.A05;
            C117705mh r7 = this.A03;
            C24601Db r3 = this.A01;
            C111495cN r8 = this.A04;
            C36391kE.A1Q(new AnonymousClass8g1(this.A00, r3, this.A02, (C194919Rt) null, b1h2, r7, r8, A0I, 0), r0);
            return;
        }
        b1h.BiD(str);
    }

    public AnonymousClass9SJ(C19600wD r1, C24601Db r2, C29121Vk r3, C117705mh r4, C111495cN r5, C19770wU r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
    }
}

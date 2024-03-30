package X;

import com.whatsapp.WaImageView;
import java.util.List;

/* renamed from: X.51n  reason: invalid class name and case insensitive filesystem */
public final class C1026851n extends C1027951y {
    public final C132656Ur A00;
    public final WaImageView A01;
    public final C20810yC A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1026851n(android.view.View r10, X.C132656Ur r11, X.AnonymousClass652 r12, X.AnonymousClass16I r13, X.AnonymousClass1RY r14, X.C20430xY r15, X.C18820ts r16, X.C20810yC r17) {
        /*
            r9 = this;
            r0 = 1
            r2 = r10
            X.AnonymousClass00C.A0D(r10, r0)
            r1 = r9
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A02 = r8
            r9.A00 = r11
            r0 = 2131428252(0x7f0b039c, float:1.8478143E38)
            com.whatsapp.WaImageView r0 = X.C90474aD.A0P(r10, r0)
            r9.A01 = r0
            r0 = 7619(0x1dc3, float:1.0676E-41)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x004a
            android.view.View r4 = r9.A0H
            android.content.res.Resources r2 = X.C36341k9.A0F(r4)
            r0 = 2131168023(0x7f070b17, float:1.7950336E38)
            int r1 = r2.getDimensionPixelSize(r0)
            r0 = 2131168377(0x7f070c79, float:1.7951054E38)
            int r3 = X.C36441kJ.A06(r2, r0, r1)
            r0 = 2131431140(0x7f0b0ee4, float:1.8484E38)
            android.view.View r2 = X.C36361kB.A0G(r4, r0)
            r1 = 0
            X.3QI r0 = new X.3QI
            r0.<init>(r1, r1, r3, r1)
            X.C65723Tf.A02(r2, r0)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1026851n.<init>(android.view.View, X.6Ur, X.652, X.16I, X.1RY, X.0xY, X.0ts, X.0yC):void");
    }

    public void A0D() {
        super.A0D();
        if (this.A02.A0E(7619)) {
            C132656Ur r2 = this.A00;
            C132656Ur.A02(r2);
            C144506sM r0 = r2.A01;
            if (r0 != null) {
                r0.A02.A0D(true);
            }
            C144506sM r1 = r2.A01;
            if (r1 != null) {
                r1.A00 = null;
            }
        }
    }

    public void A0G(C106435Jr r4, List list) {
        C36321k7.A0w(r4, list);
        super.A0G(r4, list);
        WaImageView waImageView = this.A01;
        waImageView.setVisibility(C36351kA.A00(this.A02.A0E(7619) ? 1 : 0));
        C36411kG.A1C(waImageView, r4, this, 33);
    }
}

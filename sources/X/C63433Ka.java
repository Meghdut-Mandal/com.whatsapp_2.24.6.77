package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.3Ka  reason: invalid class name and case insensitive filesystem */
public final class C63433Ka {
    public C87844Qj A00;
    public final View A01;
    public final C225314u A02;
    public final AnonymousClass17Y A03;
    public final C21100yf A04;
    public final AnonymousClass16D A05;
    public final C18820ts A06;
    public final AnonymousClass17X A07;
    public final C20810yC A08;
    public final AnonymousClass147 A09;
    public final AnonymousClass1C4 A0A;
    public final C19600wD A0B;
    public final AnonymousClass171 A0C;
    public final C24381Cf A0D;
    public final C20350xQ A0E;
    public final C20510xg A0F;

    public C63433Ka(View view, C225314u r3, AnonymousClass17Y r4, C21100yf r5, C19600wD r6, AnonymousClass16D r7, AnonymousClass171 r8, C18820ts r9, C24381Cf r10, AnonymousClass17X r11, C20810yC r12, C20350xQ r13, C20510xg r14, AnonymousClass147 r15, AnonymousClass1C4 r16) {
        AnonymousClass00C.A0D(r12, 1);
        C36321k7.A17(r15, r3, r4, 3);
        AnonymousClass1C4 r0 = r16;
        C36321k7.A1C(r0, r5, r9, r8, r7);
        C36321k7.A15(r13, r14, r6);
        C36361kB.A1L(r10, r11);
        this.A08 = r12;
        this.A01 = view;
        this.A09 = r15;
        this.A02 = r3;
        this.A03 = r4;
        this.A0A = r0;
        this.A04 = r5;
        this.A06 = r9;
        this.A0C = r8;
        this.A05 = r7;
        this.A0E = r13;
        this.A0F = r14;
        this.A0B = r6;
        this.A0D = r10;
        this.A07 = r11;
    }

    public final void A00(String str) {
        AnonymousClass16D r0 = this.A05;
        AnonymousClass147 r7 = this.A09;
        AnonymousClass141 A0D2 = r0.A0D(r7);
        if (A01(false)) {
            String str2 = str;
            if (!AnonymousClass00C.A0J(this.A0C.A0H(A0D2), str)) {
                int A002 = C63883Lu.A00(str);
                int A042 = this.A04.A04(C21100yf.A1v);
                if (A002 <= A042) {
                    View view = this.A01;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    this.A0F.A0B(new AnonymousClass2VU(this.A0D, this, this.A0E, r7, str2));
                    return;
                }
                this.A03.A0E(C36331k8.A0g(this.A06, A042, 0, R.plurals.f10nameremoved), 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r1.A13 == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(boolean r6) {
        /*
            r5 = this;
            X.16D r0 = r5.A05
            X.147 r2 = r5.A09
            X.141 r1 = r0.A0D(r2)
            X.17X r0 = r5.A07
            boolean r4 = r0.A0C(r2)
            boolean r0 = r0.A0D(r2)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x001b
            boolean r1 = r1.A13
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r4 != 0) goto L_0x002c
            X.14u r1 = r5.A02
            r0 = 2131889564(0x7f120d9c, float:1.9413795E38)
            if (r6 == 0) goto L_0x0028
            r0 = 2131889560(0x7f120d98, float:1.9413787E38)
        L_0x0028:
            r1.BO5(r0)
            return r3
        L_0x002c:
            if (r0 == 0) goto L_0x0039
            X.14u r1 = r5.A02
            r0 = 2131889563(0x7f120d9b, float:1.9413793E38)
            if (r6 == 0) goto L_0x0028
            r0 = 2131889561(0x7f120d99, float:1.941379E38)
            goto L_0x0028
        L_0x0039:
            X.0wD r0 = r5.A0B
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x005d
            X.17Y r2 = r5.A03
            if (r6 == 0) goto L_0x004c
            r1 = 2131888986(0x7f120b5a, float:1.9412623E38)
        L_0x0048:
            r2.A06(r1, r3)
            return r3
        L_0x004c:
            X.0yC r1 = r5.A08
            r0 = 3088(0xc10, float:4.327E-42)
            boolean r0 = r1.A0E(r0)
            r1 = 2131891618(0x7f1215a2, float:1.9417961E38)
            if (r0 == 0) goto L_0x0048
            r1 = 2131891617(0x7f1215a1, float:1.941796E38)
            goto L_0x0048
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63433Ka.A01(boolean):boolean");
    }
}

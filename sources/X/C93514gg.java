package X;

import androidx.compose.material.ripple.RippleAnimation;
import java.util.Iterator;

/* renamed from: X.4gg  reason: invalid class name and case insensitive filesystem */
public final class C93514gg extends C136496eU implements C159847k1 {
    public final C157597dn A00;
    public final C1506676d A01 = new C1506676d();
    public final C157597dn A02;

    public void B67(C161667nH r35) {
        float A022;
        float Bvq;
        C161667nH r8 = r35;
        AnonymousClass00C.A0D(r8, 0);
        long j = ((C133336Xx) this.A02.getValue()).A00;
        r8.B63();
        A01(r8, j);
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) C36351kA.A0u(it);
            float f = ((C128296Br) this.A00.getValue()).A03;
            if (f != 0.0f) {
                long A05 = AnonymousClass6QU.A00(C114185go.A0K[(int) (j & 63)], C133336Xx.A04(j), C133336Xx.A03(j), C133336Xx.A02(j), f);
                if (rippleAnimation.A02 == null) {
                    long BHc = r8.BHc();
                    rippleAnimation.A02 = Float.valueOf(Math.max(AnonymousClass6X0.A01(BHc), AnonymousClass6X0.A00(BHc)) * 0.3f);
                }
                if (rippleAnimation.A03 == null) {
                    if (Float.isNaN(Float.NaN)) {
                        Bvq = C129486He.A00(r8, r8.BHc());
                    } else {
                        Bvq = r8.Bvq(Float.NaN);
                    }
                    rippleAnimation.A03 = Float.valueOf(Bvq);
                }
                if (rippleAnimation.A01 == null) {
                    long BHc2 = r8.BHc();
                    rippleAnimation.A01 = new C133206Xf(AnonymousClass5WS.A01(AnonymousClass6X0.A01(BHc2), BHc2));
                }
                if (!C90474aD.A1U(rippleAnimation.A07) || C90474aD.A1U(rippleAnimation.A08)) {
                    A022 = C90484aE.A02(rippleAnimation.A04.A02.A05);
                } else {
                    A022 = 1.0f;
                }
                Float f2 = rippleAnimation.A02;
                AnonymousClass00C.A0B(f2);
                float floatValue = f2.floatValue();
                Float f3 = rippleAnimation.A03;
                AnonymousClass00C.A0B(f3);
                float floatValue2 = f3.floatValue();
                float A023 = C90484aE.A02(rippleAnimation.A06.A02.A05);
                float f4 = (float) 1;
                float A002 = C90514aH.A00(f4 - A023, floatValue, A023, floatValue2);
                C133206Xf r4 = rippleAnimation.A00;
                AnonymousClass00C.A0B(r4);
                long j2 = r4.A00;
                float A003 = C133206Xf.A00(j2);
                C133206Xf r42 = rippleAnimation.A01;
                AnonymousClass00C.A0B(r42);
                float A004 = C133206Xf.A00(r42.A00);
                C161547n5 r14 = rippleAnimation.A05.A02.A05;
                float A024 = C90484aE.A02(r14);
                float A005 = C90514aH.A00(f4 - A024, A003, A024, A004);
                float A012 = C133206Xf.A01(j2);
                C133206Xf r43 = rippleAnimation.A01;
                AnonymousClass00C.A0B(r43);
                float A013 = C133206Xf.A01(r43.A00);
                float A025 = C90484aE.A02(r14);
                long A0B = C90464aC.A0B(A005, C90514aH.A00(f4 - A025, A012, A025, A013));
                long A052 = AnonymousClass6QU.A00(C114185go.A0K[(int) (A05 & 63)], C133336Xx.A04(A05), C133336Xx.A03(A05), C133336Xx.A02(A05), C133336Xx.A01(A05) * A022);
                long BHc3 = r8.BHc();
                float A014 = AnonymousClass6X0.A01(BHc3);
                float A006 = AnonymousClass6X0.A00(BHc3);
                C137486gD r1 = (C137486gD) r8.BBD();
                C128306Bs r0 = r1.A01.A02;
                long j3 = r0.A00;
                r0.A01.BpF();
                C128306Bs.A00(((C137516gG) r1.A00).A00).B2x(0.0f, 0.0f, A014, A006, 1);
                r8.B62((C114365h6) null, C94604iU.A00, A002, 1.0f, 3, A052, A0B);
                r0.A01.Boi();
                r0.A00 = j3;
            }
        }
    }

    public void BeY() {
    }

    public void BQW() {
        this.A01.clear();
    }

    public void BYM() {
        this.A01.clear();
    }

    public C93514gg(C157597dn r2, C157597dn r3) {
        super(r3);
        this.A02 = r2;
        this.A00 = r3;
    }
}

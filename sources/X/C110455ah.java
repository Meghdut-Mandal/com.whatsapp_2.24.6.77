package X;

import androidx.compose.foundation.BackgroundElement;
import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.Alignment;
import com.whatsapp.R;

/* renamed from: X.5ah  reason: invalid class name and case insensitive filesystem */
public abstract class C110455ah {
    public static final void A00(C161337ma r48, C161267mT r49, AnonymousClass00S r50, int i, int i2) {
        int i3;
        C161267mT r24 = r49;
        AnonymousClass00C.A0D(r50, 0);
        C161337ma r0 = r48;
        r0.Bun(-284508356);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C90484aE.A04(r0.B2h(r50) ? 1 : 0) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C90464aC.A09(r0, r24);
        }
        if ((i3 & 91) != 18 || !r0.BHg()) {
            if (i6 != 0) {
                r24 = C161267mT.A00;
            }
            AnonymousClass7bO r3 = AnonymousClass6J7.A02;
            boolean z = true;
            C161267mT Bva = r24.Bva(C131986Rq.A01);
            float f = C113195f9.A00;
            C006302t r21 = C112455dv.A00;
            C006302t r11 = r21;
            C161267mT Bva2 = Bva.Bva(new SizeElement(r11, Float.NaN, f, Float.NaN, f));
            r0.Bum(1899818495);
            if ((i3 & 14) != 4) {
                z = false;
            }
            Object BnZ = r0.BnZ();
            if (z || BnZ == C129736Ig.A00) {
                BnZ = new AnonymousClass7L1(r50);
                ((C136916fF) r0).A0R(BnZ);
            }
            C136916fF r1 = (C136916fF) r0;
            C136916fF.A0M(r1, false);
            float f2 = (float) 14;
            float f3 = f2;
            float f4 = (float) 0;
            C161267mT A00 = C129226Fx.A00(Bva2.Bva(new C95014je(r11, new C156607aF((AnonymousClass00S) BnZ))), f2, f4);
            r0.Bum(693286680);
            C157697dx A002 = AnonymousClass6HZ.A00(AnonymousClass6J0.A00, r0, r3);
            r0.Bum(-1323940314);
            int i7 = r1.A02;
            C161557n6 A04 = C136916fF.A04(r1);
            AnonymousClass00S r12 = AnonymousClass6JB.A00;
            C1509977p A003 = C109165Wn.A00(A00);
            C136916fF.A0F(r0, r1, r12);
            C009003v r112 = AnonymousClass6JB.A04;
            AnonymousClass5WF.A01(r0, A002, r112);
            C009003v r10 = AnonymousClass6JB.A06;
            AnonymousClass5WF.A01(r0, A04, r10);
            C009003v r8 = AnonymousClass6JB.A01;
            if (r1.A0L || !C90464aC.A1W(r0, i7)) {
                C90464aC.A0v(r0, r8, i7);
            }
            A003.BKt(new AnonymousClass68J(r0), r0, 0);
            r0.Bum(2058660585);
            Alignment alignment = AnonymousClass6J7.A04;
            C137296fu r19 = C161267mT.A00;
            C93564gm r18 = C129516Hh.A00;
            C006302t r2 = r21;
            BackgroundElement backgroundElement = new BackgroundElement(C129456Hb.A00, r2, C90474aD.A0D(((AnonymousClass65R) AnonymousClass6G0.A01(r1, r18)).A0J));
            float f5 = C113185f8.A00;
            C161267mT A004 = C131986Rq.A00(backgroundElement, f5);
            r0.Bum(733328855);
            C157697dx A005 = C129716Ie.A00(r0, alignment, false);
            r0.Bum(-1323940314);
            int i8 = r1.A02;
            C161557n6 A042 = C136916fF.A04(r1);
            C1509977p A006 = C109165Wn.A00(A004);
            C136916fF.A0F(r0, r1, r12);
            AnonymousClass5WF.A01(r0, A005, r112);
            AnonymousClass5WF.A01(r0, A042, r10);
            if (r1.A0L || !C90464aC.A1W(r0, i8)) {
                C90464aC.A0v(r0, r8, i8);
            }
            A006.BKt(new AnonymousClass68J(r0), r0, 0);
            r0.Bum(2058660585);
            C128906Eb A02 = AnonymousClass5XN.A02(r0, R.drawable.ic_action_share);
            C161187mL r31 = C129766Ij.A00;
            float f6 = (float) 8;
            C153987Ql r9 = new C153987Ql(f6);
            C161337ma r26 = r0;
            C109005Vv.A00(r26, (Alignment) null, C131986Rq.A00(new PaddingElement(r9, f6, f6, f6, f6), f5), new C94494iJ(C90474aD.A0D(((AnonymousClass65R) AnonymousClass6G0.A01(r1, r18)).A09), 5), A02, r31, (String) null, 0.0f, 25016, 40);
            C136916fF.A0L(r1, true);
            String A007 = AnonymousClass5XO.A00(r0, R.string.f12nameremoved);
            long A008 = AnonymousClass5XM.A00(r0, R.color.f6nameremoved);
            long A022 = AnonymousClass6U3.A02(17);
            C161337ma r25 = r0;
            AnonymousClass6UK.A01(r25, C129226Fx.A01(r19, f3, f4, f4, f4), (AnonymousClass6V8) null, (C129796Im) null, (AnonymousClass68R) null, AnonymousClass72W.A02, (C131266Oj) null, (C131366Ot) null, A007, (C006302t) null, 2, 1, 0, 199728, 3120, 120784, A008, A022, 0, 0, false);
            C136916fF.A0L(r1, true);
        } else {
            r0.BuE();
        }
        C136976fO B6Z = r0.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C156037Yk(r24, r50, i5, i4);
        }
    }
}

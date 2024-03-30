package X;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.Alignment;
import com.whatsapp.R;
import java.util.Arrays;

/* renamed from: X.5ac  reason: invalid class name and case insensitive filesystem */
public abstract class C110405ac {
    public static final void A00(C161337ma r41, C161267mT r42, String str, AnonymousClass00S r44, int i, int i2) {
        C161267mT r20 = r42;
        String str2 = str;
        AnonymousClass00C.A0D(str2, 0);
        AnonymousClass00S r15 = r44;
        AnonymousClass00C.A0D(r15, 1);
        C161337ma r0 = r41;
        r0.Bun(-951904419);
        int i3 = i;
        int i4 = i | 6;
        if ((i2 & 1) == 0) {
            i4 = i3;
            if ((i & 14) == 0) {
                i4 = C90484aE.A04(r0.B2f(str2) ? 1 : 0) | i;
            }
        }
        if ((i2 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= C90494aF.A07(r0.B2h(r15) ? 1 : 0);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i3 & 896) == 0) {
            i4 |= C90474aD.A04(r0, r20);
        }
        if ((i4 & 731) != 146 || !r0.BHg()) {
            if (i5 != 0) {
                r20 = C161267mT.A00;
            }
            FillElement fillElement = C131986Rq.A01;
            C161267mT Bva = r20.Bva(fillElement);
            r0.Bum(-483455358);
            C157697dx A00 = AnonymousClass6HY.A00(AnonymousClass6J0.A03, r0, AnonymousClass6J7.A01);
            r0.Bum(-1323940314);
            C136916fF r2 = (C136916fF) r0;
            int i6 = r2.A02;
            C161557n6 A04 = C136916fF.A04(r2);
            AnonymousClass00S r9 = AnonymousClass6JB.A00;
            C1509977p A002 = C109165Wn.A00(Bva);
            C136916fF.A0F(r0, r2, r9);
            C009003v r8 = AnonymousClass6JB.A04;
            AnonymousClass5WF.A01(r0, A00, r8);
            C009003v r7 = AnonymousClass6JB.A06;
            AnonymousClass5WF.A01(r0, A04, r7);
            C009003v r6 = AnonymousClass6JB.A01;
            if (r2.A0L || !C90464aC.A1W(r0, i6)) {
                C90464aC.A0v(r0, r6, i6);
            }
            A002.BKt(new AnonymousClass68J(r0), r0, 0);
            r0.Bum(2058660585);
            Alignment alignment = AnonymousClass6J7.A04;
            C137296fu r12 = C161267mT.A00;
            float f = C113195f9.A00;
            C161267mT A003 = C129226Fx.A00(r12.Bva(new SizeElement(C112455dv.A00, Float.NaN, f, Float.NaN, f)), (float) 14, (float) 0);
            r0.Bum(733328855);
            C157697dx A004 = C129716Ie.A00(r0, alignment, false);
            r0.Bum(-1323940314);
            int i7 = r2.A02;
            C161557n6 A042 = C136916fF.A04(r2);
            C1509977p A005 = C109165Wn.A00(A003);
            C136916fF.A0F(r0, r2, r9);
            AnonymousClass5WF.A01(r0, A004, r8);
            AnonymousClass5WF.A01(r0, A042, r7);
            if (r2.A0L || !C90464aC.A1W(r0, i7)) {
                C90464aC.A0v(r0, r6, i7);
            }
            A005.BKt(new AnonymousClass68J(r0), r0, 0);
            r0.Bum(2058660585);
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = str;
            AnonymousClass6G0.A02(C131966Ro.A00, C136916fF.A04(r2));
            String string = ((Context) AnonymousClass6G0.A01(r2, C131966Ro.A01)).getResources().getString(R.string.f12nameremoved, Arrays.copyOf(A0L, 1));
            long A02 = AnonymousClass6U3.A02(17);
            C161337ma r21 = r0;
            FillElement fillElement2 = fillElement;
            AnonymousClass6UK.A01(r21, fillElement2, (AnonymousClass6V8) null, (C129796Im) null, (AnonymousClass68R) null, AnonymousClass72W.A02, new C131266Oj(3), (C131366Ot) null, string, (C006302t) null, 2, 1, 0, 199728, 3120, 120272, AnonymousClass5XM.A00(r0, R.color.f6nameremoved), A02, 0, 0, false);
            C136916fF.A0L(r2, true);
            C110455ah.A00(r0, (C161267mT) null, r15, (i4 >> 3) & 14, 2);
            C136916fF.A0L(r2, true);
        } else {
            r0.BuE();
        }
        C136976fO B6Z = r0.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C156107Yr(r20, str2, r15, i3, i2);
        }
    }
}

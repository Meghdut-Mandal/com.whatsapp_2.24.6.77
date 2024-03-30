package X;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;

/* renamed from: X.5ae  reason: invalid class name and case insensitive filesystem */
public abstract class C110425ae {
    public static final void A00(C161337ma r58, C161267mT r59, AnonymousClass00S r60, AnonymousClass00S r61, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        C161267mT r15 = r59;
        AnonymousClass00S r14 = r60;
        AnonymousClass00C.A0D(r14, 1);
        AnonymousClass00S r12 = r61;
        AnonymousClass00C.A0D(r12, 2);
        C161337ma r4 = r58;
        r4.Bun(-1596585280);
        int i5 = i;
        boolean z3 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C90484aE.A04(r4.B2g(z3) ? 1 : 0) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C90494aF.A07(r4.B2h(r14) ? 1 : 0);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            int i6 = 128;
            if (r4.B2h(r12)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            boolean B2f = r4.B2f(r15);
            int i8 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (B2f) {
                i8 = EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            }
            i3 |= i8;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            boolean B2g = r4.B2g(z4);
            int i9 = DefaultCrypto.BUFFER_SIZE;
            if (B2g) {
                i9 = 16384;
            }
            i3 |= i9;
        }
        if ((46811 & i3) != 9362 || !r4.BHg()) {
            if (i7 != 0) {
                r15 = C161267mT.A00;
            }
            float f = (float) 0;
            C161267mT A01 = C129226Fx.A01(r15.Bva(C131986Rq.A00), f, (float) 8, f, (float) 20);
            r4.Bum(-483455358);
            C157697dx A00 = AnonymousClass6HY.A00(AnonymousClass6J0.A03, r4, AnonymousClass6J7.A01);
            r4.Bum(-1323940314);
            C136916fF r5 = (C136916fF) r4;
            int i10 = r5.A02;
            C161557n6 A04 = C136916fF.A04(r5);
            AnonymousClass00S r1 = AnonymousClass6JB.A00;
            C1509977p A002 = C109165Wn.A00(A01);
            C136916fF.A0F(r4, r5, r1);
            AnonymousClass5WF.A00(r4, A00, A04);
            C009003v r2 = AnonymousClass6JB.A01;
            if (r5.A0L || !C90464aC.A1W(r4, i10)) {
                C90464aC.A0v(r4, r2, i10);
            }
            C1509977p.A01(r4, A002, new AnonymousClass68J(r4), 0);
            r4.Bum(-1394868943);
            if (!z2) {
                C110455ah.A00(r4, (C161267mT) null, r14, (i3 >> 3) & 14, 2);
            }
            C136916fF.A0M(r5, false);
            C110445ag.A00(r4, (C161267mT) null, 0, 3, false);
            if (z) {
                r4.Bum(-1394868796);
                i4 = R.string.f12nameremoved;
            } else {
                r4.Bum(-1394868698);
                i4 = R.string.f12nameremoved;
            }
            String A003 = AnonymousClass5XO.A00(r4, i4);
            C136916fF.A0M(r5, false);
            C157627dq r9 = AnonymousClass6J7.A00;
            float f2 = (float) 14;
            C161267mT A012 = C129226Fx.A01(new HorizontalAlignElement(r9), f2, (float) 40, f2, (float) 32);
            long A004 = AnonymousClass5XM.A00(r4, R.color.f6nameremoved);
            long A02 = AnonymousClass6U3.A02(14);
            C131266Oj r0 = new C131266Oj(3);
            AnonymousClass6V8 r7 = (AnonymousClass6V8) AnonymousClass6G0.A01(r5, AnonymousClass6UK.A00);
            long A022 = AnonymousClass6U3.A02(18);
            AnonymousClass6V8 r02 = AnonymousClass6V8.A03;
            AnonymousClass6FJ r22 = r7.A02;
            C161277mU r13 = r22.A0C;
            long B9t = r13.B9t();
            long j = r22.A01;
            AnonymousClass72W r48 = r22.A08;
            AnonymousClass68R r46 = r22.A06;
            AnonymousClass68S r47 = r22.A07;
            C129796Im r45 = r22.A05;
            String str = r22.A0E;
            long j2 = r22.A02;
            AnonymousClass68U r37 = r22.A0A;
            AnonymousClass6TV r36 = r22.A0D;
            AnonymousClass75Q r35 = r22.A09;
            long j3 = r22.A00;
            C131366Ot r32 = r22.A0B;
            AnonymousClass6PD r31 = r22.A03;
            C109085Wf r29 = r22.A04;
            C129026Eq r16 = r7.A00;
            int i11 = r16.A02;
            int i12 = r16.A03;
            AnonymousClass6P5 r26 = r16.A06;
            AnonymousClass69J r23 = r7.A01;
            int i13 = r16.A01;
            int i14 = r16.A00;
            AnonymousClass6P7 r222 = r16.A07;
            long B9t2 = r13.B9t();
            long j4 = C133336Xx.A01;
            if (B9t != B9t2) {
                r13 = AnonymousClass6RG.A00(B9t);
            }
            C131236Og r72 = null;
            AnonymousClass6FJ r42 = new AnonymousClass6FJ(r31, r29, r45, r46, r47, r48, r35, r37, r32, r13, r36, str, j, j2, j3);
            if (r23 != null) {
                r72 = r23.A00;
            }
            AnonymousClass6UK.A01(r4, A012, new AnonymousClass6V8(new C129026Eq(r72, r26, r222, i11, i12, i13, i14, A022), r23, r42), (C129796Im) null, (AnonymousClass68R) null, (AnonymousClass72W) null, r0, (C131366Ot) null, A003, (C006302t) null, 0, 0, 0, 3072, 0, 65008, A004, A02, 0, 0, false);
            r4.Bum(-1960196030);
            if (!z) {
                r4.Bum(-1394868069);
                boolean A1S = AnonymousClass000.A1S(i3 & 896, 256);
                Object BnZ = r4.BnZ();
                if (A1S || BnZ == C129736Ig.A00) {
                    BnZ = new AnonymousClass7L0(r12);
                    r5.A0R(BnZ);
                }
                C136916fF.A0M(r5, false);
                AnonymousClass5WA.A00((C161437mu) null, (C156907b9) null, (AnonymousClass674) null, (AnonymousClass6O8) null, r4, new HorizontalAlignElement(r9), (C157657dt) null, (AnonymousClass00S) BnZ, C113165f6.A00, 805306368, 508, false);
            }
            C136916fF.A0M(r5, false);
            C136916fF.A0M(r5, false);
            C136916fF.A0M(r5, true);
            C136916fF.A0M(r5, false);
            C136916fF.A0M(r5, false);
        } else {
            r4.BuE();
        }
        C136976fO B6Z = r4.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C156187Yz(r15, r14, r12, i5, i2, z, z2);
        }
    }
}

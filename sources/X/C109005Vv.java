package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.draw.PainterElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* renamed from: X.5Vv  reason: invalid class name and case insensitive filesystem */
public abstract class C109005Vv {
    public static final void A00(C161337ma r24, Alignment alignment, C161267mT r26, C114365h6 r27, C128906Eb r28, C161187mL r29, String str, float f, int i, int i2) {
        float f2 = f;
        C161187mL r14 = r29;
        Alignment alignment2 = alignment;
        C161267mT r11 = r26;
        C161337ma r2 = r24;
        r2.Bun(1142754848);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            r11 = C161267mT.A00;
        }
        if ((i2 & 8) != 0) {
            alignment2 = AnonymousClass6J7.A04;
        }
        if ((i2 & 16) != 0) {
            r14 = C129766Ij.A00;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        }
        C114365h6 r12 = null;
        if ((i2 & 64) == 0) {
            r12 = r27;
        }
        C161267mT r1 = C161267mT.A00;
        String str2 = str;
        if (str != null) {
            r2.Bum(-1521136142);
            boolean B2f = r2.B2f(str2);
            Object BnZ = r2.BnZ();
            if (B2f || BnZ == C129736Ig.A00) {
                BnZ = new C153937Qg(str2);
                ((C136916fF) r2).A0R(BnZ);
            }
            C136916fF.A0M((C136916fF) r2, false);
            r1 = new AppendedSemanticsElement((C006302t) BnZ, false);
        }
        C161267mT Bva = r11.Bva(r1);
        long j = C112365dm.A00;
        C157657dt r20 = C112355dl.A00;
        long j2 = C112345dk.A00;
        C128906Eb r13 = r28;
        C161267mT Bva2 = Bva.Bva(new GraphicsLayerElement(r20, j, j2, j2, true)).Bva(new PainterElement(alignment2, r12, r13, r14, f2));
        C137666gW r8 = C137666gW.A00;
        r2.Bum(544976794);
        C136916fF r7 = (C136916fF) r2;
        int i4 = r7.A02;
        C161267mT A00 = AnonymousClass5WK.A00(r2, Bva2);
        C161557n6 A04 = C136916fF.A04(r7);
        AnonymousClass00S r3 = AnonymousClass6JB.A00;
        r2.Bum(1405779621);
        r2.Bup();
        if (r7.A0L) {
            r2.B4n(new C151817Ic(r3));
        } else {
            r2.BxD();
        }
        AnonymousClass5WF.A00(r2, r8, A04);
        AnonymousClass5WF.A01(r2, A00, AnonymousClass6JB.A05);
        C009003v r32 = AnonymousClass6JB.A01;
        if (r7.A0L || !C90464aC.A1W(r2, i4)) {
            C90464aC.A0v(r2, r32, i4);
        }
        C136916fF.A0M(r7, true);
        C136916fF.A0M(r7, false);
        C136916fF.A0M(r7, false);
        C136976fO B6Z = r2.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new AnonymousClass7Z3(alignment2, r11, r12, r13, r14, str2, f2, i, i3);
        }
    }
}

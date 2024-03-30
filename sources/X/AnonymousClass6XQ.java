package X;

import androidx.compose.foundation.BackgroundElement;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.FocusableElement;
import androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.foundation.HoverableNode;
import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.CompositionLocalMapInjectionElement;
import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.draw.PainterElement;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.layout.LayoutElement;
import androidx.compose.ui.node.ForceUpdateElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.whatsapp.contact.picker.invite.compose.perf.render.OnFirstContentDrawModifierElement;

/* renamed from: X.6XQ  reason: invalid class name */
public final class AnonymousClass6XQ {
    public C1506776e A00;
    public C1506776e A01;
    public C137856gq A02;
    public C123585wk A03;
    public C94894iy A04;
    public final C137856gq A05;
    public final C94944jW A06;
    public final C137846gp A07;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if ((r3 instanceof X.C94114hf) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((2 & r3.A01) == 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r3 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if ((r3 instanceof X.C94114hf) != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = ((X.C94114hf) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r3 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ((r3 instanceof X.C161777nS) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C161777nS A03(X.C137856gq r3) {
        /*
            r1 = 2
            int r0 = r3.A01
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            r2 = 0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r3 instanceof X.C161777nS
            if (r0 != 0) goto L_0x002b
            boolean r0 = r3 instanceof X.C94114hf
            if (r0 == 0) goto L_0x002e
        L_0x0013:
            X.4hf r3 = (X.C94114hf) r3
            X.6gq r3 = r3.A00
        L_0x0017:
            if (r3 == 0) goto L_0x002e
            boolean r0 = r3 instanceof X.C161777nS
            if (r0 != 0) goto L_0x002b
            boolean r0 = r3 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0028
            r1 = 2
            int r0 = r3.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0028
            goto L_0x0013
        L_0x0028:
            X.6gq r3 = r3.A02
            goto L_0x0017
        L_0x002b:
            X.7nS r3 = (X.C161777nS) r3
            return r3
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XQ.A03(X.6gq):X.7nS");
    }

    public static int A00(C137846gp r0, int i) {
        return r0.A0R.A02.A00 & i;
    }

    public static final C137856gq A01(C161637nE r15, C137856gq r16) {
        C137856gq r4;
        if (r15 instanceof C137276fs) {
            C137276fs r152 = (C137276fs) r15;
            if (r152 instanceof OnFirstContentDrawModifierElement) {
                r4 = new C94244ht(((OnFirstContentDrawModifierElement) r152).A00);
            } else if (r152 instanceof EmptySemanticsElement) {
                r4 = new C94394i9();
            } else if (r152 instanceof AppendedSemanticsElement) {
                AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) r152;
                r4 = new C94414iB(appendedSemanticsElement.A00, appendedSemanticsElement.A01);
            } else if (r152 instanceof C162447ob) {
                C162447ob r153 = (C162447ob) r152;
                int i = r153.A01;
                Object obj = r153.A00;
                if (i != 0) {
                    r4 = ((C135616cz) obj).A02;
                } else {
                    r4 = ((C137346fz) obj).A01;
                }
            } else if (r152 instanceof ForceUpdateElement) {
                throw AnonymousClass001.A09("Shouldn't be called");
            } else if (r152 instanceof LayoutElement) {
                r4 = new C94334i2(((LayoutElement) r152).A00);
            } else if (r152 instanceof RotaryInputElement) {
                r4 = new C94164hl(((RotaryInputElement) r152).A00);
            } else if (r152 instanceof SuspendPointerInputElement) {
                r4 = new C94464iG(((SuspendPointerInputElement) r152).A01);
            } else if (r152 instanceof KeyInputElement) {
                r4 = new C94154hj(((KeyInputElement) r152).A00);
            } else if (r152 instanceof GraphicsLayerElement) {
                GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) r152;
                long j = graphicsLayerElement.A02;
                r4 = new C94354i4(graphicsLayerElement.A03, j, graphicsLayerElement.A00, graphicsLayerElement.A01, graphicsLayerElement.A04);
            } else if (r152 instanceof BlockGraphicsLayerElement) {
                r4 = new C94344i3(((BlockGraphicsLayerElement) r152).A00);
            } else if (r152 instanceof FocusTargetNode$FocusTargetElement) {
                r4 = new C94214hq();
            } else if (r152 instanceof PainterElement) {
                PainterElement painterElement = (PainterElement) r152;
                C128906Eb r7 = painterElement.A03;
                r4 = new C94254hu(painterElement.A01, painterElement.A02, r7, painterElement.A04, painterElement.A00);
            } else if (r152 instanceof DrawBehindElement) {
                r4 = new C94224hr(((DrawBehindElement) r152).A00);
            } else if (r152 instanceof CompositionLocalMapInjectionElement) {
                r4 = new C94094hd(((CompositionLocalMapInjectionElement) r152).A00);
            } else if (r152 instanceof TextStringSimpleElement) {
                TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) r152;
                String str = textStringSimpleElement.A05;
                r4 = new C94444iE(textStringSimpleElement.A03, textStringSimpleElement.A04, str, textStringSimpleElement.A02, textStringSimpleElement.A00, textStringSimpleElement.A01, textStringSimpleElement.A06);
            } else if (r152 instanceof TextAnnotatedStringElement) {
                TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) r152;
                AnonymousClass72L r5 = textAnnotatedStringElement.A03;
                AnonymousClass6V8 r6 = textAnnotatedStringElement.A04;
                C157027bi r72 = textAnnotatedStringElement.A05;
                C006302t r9 = textAnnotatedStringElement.A08;
                int i2 = textAnnotatedStringElement.A02;
                boolean z = textAnnotatedStringElement.A09;
                r4 = new C94454iF(r5, r6, r72, textAnnotatedStringElement.A06, r9, textAnnotatedStringElement.A07, i2, textAnnotatedStringElement.A00, textAnnotatedStringElement.A01, z);
            } else if (r152 instanceof WrapContentElement) {
                WrapContentElement wrapContentElement = (WrapContentElement) r152;
                r4 = new C94304hz(wrapContentElement.A00, wrapContentElement.A01);
            } else if (r152 instanceof UnspecifiedConstraintsElement) {
                UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) r152;
                r4 = new C94294hy(unspecifiedConstraintsElement.A01, unspecifiedConstraintsElement.A00);
            } else if (r152 instanceof SizeElement) {
                SizeElement sizeElement = (SizeElement) r152;
                r4 = new C94324i1(sizeElement.A03, sizeElement.A02, sizeElement.A01, sizeElement.A00);
            } else if (r152 instanceof PaddingValuesElement) {
                r4 = new C94274hw(((PaddingValuesElement) r152).A00);
            } else if (r152 instanceof PaddingElement) {
                PaddingElement paddingElement = (PaddingElement) r152;
                r4 = new C94314i0(paddingElement.A02, paddingElement.A03, paddingElement.A01, paddingElement.A00);
            } else if (r152 instanceof HorizontalAlignElement) {
                r4 = new C94374i6(((HorizontalAlignElement) r152).A00);
            } else if (r152 instanceof FillElement) {
                r4 = new C94284hx(((FillElement) r152).A00);
            } else if (r152 instanceof ScrollableElement) {
                ScrollableElement scrollableElement = (ScrollableElement) r152;
                C160557lC r92 = scrollableElement.A04;
                AnonymousClass5RU r8 = scrollableElement.A03;
                C160257ki r52 = scrollableElement.A00;
                boolean z2 = scrollableElement.A06;
                boolean z3 = scrollableElement.A07;
                r4 = new C94814ip(r52, scrollableElement.A01, scrollableElement.A02, r8, r92, scrollableElement.A05, z2, z3);
            } else if (r152 instanceof HoverableElement) {
                r4 = new HoverableNode(((HoverableElement) r152).A00);
            } else if (r152 instanceof FocusableKt$FocusableInNonTouchModeElement$1) {
                r4 = new C94144hi();
            } else if (r152 instanceof FocusableElement) {
                r4 = new C94834ir(((FocusableElement) r152).A00);
            } else if (r152 instanceof ClickableElement) {
                ClickableElement clickableElement = (ClickableElement) r152;
                C161437mu r53 = clickableElement.A00;
                boolean z4 = clickableElement.A04;
                r4 = new C93354gQ(r53, clickableElement.A01, clickableElement.A02, clickableElement.A03, z4);
            } else {
                BackgroundElement backgroundElement = (BackgroundElement) r152;
                r4 = new C94234hs(backgroundElement.A01, backgroundElement.A00);
            }
            r4.A01 = AnonymousClass6X7.A02(r4);
        } else {
            r4 = new C94384i8(r15);
        }
        if (!r4.A08) {
            r4.A07 = true;
            C137856gq r1 = r16;
            C137856gq r0 = r1.A02;
            if (r0 != null) {
                r0.A04 = r4;
                r4.A02 = r0;
            }
            r1.A02 = r4;
            r4.A04 = r1;
            return r4;
        }
        throw AnonymousClass001.A09("A ModifierNodeElement cannot return an already attached node from create() ");
    }

    public static final C137856gq A02(C137856gq r3) {
        if (r3.A08) {
            AnonymousClass6X7.A05(r3, -1, 2);
            r3.A0D();
            r3.A09();
        }
        C137856gq r2 = r3.A02;
        C137856gq r1 = r3.A04;
        if (r2 != null) {
            r2.A04 = r1;
            r3.A02 = null;
        }
        if (r1 != null) {
            r1.A02 = r2;
            r3.A04 = null;
        }
        AnonymousClass00C.A0B(r1);
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c3, code lost:
        if (r9 != r13) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011c, code lost:
        r18 = X.AnonymousClass000.A1Q(r19 % 2);
        r0 = -r10;
        r30 = r0;
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0126, code lost:
        if (r13 > r10) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        if (r13 == r30) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012c, code lost:
        if (r13 == r10) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0138, code lost:
        if (r3[(r13 + 1) + r12] >= r3[(r13 - 1) + r12]) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        r9 = r3[(r13 + 1) + r12];
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0140, code lost:
        r1 = r26 - ((r24 - r8) - r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0145, code lost:
        if (r10 == 0) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0147, code lost:
        r17 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0149, code lost:
        if (r8 == r9) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014b, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014f, code lost:
        if (r8 <= r23) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        if (r1 <= r25) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0155, code lost:
        r0 = r4.A02;
        r15 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0172, code lost:
        if (X.C129596Hr.A00((X.C161637nE) r0.A01[(r8 - 1) + r15], (X.C161637nE) r4.A01.A01[r15 + (r1 - 1)]) == 0) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0174, code lost:
        r8 = r8 - 1;
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0179, code lost:
        r3[r13 + r12] = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017d, code lost:
        if (r18 == false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017f, code lost:
        r14 = r19 - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0183, code lost:
        if (r14 < r30) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0185, code lost:
        if (r14 > r10) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018a, code lost:
        if (r6[r14 + r12] < r8) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018c, code lost:
        r2[0] = r8;
        X.C90474aD.A1R(r2, r1, r9, r17);
        r2[4] = 1;
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0197, code lost:
        r10 = r2[2];
        r9 = r2[0];
        r10 = r10 - r9;
        r8 = r2[3];
        r1 = r2[1];
        r8 = r8 - r1;
        r0 = java.lang.Math.min(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a7, code lost:
        if (r0 <= 0) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a9, code lost:
        if (r8 == r10) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ab, code lost:
        if (r12 != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ad, code lost:
        if (r8 <= r10) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01af, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b1, code lost:
        r5.A01(r9, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b4, code lost:
        r7.A02(r23, r2[0], r25, r2[1]);
        r7.A02(r2[2], r24, r2[3], r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ce, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d1, code lost:
        r5.A01(r9, r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d5, code lost:
        r13 = r13 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d9, code lost:
        r9 = r3[(r13 - 1) + r12];
        r8 = r9 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C1506776e r29, X.C1506776e r30, X.C137856gq r31, X.AnonymousClass6XQ r32, int r33, boolean r34) {
        /*
            r0 = r32
            X.5wk r4 = r0.A03
            r5 = r29
            r3 = r30
            r2 = r31
            r1 = r33
            r0 = r34
            if (r4 != 0) goto L_0x01e6
            X.5wk r4 = new X.5wk
            r6 = r3
            r7 = r2
            r8 = r32
            r9 = r1
            r10 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r8.A03 = r4
        L_0x001d:
            int r0 = r5.A00
            int r29 = r0 - r33
            int r0 = r3.A00
            int r28 = r0 - r33
            int r0 = r29 + r28
            int r0 = r0 + 1
            int r3 = r0 / 2
            int r0 = r3 * 3
            X.6Nm r5 = new X.6Nm
            r5.<init>(r0)
            int r0 = r3 * 4
            X.6Nm r7 = new X.6Nm
            r7.<init>(r0)
            r2 = 0
            r1 = r29
            r0 = r28
            r7.A02(r2, r1, r2, r0)
            int r0 = r3 * 2
            int r27 = r0 + 1
            r0 = r27
            int[] r6 = new int[r0]
            int[] r3 = new int[r0]
            r0 = 5
            int[] r2 = new int[r0]
        L_0x004e:
            int r0 = r7.A00
            if (r0 == 0) goto L_0x01f2
            int[] r1 = r7.A01
            int r0 = r0 + -1
            r7.A00 = r0
            r26 = r1[r0]
            int r0 = r0 + -1
            r7.A00 = r0
            r25 = r1[r0]
            int r0 = r0 + -1
            r7.A00 = r0
            r24 = r1[r0]
            int r0 = r0 + -1
            r7.A00 = r0
            r23 = r1[r0]
            int r22 = r24 - r23
            int r21 = r26 - r25
            r20 = 0
            r11 = 1
            r0 = r22
            if (r0 < r11) goto L_0x004e
            r0 = r21
            if (r0 < r11) goto L_0x004e
            int r0 = r22 + r21
            int r0 = r0 + 1
            int r0 = r0 / 2
            r31 = r0
            int r12 = r27 / 2
            int r0 = r12 + 1
            r6[r0] = r23
            r3[r0] = r24
            r10 = 0
        L_0x008c:
            r0 = r31
            if (r10 >= r0) goto L_0x004e
            int r19 = r22 - r21
            int r0 = java.lang.Math.abs(r19)
            int r0 = r0 % 2
            boolean r18 = X.AnonymousClass000.A1S(r0, r11)
            int r0 = -r10
            r17 = r0
            r14 = r0
        L_0x00a0:
            if (r14 > r10) goto L_0x011c
            r0 = r17
            if (r14 == r0) goto L_0x00b4
            if (r14 == r10) goto L_0x0114
            int r0 = r14 + 1
            int r0 = r0 + r12
            r1 = r6[r0]
            int r0 = r14 + -1
            int r0 = r0 + r12
            r0 = r6[r0]
            if (r1 <= r0) goto L_0x0114
        L_0x00b4:
            int r0 = r14 + 1
            int r0 = r0 + r12
            r13 = r6[r0]
            r9 = r13
        L_0x00ba:
            int r0 = r9 - r23
            int r8 = r25 + r0
            int r8 = r8 - r14
            if (r10 == 0) goto L_0x00c5
            int r16 = r8 + -1
            if (r9 == r13) goto L_0x00c7
        L_0x00c5:
            r16 = r8
        L_0x00c7:
            r0 = r24
            if (r9 >= r0) goto L_0x00ef
            r0 = r26
            if (r8 >= r0) goto L_0x00ef
            X.76e r0 = r4.A02
            int r15 = r4.A00
            int r1 = r15 + r9
            java.lang.Object[] r0 = r0.A01
            r1 = r0[r1]
            X.7nE r1 = (X.C161637nE) r1
            X.76e r0 = r4.A01
            int r15 = r15 + r8
            java.lang.Object[] r0 = r0.A01
            r0 = r0[r15]
            X.7nE r0 = (X.C161637nE) r0
            int r0 = X.C129596Hr.A00(r1, r0)
            if (r0 == 0) goto L_0x00ef
            int r9 = r9 + 1
            int r8 = r8 + 1
            goto L_0x00c7
        L_0x00ef:
            int r0 = r14 + r12
            r6[r0] = r9
            if (r18 == 0) goto L_0x0111
            int r1 = r19 - r14
            int r0 = r17 + 1
            if (r1 < r0) goto L_0x0111
            int r0 = r10 + -1
            if (r1 > r0) goto L_0x0111
            int r1 = r1 + r12
            r0 = r3[r1]
            if (r0 > r9) goto L_0x0111
            r2[r20] = r13
            r0 = r16
            X.C90474aD.A1R(r2, r0, r9, r8)
            r0 = 4
            r2[r0] = r20
            r12 = 0
            goto L_0x0197
        L_0x0111:
            int r14 = r14 + 2
            goto L_0x00a0
        L_0x0114:
            int r0 = r14 + -1
            int r0 = r0 + r12
            r13 = r6[r0]
            int r9 = r13 + 1
            goto L_0x00ba
        L_0x011c:
            int r0 = r19 % 2
            boolean r18 = X.AnonymousClass000.A1Q(r0)
            int r0 = -r10
            r30 = r0
            r13 = r0
        L_0x0126:
            if (r13 > r10) goto L_0x01e2
            r0 = r30
            if (r13 == r0) goto L_0x013a
            if (r13 == r10) goto L_0x01d9
            int r0 = r13 + 1
            int r0 = r0 + r12
            r1 = r3[r0]
            int r0 = r13 + -1
            int r0 = r0 + r12
            r0 = r3[r0]
            if (r1 >= r0) goto L_0x01d9
        L_0x013a:
            int r0 = r13 + 1
            int r0 = r0 + r12
            r9 = r3[r0]
            r8 = r9
        L_0x0140:
            int r0 = r24 - r8
            int r0 = r0 - r13
            int r1 = r26 - r0
            if (r10 == 0) goto L_0x014b
            int r17 = r1 + 1
            if (r8 == r9) goto L_0x014d
        L_0x014b:
            r17 = r1
        L_0x014d:
            r0 = r23
            if (r8 <= r0) goto L_0x0179
            r0 = r25
            if (r1 <= r0) goto L_0x0179
            int r14 = r8 + -1
            int r16 = r1 + -1
            X.76e r0 = r4.A02
            int r15 = r4.A00
            int r14 = r14 + r15
            java.lang.Object[] r0 = r0.A01
            r14 = r0[r14]
            X.7nE r14 = (X.C161637nE) r14
            X.76e r0 = r4.A01
            int r15 = r15 + r16
            java.lang.Object[] r0 = r0.A01
            r0 = r0[r15]
            X.7nE r0 = (X.C161637nE) r0
            int r0 = X.C129596Hr.A00(r14, r0)
            if (r0 == 0) goto L_0x0179
            int r8 = r8 + -1
            int r1 = r1 + -1
            goto L_0x014d
        L_0x0179:
            int r0 = r13 + r12
            r3[r0] = r8
            if (r18 == 0) goto L_0x01d5
            int r14 = r19 - r13
            r0 = r30
            if (r14 < r0) goto L_0x01d5
            if (r14 > r10) goto L_0x01d5
            int r14 = r14 + r12
            r0 = r6[r14]
            if (r0 < r8) goto L_0x01d5
            r2[r20] = r8
            r0 = r17
            X.C90474aD.A1R(r2, r1, r9, r0)
            r0 = 4
            r2[r0] = r11
            r12 = 1
        L_0x0197:
            r0 = 2
            r10 = r2[r0]
            r9 = r2[r20]
            int r10 = r10 - r9
            r0 = 3
            r8 = r2[r0]
            r1 = r2[r11]
            int r8 = r8 - r1
            int r0 = java.lang.Math.min(r10, r8)
            if (r0 <= 0) goto L_0x01b4
            if (r8 == r10) goto L_0x01d1
            if (r12 != 0) goto L_0x01b1
            if (r8 <= r10) goto L_0x01ce
            int r1 = r1 + 1
        L_0x01b1:
            r5.A01(r9, r1, r0)
        L_0x01b4:
            r9 = r2[r20]
            r8 = r2[r11]
            r1 = r25
            r0 = r23
            r7.A02(r0, r9, r1, r8)
            r0 = 2
            r9 = r2[r0]
            r0 = 3
            r8 = r2[r0]
            r1 = r26
            r0 = r24
            r7.A02(r9, r0, r8, r1)
            goto L_0x004e
        L_0x01ce:
            int r9 = r9 + 1
            goto L_0x01b1
        L_0x01d1:
            r5.A01(r9, r1, r10)
            goto L_0x01b4
        L_0x01d5:
            int r13 = r13 + 2
            goto L_0x0126
        L_0x01d9:
            int r0 = r13 + -1
            int r0 = r0 + r12
            r9 = r3[r0]
            int r8 = r9 + -1
            goto L_0x0140
        L_0x01e2:
            int r10 = r10 + 1
            goto L_0x008c
        L_0x01e6:
            r4.A03 = r2
            r4.A00 = r1
            r4.A02 = r5
            r4.A01 = r3
            r4.A04 = r0
            goto L_0x001d
        L_0x01f2:
            int r1 = r5.A00
            int r0 = r1 % 3
            r2 = 0
            if (r0 != 0) goto L_0x02f2
            r0 = 3
            if (r1 <= r0) goto L_0x0200
            int r1 = r1 - r0
            X.C131036Nm.A00(r5, r2, r1)
        L_0x0200:
            r1 = r29
            r0 = r28
            r5.A01(r1, r0, r2)
            r8 = 0
            r7 = 0
            r6 = 0
        L_0x020a:
            int r0 = r5.A00
            if (r8 >= r0) goto L_0x02dc
            int[] r1 = r5.A01
            r9 = r1[r8]
            int r0 = r8 + 2
            r12 = r1[r0]
            int r9 = r9 - r12
            int r0 = r8 + 1
            r10 = r1[r0]
            int r10 = r10 - r12
            int r8 = r8 + 3
        L_0x021e:
            if (r7 >= r9) goto L_0x024f
            X.6gq r0 = r4.A03
            X.6gq r3 = r0.A02
            X.AnonymousClass00C.A0B(r3)
            X.6XQ r2 = r4.A05
            r1 = 2
            int r0 = r3.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0246
            X.4iy r1 = r3.A05
            X.AnonymousClass00C.A0B(r1)
            X.4iy r0 = r1.A06
            X.4iy r1 = r1.A05
            X.AnonymousClass00C.A0B(r1)
            if (r0 == 0) goto L_0x023f
            r0.A05 = r1
        L_0x023f:
            r1.A06 = r0
            X.6gq r0 = r4.A03
            A06(r0, r2, r1)
        L_0x0246:
            X.6gq r0 = A02(r3)
            r4.A03 = r0
            int r7 = r7 + 1
            goto L_0x021e
        L_0x024f:
            if (r6 >= r10) goto L_0x02a9
            int r2 = r4.A00
            int r2 = r2 + r6
            X.6gq r1 = r4.A03
            X.6XQ r11 = r4.A05
            X.76e r0 = r4.A01
            java.lang.Object[] r0 = r0.A01
            r0 = r0[r2]
            X.7nE r0 = (X.C161637nE) r0
            X.6gq r1 = A01(r0, r1)
            r4.A03 = r1
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x02a5
            X.6gq r0 = r1.A02
            X.AnonymousClass00C.A0B(r0)
            X.4iy r9 = r0.A05
            X.AnonymousClass00C.A0B(r9)
            X.6gq r3 = r4.A03
            X.7nS r2 = A03(r3)
            if (r2 == 0) goto L_0x02a1
            X.6gp r0 = r11.A07
            X.4jV r1 = new X.4jV
            r1.<init>(r2, r0)
            r3.A0E(r1)
            A06(r3, r11, r1)
            X.4iy r0 = r9.A06
            r1.A06 = r0
            r1.A05 = r9
            r9.A06 = r1
        L_0x0291:
            r3.A08()
            X.6gq r0 = r4.A03
            r0.A0C()
            X.6gq r0 = r4.A03
            X.AnonymousClass6X7.A03(r0)
        L_0x029e:
            int r6 = r6 + 1
            goto L_0x024f
        L_0x02a1:
            r3.A0E(r9)
            goto L_0x0291
        L_0x02a5:
            r0 = 1
            r1.A07 = r0
            goto L_0x029e
        L_0x02a9:
            int r9 = r12 + -1
            if (r12 <= 0) goto L_0x020a
            X.6gq r0 = r4.A03
            X.6gq r0 = r0.A02
            X.AnonymousClass00C.A0B(r0)
            r4.A03 = r0
            X.76e r0 = r4.A02
            int r3 = r4.A00
            int r1 = r3 + r7
            java.lang.Object[] r0 = r0.A01
            r2 = r0[r1]
            X.7nE r2 = (X.C161637nE) r2
            X.76e r0 = r4.A01
            int r3 = r3 + r6
            java.lang.Object[] r0 = r0.A01
            r1 = r0[r3]
            X.7nE r1 = (X.C161637nE) r1
            boolean r0 = X.AnonymousClass00C.A0J(r2, r1)
            if (r0 != 0) goto L_0x02d6
            X.6gq r0 = r4.A03
            A05(r2, r1, r0)
        L_0x02d6:
            int r7 = r7 + 1
            int r6 = r6 + 1
            r12 = r9
            goto L_0x02a9
        L_0x02dc:
            r0 = r32
            X.6gq r0 = r0.A05
            X.6gq r2 = r0.A04
            r1 = 0
        L_0x02e3:
            if (r2 == 0) goto L_0x02f1
            X.4hc r0 = X.C129596Hr.A00
            if (r2 == r0) goto L_0x02f1
            int r0 = r2.A01
            r1 = r1 | r0
            r2.A00 = r1
            X.6gq r2 = r2.A04
            goto L_0x02e3
        L_0x02f1:
            return
        L_0x02f2:
            java.lang.String r0 = "Array size not a multiple of 3"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XQ.A04(X.76e, X.76e, X.6gq, X.6XQ, int, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [X.7bY, X.4iF, X.6gq, X.7nW] */
    /* JADX WARNING: type inference failed for: r4v6, types: [X.7bY, X.4iE, X.6gq, X.7nW] */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.7nW] */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01cb, code lost:
        if (r11 == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01cd, code lost:
        if (r2 != false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01cf, code lost:
        r9 = X.C94444iE.A00(r4);
        r8 = r4.A05;
        r7 = r4.A03;
        r6 = r4.A04;
        r5 = r4.A02;
        r2 = r4.A07;
        r1 = r4.A00;
        r0 = r4.A01;
        r9.A0C = r8;
        r9.A08 = r7;
        r9.A09 = r6;
        r9.A02 = r5;
        r9.A0E = r2;
        r9.A00 = r1;
        r9.A01 = r0;
        X.AnonymousClass6NV.A00(r9);
        X.AnonymousClass6VZ.A06(r4);
        X.C109225Wt.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f8, code lost:
        if (r12 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02b5, code lost:
        if (r12 == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02b9, code lost:
        if (r1 == false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02ca, code lost:
        if (r13 != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0100, code lost:
        if (r7 != r5) goto L_0x0102;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C161637nE r14, X.C161637nE r15, X.C137856gq r16) {
        /*
            boolean r0 = r14 instanceof X.C137276fs
            r3 = r16
            if (r0 == 0) goto L_0x04b6
            boolean r0 = r15 instanceof X.C137276fs
            if (r0 == 0) goto L_0x04b6
            X.6fs r15 = (X.C137276fs) r15
            X.4hc r0 = X.C129596Hr.A00
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe"
            X.AnonymousClass00C.A0E(r3, r0)
            boolean r0 = r15 instanceof com.whatsapp.contact.picker.invite.compose.perf.render.OnFirstContentDrawModifierElement
            if (r0 == 0) goto L_0x002c
            com.whatsapp.contact.picker.invite.compose.perf.render.OnFirstContentDrawModifierElement r15 = (com.whatsapp.contact.picker.invite.compose.perf.render.OnFirstContentDrawModifierElement) r15
            r1 = r3
            X.4ht r1 = (X.C94244ht) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.00S r0 = r15.A00
            r1.A00 = r0
        L_0x0024:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x04d6
            X.AnonymousClass6X7.A04(r3)
            return
        L_0x002c:
            boolean r0 = r15 instanceof androidx.compose.ui.semantics.EmptySemanticsElement
            if (r0 != 0) goto L_0x0024
            boolean r0 = r15 instanceof androidx.compose.ui.semantics.AppendedSemanticsElement
            if (r0 == 0) goto L_0x0042
            androidx.compose.ui.semantics.AppendedSemanticsElement r15 = (androidx.compose.ui.semantics.AppendedSemanticsElement) r15
            r1 = r3
            X.4iB r1 = (X.C94414iB) r1
            boolean r0 = r15.A01
            r1.A01 = r0
            X.02t r0 = r15.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0042:
            boolean r0 = r15 instanceof X.C162447ob
            if (r0 != 0) goto L_0x0024
            boolean r0 = r15 instanceof androidx.compose.ui.node.ForceUpdateElement
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "Shouldn't be called"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0051:
            boolean r0 = r15 instanceof androidx.compose.ui.layout.LayoutElement
            if (r0 == 0) goto L_0x005f
            androidx.compose.ui.layout.LayoutElement r15 = (androidx.compose.ui.layout.LayoutElement) r15
            r1 = r3
            X.4i2 r1 = (X.C94334i2) r1
            X.08g r0 = r15.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x005f:
            boolean r0 = r15 instanceof androidx.compose.ui.input.rotary.RotaryInputElement
            if (r0 == 0) goto L_0x006d
            androidx.compose.ui.input.rotary.RotaryInputElement r15 = (androidx.compose.ui.input.rotary.RotaryInputElement) r15
            r1 = r3
            X.4hl r1 = (X.C94164hl) r1
            X.02t r0 = r15.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x006d:
            boolean r0 = r15 instanceof androidx.compose.ui.input.pointer.SuspendPointerInputElement
            if (r0 == 0) goto L_0x007e
            androidx.compose.ui.input.pointer.SuspendPointerInputElement r15 = (androidx.compose.ui.input.pointer.SuspendPointerInputElement) r15
            r1 = r3
            X.4iG r1 = (X.C94464iG) r1
            X.03v r0 = r15.A01
            r1.BoX()
            r1.A02 = r0
            goto L_0x0024
        L_0x007e:
            boolean r0 = r15 instanceof androidx.compose.ui.input.key.KeyInputElement
            if (r0 == 0) goto L_0x008c
            androidx.compose.ui.input.key.KeyInputElement r15 = (androidx.compose.ui.input.key.KeyInputElement) r15
            r1 = r3
            X.4hj r1 = (X.C94154hj) r1
            X.02t r0 = r15.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x008c:
            boolean r0 = r15 instanceof androidx.compose.ui.graphics.GraphicsLayerElement
            if (r0 == 0) goto L_0x00c5
            androidx.compose.ui.graphics.GraphicsLayerElement r15 = (androidx.compose.ui.graphics.GraphicsLayerElement) r15
            r4 = r3
            X.4i4 r4 = (X.C94354i4) r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.A02 = r0
            r4.A03 = r0
            r4.A00 = r0
            r0 = 1090519040(0x41000000, float:8.0)
            r4.A01 = r0
            long r0 = r15.A02
            r4.A06 = r0
            X.7dt r0 = r15.A03
            r4.A07 = r0
            boolean r0 = r15.A04
            r4.A09 = r0
            long r0 = r15.A00
            r4.A04 = r0
            long r0 = r15.A01
            r4.A05 = r0
            X.4iy r0 = X.C137856gq.A06(r4)
            X.4iy r2 = r0.A05
            if (r2 == 0) goto L_0x0024
            X.02t r1 = r4.A08
        L_0x00bf:
            r0 = 1
            r2.A0a(r1, r0)
            goto L_0x0024
        L_0x00c5:
            boolean r0 = r15 instanceof androidx.compose.ui.graphics.BlockGraphicsLayerElement
            if (r0 == 0) goto L_0x00dd
            androidx.compose.ui.graphics.BlockGraphicsLayerElement r15 = (androidx.compose.ui.graphics.BlockGraphicsLayerElement) r15
            r1 = r3
            X.4i3 r1 = (X.C94344i3) r1
            X.02t r0 = r15.A00
            r1.A00 = r0
            X.4iy r0 = X.C137856gq.A06(r1)
            X.4iy r2 = r0.A05
            if (r2 == 0) goto L_0x0024
            X.02t r1 = r1.A00
            goto L_0x00bf
        L_0x00dd:
            boolean r0 = r15 instanceof androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
            if (r0 != 0) goto L_0x0024
            boolean r0 = r15 instanceof androidx.compose.ui.draw.PainterElement
            if (r0 == 0) goto L_0x0124
            androidx.compose.ui.draw.PainterElement r15 = (androidx.compose.ui.draw.PainterElement) r15
            r4 = r3
            X.4hu r4 = (X.C94254hu) r4
            boolean r1 = r4.A05
            r0 = 1
            if (r1 != r0) goto L_0x0102
            X.6Eb r0 = r4.A03
            long r7 = r0.A00()
            X.6Eb r0 = r15.A03
            long r5 = r0.A00()
            long r0 = X.AnonymousClass6X0.A02
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0103
        L_0x0102:
            r1 = 1
        L_0x0103:
            X.6Eb r0 = r15.A03
            r4.A03 = r0
            r0 = 1
            r4.A05 = r0
            androidx.compose.ui.Alignment r0 = r15.A01
            r4.A01 = r0
            X.7mL r0 = r15.A04
            r4.A04 = r0
            float r0 = r15.A00
            r4.A00 = r0
            X.5h6 r0 = r15.A02
            r4.A02 = r0
            if (r1 == 0) goto L_0x011f
            X.AnonymousClass6VZ.A06(r4)
        L_0x011f:
            X.C109225Wt.A00(r4)
            goto L_0x0024
        L_0x0124:
            boolean r0 = r15 instanceof androidx.compose.ui.draw.DrawBehindElement
            if (r0 == 0) goto L_0x0133
            androidx.compose.ui.draw.DrawBehindElement r15 = (androidx.compose.ui.draw.DrawBehindElement) r15
            r1 = r3
            X.4hr r1 = (X.C94224hr) r1
            X.02t r0 = r15.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0133:
            boolean r0 = r15 instanceof androidx.compose.ui.CompositionLocalMapInjectionElement
            if (r0 == 0) goto L_0x0149
            androidx.compose.ui.CompositionLocalMapInjectionElement r15 = (androidx.compose.ui.CompositionLocalMapInjectionElement) r15
            r0 = r3
            X.4hd r0 = (X.C94094hd) r0
            X.7mC r1 = r15.A00
            r0.A00 = r1
            X.6gp r0 = X.AnonymousClass6VZ.A02(r0)
            r0.BqY(r1)
            goto L_0x0024
        L_0x0149:
            boolean r0 = r15 instanceof androidx.compose.foundation.text.modifiers.TextStringSimpleElement
            if (r0 == 0) goto L_0x020c
            androidx.compose.foundation.text.modifiers.TextStringSimpleElement r15 = (androidx.compose.foundation.text.modifiers.TextStringSimpleElement) r15
            r4 = r3
            X.4iE r4 = (X.C94444iE) r4
            X.6V8 r9 = r15.A03
            r12 = 1
            X.6V8 r0 = r4.A03
            if (r9 == r0) goto L_0x0163
            X.6FJ r1 = r9.A02
            X.6FJ r0 = r0.A02
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0164
        L_0x0163:
            r12 = 0
        L_0x0164:
            java.lang.String r1 = r15.A05
            java.lang.String r0 = r4.A05
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 == 0) goto L_0x0201
            r11 = 0
        L_0x016f:
            int r10 = r15.A01
            int r8 = r15.A00
            boolean r7 = r15.A06
            X.7bi r6 = r15.A04
            int r5 = r15.A02
            X.6V8 r2 = r4.A03
            if (r2 == r9) goto L_0x0191
            X.6Eq r1 = r2.A00
            X.6Eq r0 = r9.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x01ff
            X.6FJ r1 = r2.A02
            X.6FJ r0 = r9.A02
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x01ff
        L_0x0191:
            r0 = 1
        L_0x0192:
            r2 = 1
            r1 = r0 ^ 1
            r4.A03 = r9
            int r0 = r4.A01
            if (r0 == r10) goto L_0x019e
            r4.A01 = r10
            r1 = 1
        L_0x019e:
            int r0 = r4.A00
            if (r0 == r8) goto L_0x01a5
            r4.A00 = r8
            r1 = 1
        L_0x01a5:
            boolean r0 = r4.A07
            if (r0 == r7) goto L_0x01ac
            r4.A07 = r7
            r1 = 1
        L_0x01ac:
            X.7bi r0 = r4.A04
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 != 0) goto L_0x01b7
            r4.A04 = r6
            r1 = 1
        L_0x01b7:
            int r0 = r4.A02
            if (r0 != r5) goto L_0x01fc
            r2 = r1
        L_0x01bc:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0024
            if (r11 != 0) goto L_0x01c8
            if (r12 == 0) goto L_0x01cd
            X.02t r0 = r4.A06
            if (r0 == 0) goto L_0x01cd
        L_0x01c8:
            X.AnonymousClass6VZ.A05(r4)
            if (r11 != 0) goto L_0x01cf
        L_0x01cd:
            if (r2 == 0) goto L_0x01f8
        L_0x01cf:
            X.6NV r9 = X.C94444iE.A00(r4)
            java.lang.String r8 = r4.A05
            X.6V8 r7 = r4.A03
            X.7bi r6 = r4.A04
            int r5 = r4.A02
            boolean r2 = r4.A07
            int r1 = r4.A00
            int r0 = r4.A01
            r9.A0C = r8
            r9.A08 = r7
            r9.A09 = r6
            r9.A02 = r5
            r9.A0E = r2
            r9.A00 = r1
            r9.A01 = r0
            X.AnonymousClass6NV.A00(r9)
            X.AnonymousClass6VZ.A06(r4)
            X.C109225Wt.A00(r4)
        L_0x01f8:
            if (r12 == 0) goto L_0x0024
            goto L_0x011f
        L_0x01fc:
            r4.A02 = r5
            goto L_0x01bc
        L_0x01ff:
            r0 = 0
            goto L_0x0192
        L_0x0201:
            r4.A05 = r1
            r1 = 0
            X.7n5 r0 = r4.A0A
            r0.setValue(r1)
            r11 = 1
            goto L_0x016f
        L_0x020c:
            boolean r0 = r15 instanceof androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement
            if (r0 == 0) goto L_0x02e0
            androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement r15 = (androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement) r15
            r4 = r3
            X.4iF r4 = (X.C94454iF) r4
            X.6V8 r11 = r15.A04
            r13 = 1
            X.6V8 r0 = r4.A04
            if (r11 == r0) goto L_0x0226
            X.6FJ r1 = r11.A02
            X.6FJ r0 = r0.A02
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0227
        L_0x0226:
            r13 = 0
        L_0x0227:
            X.72L r1 = r15.A03
            X.72L r0 = r4.A03
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 == 0) goto L_0x02d5
            r12 = 0
        L_0x0232:
            java.util.List r10 = r15.A06
            int r9 = r15.A01
            int r8 = r15.A00
            boolean r7 = r15.A09
            X.7bi r6 = r15.A05
            int r2 = r15.A02
            X.6V8 r5 = r4.A04
            if (r5 == r11) goto L_0x0256
            X.6Eq r1 = r5.A00
            X.6Eq r0 = r11.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x02d3
            X.6FJ r1 = r5.A02
            X.6FJ r0 = r11.A02
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x02d3
        L_0x0256:
            r0 = 1
        L_0x0257:
            r5 = 1
            r1 = r0 ^ 1
            r4.A04 = r11
            java.util.List r0 = r4.A06
            boolean r0 = X.AnonymousClass00C.A0J(r0, r10)
            if (r0 != 0) goto L_0x0267
            r4.A06 = r10
            r1 = 1
        L_0x0267:
            int r0 = r4.A01
            if (r0 == r9) goto L_0x026e
            r4.A01 = r9
            r1 = 1
        L_0x026e:
            int r0 = r4.A00
            if (r0 == r8) goto L_0x0275
            r4.A00 = r8
            r1 = 1
        L_0x0275:
            boolean r0 = r4.A0A
            if (r0 == r7) goto L_0x027c
            r4.A0A = r7
            r1 = 1
        L_0x027c:
            X.7bi r0 = r4.A05
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 != 0) goto L_0x0287
            r4.A05 = r6
            r1 = 1
        L_0x0287:
            int r0 = r4.A02
            if (r0 != r2) goto L_0x02d0
            r5 = r1
        L_0x028c:
            X.02t r1 = r15.A08
            X.02t r2 = r15.A07
            X.02t r0 = r4.A08
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 != 0) goto L_0x02ce
            r4.A08 = r1
            r1 = 1
        L_0x029b:
            X.02t r0 = r4.A07
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 != 0) goto L_0x02a6
            r4.A07 = r2
            r1 = 1
        L_0x02a6:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0024
            if (r12 != 0) goto L_0x02b2
            if (r13 == 0) goto L_0x02b7
            X.02t r0 = r4.A09
            if (r0 == 0) goto L_0x02b7
        L_0x02b2:
            X.AnonymousClass6VZ.A05(r4)
            if (r12 != 0) goto L_0x02bb
        L_0x02b7:
            if (r5 != 0) goto L_0x02bb
            if (r1 == 0) goto L_0x02ca
        L_0x02bb:
            X.65H r1 = X.C94454iF.A00(r4)
            X.72L r0 = r4.A03
            X.C94454iF.A01(r1, r4, r0)
            X.AnonymousClass6VZ.A06(r4)
            X.C109225Wt.A00(r4)
        L_0x02ca:
            if (r13 == 0) goto L_0x0024
            goto L_0x011f
        L_0x02ce:
            r1 = 0
            goto L_0x029b
        L_0x02d0:
            r4.A02 = r2
            goto L_0x028c
        L_0x02d3:
            r0 = 0
            goto L_0x0257
        L_0x02d5:
            r4.A03 = r1
            r1 = 0
            X.7n5 r0 = r4.A0D
            r0.setValue(r1)
            r12 = 1
            goto L_0x0232
        L_0x02e0:
            boolean r0 = r15 instanceof androidx.compose.foundation.layout.WrapContentElement
            if (r0 == 0) goto L_0x02f3
            androidx.compose.foundation.layout.WrapContentElement r15 = (androidx.compose.foundation.layout.WrapContentElement) r15
            r1 = r3
            X.4hz r1 = (X.C94304hz) r1
            java.lang.Integer r0 = r15.A00
            r1.A00 = r0
            X.03v r0 = r15.A01
            r1.A01 = r0
            goto L_0x0024
        L_0x02f3:
            boolean r0 = r15 instanceof androidx.compose.foundation.layout.UnspecifiedConstraintsElement
            if (r0 == 0) goto L_0x0306
            androidx.compose.foundation.layout.UnspecifiedConstraintsElement r15 = (androidx.compose.foundation.layout.UnspecifiedConstraintsElement) r15
            r1 = r3
            X.4hy r1 = (X.C94294hy) r1
            float r0 = r15.A01
            r1.A01 = r0
            float r0 = r15.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0306:
            boolean r0 = r15 instanceof androidx.compose.foundation.layout.SizeElement
            if (r0 == 0) goto L_0x0324
            androidx.compose.foundation.layout.SizeElement r15 = (androidx.compose.foundation.layout.SizeElement) r15
            r1 = r3
            X.4i1 r1 = (X.C94324i1) r1
            float r0 = r15.A03
            r1.A03 = r0
            float r0 = r15.A02
            r1.A02 = r0
            float r0 = r15.A01
            r1.A01 = r0
            float r0 = r15.A00
            r1.A00 = r0
            r0 = 1
            r1.A04 = r0
            goto L_0x0024
        L_0x0324:
            boolean r0 = r15 instanceof androidx.compose.foundation.layout.PaddingValuesElement
            if (r0 == 0) goto L_0x0333
            androidx.compose.foundation.layout.PaddingValuesElement r15 = (androidx.compose.foundation.layout.PaddingValuesElement) r15
            r1 = r3
            X.4hw r1 = (X.C94274hw) r1
            X.7b9 r0 = r15.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0333:
            boolean r0 = r15 instanceof androidx.compose.foundation.layout.PaddingElement
            if (r0 == 0) goto L_0x0351
            androidx.compose.foundation.layout.PaddingElement r15 = (androidx.compose.foundation.layout.PaddingElement) r15
            r1 = r3
            X.4i0 r1 = (X.C94314i0) r1
            float r0 = r15.A02
            r1.A02 = r0
            float r0 = r15.A03
            r1.A03 = r0
            float r0 = r15.A01
            r1.A01 = r0
            float r0 = r15.A00
            r1.A00 = r0
            r0 = 1
            r1.A04 = r0
            goto L_0x0024
        L_0x0351:
            boolean r0 = r15 instanceof androidx.compose.foundation.layout.HorizontalAlignElement
            if (r0 == 0) goto L_0x0360
            androidx.compose.foundation.layout.HorizontalAlignElement r15 = (androidx.compose.foundation.layout.HorizontalAlignElement) r15
            r1 = r3
            X.4i6 r1 = (X.C94374i6) r1
            X.7dq r0 = r15.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0360:
            boolean r0 = r15 instanceof androidx.compose.foundation.layout.FillElement
            if (r0 == 0) goto L_0x0373
            androidx.compose.foundation.layout.FillElement r15 = (androidx.compose.foundation.layout.FillElement) r15
            r1 = r3
            X.4hx r1 = (X.C94284hx) r1
            java.lang.Integer r0 = r15.A00
            r1.A01 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A00 = r0
            goto L_0x0024
        L_0x0373:
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollableElement
            if (r0 == 0) goto L_0x0416
            androidx.compose.foundation.gestures.ScrollableElement r15 = (androidx.compose.foundation.gestures.ScrollableElement) r15
            r10 = r3
            X.4ip r10 = (X.C94814ip) r10
            X.7lC r9 = r15.A04
            X.5RU r8 = r15.A03
            X.7ki r7 = r15.A00
            boolean r6 = r15.A06
            boolean r5 = r15.A07
            X.7dd r4 = r15.A02
            X.7mu r2 = r15.A05
            X.7mH r0 = r15.A01
            r16 = r0
            boolean r0 = r10.A05
            if (r0 == r6) goto L_0x039a
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r0 = r10.A0B
            r0.A00 = r6
            X.4hm r0 = r10.A09
            r0.A00 = r6
        L_0x039a:
            if (r4 != 0) goto L_0x0414
            X.6ec r11 = r10.A08
        L_0x039e:
            androidx.compose.foundation.gestures.ScrollingLogic r1 = r10.A0C
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = r10.A0D
            r1.A03 = r9
            r1.A02 = r8
            r1.A00 = r7
            r1.A05 = r5
            r1.A01 = r11
            r1.A04 = r0
            X.4io r0 = r10.A0A
            X.4gS r13 = r0.A00
            X.6eb r14 = r0.A01
            X.00S r12 = r0.A04
            X.08g r11 = androidx.compose.foundation.gestures.ScrollableKt.A05
            X.08g r1 = r0.A05
            X.02t r15 = androidx.compose.foundation.gestures.ScrollableKt.A04
            X.7b6 r0 = r13.A01
            boolean r0 = X.AnonymousClass00C.A0J(r0, r14)
            if (r0 != 0) goto L_0x0412
            r13.A01 = r14
            r14 = 1
        L_0x03c7:
            r13.A02 = r15
            X.5RU r0 = r13.A02
            if (r0 == r8) goto L_0x03d0
            r13.A02 = r8
            r14 = 1
        L_0x03d0:
            boolean r0 = r13.A05
            if (r0 == r6) goto L_0x03dc
            r13.A05 = r6
            if (r6 != 0) goto L_0x03db
            r13.A0G()
        L_0x03db:
            r14 = 1
        L_0x03dc:
            X.7mu r0 = r13.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 != 0) goto L_0x03e9
            r13.A0G()
            r13.A00 = r2
        L_0x03e9:
            r13.A01 = r12
            r13.A03 = r11
            r13.A04 = r1
            if (r14 == 0) goto L_0x03f6
            X.7nb r0 = r13.A08
            r0.BoX()
        L_0x03f6:
            X.4hv r1 = r10.A07
            r1.A02 = r8
            r1.A03 = r9
            r1.A06 = r5
            r0 = r16
            r1.A01 = r0
            r10.A03 = r9
            r10.A02 = r8
            r10.A00 = r7
            r10.A05 = r6
            r10.A06 = r5
            r10.A01 = r4
            r10.A04 = r2
            goto L_0x0024
        L_0x0412:
            r14 = 0
            goto L_0x03c7
        L_0x0414:
            r11 = r4
            goto L_0x039e
        L_0x0416:
            boolean r0 = r15 instanceof androidx.compose.foundation.HoverableElement
            if (r0 == 0) goto L_0x0430
            androidx.compose.foundation.HoverableElement r15 = (androidx.compose.foundation.HoverableElement) r15
            r2 = r3
            androidx.compose.foundation.HoverableNode r2 = (androidx.compose.foundation.HoverableNode) r2
            X.7mu r1 = r15.A00
            X.7mu r0 = r2.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 != 0) goto L_0x0024
            r2.BkO()
            r2.A00 = r1
            goto L_0x0024
        L_0x0430:
            boolean r0 = r15 instanceof androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            if (r0 != 0) goto L_0x0024
            boolean r0 = r15 instanceof androidx.compose.foundation.FocusableElement
            if (r0 == 0) goto L_0x0464
            androidx.compose.foundation.FocusableElement r15 = (androidx.compose.foundation.FocusableElement) r15
            r0 = r3
            X.4ir r0 = (X.C94834ir) r0
            X.7mu r5 = r15.A00
            X.4hg r4 = r0.A01
            X.7mu r0 = r4.A01
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)
            if (r0 != 0) goto L_0x0024
            X.7mu r2 = r4.A01
            if (r2 == 0) goto L_0x045d
            X.6ek r0 = r4.A00
            if (r0 == 0) goto L_0x045d
            X.6eo r1 = new X.6eo
            r1.<init>(r0)
            X.6et r2 = (X.C136726et) r2
            X.05J r0 = r2.A00
            r0.BwB(r1)
        L_0x045d:
            r0 = 0
            r4.A00 = r0
            r4.A01 = r5
            goto L_0x0024
        L_0x0464:
            boolean r0 = r15 instanceof androidx.compose.foundation.ClickableElement
            if (r0 == 0) goto L_0x04a7
            androidx.compose.foundation.ClickableElement r15 = (androidx.compose.foundation.ClickableElement) r15
            r7 = r3
            X.4gQ r7 = (X.C93354gQ) r7
            X.7mu r6 = r15.A00
            boolean r5 = r15.A04
            java.lang.String r4 = r15.A02
            X.68P r2 = r15.A01
            X.00S r1 = r15.A03
            X.7mu r0 = r7.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 != 0) goto L_0x0484
            r7.A0G()
            r7.A00 = r6
        L_0x0484:
            boolean r0 = r7.A03
            if (r0 == r5) goto L_0x048f
            if (r5 != 0) goto L_0x048d
            r7.A0G()
        L_0x048d:
            r7.A03 = r5
        L_0x048f:
            r7.A01 = r2
            r7.A02 = r1
            X.4iC r0 = r7.A01
            r0.A03 = r5
            r0.A01 = r4
            r0.A00 = r2
            r0.A02 = r1
            X.4gR r0 = r7.A00
            r0.A02 = r5
            r0.A01 = r1
            r0.A00 = r6
            goto L_0x0024
        L_0x04a7:
            androidx.compose.foundation.BackgroundElement r15 = (androidx.compose.foundation.BackgroundElement) r15
            r2 = r3
            X.4hs r2 = (X.C94234hs) r2
            long r0 = r15.A00
            r2.A00 = r0
            X.7dt r0 = r15.A01
            r2.A04 = r0
            goto L_0x0024
        L_0x04b6:
            boolean r0 = r3 instanceof X.C94384i8
            if (r0 == 0) goto L_0x04da
            r1 = r3
            X.4i8 r1 = (X.C94384i8) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x04c4
            X.C94384i8.A00(r1)
        L_0x04c4:
            r1.A00 = r15
            int r0 = X.AnonymousClass6X7.A00(r15)
            r1.A01 = r0
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0024
            r0 = 0
            X.C94384i8.A01(r1, r0)
            goto L_0x0024
        L_0x04d6:
            r0 = 1
            r3.A09 = r0
            return
        L_0x04da:
            java.lang.String r0 = "Unknown Modifier.Node type"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XQ.A05(X.7nE, X.7nE, X.6gq):void");
    }

    public static final void A06(C137856gq r2, AnonymousClass6XQ r3, C94894iy r4) {
        C94944jW r0;
        while (true) {
            r2 = r2.A04;
            if (r2 == null) {
                return;
            }
            if (r2 == C129596Hr.A00) {
                C137846gp A0A = r3.A07.A0A();
                if (A0A != null) {
                    r0 = A0A.A0R.A06;
                } else {
                    r0 = null;
                }
                r4.A06 = r0;
                r3.A04 = r4;
                return;
            } else if ((2 & r2.A01) == 0) {
                r2.A0E(r4);
            } else {
                return;
            }
        }
    }

    public final void A07() {
        for (C137856gq r1 = this.A02; r1 != null; r1 = r1.A02) {
            r1.A0C();
            if (r1.A07) {
                AnonymousClass6X7.A03(r1);
            }
            if (r1.A09) {
                AnonymousClass6X7.A04(r1);
            }
            r1.A07 = false;
            r1.A09 = false;
        }
    }

    public final void A08() {
        C94944jW r0;
        C94934jV r1;
        C94894iy r4 = this.A06;
        C137856gq r3 = this.A05;
        while (true) {
            r3 = r3.A04;
            if (r3 == null) {
                break;
            }
            C161777nS A032 = A03(r3);
            if (A032 != null) {
                C94894iy r12 = r3.A05;
                if (r12 != null) {
                    C94934jV r13 = (C94934jV) r12;
                    C161777nS r02 = r13.A00;
                    r13.A00 = A032;
                    r1 = r13;
                    if (r02 != r3) {
                        C160967ls r03 = r13.A07;
                        r1 = r13;
                        if (r03 != null) {
                            r03.invalidate();
                            r1 = r13;
                        }
                    }
                } else {
                    C94934jV r14 = new C94934jV(A032, this.A07);
                    r3.A0E(r14);
                    r1 = r14;
                }
                r4.A06 = r1;
                r1.A05 = r4;
                r4 = r1;
            } else {
                r3.A0E(r4);
            }
        }
        C137846gp A0A = this.A07.A0A();
        if (A0A != null) {
            r0 = A0A.A0R.A06;
        } else {
            r0 = null;
        }
        r4.A06 = r0;
        this.A04 = r4;
    }

    public AnonymousClass6XQ(C137846gp r2) {
        this.A07 = r2;
        C94944jW r0 = new C94944jW(r2);
        this.A06 = r0;
        this.A04 = r0;
        C94104he r02 = r0.A01;
        this.A05 = r02;
        this.A02 = r02;
    }

    public String toString() {
        StringBuilder A0p = C90484aE.A0p();
        C137856gq r3 = this.A02;
        C137856gq r2 = this.A05;
        if (r3 != r2) {
            while (true) {
                if (r3 != null && r3 != r2) {
                    A0p.append(String.valueOf(r3));
                    if (r3.A02 == r2) {
                        break;
                    }
                    A0p.append(",");
                    r3 = r3.A02;
                } else {
                    break;
                }
            }
            return C36381kD.A0y(A0p);
        }
        A0p.append("]");
        return C36381kD.A0y(A0p);
    }
}

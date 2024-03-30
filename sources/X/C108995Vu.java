package X;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.FocusableElement;
import androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;

/* renamed from: X.5Vu  reason: invalid class name and case insensitive filesystem */
public abstract class C108995Vu {
    public static final C161267mT A00(C157467da r10, C161437mu r11, C161267mT r12, AnonymousClass68P r13, String str, AnonymousClass00S r15, boolean z) {
        C006302t r3 = C112455dv.A00;
        C161267mT r2 = C161267mT.A00;
        C161267mT r6 = r2;
        C161437mu r7 = r11;
        C95014je r0 = new C95014je(r3, new C156577aC(r10, r11));
        boolean z2 = z;
        if (z) {
            r2 = new HoverableElement(r7);
        }
        C161267mT A00 = AnonymousClass5WL.A00(r0, r2);
        C154677Tc r4 = new C154677Tc(r7, z2);
        FocusableKt$FocusableInNonTouchModeElement$1 focusableKt$FocusableInNonTouchModeElement$1 = C113465fa.A00;
        if (z) {
            r6 = AnonymousClass5WL.A00(new FocusableElement(r7), FocusTargetNode$FocusTargetElement.A00);
        }
        C161267mT A002 = AnonymousClass5WL.A00(focusableKt$FocusableInNonTouchModeElement$1, r6);
        C95024jf r22 = new C95024jf(r4);
        C161267mT Bva = A00.Bva(r22).Bva(A002).Bva(r22.A00).Bva(new ClickableElement(r7, r13, str, r15, z2));
        C95024jf r23 = new C95024jf(r3);
        return r12.Bva(r23).Bva(Bva).Bva(r23.A00);
    }
}

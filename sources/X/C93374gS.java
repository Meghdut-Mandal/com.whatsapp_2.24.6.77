package X;

import androidx.compose.foundation.gestures.AbstractDraggableNode;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DraggableKt;

/* renamed from: X.4gS  reason: invalid class name and case insensitive filesystem */
public final class C93374gS extends AbstractDraggableNode {
    public C157487dc A00 = DraggableKt.A00;
    public C156877b6 A01;
    public AnonymousClass5RU A02;
    public final C136526eY A03 = new C136526eY(this);
    public final C158747iA A04;

    public C93374gS(C156877b6 r9, AnonymousClass5RU r10, C161437mu r11, AnonymousClass00S r12, C006302t r13, C019408g r14, C019408g r15, boolean z) {
        super(r11, r12, r13, r14, r15, z);
        C158747iA r0;
        this.A01 = r9;
        this.A02 = r10;
        if (r10 == AnonymousClass5RU.Vertical) {
            r0 = DragGestureDetectorKt.A02;
        } else {
            r0 = DragGestureDetectorKt.A01;
        }
        this.A04 = r0;
    }
}

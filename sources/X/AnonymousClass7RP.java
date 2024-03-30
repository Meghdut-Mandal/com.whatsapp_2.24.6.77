package X;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;

/* renamed from: X.7RP  reason: invalid class name */
public final class AnonymousClass7RP extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine $handlerCoroutine;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RP(SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) {
        super(1);
        this.$handlerCoroutine = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = this.$handlerCoroutine;
        AnonymousClass0AP r0 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01;
        if (r0 != null) {
            r0.B2T(th);
        }
        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01 = null;
        return AnonymousClass0AJ.A00;
    }
}

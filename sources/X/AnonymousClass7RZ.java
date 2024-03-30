package X;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7RZ  reason: invalid class name */
public final class AnonymousClass7RZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RZ(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Looper looper;
        AnonymousClass00S r3 = (AnonymousClass00S) obj;
        Handler handler = this.this$0.getHandler();
        if (handler != null) {
            looper = handler.getLooper();
        } else {
            looper = null;
        }
        if (looper == Looper.myLooper()) {
            r3.invoke();
        } else {
            Handler handler2 = this.this$0.getHandler();
            if (handler2 != null) {
                AnonymousClass759.A00(handler2, r3, 9);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}

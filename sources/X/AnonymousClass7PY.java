package X;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1;

/* renamed from: X.7PY  reason: invalid class name */
public final class AnonymousClass7PY extends AnonymousClass00R implements AnonymousClass00S {
    public static final AnonymousClass7PY A00 = new AnonymousClass7PY();

    public AnonymousClass7PY() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            C005502l r0 = C006702x.A00;
            choreographer = (Choreographer) C05700Qs.A00(AnonymousClass03K.A00, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1((C023509x) null));
        }
        C156727aR r1 = new C156727aR(C05450Pt.A00(Looper.getMainLooper()), choreographer);
        return C008803t.A02(r1, r1.A06);
    }
}

package X;

import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.78e  reason: invalid class name */
public final class AnonymousClass78e extends ThreadLocal {
    public /* bridge */ /* synthetic */ Object initialValue() {
        Choreographer instance = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            C156727aR r1 = new C156727aR(C05450Pt.A00(myLooper), instance);
            return C008803t.A02(r1, r1.A06);
        }
        throw AnonymousClass001.A09("no Looper on this thread");
    }
}

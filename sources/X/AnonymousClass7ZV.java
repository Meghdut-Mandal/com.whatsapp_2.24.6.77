package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.7ZV  reason: invalid class name */
public final class AnonymousClass7ZV extends AnonymousClass00R implements C009003v {
    public static final AnonymousClass7ZV A00 = new AnonymousClass7ZV();

    public AnonymousClass7ZV() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Matrix) obj2).set(((View) obj).getMatrix());
        return AnonymousClass0AJ.A00;
    }
}

package X;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.3Rb  reason: invalid class name and case insensitive filesystem */
public final class C65183Rb {
    public static final CoroutineExceptionHandler A02 = new C82363ya(CoroutineExceptionHandler.A00);
    public AnonymousClass040 A00;
    public final AsyncTypefaceCache A01;

    public C65183Rb(AsyncTypefaceCache asyncTypefaceCache, C005102h r5) {
        this.A01 = asyncTypefaceCache;
        this.A00 = C009403z.A02(A02.plus(C56062vg.A00).plus(r5).plus(new C007703h((C007403e) r5.get(C007403e.A00))));
    }

    public C65183Rb() {
        this(new AsyncTypefaceCache(), C008903u.A00);
    }
}

package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.6eg  reason: invalid class name and case insensitive filesystem */
public final class C136606eg implements C157507de {
    public final /* synthetic */ ScrollingLogic A00;
    public final /* synthetic */ C006302t A01;

    public C136606eg(ScrollingLogic scrollingLogic, C006302t r2) {
        this.A00 = scrollingLogic;
        this.A01 = r2;
    }

    public float BpR(float f) {
        ScrollingLogic scrollingLogic = this.A00;
        long j = ((C133206Xf) this.A01.invoke(new C133206Xf(scrollingLogic.A00(f)))).A00;
        if (scrollingLogic.A02 == AnonymousClass5RU.Horizontal) {
            return C133206Xf.A00(j);
        }
        return C133206Xf.A01(j);
    }
}

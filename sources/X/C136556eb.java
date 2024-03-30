package X;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.6eb  reason: invalid class name and case insensitive filesystem */
public final class C136556eb implements C157487dc, C156877b6 {
    public C157507de A00 = ScrollableKt.A00;
    public ScrollingLogic A01;

    public void B5w(float f) {
        ScrollingLogic scrollingLogic = this.A01;
        scrollingLogic.A01(this.A00, 1, scrollingLogic.A00(f));
    }

    public C136556eb(ScrollingLogic scrollingLogic) {
        this.A01 = scrollingLogic;
    }
}

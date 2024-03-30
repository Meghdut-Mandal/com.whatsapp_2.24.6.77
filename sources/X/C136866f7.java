package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.6f7  reason: invalid class name and case insensitive filesystem */
public final class C136866f7 implements C157537dh {
    public final /* synthetic */ C17500rW A00;

    public C136866f7(C17500rW r1) {
        this.A00 = r1;
    }

    public final Object B1w(C160787la r7, C023509x r8, AnonymousClass00S r9) {
        View view = (View) C109205Wr.A00(C131966Ro.A03, this.A00);
        long BOS = r7.BOS(C133206Xf.A03);
        AnonymousClass6QC r0 = (AnonymousClass6QC) r9.invoke();
        if (r0 != null) {
            AnonymousClass6QC A02 = r0.A02(BOS);
            view.requestRectangleOnScreen(new Rect((int) A02.A01, (int) A02.A03, (int) A02.A02, (int) A02.A00), false);
        }
        return AnonymousClass0AJ.A00;
    }
}

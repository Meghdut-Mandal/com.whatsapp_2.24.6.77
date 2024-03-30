package X;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.0E9  reason: invalid class name */
public final class AnonymousClass0E9 extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final C07650Ys A02;

    public AnonymousClass0E9(C07650Ys r1, int i, int i2) {
        this.A01 = i;
        this.A02 = r1;
        this.A00 = i2;
    }

    public void onClick(View view) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
        C07650Ys r0 = this.A02;
        r0.A02.performAction(this.A00, A07);
    }
}

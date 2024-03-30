package X;

import android.view.View;

/* renamed from: X.0Gx  reason: invalid class name */
public class AnonymousClass0Gx extends C09770cu {
    public boolean A00 = false;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass07J A02;

    public void BR6(View view) {
        this.A00 = true;
    }

    public AnonymousClass0Gx(AnonymousClass07J r2, int i) {
        this.A02 = r2;
        this.A01 = i;
    }

    public void BR7(View view) {
        if (!this.A00) {
            this.A02.A09.setVisibility(this.A01);
        }
    }

    public void BR9(View view) {
        this.A02.A09.setVisibility(0);
    }
}

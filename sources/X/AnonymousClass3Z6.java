package X;

import android.view.View;

/* renamed from: X.3Z6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Z6 implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3KZ A01;
    public final /* synthetic */ C70803fk A02;

    public /* synthetic */ AnonymousClass3Z6(AnonymousClass3KZ r1, C70803fk r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final boolean onLongClick(View view) {
        C70803fk r5 = this.A02;
        AnonymousClass3KZ r0 = this.A01;
        int i = this.A00;
        if (r0.A03) {
            C70803fk.A17(r5, 1);
            C70803fk.A0n(r5);
            r5.A4l.A08();
            r5.A4l.A09(false);
            return true;
        }
        C64263Nh.A00(r5.A5C, 2);
        r5.A2Q.A0C(2, i, 9);
        return true;
    }
}

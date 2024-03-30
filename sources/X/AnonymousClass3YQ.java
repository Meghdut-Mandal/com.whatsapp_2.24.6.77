package X;

import android.view.View;

/* renamed from: X.3YQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YQ implements View.OnClickListener {
    public final /* synthetic */ C33411fH A00;
    public final /* synthetic */ AnonymousClass11F A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;

    public /* synthetic */ AnonymousClass3YQ(C33411fH r1, AnonymousClass11F r2, Integer num, Long l) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = num;
        this.A03 = l;
    }

    public final void onClick(View view) {
        C33411fH r5 = this.A00;
        AnonymousClass11F r4 = this.A01;
        Integer num = this.A02;
        Long l = this.A03;
        r5.A05.A08(r4, num, false);
        if (l != null) {
            C36371kC.A1Q(r5.A08, r5, r4, l, 48);
        }
    }
}

package X;

import android.view.View;

/* renamed from: X.3YP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YP implements View.OnClickListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C41971y4 A02;
    public final /* synthetic */ C40841wC A03;

    public /* synthetic */ AnonymousClass3YP(C41971y4 r1, C40841wC r2, float f, int i) {
        this.A02 = r1;
        this.A00 = f;
        this.A03 = r2;
        this.A01 = i;
    }

    public final void onClick(View view) {
        C41971y4 r0 = this.A02;
        float f = this.A00;
        r0.A0H.postDelayed(new C81283wl((Object) this.A03, this.A01, 25), (long) f);
    }
}

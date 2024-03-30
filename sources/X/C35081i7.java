package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1i7  reason: invalid class name and case insensitive filesystem */
public final class C35081i7 extends AnonymousClass0D3 {
    public boolean A00;
    public final AnonymousClass17Y A01;
    public final C19600wD A02;
    public final C20810yC A03;
    public final AnonymousClass13J A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35081i7(View view, AnonymousClass17Y r4, C19600wD r5, C20810yC r6, AnonymousClass13J r7) {
        super(view);
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r5, 4);
        this.A03 = r6;
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
        if (!C20800yB.A01(C21000yV.A01, r6, 7104)) {
            A0B();
        }
    }

    public final void A0B() {
        if (!this.A00) {
            View view = this.A0H;
            C33511fU.A03((TextView) C012005e.A02(view, R.id.call_link_title));
            C012005e.A02(view, R.id.subtitle).setSelected(true);
            view.setOnClickListener(new C35161iF((Object) this, 26));
            C34081gQ.A02(view);
            this.A00 = true;
        }
    }
}

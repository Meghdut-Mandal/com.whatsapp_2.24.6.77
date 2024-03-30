package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.2HJ  reason: invalid class name */
public final class AnonymousClass2HJ extends C80183uz {
    public View A00;
    public final ViewGroup A01;
    public final C220412q A02;
    public final AnonymousClass141 A03;
    public final AnonymousClass1ZM A04;
    public final AnonymousClass190 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HJ(ViewGroup viewGroup, AnonymousClass4V7 r4, C220412q r5, AnonymousClass141 r6, AnonymousClass190 r7, AnonymousClass1ZM r8) {
        super(r4, 80);
        C36321k7.A19(r4, r6, viewGroup, r7);
        AnonymousClass00C.A0D(r5, 6);
        this.A03 = r6;
        this.A01 = viewGroup;
        this.A05 = r7;
        this.A02 = r5;
        this.A04 = r8;
    }

    public final void A0D() {
        View findViewById;
        TextView A0P;
        View view = this.A00;
        if (!(view == null || (A0P = C36391kE.A0P(view, R.id.pending_messages_text)) == null)) {
            A0P.setText(R.string.f12nameremoved);
        }
        View view2 = this.A00;
        if (!(view2 == null || (findViewById = view2.findViewById(R.id.pending_messages_dismiss)) == null)) {
            C66953Xy.A00(findViewById, this, 15);
        }
        View view3 = this.A00;
        if (view3 != null) {
            C66953Xy.A00(view3, this, 14);
        }
    }
}

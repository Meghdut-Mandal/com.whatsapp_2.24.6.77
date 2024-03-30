package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.2hB  reason: invalid class name and case insensitive filesystem */
public final class C48352hB extends C42581z3 {
    public WaTextView A00;

    public C48352hB(View view) {
        super(view);
        C36361kB.A0F(view, R.id.status_chevron).setVisibility(8);
        View findViewById = view.findViewById(R.id.title);
        WaTextView waTextView = (WaTextView) findViewById;
        waTextView.setTextSize(0, waTextView.getResources().getDimension(R.dimen.f7nameremoved));
        C33511fU.A03(waTextView);
        AnonymousClass00C.A08(findViewById);
        this.A00 = waTextView;
    }
}

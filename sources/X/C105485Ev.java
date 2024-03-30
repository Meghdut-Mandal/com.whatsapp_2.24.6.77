package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Ev  reason: invalid class name and case insensitive filesystem */
public final class C105485Ev extends C46482Xv {
    public final TextView A00;
    public final View A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        TextView textView;
        int i;
        AnonymousClass5EP r4 = (AnonymousClass5EP) obj;
        AnonymousClass00C.A0D(r4, 0);
        int i2 = r4.A00;
        if (i2 != 0) {
            textView = this.A00;
            if (i2 != 2) {
                C36391kE.A1K(textView);
                return;
            }
            i = R.string.f12nameremoved;
        } else {
            textView = this.A00;
            i = R.string.f12nameremoved;
        }
        textView.setText(i);
    }

    public C105485Ev(View view) {
        super(view);
        this.A01 = view;
        this.A00 = C36341k9.A0M(view, R.id.header);
    }
}

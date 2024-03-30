package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Eh  reason: invalid class name and case insensitive filesystem */
public class C105345Eh extends C46482Xv {
    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        View view = this.A0H;
        TextView textView = (TextView) view;
        String str = ((AnonymousClass5EO) obj).A00;
        if (TextUtils.isEmpty(str)) {
            textView.setText(R.string.f12nameremoved);
        } else {
            textView.setText(C36321k7.A0A(view.getContext(), str, R.string.f12nameremoved));
        }
    }

    public C105345Eh(View view) {
        super(view);
    }
}

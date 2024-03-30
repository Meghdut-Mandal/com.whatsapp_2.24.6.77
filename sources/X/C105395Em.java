package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5Em  reason: invalid class name and case insensitive filesystem */
public class C105395Em extends C46482Xv {
    public final WaTextView A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C105255Dy r5 = (C105255Dy) obj;
        String str = r5.A01;
        boolean isEmpty = TextUtils.isEmpty(str);
        WaTextView waTextView = this.A00;
        if (!isEmpty) {
            waTextView.setText(C36321k7.A0A(C36441kJ.A0F(this), str, R.string.f12nameremoved));
        } else {
            waTextView.setText(R.string.f12nameremoved);
        }
        this.A0H.setOnClickListener(r5.A00);
    }

    public C105395Em(View view) {
        super(view);
        this.A00 = C36401kF.A0Q(view, R.id.title);
        C36391kE.A0O(view, R.id.description).setText(R.string.f12nameremoved);
    }
}

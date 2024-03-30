package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1g4  reason: invalid class name and case insensitive filesystem */
public class C33871g4 extends C33851g2 {
    public void BwS() {
        String str;
        C202159l8 A02;
        C33641fh r3 = this.A02;
        if (r3.A04() && this.A00 == null) {
            this.A01.addView(A00());
        }
        View A00 = A00();
        ((TextEmojiLabel) C012005e.A02(A00, R.id.banner_title)).A0I(r3.A01(A00.getContext(), R.string.f12nameremoved));
        TextView textView = (TextView) C012005e.A02(A00, R.id.banner_image);
        if (!(r3 instanceof C33661fj) || (A02 = ((C33661fj) r3).A01.A02()) == null) {
            str = null;
        } else {
            str = ((AnonymousClass16V) A02.A02).A03;
        }
        textView.setText(str);
        C33571fa r4 = this.A01;
        r4.setBackgroundResource(C224514j.A00(r4.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        r4.setOnClickListener(new C35161iF((Object) this, 16));
        C012005e.A02(A00, R.id.cancel).setOnClickListener(new C35161iF((Object) this, 17));
        A00.setVisibility(0);
        r4.A01(16, 1);
    }

    public void A01() {
        super.A01();
        this.A01.A01(16, 3);
    }

    public C33871g4(C33571fa r1, C33661fj r2) {
        super(r1, r2);
    }
}

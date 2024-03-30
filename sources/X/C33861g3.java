package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1g3  reason: invalid class name and case insensitive filesystem */
public class C33861g3 extends C33851g2 {
    public void BwS() {
        if (this.A02.A04() && this.A00 == null) {
            this.A01.addView(A00());
        }
        View A00 = A00();
        C33571fa r5 = this.A01;
        ((TextEmojiLabel) C012005e.A02(A00, R.id.banner_title)).A0I(AnonymousClass14B.A01(r5.getContext(), new Object[]{AnonymousClass14B.A03(A00.getContext(), C224514j.A00(A00.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved))}, R.string.f12nameremoved));
        r5.setBackgroundResource(C224514j.A00(r5.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        r5.setOnClickListener(new C35161iF((Object) this, 14));
        C012005e.A02(A00, R.id.cancel).setOnClickListener(new C35161iF((Object) this, 15));
        A00.setVisibility(0);
        r5.A01(23, 1);
    }

    public C33861g3(C33571fa r1, C33641fh r2) {
        super(r1, r2);
    }
}

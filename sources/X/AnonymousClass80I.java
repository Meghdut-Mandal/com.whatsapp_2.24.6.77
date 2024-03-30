package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.80I  reason: invalid class name */
public abstract class AnonymousClass80I extends AnonymousClass0D3 {
    public void A0B() {
    }

    public void A0C(AnonymousClass9EL r7) {
        if (this instanceof AnonymousClass8WT) {
            AnonymousClass00C.A0D((Object) null, 0);
            throw AnonymousClass001.A0A("title");
        } else if (this instanceof AnonymousClass8WU) {
            AnonymousClass8WU r5 = (AnonymousClass8WU) this;
            AnonymousClass8WO r72 = (AnonymousClass8WO) r7;
            AnonymousClass00C.A0D(r72, 0);
            String A0w = C36411kG.A0w(C36341k9.A0F(r5.A0H), r72.A01, AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            AnonymousClass00C.A08(A0w);
            r5.A01.setText(A0w);
            r5.A00.setText(r72.A00);
        }
    }

    public AnonymousClass80I(View view) {
        super(view);
    }
}

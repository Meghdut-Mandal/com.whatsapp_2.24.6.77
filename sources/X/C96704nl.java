package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4nl  reason: invalid class name and case insensitive filesystem */
public final class C96704nl extends AnonymousClass0D3 {
    public final WaTextView A00;
    public final WaTextView A01;

    public C96704nl(View view, AnonymousClass7d0 r4) {
        super(view);
        this.A01 = C36341k9.A0Q(view, R.id.title);
        this.A00 = C36341k9.A0Q(view, R.id.cta_line);
        View A02 = C012005e.A02(view, R.id.error_container);
        if (r4 != null) {
            AnonymousClass3Y5.A00(A02, r4, 8);
        }
    }
}

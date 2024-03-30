package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.1os  reason: invalid class name and case insensitive filesystem */
public final class C38451os extends LinearLayout {
    public final WaTextView A00 = C36341k9.A0Q(this, R.id.event_response_header_count);
    public final WaTextView A01;

    public C38451os(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.f9nameremoved, this);
        C36321k7.A0N(this);
        WaTextView A0Q = C36341k9.A0Q(this, R.id.event_response_header_text);
        this.A01 = A0Q;
        C33511fU.A03(A0Q);
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.1nk  reason: invalid class name and case insensitive filesystem */
public final class C38121nk extends FrameLayout {
    public final WaTextView A00;

    public C38121nk(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.f9nameremoved, this);
        WaTextView A0Q = C36341k9.A0Q(this, R.id.event_header_text);
        this.A00 = A0Q;
        C33511fU.A03(A0Q);
    }
}

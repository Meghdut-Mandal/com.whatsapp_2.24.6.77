package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.2hG  reason: invalid class name and case insensitive filesystem */
public final class C48402hG extends C42581z3 {
    public WaTextView A00;
    public WaTextView A01;
    public UpdatesFragment A02;

    public C48402hG(View view, UpdatesFragment updatesFragment) {
        super(view);
        this.A02 = updatesFragment;
        this.A01 = C36411kG.A0Z(view, R.id.title);
        WaTextView A0Z = C36411kG.A0Z(view, R.id.cta_line);
        if (A0Z != null) {
            C33511fU.A03(A0Z);
        } else {
            A0Z = null;
        }
        this.A00 = A0Z;
    }
}

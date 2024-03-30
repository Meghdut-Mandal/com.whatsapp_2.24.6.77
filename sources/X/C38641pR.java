package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1pR  reason: invalid class name and case insensitive filesystem */
public class C38641pR extends LinearLayout implements C18700tb {
    public ProgressBar A00;
    public TextView A01;
    public C63193Jc A02;
    public AnonymousClass1QZ A03;
    public boolean A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public C38641pR(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            this.A02 = C36371kC.A0V(C36391kE.A0W(generatedComponent()));
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        int A06 = C36441kJ.A06(context.getResources(), R.dimen.f7nameremoved, C65123Qv.A00(context));
        setPadding(A06, 0, A06, 0);
        this.A01 = C36391kE.A0O(this, R.id.history_sync_progress_text);
        this.A00 = (ProgressBar) C012005e.A02(this, R.id.history_sync_progress_loader);
        this.A01.setTextSize(this.A02.A01(getResources()));
    }
}

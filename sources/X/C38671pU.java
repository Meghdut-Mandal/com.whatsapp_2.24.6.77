package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1pU  reason: invalid class name and case insensitive filesystem */
public class C38671pU extends LinearLayout implements C18700tb {
    public C19730wQ A00;
    public AnonymousClass1T1 A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public final TextEmojiLabel A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public C38671pU(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A00 = C36351kA.A0N(A0W);
            this.A01 = (AnonymousClass1T1) A0W.A8V.get();
        }
        setOrientation(0);
        C36371kC.A1D(this);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A04 = C36401kF.A0O(this, R.id.community_activity_preview);
    }
}

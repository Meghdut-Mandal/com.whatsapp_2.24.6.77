package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.community.CommunityStackView;

/* renamed from: X.4ew  reason: invalid class name and case insensitive filesystem */
public abstract class C92894ew extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C92894ew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            CommunityStackView communityStackView = (CommunityStackView) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            communityStackView.A02 = C36341k9.A0T(r1);
            communityStackView.A01 = C36361kB.A0V(r1);
        }
    }
}

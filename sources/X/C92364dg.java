package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.mediacomposer.VideoTimelineView;

/* renamed from: X.4dg  reason: invalid class name and case insensitive filesystem */
public abstract class C92364dg extends View implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public static void A00(VideoTimelineView videoTimelineView) {
        videoTimelineView.A00 = 1.0f;
        videoTimelineView.A03 = -1;
        videoTimelineView.A01 = 12.0f;
        videoTimelineView.A06 = -1;
        videoTimelineView.A02 = 12.0f;
        videoTimelineView.A07 = -1;
        videoTimelineView.A04 = 855638016;
    }

    public void A05() {
        if (!this.A01) {
            this.A01 = true;
            VideoTimelineView videoTimelineView = (VideoTimelineView) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            videoTimelineView.A0H = C36341k9.A0Z(r1);
            videoTimelineView.A0C = C36341k9.A0T(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C92364dg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
    }

    public C92364dg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A05();
    }

    public C92364dg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }

    public C92364dg(Context context) {
        super(context);
        A05();
    }
}

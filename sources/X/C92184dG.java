package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.4dG  reason: invalid class name and case insensitive filesystem */
public abstract class C92184dG extends SurfaceView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public static C163617qU A00(VideoSurfaceView videoSurfaceView) {
        videoSurfaceView.A01 = 0;
        videoSurfaceView.A05 = 0;
        videoSurfaceView.A0C = null;
        videoSurfaceView.A0B = null;
        videoSurfaceView.A02 = -1;
        return new C163617qU(videoSurfaceView, 0);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C92184dG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public C92184dG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public C92184dG(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}

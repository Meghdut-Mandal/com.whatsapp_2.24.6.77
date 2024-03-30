package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.4WF  reason: invalid class name */
public class AnonymousClass4WF extends PhotoView {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WF(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        MediaViewBaseFragment mediaViewBaseFragment;
        boolean z;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(motionEvent, 0);
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                z = !AnonymousClass000.A1Q((this.A00 > this.A04 ? 1 : (this.A00 == this.A04 ? 0 : -1)));
                break;
            case 1:
                mediaViewBaseFragment = ((C75703nf) this.A00).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                break;
        }
        z = AnonymousClass000.A1P((this.A00 > this.A04 ? 1 : (this.A00 == this.A04 ? 0 : -1)));
        mediaViewBaseFragment.A1o(z, true);
        return super.onDoubleTap(motionEvent);
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        MediaViewBaseFragment mediaViewBaseFragment;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(scaleGestureDetector, 0);
                ((MediaViewBaseFragment) this.A00).A1o(false, true);
                break;
            case 1:
                mediaViewBaseFragment = ((C75703nf) this.A00).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                break;
        }
        mediaViewBaseFragment.A1o(false, true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        MediaViewBaseFragment mediaViewBaseFragment;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(scaleGestureDetector, 0);
                break;
            case 1:
                super.onScaleEnd(scaleGestureDetector);
                mediaViewBaseFragment = ((C75703nf) this.A00).A00;
                break;
        }
        super.onScaleEnd(scaleGestureDetector);
        mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
        boolean z = false;
        if (this.A00 <= this.A04) {
            z = true;
        }
        mediaViewBaseFragment.A1o(z, true);
    }
}

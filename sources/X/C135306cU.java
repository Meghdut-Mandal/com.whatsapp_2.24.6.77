package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6cU  reason: invalid class name and case insensitive filesystem */
public class C135306cU implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ ImageComposerFragment A00;
    public final /* synthetic */ MediaComposerFragment A01;

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public C135306cU(ImageComposerFragment imageComposerFragment) {
        this.A00 = imageComposerFragment;
        this.A01 = imageComposerFragment;
    }

    public void A00() {
        Uri uri;
        C160827le A1a;
        C131646Px r2;
        Uri uri2;
        ImageComposerFragment imageComposerFragment = this.A00;
        C160827le A1a2 = imageComposerFragment.A1a();
        if (!(A1a2 == null || (uri2 = imageComposerFragment.A00) == null)) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1a2;
            mediaComposerActivity.A1r.A03(uri2).A0E(imageComposerFragment.A05.A01);
            if (mediaComposerActivity.A0s.A0C()) {
                MediaComposerActivity.A0M(uri2, mediaComposerActivity);
                C146636vv.A00(mediaComposerActivity);
            }
        }
        if (imageComposerFragment.A12()) {
            if (imageComposerFragment.A0h() != null && imageComposerFragment.A06.getDrawable() == null) {
                imageComposerFragment.A0h().A1q();
            }
            imageComposerFragment.A06.A08(imageComposerFragment.A05.A03);
            C146806wC r7 = imageComposerFragment.A0E;
            if (r7 != null) {
                AnonymousClass6L5 r22 = r7.A0U;
                r22.A02 = null;
                r22.A03 = null;
                if (r7.A07) {
                    Iterator it = r7.A0T.A01().iterator();
                    while (it.hasNext()) {
                        ((AnonymousClass5Ci) it.next()).A0P(r22);
                    }
                    r7.A07 = false;
                }
                AnonymousClass6V4 r6 = r7.A0M;
                Bitmap bitmap = r6.A05;
                if (bitmap != null) {
                    bitmap.eraseColor(0);
                }
                AnonymousClass6FV r0 = r6.A0G;
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it2 = r0.A04.iterator();
                while (it2.hasNext()) {
                    C129196Ft A0N = C90524aI.A0N(it2);
                    if ((A0N instanceof AnonymousClass5Ci) && (((AnonymousClass5Ci) A0N).A03 instanceof C104975Ct)) {
                        A0I.add(A0N);
                    }
                }
                if (!A0I.isEmpty()) {
                    AnonymousClass6V4.A01(r6, true);
                    Iterator it3 = A0I.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass5Ci r4 = (AnonymousClass5Ci) it3.next();
                        if (r4.A03 instanceof C104975Ct) {
                            Bitmap bitmap2 = r6.A05;
                            PointF pointF = r6.A0D;
                            int i = r6.A00;
                            C36331k8.A1I(bitmap2, pointF);
                            r4.A01 = bitmap2;
                            r4.A02 = pointF;
                            r4.A00 = i;
                        }
                        r4.A05 = false;
                        Bitmap bitmap3 = r4.A01;
                        if (!(bitmap3 == null || (r2 = r4.A03) == null)) {
                            r2.A03(bitmap3, r4.A02, r4.A00);
                            Canvas canvas = r2.A00;
                            if (canvas != null) {
                                r2.A04(canvas);
                            }
                        }
                    }
                }
                r7.A0N.invalidate();
            }
            Bitmap bitmap4 = imageComposerFragment.A05.A03;
            if (imageComposerFragment.A0E != null && bitmap4 != null && (uri = imageComposerFragment.A00) != null && (A1a = imageComposerFragment.A1a()) != null) {
                Rect A04 = C132366Tg.A01(uri, A1a).A04();
                RectF A0L = C90514aH.A0L((float) bitmap4.getWidth(), bitmap4.getHeight());
                if (A04 != null) {
                    ImageComposerFragment.A07(A04, A0L, imageComposerFragment, 0, -1);
                }
            }
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ImageComposerFragment imageComposerFragment = this.A00;
        ImagePreviewContentLayout imagePreviewContentLayout = imageComposerFragment.A04;
        AnonymousClass00C.A0D(motionEvent, 0);
        boolean onDoubleTap = imagePreviewContentLayout.A02.onDoubleTap(motionEvent);
        if (onDoubleTap) {
            ImageComposerFragment.A0A(imageComposerFragment, false, true);
        }
        return onDoubleTap;
    }
}

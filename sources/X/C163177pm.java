package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.7pm  reason: invalid class name and case insensitive filesystem */
public class C163177pm implements AnonymousClass4U2 {
    public Object A00;
    public final int A01;

    public C163177pm(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bi2(Bitmap bitmap, boolean z) {
        if (this.A01 != 0) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
            AnonymousClass00C.A0D(bitmap, 1);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("videoview/setVideoDimensions: ");
            A0u.append(width);
            C36321k7.A1T("x", A0u, height);
            videoSurfaceView.A07 = width;
            videoSurfaceView.A06 = height;
            videoSurfaceView.setBackground(new BitmapDrawable(videoSurfaceView.getResources(), bitmap));
            return;
        }
        ((ImageComposerFragment) this.A00).A00 = bitmap;
    }

    public /* synthetic */ void B1h() {
    }

    public /* synthetic */ void BXH() {
    }
}

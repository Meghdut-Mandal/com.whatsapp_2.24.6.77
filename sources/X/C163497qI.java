package X;

import com.whatsapp.R;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.VideoTimelineView;

/* renamed from: X.7qI  reason: invalid class name and case insensitive filesystem */
public class C163497qI implements AnonymousClass4SL {
    public Object A00;
    public final int A01;

    public C163497qI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BU7(C65083Qq r7) {
        if (this.A01 != 0) {
            AnonymousClass5NK r5 = (AnonymousClass5NK) this.A00;
            r5.A08();
            r7.A0A();
            if (r7 instanceof AnonymousClass5NQ) {
                r5.A0P = true;
                r5.A0h.setImageResource(R.drawable.ic_pip_replay);
                r5.A0i.setImageResource(R.drawable.ic_video_restart);
            } else {
                r7.A0L(0);
                AnonymousClass5NK.A05(r5);
            }
            r5.A0l.setProgress(0);
            r5.A0m.setProgress(0);
            r5.A0n.setText(C111825cu.A00(r5.A0u, r5.A0v, 0));
            r5.A09(500);
            if (!r5.A0B()) {
                r5.A0D();
            }
            C124685yd r2 = r5.A0r;
            if (r2 != null) {
                C128896Ea r1 = r2.A09;
                if (r1.A01) {
                    r1.A00();
                }
                r2.A03 = true;
                return;
            }
            return;
        }
        VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A00;
        videoComposerFragment.A04 = C90474aD.A0E(videoComposerFragment);
        VideoTimelineView videoTimelineView = videoComposerFragment.A0G;
        if (videoTimelineView != null) {
            videoTimelineView.invalidate();
        }
        VideoComposerFragment.A07(videoComposerFragment.A07, 200);
        if (videoComposerFragment.A0Q) {
            VideoComposerFragment.A09(videoComposerFragment);
        }
    }
}

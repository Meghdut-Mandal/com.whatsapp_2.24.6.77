package X;

import android.net.Uri;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.VideoTimelineView;

/* renamed from: X.6vt  reason: invalid class name and case insensitive filesystem */
public final class C146616vt implements C158417gt {
    public final /* synthetic */ VideoComposerFragment A00;

    public C146616vt(VideoComposerFragment videoComposerFragment) {
        this.A00 = videoComposerFragment;
    }

    public void Bj8(VideoTimelineView videoTimelineView, int i, long j, long j2) {
        long j3 = j2;
        VideoComposerFragment videoComposerFragment = this.A00;
        C65083Qq r0 = videoComposerFragment.A0L;
        if (r0 != null && r0.A0X()) {
            videoComposerFragment.A1l();
        }
        long j4 = j;
        videoComposerFragment.A05 = j4;
        videoComposerFragment.A06 = j3;
        long j5 = 0;
        if (j - 200 <= 0 && j2 + 200 >= C90474aD.A0E(videoComposerFragment)) {
            j3 = 0;
        } else if (j2 - j < 1000) {
            j3 = j + 1000;
            long A0E = C90474aD.A0E(videoComposerFragment);
            if (j3 > A0E) {
                j3 = A0E;
            }
            long j6 = j3 - 1000;
            long j7 = 0;
            if (0 < j6) {
                j7 = j6;
            }
            j5 = j7;
        } else {
            j5 = j4;
        }
        C160827le A1a = videoComposerFragment.A1a();
        if (A1a != null) {
            Uri uri = videoComposerFragment.A00;
            if (uri != null) {
                A1a.Bsc(uri, j5, j3);
            } else {
                throw C36381kD.A0l();
            }
        }
        C65083Qq r3 = videoComposerFragment.A0L;
        if (r3 != null) {
            r3.A0L((int) j4);
        }
        videoComposerFragment.A1e();
        VideoComposerFragment.A08(videoComposerFragment);
        if (videoComposerFragment.A00 == 3) {
            VideoComposerFragment.A03(videoComposerFragment);
        } else {
            VideoComposerFragment.A05(videoComposerFragment);
        }
    }
}

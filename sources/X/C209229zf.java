package X;

import android.media.MediaCodec;
import android.os.HandlerThread;

/* renamed from: X.9zf  reason: invalid class name and case insensitive filesystem */
public final class C209229zf implements AnonymousClass7eI {
    public final C22897Ay9 A00;
    public final C22897Ay9 A01;
    public final boolean A02;

    public C209229zf(boolean z) {
        C203769oq r2 = new C203769oq(0);
        C203769oq r0 = new C203769oq(1);
        this.A00 = r2;
        this.A01 = r0;
        this.A02 = z;
    }

    public static /* synthetic */ HandlerThread A00() {
        return new HandlerThread(AnonymousClass000.A0q("Video", C90524aI.A0i("ExoPlayer:MediaCodecAsyncAdapter:")));
    }

    public static /* synthetic */ HandlerThread A01() {
        return new HandlerThread(AnonymousClass000.A0q("Video", C90524aI.A0i("ExoPlayer:MediaCodecQueueingThread:")));
    }

    public C209249zh A02(String str) {
        try {
            C196289Yq.A01(AnonymousClass000.A0p("createCodec:", str, AnonymousClass000.A0u()));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            try {
                C209249zh r1 = new C209249zh(createByCodecName, (HandlerThread) this.A00.get(), (HandlerThread) this.A01.get(), this.A02);
                try {
                    C196289Yq.A00();
                    return r1;
                } catch (Exception e) {
                    r1.release();
                    throw e;
                }
            } catch (Exception e2) {
                if (createByCodecName != null) {
                    createByCodecName.release();
                }
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public C23079B3l B4L(String str, boolean z) {
        throw null;
    }
}

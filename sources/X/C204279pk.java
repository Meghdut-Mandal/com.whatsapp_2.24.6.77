package X;

import android.media.MediaCodec;

/* renamed from: X.9pk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204279pk implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C209249zh A00;
    public final /* synthetic */ AnonymousClass9P8 A01;

    public /* synthetic */ C204279pk(C209249zh r1, AnonymousClass9P8 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.A00.A01(this.A01);
    }
}

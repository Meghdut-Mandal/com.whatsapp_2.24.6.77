package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.9zh  reason: invalid class name and case insensitive filesystem */
public final class C209249zh implements C23079B3l {
    public int A00 = 0;
    public boolean A01;
    public final MediaCodec A02;
    public final C202139l6 A03;
    public final C165857uG A04;
    public final boolean A05;

    public void B3R(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Object obj, int i) {
        C165857uG r0 = this.A04;
        MediaCodec mediaCodec = this.A02;
        r0.A02(mediaCodec);
        C196289Yq.A01("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        C196289Yq.A00();
        C202139l6 r3 = this.A03;
        if (!r3.A01) {
            HandlerThread handlerThread = r3.A03;
            handlerThread.start();
            r3.A00 = new C23133B6o(handlerThread.getLooper(), r3, 2);
            r3.A01 = true;
        }
    }

    public void BnR(int i, boolean z) {
        this.A02.releaseOutputBuffer(i, false);
    }

    public void release() {
        try {
            if (this.A00 == 1) {
                C202139l6 r1 = this.A03;
                if (r1.A01) {
                    r1.A02();
                    r1.A03.quit();
                }
                r1.A01 = false;
                C165857uG r2 = this.A04;
                synchronized (r2.A09) {
                    r2.A05 = true;
                    r2.A07.quit();
                    C165857uG.A00(r2);
                }
            }
            this.A00 = 2;
            if (!this.A01) {
                this.A02.release();
                this.A01 = true;
            }
        } catch (Throwable th) {
            if (!this.A01) {
                this.A02.release();
                this.A01 = true;
            }
            throw th;
        }
    }

    private void A00() {
        if (this.A05) {
            try {
                C202139l6.A01(this.A03);
            } catch (InterruptedException e) {
                C90484aE.A0z();
                throw new IllegalStateException(e);
            }
        }
    }

    public int B5G() {
        return this.A02.dequeueInputBuffer(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int B5J(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            X.7uG r5 = r9.A04
            java.lang.Object r1 = r5.A09
            monitor-enter(r1)
            long r6 = r5.A00     // Catch:{ all -> 0x006a }
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0067
            boolean r0 = r5.A05     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0067
            java.lang.IllegalStateException r2 = r5.A04     // Catch:{ all -> 0x006a }
            if (r2 != 0) goto L_0x005f
            android.media.MediaCodec$CodecException r2 = r5.A01     // Catch:{ all -> 0x006a }
            if (r2 != 0) goto L_0x0063
            X.9S1 r6 = r5.A08     // Catch:{ all -> 0x006a }
            int r4 = r6.A01     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0067
            int[] r2 = r6.A04     // Catch:{ all -> 0x006a }
            int r0 = r6.A00     // Catch:{ all -> 0x006a }
            r2 = r2[r0]     // Catch:{ all -> 0x006a }
            int r3 = r0 + 1
            int r0 = r6.A03     // Catch:{ all -> 0x006a }
            r3 = r3 & r0
            r6.A00 = r3     // Catch:{ all -> 0x006a }
            int r0 = r4 + -1
            r6.A01 = r0     // Catch:{ all -> 0x006a }
            if (r2 < 0) goto L_0x0050
            android.media.MediaFormat r0 = r5.A02     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x004b
            java.util.ArrayDeque r0 = r5.A0A     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x006a }
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch:{ all -> 0x006a }
            int r4 = r0.offset     // Catch:{ all -> 0x006a }
            int r5 = r0.size     // Catch:{ all -> 0x006a }
            long r6 = r0.presentationTimeUs     // Catch:{ all -> 0x006a }
            int r8 = r0.flags     // Catch:{ all -> 0x006a }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x006a }
            goto L_0x005d
        L_0x004b:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x0050:
            r0 = -2
            if (r2 != r0) goto L_0x005d
            java.util.ArrayDeque r0 = r5.A0B     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x006a }
            android.media.MediaFormat r0 = (android.media.MediaFormat) r0     // Catch:{ all -> 0x006a }
            r5.A02 = r0     // Catch:{ all -> 0x006a }
        L_0x005d:
            monitor-exit(r1)     // Catch:{ all -> 0x006a }
            return r2
        L_0x005f:
            r0 = 0
            r5.A04 = r0     // Catch:{ all -> 0x006a }
            goto L_0x0066
        L_0x0063:
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x006a }
        L_0x0066:
            throw r2     // Catch:{ all -> 0x006a }
        L_0x0067:
            monitor-exit(r1)     // Catch:{ all -> 0x006a }
            r2 = -1
            return r2
        L_0x006a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209249zh.B5J(android.media.MediaCodec$BufferInfo):int");
    }

    public ByteBuffer BCk(int i) {
        return this.A02.getInputBuffer(i);
    }

    public ByteBuffer BEn(int i) {
        return this.A02.getOutputBuffer(i);
    }

    public MediaFormat BEp() {
        MediaFormat mediaFormat;
        C165857uG r0 = this.A04;
        synchronized (r0.A09) {
            mediaFormat = r0.A02;
            if (mediaFormat == null) {
                throw C165617ti.A0V();
            }
        }
        return mediaFormat;
    }

    public void Bmh(int i, int i2, int i3, long j, int i4) {
        C202139l6 r3 = this.A03;
        Throwable th = (Throwable) r3.A05.getAndSet((Object) null);
        if (th == null) {
            AnonymousClass9ME A002 = C202139l6.A00();
            A002.A01 = i;
            A002.A02 = i3;
            A002.A03 = j;
            A002.A00 = i4;
            C165577te.A0w(r3.A00, A002, 0);
            return;
        }
        throw th;
    }

    public void Bmj(AnonymousClass9OC r2, int i, int i2, int i3, long j) {
        this.A03.A03(r2, i, j);
    }

    public void BnQ(int i, long j) {
        this.A02.releaseOutputBuffer(i, j);
    }

    public void flush() {
        this.A03.A02();
        MediaCodec mediaCodec = this.A02;
        mediaCodec.flush();
        C165857uG r5 = this.A04;
        synchronized (r5.A09) {
            r5.A00++;
            r5.A03.post(new AnonymousClass759((Object) r5, 34));
        }
        mediaCodec.start();
    }

    public void reset() {
        this.A02.reset();
    }

    public void start() {
        C196289Yq.A01("startCodec");
        this.A02.start();
        C196289Yq.A00();
        this.A00 = 1;
    }

    public void stop() {
        this.A02.stop();
    }

    public C209249zh(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.A02 = mediaCodec;
        this.A04 = new C165857uG(handlerThread);
        this.A03 = new C202139l6(mediaCodec, handlerThread2);
        this.A05 = z;
    }

    public void BrM(Handler handler, AnonymousClass9P8 r4) {
        A00();
        this.A02.setOnFrameRenderedListener(new C204279pk(this, r4), handler);
    }

    public void BrS(Surface surface) {
        A00();
        this.A02.setOutputSurface(surface);
    }

    public void Bsi(int i) {
        A00();
        this.A02.setVideoScalingMode(i);
    }

    public /* synthetic */ void A01(AnonymousClass9P8 r1) {
        r1.A00();
    }
}

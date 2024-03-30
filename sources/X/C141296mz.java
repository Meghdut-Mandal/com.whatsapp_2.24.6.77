package X;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6mz  reason: invalid class name and case insensitive filesystem */
public class C141296mz implements C161017ly {
    public final /* synthetic */ C141316n2 A00;

    public void B0o(int i) {
    }

    public void Bm7(Context context, AnonymousClass65N r3, AnonymousClass6OY r4, C109695Yo r5, AnonymousClass65W r6, int i) {
    }

    public void Bo7(long j) {
    }

    public void flush() {
    }

    public C141296mz(C141316n2 r1) {
        this.A00 = r1;
    }

    public void B5j(long j) {
        C141316n2 r2 = this.A00;
        C141206mq r1 = r2.A01;
        if (r1 != null) {
            r1.A00.presentationTimeUs = j;
            r2.A05.offer(r1);
            r2.A01 = null;
        }
    }

    public MediaFormat BEp() {
        try {
            this.A00.A03.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.A00.A00;
    }

    public void BnS(C141206mq r2) {
        LinkedBlockingQueue linkedBlockingQueue;
        if (r2.A02 >= 0 && (linkedBlockingQueue = this.A00.A04) != null) {
            linkedBlockingQueue.offer(r2);
        }
    }

    public void BuA() {
        C141206mq r2 = new C141206mq(0, (ByteBuffer) null, new MediaCodec.BufferInfo());
        r2.BqJ(0, 0, 0, 4);
        this.A00.A05.offer(r2);
    }

    public void finish() {
        this.A00.A05.clear();
    }

    public C141206mq B5I(long j) {
        C141316n2 r6 = this.A00;
        if (r6.A08) {
            r6.A08 = false;
            C141206mq r0 = new C141206mq(-1, (ByteBuffer) null, new MediaCodec.BufferInfo());
            r0.A01 = true;
            return r0;
        }
        if (!r6.A07) {
            r6.A07 = true;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = r6.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0I();
                r6.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            C141206mq r02 = new C141206mq(0, allocateDirect, new MediaCodec.BufferInfo());
            if (C109675Ym.A00(r6.A00, r02)) {
                return r02;
            }
        }
        return (C141206mq) r6.A05.poll(250000, TimeUnit.MICROSECONDS);
    }

    public String BBW() {
        return "VideoTranscoderPassThrough";
    }

    public int BEt() {
        MediaFormat BEp = BEp();
        String str = "rotation-degrees";
        if (!BEp.containsKey(str)) {
            str = "rotation";
            if (!BEp.containsKey(str)) {
                return 0;
            }
        }
        return BEp.getInteger(str);
    }
}

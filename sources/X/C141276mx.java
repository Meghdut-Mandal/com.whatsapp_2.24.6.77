package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6mx  reason: invalid class name and case insensitive filesystem */
public class C141276mx implements C160917ln {
    public boolean A00;
    public final /* synthetic */ C141316n2 A01;

    public void Bwa(int i, Bitmap bitmap) {
    }

    public C141276mx(C141316n2 r1) {
        this.A01 = r1;
    }

    public long B59(long j) {
        C141316n2 r5 = this.A01;
        C141206mq r1 = r5.A01;
        if (r1 != null) {
            r5.A04.offer(r1);
            r5.A01 = null;
        }
        C141206mq r4 = (C141206mq) r5.A06.poll();
        r5.A01 = r4;
        if (r4 != null) {
            MediaCodec.BufferInfo bufferInfo = r4.A00;
            if (bufferInfo == null || (bufferInfo.flags & 4) == 0) {
                return bufferInfo.presentationTimeUs;
            }
            this.A00 = true;
            r5.A04.offer(r4);
            r5.A01 = null;
        }
        return -1;
    }

    public C141206mq B5H(long j) {
        return (C141206mq) this.A01.A04.poll(j, TimeUnit.MICROSECONDS);
    }

    public long BAp() {
        C141206mq r0 = this.A01.A01;
        if (r0 == null) {
            return -1;
        }
        return r0.A00.presentationTimeUs;
    }

    public void Bm6(MediaFormat mediaFormat, AnonymousClass65W r8, List list, int i) {
        C141316n2 r5 = this.A01;
        r5.A00 = mediaFormat;
        r5.A03.countDown();
        int i2 = 0;
        do {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = r5.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0I();
                r5.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            r5.A04.offer(new C141206mq(0, allocateDirect, new MediaCodec.BufferInfo()));
            i2++;
        } while (i2 < 5);
    }

    public void Bmi(C141206mq r2) {
        this.A01.A06.offer(r2);
    }

    public void finish() {
        C141316n2 r1 = this.A01;
        ArrayList arrayList = r1.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
        r1.A04.clear();
        r1.A06.clear();
        r1.A04 = null;
    }

    public String BAr() {
        return "VideoTranscoderPassThrough";
    }

    public boolean BNU() {
        return this.A00;
    }
}

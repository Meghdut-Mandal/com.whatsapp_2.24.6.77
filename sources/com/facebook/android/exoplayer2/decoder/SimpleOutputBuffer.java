package com.facebook.android.exoplayer2.decoder;

import X.AnonymousClass82X;
import X.C209039zM;
import X.C90474aD;
import java.nio.ByteBuffer;

public class SimpleOutputBuffer extends AnonymousClass82X {
    public ByteBuffer data;
    public final C209039zM owner;

    public void clear() {
        this.A00 = 0;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j, int i) {
        this.A01 = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = C90474aD.A0l(i);
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    public void release() {
        this.owner.A05(this);
    }

    public SimpleOutputBuffer(C209039zM r1) {
        this.owner = r1;
    }
}

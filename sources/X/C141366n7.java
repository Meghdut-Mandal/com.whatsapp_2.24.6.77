package X;

import android.content.Context;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.6n7  reason: invalid class name and case insensitive filesystem */
public class C141366n7 implements C160987lu {
    public final Context A00;
    public final MediaCodec.BufferInfo A01;
    public final AnonymousClass7ez A02;
    public final C131456Pc A03;
    public final C160907lm A04;
    public final C125085zI A05;
    public final ByteBuffer A06;
    public final ExecutorService A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A = new byte[7];
    public volatile AnonymousClass60L A0B;
    public volatile boolean A0C;
    public volatile Future A0D;

    public void B0o(int i) {
    }

    public void B5j(long j) {
    }

    public void Bo2(int i) {
    }

    public void Bo7(long j) {
    }

    public void cancel() {
        this.A0C = true;
        if (this.A0D != null) {
            if (!this.A0D.isDone()) {
                this.A0D.cancel(true);
            }
            try {
                this.A0D.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    public boolean BLQ() {
        if (this.A0D == null || !this.A0D.isDone()) {
            return false;
        }
        this.A0D.get();
        return true;
    }

    public boolean BuB() {
        C141206mq A002 = this.A0B.A00.A00(5000);
        if (A002 == null) {
            return false;
        }
        A002.BqJ(0, 0, 0, 4);
        this.A0B.A00.A03(A002);
        return true;
    }

    public void BuN(C132186So r10, int i) {
        AnonymousClass5TE r3 = AnonymousClass5TE.AUDIO;
        long A002 = C129266Gc.A00(this.A00, this.A02, r3, this.A05);
        this.A0D = this.A07.submit(new C163697qc(r10, this, i, 0, A002));
    }

    public void BxP() {
        if (this.A0D != null) {
            this.A0D.get();
        }
    }

    public void flush() {
        this.A0B.A00.A04.flush();
    }

    public void release() {
        AnonymousClass6MV r3 = new AnonymousClass6MV();
        try {
            AnonymousClass60L r0 = this.A0B;
            AnonymousClass6MV r2 = new AnonymousClass6MV();
            new C162577oo(r2, r0.A00).A00();
            Throwable th = r2.A01;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th2) {
            AnonymousClass6MV.A00(r3, th2);
        }
        Throwable th3 = r3.A01;
        if (th3 != null) {
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r1 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C141366n7(android.content.Context r3, X.AnonymousClass7ez r4, X.C131456Pc r5, X.C159097io r6, X.C118675oY r7, X.C125085zI r8, java.lang.String r9, java.util.concurrent.ExecutorService r10) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 7
            byte[] r0 = new byte[r0]
            r2.A0A = r0
            r2.A03 = r5
            r2.A05 = r8
            r2.A07 = r10
            r2.A02 = r4
            r2.A00 = r3
            boolean r1 = r6.Bsw()
            r2.A08 = r1
            java.lang.String r0 = ".aac"
            boolean r0 = r9.endsWith(r0)
            r2.A09 = r0
            if (r0 != 0) goto L_0x0025
            r0 = 0
            if (r1 == 0) goto L_0x0032
        L_0x0025:
            r0 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r2.A06 = r0
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo
            r0.<init>()
        L_0x0032:
            r2.A01 = r0
            X.7lm r0 = r6.B4j(r7)
            r2.A04 = r0
            r0.B3Q(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141366n7.<init>(android.content.Context, X.7ez, X.6Pc, X.7io, X.5oY, X.5zI, java.lang.String, java.util.concurrent.ExecutorService):void");
    }
}

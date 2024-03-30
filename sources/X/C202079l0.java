package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9l0  reason: invalid class name and case insensitive filesystem */
public final class C202079l0 {
    public AnonymousClass9JX A00;
    public AnonymousClass9JY A01;
    public C006302t A02;
    public C006302t A03;
    public C006302t A04;
    public final AnonymousClass9JZ A05;
    public final C128356By A06;
    public final C122185uR A07;
    public final Object A08;
    public final String A09;
    public final ByteBuffer A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final AtomicBoolean A0D;
    public final Runnable A0E;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x002d A[EDGE_INSN: B:33:0x002d->B:19:0x002d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015 A[Catch:{ IOException -> 0x0037 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass6P8 A00(X.C202079l0 r5, java.nio.ByteBuffer r6, boolean r7) {
        /*
            X.9JY r4 = r5.A01
            if (r4 == 0) goto L_0x000c
            java.util.concurrent.atomic.AtomicBoolean r3 = r5.A0C
            boolean r0 = r3.get()
            if (r0 != 0) goto L_0x000f
        L_0x000c:
            X.6P8 r0 = X.AnonymousClass6P8.A05
            return r0
        L_0x000f:
            boolean r0 = r6.hasRemaining()     // Catch:{ IOException -> 0x0037 }
            if (r0 == 0) goto L_0x002d
            X.Axg r0 = r4.A00     // Catch:{ IOException -> 0x0037 }
            if (r0 == 0) goto L_0x0020
            java.nio.ByteBuffer r2 = r0.Bw1(r6)     // Catch:{ IOException -> 0x0037 }
            if (r2 != 0) goto L_0x0021
            goto L_0x002d
        L_0x0020:
            r2 = r6
        L_0x0021:
            java.nio.channels.WritableByteChannel r1 = r4.A02     // Catch:{ IOException -> 0x0037 }
        L_0x0023:
            boolean r0 = r2.hasRemaining()     // Catch:{ IOException -> 0x0037 }
            if (r0 == 0) goto L_0x000f
            r1.write(r2)     // Catch:{ IOException -> 0x0037 }
            goto L_0x0023
        L_0x002d:
            if (r7 == 0) goto L_0x0034
            java.io.OutputStream r0 = r4.A01     // Catch:{ IOException -> 0x0037 }
            r0.flush()     // Catch:{ IOException -> 0x0037 }
        L_0x0034:
            X.6P8 r0 = X.AnonymousClass6P8.A06     // Catch:{ IOException -> 0x0037 }
            return r0
        L_0x0037:
            r2 = move-exception
            java.lang.String r1 = r5.A09
            java.lang.String r0 = "write"
            X.AnonymousClass6YR.A09(r1, r0, r2)
            java.nio.channels.WritableByteChannel r0 = r4.A02
            r0.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r1 = 1
            r0 = 0
            boolean r0 = r3.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x000c
            X.02t r0 = r5.A03
            if (r0 == 0) goto L_0x000c
            r0.invoke(r2)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202079l0.A00(X.9l0, java.nio.ByteBuffer, boolean):X.6P8");
    }

    public static final void A01(C202079l0 r3) {
        C122185uR r2 = r3.A07;
        Runnable runnable = r3.A0E;
        AnonymousClass00C.A0D(runnable, 0);
        r2.A00.execute(runnable);
    }

    public static final void A02(C202079l0 r3, IOException iOException) {
        C006302t r0;
        if (r3.A0B.compareAndSet(true, false) && (r0 = r3.A02) != null) {
            r0.invoke(iOException);
        }
    }

    public final void A03(C006302t r7) {
        C122185uR r5 = this.A07;
        if (r5.A03.get() == Thread.currentThread().getId()) {
            r7.invoke(this);
            return;
        }
        AnonymousClass74N r3 = new AnonymousClass74N(r7, this, 13);
        r5.A02.incrementAndGet();
        r5.A01.execute(new AnonymousClass74N(r3, r5, 14));
    }

    public C202079l0(C122185uR r3, String str) {
        String str2;
        this.A07 = r3;
        if (str != null) {
            str2 = AnonymousClass000.A0p("IOLinkPipeline-", str, AnonymousClass000.A0u());
        } else {
            str2 = "IOLinkPipeline";
        }
        this.A09 = str2;
        this.A0B = new AtomicBoolean(false);
        this.A0C = new AtomicBoolean(false);
        this.A0D = new AtomicBoolean(false);
        this.A05 = new AnonymousClass9JZ(this);
        this.A08 = C36441kJ.A11();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(DefaultCrypto.BUFFER_SIZE);
        allocateDirect.limit(0);
        this.A0A = allocateDirect;
        this.A06 = new C128356By();
        this.A0E = new C21704AWy(this);
    }
}

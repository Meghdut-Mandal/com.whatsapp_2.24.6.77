package X;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9SV  reason: invalid class name */
public final class AnonymousClass9SV {
    public final InputStream A00;
    public final ByteBuffer A01 = ByteBuffer.allocateDirect(16384);
    public final ReadableByteChannel A02;
    public final ExecutorService A03;
    public final AtomicBoolean A04;
    public final AnonymousClass00S A05;
    public final C006302t A06;
    public final Runnable A07;

    public final void A00() {
        if (this.A04.compareAndSet(true, false)) {
            AnonymousClass9AO.A01.A01("sup:IncomingMediaStreamProcessor", "Pump Executor starting shutdown");
            ExecutorService executorService = this.A03;
            executorService.execute(new C1497572q(this, 29));
            executorService.shutdownNow();
        }
    }

    public AnonymousClass9SV(InputStream inputStream, ExecutorService executorService, AnonymousClass00S r7, C006302t r8) {
        boolean A1U = C90484aE.A1U(executorService);
        this.A00 = inputStream;
        this.A03 = executorService;
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = new AtomicBoolean(A1U);
        this.A02 = Channels.newChannel(inputStream);
        AV8 av8 = new AV8(this);
        this.A07 = av8;
        AnonymousClass9AO.A01.A01("sup:IncomingMediaStreamProcessor", "Pump Executor execute poll");
        executorService.execute(av8);
    }
}

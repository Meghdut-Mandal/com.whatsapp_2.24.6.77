package X;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;

public final class AV8 implements Runnable {
    public final /* synthetic */ AnonymousClass9SV A00;

    public AV8(AnonymousClass9SV r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass9SV r4;
        while (true) {
            try {
                r4 = this.A00;
                if (!r4.A04.get()) {
                    break;
                }
                ByteBuffer byteBuffer = r4.A01;
                byteBuffer.clear();
                int read = r4.A02.read(byteBuffer);
                if (read <= 0) {
                    if (read == -1) {
                        r4.A05.invoke();
                        r4.A00();
                        break;
                    }
                } else {
                    byteBuffer.flip();
                    r4.A06.invoke(byteBuffer);
                }
                if (r4.A00.available() == 0) {
                    break;
                }
            } catch (Throwable th) {
                AnonymousClass9AO.A01.A05("sup:IncomingMediaStreamProcessor", "Pump task finished with error", th);
                return;
            }
        }
        ExecutorService executorService = r4.A03;
        if (!executorService.isShutdown()) {
            executorService.execute(this);
        }
    }
}

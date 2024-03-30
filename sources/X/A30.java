package X;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class A30 implements B2N {
    public final Socket A00;

    public InputStream BCl() {
        InputStream inputStream = this.A00.getInputStream();
        AnonymousClass00C.A08(inputStream);
        return inputStream;
    }

    public OutputStream BEr() {
        OutputStream outputStream = this.A00.getOutputStream();
        AnonymousClass00C.A08(outputStream);
        return outputStream;
    }

    public A30(Socket socket) {
        this.A00 = socket;
    }

    public Closeable BA3() {
        return this.A00;
    }
}

package X;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: X.9xx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C208269xx implements AnonymousClass7eC {
    public static final /* synthetic */ C208269xx A00 = new C208269xx();

    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            AnonymousClass6GP.A01("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }
}

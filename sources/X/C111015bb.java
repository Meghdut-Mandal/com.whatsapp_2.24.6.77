package X;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* renamed from: X.5bb  reason: invalid class name and case insensitive filesystem */
public abstract class C111015bb {
    public static int A00(Exception exc) {
        if (exc instanceof UnknownHostException) {
            return 2;
        }
        if (exc instanceof SocketTimeoutException) {
            return 3;
        }
        if (exc instanceof ConnectException) {
            return 19;
        }
        return 18;
    }
}

package X;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

/* renamed from: X.96n  reason: invalid class name and case insensitive filesystem */
public abstract class C1900096n {
    public static void A00(Socket socket, int i, int i2, int i3) {
        try {
            Os.setsockoptInt(((FileInputStream) socket.getInputStream()).getFD(), i, i2, i3);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}

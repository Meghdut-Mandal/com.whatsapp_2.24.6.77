package X;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* renamed from: X.8xF  reason: invalid class name and case insensitive filesystem */
public final class C187108xF extends ByteArrayOutputStream {
    public byte[] A01() {
        return this.buf;
    }

    public void A00() {
        Arrays.fill(this.buf, (byte) 0);
        reset();
    }
}

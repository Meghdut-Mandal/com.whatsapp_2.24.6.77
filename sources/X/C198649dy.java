package X;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: X.9dy  reason: invalid class name and case insensitive filesystem */
public final class C198649dy {
    public final ByteArrayOutputStream A00;
    public final DataOutputStream A01;

    public static void A00(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    public C198649dy() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.A00 = byteArrayOutputStream;
        this.A01 = new DataOutputStream(byteArrayOutputStream);
    }
}
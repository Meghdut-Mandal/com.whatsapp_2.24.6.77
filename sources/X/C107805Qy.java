package X;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.5Qy  reason: invalid class name and case insensitive filesystem */
public class C107805Qy extends FilterOutputStream {
    public final /* synthetic */ C1263363n A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107805Qy(C1263363n r1, OutputStream outputStream) {
        super(outputStream);
        this.A00 = r1;
    }

    public void close() {
        try {
            this.out.close();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public void flush() {
        try {
            this.out.flush();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }
}

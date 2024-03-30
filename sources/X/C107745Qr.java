package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.5Qr  reason: invalid class name and case insensitive filesystem */
public class C107745Qr extends FileInputStream {
    public long A00;
    public final /* synthetic */ AnonymousClass1D9 A01;
    public final /* synthetic */ AnonymousClass5BQ A02;

    public int read(byte[] bArr, int i, int i2) {
        AnonymousClass00C.A0D(bArr, 0);
        while (getChannel().size() < this.A00 + ((long) i2) && (!this.A02.A01)) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException unused) {
                return 0;
            }
        }
        int read = super.read(bArr, i, i2);
        if (read >= 0) {
            this.A00 += (long) read;
        }
        return read;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107745Qr(AnonymousClass5BQ r1, AnonymousClass1D9 r2, File file) {
        super(file);
        this.A01 = r2;
        this.A02 = r1;
    }
}

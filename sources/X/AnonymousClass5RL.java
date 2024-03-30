package X;

import android.os.Message;
import java.io.OutputStream;

/* renamed from: X.5RL  reason: invalid class name */
public class AnonymousClass5RL extends OutputStream {
    public final C20050ww A00;
    public final OutputStream A01;
    public final Integer A02;
    public final Integer A03;

    public void A00(int i) {
        AnonymousClass14L r1;
        Integer num = this.A02;
        if (num != null) {
            C20050ww r3 = this.A00;
            int intValue = num.intValue();
            AnonymousClass14K r12 = r3.A00;
            C18740tg.A0C(AnonymousClass000.A1V(r12));
            if (i >= 0) {
                Message.obtain(r12, 2, intValue, i).sendToTarget();
                C20050ww.A00(r3);
            }
        }
        C20050ww r13 = this.A00;
        int intValue2 = this.A03.intValue();
        C20860yH r5 = r13.A05;
        if (((long) i) >= 0 && (r1 = r5.A00) != null) {
            C18740tg.A0C(true);
            Message.obtain(r1, 2, intValue2, i).sendToTarget();
            C20860yH.A00(r5);
        }
    }

    public void close() {
        this.A01.close();
    }

    public void flush() {
        this.A01.flush();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
        A00(i2);
    }

    public AnonymousClass5RL(C20050ww r1, OutputStream outputStream, Integer num, Integer num2) {
        this.A01 = outputStream;
        this.A02 = num;
        this.A00 = r1;
        this.A03 = num2;
    }

    public void write(int i) {
        this.A01.write(i);
        A00(1);
    }

    public void write(byte[] bArr) {
        this.A01.write(bArr);
        A00(bArr.length);
    }
}

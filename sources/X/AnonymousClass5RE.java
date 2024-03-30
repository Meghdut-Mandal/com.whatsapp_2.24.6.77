package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.net.URLConnection;

/* renamed from: X.5RE  reason: invalid class name */
public class AnonymousClass5RE extends InputStream {
    public final C20050ww A00;
    public final InputStream A01;
    public final Integer A02;
    public final Integer A03;

    public static AnonymousClass5RE A00(C20050ww r4, URLConnection uRLConnection, int i) {
        return new AnonymousClass5RE(r4, uRLConnection.getInputStream(), (Integer) null, Integer.valueOf(i));
    }

    public synchronized void reset() {
        Log.w("reset called in MessageInputStream");
    }

    public void A01(int i) {
        AnonymousClass14L r1;
        Integer num = this.A02;
        if (num != null) {
            C20050ww r3 = this.A00;
            int intValue = num.intValue();
            AnonymousClass14K r12 = r3.A00;
            C18740tg.A0C(AnonymousClass000.A1V(r12));
            Message.obtain(r12, 3, intValue, i).sendToTarget();
            C20050ww.A00(r3);
        }
        C20050ww r13 = this.A00;
        int intValue2 = this.A03.intValue();
        C20860yH r5 = r13.A05;
        if (((long) i) >= 0 && (r1 = r5.A00) != null) {
            C18740tg.A0C(true);
            Message.obtain(r1, 3, intValue2, i).sendToTarget();
            C20860yH.A00(r5);
        }
    }

    public void A02(long j) {
        Integer num = this.A02;
        if (num != null) {
            this.A00.A04(j, num.intValue());
        }
        this.A00.A05(j, this.A03.intValue());
    }

    public int available() {
        return this.A01.available();
    }

    public void close() {
        this.A01.close();
    }

    public void mark(int i) {
        Log.w("mark called in MessageInputStream");
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.A01.read(bArr, i, i2);
        if (read > 0) {
            A01(read);
        }
        return read;
    }

    public long skip(long j) {
        long skip = this.A01.skip(j);
        A02(skip);
        return skip;
    }

    public AnonymousClass5RE(C20050ww r1, InputStream inputStream, Integer num, Integer num2) {
        this.A01 = inputStream;
        this.A02 = num;
        this.A00 = r1;
        this.A03 = num2;
    }

    public int read() {
        int read = this.A01.read();
        if (read != -1) {
            A01(1);
        }
        return read;
    }

    public int read(byte[] bArr) {
        int read = this.A01.read(bArr);
        if (read > 0) {
            A01(read);
        }
        return read;
    }
}

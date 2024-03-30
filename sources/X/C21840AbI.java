package X;

import android.os.Process;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.AbI  reason: case insensitive filesystem */
public class C21840AbI extends Thread {
    public final long A00;
    public final NativeTraceWriter A01;
    public final String A02;
    public final String A03;
    public final Buffer[] A04;
    public final A2Y A05;

    public void run() {
        try {
            Process.setThreadPriority(5);
            this.A01.loop();
            Buffer[] bufferArr = this.A04;
            int length = bufferArr.length;
            if (length > 1) {
                String str = this.A03;
                StringBuilder A0h = C90524aI.A0h(str.length() + 2);
                int i = 1;
                while (true) {
                    A0h.setLength(0);
                    A0h.append(str);
                    A0h.append('-');
                    A0h.append(i);
                    new NativeTraceWriter(bufferArr[i], this.A02, A0h.toString(), (NativeTraceWriterCallbacks) null).dump(this.A00);
                    i++;
                    if (i >= length) {
                        break;
                    }
                }
            }
        } catch (RuntimeException e) {
            this.A05.onTraceWriteException(this.A00, e);
        } catch (Throwable th) {
            this.A05.A00();
            throw th;
        }
        this.A05.A00();
    }

    public C21840AbI(NativeTraceWriterCallbacks nativeTraceWriterCallbacks, String str, String str2, Buffer[] bufferArr, long j) {
        super("Prflo:Logger");
        this.A00 = j;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = bufferArr;
        A2Y a2y = new A2Y(nativeTraceWriterCallbacks, bufferArr.length <= 1 ? false : true);
        this.A05 = a2y;
        NativeTraceWriter nativeTraceWriter = NativeTraceWriter.$redex_init_class;
        this.A01 = new NativeTraceWriter(bufferArr[0], str, AnonymousClass000.A0q("-0", AnonymousClass000.A0v(str2)), a2y);
    }
}

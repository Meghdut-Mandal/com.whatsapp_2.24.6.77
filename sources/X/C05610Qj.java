package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.Reader;
import java.io.StringWriter;

/* renamed from: X.0Qj  reason: invalid class name and case insensitive filesystem */
public abstract class C05610Qj {
    public static final String A00(Reader reader) {
        AnonymousClass00C.A0D(reader, 0);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = reader.read(cArr);
            if (read >= 0) {
                stringWriter.write(cArr, 0, read);
            } else {
                String obj = stringWriter.toString();
                AnonymousClass00C.A08(obj);
                return obj;
            }
        }
    }
}

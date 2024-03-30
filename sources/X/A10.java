package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

public class A10 implements C22868AxN {
    public /* bridge */ /* synthetic */ void BnN(Object obj) {
        Closeable closeable = (Closeable) obj;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                try {
                    C196469Zt.A00.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                } catch (IOException unused) {
                }
            }
        }
    }
}

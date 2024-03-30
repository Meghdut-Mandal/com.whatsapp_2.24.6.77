package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.3NF  reason: invalid class name */
public class AnonymousClass3NF {
    public final NativeHolder A00;

    public AnonymousClass3NF(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public AnonymousClass3NF(byte[] bArr, long j) {
        JniBridge.getInstance();
        this.A00 = new AnonymousClass3NF((NativeHolder) JniBridge.jvidispatchOIO(20, j, bArr)).A00;
    }
}

package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.3NE  reason: invalid class name */
public class AnonymousClass3NE {
    public final NativeHolder A00;

    public AnonymousClass3NE(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public AnonymousClass3NE(byte[] bArr, long j) {
        JniBridge.getInstance();
        this.A00 = new AnonymousClass3NE((NativeHolder) JniBridge.jvidispatchOIO(21, j, bArr)).A00;
    }
}

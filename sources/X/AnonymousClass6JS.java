package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.6JS  reason: invalid class name */
public class AnonymousClass6JS {
    public final NativeHolder A00;

    public AnonymousClass6JS(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public AnonymousClass6JS(byte[] bArr, byte[] bArr2) {
        JniBridge.getInstance();
        this.A00 = new AnonymousClass6JS((NativeHolder) JniBridge.jvidispatchOOO(0, bArr, bArr2)).A00;
    }
}

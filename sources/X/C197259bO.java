package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.9bO  reason: invalid class name and case insensitive filesystem */
public class C197259bO {
    public final NativeHolder A00;

    public C197259bO(String str) {
        JniBridge.getInstance();
        this.A00 = new C197259bO((NativeHolder) JniBridge.jvidispatchOO(3, str)).A00;
    }

    public C197259bO(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }
}

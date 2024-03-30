package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.6JR  reason: invalid class name */
public class AnonymousClass6JR {
    public final NativeHolder A00;

    public AnonymousClass6JR(String str, String str2, int i) {
        JniBridge.getInstance();
        this.A00 = new AnonymousClass6JR((NativeHolder) JniBridge.jvidispatchOIOO(0, (long) i, str, str2)).A00;
    }

    public AnonymousClass6JR(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }
}

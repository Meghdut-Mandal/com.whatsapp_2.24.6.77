package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.3ND  reason: invalid class name */
public class AnonymousClass3ND {
    public final NativeHolder A00;

    public AnonymousClass3ND(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public AnonymousClass3ND(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, long j) {
        JniBridge.getInstance();
        this.A00 = new AnonymousClass3ND((NativeHolder) JniBridge.jvidispatchOIIIOOOOOOO((long) i, j, 0, str, str2, (Object) null, (Object) null, bArr, bArr2, bArr3)).A00;
    }
}

package X;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;

/* renamed from: X.1jz  reason: invalid class name and case insensitive filesystem */
public class C36241jz implements C19130uQ {
    public Object A00;
    public Object A01;
    public final int A02;

    public C36241jz(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public Object get() {
        if (this.A02 != 0) {
            C19020uF r2 = (C19020uF) this.A01;
            return r2.A02.B45(new C19240uc((C19110uO) this.A00, r2));
        }
        C18960u7 r4 = (C18960u7) this.A00;
        Context context = (Context) this.A01;
        StringBuilder sb = new StringBuilder();
        C18960u7.A02(r4);
        byte[] bytes = r4.A04.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes != null) {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append("+");
        C18960u7.A02(r4);
        byte[] bytes2 = r4.A01.A00.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return new C19410ux(context, (C19150uS) r4.A02.A02(C19150uS.class), sb.toString());
    }
}

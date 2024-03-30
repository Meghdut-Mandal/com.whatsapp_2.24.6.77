package X;

import java.nio.charset.Charset;

/* renamed from: X.1js  reason: invalid class name and case insensitive filesystem */
public class C36171js implements AnonymousClass005 {
    public Object A00;
    public final int A01;

    public C36171js(C19890wg r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final Object get() {
        String str;
        int i = this.A01;
        C19890wg r1 = (C19890wg) this.A00;
        switch (i) {
            case 0:
                str = C19430v1.A0A;
                break;
            case 1:
                str = "server_prop_preferences";
                break;
            case 2:
                Charset charset = C31191bQ.A08;
                str = "ab-props";
                break;
            default:
                Charset charset2 = C31191bQ.A08;
                str = C19430v1.A0A;
                break;
        }
        return r1.A00(str);
    }
}

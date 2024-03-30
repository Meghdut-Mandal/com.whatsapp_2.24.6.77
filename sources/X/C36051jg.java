package X;

import android.content.Context;
import com.whatsapp.HomeActivity;

/* renamed from: X.1jg  reason: invalid class name and case insensitive filesystem */
public class C36051jg implements C004101v {
    public Object A00;
    public final int A01;

    public C36051jg(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BUZ(Context context) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((AnonymousClass14q) obj).A2F();
                return;
            case 1:
                ((HomeActivity) obj).A2F();
                return;
            case 4:
                ((C224814n) obj).A2F();
                return;
            default:
                ((C225514w) obj).A2F();
                return;
        }
    }
}

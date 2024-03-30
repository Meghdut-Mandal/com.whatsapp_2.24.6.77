package X;

import android.app.Activity;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.4Wn  reason: invalid class name and case insensitive filesystem */
public class C89434Wn implements C88114Rl {
    public Object A00;
    public final int A01;

    public C89434Wn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bem() {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                C36431kI.A1N(obj);
                return;
            case 1:
                ((AnonymousClass00S) obj).invoke();
                return;
            case 2:
                ((MediaViewBaseFragment) obj).A1g();
                return;
            case 3:
                C36411kG.A1N(obj);
                return;
            default:
                C225014r r1 = (C225014r) ((C49762je) obj).A07.get();
                if (r1 instanceof Activity) {
                    C36411kG.A1N(r1);
                    return;
                }
                return;
        }
    }
}

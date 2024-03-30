package X;

import android.app.Activity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.2rR  reason: invalid class name and case insensitive filesystem */
public class C53512rR implements AnonymousClass4PJ {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C53512rR(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    public final void BwH() {
        Object obj;
        switch (this.A04) {
            case 0:
                Activity activity = (Activity) this.A01;
                Object obj2 = this.A02;
                WeakReference A0F = AnonymousClass001.A0F(activity);
                ((AnonymousClass3D6) this.A00).A00.A0E(activity, new AnonymousClass4X2(A0F, obj2, 1), (UserJid) this.A03);
                return;
            case 1:
                AnonymousClass1NG r1 = ((AnonymousClass3EU) this.A00).A00;
                UserJid A0b = C36401kF.A0b((Jid) this.A03);
                C18740tg.A06(A0b);
                r1.A0E((Activity) this.A01, (AnonymousClass4PI) this.A02, A0b);
                return;
            default:
                AnonymousClass3EU r3 = (AnonymousClass3EU) this.A00;
                Activity activity2 = (Activity) this.A01;
                C135086c7 r2 = (C135086c7) this.A02;
                AnonymousClass4PI r12 = (AnonymousClass4PI) this.A03;
                C196129Xv BAH = r3.A02.A05().BAH();
                C29121Vk r7 = r3.A01;
                if (r2 == null) {
                    obj = null;
                } else {
                    obj = r2.A00;
                }
                BAH.A01(activity2, new C76053oF(r12), r7, (String) obj, false);
                return;
        }
    }
}

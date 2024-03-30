package X;

import android.content.Context;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4WY  reason: invalid class name */
public class AnonymousClass4WY implements AnonymousClass4PL {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4WY(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void BjC(boolean z) {
        if (this.A03 != 0) {
            Context context = (Context) this.A01;
            AnonymousClass11F r1 = (AnonymousClass11F) this.A02;
            if (!z) {
                context.startActivity(C36431kI.A0E(context, (UserJid) r1, C36401kF.A0k()));
                return;
            }
            return;
        }
        C48932iI r0 = (C48932iI) this.A00;
        AnonymousClass141 r2 = (AnonymousClass141) this.A01;
        ImageView imageView = (ImageView) this.A02;
        if (!z) {
            AnonymousClass2Gc.A01(imageView, (AnonymousClass2Gc) r0.A00, r2);
        }
    }
}

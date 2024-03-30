package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2iB  reason: invalid class name and case insensitive filesystem */
public class C48862iB extends C33541fX {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public void A02(View view) {
        switch (this.A04) {
            case 0:
                ((AnonymousClass2IR) this.A00).A21.Boy(new C1503474x(this.A02, (Object) this, this.A01, this.A03, 32));
                return;
            case 1:
                ((AnonymousClass2XH) this.A01).A07((Context) this.A00, C64933Qa.A01((AnonymousClass3T1) this.A02), (UserJid) this.A03);
                return;
            default:
                ((C23871Ae) this.A03).A03((Boolean) null, 13);
                AnonymousClass5HA r3 = (AnonymousClass5HA) this.A00;
                if (r3.A0E.A0E(7755)) {
                    Context context = r3.A05;
                    context.startActivity(AnonymousClass190.A11(context, "avatar_sticker_picker"));
                    return;
                }
                ((AnonymousClass6WF) this.A02).A04("avatar_sticker_picker", AnonymousClass001.A0F(this.A01));
                return;
        }
    }

    public C48862iB(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }
}

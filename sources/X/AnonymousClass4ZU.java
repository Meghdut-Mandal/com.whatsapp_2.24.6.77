package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.4ZU  reason: invalid class name */
public class AnonymousClass4ZU implements C87944Qu {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bow(Jid jid, int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                ((C49632jR) obj).A01 = (AnonymousClass147) jid;
                return;
            case 1:
                C40041ue.A03((C40041ue) obj, (AnonymousClass147) jid, i);
                return;
            default:
                C49702jY r0 = (C49702jY) obj;
                r0.A02 = (AnonymousClass147) jid;
                r0.A01 = i;
                return;
        }
    }
}

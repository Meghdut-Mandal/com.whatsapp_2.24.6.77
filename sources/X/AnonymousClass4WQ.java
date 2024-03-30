package X;

/* renamed from: X.4WQ  reason: invalid class name */
public class AnonymousClass4WQ extends C132446Tt {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4WQ(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C21642ATi aTi;
        C21642ATi aTi2;
        if (this.A02 != 0) {
            return Boolean.valueOf(C36411kG.A1a(((C236419g) this.A00).A0A()));
        }
        C32951eT r3 = (C32951eT) this.A00;
        C20060wx r0 = r3.A07;
        long A03 = r0.A03();
        long A012 = r0.A01();
        int A04 = r3.A09.A00.A04(C21100yf.A1N);
        C21642ATi aTi3 = null;
        C55592us r4 = new C55592us();
        C33001eY r2 = r3.A04;
        if (r2.A00.A0E(3712)) {
            aTi = r2.A01.A00.A00((C16540pP) null, "whatsapp_banner_chat_list", 11114);
        } else {
            aTi = null;
        }
        C33011eZ r1 = r3.A05;
        if (r1.A01()) {
            aTi2 = r1.A01.A00.A00((C16540pP) null, "whatsapp_banner_group_info", 11435);
        } else {
            aTi2 = null;
        }
        C33021ea r12 = r3.A06;
        if (r12.A01()) {
            aTi3 = r12.A01.A00.A00((C16540pP) null, "whatsapp_banner_profile", 11515);
        }
        return new AnonymousClass3KG(r4, aTi, aTi2, aTi3, A04, A03, A012);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (this.A02 != 0) {
            ((C79593ty) this.A01).A0C(obj);
            return;
        }
        AnonymousClass3KG r2 = (AnonymousClass3KG) obj;
        ((C32951eT) this.A00).A00 = r2;
        AnonymousClass4PC r0 = (AnonymousClass4PC) this.A01;
        if (r2 != null) {
            r0.BV4(r2);
        }
    }
}

package X;

import com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentStickerShape$1;
import java.util.ArrayList;

/* renamed from: X.7sn  reason: invalid class name and case insensitive filesystem */
public class C165047sn implements AnonymousClass00P, C006302t {
    public Object A00;
    public Object A01;
    public final int A02;

    public C165047sn(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass3UT) this.A01).A08();
                ((C146806wC) this.A00).BgS((C129196Ft) obj);
                break;
            case 1:
                C146806wC r6 = (C146806wC) this.A00;
                C135066c4 r5 = (C135066c4) this.A01;
                r6.A0G.A08();
                C123875xE r4 = (C123875xE) r6.A0Z.get();
                AnonymousClass01N r0 = r6.A0B.A06;
                C36321k7.A0w(r0, r5);
                C36381kD.A1R(r4.A04, new ExpressionsShapeCreator$addRecentStickerShape$1(r4, r5, (C023509x) null), C33321f6.A00(r0));
                r6.BgS((C129196Ft) obj);
                break;
            default:
                C594233w r3 = (C594233w) this.A00;
                C594233w r2 = (C594233w) this.A01;
                C111335c7 r8 = (C111335c7) obj;
                if (!(r8 instanceof AnonymousClass5HS)) {
                    AnonymousClass6JI.A01(r2.A01, r2.A00);
                    break;
                } else {
                    ArrayList A0I = AnonymousClass001.A0I();
                    A0I.add(((AnonymousClass5HS) r8).A00);
                    AnonymousClass6JI.A00(C142326oh.A03(r3.A00), new AnonymousClass6MO(A0I), r3.A01);
                    break;
                }
        }
        return AnonymousClass0AJ.A00;
    }
}

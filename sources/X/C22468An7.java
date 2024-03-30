package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.An7  reason: case insensitive filesystem */
public final class C22468An7 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C187818ya $requestType;
    public final /* synthetic */ C197919cb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22468An7(C187818ya r2, C197919cb r3) {
        super(1);
        this.this$0 = r3;
        this.$requestType = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C197919cb r4;
        Object obj2;
        Object obj3;
        C187818ya r1;
        AnonymousClass96H r0;
        AnonymousClass96F r8 = (AnonymousClass96F) obj;
        if (r8 instanceof AnonymousClass8XB) {
            r4 = this.this$0;
            C187818ya r6 = this.$requestType;
            AnonymousClass8XB r82 = (AnonymousClass8XB) r8;
            AnonymousClass00C.A0D(r82, 0);
            List<C207269up> list = r82.A00.A02;
            ArrayList A0I = AnonymousClass001.A0I();
            for (C207269up r12 : list) {
                A0I.add(new AnonymousClass8XH(r12));
            }
            obj2 = new AnonymousClass8XS(A0I);
            obj3 = new AnonymousClass8XR(A0I);
            int ordinal = r6.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw C36441kJ.A18();
                }
            }
            ((C001600r) r4.A01.getValue()).A0D(obj2);
            return AnonymousClass0AJ.A00;
        }
        if (r8 instanceof AnonymousClass8XE) {
            r4 = this.this$0;
            r1 = this.$requestType;
            r0 = AnonymousClass8XM.A00;
        } else if (AnonymousClass00C.A0J(r8, AnonymousClass8XD.A00)) {
            r4 = this.this$0;
            r1 = this.$requestType;
            r0 = AnonymousClass8XL.A00;
        } else {
            if (!AnonymousClass00C.A0J(r8, AnonymousClass8XC.A00)) {
                if (!AnonymousClass00C.A0J(r8, AnonymousClass8XF.A00)) {
                    AnonymousClass00C.A0J(r8, AnonymousClass8XG.A00);
                    return AnonymousClass0AJ.A00;
                } else if (this.$requestType == C187818ya.START) {
                    r4 = this.this$0;
                    obj2 = AnonymousClass8XU.A00;
                    ((C001600r) r4.A01.getValue()).A0D(obj2);
                    return AnonymousClass0AJ.A00;
                }
            }
            r4 = this.this$0;
            obj2 = AnonymousClass8XT.A00;
            ((C001600r) r4.A01.getValue()).A0D(obj2);
            return AnonymousClass0AJ.A00;
        }
        obj2 = new AnonymousClass8XO(r0);
        obj3 = new AnonymousClass8XN(r0);
        int ordinal2 = r1.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                throw C36441kJ.A18();
            }
        }
        ((C001600r) r4.A01.getValue()).A0D(obj2);
        return AnonymousClass0AJ.A00;
        obj2 = obj3;
        ((C001600r) r4.A01.getValue()).A0D(obj2);
        return AnonymousClass0AJ.A00;
    }
}

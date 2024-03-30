package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class AGF implements C159637jg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C203639oR A01;
    public final /* synthetic */ AnonymousClass7hO A02;
    public final /* synthetic */ C159657ji A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;

    public AGF(C203639oR r1, AnonymousClass7hO r2, C159657ji r3, String str, String str2, Map map, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A04 = str;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = map;
        this.A05 = str2;
    }

    public void BXW(C128176Bf r9) {
        C203639oR r3 = this.A01;
        int i = this.A00;
        Long valueOf = Long.valueOf(r9.A00);
        C105685Fq r2 = r3.A05;
        C203639oR.A03(r2, r3, valueOf, "iqResponse", "error_code", i);
        r2.A01.A04(i, 467);
        AnonymousClass61B r22 = r3.A08;
        String str = r3.A0D;
        synchronized (r22) {
            AnonymousClass00C.A0D(str, 0);
            r22.A00.remove(str);
        }
        C159657ji r1 = this.A03;
        if (r1 != null) {
            r1.BiH(C36391kE.A11(C52122ov.A02.key, r9));
        }
    }

    public void BXX(C184818t3 r18) {
        C184828t4 r4;
        C203639oR r1 = this.A01;
        int i = this.A00;
        C105685Fq r8 = r1.A05;
        C21700zf r2 = r8.A01;
        r2.A03(i, "iqResponse");
        String str = this.A04;
        AnonymousClass7hO r42 = this.A02;
        C159657ji r5 = this.A03;
        Map map = this.A06;
        C184328sG r0 = (C184328sG) r18.A00;
        AnonymousClass00C.A08(r0);
        String str2 = this.A05;
        C203619oP A002 = r1.A02.A00(r1.A06, str, r1.A09.A00(), r1.A0D, (String) null, (String) null);
        r1.A00 = A002;
        if (r42 != null) {
            r42.BYB(A002.A0N);
        }
        C184068rq r43 = (C184068rq) r0.A04;
        if (!(r43 == null || (r4 = (C184828t4) r43.A00) == null)) {
            C203639oR.A06(r1, C203639oR.A01(r1, r4, str));
            String str3 = r4.A01;
            AnonymousClass00C.A08(str3);
            Map A11 = C36391kE.A11(C108375Tg.REFERRAL.key, str2);
            if (map == null) {
                map = C000400e.A0D();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A11);
            linkedHashMap.putAll(map);
            A002.A0B(new C23217B9z(r1, r5, 0), str3, linkedHashMap, (Map) null, false);
            C203639oR.A03(r8, r1, C36441kJ.A0y(((List) r4.A00).size()), "initializeStateMachine", "num_states", i);
            C184068rq r44 = (C184068rq) r0.A01;
            if (r44 != null) {
                Iterator A14 = C90514aH.A14((List) ((C184038rn) r44.A00).A00);
                while (A14.hasNext()) {
                    C184578sf r45 = (C184578sf) A14.next();
                    AnonymousClass00C.A0B(r45);
                    r1.A0D(r45);
                }
            }
            r2.A04(i, 467);
        }
        C184068rq r02 = (C184068rq) r0.A02;
        if (r02 != null) {
            Iterator A142 = C90514aH.A14((List) ((C184068rq) r02.A00).A00);
            while (A142.hasNext()) {
                C184828t4 r03 = (C184828t4) A142.next();
                AnonymousClass00C.A0B(r03);
                C203639oR.A05(r1, r03);
            }
        }
    }
}

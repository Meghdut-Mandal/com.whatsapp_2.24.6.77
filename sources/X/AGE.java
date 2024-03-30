package X;

import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public final class AGE implements C159637jg {
    public final /* synthetic */ C194419Pp A00;
    public final /* synthetic */ AnonymousClass8h3 A01;
    public final /* synthetic */ C203639oR A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Map A05;

    public AGE(C194419Pp r1, AnonymousClass8h3 r2, C203639oR r3, String str, Map map, Map map2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = r1;
        this.A05 = map;
        this.A04 = map2;
    }

    public void BXW(C128176Bf r7) {
        AnonymousClass8h3 r5 = this.A01;
        Map map = this.A04;
        AnonymousClass8h3.A00(this.A00, r5, new AnonymousClass6PH(Integer.valueOf((int) r7.A00), "", r7.A01), map, (Map) null);
    }

    public void BXX(C184818t3 r11) {
        C184828t4 r3;
        C203639oR r6 = this.A02;
        AnonymousClass00C.A07(r6);
        AnonymousClass8h3 r0 = this.A01;
        String str = r0.A01;
        String str2 = r0.A05;
        String str3 = this.A03;
        C184068rq r02 = (C184068rq) ((C184328sG) r11.A00).A04;
        if (!(r02 == null || (r3 = (C184828t4) r02.A00) == null)) {
            AnonymousClass9F7 r03 = r6.A06;
            LinkedHashMap A012 = C203639oR.A01(r6, r3, str2);
            Stack stack = r03.A00;
            stack.add(AnonymousClass001.A0J());
            ((Map) C165607th.A0n(stack)).putAll(A012);
            if (str3 != null) {
                r6.A0F.put(str2, str3);
                C119965qk r04 = (C119965qk) r6.A0G.get(str3);
                if (r04 != null) {
                    r04.A00.A0F();
                }
            }
            C203619oP r5 = r6.A00;
            if (r5 != null) {
                String str4 = r3.A01;
                AnonymousClass00C.A08(str4);
                long size = (long) ((List) r3.A00).size();
                AnonymousClass9S8 r4 = r5.A01;
                if (r4 == null) {
                    throw C36331k8.A0d("flowManager");
                }
                Stack stack2 = r4.A04;
                ((Deque) C165607th.A0n(stack2)).addFirst(str);
                LinkedList A0l = C90524aI.A0l();
                A0l.addLast(str4);
                stack2.add(A0l);
                r4.A03.add(str2);
                C203619oP.A07(r5, "queueEmbeddedSubflowStates");
                r5.A0G.A01(r5.A00, "num_states_queued", size);
                C203619oP.A00(r5);
            }
        }
        C201759kL.A02(r6, r11);
        this.A00.A00((String) null, this.A05);
    }
}

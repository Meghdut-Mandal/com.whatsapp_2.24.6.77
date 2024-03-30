package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ahm  reason: case insensitive filesystem */
public final class C22163Ahm extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C197769cL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22163Ahm(C197769cL r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list;
        String str;
        C197769cL r0 = this.this$0;
        C21430zE r7 = r0.A00;
        AnonymousClass004 r1 = r0.A01;
        r7.markerPoint(314510313, "get_regs");
        Set<C194759Rd> set = (Set) r1.get();
        r7.markerPoint(314510313, "config_regs");
        AnonymousClass00C.A0B(set);
        for (C194759Rd A00 : set) {
            A00.A00();
        }
        r7.markerPoint(314510313, "process_regs");
        LinkedHashMap A1G = C36431kI.A1G();
        LinkedHashMap A1G2 = C36431kI.A1G();
        for (C194759Rd r4 : set) {
            synchronized (r4) {
                r4.A00();
                list = r4.A02;
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    C176938cv r02 = ((C176948cw) it.next()).A03;
                    if (r02 != null) {
                        C019108d r2 = r02.A01;
                        if (r2 != null) {
                            AnonymousClass004 r12 = r02.A00;
                            if (r12 == null) {
                                throw C36331k8.A0d("defaultImplementation");
                            } else if (A1G2.containsKey(r2)) {
                                C019108d r3 = (C019108d) A1G.get(r2);
                                String BGN = r2.BGN();
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("Duplicate registration of subsystem interface ");
                                A0u.append(BGN);
                                A0u.append(". Originally registered by ");
                                if (r3 != null) {
                                    str = r3.BGN();
                                } else {
                                    str = null;
                                }
                                A0u.append(str);
                                A0u.append(". Duplicate registered by ");
                                throw new C21848AbY(AnonymousClass000.A0q(C36441kJ.A1A(r4.getClass()).BGN(), A0u));
                            } else {
                                A1G2.put(r2, r12);
                                A1G.put(r2, C36441kJ.A1A(r4.getClass()));
                            }
                        } else {
                            throw C36331k8.A0d("integrationInterface");
                        }
                    } else {
                        throw C36331k8.A0d("integrationPointBuilder");
                    }
                }
            }
        }
        r7.markerPoint(314510313, "init_complete");
        return A1G2;
    }
}

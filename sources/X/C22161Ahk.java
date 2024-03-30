package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ahk  reason: case insensitive filesystem */
public final class C22161Ahk extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9XG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22161Ahk(AnonymousClass9XG r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list;
        Throwable th;
        String str;
        AnonymousClass9XG r0 = this.this$0;
        C198879eL r2 = r0.A00;
        C019108d r4 = r0.A02;
        AnonymousClass00C.A0D(r4, 0);
        synchronized (r2) {
            if (!r2.A00) {
                C21430zE r8 = r2.A01;
                r8.markerStart(314514774);
                C148306ye.A00.A00(r8, 314514774);
                r8.markerPoint(314514774, "get_regs");
                Set<AnonymousClass9UC> set = (Set) r2.A03.get();
                r8.markerPoint(314514774, "config_regs");
                AnonymousClass00C.A0B(set);
                for (AnonymousClass9UC r1 : set) {
                    synchronized (r1) {
                        try {
                            if (!r1.A00) {
                                r1.A00();
                                r1.A00 = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                r8.markerPoint(314514774, "process_regs");
                LinkedHashMap A1G = C36431kI.A1G();
                loop1:
                for (Object next : set) {
                    AnonymousClass9UC r5 = (AnonymousClass9UC) next;
                    synchronized (next) {
                        if (!r5.A00) {
                            r5.A00();
                            r5.A00 = true;
                        }
                        list = r5.A01;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C176918ct r02 = ((C176958cx) it.next()).A03;
                            if (r02 == null) {
                                th = C36331k8.A0d("integrationPointBuilder");
                                break loop1;
                            }
                            C019108d r6 = r02.A01;
                            if (r6 == null) {
                                th = C36331k8.A0d("integrationInterface");
                                break loop1;
                            }
                            AnonymousClass004 r3 = r02.A00;
                            if (r3 == null) {
                                th = C36331k8.A0d("defaultImplementation");
                                break loop1;
                            }
                            Map map = r2.A02;
                            if (map.containsKey(r6)) {
                                C019108d r42 = (C019108d) A1G.get(r6);
                                String BGN = r6.BGN();
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("Duplicate registration of subsystem interface ");
                                A0u.append(BGN);
                                A0u.append(". Originally registered by ");
                                if (r42 != null) {
                                    str = r42.BGN();
                                } else {
                                    str = null;
                                }
                                A0u.append(str);
                                A0u.append(". Duplicate registered by ");
                                th = new C21848AbY(AnonymousClass000.A0q(C36441kJ.A1A(r5.getClass()).BGN(), A0u));
                            } else {
                                map.put(r6, r3);
                                A1G.put(r6, C36441kJ.A1A(r5.getClass()));
                            }
                        }
                    }
                    throw th;
                }
                r8.markerPoint(314514774, "init_complete");
                r2.A00 = true;
                r8.markerEnd(314514774, 2);
            }
        }
        AnonymousClass004 r03 = (AnonymousClass004) r2.A02.get(r4);
        if (r03 != null) {
            return r03.get();
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Subsystem ");
        A0u2.append(r4.BGN());
        throw new C21851Abb(AnonymousClass000.A0q(" was not registered.", A0u2));
    }
}

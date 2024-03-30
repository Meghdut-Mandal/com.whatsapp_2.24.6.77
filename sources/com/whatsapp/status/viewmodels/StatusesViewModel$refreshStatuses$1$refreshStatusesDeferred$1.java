package com.whatsapp.status.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1HT;
import X.AnonymousClass3P0;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import X.C177638e7;
import X.C21690ze;
import X.C35071i6;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C46812bi;
import X.C61203Ay;
import X.C65663Sz;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$refreshStatusesDeferred$1", f = "StatusesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusesViewModel$refreshStatuses$1$refreshStatusesDeferred$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StatusesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusesViewModel$refreshStatuses$1$refreshStatusesDeferred$1(StatusesViewModel statusesViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = statusesViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StatusesViewModel$refreshStatuses$1$refreshStatusesDeferred$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StatusesViewModel$refreshStatuses$1$refreshStatusesDeferred$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        C46812bi r12;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C61203Ay r10 = this.this$0.A0D;
            C21690ze r8 = r10.A06.A09;
            r8.markerStart(453128091, 2);
            r8.markerPoint(453128091, 2, "REFRESH_TASK_START");
            ArrayList A09 = r10.A03.A09();
            ArrayList A0I = AnonymousClass001.A0I();
            ArrayList A0I2 = AnonymousClass001.A0I();
            ArrayList A0I3 = AnonymousClass001.A0I();
            LinkedHashMap A1G = C36431kI.A1G();
            LinkedHashMap A1G2 = C36431kI.A1G();
            LinkedHashMap A1G3 = C36431kI.A1G();
            Iterator it = A09.iterator();
            C65663Sz r17 = null;
            while (it.hasNext()) {
                C65663Sz A0h = C36441kJ.A0h(it);
                AnonymousClass00C.A0B(A0h);
                AnonymousClass1HT r11 = r10.A01;
                UserJid userJid = A0h.A09;
                AnonymousClass3T1 A02 = r11.A02(userJid);
                if ((A02 instanceof C46812bi) && (r12 = (C46812bi) A02) != null) {
                    r10.A04.A01(r12);
                }
                if (A0h.A0B()) {
                    if (r10.A07.A00()) {
                        C35071i6.A00((C35071i6) r10.A09.get());
                    }
                    r17 = A0h;
                } else if (r10.A05.A0l(userJid)) {
                    A0I3.add(A0h);
                } else if (A0h.A03() > 0) {
                    A0I.add(A0h);
                } else {
                    A0I2.add(A0h);
                }
                if (userJid instanceof C177638e7) {
                    Iterator it2 = r11.A03(userJid).iterator();
                    while (it2.hasNext()) {
                        AnonymousClass3T1 A0l = C36391kE.A0l(it2);
                        String str = r10.A02.A00(A0l).A04;
                        if (str != null) {
                            String str2 = A0l.A1J.A01;
                            AnonymousClass00C.A07(str2);
                            int i3 = 0;
                            if (A1G2.get(str2) == null) {
                                if (A1G3.containsKey(str)) {
                                    i = C36381kD.A07(A1G3.get(str));
                                    i2 = i + 1;
                                } else {
                                    i = 0;
                                    i2 = 1;
                                }
                                C36341k9.A1K(str, A1G3, i2);
                                C36341k9.A1K(str2, A1G2, i);
                            }
                            boolean containsKey = A1G.containsKey(str);
                            int A0D = A0h.A0D(A0l);
                            if (containsKey) {
                                if (A0D != 0) {
                                    Number A10 = C36441kJ.A10(str, A1G);
                                    if (A10 != null) {
                                        i3 = A10.intValue();
                                    }
                                    A0D = i3 + 1;
                                }
                            }
                            C36341k9.A1K(str, A1G, A0D);
                        }
                    }
                }
            }
            r8.markerPoint(453128091, 2, "REFRESH_TASK_POPULATED");
            r8.markerEnd(453128091, 2, 2);
            return new AnonymousClass3P0(r17, A0I, A0I2, A0I3, A1G, A1G2);
        }
        throw AnonymousClass000.A0e();
    }
}

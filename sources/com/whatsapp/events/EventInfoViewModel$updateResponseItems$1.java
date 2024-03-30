package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass11F;
import X.AnonymousClass144;
import X.AnonymousClass2MT;
import X.AnonymousClass2MU;
import X.AnonymousClass2bT;
import X.AnonymousClass3S4;
import X.C009003v;
import X.C023509x;
import X.C36371kC;
import X.C36441kJ;
import X.C40091uu;
import X.C46762bd;
import X.C51262nX;
import X.C52292pC;
import X.C64933Qa;
import X.C89834Yb;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoViewModel$updateResponseItems$1", f = "EventInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoViewModel$updateResponseItems$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass2bT $message;
    public int label;
    public final /* synthetic */ C40091uu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoViewModel$updateResponseItems$1(AnonymousClass2bT r2, C40091uu r3, C023509x r4) {
        super(2, r4);
        this.$message = r2;
        this.this$0 = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EventInfoViewModel$updateResponseItems$1(this.$message, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        AnonymousClass3S4 r11;
        ArrayList A0I;
        ArrayList A02;
        UserJid A0L;
        UserJid A0L2;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            ArrayList A0I2 = AnonymousClass001.A0I();
            AnonymousClass2bT r1 = this.$message;
            if (r1.A1J.A02) {
                Set entrySet = this.this$0.A03.A00(r1).A00.entrySet();
                AnonymousClass00C.A08(entrySet);
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    A0I2.add(AnonymousClass000.A11(it).getKey());
                }
            }
            C40091uu r10 = this.this$0;
            AnonymousClass05L r19 = r10.A0A;
            AnonymousClass2bT r9 = this.$message;
            do {
                value = r19.getValue();
                r11 = (AnonymousClass3S4) value;
                A0I = AnonymousClass001.A0I();
                C64933Qa r14 = r9.A1J;
                AnonymousClass11F r12 = r14.A00;
                if (r12 != null) {
                    Iterable A1X = r9.A1X();
                    if (A1X == null) {
                        A1X = AnonymousClass001.A0I();
                    }
                    List<C46762bd> A00 = C89834Yb.A00(A1X, 4);
                    ArrayList A0I3 = AnonymousClass001.A0I();
                    ArrayList A0I4 = AnonymousClass001.A0I();
                    ArrayList A0I5 = AnonymousClass001.A0I();
                    ArrayList A0I6 = AnonymousClass001.A0I();
                    LinkedHashSet A17 = C36441kJ.A17();
                    for (C46762bd r3 : A00) {
                        if (r3.A1J.A02) {
                            A0L2 = C36371kC.A0e(r10.A00);
                        } else {
                            A0L2 = r3.A0L();
                        }
                        if (A0L2 != null) {
                            AnonymousClass2MU r15 = new AnonymousClass2MU(C51262nX.NONE, r12, A0L2, Long.valueOf(r3.A0I));
                            C52292pC r0 = r3.A01;
                            if (r0 != null) {
                                int ordinal = r0.ordinal();
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        if (r10.A02.A0G((AnonymousClass144) r12, A0L2)) {
                                            A0I5.add(r15);
                                        } else {
                                            A0I6.add(r15);
                                        }
                                    }
                                } else if (r10.A02.A0G((AnonymousClass144) r12, A0L2)) {
                                    A0I3.add(r15);
                                } else {
                                    A0I4.add(r15);
                                }
                            }
                            A17.add(A0L2);
                        }
                    }
                    A0I3.addAll(A0I4);
                    ArrayList A0I7 = AnonymousClass001.A0I();
                    if (r14.A02) {
                        A0L = C36371kC.A0e(r10.A00);
                    } else {
                        A0L = r9.A0L();
                    }
                    if (A0L != null) {
                        A0I7.add(new AnonymousClass2MT(C36371kC.A0v(r10.A01, R.string.f12nameremoved), A0I3.size() + 1));
                        A0I7.add(new AnonymousClass2MU(C51262nX.EVENT_CREATOR, r12, A0L, Long.valueOf(r9.A0I)));
                    }
                    A0I7.addAll(A0I3);
                    A0I.addAll(A0I7);
                    A0I5.addAll(A0I6);
                    ArrayList A0I8 = AnonymousClass001.A0I();
                    if (!A0I5.isEmpty()) {
                        A0I8.add(new AnonymousClass2MT(C36371kC.A0v(r10.A01, R.string.f12nameremoved), A0I5.size()));
                        A0I8.addAll(A0I5);
                    }
                    A0I.addAll(A0I8);
                    ArrayList A0I9 = AnonymousClass001.A0I();
                    int size = A0I2.size() - A17.size();
                    if (!A0I2.isEmpty() && size > 0) {
                        A0I9.add(new AnonymousClass2MT(C36371kC.A0v(r10.A01, R.string.f12nameremoved), size));
                        ArrayList A0I10 = AnonymousClass001.A0I();
                        Iterator it2 = A0I2.iterator();
                        while (it2.hasNext()) {
                            UserJid A0o = C36441kJ.A0o(it2);
                            if (!A17.contains(A0o)) {
                                AnonymousClass2MU r2 = new AnonymousClass2MU(C51262nX.NONE, r12, A0o, (Long) null);
                                if (r10.A02.A0G((AnonymousClass144) r12, A0o)) {
                                    A0I9.add(r2);
                                } else {
                                    A0I10.add(r2);
                                }
                            }
                        }
                        A0I9.addAll(A0I10);
                    }
                    A0I.addAll(A0I9);
                }
                A02 = C40091uu.A02(r9, r10);
            } while (!r19.B3B(value, new AnonymousClass3S4(r9, r11.A01, A0I, A02, r11.A04)));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventInfoViewModel$updateResponseItems$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass05L;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass2bT;
import X.AnonymousClass3S4;
import X.C009003v;
import X.C023509x;
import X.C40091uu;
import X.C51552o0;
import X.C53102qm;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoViewModel$1", f = "EventInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoViewModel$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C40091uu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoViewModel$1(C40091uu r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new EventInfoViewModel$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventInfoViewModel$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList A02;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C40091uu r0 = this.this$0;
            AnonymousClass2bT r4 = (AnonymousClass2bT) r0.A07.A03(r0.A06);
            if (r4 != null) {
                C40091uu r2 = this.this$0;
                AnonymousClass05L r1 = r2.A0A;
                do {
                    value = r1.getValue();
                    A02 = C40091uu.A02(r4, r2);
                } while (!r1.B3B(value, new AnonymousClass3S4(r4, C51552o0.MAIN, AnonymousClass001.A0I(), A02, true)));
                C40091uu r12 = this.this$0;
                r12.A04.A00(r4, "EventInfoViewModel", C53102qm.A02(r12, 27));
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}

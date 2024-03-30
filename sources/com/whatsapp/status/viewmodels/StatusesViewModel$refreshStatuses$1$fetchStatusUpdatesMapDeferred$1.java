package com.whatsapp.status.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass335;
import X.C000400e;
import X.C009003v;
import X.C023509x;
import X.C36391kE;
import X.C36441kJ;
import X.C597735f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$fetchStatusUpdatesMapDeferred$1", f = "StatusesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusesViewModel$refreshStatuses$1$fetchStatusUpdatesMapDeferred$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StatusesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusesViewModel$refreshStatuses$1$fetchStatusUpdatesMapDeferred$1(StatusesViewModel statusesViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = statusesViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StatusesViewModel$refreshStatuses$1$fetchStatusUpdatesMapDeferred$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StatusesViewModel$refreshStatuses$1$fetchStatusUpdatesMapDeferred$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            StatusesViewModel statusesViewModel = this.this$0;
            AnonymousClass335 r2 = statusesViewModel.A0E;
            Map map = (Map) statusesViewModel.A04.A04();
            if (map == null) {
                map = C000400e.A0D();
            }
            Map A0C = r2.A00.A0C();
            AnonymousClass00C.A08(A0C);
            Set keySet = map.keySet();
            LinkedHashSet A17 = C36441kJ.A17();
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : keySet) {
                C36391kE.A1V(next, A0I, A0C.containsKey(next) ? 1 : 0);
            }
            A17.addAll(A0I);
            A17.addAll(A0C.keySet());
            return new C597735f(A0C, A17);
        }
        throw AnonymousClass000.A0e();
    }
}

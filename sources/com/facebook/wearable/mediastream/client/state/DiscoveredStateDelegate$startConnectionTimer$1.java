package com.facebook.wearable.mediastream.client.state;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6X5;
import X.AnonymousClass8A6;
import X.AnonymousClass9AO;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C22048Afv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.client.state.DiscoveredStateDelegate$startConnectionTimer$1", f = "DiscoveredStateDelegate.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class DiscoveredStateDelegate$startConnectionTimer$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass8A6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveredStateDelegate$startConnectionTimer$1(AnonymousClass8A6 r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new DiscoveredStateDelegate$startConnectionTimer$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DiscoveredStateDelegate$startConnectionTimer$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass9AO.A01.A01("sup:DiscoveredStateDelegate", "[DISCOVERED]: Start connection timeout for 30000 ms");
            this.label = 1;
            if (C07330Xf.A00(this, AnonymousClass6X5.A0L) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass8A6 r1 = this.this$0;
        r1.A0B(new C22048Afv(r1));
        return AnonymousClass0AJ.A00;
    }
}

package com.whatsapp.messaging.offline;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C28811Ud;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.offline.DelayedStanzasFetcher$onAppForegrounded$1", f = "DelayedStanzasFetcher.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
public final class DelayedStanzasFetcher$onAppForegrounded$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C28811Ud this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DelayedStanzasFetcher$onAppForegrounded$1(C28811Ud r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new DelayedStanzasFetcher$onAppForegrounded$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DelayedStanzasFetcher$onAppForegrounded$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            if (((DelayedStanzasFetcher$StanzaFetcher) this.this$0.A00.getValue()).A00(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}

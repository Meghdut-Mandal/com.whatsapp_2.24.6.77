package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C07340Xg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.SuggestionRunBlockingCancelable$invoke$1", f = "SuggestionRunBlockingCancelable.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestionRunBlockingCancelable$invoke$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $block;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionRunBlockingCancelable$invoke$1(C023509x r2, C009003v r3) {
        super(2, r2);
        this.$block = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new SuggestionRunBlockingCancelable$invoke$1(r4, this.$block);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SuggestionRunBlockingCancelable$invoke$1((C023509x) obj2, this.$block).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C009003v r0 = this.$block;
            this.label = 1;
            obj = C07340Xg.A00(this, r0, 5000);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }
}

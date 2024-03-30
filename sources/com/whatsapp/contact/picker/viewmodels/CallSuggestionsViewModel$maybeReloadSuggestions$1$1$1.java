package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass63R;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1", f = "CallSuggestionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ CallSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1(CallSuggestionsViewModel callSuggestionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = callSuggestionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            return ((AnonymousClass63R) this.this$0.A07.getValue()).A00(this.this$0.A01);
        }
        throw AnonymousClass000.A0e();
    }
}

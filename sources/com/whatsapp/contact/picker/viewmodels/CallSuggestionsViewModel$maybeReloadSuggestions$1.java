package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C07340Xg;
import X.C10810fG;
import X.C19970wo;
import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel$maybeReloadSuggestions$1", f = "CallSuggestionsViewModel.kt", i = {0, 0, 0}, l = {96}, m = "invokeSuspend", n = {"suggestions", "$this$measureTimeUsingUptimeMillis$iv", "start$iv"}, s = {"L$0", "L$1", "J$0"})
public final class CallSuggestionsViewModel$maybeReloadSuggestions$1 extends AnonymousClass0A1 implements C009003v {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ CallSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallSuggestionsViewModel$maybeReloadSuggestions$1(CallSuggestionsViewModel callSuggestionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = callSuggestionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CallSuggestionsViewModel$maybeReloadSuggestions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallSuggestionsViewModel$maybeReloadSuggestions$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C10810fG r7;
        CallSuggestionsViewModel callSuggestionsViewModel;
        long uptimeMillis;
        C10810fG r2;
        AnonymousClass0AO r10 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r7 = new C10810fG();
            callSuggestionsViewModel = this.this$0;
            C19970wo r6 = callSuggestionsViewModel.A05;
            uptimeMillis = SystemClock.uptimeMillis();
            CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1 callSuggestionsViewModel$maybeReloadSuggestions$1$1$1 = new CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1(callSuggestionsViewModel, (C023509x) null);
            this.L$0 = r7;
            this.L$1 = r6;
            this.L$2 = r7;
            this.L$3 = callSuggestionsViewModel;
            this.J$0 = uptimeMillis;
            this.label = 1;
            obj = C07340Xg.A00(this, callSuggestionsViewModel$maybeReloadSuggestions$1$1$1, 5000);
            if (obj == r10) {
                return r10;
            }
            r2 = r7;
        } else if (i == 1) {
            uptimeMillis = this.J$0;
            callSuggestionsViewModel = (CallSuggestionsViewModel) this.L$3;
            r7 = (C10810fG) this.L$2;
            r2 = (C10810fG) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        r7.element = obj;
        callSuggestionsViewModel.A00 = SystemClock.uptimeMillis() - uptimeMillis;
        Object obj2 = r2.element;
        if (obj2 != null) {
            this.this$0.A03.A0C(obj2);
        }
        return AnonymousClass0AJ.A00;
    }
}

package com.whatsapp.search;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C001600r;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$initSearch$1", f = "AISearchTypeAheadSuggestionsProvider.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class AISearchTypeAheadSuggestionsProvider$initSearch$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $query;
    public int label;
    public final /* synthetic */ AISearchTypeAheadSuggestionsProvider this$0;

    @DebugMetadata(c = "com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$initSearch$1$1", f = "AISearchTypeAheadSuggestionsProvider.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$initSearch$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(str, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C001600r r2;
            AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                try {
                    AISearchTypeAheadSuggestionsProvider aISearchTypeAheadSuggestionsProvider = AISearchTypeAheadSuggestionsProvider.this;
                    r2 = aISearchTypeAheadSuggestionsProvider.A00;
                    String str = str;
                    this.L$0 = r2;
                    this.label = 1;
                    obj = aISearchTypeAheadSuggestionsProvider.A00(str, this);
                    if (obj == r4) {
                        return r4;
                    }
                } catch (Exception unused) {
                }
            } else if (i == 1) {
                r2 = (C001600r) this.L$0;
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            r2.A0C(obj);
            return AnonymousClass0AJ.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AISearchTypeAheadSuggestionsProvider$initSearch$1(AISearchTypeAheadSuggestionsProvider aISearchTypeAheadSuggestionsProvider, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = aISearchTypeAheadSuggestionsProvider;
        this.$query = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AISearchTypeAheadSuggestionsProvider$initSearch$1(this.this$0, this.$query, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final AISearchTypeAheadSuggestionsProvider aISearchTypeAheadSuggestionsProvider = this.this$0;
            C005502l r3 = aISearchTypeAheadSuggestionsProvider.A01;
            final String str = this.$query;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AISearchTypeAheadSuggestionsProvider$initSearch$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

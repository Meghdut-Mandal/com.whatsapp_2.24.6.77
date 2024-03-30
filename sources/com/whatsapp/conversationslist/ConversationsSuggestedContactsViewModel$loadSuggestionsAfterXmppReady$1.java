package com.whatsapp.conversationslist;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1", f = "ConversationsSuggestedContactsViewModel.kt", i = {}, l = {140, 147}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ ConversationsSuggestedContactsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = conversationsSuggestedContactsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x005f
            if (r0 != r5) goto L_0x007b
            X.AnonymousClass0AN.A00(r11)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r11)
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            java.util.Set r9 = r0.A0S()
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            int r3 = r9.size()
            X.0yC r1 = r0.A07
            r0 = 7580(0x1d9c, float:1.0622E-41)
            int r0 = r1.A07(r0)
            boolean r0 = X.C90504aG.A1U(r3, r0)
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r1 = r10.this$0
            if (r0 != 0) goto L_0x0036
            X.5Se r0 = X.C108105Se.CONVERSATIONS_THRESHOLD_REACHED
            r1.A00 = r0
            goto L_0x000f
        L_0x0036:
            X.5Se r0 = X.C108105Se.IN_PROGRESS
            r1.A00 = r0
            X.1Rs r0 = r1.A08
            X.C36341k9.A19(r0, r2)
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            X.005 r0 = r0.A0D
            java.lang.Object r6 = r0.get()
            com.whatsapp.suggestions.SuggestionsEngine r6 = (com.whatsapp.suggestions.SuggestionsEngine) r6
            r11 = 8
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            X.0yC r0 = r0.A07
            X.6zG r7 = new X.6zG
            r7.<init>(r0)
            r10.label = r2
            java.lang.String r8 = "CHAT_LIST_SCREEN"
            java.lang.Object r11 = r6.A01(r7, r8, r9, r10, r11)
            if (r11 != r4) goto L_0x0062
            return r4
        L_0x005f:
            X.AnonymousClass0AN.A00(r11)
        L_0x0062:
            X.011 r11 = (X.AnonymousClass011) r11
            X.02m r0 = X.AnonymousClass19R.A00
            X.03P r3 = X.C36401kF.A0y()
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r2 = r10.this$0
            r1 = 0
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1$1 r0 = new com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1$1
            r0.<init>(r2, r11, r1)
            r10.label = r5
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r10, r3, r0)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

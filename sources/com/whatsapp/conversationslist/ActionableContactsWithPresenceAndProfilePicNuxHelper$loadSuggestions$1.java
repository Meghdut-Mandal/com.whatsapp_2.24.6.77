package com.whatsapp.conversationslist;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C33361fC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1", f = "ActionableContactsWithPresenceAndProfilePicNuxHelper.kt", i = {}, l = {89, 94}, m = "invokeSuspend", n = {}, s = {})
public final class ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C33361fC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1(C33361fC r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x002f
            if (r0 != r5) goto L_0x004b
            X.AnonymousClass0AN.A00(r11)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r11)
            X.1fC r0 = r10.this$0
            com.whatsapp.suggestions.SuggestionsEngine r6 = r0.A05
            r11 = 15
            X.02c r9 = X.C004702c.A00
            X.0yC r0 = r0.A04
            X.6zH r7 = new X.6zH
            r7.<init>(r0)
            r10.label = r1
            java.lang.String r8 = "LANDING_SCREEN"
            java.lang.Object r11 = r6.A01(r7, r8, r9, r10, r11)
            if (r11 != r4) goto L_0x0032
            return r4
        L_0x002f:
            X.AnonymousClass0AN.A00(r11)
        L_0x0032:
            X.011 r11 = (X.AnonymousClass011) r11
            X.02m r0 = X.AnonymousClass19R.A00
            X.03P r3 = X.C36401kF.A0y()
            X.1fC r2 = r10.this$0
            r1 = 0
            com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1$1 r0 = new com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1$1
            r0.<init>(r11, r1)
            r10.label = r5
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r10, r3, r0)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

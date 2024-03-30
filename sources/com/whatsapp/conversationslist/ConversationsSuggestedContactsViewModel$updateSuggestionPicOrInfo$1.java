package com.whatsapp.conversationslist;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass3IF;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$updateSuggestionPicOrInfo$1", f = "ConversationsSuggestedContactsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationsSuggestedContactsViewModel$updateSuggestionPicOrInfo$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $jid;
    public int label;
    public final /* synthetic */ ConversationsSuggestedContactsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsSuggestedContactsViewModel$updateSuggestionPicOrInfo$1(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel, AnonymousClass11F r3, C023509x r4) {
        super(2, r4);
        this.this$0 = conversationsSuggestedContactsViewModel;
        this.$jid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ConversationsSuggestedContactsViewModel$updateSuggestionPicOrInfo$1(this.this$0, this.$jid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            int i = 0;
            int size = this.this$0.A02.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (AnonymousClass00C.A0J(((AnonymousClass3IF) this.this$0.A02.get(i)).A00.A0H, this.$jid)) {
                    AnonymousClass141 A08 = this.this$0.A06.A08(this.$jid);
                    if (A08 != null) {
                        ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel = this.this$0;
                        ((AnonymousClass3IF) conversationsSuggestedContactsViewModel.A02.get(i)).A00 = A08;
                        conversationsSuggestedContactsViewModel.A0A.A0C(conversationsSuggestedContactsViewModel.A02);
                    }
                } else {
                    i++;
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConversationsSuggestedContactsViewModel$updateSuggestionPicOrInfo$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

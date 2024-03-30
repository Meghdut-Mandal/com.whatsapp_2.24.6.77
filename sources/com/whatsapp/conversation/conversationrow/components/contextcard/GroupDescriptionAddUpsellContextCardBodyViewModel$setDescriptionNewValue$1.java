package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellContextCardBodyViewModel$setDescriptionNewValue$1", f = "GroupDescriptionAddUpsellContextCardBodyViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
public final class GroupDescriptionAddUpsellContextCardBodyViewModel$setDescriptionNewValue$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $value;
    public int label;
    public final /* synthetic */ GroupDescriptionAddUpsellContextCardBodyViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDescriptionAddUpsellContextCardBodyViewModel$setDescriptionNewValue$1(GroupDescriptionAddUpsellContextCardBodyViewModel groupDescriptionAddUpsellContextCardBodyViewModel, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = groupDescriptionAddUpsellContextCardBodyViewModel;
        this.$value = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new GroupDescriptionAddUpsellContextCardBodyViewModel$setDescriptionNewValue$1(this.this$0, this.$value, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            GroupDescriptionAddUpsellContextCardBodyViewModel groupDescriptionAddUpsellContextCardBodyViewModel = this.this$0;
            String str = this.$value;
            this.label = 1;
            if (GroupDescriptionAddUpsellContextCardBodyViewModel.A01(groupDescriptionAddUpsellContextCardBodyViewModel, str, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupDescriptionAddUpsellContextCardBodyViewModel$setDescriptionNewValue$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

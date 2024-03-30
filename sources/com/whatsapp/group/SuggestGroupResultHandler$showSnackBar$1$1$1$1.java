package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass3B1;
import X.C009003v;
import X.C023509x;
import X.C36371kC;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.SuggestGroupResultHandler$showSnackBar$1$1$1$1", f = "SuggestGroupResultHandler.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestGroupResultHandler$showSnackBar$1$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $cancelGroupJid;
    public final /* synthetic */ AnonymousClass147 $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ AnonymousClass3B1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestGroupResultHandler$showSnackBar$1$1$1$1(AnonymousClass3B1 r2, AnonymousClass147 r3, AnonymousClass147 r4, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$linkedParentGroupJid = r3;
        this.$cancelGroupJid = r4;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new SuggestGroupResultHandler$showSnackBar$1$1$1$1(this.this$0, this.$linkedParentGroupJid, this.$cancelGroupJid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            MemberSuggestedGroupsManager memberSuggestedGroupsManager = this.this$0.A05;
            AnonymousClass147 r5 = this.$linkedParentGroupJid;
            List A11 = C36371kC.A11(this.$cancelGroupJid);
            this.label = 1;
            if (memberSuggestedGroupsManager.A03.A00(r5, (List) null, (List) null, A11, this) == r3) {
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
        return ((SuggestGroupResultHandler$showSnackBar$1$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

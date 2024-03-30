package com.whatsapp.community.subgroup;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass3BL;
import X.C009003v;
import X.C023509x;
import X.C586530n;
import X.C81093wS;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.CommunitySubgroupsObserver$groupDataChangeListener$1$1$2", f = "CommunitySubgroupsObserver.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class CommunitySubgroupsObserver$groupDataChangeListener$1$1$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $jid;
    public final /* synthetic */ AnonymousClass11F $nonNullChatJid;
    public int label;
    public final /* synthetic */ AnonymousClass3BL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySubgroupsObserver$groupDataChangeListener$1$1$2(AnonymousClass3BL r2, AnonymousClass11F r3, AnonymousClass11F r4, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$jid = r3;
        this.$nonNullChatJid = r4;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new CommunitySubgroupsObserver$groupDataChangeListener$1$1$2(this.this$0, this.$jid, this.$nonNullChatJid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3BL r3 = this.this$0;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r3.A0E, new CommunitySubgroupsObserver$getCommunitySubgroups$2(r3, (C023509x) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (((Set) obj).contains(this.$jid)) {
            AnonymousClass11F r5 = this.$nonNullChatJid;
            for (C586530n r32 : (Iterable) this.this$0.A0H.getValue()) {
                AnonymousClass00C.A0B(r5);
                r32.A00.A0t.execute(new C81093wS((Object) r32, 0));
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunitySubgroupsObserver$groupDataChangeListener$1$1$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

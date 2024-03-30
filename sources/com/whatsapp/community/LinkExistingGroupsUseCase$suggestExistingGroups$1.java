package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.AnonymousClass147;
import X.AnonymousClass343;
import X.C009003v;
import X.C023509x;
import X.C26591Kt;
import X.C36331k8;
import X.C36371kC;
import X.C46222Vo;
import X.C75043ma;
import com.whatsapp.R;
import com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper;
import com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.LinkExistingGroupsUseCase$suggestExistingGroups$1", f = "LinkExistingGroupsUseCase.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class LinkExistingGroupsUseCase$suggestExistingGroups$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $jids;
    public final /* synthetic */ AnonymousClass147 $parentGroupJid;
    public int label;
    public final /* synthetic */ AnonymousClass343 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkExistingGroupsUseCase$suggestExistingGroups$1(AnonymousClass343 r2, AnonymousClass147 r3, List list, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$parentGroupJid = r3;
        this.$jids = list;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new LinkExistingGroupsUseCase$suggestExistingGroups$1(this.this$0, this.$parentGroupJid, this.$jids, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass343 r4 = this.this$0;
            AnonymousClass147 r6 = this.$parentGroupJid;
            List list = this.$jids;
            this.label = 1;
            if (list.isEmpty()) {
                obj = new C46222Vo(R.string.f12nameremoved);
            } else {
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    GroupJid A02 = GroupJid.Companion.A02(AnonymousClass001.A0C(it));
                    if (A02 != null) {
                        A0I.add(A02);
                    }
                }
                AnonymousClass0AR A12 = C36371kC.A12(this);
                CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper = r4.A00;
                C75043ma r42 = new C75043ma(r6, A0I, A12);
                AnonymousClass00C.A0D(r6, 0);
                C36331k8.A1T(new CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1(r42, createSubGroupSuggestionProtocolHelper, r6, A0I, (C023509x) null), C26591Kt.A00);
                obj = A12.A0G();
            }
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LinkExistingGroupsUseCase$suggestExistingGroups$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

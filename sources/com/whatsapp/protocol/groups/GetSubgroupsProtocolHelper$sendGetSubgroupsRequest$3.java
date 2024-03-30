package com.whatsapp.protocol.groups;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.AnonymousClass147;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.C009003v;
import X.C023509x;
import X.C203399nx;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C76573p6;
import com.whatsapp.jid.Jid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3", f = "GetSubgroupsProtocolHelper.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
public final class GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ AnonymousClass147 $parentGroupJid;
    public final /* synthetic */ AnonymousClass147 $participatingSubgroupJid;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ GetSubgroupsProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3(AnonymousClass147 r2, AnonymousClass147 r3, GetSubgroupsProtocolHelper getSubgroupsProtocolHelper, String str, C023509x r6) {
        super(2, r6);
        this.this$0 = getSubgroupsProtocolHelper;
        this.$iqId = str;
        this.$parentGroupJid = r2;
        this.$participatingSubgroupJid = r3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3(this.$parentGroupJid, this.$participatingSubgroupJid, this.this$0, this.$iqId, r8);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj2);
            GetSubgroupsProtocolHelper getSubgroupsProtocolHelper = this.this$0;
            String str = this.$iqId;
            AnonymousClass147 r9 = this.$parentGroupJid;
            AnonymousClass147 r2 = this.$participatingSubgroupJid;
            this.L$0 = getSubgroupsProtocolHelper;
            this.L$1 = str;
            this.L$2 = r9;
            this.L$3 = r2;
            this.label = 1;
            AnonymousClass0AR A12 = C36371kC.A12(this);
            int A04 = C36361kB.A04(str, r9, 1);
            AnonymousClass19A r11 = getSubgroupsProtocolHelper.A01;
            C203399nx r22 = new C203399nx("sub_groups", r2 != null ? new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) r2, "sub_group_jid")} : null);
            AnonymousClass1AL[] r1 = new AnonymousClass1AL[4];
            C36331k8.A1R(str, r1, 0);
            C36341k9.A1S(r1, 1);
            C36331k8.A1B(r9, "get", r1, A04);
            r11.A0E(new C76573p6(getSubgroupsProtocolHelper.A00, A12), C36391kE.A0m(r22, r1), str, 297, 32000);
            obj2 = A12.A0G();
            if (obj2 == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj2);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetSubgroupsProtocolHelper$sendGetSubgroupsRequest$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

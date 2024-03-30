package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.C009003v;
import X.C023509x;
import X.C595634k;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.GetSubgroupsManager$getSubgroups$1", f = "GetSubgroupsManager.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class GetSubgroupsManager$getSubgroups$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $parentGroupJid;
    public final /* synthetic */ AnonymousClass147 $participatingSubgroupJid;
    public final /* synthetic */ boolean $useMex;
    public int label;
    public final /* synthetic */ GetSubgroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSubgroupsManager$getSubgroups$1(GetSubgroupsManager getSubgroupsManager, AnonymousClass147 r3, AnonymousClass147 r4, C023509x r5, boolean z) {
        super(2, r5);
        this.this$0 = getSubgroupsManager;
        this.$parentGroupJid = r3;
        this.$participatingSubgroupJid = r4;
        this.$useMex = z;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new GetSubgroupsManager$getSubgroups$1(this.this$0, this.$parentGroupJid, this.$participatingSubgroupJid, r8, this.$useMex);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            GetSubgroupsManager getSubgroupsManager = this.this$0;
            AnonymousClass147 r2 = this.$parentGroupJid;
            AnonymousClass147 r1 = this.$participatingSubgroupJid;
            boolean z = this.$useMex;
            this.label = 1;
            if (!z || r1 == null) {
                A00 = GetSubgroupsManager.A00(new C595634k(getSubgroupsManager, r2), getSubgroupsManager, r2, r1, this);
            } else {
                A00 = GetSubgroupsManager.A01(getSubgroupsManager, r2, r1, this);
            }
            if (A00 == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetSubgroupsManager$getSubgroups$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

package com.whatsapp.protocol;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.AnonymousClass147;
import X.C009003v;
import X.C023509x;
import X.C237919w;
import X.C36371kC;
import X.C75223ms;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2", f = "SetGroupDescriptionProtocolHelper.kt", i = {0}, l = {148}, m = "invokeSuspend", n = {"newId"}, s = {"L$0"})
public final class SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $descriptionId;
    public final /* synthetic */ AnonymousClass147 $groupJid;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ SetGroupDescriptionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2(AnonymousClass147 r2, SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper, String str, String str2, C023509x r6) {
        super(2, r6);
        this.$description = str;
        this.this$0 = setGroupDescriptionProtocolHelper;
        this.$groupJid = r2;
        this.$descriptionId = str2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        String str = this.$description;
        return new SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2(this.$groupJid, this.this$0, str, this.$descriptionId, r8);
    }

    public final Object invokeSuspend(Object obj) {
        String A00;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            String str = this.$description;
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                A00 = null;
            } else {
                SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper = this.this$0;
                A00 = C237919w.A00(setGroupDescriptionProtocolHelper.A00, setGroupDescriptionProtocolHelper.A01);
            }
            SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper2 = this.this$0;
            AnonymousClass147 r5 = this.$groupJid;
            String str2 = this.$descriptionId;
            String str3 = this.$description;
            this.L$0 = A00;
            this.L$1 = setGroupDescriptionProtocolHelper2;
            this.L$2 = r5;
            this.L$3 = str2;
            this.L$4 = str3;
            this.label = 1;
            AnonymousClass0AR A12 = C36371kC.A12(this);
            setGroupDescriptionProtocolHelper2.A03.A05(new C75223ms(r5, setGroupDescriptionProtocolHelper2, A12), r5, str2, A00, str3);
            obj = A12.A0G();
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
        return ((SetGroupDescriptionProtocolHelper$sendSetSubgroupDescription$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

package com.whatsapp.protocol;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03N;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass4RT;
import X.C009003v;
import X.C023509x;
import X.C36341k9;
import X.C77083pv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1", f = "SetGroupDescriptionProtocolHelper.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass4RT $callback;
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $descriptionId;
    public final /* synthetic */ AnonymousClass147 $groupJid;
    public int label;
    public final /* synthetic */ SetGroupDescriptionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1(AnonymousClass147 r2, AnonymousClass4RT r3, SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper, String str, String str2, C023509x r7) {
        super(2, r7);
        this.this$0 = setGroupDescriptionProtocolHelper;
        this.$groupJid = r2;
        this.$descriptionId = str;
        this.$description = str2;
        this.$callback = r3;
    }

    public final C023509x create(Object obj, C023509x r9) {
        SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper = this.this$0;
        return new SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1(this.$groupJid, this.$callback, setGroupDescriptionProtocolHelper, this.$descriptionId, this.$description, r9);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper = this.this$0;
            AnonymousClass147 r2 = this.$groupJid;
            String str = this.$descriptionId;
            String str2 = this.$description;
            this.label = 1;
            A00 = setGroupDescriptionProtocolHelper.A00(r2, str, str2, this);
            if (A00 == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
            A00 = ((AnonymousClass0AK) obj).value;
        } else {
            throw AnonymousClass000.A0e();
        }
        if (!(A00 instanceof AnonymousClass03N)) {
            C36341k9.A19(((C77083pv) this.$callback).A00.A0q, false);
        } else {
            Throwable A002 = AnonymousClass0AK.A00(A00);
            if (A002 != null) {
                this.$callback.onError(A002);
            } else {
                this.$callback.onError(AnonymousClass001.A0A("Expected an exception cause but got null instead"));
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SetGroupDescriptionProtocolHelper$sendSetSubgroupDescriptionAsync$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

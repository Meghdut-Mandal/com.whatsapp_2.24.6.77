package com.whatsapp.group.iq;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03N;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.C009003v;
import X.C023509x;
import X.C40051uf;
import X.C75183mo;
import X.C87864Ql;
import com.whatsapp.group.GetSubgroupsManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1", f = "GetGroupInfoProtocolHelper.kt", i = {0}, l = {70}, m = "invokeSuspend", n = {"iqId"}, s = {"L$0"})
public final class GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C87864Ql $callback;
    public final /* synthetic */ AnonymousClass147 $groupJid;
    public final /* synthetic */ String $requestType;
    public final /* synthetic */ int $syncDeviceType;
    public Object L$0;
    public int label;
    public final /* synthetic */ GetGroupInfoProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C87864Ql r3, AnonymousClass147 r4, String str, C023509x r6, int i) {
        super(2, r6);
        this.this$0 = getGroupInfoProtocolHelper;
        this.$groupJid = r4;
        this.$syncDeviceType = i;
        this.$requestType = str;
        this.$callback = r3;
    }

    public final C023509x create(Object obj, C023509x r9) {
        GetGroupInfoProtocolHelper getGroupInfoProtocolHelper = this.this$0;
        AnonymousClass147 r3 = this.$groupJid;
        int i = this.$syncDeviceType;
        return new GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1(getGroupInfoProtocolHelper, this.$callback, r3, this.$requestType, r9, i);
    }

    public final Object invokeSuspend(Object obj) {
        Object A01;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            String A09 = this.this$0.A05.A09();
            GetGroupInfoProtocolHelper getGroupInfoProtocolHelper = this.this$0;
            AnonymousClass147 r2 = this.$groupJid;
            int i2 = this.$syncDeviceType;
            String str = this.$requestType;
            this.L$0 = A09;
            this.label = 1;
            A01 = getGroupInfoProtocolHelper.A01(r2, str, this, i2);
            if (A01 == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
            A01 = ((AnonymousClass0AK) obj).value;
        } else {
            throw AnonymousClass000.A0e();
        }
        if (!(A01 instanceof AnonymousClass03N)) {
            C87864Ql r0 = this.$callback;
            AnonymousClass0AN.A00(A01);
            C40051uf r1 = ((C75183mo) r0).A00;
            GetSubgroupsManager getSubgroupsManager = r1.A0b;
            AnonymousClass147 r4 = r1.A0h;
            getSubgroupsManager.A03(r4);
            C40051uf.A03(r1);
            AnonymousClass141 r02 = r1.A04;
            if (r02 != null) {
                r1.A0k.A02(r4, (AnonymousClass147) null, r02.A06, 2);
            }
        } else {
            Throwable A00 = AnonymousClass0AK.A00(A01);
            if (A00 != null) {
                this.$callback.onError(A00);
            } else {
                this.$callback.onError(AnonymousClass001.A0A("Expected exception cause but got null"));
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

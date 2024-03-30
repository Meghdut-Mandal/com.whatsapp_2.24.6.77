package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass000;
import X.AnonymousClass011;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5TS;
import X.AnonymousClass691;
import X.C009003v;
import X.C023509x;
import X.C203639oR;
import X.C26501Kk;
import X.C26551Kp;
import X.C36331k8;
import X.C36381kD;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ AnonymousClass691 $phoenixSessionConfig;
    public final /* synthetic */ UserJid $senderJid;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1(PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, UserJid userJid, AnonymousClass691 r4, String str, String str2, C023509x r7) {
        super(2, r7);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$phoenixSessionConfig = r4;
        this.$flowId = str;
        this.$messageId = str2;
        this.$senderJid = userJid;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1(this.this$0, this.$senderJid, this.$phoenixSessionConfig, this.$flowId, this.$messageId, r9);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        String str2 = null;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines2 = this.this$0;
            phoenixFlowsManagerWithCoroutines2.A01 = phoenixFlowsManagerWithCoroutines2.A02.A00(this.$phoenixSessionConfig);
            str = this.$flowId;
            if (str != null) {
                phoenixFlowsManagerWithCoroutines = this.this$0;
                String str3 = this.$messageId;
                AnonymousClass691 r0 = this.$phoenixSessionConfig;
                UserJid userJid = this.$senderJid;
                C26551Kp r6 = phoenixFlowsManagerWithCoroutines.A0J;
                int hashCode = str.hashCode();
                AnonymousClass5TS r7 = AnonymousClass5TS.PREFETCH_MESSAGE;
                if (r0 != null) {
                    str2 = r0.A00;
                }
                r6.A0C(r7, userJid, false, str, str3, str2, hashCode);
                C26501Kk r02 = phoenixFlowsManagerWithCoroutines.A0E;
                this.L$0 = phoenixFlowsManagerWithCoroutines;
                this.L$1 = str;
                this.label = 1;
                obj = r02.A01(str, this, hashCode);
                if (obj == r2) {
                    return r2;
                }
            }
            return AnonymousClass0AJ.A00;
        } else if (i == 1) {
            str = (String) this.L$1;
            phoenixFlowsManagerWithCoroutines = (PhoenixFlowsManagerWithCoroutines) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass011 r15 = (AnonymousClass011) obj;
        boolean A1X = AnonymousClass000.A1X(r15.first);
        String str4 = (String) r15.second;
        int i2 = 3;
        if (A1X) {
            i2 = 2;
        }
        phoenixFlowsManagerWithCoroutines.A0J.A05(str.hashCode(), (short) i2);
        if (A1X) {
            C203639oR r03 = phoenixFlowsManagerWithCoroutines.A01;
            if (r03 == null) {
                throw C36331k8.A0d("fdsManager");
            } else if (str4 != null) {
                r03.A0E(str, str4);
            } else {
                throw C36381kD.A0k();
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

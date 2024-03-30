package com.whatsapp.inappsupport.network;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19A;
import X.AnonymousClass3DU;
import X.AnonymousClass3IT;
import X.AnonymousClass3ME;
import X.C009003v;
import X.C023509x;
import X.C177768eL;
import X.C177778eM;
import X.C186018vH;
import X.C1900196o;
import X.C203379ns;
import X.C203399nx;
import X.C203539oF;
import X.C33761ft;
import X.C36341k9;
import X.C50542l5;
import X.C592133b;
import X.C602136x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2", f = "SendSupportMessageFeedbackProtocolHelper.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"sendFeedbackRequest"}, s = {"L$0"})
public final class SendSupportMessageFeedbackProtocolHelper$sendFeedback$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3IT $supportMessageFeedback;
    public Object L$0;
    public int label;
    public final /* synthetic */ C602136x this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendSupportMessageFeedbackProtocolHelper$sendFeedback$2(AnonymousClass3IT r2, C602136x r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$supportMessageFeedback = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new SendSupportMessageFeedbackProtocolHelper$sendFeedback$2(this.$supportMessageFeedback, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C592133b r1;
        String str;
        C33761ft r12;
        int i;
        Object obj2 = obj;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AnonymousClass0AN.A00(obj2);
            String A09 = this.this$0.A01.A09();
            AnonymousClass3IT r0 = this.$supportMessageFeedback;
            String str2 = r0.A00;
            List list = r0.A01;
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0A = C36341k9.A0A(it);
                if (A0A == 0) {
                    str = "positive";
                } else if (A0A == 1) {
                    str = "negative_irrelevant";
                } else if (A0A == 2) {
                    str = "negative_inaccurate";
                } else if (A0A == 3) {
                    str = "negative_repetitive";
                } else if (A0A == 4) {
                    str = "negative_harmful";
                } else if (A0A == 5) {
                    str = "negative_other";
                }
                A0I.add(new C50542l5(str));
            }
            r1 = new C186018vH(A09, str2, (List) A0I);
            AnonymousClass19A r7 = this.this$0.A01;
            C203399nx r8 = r1.A00;
            AnonymousClass00C.A08(r8);
            this.L$0 = r1;
            this.label = 1;
            obj2 = r7.A08(r8, A09, this, 441, 32000, false);
            if (obj2 == r2) {
                return r2;
            }
        } else if (i2 == 1) {
            r1 = (C592133b) this.L$0;
            AnonymousClass0AN.A00(obj2);
        } else {
            throw AnonymousClass000.A0e();
        }
        C1900196o r3 = (C1900196o) obj2;
        if (r3 instanceof C177778eM) {
            C203399nx r32 = ((C177778eM) r3).A00;
            C203399nx.A0A(r32, "iq");
            C203399nx r22 = r1.A00;
            C203379ns.A03(r32, String.class, -9007199254740991L, 9007199254740991L, "Success", new String[]{"result", "status"}, false);
            C203539oF.A06(r32, new AnonymousClass3DU(r22, 3), new String[0]);
            r12 = this.this$0.A00;
            i = 14;
        } else {
            if (r3 instanceof C177768eL) {
                AnonymousClass3ME.A01(((C177768eL) r3).A00);
                r12 = this.this$0.A00;
                i = 13;
            }
            return AnonymousClass0AJ.A00;
        }
        r12.A01(i);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SendSupportMessageFeedbackProtocolHelper$sendFeedback$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

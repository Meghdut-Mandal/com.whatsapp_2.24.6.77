package com.whatsapp.areffects.flmconsent.protocol;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19A;
import X.AnonymousClass3ME;
import X.AnonymousClass5PT;
import X.AnonymousClass8US;
import X.AnonymousClass8UT;
import X.AnonymousClass9H8;
import X.C009003v;
import X.C023509x;
import X.C148206yU;
import X.C177768eL;
import X.C177778eM;
import X.C177788eN;
import X.C186008vG;
import X.C1900196o;
import X.C203399nx;
import X.C203539oF;
import X.C23214B9w;
import X.C36321k7;
import X.C90514aH;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.flmconsent.protocol.GetFlmConsentResultProtocol$sendRequest$2", f = "GetFlmConsentResultProtocol.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class GetFlmConsentResultProtocol$sendRequest$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C186008vG $request;
    public int label;
    public final /* synthetic */ AnonymousClass9H8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetFlmConsentResultProtocol$sendRequest$2(AnonymousClass9H8 r2, C186008vG r3, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$iqId = str;
        this.$request = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new GetFlmConsentResultProtocol$sendRequest$2(this.this$0, this.$request, this.$iqId, r6);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass19A r4 = this.this$0.A00;
            String str = this.$iqId;
            C203399nx r5 = this.$request.A00;
            AnonymousClass00C.A08(r5);
            this.label = 1;
            obj = r4.A08(r5, str, this, 400, 32000, false);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C1900196o r13 = (C1900196o) obj;
        if (r13 instanceof C177778eM) {
            Log.i("GetFlmConsentResultProtocol Success");
            C203399nx r6 = ((C177778eM) r13).A00;
            C203539oF.A0B(r6, new C23214B9w(C90514aH.A0e(r6, this.$request), 23));
            Number number = (Number) ((AnonymousClass5PT) C203539oF.A03(r6, C148206yU.A00, "avatar_consent_result")).A00;
            if (number != null) {
                long longValue = number.longValue();
                if (longValue == 1) {
                    z = true;
                } else if (longValue == 2) {
                    z = false;
                }
                return new AnonymousClass8UT(z);
            }
            z = null;
            return new AnonymousClass8UT(z);
        } else if (r13 instanceof C177768eL) {
            int A00 = AnonymousClass3ME.A00(((C177768eL) r13).A00);
            C36321k7.A1S("GetFlmConsentResultProtocol Error: ", AnonymousClass000.A0u(), A00);
            return new AnonymousClass8US(A00);
        } else if (AnonymousClass00C.A0J(r13, C177788eN.A00)) {
            Log.e("GetFlmConsentResultProtocol Delivery failure");
            return new AnonymousClass8US(-1);
        } else {
            C36321k7.A1J(r13, "GetFlmConsentResultProtocol Unknown response: ", AnonymousClass000.A0u());
            return new AnonymousClass8US(0);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetFlmConsentResultProtocol$sendRequest$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

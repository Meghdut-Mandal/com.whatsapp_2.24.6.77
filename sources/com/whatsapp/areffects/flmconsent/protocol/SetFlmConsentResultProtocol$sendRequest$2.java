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
import X.AnonymousClass8UU;
import X.AnonymousClass8UV;
import X.AnonymousClass9H9;
import X.C009003v;
import X.C023509x;
import X.C177768eL;
import X.C177778eM;
import X.C177788eN;
import X.C186008vG;
import X.C1900196o;
import X.C203399nx;
import X.C36321k7;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.flmconsent.protocol.SetFlmConsentResultProtocol$sendRequest$2", f = "SetFlmConsentResultProtocol.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
public final class SetFlmConsentResultProtocol$sendRequest$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C186008vG $request;
    public int label;
    public final /* synthetic */ AnonymousClass9H9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetFlmConsentResultProtocol$sendRequest$2(AnonymousClass9H9 r2, C186008vG r3, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$iqId = str;
        this.$request = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new SetFlmConsentResultProtocol$sendRequest$2(this.this$0, this.$request, this.$iqId, r6);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass19A r3 = this.this$0.A00;
            String str = this.$iqId;
            C203399nx r4 = this.$request.A00;
            AnonymousClass00C.A08(r4);
            this.label = 1;
            obj = r3.A08(r4, str, this, 401, 32000, false);
            if (obj == r2) {
                return r2;
            }
        } else if (i2 == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C1900196o r12 = (C1900196o) obj;
        if (r12 instanceof C177778eM) {
            Log.i("SetFlmConsentResultProtocol Success");
            return AnonymousClass8UV.A00;
        } else if (r12 instanceof C177768eL) {
            int A00 = AnonymousClass3ME.A00(((C177768eL) r12).A00);
            C36321k7.A1S("SetFlmConsentResultProtocol Error: ", AnonymousClass000.A0u(), A00);
            return new AnonymousClass8UU(A00);
        } else {
            if (AnonymousClass00C.A0J(r12, C177788eN.A00)) {
                Log.e("SetFlmConsentResultProtocol Delivery failure");
                i = -1;
            } else {
                C36321k7.A1J(r12, "SetFlmConsentResultProtocol Unknown response: ", AnonymousClass000.A0u());
                i = 0;
            }
            return new AnonymousClass8UU(i);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SetFlmConsentResultProtocol$sendRequest$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

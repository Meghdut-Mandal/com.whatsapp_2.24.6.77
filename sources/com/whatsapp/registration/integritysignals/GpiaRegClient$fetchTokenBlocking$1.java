package com.whatsapp.registration.integritysignals;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3AJ;
import X.AnonymousClass3NS;
import X.C009003v;
import X.C023509x;
import X.C13390jn;
import X.C36321k7;
import X.C52842qG;
import android.util.Base64;
import com.google.android.gms.common.api.ApiException;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenBlocking$1", f = "GpiaRegClient.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaRegClient$fetchTokenBlocking$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass3AJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaRegClient$fetchTokenBlocking$1(AnonymousClass3AJ r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new GpiaRegClient$fetchTokenBlocking$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GpiaRegClient$fetchTokenBlocking$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                byte[] A0J = this.this$0.A00.A0J();
                if (A0J == null) {
                    Log.w("GpiaRegClient: Nonce is null, returning.");
                    return new AnonymousClass3NS((String) null, 1005);
                }
                String encodeToString = Base64.encodeToString(A0J, 3);
                AnonymousClass3AJ r3 = this.this$0;
                AnonymousClass00C.A0B(encodeToString);
                this.label = 1;
                obj = AnonymousClass0A2.A00(this, r3.A06, new GpiaRegClient$fetchTokenInternal$2(r3, "reg", encodeToString, (C023509x) null));
                if (obj == r7) {
                    return r7;
                }
            } catch (Exception e) {
                C36321k7.A1J(e, "GpiaRegClient: Exception while executing fetchToken: ", AnonymousClass000.A0u());
                if (e instanceof ApiException) {
                    i = ((ApiException) e).mStatus.A01;
                } else if (e instanceof C52842qG) {
                    i = ((C52842qG) e).errorCode;
                } else {
                    i = 1000;
                    if (e instanceof C13390jn) {
                        i = 1004;
                    }
                }
                return new AnonymousClass3NS((String) null, i);
            }
        } else if (i2 == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return new AnonymousClass3NS((String) obj, 0);
    }
}

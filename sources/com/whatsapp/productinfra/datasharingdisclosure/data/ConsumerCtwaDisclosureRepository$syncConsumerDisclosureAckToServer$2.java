package com.whatsapp.productinfra.datasharingdisclosure.data;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass2b3;
import X.AnonymousClass2b4;
import X.AnonymousClass3EX;
import X.C009003v;
import X.C023509x;
import X.C36351kA;
import X.C36371kC;
import X.C36411kG;
import android.content.SharedPreferences;
import com.whatsapp.productinfra.datasharingdisclosure.data.network.ConsumerCtwaDisclosureProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.datasharingdisclosure.data.ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2", f = "ConsumerCtwaDisclosureRepository.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass3EX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(AnonymousClass3EX r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        SharedPreferences.Editor putBoolean;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            long A08 = C36371kC.A08(C36411kG.A0E(this.this$0.A02.A01), "consumer_disclosure");
            boolean A1U = C36371kC.A1U(C36411kG.A0E(this.this$0.A02.A01), "ack_synced");
            if (A08 != -1 && !A1U) {
                ConsumerCtwaDisclosureProtocolHelper consumerCtwaDisclosureProtocolHelper = this.this$0.A01;
                this.label = 1;
                obj = consumerCtwaDisclosureProtocolHelper.A00(this, A08);
                if (obj == r7) {
                    return r7;
                }
            }
            return AnonymousClass0AJ.A00;
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (AnonymousClass00C.A0J(obj, AnonymousClass2b4.A00)) {
            putBoolean = C36351kA.A0A(this.this$0.A02.A01).putBoolean("ack_synced", true);
        } else {
            if (AnonymousClass00C.A0J(obj, AnonymousClass2b3.A00)) {
                putBoolean = C36351kA.A0A(this.this$0.A02.A01).putBoolean("ack_synced", false);
            }
            return AnonymousClass0AJ.A00;
        }
        putBoolean.apply();
        return AnonymousClass0AJ.A00;
    }
}

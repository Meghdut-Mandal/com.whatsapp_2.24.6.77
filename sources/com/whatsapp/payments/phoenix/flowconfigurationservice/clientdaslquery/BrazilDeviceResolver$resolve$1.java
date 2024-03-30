package com.whatsapp.payments.phoenix.flowconfigurationservice.clientdaslquery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5UN;
import X.AnonymousClass6VM;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import X.C175798b4;
import X.C21328AHg;
import X.C237919w;
import X.C36331k8;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.payments.phoenix.flowconfigurationservice.clientdaslquery.BrazilDeviceResolver$resolve$1", f = "BrazilDeviceResolver.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class BrazilDeviceResolver$resolve$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C175798b4 $card;
    public final /* synthetic */ AnonymousClass5UN $field;
    public int label;
    public final /* synthetic */ C21328AHg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazilDeviceResolver$resolve$1(C175798b4 r2, C21328AHg aHg, AnonymousClass5UN r4, C023509x r5) {
        super(2, r5);
        this.this$0 = aHg;
        this.$card = r2;
        this.$field = r4;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new BrazilDeviceResolver$resolve$1(this.$card, this.this$0, this.$field, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C21328AHg aHg = this.this$0;
            C175798b4 r2 = this.$card;
            this.label = 1;
            if (C009403z.A00(this, new BrazilDeviceResolver$buildBindingData$2(r2, aHg, (C023509x) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C21328AHg aHg2 = this.this$0;
        int ordinal = this.$field.ordinal();
        if (ordinal == 6) {
            String str = aHg2.A00;
            if (str != null) {
                return str;
            }
            throw C36331k8.A0d("clientReferenceId");
        } else if (ordinal == 7) {
            AnonymousClass6VM r1 = aHg2.A07;
            String str2 = aHg2.A01;
            if (str2 != null) {
                return r1.A05(str2);
            }
            throw C36331k8.A0d("networkDeviceId");
        } else if (ordinal == 8) {
            String str3 = aHg2.A01;
            if (str3 == null) {
                throw C36331k8.A0d("networkDeviceId");
            } else if (str3.length() != 0) {
                return str3;
            } else {
                throw AnonymousClass001.A0A("fun resolve networkDeviceId must not be null");
            }
        } else if (ordinal == 9) {
            String str4 = aHg2.A02;
            if (str4 == null) {
                throw C36331k8.A0d("tokenId");
            } else if (str4.length() == 0) {
                throw AnonymousClass001.A0A("fun resolve : tokenId must not be null");
            } else {
                AnonymousClass6VM r22 = aHg2.A07;
                String str5 = aHg2.A01;
                if (str5 == null) {
                    throw C36331k8.A0d("networkDeviceId");
                }
                String str6 = aHg2.A00;
                if (str6 != null) {
                    return r22.A08(str5, str6, str4);
                }
                throw C36331k8.A0d("clientReferenceId");
            }
        } else if (ordinal != 10) {
            return null;
        } else {
            return C237919w.A00(aHg2.A04, aHg2.A05);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BrazilDeviceResolver$resolve$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

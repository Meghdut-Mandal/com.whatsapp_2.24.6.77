package com.whatsapp.waquickpromotionclient.psa;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C188408zX;
import X.C31351bg;
import X.C31531by;
import X.C36321k7;
import X.C592233c;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushAction$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
public final class PushPsaNotificationLogger$logPushAction$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $campaignId;
    public final /* synthetic */ int $eligibilityDuration;
    public final /* synthetic */ C188408zX $qpActionEventEnum;
    public final /* synthetic */ int $surfaceId;
    public int label;
    public final /* synthetic */ C31531by this$0;

    @DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushAction$1$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushAction$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r9) {
            C31531by r1 = C31531by.this;
            int i = i2;
            return new AnonymousClass1(r5, str, r9, i, i3);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                C31351bg r0 = C31531by.this.A01;
                int i = i2;
                String str = str;
                int i2 = i3;
                C188408zX r2 = r5;
                C36321k7.A0y(str, r2);
                r0.A01.A00((C592233c) null, r2, str, i, i2);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushPsaNotificationLogger$logPushAction$1(C31531by r2, C188408zX r3, String str, C023509x r5, int i, int i2) {
        super(2, r5);
        this.this$0 = r2;
        this.$surfaceId = i;
        this.$campaignId = str;
        this.$eligibilityDuration = i2;
        this.$qpActionEventEnum = r3;
    }

    public final C023509x create(Object obj, C023509x r9) {
        C31531by r1 = this.this$0;
        int i = this.$surfaceId;
        return new PushPsaNotificationLogger$logPushAction$1(r1, this.$qpActionEventEnum, this.$campaignId, r9, i, this.$eligibilityDuration);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C31531by r4 = this.this$0;
            C005502l r0 = r4.A02;
            final int i2 = this.$surfaceId;
            final String str = this.$campaignId;
            final int i3 = this.$eligibilityDuration;
            final C188408zX r5 = this.$qpActionEventEnum;
            AnonymousClass1 r3 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PushPsaNotificationLogger$logPushAction$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

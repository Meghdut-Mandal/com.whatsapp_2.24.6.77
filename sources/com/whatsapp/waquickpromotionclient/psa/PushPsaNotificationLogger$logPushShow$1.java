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
import X.C21642ATi;
import X.C31351bg;
import X.C31531by;
import X.C87374On;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class PushPsaNotificationLogger$logPushShow$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C87374On $quickPromotion;
    public final /* synthetic */ int $surfaceId;
    public int label;
    public final /* synthetic */ C31531by this$0;

    @DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(r2, r6, i2);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                C31351bg r1 = C31531by.this.A01;
                int i2 = i2;
                C87374On r0 = r2;
                C188408zX r6 = C188408zX.IMPRESSION;
                this.label = 1;
                C21642ATi aTi = (C21642ATi) r0;
                if (r1.A01.A00(aTi.A06, r6, aTi.A0F, i2, aTi.A00) == r3) {
                    return r3;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushPsaNotificationLogger$logPushShow$1(C31531by r2, C87374On r3, C023509x r4, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$surfaceId = i;
        this.$quickPromotion = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new PushPsaNotificationLogger$logPushShow$1(this.this$0, this.$quickPromotion, r6, this.$surfaceId);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final C31531by r5 = this.this$0;
            C005502l r4 = r5.A02;
            final int i2 = this.$surfaceId;
            final C87374On r2 = this.$quickPromotion;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PushPsaNotificationLogger$logPushShow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

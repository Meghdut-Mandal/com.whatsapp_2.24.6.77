package com.whatsapp.registration.integritysignals;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3AJ;
import X.C009003v;
import X.C023509x;
import X.C07340Xg;
import X.C13390jn;
import X.C188648zz;
import X.C36441kJ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenInternal$2", f = "GpiaRegClient.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaRegClient$fetchTokenInternal$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $location;
    public final /* synthetic */ String $nonce;
    public int label;
    public final /* synthetic */ AnonymousClass3AJ this$0;

    @DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenInternal$2$1", f = "GpiaRegClient.kt", i = {}, l = {102, 104}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenInternal$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(str, str2, r6);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r0 = r7.label
                r6 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0010
                if (r0 == r2) goto L_0x002c
                if (r0 != r6) goto L_0x0051
                X.AnonymousClass0AN.A00(r8)
            L_0x000f:
                return r8
            L_0x0010:
                X.AnonymousClass0AN.A00(r8)
                X.3AJ r0 = X.AnonymousClass3AJ.this
                X.9gZ r0 = r0.A04
                boolean r0 = r0.A04()
                if (r0 != 0) goto L_0x002f
                X.3AJ r0 = X.AnonymousClass3AJ.this
                X.9gZ r1 = r0.A04
                java.lang.String r0 = r5
                r7.label = r2
                java.lang.Object r0 = r1.A01(r0, r7)
                if (r0 != r5) goto L_0x002f
                return r5
            L_0x002c:
                X.AnonymousClass0AN.A00(r8)
            L_0x002f:
                X.3AJ r0 = X.AnonymousClass3AJ.this
                java.lang.String r4 = r2
                java.lang.String r3 = r5
                r7.label = r6
                X.0AR r2 = X.AnonymousClass0AA.A02(r7)
                X.9gZ r1 = r0.A04
                X.6vP r0 = new X.6vP
                r0.<init>(r2)
                r1.A03(r0, r4, r3)
                X.7Xm r0 = X.C155807Xm.A00
                r2.BL1(r0)
                java.lang.Object r8 = r2.A0G()
                if (r8 != r5) goto L_0x000f
                return r5
            L_0x0051:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.integritysignals.GpiaRegClient$fetchTokenInternal$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaRegClient$fetchTokenInternal$2(AnonymousClass3AJ r2, String str, String str2, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$location = str;
        this.$nonce = str2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new GpiaRegClient$fetchTokenInternal$2(this.this$0, this.$location, this.$nonce, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r8 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            long A0B = C36441kJ.A0B(this.this$0.A03, 4263);
            final AnonymousClass3AJ r6 = this.this$0;
            final String str = this.$location;
            final String str2 = this.$nonce;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            Object A00 = C07340Xg.A00(this, r0, A0B);
            if (A00 == r8) {
                return r8;
            }
            return A00;
        } else if (i == 1) {
            try {
                AnonymousClass0AN.A00(obj);
                return obj;
            } catch (C13390jn e) {
                this.this$0.A02.A01(C188648zz.A08, "on_failure_exception/1004", e);
                throw e;
            }
        } else {
            throw AnonymousClass000.A0e();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GpiaRegClient$fetchTokenInternal$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

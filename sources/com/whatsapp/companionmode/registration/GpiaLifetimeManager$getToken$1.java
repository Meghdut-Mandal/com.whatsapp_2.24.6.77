package com.whatsapp.companionmode.registration;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C07340Xg;
import X.C195009Sc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1", f = "GpiaLifetimeManager.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaLifetimeManager$getToken$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C195009Sc this$0;

    @DebugMetadata(c = "com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1$1", f = "GpiaLifetimeManager.kt", i = {}, l = {161, 162}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r0 = r7.label
                r2 = 2
                r1 = 1
                if (r0 == 0) goto L_0x0010
                if (r0 == r1) goto L_0x0022
                if (r0 != r2) goto L_0x0050
                X.AnonymousClass0AN.A00(r8)
            L_0x000f:
                return r8
            L_0x0010:
                X.AnonymousClass0AN.A00(r8)
                X.9Sc r0 = X.C195009Sc.this
                X.03e r0 = r0.A01
                if (r0 == 0) goto L_0x0025
                r7.label = r1
                java.lang.Object r0 = r0.BNp(r7)
                if (r0 != r6) goto L_0x0025
                return r6
            L_0x0022:
                X.AnonymousClass0AN.A00(r8)
            L_0x0025:
                X.9Sc r5 = X.C195009Sc.this
                r7.L$0 = r5
                r7.label = r2
                X.0iM r4 = X.C36411kG.A16(r7)
                X.9gZ r3 = r5.A06
                X.130 r0 = r5.A02
                byte[] r1 = r0.A0J()
                r0 = 3
                java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
                X.AnonymousClass00C.A08(r2)
                X.ADY r1 = new X.ADY
                r1.<init>(r5, r4)
                java.lang.String r0 = "md-pairing"
                r3.A03(r1, r2, r0)
                java.lang.Object r8 = r4.A00()
                if (r8 != r6) goto L_0x000f
                return r6
            L_0x0050:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaLifetimeManager$getToken$1(C195009Sc r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new GpiaLifetimeManager$getToken$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GpiaLifetimeManager$getToken$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            long A07 = (long) this.this$0.A05.A07(7010);
            final C195009Sc r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            obj = C07340Xg.A01(this, r0, A07);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }
}

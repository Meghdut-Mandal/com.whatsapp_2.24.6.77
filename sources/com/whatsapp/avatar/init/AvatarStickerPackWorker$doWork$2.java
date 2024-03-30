package com.whatsapp.avatar.init;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.init.AvatarStickerPackWorker$doWork$2", f = "AvatarStickerPackWorker.kt", i = {0, 0, 0, 0}, l = {56}, m = "invokeSuspend", n = {"$this$withContext", "origin", "originType", "cancelOngoingDownload"}, s = {"L$0", "L$1", "I$0", "Z$0"})
public final class AvatarStickerPackWorker$doWork$2 extends AnonymousClass0A1 implements C009003v {
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ AvatarStickerPackWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackWorker$doWork$2(AvatarStickerPackWorker avatarStickerPackWorker, C023509x r3) {
        super(2, r3);
        this.this$0 = avatarStickerPackWorker;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarStickerPackWorker$doWork$2 avatarStickerPackWorker$doWork$2 = new AvatarStickerPackWorker$doWork$2(this.this$0, r4);
        avatarStickerPackWorker$doWork$2.L$0 = obj;
        return avatarStickerPackWorker$doWork$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r0 == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r12.label
            r2 = 1
            if (r0 == 0) goto L_0x0080
            if (r0 != r2) goto L_0x010e
            boolean r9 = r12.Z$0
            int r8 = r12.I$0
            java.lang.Object r6 = r12.L$1
            java.lang.String r6 = (java.lang.String) r6
            X.AnonymousClass0AN.A00(r13)
        L_0x0014:
            boolean r0 = X.AnonymousClass000.A1X(r13)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "AvatarStickerPackWorker/triggered but user has no avatar, canceling retry loop."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.1Ae r3 = r0.A02
            java.lang.String r1 = "AvatarStickerPackWorker/failure"
            java.lang.String r0 = "abort_user_without_avatar"
            r3.A02(r2, r1, r0)
            X.4ox r0 = new X.4ox
            r0.<init>()
        L_0x002f:
            X.777 r2 = new X.777
            r2.<init>()
            r0 = 7
            if (r8 == r0) goto L_0x004e
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.1B6 r1 = r0.A03
            r0 = 0
            java.util.ArrayList r1 = X.AnonymousClass1B6.A01(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x006c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x006c
        L_0x004a:
            r0 = 1
        L_0x004b:
            r11 = 0
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r11 = 1
        L_0x004f:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.65M r5 = r0.A00
            X.7Ru r7 = new X.7Ru
            r7.<init>(r2)
            boolean r10 = X.C36371kC.A1V(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0F
            r0.set(r10)
            X.0wU r0 = r5.A0E
            X.73p r4 = new X.73p
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.Boy(r4)
            goto L_0x00d1
        L_0x006c:
            java.util.Iterator r1 = r1.iterator()
        L_0x0070:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            X.68B r0 = X.C90514aH.A0g(r1)
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0070
            r0 = 0
            goto L_0x004b
        L_0x0080:
            X.AnonymousClass0AN.A00(r13)
            java.lang.Object r4 = r12.L$0
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.6X2 r0 = r0.A01
            java.lang.String r1 = "origin"
            java.util.Map r0 = r0.A00
            java.lang.String r6 = X.C90474aD.A0c(r1, r0)
            if (r6 != 0) goto L_0x0097
            java.lang.String r6 = "retry"
        L_0x0097:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.6X2 r5 = r0.A01
            r1 = 6
            java.lang.String r0 = "origin_type"
            int r8 = r5.A02(r0, r1)
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.6X2 r0 = r0.A01
            java.lang.String r1 = "cancel_ongoing"
            java.util.Map r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x00cf
            boolean r9 = X.AnonymousClass000.A1X(r1)
        L_0x00ba:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.1BF r0 = r0.A01
            r12.L$0 = r4
            r12.L$1 = r6
            r12.I$0 = r8
            r12.Z$0 = r9
            r12.label = r2
            java.lang.Object r13 = r0.A00(r12, r2)
            if (r13 != r3) goto L_0x0014
            return r3
        L_0x00cf:
            r9 = 0
            goto L_0x00ba
        L_0x00d1:
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00d8 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x00d8 }
            goto L_0x00dd
        L_0x00d8:
            r0 = move-exception
            X.03N r2 = X.C90524aI.A0t(r0)
        L_0x00dd:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r1 = r12.this$0
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r2)
            if (r0 != 0) goto L_0x0109
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            X.AnonymousClass00C.A0B(r2)
            boolean r0 = r2.booleanValue()
            com.whatsapp.avatar.init.AvatarStickerPackWorker r1 = r12.this$0
            if (r0 == 0) goto L_0x0103
            X.1Ae r3 = r1.A02
            r2 = 0
            java.lang.String r1 = "AvatarStickerPackWorker/success"
            r0 = 1
            r3.A02(r0, r1, r2)
            X.4ox r0 = X.C97344ox.A00()
        L_0x00ff:
            X.AnonymousClass00C.A0B(r0)
            return r0
        L_0x0103:
            r0 = 0
            X.5Xj r0 = com.whatsapp.avatar.init.AvatarStickerPackWorker.A00(r1, r0)
            goto L_0x00ff
        L_0x0109:
            X.5Xj r0 = com.whatsapp.avatar.init.AvatarStickerPackWorker.A00(r1, r0)
            return r0
        L_0x010e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avatar.init.AvatarStickerPackWorker$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerPackWorker$doWork$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

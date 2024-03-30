package com.whatsapp.productinfra.avatar.data.profilephoto;

import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C130926Mz;
import X.C134646bN;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.profilephoto.AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1", f = "AvatarProfilePhotoPosesFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $failFast;
    public final /* synthetic */ boolean $invalidate;
    public final /* synthetic */ C134646bN $pose;
    public final /* synthetic */ AnonymousClass040 $scope;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130926Mz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1(C134646bN r2, C130926Mz r3, C023509x r4, AnonymousClass040 r5, boolean z, boolean z2) {
        super(2, r4);
        this.$failFast = z;
        this.$scope = r5;
        this.$invalidate = z2;
        this.this$0 = r3;
        this.$pose = r2;
    }

    public final C023509x create(Object obj, C023509x r9) {
        boolean z = this.$failFast;
        AnonymousClass040 r4 = this.$scope;
        boolean z2 = this.$invalidate;
        AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1 avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1 = new AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1(this.$pose, this.this$0, r9, r4, z, z2);
        avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1.L$0 = obj;
        return avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x0065
            X.AnonymousClass0AN.A00(r6)
            boolean r0 = r5.$invalidate
            X.6Mz r4 = r5.this$0
            X.6bN r2 = r5.$pose
            r3 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x003c }
            android.graphics.Bitmap r1 = X.C130926Mz.A00(r4, r0)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x003c }
            X.6AY r2 = new X.6AY     // Catch:{ all -> 0x003c }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x003c }
            goto L_0x0041
        L_0x0020:
            X.61E r1 = r4.A00     // Catch:{ all -> 0x003c }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x003c }
            android.graphics.Bitmap r1 = r1.A01(r0)     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0032
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x003c }
            android.graphics.Bitmap r1 = X.C130926Mz.A00(r4, r0)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
        L_0x0032:
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x003c }
            X.6AY r2 = new X.6AY     // Catch:{ all -> 0x003c }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x003c }
            goto L_0x0041
        L_0x003a:
            r2 = r3
            goto L_0x0041
        L_0x003c:
            r0 = move-exception
            X.03N r2 = X.C90524aI.A0t(r0)
        L_0x0041:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r2)
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "AvatarProfilePhotoPosesFetcher/fetchPoses"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004c:
            boolean r0 = r2 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x0051
            r2 = r3
        L_0x0051:
            if (r2 != 0) goto L_0x0064
            boolean r0 = r5.$failFast
            if (r0 == 0) goto L_0x0064
            X.040 r2 = r5.$scope
            java.lang.String r1 = "Fail fast enabled and bitmap download failed"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            X.C009403z.A03(r0, r2)
            return r3
        L_0x0064:
            return r2
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.profilephoto.AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

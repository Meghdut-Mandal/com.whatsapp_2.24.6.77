package androidx.compose.ui.platform;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass4VO;
import X.C009003v;
import X.C023509x;
import X.C18010sR;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {115, 121}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Uri $animationScaleUri;
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ C18010sR $channel;
    public final /* synthetic */ AnonymousClass4VO $contentObserver;
    public final /* synthetic */ ContentResolver $resolver;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Context context, Uri uri, AnonymousClass4VO r5, C023509x r6, C18010sR r7) {
        super(2, r6);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = r5;
        this.$channel = r7;
        this.$applicationContext = context;
    }

    public final C023509x create(Object obj, C023509x r9) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$applicationContext, this.$animationScaleUri, this.$contentObserver, r9, this.$channel);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[Catch:{ all -> 0x0082 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r4) goto L_0x001d
            if (r0 != r5) goto L_0x0018
            java.lang.Object r7 = r8.L$1
            X.0iv r7 = (X.C12950iv) r7
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r9)     // Catch:{ all -> 0x0082 }
            goto L_0x003d
        L_0x0018:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0e()
            throw r2
        L_0x001d:
            java.lang.Object r7 = r8.L$1
            X.0iv r7 = (X.C12950iv) r7
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            goto L_0x004a
        L_0x0026:
            X.AnonymousClass0AN.A00(r9)
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            android.content.ContentResolver r7 = r8.$resolver
            android.net.Uri r2 = r8.$animationScaleUri
            r1 = 0
            X.4VO r0 = r8.$contentObserver
            r7.registerContentObserver(r2, r1, r0)
            X.0sR r0 = r8.$channel     // Catch:{ all -> 0x0082 }
            X.0iv r7 = r0.BNo()     // Catch:{ all -> 0x0082 }
        L_0x003d:
            r8.L$0 = r3     // Catch:{ all -> 0x0082 }
            r8.L$1 = r7     // Catch:{ all -> 0x0082 }
            r8.label = r4     // Catch:{ all -> 0x0082 }
            java.lang.Object r9 = r7.A01(r8)     // Catch:{ all -> 0x0082 }
            if (r9 != r6) goto L_0x004d
            goto L_0x0076
        L_0x004a:
            X.AnonymousClass0AN.A00(r9)     // Catch:{ all -> 0x0082 }
        L_0x004d:
            boolean r0 = X.AnonymousClass000.A1X(r9)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0078
            r7.A00()     // Catch:{ all -> 0x0082 }
            android.content.Context r0 = r8.$applicationContext     // Catch:{ all -> 0x0082 }
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = "animator_duration_scale"
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = android.provider.Settings.Global.getFloat(r2, r1, r0)     // Catch:{ all -> 0x0082 }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ all -> 0x0082 }
            r0.<init>(r1)     // Catch:{ all -> 0x0082 }
            r8.L$0 = r3     // Catch:{ all -> 0x0082 }
            r8.L$1 = r7     // Catch:{ all -> 0x0082 }
            r8.label = r5     // Catch:{ all -> 0x0082 }
            java.lang.Object r0 = r3.B6N(r0, r8)     // Catch:{ all -> 0x0082 }
            if (r0 != r6) goto L_0x003d
            goto L_0x0077
        L_0x0076:
            return r6
        L_0x0077:
            return r6
        L_0x0078:
            android.content.ContentResolver r1 = r8.$resolver
            X.4VO r0 = r8.$contentObserver
            r1.unregisterContentObserver(r0)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0082:
            r2 = move-exception
            android.content.ContentResolver r1 = r8.$resolver
            X.4VO r0 = r8.$contentObserver
            r1.unregisterContentObserver(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import java.util.List;

/* renamed from: X.6jl  reason: invalid class name and case insensitive filesystem */
public class C139396jl implements C159007ic {
    public final /* synthetic */ ARModelMetadataRequest A00;
    public final /* synthetic */ AnonymousClass60A A01;
    public final /* synthetic */ AnonymousClass62V A02;
    public final /* synthetic */ C132216Sr A03;
    public final /* synthetic */ List A04;

    public C139396jl(ARModelMetadataRequest aRModelMetadataRequest, AnonymousClass60A r2, AnonymousClass62V r3, C132216Sr r4, List list) {
        this.A03 = r4;
        this.A00 = aRModelMetadataRequest;
        this.A04 = list;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BXI(AnonymousClass5VK r2) {
        this.A02.A00(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        X.C132216Sr.A00(r5, r6.mCapability, r7, r4);
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r9) {
        /*
            r8 = this;
            X.6Sr r7 = r8.A03
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r6 = r8.A00
            java.util.List r1 = r8.A04
            X.62V r3 = r8.A02
            X.60A r5 = r8.A01
            java.lang.Object r0 = X.C36391kE.A0t(r1)
            X.6c3 r0 = (X.C135056c3) r0
            X.6VA r0 = r0.A01
            int r4 = r0.A02()
            java.util.Iterator r2 = r1.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r2.next()
            X.6c3 r1 = (X.C135056c3) r1
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r6.mCapability     // Catch:{ 5VD -> 0x004a }
            boolean r0 = X.C132216Sr.A01(r1, r0, r7)     // Catch:{ 5VD -> 0x004a }
            if (r0 != 0) goto L_0x001a
            X.63o r1 = new X.63o
            r1.<init>()
            X.5Ti r0 = X.C108395Ti.MODEL_FETCH_FAILURE
            r1.A00 = r0
            java.lang.String r0 = "Models not found in cache even after download"
            r1.A01 = r0
            X.5VK r0 = r1.A00()
            goto L_0x0046
        L_0x0040:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r6.mCapability     // Catch:{ 5VD -> 0x004a }
            X.C132216Sr.A00(r5, r0, r7, r4)     // Catch:{ 5VD -> 0x004a }
            r0 = 0
        L_0x0046:
            r3.A00(r0)
            return
        L_0x004a:
            r2 = move-exception
            X.63o r1 = new X.63o
            r1.<init>()
            X.5Ti r0 = X.C108395Ti.MODEL_FETCH_FAILURE
            r1.A00 = r0
            r1.A03 = r2
            X.5VK r0 = r1.A00()
            r3.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139396jl.onSuccess(java.lang.Object):void");
    }
}

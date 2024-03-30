package com.whatsapp.productinfra.avatar.data.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass041;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass61E;
import X.C007103b;
import X.C007403e;
import X.C007703h;
import X.C008803t;
import X.C008903u;
import X.C009003v;
import X.C009403z;
import X.C023109s;
import X.C023409w;
import X.C023509x;
import X.C06800Vd;
import X.C130926Mz;
import X.C134646bN;
import X.C36321k7;
import X.C90524aI;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.profilephoto.AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1", f = "AvatarProfilePhotoPosesFetcher.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $failFast;
    public final /* synthetic */ boolean $invalidate;
    public final /* synthetic */ List $poses;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130926Mz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1(C130926Mz r2, List list, C023509x r4, boolean z, boolean z2) {
        super(2, r4);
        this.$invalidate = z;
        this.this$0 = r2;
        this.$poses = list;
        this.$failFast = z2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        C023509x r3 = r8;
        AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1 avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1 = new AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1(this.this$0, this.$poses, r3, this.$invalidate, this.$failFast);
        avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1.L$0 = obj;
        return avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.$invalidate) {
                AnonymousClass61E.A00(this.this$0.A00, true);
            }
            AnonymousClass041 A02 = C009403z.A02(C008803t.A02(this.this$0.A01.A01(4), new C007703h((C007403e) null)));
            List<C134646bN> list = this.$poses;
            boolean z = this.$failFast;
            boolean z2 = this.$invalidate;
            C130926Mz r8 = this.this$0;
            ArrayList A0J = C36321k7.A0J(list);
            for (C134646bN avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1 : list) {
                AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1 avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$12 = new AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1(avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1, r8, (C023509x) null, A02, z, z2);
                A0J.add(AnonymousClass0A2.A01(C023109s.A00, C008903u.A00, avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$12, A02));
            }
            try {
                this.label = 1;
                obj = C06800Vd.A00(A0J, this);
                if (obj == r4) {
                    return r4;
                }
            } catch (Throwable th) {
                obj2 = C90524aI.A0t(th);
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        obj2 = C007103b.A0V((List) obj);
        Throwable A00 = AnonymousClass0AK.A00(obj2);
        if (A00 != null) {
            Log.e("AvatarProfilePhotoPosesFetcher/failed to download poses in parallel", A00);
        }
        if (AnonymousClass0AK.A00(obj2) != null) {
            return C023409w.A00;
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

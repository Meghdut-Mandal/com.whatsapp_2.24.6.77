package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19R;
import X.AnonymousClass1BF;
import X.AnonymousClass5HV;
import X.AnonymousClass5HY;
import X.AnonymousClass6GG;
import X.C009003v;
import X.C023509x;
import X.C105855Hf;
import X.C111365cA;
import X.C120085qw;
import X.C123815x8;
import X.C146026uu;
import X.C90524aI;
import com.whatsapp.graphql.GraphqlRequest$postAwait$2;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$fetchAvatarAwait$2", f = "AvatarConfigRepository.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarConfigRepository$fetchAvatarAwait$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass1BF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarConfigRepository$fetchAvatarAwait$2(AnonymousClass1BF r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarConfigRepository$fetchAvatarAwait$2 avatarConfigRepository$fetchAvatarAwait$2 = new AvatarConfigRepository$fetchAvatarAwait$2(this.this$0, r4);
        avatarConfigRepository$fetchAvatarAwait$2.L$0 = obj;
        return avatarConfigRepository$fetchAvatarAwait$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object r0;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                C120085qw r3 = (C120085qw) this.this$0.A00.get();
                C146026uu B3y = r3.A01.B3y(new AnonymousClass6GG(r3, 2));
                this.label = 1;
                obj = GraphqlRequest$postAwait$2.A01(B3y, this, AnonymousClass19R.A01);
                if (obj == r5) {
                    return r5;
                }
            } catch (Throwable th) {
                obj2 = C90524aI.A0t(th);
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        obj2 = C111365cA.A00((C123815x8) obj);
        Throwable A00 = AnonymousClass0AK.A00(obj2);
        if (A00 == null) {
            return obj2;
        }
        if (A00 instanceof IOException) {
            r0 = new AnonymousClass5HV(A00);
        } else {
            r0 = new AnonymousClass5HY(A00);
        }
        return new C105855Hf(r0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarConfigRepository$fetchAvatarAwait$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

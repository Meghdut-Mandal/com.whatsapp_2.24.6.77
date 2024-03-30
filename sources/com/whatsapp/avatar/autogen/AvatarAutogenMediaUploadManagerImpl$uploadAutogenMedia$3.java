package com.whatsapp.avatar.autogen;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.AnonymousClass3Ot;
import X.AnonymousClass3S2;
import X.AnonymousClass5HS;
import X.AnonymousClass5HT;
import X.C009003v;
import X.C023509x;
import X.C104845Bq;
import X.C123865xD;
import X.C132046Rx;
import X.C144896sz;
import X.C146506vi;
import X.C164977sg;
import X.C20190xA;
import X.C25471Gl;
import X.C35621iz;
import X.C36371kC;
import X.C36441kJ;
import X.C65233Rg;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3", f = "AvatarAutogenMediaUploadManagerImpl.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"mediaJob"}, s = {"L$0"})
public final class AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ C20190xA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(C20190xA r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C146506vi A06;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            File A0w = C36441kJ.A0w(this.this$0.A00.getCacheDir(), "avatar_image");
            A0w.mkdirs();
            File A0w2 = C36441kJ.A0w(A0w, "TEMP_SELFIE.jpg");
            C25471Gl r10 = C25471Gl.A06;
            A06 = this.this$0.A02.A06(new C144896sz(r10), C65233Rg.A00(Uri.fromFile(A0w2), (C132046Rx) null, new C104845Bq(this.this$0.A01), new AnonymousClass3Ot(true, false, false), r10, (AnonymousClass3S2) null, (String) null, 16, false, false, false), true);
            A06.A0X = "metaverse";
            C20190xA r5 = this.this$0;
            this.L$0 = A06;
            this.label = 1;
            AnonymousClass0AR A12 = C36371kC.A12(this);
            r5.A03.Bp1(new C35621iz(A06, r5, 38));
            A06.A06(new C164977sg(A12, 0), (Executor) null);
            if (A12.A0G() == r4) {
                return r4;
            }
        } else if (i == 1) {
            A06 = (C146506vi) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C146506vi.A00(A06);
        C123865xD A04 = A06.A04();
        if (A04 == null || A04.A00 != 0) {
            return AnonymousClass5HT.A00;
        }
        String A042 = A04.A02.A04();
        if (A042 == null) {
            return AnonymousClass5HT.A00;
        }
        return new AnonymousClass5HS(A042);
    }
}

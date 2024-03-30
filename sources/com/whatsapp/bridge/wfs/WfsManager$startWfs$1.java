package com.whatsapp.bridge.wfs;

import X.AnonymousClass000;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3OD;
import X.AnonymousClass5pQ;
import X.AnonymousClass6OK;
import X.C009003v;
import X.C023509x;
import X.C07340Xg;
import X.C119195pO;
import X.C119205pP;
import X.C1260362h;
import X.C1497172m;
import X.C36321k7;
import X.C36371kC;
import X.C88424Sq;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.WfsManager$startWfs$1", f = "WfsManager.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class WfsManager$startWfs$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6OK $abOfflineProps;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C88424Sq $listener;
    public int label;
    public final /* synthetic */ AnonymousClass3OD this$0;

    @DebugMetadata(c = "com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1", f = "WfsManager.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            AnonymousClass3OD r3 = r7;
            AnonymousClass1 r0 = new AnonymousClass1(context, r6, r3, r8, r8);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass3OD r1 = r7;
                WfsNativeAuthManager wfsNativeAuthManager = r1.A04;
                Context context = context;
                AnonymousClass6OK r10 = r8;
                C1260362h r9 = r1.A02;
                C88424Sq r0 = r6;
                C119205pP r7 = new C119205pP(r0, r1);
                AnonymousClass5pQ r8 = new AnonymousClass5pQ(r0, r1);
                C119195pO r6 = new C119195pO(r0, r1);
                this.label = 1;
                if (wfsNativeAuthManager.A00(context, r6, r7, r8, r9, r10, this, (AnonymousClass040) this.L$0) == r3) {
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
    public WfsManager$startWfs$1(Context context, C88424Sq r3, AnonymousClass3OD r4, AnonymousClass6OK r5, C023509x r6) {
        super(2, r6);
        this.$abOfflineProps = r5;
        this.this$0 = r4;
        this.$context = context;
        this.$listener = r3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        AnonymousClass6OK r4 = this.$abOfflineProps;
        return new WfsManager$startWfs$1(this.$context, this.$listener, this.this$0, r4, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            long A07 = C36371kC.A07(this.$abOfflineProps.A01(6982));
            final AnonymousClass3OD r7 = this.this$0;
            final Context context = this.$context;
            final AnonymousClass6OK r8 = this.$abOfflineProps;
            final C88424Sq r6 = this.$listener;
            AnonymousClass1 r4 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (C07340Xg.A00(this, r4, A07) == r3) {
                return r3;
            }
        } else if (i == 1) {
            try {
                AnonymousClass0AN.A00(obj);
            } catch (Exception unused) {
                C36321k7.A1R("[WAFFLE] ", "WfsManager launchWfsFlow timeout", AnonymousClass000.A0u());
                this.this$0.A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                this.this$0.A00.Bp3(new C1497172m(this.$listener, 6));
            }
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsManager$startWfs$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

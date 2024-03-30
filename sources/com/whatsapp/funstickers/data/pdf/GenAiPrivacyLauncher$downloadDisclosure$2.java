package com.whatsapp.funstickers.data.pdf;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass5US;
import X.C009003v;
import X.C023509x;
import X.C130236Kg;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$downloadDisclosure$2", f = "GenAiPrivacyLauncher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GenAiPrivacyLauncher$downloadDisclosure$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $noticeId;
    public int label;
    public final /* synthetic */ C130236Kg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenAiPrivacyLauncher$downloadDisclosure$2(C130236Kg r2, C023509x r3, int i) {
        super(2, r3);
        this.this$0 = r2;
        this.$noticeId = i;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new GenAiPrivacyLauncher$downloadDisclosure$2(this.this$0, r5, this.$noticeId);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                return this.this$0.A01.A01(this.$noticeId);
            } catch (AnonymousClass5US e) {
                Log.i("GenAiPrivacyLauncher/downloadDisclosure failed to download disclosure", e);
                return null;
            }
        } else {
            throw AnonymousClass000.A0e();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GenAiPrivacyLauncher$downloadDisclosure$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

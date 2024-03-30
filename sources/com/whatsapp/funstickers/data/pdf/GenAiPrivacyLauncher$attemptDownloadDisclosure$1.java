package com.whatsapp.funstickers.data.pdf;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C108125Sg;
import X.C130236Kg;
import X.C225314u;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$attemptDownloadDisclosure$1", f = "GenAiPrivacyLauncher.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class GenAiPrivacyLauncher$attemptDownloadDisclosure$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $callback;
    public final /* synthetic */ C225314u $dialogActivity;
    public final /* synthetic */ int $noticeId;
    public int label;
    public final /* synthetic */ C130236Kg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenAiPrivacyLauncher$attemptDownloadDisclosure$1(C225314u r2, C130236Kg r3, C023509x r4, C006302t r5, int i) {
        super(2, r4);
        this.$dialogActivity = r2;
        this.this$0 = r3;
        this.$noticeId = i;
        this.$callback = r5;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new GenAiPrivacyLauncher$attemptDownloadDisclosure$1(this.$dialogActivity, this.this$0, r8, this.$callback, this.$noticeId);
    }

    public final Object invokeSuspend(Object obj) {
        C006302t r1;
        C108125Sg r0;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.$dialogActivity.Bu1(R.string.f12nameremoved);
            C130236Kg r4 = this.this$0;
            int i2 = this.$noticeId;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r4.A02, new GenAiPrivacyLauncher$downloadDisclosure$2(r4, (C023509x) null, i2));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        String str = (String) obj;
        this.$dialogActivity.Bnv();
        if (str == null || str.length() == 0) {
            Log.i("GenAiPrivacyLauncher/isAccepted error downloading disclosure");
            r1 = this.$callback;
            r0 = C108125Sg.ERROR;
        } else {
            Log.i("GenAiPrivacyLauncher/isAccepted disclosure state downloaded");
            r1 = this.$callback;
            r0 = C108125Sg.DOWNLOADED;
        }
        r1.invoke(r0);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GenAiPrivacyLauncher$attemptDownloadDisclosure$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

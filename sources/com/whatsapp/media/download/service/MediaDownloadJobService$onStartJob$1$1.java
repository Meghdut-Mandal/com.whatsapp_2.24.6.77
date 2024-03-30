package com.whatsapp.media.download.service;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C36361kB;
import X.C90524aI;
import android.app.job.JobParameters;
import com.whatsapp.R;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.download.service.MediaDownloadJobService$onStartJob$1$1", f = "MediaDownloadJobService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaDownloadJobService$onStartJob$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ JobParameters $params;
    public int label;
    public final /* synthetic */ MediaDownloadJobService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaDownloadJobService$onStartJob$1$1(JobParameters jobParameters, MediaDownloadJobService mediaDownloadJobService, C023509x r4) {
        super(2, r4);
        this.this$0 = mediaDownloadJobService;
        this.$params = jobParameters;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new MediaDownloadJobService$onStartJob$1$1(this.$params, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            MediaDownloadJobService mediaDownloadJobService = this.this$0;
            mediaDownloadJobService.A05(this.$params, C36361kB.A0m(mediaDownloadJobService.A07().A00, R.string.f12nameremoved), this.this$0.getResources().getQuantityString(R.plurals.f10nameremoved, 1, new Object[]{C90524aI.A0a(1)}), (ArrayList) null);
            MediaDownloadJobService.A01(this.$params, this.this$0);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaDownloadJobService$onStartJob$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}

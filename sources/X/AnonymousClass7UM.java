package X;

import androidx.work.WorkerParameters;
import com.whatsapp.ml.ptt.worker.PttMLModelDownloadWorker;
import java.util.UUID;

/* renamed from: X.7UM  reason: invalid class name */
public final class AnonymousClass7UM extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ long $contentLength;
    public final /* synthetic */ PttMLModelDownloadWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UM(PttMLModelDownloadWorker pttMLModelDownloadWorker, long j) {
        super(1);
        this.this$0 = pttMLModelDownloadWorker;
        this.$contentLength = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        PttMLModelDownloadWorker pttMLModelDownloadWorker = this.this$0;
        long j = this.$contentLength;
        AnonymousClass00T r3 = pttMLModelDownloadWorker.A08;
        ((C07700Yy) r3.getValue()).A07(100, (int) ((((float) A0I) / ((float) j)) * ((float) 100)), false);
        pttMLModelDownloadWorker.A03.A02(80, ((C07700Yy) r3.getValue()).A05());
        AnonymousClass6EH r2 = new AnonymousClass6EH();
        r2.A01("com.whatsapp.ml.model.PROGRESS", (int) ((j / 1048576) - (((long) A0I) / 1048576)));
        AnonymousClass6X2 A00 = r2.A00();
        WorkerParameters workerParameters = pttMLModelDownloadWorker.A01;
        C157097bp r32 = workerParameters.A03;
        UUID uuid = workerParameters.A06;
        C138786ih r33 = (C138786ih) r32;
        r33.A01.B74(new C1503474x((Object) new C97484pl(), (Object) r33, (Object) A00, (Object) uuid, 1));
        return AnonymousClass0AJ.A00;
    }
}

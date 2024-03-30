package X;

import com.whatsapp.reportinfra.repo.SpamReportRepo;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.repo.SpamReportRepo", f = "SpamReportRepo.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {74, 76, 78, 80}, m = "triggerReport", n = {"this", "reportOrigin", "this", "reportOrigin", "this", "reportOrigin", "this", "reportOrigin"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.3zB  reason: invalid class name and case insensitive filesystem */
public final class C82733zB extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SpamReportRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82733zB(SpamReportRepo spamReportRepo, C023509x r2) {
        super(r2);
        this.this$0 = spamReportRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass141) null, (String) null, (List) null, this);
    }
}

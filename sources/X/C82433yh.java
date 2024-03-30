package X;

import com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper", f = "ReportBugProtocolHelper.kt", i = {}, l = {51}, m = "reportBug", n = {}, s = {})
/* renamed from: X.3yh  reason: invalid class name and case insensitive filesystem */
public final class C82433yh extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ReportBugProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82433yh(ReportBugProtocolHelper reportBugProtocolHelper, C023509x r2) {
        super(r2);
        this.this$0 = reportBugProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, this);
    }
}

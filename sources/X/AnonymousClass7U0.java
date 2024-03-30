package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.7U0  reason: invalid class name */
public final class AnonymousClass7U0 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass7eY $downloadCallback;
    public final /* synthetic */ List $metadataRequests;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U0(AnonymousClass7eY r2, List list) {
        super(1);
        this.$downloadCallback = r2;
        this.$metadataRequests = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        AnonymousClass00C.A0D(exc, 0);
        this.$downloadCallback.BU6(exc, this.$metadataRequests, (Map) null);
        return AnonymousClass0AJ.A00;
    }
}

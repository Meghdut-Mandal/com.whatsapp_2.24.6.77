package X;

/* renamed from: X.4qf  reason: invalid class name and case insensitive filesystem */
public class C97994qf extends AnonymousClass72f {
    public final /* synthetic */ AnonymousClass6SQ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97994qf(AnonymousClass6SQ r2) {
        super("StreamingUploadDataTask_ask_for_data");
        this.A00 = r2;
    }

    public void run() {
        AnonymousClass6SQ r0 = this.A00;
        r0.A03.canHandleStreamingUploadUpdate(r0.A02.mTaskIdentifier);
    }
}

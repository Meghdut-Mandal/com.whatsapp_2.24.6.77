package X;

/* renamed from: X.4qg  reason: invalid class name and case insensitive filesystem */
public class C98004qg extends AnonymousClass72f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6SQ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98004qg(AnonymousClass6SQ r2, int i) {
        super("StreamingUploadDataTask_update");
        this.A01 = r2;
        this.A00 = i;
    }

    public void run() {
        AnonymousClass6SQ r1 = this.A01;
        r1.A03.updateDataTaskUploadProgress(r1.A02.mTaskIdentifier, (long) this.A00, r1.A00, r1.A01);
    }
}

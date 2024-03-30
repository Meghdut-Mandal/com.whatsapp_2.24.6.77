package X;

/* renamed from: X.7TD  reason: invalid class name */
public final class AnonymousClass7TD extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C10810fG $runningJob;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TD(C10810fG r2) {
        super(1);
        this.$runningJob = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = this.$runningJob.element;
        if (obj2 == null) {
            throw C36331k8.A0d("runningJob");
        }
        ((C22726Aue) obj2).cancel();
        return AnonymousClass0AJ.A00;
    }
}

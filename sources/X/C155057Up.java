package X;

/* renamed from: X.7Up  reason: invalid class name and case insensitive filesystem */
public final class C155057Up extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $annotationKey;
    public final /* synthetic */ long $annotationValue;
    public final /* synthetic */ Integer $instanceKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155057Up(Integer num, String str, long j) {
        super(1);
        this.$instanceKey = num;
        this.$annotationKey = str;
        this.$annotationValue = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C21700zf r8 = (C21700zf) obj;
        AnonymousClass00C.A0D(r8, 0);
        Integer num = this.$instanceKey;
        if (num == null) {
            r8.A05.markerAnnotate(r8.A04.A06, this.$annotationKey, this.$annotationValue);
        } else {
            r8.A05.markerAnnotate(r8.A04.A06, num.intValue(), this.$annotationKey, this.$annotationValue);
        }
        return AnonymousClass0AJ.A00;
    }
}

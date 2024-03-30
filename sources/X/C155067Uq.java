package X;

/* renamed from: X.7Uq  reason: invalid class name and case insensitive filesystem */
public final class C155067Uq extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $annotationKey;
    public final /* synthetic */ boolean $annotationValue;
    public final /* synthetic */ Integer $instanceKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155067Uq(Integer num, String str, boolean z) {
        super(1);
        this.$instanceKey = num;
        this.$annotationKey = str;
        this.$annotationValue = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C21700zf r6 = (C21700zf) obj;
        AnonymousClass00C.A0D(r6, 0);
        Integer num = this.$instanceKey;
        if (num == null) {
            r6.A0B(this.$annotationKey, this.$annotationValue, false);
        } else {
            r6.A05.markerAnnotate(r6.A04.A06, num.intValue(), this.$annotationKey, this.$annotationValue);
        }
        return AnonymousClass0AJ.A00;
    }
}

package X;

/* renamed from: X.7Uo  reason: invalid class name and case insensitive filesystem */
public final class C155047Uo extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $annotationKey;
    public final /* synthetic */ String $annotationValue;
    public final /* synthetic */ Integer $instanceKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155047Uo(Integer num, String str, String str2) {
        super(1);
        this.$instanceKey = num;
        this.$annotationKey = str;
        this.$annotationValue = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C21700zf r6 = (C21700zf) obj;
        AnonymousClass00C.A0D(r6, 0);
        Integer num = this.$instanceKey;
        if (num == null) {
            r6.A0A(this.$annotationKey, this.$annotationValue, false);
        } else {
            r6.A05.markerAnnotate(r6.A04.A06, num.intValue(), this.$annotationKey, this.$annotationValue);
        }
        return AnonymousClass0AJ.A00;
    }
}

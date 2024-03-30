package X;

/* renamed from: X.7Ua  reason: invalid class name and case insensitive filesystem */
public final class C154907Ua extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $height;
    public final /* synthetic */ AnonymousClass6Q4 $placeable;
    public final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154907Ua(AnonymousClass6Q4 r2, int i, int i2) {
        super(1);
        this.$width = i;
        this.$placeable = r2;
        this.$height = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        int i = this.$width;
        AnonymousClass6Q4 r4 = this.$placeable;
        AnonymousClass6WO.A01(r4, C14960mT.A01(((float) (i - r4.A01)) / 2.0f), C14960mT.A01(((float) (this.$height - r4.A00)) / 2.0f));
        return AnonymousClass0AJ.A00;
    }
}

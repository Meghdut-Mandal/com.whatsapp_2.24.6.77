package X;

/* renamed from: X.4Hq  reason: invalid class name and case insensitive filesystem */
public final class C85584Hq extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C88424Sq $listener;
    public final /* synthetic */ AnonymousClass011 $phoneNumberPair;
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ C62753Hk $userEntityForNativeAuth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85584Hq(C88424Sq r2, C62753Hk r3, String str, AnonymousClass011 r5) {
        super(0);
        this.$listener = r2;
        this.$userEntityForNativeAuth = r3;
        this.$purpose = str;
        this.$phoneNumberPair = r5;
    }

    public static C608039k A00(C85584Hq r2) {
        return (C608039k) r2.$userEntityForNativeAuth.A01.A00(r2.$purpose);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        C88424Sq r2 = this.$listener;
        C608039k A00 = A00(this);
        String str5 = null;
        if (A00 != null) {
            str = A00.A03;
        } else {
            str = null;
        }
        C608039k A002 = A00(this);
        if (A002 != null) {
            str2 = A002.A02;
        } else {
            str2 = null;
        }
        C608039k A003 = A00(this);
        if (A003 != null) {
            str3 = A003.A01;
        } else {
            str3 = null;
        }
        AnonymousClass011 r9 = this.$phoneNumberPair;
        C608039k A004 = A00(this);
        if (A004 != null) {
            str4 = A004.A04;
        } else {
            str4 = null;
        }
        C608039k A005 = A00(this);
        if (A005 != null) {
            num = Integer.valueOf(A005.A00.A00);
        } else {
            num = null;
        }
        C62753Hk r0 = this.$userEntityForNativeAuth;
        int i = r0.A00;
        C608039k r02 = (C608039k) r0.A01.A00(this.$purpose);
        if (r02 != null) {
            str5 = r02.A00.A01;
        }
        r2.Bkg(num, str, str2, str3, str4, str5, r9, i);
        return AnonymousClass0AJ.A00;
    }
}

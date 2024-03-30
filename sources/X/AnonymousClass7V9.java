package X;

import java.util.LinkedHashMap;

/* renamed from: X.7V9  reason: invalid class name */
public final class AnonymousClass7V9 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6E6 $businessProfile;
    public final /* synthetic */ int $type;
    public final /* synthetic */ String $useCase;
    public final /* synthetic */ AnonymousClass6YD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V9(AnonymousClass6YD r2, AnonymousClass6E6 r3, String str, int i) {
        super(1);
        this.this$0 = r2;
        this.$businessProfile = r3;
        this.$useCase = str;
        this.$type = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass11F r12 = (AnonymousClass11F) obj;
        AnonymousClass00C.A0D(r12, 0);
        AnonymousClass6YD.A06(this.this$0, r12, this.$businessProfile.A06);
        String str = this.$useCase;
        if (AnonymousClass00C.A0J(str, "business_search")) {
            AnonymousClass6YD r3 = this.this$0;
            String str2 = this.$businessProfile.A06;
            int i = this.$type;
            r3.A0C(r12, str2, i, AnonymousClass000.A1S(i, 41));
        } else if (AnonymousClass00C.A0J(str, "global_search")) {
            AnonymousClass6YD r1 = this.this$0;
            String str3 = this.$businessProfile.A06;
            AnonymousClass6TR r0 = AnonymousClass6YD.A0P;
            C20810yC r2 = r1.A0C;
            if (r0.A03(r2) && r2.A0E(6165)) {
                ((C142626pB) C36411kG.A0v(r1.A0F)).A03((Boolean) null, C36361kB.A0j(), r1.A0D.A02(), str3, (String) null, (String) null, 1, 0);
            }
            C142626pB A01 = AnonymousClass6YD.A01(r1);
            int length = r1.A0D.A02().length();
            String A0B = r1.A0B();
            if (AnonymousClass6TR.A01(A01.A01)) {
                AnonymousClass2RY r32 = new AnonymousClass2RY();
                C90514aH.A1L(r32, 2, 0);
                r32.A02 = 2;
                C142626pB.A01(A01, r32);
                Integer valueOf = Integer.valueOf(length);
                LinkedHashMap A1G = C36431kI.A1G();
                if (valueOf != null) {
                    A1G.put("query_length", valueOf);
                }
                A1G.put("location_type", A0B);
                r32.A04 = C90474aD.A0k(A1G);
                A01.A02.Bly(r32);
            }
        }
        this.this$0.A0K.invoke(r12);
        return AnonymousClass0AJ.A00;
    }
}

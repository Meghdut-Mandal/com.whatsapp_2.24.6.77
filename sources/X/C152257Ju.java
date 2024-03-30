package X;

import java.util.LinkedHashMap;

/* renamed from: X.7Ju  reason: invalid class name and case insensitive filesystem */
public final class C152257Ju extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6YD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152257Ju(AnonymousClass6YD r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C142626pB A01 = AnonymousClass6YD.A01(this.this$0);
        String A02 = this.this$0.A0D.A02();
        AnonymousClass00C.A08(A02);
        int length = this.this$0.A0D.A02().length();
        String A0B = this.this$0.A0B();
        if (AnonymousClass6TR.A01(A01.A01)) {
            AnonymousClass2RY r3 = new AnonymousClass2RY();
            C90514aH.A1L(r3, C36371kC.A0p(), 0);
            C142626pB.A01(A01, r3);
            Integer valueOf = Integer.valueOf(length);
            LinkedHashMap A1G = C36431kI.A1G();
            if (valueOf != null) {
                A1G.put("query_length", valueOf);
            }
            A1G.put("location_type", A0B);
            r3.A04 = C90474aD.A0k(A1G);
            A01.A02.Bly(r3);
        }
        A01.A03((Boolean) null, (Integer) null, A02, (String) null, (String) null, (String) null, 5, 0);
        AnonymousClass6YD.A00(this.this$0).A04.A09();
        AnonymousClass6YD r0 = this.this$0;
        r0.A0J.invoke(r0.A0B.A00());
        return AnonymousClass0AJ.A00;
    }
}

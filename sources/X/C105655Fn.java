package X;

import java.util.Map;

/* renamed from: X.5Fn  reason: invalid class name and case insensitive filesystem */
public final class C105655Fn extends AnonymousClass5G4 implements C162097o1, C160467l3, AnonymousClass4VC, C162087o0 {
    public String A00;
    public final AnonymousClass6DL A01;
    public final C147296wz A02;
    public final C131376Ou A03;
    public final AnonymousClass6D3 A04;
    public final /* synthetic */ C147306x0 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105655Fn(C116145k1 r2, AnonymousClass60Z r3, C147306x0 r4, AnonymousClass6DL r5, C147296wz r6, C105705Fs r7, C131376Ou r8, AnonymousClass6D3 r9) {
        super(r2, r3, r7);
        C36421kH.A1J(r8, 1, r2);
        C36361kB.A1J(r7, 7, r3);
        this.A03 = r8;
        this.A04 = r9;
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r4;
    }

    public boolean B08(String str) {
        return this.A05.B08(str);
    }

    public void B1y(boolean z) {
        this.A02.B1y(z);
    }

    public AnonymousClass02E BEK(String str, String str2, String str3, Map map, Map map2, int i) {
        AnonymousClass00C.A0D(str, 0);
        C36321k7.A17(map, str3, map2, 2);
        return this.A02.BEK(str, str2, str3, map, map2, i);
    }

    public void BJV(String str, String str2) {
        this.A05.BJV(str, str2);
    }

    public void BJW(String str, Map map) {
        this.A05.BJW(str, map);
    }

    public void Bku(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
        this.A02.Bku(str, str2, str3, str4, str5, str6, map, map2, i);
    }

    public void Bl6(C108015Rv r14, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, int i2, boolean z) {
        this.A02.Bl6(r14, str, str2, str3, str4, str5, str6, map, map2, i, i2, z);
    }

    public void Bm2(AnonymousClass64K r8, String str, Map map, int i) {
        AnonymousClass00C.A0D(map, 0);
        AnonymousClass6D3 r1 = this.A04;
        Object obj = map.get("app_id");
        C90494aF.A10(obj);
        r1.A01(r8, (String) obj, str, C000400e.A0D(), i);
    }

    public void B7N(Map map) {
        this.A01.A01(map);
    }
}

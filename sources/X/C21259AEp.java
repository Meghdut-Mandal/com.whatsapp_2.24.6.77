package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.AEp  reason: case insensitive filesystem */
public class C21259AEp implements B1Q {
    public final /* synthetic */ C198249d9 A00;
    public final /* synthetic */ AnonymousClass9I8 A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C21259AEp(C198249d9 r1, AnonymousClass9I8 r2, Boolean bool, String str, String str2, String str3, String str4) {
        this.A00 = r1;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = bool;
        this.A03 = str4;
        this.A01 = r2;
    }

    public void Bdl(C202059ky r4) {
        Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
        AnonymousClass9I8 r0 = this.A01;
        C179158jJ.A0j(r0.A00, (Map) null, r4.A00);
    }

    public void Bdm(AF3 af3) {
        C198249d9 r0 = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        AF3 af32 = af3;
        C198249d9.A00(r0, af32, this.A01, this.A02, str, str2, str3, this.A03);
    }
}

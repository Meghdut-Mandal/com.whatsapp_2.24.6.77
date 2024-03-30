package X;

import android.content.Context;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.3fD  reason: invalid class name and case insensitive filesystem */
public final class C70473fD implements C22928Aye {
    public final Context A00;
    public final AnonymousClass3OV A01;
    public final AnonymousClass147 A02;
    public final AnonymousClass147 A03;
    public final AnonymousClass2bI A04;

    public C70473fD(Context context, AnonymousClass3OV r3, AnonymousClass147 r4, AnonymousClass147 r5, AnonymousClass2bI r6) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = context;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
    }

    public List getCTAViews() {
        WDSButton[] wDSButtonArr = new WDSButton[2];
        AnonymousClass3OV r3 = this.A01;
        Context context = this.A00;
        AnonymousClass2bI r7 = this.A04;
        AnonymousClass147 r5 = this.A02;
        AnonymousClass147 r6 = this.A03;
        wDSButtonArr[0] = r3.A01(context, r5, r6, r7, 6, false);
        C50802mf r1 = new C50802mf(context);
        r1.A05(new C45632Sc(), r5, r6);
        return C36341k9.A0m(r1, wDSButtonArr, 1);
    }
}

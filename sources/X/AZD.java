package X;

import com.whatsapp.R;

public final /* synthetic */ class AZD implements C006302t {
    public final /* synthetic */ AnonymousClass8WH A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AZD(AnonymousClass8WH r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final Object invoke(Object obj) {
        AnonymousClass8WH r4 = this.A00;
        String str = this.A01;
        AnonymousClass9W6 r6 = (AnonymousClass9W6) obj;
        if (r6 == null) {
            C198909eO r2 = r4.A0e;
            C198909eO.A00(r2, new C22465An4(r2, AnonymousClass000.A1V(r4.A0U)));
        }
        r4.A0W.A0A(new AnonymousClass9NZ(r6, r4.A0q, Integer.valueOf(r4.getIntent().getIntExtra("thumb_width", C36441kJ.A05(r4.getResources(), R.dimen.f7nameremoved))), Integer.valueOf(r4.getIntent().getIntExtra("thumb_height", C36441kJ.A05(r4.getResources(), R.dimen.f7nameremoved))), str, r4.A0V.A02, false));
        return null;
    }
}

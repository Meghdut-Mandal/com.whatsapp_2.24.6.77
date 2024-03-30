package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.82w  reason: invalid class name and case insensitive filesystem */
public abstract class C1690082w extends C209399zw {
    public Handler A00;
    public C202709mU A01;
    public final HashMap A02 = AnonymousClass001.A0J();

    public void A05() {
        HashMap hashMap = this.A02;
        Iterator A10 = C36391kE.A10(hashMap);
        while (A10.hasNext()) {
            AnonymousClass9J0 r2 = (AnonymousClass9J0) A10.next();
            B38 b38 = r2.A01;
            b38.BnU(r2.A00);
            b38.Bnl(r2.A02);
        }
        hashMap.clear();
        this.A01 = null;
    }

    public void A06(C202709mU r2, boolean z) {
        this.A01 = r2;
        this.A00 = new Handler();
    }

    public final void A07(B38 b38, Object obj) {
        HashMap hashMap = this.A02;
        C200319h9.A01(!hashMap.containsKey(obj));
        C209389zv r4 = new C209389zv(this, obj);
        C209419zy r3 = new C209419zy(this, obj);
        hashMap.put(obj, new AnonymousClass9J0(r4, b38, r3));
        Handler handler = this.A00;
        C202249lP r1 = ((C209399zw) b38).A03;
        C200319h9.A01(AnonymousClass000.A1V(handler));
        r1.A02.add(new AnonymousClass9GI(handler, r3));
        b38.BmC(this.A01, r4, false);
    }

    public void BPf() {
        Iterator A10 = C36391kE.A10(this.A02);
        while (A10.hasNext()) {
            ((AnonymousClass9J0) A10.next()).A01.BPf();
        }
    }
}

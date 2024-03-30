package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jc  reason: invalid class name and case insensitive filesystem */
public class C49742jc extends C132446Tt {
    public final /* synthetic */ C19420v0 A00;
    public final /* synthetic */ C24381Cf A01;
    public final /* synthetic */ AnonymousClass1JL A02;
    public final /* synthetic */ WeakReference A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ AnonymousClass1X4 A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49742jc(AnonymousClass012 r2, AnonymousClass1X4 r3, C19420v0 r4, C24381Cf r5, AnonymousClass1JL r6, WeakReference weakReference, List list, long j, boolean z) {
        super(r2, true);
        this.A06 = list;
        this.A05 = r3;
        this.A07 = z;
        this.A04 = j;
        this.A03 = weakReference;
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            this.A05.A0P(C36331k8.A0G(C36391kE.A0f(it)), this.A07);
        }
        C225314u.A0S(this.A04, 300);
        return null;
    }

    public void A0C(Object obj) {
        C225314u A0W = C36411kG.A0W(this.A03);
        if (A0W != null && !A0W.isFinishing()) {
            A0W.Bnv();
        }
        C19420v0 r4 = this.A00;
        int A012 = C36371kC.A01(C36341k9.A0E(r4), "delete_chat_count");
        List list = this.A06;
        C36321k7.A0q(r4, "delete_chat_count", A012 + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0W2 = C36341k9.A0W(it);
            if (A0W2 != null) {
                AnonymousClass1JL r1 = this.A02;
                if (r1.A0C()) {
                    Iterator A0s = C36361kB.A0s(r1);
                    while (A0s.hasNext()) {
                        AnonymousClass3L8 r12 = (AnonymousClass3L8) A0s.next();
                        if (r12 instanceof AnonymousClass4WD) {
                            AnonymousClass4WD r13 = (AnonymousClass4WD) r12;
                            if (r13.A01 == 0) {
                                C70803fk r14 = (C70803fk) r13.A00;
                                if (A0W2.equals(r14.A45)) {
                                    C70803fk.A0B(r14).A3O();
                                }
                            }
                        }
                    }
                }
            }
        }
        this.A01.A01(0);
    }
}

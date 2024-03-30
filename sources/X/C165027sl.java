package X;

/* renamed from: X.7sl  reason: invalid class name and case insensitive filesystem */
public class C165027sl implements C160057kO {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public void Bi5(AnonymousClass6OQ r10) {
        if (this.A04 == 0) {
            AnonymousClass17Y r3 = ((C130026Jk) this.A02).A00;
            if (r3 != null) {
                r3.Bp3(AnonymousClass74N.A00(this.A00, this.A01, 41));
                return;
            }
            throw C36321k7.A06();
        } else if (r10 == null) {
            A00(this, false);
        } else {
            C130026Jk r5 = (C130026Jk) this.A03;
            AnonymousClass005 r0 = r5.A01;
            if (r0 != null) {
                ((AnonymousClass61L) r0.get()).A00(new C165027sl(this, r5, this.A02, this.A00, 0));
                return;
            }
            throw C36331k8.A0d("accountLinkingCustomActionsHelperLazy");
        }
    }

    public C165027sl(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A02 = obj2;
        this.A00 = obj4;
        this.A01 = obj3;
        this.A03 = obj;
    }

    public static final void A00(C165027sl r5, boolean z) {
        AnonymousClass17Y r4 = ((C130026Jk) r5.A03).A00;
        if (r4 != null) {
            r4.Bp3(new AnonymousClass752(r5.A00, r5.A01, 4, z));
            return;
        }
        throw C36321k7.A06();
    }

    public void BVK() {
        if (this.A04 != 0) {
            A00(this, false);
        } else {
            A00((C165027sl) this.A03, false);
        }
    }

    public void BWk(Exception exc) {
        C165027sl r0;
        boolean z;
        if (this.A04 != 0) {
            r0 = this;
            AnonymousClass00C.A0D(exc, 0);
            z = exc instanceof AnonymousClass57K;
        } else {
            r0 = (C165027sl) this.A03;
            z = false;
        }
        A00(r0, z);
    }
}

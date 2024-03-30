package X;

import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: X.07T  reason: invalid class name */
public abstract class AnonymousClass07T extends AnonymousClass07S {
    public AnonymousClass09Y A00 = null;
    public AnonymousClass02E A01 = null;
    public boolean A02;
    public final int A03;
    public final AnonymousClass01z A04;

    public long A0L(int i) {
        return (long) i;
    }

    public abstract AnonymousClass02E A0M(int i);

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass02E r6 = (AnonymousClass02E) obj;
        AnonymousClass02E r0 = this.A01;
        if (r6 != r0) {
            if (r0 != null) {
                r0.A11(false);
                if (this.A03 == 1) {
                    AnonymousClass09Y r2 = this.A00;
                    if (r2 == null) {
                        r2 = new AnonymousClass09Y(this.A04);
                        this.A00 = r2;
                    }
                    r2.A0C(this.A01, AnonymousClass01P.STARTED);
                } else {
                    this.A01.A1V(false);
                }
            }
            r6.A11(true);
            if (this.A03 == 1) {
                AnonymousClass09Y r1 = this.A00;
                if (r1 == null) {
                    r1 = new AnonymousClass09Y(this.A04);
                    this.A00 = r1;
                }
                r1.A0C(r6, AnonymousClass01P.RESUMED);
            } else {
                r6.A1V(true);
            }
            this.A01 = r6;
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0G(ViewGroup viewGroup) {
        AnonymousClass09Y r2 = this.A00;
        if (r2 != null) {
            if (!this.A02) {
                try {
                    this.A02 = true;
                    r2.A04();
                    this.A02 = false;
                } catch (Throwable th) {
                    this.A02 = false;
                    throw th;
                }
            }
            this.A00 = null;
        }
    }

    public Object A0I(ViewGroup viewGroup, int i) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass09Y(this.A04);
        }
        long A0L = A0L(i);
        int id = viewGroup.getId();
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(id);
        sb.append(":");
        sb.append(A0L);
        AnonymousClass02E A0N = this.A04.A0N(sb.toString());
        if (A0N != null) {
            this.A00.A0H(new C021909g(A0N, 7));
        } else {
            A0N = A0M(i);
            AnonymousClass09Y r5 = this.A00;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("android:switcher:");
            sb2.append(id3);
            sb2.append(":");
            sb2.append(A0L);
            r5.A0E(A0N, sb2.toString(), id2);
        }
        if (A0N != this.A01) {
            A0N.A11(false);
            if (this.A03 == 1) {
                this.A00.A0C(A0N, AnonymousClass01P.STARTED);
            } else {
                A0N.A1V(false);
                return A0N;
            }
        }
        return A0N;
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass02E r5 = (AnonymousClass02E) obj;
        AnonymousClass09Y r2 = this.A00;
        if (r2 == null) {
            r2 = new AnonymousClass09Y(this.A04);
            this.A00 = r2;
        }
        AnonymousClass01z r1 = r5.A0M;
        if (r1 == null || r1 == r2.A0J) {
            r2.A0H(new C021909g(r5, 6));
            if (r5.equals(this.A01)) {
                this.A01 = null;
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r5.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public boolean A0K(View view, Object obj) {
        if (((AnonymousClass02E) obj).A0F == view) {
            return true;
        }
        return false;
    }

    public AnonymousClass07T(AnonymousClass01z r2, int i) {
        this.A04 = r2;
        this.A03 = i;
    }

    public void A0D(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }
}

package X;

import androidx.compose.foundation.HoverableNode;
import androidx.compose.foundation.gestures.AbstractDraggableNode;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6gq  reason: invalid class name and case insensitive filesystem */
public abstract class C137856gq implements AnonymousClass7bY {
    public int A00 = -1;
    public int A01;
    public C137856gq A02;
    public C137856gq A03 = this;
    public C137856gq A04;
    public C94894iy A05;
    public C137886gt A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public AnonymousClass040 A0A;
    public boolean A0B;
    public boolean A0C;

    public static C1506776e A05(C137856gq r2, Object[] objArr) {
        C1506776e r1 = new C1506776e(objArr);
        C137856gq r0 = r2.A02;
        if (r0 == null) {
            AnonymousClass6VZ.A04(r1, r2);
            return r1;
        }
        r1.A0D(r0);
        return r1;
    }

    public static C94894iy A06(C137856gq r0) {
        C94894iy r02 = r0.A03.A05;
        AnonymousClass00C.A0B(r02);
        return r02;
    }

    public final AnonymousClass040 A07() {
        AnonymousClass040 r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass041 A022 = C009403z.A02(((AndroidComposeView) AnonymousClass6VZ.A03(this)).A0m.plus(new C007603g((C007403e) ((AndroidComposeView) AnonymousClass6VZ.A03(this)).A0m.get(C007403e.A00))));
        this.A0A = A022;
        return A022;
    }

    public void A08() {
        if (!(!this.A08)) {
            throw AnonymousClass001.A09("node attached multiple times");
        } else if (this.A05 != null) {
            this.A08 = true;
            this.A0B = true;
        } else {
            throw AnonymousClass001.A09("attach invoked on a node without a coordinator");
        }
    }

    public void A09() {
        if (!this.A08) {
            throw AnonymousClass001.A09("Cannot detach a node that is not attached");
        } else if (!(!this.A0B)) {
            throw AnonymousClass001.A09("Must run runAttachLifecycle() before markAsDetached()");
        } else if (!this.A0C) {
            this.A08 = false;
            AnonymousClass040 r1 = this.A0A;
            if (r1 != null) {
                C009403z.A03(new AnonymousClass79L(), r1);
                this.A0A = null;
            }
        } else {
            throw AnonymousClass001.A09("Must run runDetachLifecycle() before markAsDetached()");
        }
    }

    public void A0A() {
        if (this instanceof C94244ht) {
            ((C94244ht) this).A01 = false;
        } else if (this instanceof C94214hq) {
            C94214hq r3 = (C94214hq) this;
            int A002 = C94214hq.A00(r3);
            if (A002 == 0 || A002 == 2) {
                AnonymousClass6VZ.A01(r3).B2p(true, true);
            } else if (A002 == 1) {
                r3.A0I();
                AnonymousClass6S2 r1 = AnonymousClass6VZ.A01(r3).A05;
                try {
                    if (r1.A00) {
                        AnonymousClass6S2.A00(r1);
                    }
                    r1.A00 = true;
                    r3.A0J(AnonymousClass5U8.Inactive);
                } finally {
                    AnonymousClass6S2.A01(r1);
                }
            } else if (A002 == 3) {
                r3.A0I();
            }
        } else if (this instanceof C94364i5) {
            C94364i5 r12 = (C94364i5) this;
            C157707dy r0 = r12.A00;
            if (r0 != null) {
                r0.release();
            }
            r12.A00 = null;
        }
    }

    public void A0B() {
        if (this.A08) {
            A0A();
            return;
        }
        throw AnonymousClass001.A09("reset() called on an unattached node");
    }

    public void A0C() {
        if (!this.A08) {
            throw AnonymousClass001.A09("Must run markAsAttached() prior to runAttachLifecycle");
        } else if (this.A0B) {
            this.A0B = false;
            if (this instanceof C94104he) {
                ((C94104he) this).A00 = true;
            } else if (this instanceof C94384i8) {
                C94384i8.A01((C94384i8) this, true);
            } else if (this instanceof NestedScrollNode) {
                NestedScrollNode nestedScrollNode = (NestedScrollNode) this;
                NestedScrollDispatcher nestedScrollDispatcher = nestedScrollNode.A00;
                nestedScrollDispatcher.A00 = nestedScrollNode;
                nestedScrollDispatcher.A01 = new AnonymousClass7J1(nestedScrollNode);
                nestedScrollDispatcher.A02 = nestedScrollNode.A07();
            } else if (this instanceof C94094hd) {
                C94094hd r3 = (C94094hd) this;
                AnonymousClass6VZ.A02(r3).BqY(r3.A00);
            } else if (this instanceof C93474gc) {
                C93474gc r32 = (C93474gc) this;
                C157547di r1 = r32.A00;
                if (r1 instanceof BringIntoViewRequesterImpl) {
                    AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
                    ((BringIntoViewRequesterImpl) r1).A00.A0F(r32);
                }
                if (r1 instanceof BringIntoViewRequesterImpl) {
                    ((BringIntoViewRequesterImpl) r1).A00.A0D(r32);
                }
                r32.A00 = r1;
            } else if (this instanceof C94814ip) {
                C94814ip r33 = (C94814ip) this;
                r33.A08.A01 = new C136316eB(new AnonymousClass6eI((C161937ni) C109205Wr.A00(C131996Rr.A00, r33)));
                C109285Wz.A00(r33, new C151857Ig(r33));
            } else if (this instanceof C94824iq) {
                ((C94824iq) this).A00 = C136576ed.A00;
            }
            this.A0C = true;
        } else {
            throw AnonymousClass001.A09("Must run runAttachLifecycle() only once after markAsAttached()");
        }
    }

    public void A0D() {
        if (!this.A08) {
            throw AnonymousClass001.A09("node detached multiple times");
        } else if (this.A05 == null) {
            throw AnonymousClass001.A09("detach invoked on a node without a coordinator");
        } else if (this.A0C) {
            this.A0C = false;
            if (this instanceof C94104he) {
                ((C94104he) this).A00 = false;
            } else if (this instanceof C94384i8) {
                C94384i8.A00((C94384i8) this);
            } else if (this instanceof C94464iG) {
                ((C94464iG) this).BoX();
            } else if (this instanceof NestedScrollNode) {
                NestedScrollNode nestedScrollNode = (NestedScrollNode) this;
                NestedScrollDispatcher nestedScrollDispatcher = nestedScrollNode.A00;
                if (nestedScrollDispatcher.A00 == nestedScrollNode) {
                    nestedScrollDispatcher.A00 = null;
                }
            } else if (this instanceof C94134hh) {
                ((C94134hh) this).A00 = null;
            } else if (this instanceof C93474gc) {
                C93474gc r2 = (C93474gc) this;
                C157547di r1 = r2.A00;
                if (r1 instanceof BringIntoViewRequesterImpl) {
                    AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
                    ((BringIntoViewRequesterImpl) r1).A00.A0F(r2);
                }
            } else if (this instanceof HoverableNode) {
                ((HoverableNode) this).BkO();
            } else if (this instanceof AbstractDraggableNode) {
                AbstractDraggableNode abstractDraggableNode = (AbstractDraggableNode) this;
                abstractDraggableNode.A06 = false;
                abstractDraggableNode.A0G();
            } else if (this instanceof C94844is) {
                ((C94844is) this).A0G();
            }
        } else {
            throw AnonymousClass001.A09("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
    }

    public void A0E(C94894iy r2) {
        if (this instanceof C94114hf) {
            C94114hf r0 = (C94114hf) this;
            r0.A05 = r2;
            for (C137856gq r02 = r0.A00; r02 != null; r02 = r02.A02) {
                r02.A0E(r2);
            }
            return;
        }
        this.A05 = r2;
    }
}

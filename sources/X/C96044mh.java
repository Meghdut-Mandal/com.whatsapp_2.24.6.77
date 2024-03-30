package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;
import com.whatsapp.biz.catalog.view.AvailabilityStateTextView;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4mh  reason: invalid class name and case insensitive filesystem */
public final class C96044mh extends AnonymousClass0CZ {
    public int A00;
    public C134606bJ A01;
    public C157987fc A02 = C143126q1.A00;
    public C134746bX A03 = C109895Zn.A00();
    public boolean A04;
    public final C115955ji A05;
    public final UserJid A06;

    public C96044mh(C115955ji r2, UserJid userJid) {
        AnonymousClass00C.A0D(r2, 2);
        this.A06 = userJid;
        this.A05 = r2;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        int i2;
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i != 1) {
            if (i == 2) {
                i2 = R.layout.f9nameremoved;
            } else if (i != 3) {
                C36321k7.A1U("Unsupported ViewType=", AnonymousClass000.A0u(), i);
            } else {
                i2 = R.layout.f9nameremoved;
            }
            View inflate = C36351kA.A0C(viewGroup).inflate(i2, viewGroup, false);
            C115955ji r1 = this.A05;
            AnonymousClass00C.A0B(inflate);
            AnonymousClass5X0 A022 = AnonymousClass5X0.A02(this, 3);
            UserJid userJid = this.A06;
            List list = AnonymousClass0D3.A0I;
            return new C96784nt(inflate, (C196089Xp) r1.A00.A00.A0L.get(), new C143016pq(), userJid, A022);
        }
        i2 = R.layout.f9nameremoved;
        View inflate2 = C36351kA.A0C(viewGroup).inflate(i2, viewGroup, false);
        C115955ji r12 = this.A05;
        AnonymousClass00C.A0B(inflate2);
        AnonymousClass5X0 A0222 = AnonymousClass5X0.A02(this, 3);
        UserJid userJid2 = this.A06;
        List list2 = AnonymousClass0D3.A0I;
        return new C96784nt(inflate2, (C196089Xp) r12.A00.A00.A0L.get(), new C143016pq(), userJid2, A0222);
    }

    public int A0J() {
        if (this.A04) {
            return 5;
        }
        return this.A03.A01.size();
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r4) {
        C96784nt r42 = (C96784nt) r4;
        AnonymousClass00C.A0D(r42, 0);
        AnonymousClass7XT r2 = AnonymousClass7XT.A00;
        View view = r42.A0H;
        if ((view instanceof AvailabilityStateImageView) && view != null) {
            r2.invoke(view);
        }
        r42.A00.A00();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        C006302t r1;
        boolean z;
        C96784nt r82 = (C96784nt) r8;
        AnonymousClass00C.A0D(r82, 0);
        if (!this.A04) {
            C134606bJ A012 = C129376Gr.A01(this.A03, i);
            C134746bX r0 = this.A03;
            String str = r0.A00;
            C134456b4 r4 = (C134456b4) r0.A01.get(i);
            boolean z2 = false;
            boolean A1S = AnonymousClass000.A1S(this.A00, i);
            C134656bO A002 = C129376Gr.A00(A012, this.A01, this.A03.A02);
            if (A002 != null) {
                z2 = A002.A02;
            }
            AnonymousClass00C.A0D(r4, 1);
            View view = r82.A0H;
            view.setSelected(A1S);
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(' ');
            view.setContentDescription(AnonymousClass000.A0q(r4.A00(), A0v));
            if (r4 instanceof C102244zY) {
                r1 = new C154987Ui((C102244zY) r4, r82, z2);
                z = view instanceof AvailabilityStateImageView;
            } else if (r4 instanceof C102234zX) {
                r1 = new AnonymousClass7U5((C102234zX) r4, z2);
                z = view instanceof AvailabilityStateTextView;
            } else {
                return;
            }
            if (z) {
                r1.invoke(view);
            }
        }
    }

    public int getItemViewType(int i) {
        if (this.A04) {
            return 1;
        }
        if (this.A03.A01.get(i) instanceof C102244zY) {
            return 2;
        }
        return 3;
    }
}

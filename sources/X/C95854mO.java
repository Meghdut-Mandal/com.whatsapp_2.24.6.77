package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mO  reason: invalid class name and case insensitive filesystem */
public class C95854mO extends C02920Ck {
    public static final C02830Cb A02 = new C162467od(2);
    public AnonymousClass1RY A00;
    public final C115745jN A01;

    public C95854mO(C115745jN r2) {
        super(A02);
        this.A01 = r2;
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        Context context = viewGroup2.getContext();
        C18740tg.A06(context);
        int i2 = i;
        if (i == 0) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
            inflate.setEnabled(false);
            return new C96504nR(inflate);
        } else if (i2 == 1) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, viewGroup2, false);
            C115745jN r1 = this.A01;
            AnonymousClass1RY r8 = this.A00;
            C18740tg.A07(r8, "UpcomingScheduledCallsAdapter/onCreateViewHolder single contact photo loader null");
            List list = AnonymousClass0D3.A0I;
            C18800tq r0 = r1.A00.A01;
            C19970wo A0V = C36351kA.A0V(r0);
            C20810yC A0V2 = C36341k9.A0V(r0);
            AnonymousClass17Y A0M = C36351kA.A0M(r0);
            C19730wQ A0N = C36351kA.A0N(r0);
            C19770wU A0Z = C36341k9.A0Z(r0);
            AnonymousClass1ND A0Y = C36391kE.A0Y(r0);
            r0.A90.get();
            r0.A9X.get();
            AnonymousClass1A1 A0n = C36351kA.A0n(r0);
            AnonymousClass1HJ r10 = (AnonymousClass1HJ) r0.A1O.get();
            AnonymousClass1HO r13 = (AnonymousClass1HO) r0.A4M.get();
            C20310xM A0Z2 = C36371kC.A0Z(r0);
            AnonymousClass005 A002 = C18840tu.A00(r0.A2i);
            return new C97044oJ(inflate2, A0M, A0N, C36361kB.A0S(r0), A0Y, r8, A0V, r10, A0Z2, (AnonymousClass1SR) r0.A2t.get(), r13, (C26211Jh) r0.A7X.get(), (AnonymousClass1YE) r0.A4u.get(), A0V2, (C237919w) r0.A3J.get(), A0n, A0Z, A002);
        } else {
            C36321k7.A1S("UpcomingScheduledCallsAdapter/onCreateViewHolder failed to match type to view: ", AnonymousClass000.A0u(), i2);
            throw AnonymousClass001.A08("UpcomingScheduledCallsAdapter/onCreateViewHolder type mismatch");
        }
    }

    public void BSE(AnonymousClass0D3 r8, int i) {
        StringBuilder A0u;
        String str;
        if (i >= A0J()) {
            A0u = AnonymousClass000.A0u();
            str = "UpcomingScheduledCallsAdapter/onBindViewHolder no item exists at position ";
        } else {
            C159407jJ r1 = (C159407jJ) A0L(i);
            if (r1 == null) {
                A0u = AnonymousClass000.A0u();
                str = "UpcomingScheduledCallsAdapter/onBindViewHolder null item at position ";
            } else if (r1.BD8() != 0) {
                ((C97044oJ) r8).A0B((C144176rl) r1);
                return;
            } else {
                AnonymousClass6A0 r6 = ((C144166rk) r1).A00;
                View view = r8.A0H;
                Context context = view.getContext();
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = r6.A01;
                C36391kE.A0O(view, R.id.title).setText(C36391kE.A0v(context, r6.A00, A0M, 1, R.string.f12nameremoved));
                return;
            }
        }
        C36321k7.A1U(str, A0u, i);
    }

    public int getItemViewType(int i) {
        return ((C159407jJ) A0L(i)).BD8();
    }
}

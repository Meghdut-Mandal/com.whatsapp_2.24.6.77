package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class AIB implements C236119d {
    public final Context A00;
    public final C29221Vu A01;
    public final C19640wH A02;

    public static void A03(C203399nx r7, C22993Azj azj, String[] strArr) {
        AnonymousClass00C.A0D(r7, 0);
        C203539oF.A09(r7, azj, strArr, 1, 1).get(0);
    }

    public abstract void A05(C202059ky r1);

    public abstract void A06(C202059ky r1);

    public abstract void A07(C203399nx r1);

    public void BiM(C203399nx r4, String str) {
        this.A02.Bp3(new AVb(this, r4, 7));
    }

    public AIB(Context context, C29221Vu r2, C19640wH r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static ArrayList A02(C203399nx r6) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator A08 = C203399nx.A08(r6, "error");
        while (A08.hasNext()) {
            C203399nx A0s = C36431kI.A0s(A08);
            if (A0s != null) {
                String A0i = A0s.A0i("code", (String) null);
                String A0i2 = A0s.A0i("text", (String) null);
                A0s.A0i("display_title", (String) null);
                String A0i3 = A0s.A0i("display_text", (String) null);
                if (A0i != null) {
                    int parseInt = Integer.parseInt(A0i);
                    C202059ky A002 = C202059ky.A00();
                    A002.A00 = parseInt;
                    A002.A07 = A0i2;
                    A002.A06 = A0i3;
                    A0I.add(A002);
                    if (parseInt == 454) {
                        A002.A04 = A0s.A0c("step_up");
                    }
                }
            }
        }
        return A0I;
    }

    public ArrayList A04(C203399nx r2) {
        return A02(r2);
    }

    public void BVN(String str) {
        C202059ky A002 = C202059ky.A00();
        int i = 6;
        if (C19600wD.A02(this.A00)) {
            i = -2;
        }
        A002.A00 = i;
        this.A02.Bp3(new AVb(this, A002, 5));
    }

    public void BWw(C203399nx r6, String str) {
        Iterator it = A04(r6).iterator();
        while (it.hasNext()) {
            C202059ky r3 = (C202059ky) it.next();
            C29221Vu r0 = this.A01;
            int i = r3.A00;
            AnonymousClass1XA r2 = r0.A00;
            if (r2 != null && (i == 404 || i == 440 || i == 449)) {
                r2.A01(true, false);
            }
            this.A02.Bp3(new AVb(this, r3, 6));
        }
    }
}

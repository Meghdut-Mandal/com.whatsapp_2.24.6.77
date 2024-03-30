package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.R;

/* renamed from: X.3Ru  reason: invalid class name and case insensitive filesystem */
public class C65373Ru {
    public final C21360z5 A00;
    public final AnonymousClass13T A01;
    public final C33751fs A02;
    public final C19420v0 A03;
    public final C18820ts A04;
    public final C20810yC A05;
    public final C21010yW A06;

    public static String A00(Context context, Uri uri, int i) {
        return C36391kE.A0v(context, C36391kE.A0v(context, uri.toString(), new Object[1], 0, R.string.f12nameremoved), new Object[1], 0, i);
    }

    public AnonymousClass0FM A02(Activity activity, C33771fu r15) {
        AnonymousClass13T r1 = this.A01;
        int time = ((int) ((r1.A00.A01().getTime() - C19970wo.A00(r1.A01)) / 86400000)) + 1;
        long j = (long) time;
        A01(this, (Integer) null, 0, j, this.A00.A01().getTime());
        C39001qm A002 = AnonymousClass3LW.A00(activity);
        A002.A0d(R.string.f12nameremoved);
        C18820ts r3 = this.A04;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, time, 0);
        A002.A0p(r3.A0L(objArr, R.plurals.f10nameremoved, j));
        A002.A0h(new AnonymousClass3VA(activity, this, r15, time), R.string.f12nameremoved);
        A002.A0f(new AnonymousClass4X6(activity, time, 0, this), R.string.f12nameremoved);
        return A002.create();
    }

    public static void A01(C65373Ru r2, Integer num, int i, long j, long j2) {
        if (r2.A05.A0E(3299)) {
            C45212Qm r1 = new C45212Qm();
            r1.A02 = C36381kD.A0m();
            if (i != 0) {
                r1.A01 = num;
            }
            r1.A00 = Integer.valueOf(i);
            r1.A04 = Long.valueOf(j);
            r1.A03 = Long.valueOf(j2);
            r2.A06.Blv(r1);
        }
    }

    public C65373Ru(C21360z5 r1, AnonymousClass13T r2, C33751fs r3, C19420v0 r4, C18820ts r5, C20810yC r6, C21010yW r7) {
        this.A05 = r6;
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}

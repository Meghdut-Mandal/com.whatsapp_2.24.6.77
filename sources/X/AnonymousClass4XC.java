package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.Me;
import com.whatsapp.R;
import java.util.Calendar;

/* renamed from: X.4XC  reason: invalid class name */
public class AnonymousClass4XC implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass4XC(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C64693Pb r4;
        Activity activity;
        C225014r r2;
        AnonymousClass141 r1;
        boolean z;
        String A0q;
        switch (this.A04) {
            case 0:
                Activity activity2 = (Activity) this.A00;
                AnonymousClass3DY r5 = (AnonymousClass3DY) this.A01;
                Me me = (Me) this.A03;
                boolean A002 = ((AnonymousClass1CF) this.A02).A00();
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("catalog not available");
                if (me == null) {
                    A0q = "";
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append(" +");
                    A0u2.append(me.cc);
                    A0q = AnonymousClass000.A0q(me.number, A0u2);
                }
                AnonymousClass3DY.A00(activity2, r5, AnonymousClass000.A0q(A0q, A0u), A002);
                return;
            case 1:
                r4 = (C64693Pb) this.A00;
                activity = (Activity) this.A01;
                r2 = (C225014r) this.A02;
                r1 = (AnonymousClass141) this.A03;
                AnonymousClass3SJ.A00(activity, 10);
                z = true;
                break;
            case 2:
                r4 = (C64693Pb) this.A00;
                activity = (Activity) this.A01;
                r2 = (C225014r) this.A02;
                r1 = (AnonymousClass141) this.A03;
                AnonymousClass3SJ.A00(activity, 10);
                z = false;
                break;
            case 3:
                AnonymousClass2KO r52 = (AnonymousClass2KO) this.A00;
                Activity activity3 = (Activity) this.A01;
                AnonymousClass3T1 r6 = (AnonymousClass3T1) this.A02;
                Object obj = this.A03;
                if (!C19550w8.A08() || r52.A07.A00.A00()) {
                    Calendar instance = Calendar.getInstance();
                    Calendar calendar = r52.A03;
                    if (calendar == null) {
                        throw C36331k8.A0d("reminderDateTime");
                    }
                    if (!calendar.before(instance)) {
                        Calendar calendar2 = r52.A03;
                        if (calendar2 == null) {
                            throw C36331k8.A0d("reminderDateTime");
                        }
                        long timeInMillis = calendar2.getTimeInMillis();
                        if (timeInMillis != 0) {
                            r52.A05.A00(r6, "cta_reminder", "cta_cancel_reminder");
                            r52.A0G.Boy(new AnonymousClass73L(obj, r52, r6, 2, timeInMillis));
                            return;
                        }
                    }
                    C39001qm A003 = AnonymousClass3LW.A00(activity3);
                    A003.A0c(R.string.f12nameremoved);
                    A003.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
                    C36341k9.A11(A003);
                    return;
                }
                AnonymousClass2KO.A00(activity3, r52);
                return;
            default:
                Object obj2 = this.A02;
                Object obj3 = this.A03;
                AnonymousClass00C.A0D(dialogInterface, 4);
                C81193wc.A01((C19770wU) this.A00, obj2, obj3, 35);
                dialogInterface.dismiss();
                ((AnonymousClass4Q0) this.A01).B2t();
                return;
        }
        C64693Pb.A00(activity, r2, r4, r1, z);
    }
}

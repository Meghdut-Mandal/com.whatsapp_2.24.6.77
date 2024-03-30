package X;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.1Z3  reason: invalid class name */
public class AnonymousClass1Z3 {
    public final C19730wQ A00;
    public final AnonymousClass1LV A01;
    public final AnonymousClass16D A02;
    public final C19970wo A03;
    public final C19630wG A04;
    public final C25271Fq A05;
    public final C220712t A06;
    public final C220412q A07;
    public final C20600xp A08;
    public final AnonymousClass1CR A09;

    private void A00(PendingIntent pendingIntent, Context context, GroupJid groupJid, CharSequence charSequence, String str, int i) {
        C25271Fq r3 = this.A05;
        String A002 = C25271Fq.A00(groupJid);
        if (A002 != null) {
            Bitmap A0C = this.A08.A0C(this.A02.A0D(groupJid));
            AnonymousClass0TO r1 = new AnonymousClass0TO();
            r1.A01 = str;
            r1.A00 = IconCompat.A03(A0C);
            AnonymousClass0UW r7 = new AnonymousClass0UW(r1);
            NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r7);
            notificationCompat$MessagingStyle.A0C(new C07210Wt(r7, charSequence, System.currentTimeMillis()));
            notificationCompat$MessagingStyle.A00 = false;
            C18740tg.A06(groupJid);
            String rawString = groupJid.getRawString();
            C07700Yy r4 = new C07700Yy(context, (String) null);
            r4.A06 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
            r4.A0G(str);
            r4.A09(System.currentTimeMillis());
            r4.A06(3);
            r4.A0I(true);
            r4.A0C(notificationCompat$MessagingStyle);
            r4.A0O = rawString;
            r4.A0D = pendingIntent;
            r4.A0B.icon = R.drawable.notifybar;
            r4.A0A(A0C);
            if (Build.VERSION.SDK_INT >= 26) {
                String A0E = ((C47192dt) AnonymousClass1CR.A02(this.A09, groupJid.getRawString())).A0E();
                if (A0E != null) {
                    r4.A0M = A0E;
                } else {
                    return;
                }
            }
            r3.A07(A002, i, r4.A05());
        }
    }

    public void A01(C181758nz r12) {
        GroupJid groupJid = (GroupJid) r12.A1J.A00;
        if (groupJid != null) {
            C220412q r3 = this.A07;
            if (!r3.A0O(groupJid)) {
                AnonymousClass1LV r1 = this.A01;
                AnonymousClass147 r2 = (AnonymousClass147) groupJid;
                AnonymousClass00C.A0D(r2, 0);
                AnonymousClass3QK A002 = r1.A08.A00(r2);
                if (A002 != null) {
                    if (!AnonymousClass1CR.A02(this.A09, A002.A02.getRawString()).A0A()) {
                        Context context = this.A04.A00;
                        String A0D = r3.A0D(groupJid);
                        if (A0D != null) {
                            C20600xp r0 = this.A08;
                            context.getApplicationContext();
                            A00(C65743Th.A00(context, 6, AnonymousClass190.A0t(context, r2), 134217728), context, groupJid, r0.A0G(r12), A0D, 72);
                        }
                    }
                }
            }
        }
    }

    public void A02(C181758nz r13) {
        C207209uj r0 = r13.A03;
        if (r0 != null) {
            C65073Qp A092 = this.A07.A09(AnonymousClass143.A00(r0.A02), false);
            if (A092 != null) {
                if (A092.A0i) {
                    this.A06.A08(A092.A06(), 3, false);
                }
                if (!AnonymousClass1CR.A02(this.A09, A092.A06().getRawString()).A0A()) {
                    Context context = this.A04.A00;
                    String A082 = A092.A08();
                    C20600xp r02 = this.A08;
                    context.getApplicationContext();
                    CharSequence A0G = r02.A0G(r13);
                    AnonymousClass147 A022 = this.A01.A02((AnonymousClass147) ((GroupJid) A092.A06()));
                    if (A022 != null) {
                        List list = r13.A01;
                        if (list.size() == 1) {
                            C19730wQ r1 = this.A00;
                            if (r1.A0M((AnonymousClass11F) list.get(0)) && r1.A0M(r13.A0J())) {
                                return;
                            }
                        }
                        A00(C65743Th.A00(context, 6, AnonymousClass190.A0d(context, A022, 0), 134217728), context, A022, A0G, A082, 49);
                    }
                }
            }
        }
    }

    public AnonymousClass1Z3(C19730wQ r1, AnonymousClass1LV r2, AnonymousClass16D r3, C19970wo r4, C19630wG r5, C25271Fq r6, C220712t r7, C220412q r8, C20600xp r9, AnonymousClass1CR r10) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A09 = r10;
        this.A08 = r9;
        this.A01 = r2;
        this.A05 = r6;
    }
}

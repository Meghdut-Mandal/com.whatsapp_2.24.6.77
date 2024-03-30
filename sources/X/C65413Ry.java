package X;

import android.os.CountDownTimer;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Ry  reason: invalid class name and case insensitive filesystem */
public class C65413Ry {
    public CountDownTimer A00;
    public AnonymousClass31F A01;
    public AnonymousClass3D7 A02;
    public AnonymousClass381 A03;
    public C87744Pz A04;
    public boolean A05 = false;
    public final AnonymousClass17Y A06;
    public final C19970wo A07;
    public final C62563Gq A08;
    public final C19770wU A09;
    public final SimpleDateFormat A0A;
    public final SimpleDateFormat A0B;
    public final SimpleDateFormat A0C;

    public static void A00(C65413Ry r5) {
        r5.A02.A00((String) null, R.string.f12nameremoved, true, false);
        InteractiveMessageView interactiveMessageView = r5.A02.A00;
        C36331k8.A0r(interactiveMessageView.getContext(), interactiveMessageView.A04, R.color.f6nameremoved);
        r5.A02.A00.A03.setVisibility(8);
    }

    public boolean A02() {
        Long l;
        AnonymousClass381 r0 = this.A03;
        if (r0 == null || (l = r0.A00) == null || l.longValue() - C19970wo.A00(this.A07) >= 0) {
            return false;
        }
        return true;
    }

    public C65413Ry(AnonymousClass17Y r4, C19970wo r5, C18820ts r6, C62563Gq r7, C19770wU r8) {
        this.A07 = r5;
        this.A06 = r4;
        this.A09 = r8;
        this.A08 = r7;
        this.A0A = new SimpleDateFormat("MMM dd", C36401kF.A0x(r6));
        this.A0B = new SimpleDateFormat("hh:mm a", C36401kF.A0x(r6));
        this.A0C = new SimpleDateFormat("yyyy MM dd", Locale.US);
    }

    public static void A01(C65413Ry r15, Long l) {
        AnonymousClass3D7 r2;
        int i;
        String valueOf;
        long longValue = l.longValue();
        C19970wo r8 = r15.A07;
        long A002 = longValue - C19970wo.A00(r8);
        long convert = TimeUnit.DAYS.convert(A002, TimeUnit.MILLISECONDS);
        if (convert >= 14) {
            Date date = new Date(longValue);
            r2 = r15.A02;
            i = R.string.f12nameremoved;
            valueOf = r15.A0A.format(date);
        } else if (convert > 1) {
            r2 = r15.A02;
            i = R.string.f12nameremoved;
            valueOf = String.valueOf(convert);
        } else {
            long convert2 = TimeUnit.HOURS.convert(A002, TimeUnit.MILLISECONDS);
            if (convert2 <= 48) {
                Date date2 = new Date(C19970wo.A00(r8));
                Date date3 = new Date(longValue);
                AnonymousClass3D7 r22 = r15.A02;
                SimpleDateFormat simpleDateFormat = r15.A0C;
                boolean equals = simpleDateFormat.format(date3).equals(simpleDateFormat.format(date2));
                int i2 = R.string.f12nameremoved;
                if (equals) {
                    i2 = R.string.f12nameremoved;
                }
                r22.A00(r15.A0B.format(date3), i2, true, false);
            }
            if (convert2 < 1) {
                InteractiveMessageView interactiveMessageView = r15.A02.A00;
                C36331k8.A0r(interactiveMessageView.getContext(), interactiveMessageView.A04, R.color.f6nameremoved);
                return;
            }
            return;
        }
        r2.A00(valueOf, i, true, false);
    }
}

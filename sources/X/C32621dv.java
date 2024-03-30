package X;

import android.content.Context;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1dv  reason: invalid class name and case insensitive filesystem */
public class C32621dv {
    public final C19970wo A00;
    public final C19630wG A01;
    public final C18820ts A02;
    public final AnonymousClass16D A03;
    public final C32631dw A04;
    public final AnonymousClass171 A05;
    public final C27361Nx A06;

    public String A01(AnonymousClass141 r12) {
        Context context;
        int i;
        AnonymousClass35F r4;
        Context context2;
        int i2;
        if (r12.A0H instanceof C177618e5) {
            return null;
        }
        boolean A0G = r12.A0G();
        C27361Nx r42 = this.A06;
        Class<AnonymousClass11F> cls = AnonymousClass11F.class;
        if (A0G) {
            Jid A062 = r12.A06(cls);
            C18740tg.A06(A062);
            AnonymousClass11F r2 = (AnonymousClass11F) A062;
            AnonymousClass3A3 r1 = (AnonymousClass3A3) r42.A04.get(r2);
            Object obj = null;
            if (r1 != null) {
                int i3 = -1;
                if (AnonymousClass143.A0G(r2)) {
                    HashMap hashMap = r1.A05;
                    if (hashMap != null) {
                        long j = 0;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            if (((AnonymousClass35E) entry.getValue()).A01 > j) {
                                obj = entry.getKey();
                                j = ((AnonymousClass35E) entry.getValue()).A01;
                                i3 = ((AnonymousClass35E) entry.getValue()).A00;
                            }
                        }
                        if (j != 0 && j + 25000 > SystemClock.elapsedRealtime()) {
                            C18740tg.A06(obj);
                            r4 = new AnonymousClass35F((AnonymousClass11F) obj, i3);
                        }
                    }
                } else {
                    int A022 = r42.A02(r2, (UserJid) null);
                    if (A022 != -1) {
                        r4 = new AnonymousClass35F(r2, A022);
                    }
                }
                AnonymousClass141 A0D = this.A03.A0D(r4.A01);
                AnonymousClass171 r13 = this.A05;
                String A0Q = r13.A0Q(A0D, r13.A0A(r12.A0H));
                int i4 = r4.A00;
                if (i4 == 0) {
                    context2 = this.A01.A00;
                    i2 = R.string.f12nameremoved;
                } else if (i4 == 1) {
                    context2 = this.A01.A00;
                    i2 = R.string.f12nameremoved;
                }
                return context2.getString(i2, new Object[]{this.A02.A0G(A0Q)});
            }
        } else {
            Jid A063 = r12.A06(cls);
            C18740tg.A06(A063);
            int A023 = r42.A02((AnonymousClass11F) A063, (UserJid) null);
            if (A023 == 0) {
                context = this.A01.A00;
                i = R.string.f12nameremoved;
            } else if (A023 == 1) {
                context = this.A01.A00;
                i = R.string.f12nameremoved;
            }
            return context.getString(i);
        }
        return null;
    }

    public C32621dv(AnonymousClass16D r1, C32631dw r2, AnonymousClass171 r3, C19970wo r4, C19630wG r5, C18820ts r6, C27361Nx r7) {
        this.A01 = r5;
        this.A00 = r4;
        this.A03 = r1;
        this.A05 = r3;
        this.A02 = r6;
        this.A06 = r7;
        this.A04 = r2;
    }

    public String A00(AnonymousClass141 r10) {
        int i;
        String A012 = A01(r10);
        if (A012 != null) {
            return A012;
        }
        C27361Nx r1 = this.A06;
        Jid A062 = r10.A06(AnonymousClass11F.class);
        C18740tg.A06(A062);
        long A032 = r1.A03((AnonymousClass11F) A062);
        if (A032 == 0) {
            return "";
        }
        if (A032 == 1) {
            return this.A01.A00.getString(R.string.f12nameremoved);
        }
        toString();
        C19970wo r0 = this.A00;
        long A08 = r0.A08(A032);
        int A002 = AnonymousClass6XI.A00(C19970wo.A00(r0), A08);
        if (A002 <= 6) {
            if (A002 != 0) {
                if (A002 != 1) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(A08);
                    switch (instance.get(7)) {
                        case 1:
                            i = R.string.f12nameremoved;
                            break;
                        case 2:
                            i = R.string.f12nameremoved;
                            break;
                        case 3:
                            i = R.string.f12nameremoved;
                            break;
                        case 4:
                            i = R.string.f12nameremoved;
                            break;
                        case 5:
                            i = R.string.f12nameremoved;
                            break;
                        case 6:
                            i = R.string.f12nameremoved;
                            break;
                        case 7:
                            i = R.string.f12nameremoved;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = R.string.f12nameremoved;
                }
            } else {
                i = R.string.f12nameremoved;
            }
            C18820ts r5 = this.A02;
            String A003 = AnonymousClass3UM.A00(r5, A08);
            return AnonymousClass3UM.A01(r5, this.A01.A00.getString(i, new Object[]{A003}), A08);
        }
        String A052 = AnonymousClass3UY.A05(this.A02, A002, A08);
        return this.A01.A00.getString(R.string.f12nameremoved, new Object[]{A052});
    }

    public String A02(AnonymousClass141 r8) {
        if (A01(r8) != null) {
            return null;
        }
        C27361Nx r4 = this.A06;
        Class<AnonymousClass11F> cls = AnonymousClass11F.class;
        Jid A062 = r8.A06(cls);
        C18740tg.A06(A062);
        long A032 = r4.A03((AnonymousClass11F) A062);
        Jid A063 = r8.A06(cls);
        C18740tg.A06(A063);
        if (1 == r4.A03((AnonymousClass11F) A063)) {
            return null;
        }
        C19970wo r0 = this.A00;
        long A08 = r0.A08(A032);
        int A002 = AnonymousClass6XI.A00(C19970wo.A00(r0), A08);
        if (A002 > 6) {
            return AnonymousClass3UY.A05(this.A02, A002, A08);
        }
        if (!(A002 == 0 || A002 == 1)) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(A08);
            instance.get(7);
        }
        C18820ts r1 = this.A02;
        return AnonymousClass3UM.A01(r1, AnonymousClass3UM.A00(r1, A08), A08);
    }
}

package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.6tC  reason: invalid class name and case insensitive filesystem */
public class C145006tC implements AnonymousClass191 {
    public final AnonymousClass005 A00;

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bau(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bb6(Collection collection, Map map) {
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public void Bas(AnonymousClass3T1 r8, int i) {
        if (i != 29) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ScheduleCallMessageObserver/onMessageAdded messageType: ");
            C36321k7.A1Y(A0u, r8.A1I);
            if (r8 instanceof AnonymousClass2c9) {
                C31021b9 r3 = (C31021b9) this.A00.get();
                r3.A09.execute(new C35761jD(r3, r8, 44));
            } else if (r8 instanceof AnonymousClass5JA) {
                AnonymousClass5JA r82 = (AnonymousClass5JA) r8;
                int i2 = r82.A00;
                String str = r82.A02;
                AnonymousClass11F r32 = r82.A1J.A00;
                AnonymousClass11F A0J = r82.A0J();
                if (TextUtils.isEmpty(str) || r32 == null || A0J == null) {
                    Log.w("ScheduleCallMessageObserver/onMessageAdded FMessageScheduledCallEdit has empty parentMessageId or chatJid or senderJid");
                } else if (i2 == 1) {
                    C31021b9 r2 = (C31021b9) this.A00.get();
                    r2.A09.execute(new C35521ip(r2, r32, A0J, str, 8));
                }
            }
        }
    }

    public C145006tC(AnonymousClass005 r1) {
        this.A00 = r1;
    }
}

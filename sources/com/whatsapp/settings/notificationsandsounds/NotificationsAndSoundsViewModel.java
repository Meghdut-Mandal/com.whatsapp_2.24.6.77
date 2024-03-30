package com.whatsapp.settings.notificationsandsounds;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass11F;
import X.AnonymousClass144;
import X.AnonymousClass147;
import X.AnonymousClass17X;
import X.AnonymousClass1CR;
import X.AnonymousClass3LI;
import X.AnonymousClass4WB;
import X.C001700s;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C220412q;
import X.C233117z;
import X.C28201Rs;
import X.C34681hT;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import X.C56602wa;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;

public final class NotificationsAndSoundsViewModel extends AnonymousClass04R {
    public AnonymousClass11F A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final AnonymousClass1CR A04;
    public final C28201Rs A05 = C36441kJ.A0t();
    public final C19770wU A06;
    public final C19730wQ A07;
    public final C220412q A08;
    public final AnonymousClass17X A09;
    public final C20810yC A0A;
    public final C233117z A0B;
    public final AnonymousClass4WB A0C;

    public static final void A01(AnonymousClass11F r10, NotificationsAndSoundsViewModel notificationsAndSoundsViewModel) {
        boolean z = false;
        if (r10 == null) {
            notificationsAndSoundsViewModel.A03.A0C(AnonymousClass001.A0J());
            notificationsAndSoundsViewModel.A01.A0C(AnonymousClass001.A0J());
        } else {
            AnonymousClass1CR r4 = notificationsAndSoundsViewModel.A04;
            AnonymousClass3LI A0d = C36361kB.A0d(r10, r4);
            if (true != A0d.A0L) {
                A0d.A0G = A0d.A0C();
                A0d.A0L = true;
                AnonymousClass1CR.A06(A0d, r4);
            }
            AnonymousClass3LI A0d2 = C36361kB.A0d(r10, r4);
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("jid_message_mute", "");
            String A072 = A0d2.A07();
            AnonymousClass00C.A08(A072);
            A0J.put("jid_message_tone", A072);
            String A082 = A0d2.A08();
            AnonymousClass00C.A08(A082);
            A0J.put("jid_message_vibration", A082);
            A0J.put("jid_message_advanced", "");
            HashMap A0J2 = AnonymousClass001.A0J();
            boolean z2 = r10 instanceof AnonymousClass147;
            if (z2) {
                C20810yC r8 = notificationsAndSoundsViewModel.A0A;
                if (C34681hT.A0C(notificationsAndSoundsViewModel.A07, r8, notificationsAndSoundsViewModel.A09.A07.A0B((AnonymousClass144) r10))) {
                    z = true;
                }
            }
            if (r10 instanceof UserJid) {
                String A032 = A0d2.A03();
                AnonymousClass00C.A08(A032);
                A0J2.put("jid_call_ringtone", A032);
                String A042 = A0d2.A04();
                AnonymousClass00C.A08(A042);
                A0J2.put("jid_call_vibration", A042);
            }
            if (z2) {
                if (!AnonymousClass000.A1Z(C56602wa.A00, notificationsAndSoundsViewModel.A08.A05((GroupJid) r10))) {
                    if (notificationsAndSoundsViewModel.A09.A07.A0B((AnonymousClass144) r10) > 2 && notificationsAndSoundsViewModel.A0A.A0E(7481)) {
                        A0J2.put("jid_call_mute", "");
                    }
                }
            }
            notificationsAndSoundsViewModel.A03.A0C(A0J);
            notificationsAndSoundsViewModel.A01.A0C(A0J2);
        }
        C36341k9.A19(notificationsAndSoundsViewModel.A02, z);
    }

    public void A0R() {
        this.A0B.unregisterObserver(this.A0C);
    }

    public NotificationsAndSoundsViewModel(C19730wQ r3, C220412q r4, AnonymousClass17X r5, C20810yC r6, C233117z r7, AnonymousClass1CR r8, C19770wU r9) {
        C36321k7.A1B(r6, r3, r9, r4, r8);
        C36321k7.A10(r5, r7);
        this.A0A = r6;
        this.A07 = r3;
        this.A06 = r9;
        this.A08 = r4;
        this.A04 = r8;
        this.A09 = r5;
        this.A0B = r7;
        AnonymousClass4WB r0 = new AnonymousClass4WB(this, 21);
        this.A0C = r0;
        r7.registerObserver(r0);
    }
}

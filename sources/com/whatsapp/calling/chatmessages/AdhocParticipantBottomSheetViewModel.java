package com.whatsapp.calling.chatmessages;

import X.AnonymousClass04R;
import X.AnonymousClass05E;
import X.AnonymousClass05L;
import X.AnonymousClass05N;
import X.AnonymousClass08M;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1HK;
import X.AnonymousClass1ND;
import X.C005502l;
import X.C023409w;
import X.C023509x;
import X.C107265Nh;
import X.C109325Xd;
import X.C130806Mm;
import X.C135006by;
import X.C19630wG;
import X.C19730wQ;
import X.C20810yC;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import java.util.Map;

public final class AdhocParticipantBottomSheetViewModel extends AnonymousClass04R {
    public C107265Nh A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final C19730wQ A04;
    public final AnonymousClass1ND A05;
    public final C130806Mm A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass171 A08;
    public final C19630wG A09;
    public final AnonymousClass1HK A0A;
    public final C135006by A0B;
    public final C005502l A0C;
    public final AnonymousClass05L A0D;
    public final AnonymousClass05L A0E;
    public final AnonymousClass05L A0F;
    public final AnonymousClass05L A0G;
    public final AnonymousClass05L A0H;
    public final boolean A0I;
    public final C20810yC A0J;

    public final void A0S(Context context, boolean z) {
        C107265Nh r4 = this.A00;
        if (r4 != null) {
            this.A01 = true;
            C36331k8.A1T(new AdhocParticipantBottomSheetViewModel$clickCallButton$1$1(context, this, r4, (C023509x) null, z), C109325Xd.A00(this));
        }
    }

    public AdhocParticipantBottomSheetViewModel(AnonymousClass08M r5, C19730wQ r6, AnonymousClass1ND r7, C130806Mm r8, AnonymousClass16D r9, AnonymousClass171 r10, C19630wG r11, AnonymousClass1HK r12, C20810yC r13, C005502l r14) {
        boolean z;
        C36321k7.A1B(r13, r12, r14, r9, r10);
        C36321k7.A10(r6, r7);
        C36391kE.A1U(r11, r5);
        this.A0J = r13;
        this.A0A = r12;
        this.A0C = r14;
        this.A07 = r9;
        this.A08 = r10;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A09 = r11;
        Map map = r5.A03;
        this.A0B = (C135006by) map.get("call_log_message_key");
        Boolean bool = (Boolean) map.get("is_from_call_log");
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.A0I = z;
        this.A03 = r13.A07(862) - 1;
        this.A0H = AnonymousClass05E.A00(C023409w.A00);
        this.A0F = AnonymousClass05E.A00((Object) null);
        this.A0E = AnonymousClass05E.A00((Object) null);
        this.A0G = new AnonymousClass05N(0);
        this.A0D = AnonymousClass05E.A00((Object) null);
        C36381kD.A1R(this.A0C, new AdhocParticipantBottomSheetViewModel$refreshParticipants$1(this, (C023509x) null), C109325Xd.A00(this));
    }
}

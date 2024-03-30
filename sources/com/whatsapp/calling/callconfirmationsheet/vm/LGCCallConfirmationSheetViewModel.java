package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass001;
import X.AnonymousClass04R;
import X.AnonymousClass05E;
import X.AnonymousClass05H;
import X.AnonymousClass05L;
import X.AnonymousClass08M;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass1C6;
import X.AnonymousClass1ND;
import X.C005502l;
import X.C023509x;
import X.C15330nA;
import X.C19730wQ;
import X.C20350xQ;
import X.C36321k7;
import java.util.Map;

public final class LGCCallConfirmationSheetViewModel extends AnonymousClass04R {
    public final int A00;
    public final C19730wQ A01;
    public final AnonymousClass1ND A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final AnonymousClass17X A05;
    public final C20350xQ A06;
    public final AnonymousClass147 A07;
    public final AnonymousClass1C6 A08;
    public final C005502l A09;
    public final C005502l A0A;
    public final AnonymousClass05H A0B;
    public final AnonymousClass05L A0C;
    public final boolean A0D;

    public LGCCallConfirmationSheetViewModel(AnonymousClass08M r4, C19730wQ r5, AnonymousClass1ND r6, AnonymousClass16D r7, AnonymousClass171 r8, AnonymousClass17X r9, C20350xQ r10, AnonymousClass1C6 r11, C005502l r12, C005502l r13) {
        C36321k7.A1B(r4, r5, r11, r6, r7);
        C36321k7.A1C(r8, r10, r9, r12, r13);
        this.A01 = r5;
        this.A08 = r11;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A06 = r10;
        this.A05 = r9;
        this.A0A = r12;
        this.A09 = r13;
        Map map = r4.A03;
        Boolean bool = (Boolean) map.get("is_video");
        if (bool != null) {
            this.A0D = bool.booleanValue();
            AnonymousClass147 r0 = (AnonymousClass147) map.get("group_jid");
            if (r0 != null) {
                this.A07 = r0;
                Number number = (Number) map.get("call_from_ui");
                if (number != null) {
                    this.A00 = number.intValue();
                    this.A0B = new C15330nA(new LGCCallConfirmationSheetViewModel$uiState$1(this, (C023509x) null));
                    this.A0C = AnonymousClass05E.A00((Object) null);
                    return;
                }
                throw AnonymousClass001.A09("LGCCallConfirmationSheetViewModel callFromUi cannot be null");
            }
            throw AnonymousClass001.A09("LGCCallConfirmationSheetViewModel groupJid cannot be null");
        }
        throw AnonymousClass001.A09("LGCCallConfirmationSheetViewModel isVideoCall cannot be null");
    }
}

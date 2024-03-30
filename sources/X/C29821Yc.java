package X;

import com.whatsapp.data.ChatOriginManager$updateChatOriginForMessage$1;

/* renamed from: X.1Yc  reason: invalid class name and case insensitive filesystem */
public final class C29821Yc {
    public final AnonymousClass163 A00;
    public final C220412q A01;
    public final C20810yC A02;
    public final C005502l A03;
    public final AnonymousClass040 A04;

    public C29821Yc(AnonymousClass163 r2, C220412q r3, C20810yC r4, C005502l r5, AnonymousClass040 r6) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r2, 4);
        AnonymousClass00C.A0D(r3, 5);
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(AnonymousClass3T1 r6) {
        C223313w r4;
        C52152oy r0;
        AnonymousClass11F A0J = r6.A0J();
        if ((A0J instanceof C223313w) && (r4 = (C223313w) A0J) != null && (r0 = r6.A0L) != null) {
            AnonymousClass040 r3 = this.A04;
            ChatOriginManager$updateChatOriginForMessage$1 chatOriginManager$updateChatOriginForMessage$1 = new ChatOriginManager$updateChatOriginForMessage$1(r0, this, r4, (C023509x) null);
            AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, chatOriginManager$updateChatOriginForMessage$1, r3);
        }
    }
}

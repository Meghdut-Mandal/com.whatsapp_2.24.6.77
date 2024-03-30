package X;

import com.whatsapp.status.playback.widget.VoiceStatusContentView;
import java.util.List;

/* renamed from: X.3rL  reason: invalid class name and case insensitive filesystem */
public final class C77963rL implements C87314Oh {
    public boolean A00;
    public final C001700s A01;
    public final C001700s A02;
    public final C001700s A03;
    public final C88174Rr A04;
    public final List A05 = AnonymousClass001.A0I();
    public final C001600r A06;
    public final C001600r A07;
    public final C001700s A08;
    public final AnonymousClass04S A09;

    public C77963rL(C46812bi r8, C88174Rr r9) {
        this.A04 = r9;
        Object obj = null;
        C001700s A0Z = C36441kJ.A0Z((Object) null);
        this.A08 = A0Z;
        C001700s A0Z2 = C36441kJ.A0Z((Object) null);
        this.A01 = A0Z2;
        C001700s A0Z3 = C36441kJ.A0Z((Object) null);
        this.A02 = A0Z3;
        AnonymousClass08S A002 = C196339Zf.A00(A0Z, A0Z2, A0Z3, new C53922s7(this, 0));
        this.A06 = A002;
        C001700s A0Z4 = C36441kJ.A0Z(-4);
        this.A03 = A0Z4;
        AnonymousClass08S A003 = C196339Zf.A00(A002, A0Z4, A0Z2, new C53922s7(this, 1));
        this.A07 = A003;
        C65963Ud r0 = new C65963Ud(this, 24);
        this.A09 = r0;
        ((VoiceStatusContentView) r9).A05 = this;
        A003.A0A(r0);
        if (AnonymousClass000.A1S(r8.A0A & 32768, 32768)) {
            AnonymousClass3QP r02 = (AnonymousClass3QP) r8.A00.A00;
            A0Z.A0D(r02 != null ? r02.A04.getValue() : obj);
        }
    }
}

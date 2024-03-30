package X;

/* renamed from: X.3q0  reason: invalid class name and case insensitive filesystem */
public class C77133q0 implements C160497l6 {
    public final AnonymousClass1V6 A00;
    public final C19420v0 A01;

    public int BGL(long j) {
        return C36341k9.A0E(this.A01).getInt(C36381kD.A0z("ptt_saved_playback_position_", AnonymousClass000.A0u(), j), -1);
    }

    public void Bnw(long j) {
        C36341k9.A0u(C19420v0.A00(this.A01), C36381kD.A0z("ptt_saved_playback_position_", AnonymousClass000.A0u(), j));
    }

    public void Bqh() {
        C46812bi r0;
        C148826zU A002 = this.A00.A00();
        if (A002 != null && (r0 = A002.A0J) != null) {
            long j = r0.A1N;
            C36341k9.A0v(C19420v0.A00(this.A01), C36381kD.A0z("ptt_saved_playback_position_", AnonymousClass000.A0u(), j), A002.A0A());
        }
    }

    public void Brs(long j, int i) {
        C36341k9.A0v(C19420v0.A00(this.A01), C36381kD.A0z("ptt_saved_playback_position_", AnonymousClass000.A0u(), j), i);
    }

    public C77133q0(AnonymousClass1V6 r1, C19420v0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}

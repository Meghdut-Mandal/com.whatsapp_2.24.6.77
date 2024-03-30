package X;

/* renamed from: X.9Sy  reason: invalid class name and case insensitive filesystem */
public class C195219Sy {
    public C193879Ng A00;
    public C24611Dc A01 = C24611Dc.A00("BrazilNetworkManager", "onboarding", "BR");
    public boolean A02;
    public boolean A03;
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final C19970wo A06;
    public final C19630wG A07;
    public final AnonymousClass16S A08;
    public final AnonymousClass19A A09;
    public final C178368fp A0A;
    public final AnonymousClass6VM A0B;
    public final C29221Vu A0C;
    public final C24601Db A0D;
    public final C29121Vk A0E;
    public final C200049gU A0F;
    public final AnonymousClass646 A0G;
    public final C19600wD A0H;

    public void A00(String str) {
        C193879Ng r3 = this.A00;
        if (r3 == null) {
            String A072 = this.A0D.A07();
            if (A072 == null) {
                this.A01.A06("No wallet Id stored on client, ELO node cannot be inserted in request");
            }
            r3 = new C193879Ng(5, (String) null, str, A072);
            this.A00 = r3;
        }
        r3.A02 = str;
    }

    public C195219Sy(AnonymousClass17Y r4, C19730wQ r5, C19600wD r6, C19970wo r7, C19630wG r8, AnonymousClass16S r9, AnonymousClass19A r10, C178368fp r11, AnonymousClass6VM r12, C29221Vu r13, C24601Db r14, C29121Vk r15, C200049gU r16, AnonymousClass646 r17) {
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r4;
        this.A05 = r5;
        this.A08 = r9;
        this.A09 = r10;
        this.A0D = r14;
        this.A0E = r15;
        this.A0G = r17;
        this.A0B = r12;
        this.A0C = r13;
        this.A0H = r6;
        this.A0F = r16;
        this.A0A = r11;
    }
}

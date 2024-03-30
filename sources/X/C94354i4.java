package X;

/* renamed from: X.4i4  reason: invalid class name and case insensitive filesystem */
public final class C94354i4 extends C137856gq implements C161777nS {
    public float A00 = 1.0f;
    public float A01 = 8.0f;
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public long A04;
    public long A05;
    public long A06;
    public C157657dt A07;
    public C006302t A08;
    public boolean A09;

    public C94354i4(C157657dt r3, long j, long j2, long j3, boolean z) {
        this.A06 = j;
        this.A07 = r3;
        this.A09 = z;
        this.A04 = j2;
        this.A05 = j3;
        this.A08 = new AnonymousClass7RI(this);
    }

    public C160287kl BPi(C161687nJ r5, C161717nM r6, long j) {
        AnonymousClass6Q4 BPj = r5.BPj(j);
        return C90474aD.A0M(r6, new C154827Tr(this, BPj), BPj.A01, BPj.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SimpleGraphicsLayerModifier(scaleX=");
        A0u.append(this.A02);
        A0u.append(", scaleY=");
        A0u.append(this.A03);
        A0u.append(", alpha = ");
        A0u.append(this.A00);
        C90464aC.A1Q(A0u, ", translationX=");
        C90464aC.A1Q(A0u, ", translationY=");
        C90464aC.A1Q(A0u, ", shadowElevation=");
        C90464aC.A1Q(A0u, ", rotationX=");
        C90464aC.A1Q(A0u, ", rotationY=");
        C90464aC.A1Q(A0u, ", rotationZ=");
        A0u.append(", cameraDistance=");
        A0u.append(this.A01);
        A0u.append(", transformOrigin=");
        long j = this.A06;
        long j2 = C112365dm.A00;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("TransformOrigin(packedValue=");
        A0u.append(C36331k8.A0j(A0u2, j));
        A0u.append(", shape=");
        A0u.append(this.A07);
        A0u.append(", clip=");
        A0u.append(this.A09);
        C90474aD.A1M(A0u, ", renderEffect=");
        A0u.append(", ambientShadowColor=");
        C90484aE.A1J(A0u, this.A04);
        A0u.append(", spotShadowColor=");
        C90484aE.A1J(A0u, this.A05);
        A0u.append(", compositingStrategy=");
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("CompositingStrategy(value=");
        return AnonymousClass000.A0m(C36321k7.A0G(A0u3, 0), A0u);
    }
}

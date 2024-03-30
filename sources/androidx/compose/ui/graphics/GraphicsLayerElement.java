package androidx.compose.ui.graphics;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C112365dm;
import X.C133336Xx;
import X.C137276fs;
import X.C157657dt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;

public final class GraphicsLayerElement extends C137276fs {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C157657dt A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphicsLayerElement) {
                GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
                if (Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                    long j = this.A02;
                    long j2 = graphicsLayerElement.A02;
                    long j3 = C112365dm.A00;
                    if (j == j2 && AnonymousClass00C.A0J(this.A03, graphicsLayerElement.A03) && this.A04 == graphicsLayerElement.A04) {
                        long j4 = this.A00;
                        long j5 = graphicsLayerElement.A00;
                        long j6 = C133336Xx.A01;
                        if (!(j4 == j5 && this.A01 == graphicsLayerElement.A01)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(1.0f);
        int floatToIntBits2 = Float.floatToIntBits(0.0f);
        int A022 = C90474aD.A02(((((((((((((((((floatToIntBits * 31) + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits2) * 31) + floatToIntBits2) * 31) + floatToIntBits2) * 31) + floatToIntBits2) * 31) + floatToIntBits2) * 31) + floatToIntBits2) * 31, 8.0f);
        long j = this.A02;
        long j2 = C112365dm.A00;
        int A05 = (C36351kA.A05(this.A03, C36321k7.A00(j, A022)) + C36341k9.A01(this.A04 ? 1 : 0)) * 31 * 31;
        long j3 = this.A00;
        long j4 = C133336Xx.A01;
        return C36321k7.A00(this.A01, C36321k7.A00(j3, A05));
    }

    public GraphicsLayerElement(C157657dt r1, long j, long j2, long j3, boolean z) {
        this.A02 = j;
        this.A03 = r1;
        this.A04 = z;
        this.A00 = j2;
        this.A01 = j3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GraphicsLayerElement(scaleX=");
        A0u.append(1.0f);
        A0u.append(", scaleY=");
        A0u.append(1.0f);
        A0u.append(", alpha=");
        A0u.append(1.0f);
        C90464aC.A1Q(A0u, ", translationX=");
        C90464aC.A1Q(A0u, ", translationY=");
        C90464aC.A1Q(A0u, ", shadowElevation=");
        C90464aC.A1Q(A0u, ", rotationX=");
        C90464aC.A1Q(A0u, ", rotationY=");
        C90464aC.A1Q(A0u, ", rotationZ=");
        A0u.append(", cameraDistance=");
        A0u.append(8.0f);
        A0u.append(", transformOrigin=");
        long j = this.A02;
        long j2 = C112365dm.A00;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("TransformOrigin(packedValue=");
        A0u.append(C36331k8.A0j(A0u2, j));
        A0u.append(", shape=");
        A0u.append(this.A03);
        A0u.append(", clip=");
        A0u.append(this.A04);
        C90474aD.A1M(A0u, ", renderEffect=");
        A0u.append(", ambientShadowColor=");
        C90484aE.A1J(A0u, this.A00);
        A0u.append(", spotShadowColor=");
        C90484aE.A1J(A0u, this.A01);
        A0u.append(", compositingStrategy=");
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("CompositingStrategy(value=");
        return AnonymousClass000.A0m(C36321k7.A0G(A0u3, 0), A0u);
    }
}

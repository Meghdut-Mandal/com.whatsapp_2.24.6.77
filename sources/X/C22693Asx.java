package X;

/* renamed from: X.Asx  reason: case insensitive filesystem */
public class C22693Asx extends C200149gj {
    public C22693Asx(B35 b35) {
        if (!(b35 instanceof C21755AZj)) {
            this.A01 = b35;
            this.A04 = new byte[(b35.B8o() * 2)];
            this.A00 = 0;
            return;
        }
        throw AnonymousClass001.A08("CTSBlockCipher can only accept ECB, or CBC ciphers");
    }
}

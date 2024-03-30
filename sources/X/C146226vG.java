package X;

/* renamed from: X.6vG  reason: invalid class name and case insensitive filesystem */
public class C146226vG implements C88794Ub {
    public float A00;
    public final C1271367c A01;

    public /* bridge */ /* synthetic */ boolean B3A(Object obj) {
        String str = ((C1271367c) obj).A02;
        C18740tg.A06(str);
        return str.equals(this.A01.A02);
    }

    public long B8H() {
        return this.A01.A00;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("WeightedRecentStickerIdentifier{");
        stringBuffer.append("stickerIdentifier=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", weight=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public C146226vG(C1271367c r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ Object BCC() {
        return this.A01;
    }

    public float BJE() {
        return this.A00;
    }

    public void Bsm(float f) {
        this.A00 = f;
    }
}

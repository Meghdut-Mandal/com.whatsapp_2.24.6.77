package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.2dX  reason: invalid class name and case insensitive filesystem */
public abstract class C47142dX extends C38581pL {
    public AnonymousClass17Y A00;
    public AnonymousClass1XY A01;
    public AnonymousClass1X4 A02;
    public AnonymousClass1V6 A03;
    public C20830yE A04;
    public C20810yC A05;
    public AnonymousClass1Y4 A06;
    public AnonymousClass1ST A07;
    public AnonymousClass3P3 A08;
    public C46812bi A09;
    public AnonymousClass1X7 A0A;
    public AnonymousClass1SV A0B;
    public AnonymousClass005 A0C;
    public final View.OnClickListener A0D = new C67133Yq((Object) this, 43);
    public final C33541fX A0E = new C48762i0(this, 26);
    public final C33541fX A0F = new C48762i0(this, 24);
    public final C33541fX A0G = new C48762i0(this, 25);

    public abstract void A02();

    public abstract void A03();

    public final void setAudioMessage(C46812bi r1) {
        this.A09 = r1;
        A03();
    }

    public C47142dX(Context context) {
        super(context);
    }

    public C46812bi getFMessageAudio() {
        return this.A09;
    }
}

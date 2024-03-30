package X;

import android.text.TextUtils;

/* renamed from: X.9dB  reason: invalid class name and case insensitive filesystem */
public class C198269dB {
    public final AnonymousClass9EV A00;
    public final C19630wG A01;
    public final C20810yC A02;
    public final C21187ABv A03;
    public final C21179ABn A04;
    public final C21180ABo A05;
    public final C194369Pk A06;
    public final C21185ABt A07;
    public final AnonymousClass1DL A08;
    public final AnonymousClass1FO A09;
    public final AnonymousClass3PX A0A;
    public final C199969gL A0B;
    public final AnonymousClass005 A0C;
    public final C21166ABa A0D;

    public static boolean A00(C173308Re r3, String str) {
        if (r3.buttons_.size() != 1) {
            return false;
        }
        if ((((C173078Qh) r3.buttons_.get(0)).nativeFlowInfo_ != null || C172718Ox.DEFAULT_INSTANCE != null) && str.equals(C170918Hz.A0E(r3, 0).name_) && !TextUtils.isEmpty(C170918Hz.A0E(r3, 0).paramsJson_)) {
            return true;
        }
        return false;
    }

    public C198269dB(AnonymousClass9EV r1, C19630wG r2, C20810yC r3, C21187ABv aBv, C21179ABn aBn, C21180ABo aBo, C194369Pk r7, C21185ABt aBt, C21166ABa aBa, AnonymousClass1DL r10, AnonymousClass1FO r11, AnonymousClass3PX r12, C199969gL r13, AnonymousClass005 r14) {
        this.A02 = r3;
        this.A01 = r2;
        this.A08 = r10;
        this.A04 = aBn;
        this.A05 = aBo;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = aBv;
        this.A09 = r11;
        this.A0A = r12;
        this.A0C = r14;
        this.A0B = r13;
        this.A0D = aBa;
        this.A07 = aBt;
    }
}

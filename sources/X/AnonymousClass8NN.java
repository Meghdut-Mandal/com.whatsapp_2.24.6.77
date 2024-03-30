package X;

import android.util.Base64;
import com.facebook.wearable.datax.LocalChannel;
import com.whatsapp.jid.Jid;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.8NN  reason: invalid class name */
public abstract class AnonymousClass8NN extends C21071A7i {
    public C170918Hz A00;
    public final C170918Hz A01;

    public static AnonymousClass8I5 A02(AnonymousClass8NN r3, String str) {
        byte[] decode = Base64.decode(str, 0);
        AnonymousClass8I5 A012 = C21674AUx.A01(decode, 0, decode.length);
        r3.A0S();
        return A012;
    }

    public static AnonymousClass8I5 A03(AnonymousClass8NN r2, byte[] bArr) {
        AnonymousClass8I5 A012 = C21674AUx.A01(bArr, 0, bArr.length);
        r2.A0S();
        return A012;
    }

    /* renamed from: A0Q */
    public AnonymousClass8NN clone() {
        AnonymousClass8NN r2 = (AnonymousClass8NN) C170918Hz.A0S(this.A01, C023109s.A0R);
        C170918Hz r1 = this.A00;
        if (r1.A0t()) {
            r1.A0s();
        }
        r2.A00 = this.A00;
        return r2;
    }

    public final C170918Hz A0R() {
        C170918Hz r1 = this.A00;
        if (r1.A0t()) {
            r1.A0s();
        }
        C170918Hz r12 = this.A00;
        if (C170918Hz.A0b(r12)) {
            return r12;
        }
        throw new C21827Ab3();
    }

    public final void A0S() {
        if (!this.A00.A0t()) {
            C170918Hz r2 = (C170918Hz) C170918Hz.A0S(this.A01, C023109s.A0G);
            C165577te.A0O(r2).BPm(r2, this.A00);
            this.A00 = r2;
        }
    }

    public void A0T(C170918Hz r3) {
        if (!this.A01.equals(r3)) {
            C170918Hz A0H = C90524aI.A0H(this);
            C165577te.A0O(A0H).BPm(A0H, r3);
        }
    }

    public AnonymousClass8NN(C170918Hz r2) {
        this.A01 = r2;
        if (!r2.A0t()) {
            this.A00 = (C170918Hz) C170918Hz.A0S(r2, C023109s.A0G);
            return;
        }
        throw AnonymousClass001.A08("Default instance must be immutable.");
    }

    public static AnonymousClass8SG A04(AnonymousClass8NN r0) {
        r0.A0S();
        return (AnonymousClass8SG) r0.A00;
    }

    public static AnonymousClass8S5 A05(AnonymousClass8NN r1) {
        r1.A0S();
        AnonymousClass8S5 r12 = (AnonymousClass8S5) r1.A00;
        int i = AnonymousClass8S5.BACKGROUND_ARGB_FIELD_NUMBER;
        return r12;
    }

    public static C173308Re A06(AnonymousClass8NN r1) {
        r1.A0S();
        C173308Re r12 = (C173308Re) r1.A00;
        int i = C173308Re.BUTTONS_FIELD_NUMBER;
        return r12;
    }

    public static AnonymousClass8SC A07(AnonymousClass8NN r1) {
        r1.A0S();
        AnonymousClass8SC r12 = (AnonymousClass8SC) r1.A00;
        int i = AnonymousClass8SC.CAPTION_FIELD_NUMBER;
        return r12;
    }

    public static AnonymousClass8SD A08(AnonymousClass8NN r0) {
        r0.A0S();
        return (AnonymousClass8SD) r0.A00;
    }

    public static AnonymousClass8SF A09(AnonymousClass8NN r1) {
        r1.A0S();
        AnonymousClass8SF r12 = (AnonymousClass8SF) r1.A00;
        int i = AnonymousClass8SF.ANNOTATIONS_FIELD_NUMBER;
        return r12;
    }

    public static AnonymousClass8SQ A0A(AnonymousClass8NN r0) {
        r0.A0S();
        return (AnonymousClass8SQ) r0.A00;
    }

    public static AnonymousClass8SA A0B(AnonymousClass8NN r1) {
        r1.A0S();
        AnonymousClass8SA r12 = (AnonymousClass8SA) r1.A00;
        int i = AnonymousClass8SA.CONTEXT_INFO_FIELD_NUMBER;
        return r12;
    }

    public static AnonymousClass8SE A0C(AnonymousClass8NN r1) {
        r1.A0S();
        AnonymousClass8SE r12 = (AnonymousClass8SE) r1.A00;
        int i = AnonymousClass8SE.ANNOTATIONS_FIELD_NUMBER;
        return r12;
    }

    public static AnonymousClass8SX A0D(AnonymousClass8NN r0) {
        return (AnonymousClass8SX) r0.A0R();
    }

    public static AnonymousClass8SX A0E(AnonymousClass8NN r0) {
        r0.A0S();
        return (AnonymousClass8SX) r0.A00;
    }

    public static AnonymousClass8SX A0F(AnonymousClass8NN r0, Object obj) {
        r0.A0S();
        AnonymousClass8SX r02 = (AnonymousClass8SX) r0.A00;
        obj.getClass();
        return r02;
    }

    public static AnonymousClass8SW A0G(AnonymousClass8NN r0) {
        AnonymousClass8SW r02 = (AnonymousClass8SW) r0.A0R();
        r02.getClass();
        return r02;
    }

    public static AnonymousClass8SS A0H(AnonymousClass8NN r0) {
        r0.A0S();
        return (AnonymousClass8SS) r0.A00;
    }

    public static AnonymousClass8SU A0I(AnonymousClass8NN r0) {
        r0.A0S();
        return (AnonymousClass8SU) r0.A00;
    }

    public static AnonymousClass8SU A0J(AnonymousClass8NN r1) {
        r1.A0S();
        AnonymousClass8SU r12 = (AnonymousClass8SU) r1.A00;
        int i = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
        return r12;
    }

    public static String A0K(AnonymousClass8NN r1, Jid jid) {
        String rawString = jid.getRawString();
        r1.A0S();
        return rawString;
    }

    public static void A0L(LocalChannel localChannel, AnonymousClass8NN r4, int i) {
        byte[] A0o = r4.A0R().A0o();
        byte[] copyOf = Arrays.copyOf(A0o, A0o.length);
        AnonymousClass00C.A0D(copyOf, 2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(copyOf.length);
        allocateDirect.put(copyOf);
        allocateDirect.flip();
        localChannel.send(new C197549bt(i, allocateDirect));
    }

    public static void A0M(AnonymousClass8NN r0, C202719mV r1) {
        r1.A00 = (AnonymousClass8S2) r0.A0R();
    }

    public static byte[] A0N(AnonymousClass8NN r0) {
        return r0.A0R().A0o();
    }

    public /* bridge */ /* synthetic */ C170918Hz BAu() {
        return this.A01;
    }
}

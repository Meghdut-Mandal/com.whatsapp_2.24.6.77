package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: X.9mV  reason: invalid class name and case insensitive filesystem */
public class C202719mV {
    public AnonymousClass8S2 A00;

    public C199299f5 A03() {
        try {
            AnonymousClass8S2 r1 = this.A00;
            if ((r1.bitField0_ & 4) != 0) {
                return new C199299f5(r1.remoteIdentityPublic_.A06());
            }
            return null;
        } catch (AnonymousClass18E e) {
            A01(e);
            return null;
        }
    }

    public static AnonymousClass9U0 A00(C21665AUh aUh, C202719mV r6) {
        int i = 0;
        for (C173228Qw r2 : r6.A00.receiverChains_) {
            try {
                if (C200529hY.A00(r2.senderRatchetKey_).equals(aUh)) {
                    return new AnonymousClass9U0(r2, Integer.valueOf(i));
                }
                i++;
            } catch (AnonymousClass18E e) {
                A01(e);
            }
        }
        return null;
    }

    public static void A01(Throwable th) {
        String str = "";
        Throwable th2 = th;
        while (true) {
            if (!(th2 instanceof UnknownHostException)) {
                th2 = th2.getCause();
                if (th2 == null) {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    str = stringWriter.toString();
                    break;
                }
            } else {
                break;
            }
        }
        if (AnonymousClass13X.A00 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SignalProtocolLogger (");
            A0u.append("SessionRecordV2");
            C36321k7.A1R("): ", str, A0u);
        }
    }

    public C199299f5 A02() {
        try {
            return new C199299f5(this.A00.localIdentityPublic_.A06());
        } catch (AnonymousClass18E e) {
            throw C90524aI.A0Y(e);
        }
    }

    public C201119iu A04() {
        AnonymousClass8S2 r2 = this.A00;
        C173228Qw r0 = r2.senderChain_;
        if (r0 == null) {
            r0 = C173228Qw.DEFAULT_INSTANCE;
        }
        C172778Pd r1 = r0.chainKey_;
        if (r1 == null) {
            r1 = C172778Pd.DEFAULT_INSTANCE;
        }
        int i = r2.sessionVersion_;
        if (i == 0) {
            i = 2;
        }
        return new C201119iu(C201249jC.A00(i), r1.key_.A06(), r1.index_);
    }

    public void A08(C199299f5 r5) {
        AnonymousClass8NN A0q = this.A00.A0q();
        AnonymousClass8I5 A0O = C90474aD.A0O(A0q, r5.A00.A00());
        AnonymousClass8S2 r1 = (AnonymousClass8S2) A0q.A00;
        int i = AnonymousClass8S2.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.localIdentityPublic_ = A0O;
        AnonymousClass8NN.A0M(A0q, this);
    }

    public void A09(C199299f5 r5) {
        AnonymousClass8NN A0q = this.A00.A0q();
        AnonymousClass8I5 A0O = C90474aD.A0O(A0q, r5.A00.A00());
        AnonymousClass8S2 r1 = (AnonymousClass8S2) A0q.A00;
        int i = AnonymousClass8S2.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 4;
        r1.remoteIdentityPublic_ = A0O;
        AnonymousClass8NN.A0M(A0q, this);
    }

    public void A0A(C21665AUh aUh, C201119iu r7) {
        byte[] bArr = r7.A02;
        C172778Pd A002 = AnonymousClass8NA.A00(r7, (AnonymousClass8NA) C172778Pd.DEFAULT_INSTANCE.A0p(), bArr, bArr.length);
        AnonymousClass8N1 r3 = (AnonymousClass8N1) C173228Qw.DEFAULT_INSTANCE.A0p();
        r3.A0U(A002);
        AnonymousClass8I5 A03 = AnonymousClass8NN.A03(r3, aUh.A00());
        C173228Qw r1 = (C173228Qw) r3.A00;
        r1.bitField0_ |= 1;
        r1.senderRatchetKey_ = A03;
        C170918Hz A0R = r3.A0R();
        AnonymousClass8NN A032 = C170918Hz.A03(this);
        AnonymousClass8S2 r2 = (AnonymousClass8S2) A032.A00;
        int i = AnonymousClass8S2.ALICEBASEKEY_FIELD_NUMBER;
        A0R.getClass();
        C23122B6c b6c = r2.receiverChains_;
        if (!((C21886AcE) b6c).A00) {
            b6c = C170918Hz.A0A(b6c);
            r2.receiverChains_ = b6c;
        }
        b6c.add(A0R);
        AnonymousClass8S2 r0 = (AnonymousClass8S2) A032.A0R();
        this.A00 = r0;
        if (r0.receiverChains_.size() > 5) {
            AnonymousClass8NN A033 = C170918Hz.A03(this);
            AnonymousClass8S2 r32 = (AnonymousClass8S2) A033.A00;
            C23122B6c b6c2 = r32.receiverChains_;
            if (!((C21886AcE) b6c2).A00) {
                b6c2 = C170918Hz.A0A(b6c2);
                r32.receiverChains_ = b6c2;
            }
            b6c2.remove(0);
            AnonymousClass8NN.A0M(A033, this);
        }
    }

    public void A0B(C120595rl r6, C201119iu r7) {
        byte[] bArr = r7.A02;
        C172778Pd A002 = AnonymousClass8NA.A00(r7, (AnonymousClass8NA) C172778Pd.DEFAULT_INSTANCE.A0p(), bArr, bArr.length);
        AnonymousClass8N1 r3 = (AnonymousClass8N1) C173228Qw.DEFAULT_INSTANCE.A0p();
        AnonymousClass8I5 A03 = AnonymousClass8NN.A03(r3, r6.A01.A00());
        C173228Qw r1 = (C173228Qw) r3.A00;
        r1.bitField0_ |= 1;
        r1.senderRatchetKey_ = A03;
        AnonymousClass8I5 A0O = C90474aD.A0O(r3, r6.A00.A00);
        C173228Qw r12 = (C173228Qw) r3.A00;
        r12.bitField0_ |= 2;
        r12.senderRatchetKeyPrivate_ = A0O;
        r3.A0U(A002);
        C173228Qw r32 = (C173228Qw) r3.A0R();
        AnonymousClass8NN A032 = C170918Hz.A03(this);
        AnonymousClass8S2 r13 = (AnonymousClass8S2) A032.A00;
        int i = AnonymousClass8S2.ALICEBASEKEY_FIELD_NUMBER;
        r32.getClass();
        r13.senderChain_ = r32;
        r13.bitField0_ |= 32;
        AnonymousClass8NN.A0M(A032, this);
    }

    public void A0C(AnonymousClass9RA r5) {
        AnonymousClass8NN A0q = this.A00.A0q();
        AnonymousClass8I5 A0O = C90474aD.A0O(A0q, r5.A00);
        AnonymousClass8S2 r1 = (AnonymousClass8S2) A0q.A00;
        int i = AnonymousClass8S2.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 8;
        r1.rootKey_ = A0O;
        AnonymousClass8NN.A0M(A0q, this);
    }

    public void A0D(byte[] bArr) {
        AnonymousClass8NN A0q = this.A00.A0q();
        AnonymousClass8I5 A0O = C90474aD.A0O(A0q, bArr);
        AnonymousClass8S2 r1 = (AnonymousClass8S2) A0q.A00;
        int i = AnonymousClass8S2.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        r1.aliceBaseKey_ = A0O;
        AnonymousClass8NN.A0M(A0q, this);
    }

    public C202719mV(C202719mV r2) {
        AnonymousClass8NN.A0M(r2.A00.A0q(), this);
    }

    public void A05() {
        AnonymousClass8NN A03 = C170918Hz.A03(this);
        AnonymousClass8S2 r2 = (AnonymousClass8S2) A03.A00;
        int i = AnonymousClass8S2.ALICEBASEKEY_FIELD_NUMBER;
        r2.bitField0_ |= 1;
        r2.sessionVersion_ = 3;
        AnonymousClass8NN.A0M(A03, this);
    }

    public void A06(int i) {
        AnonymousClass8NN A03 = C170918Hz.A03(this);
        AnonymousClass8S2 r1 = (AnonymousClass8S2) A03.A00;
        int i2 = AnonymousClass8S2.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 512;
        r1.localRegistrationId_ = i;
        AnonymousClass8NN.A0M(A03, this);
    }

    public void A07(int i) {
        AnonymousClass8NN A03 = C170918Hz.A03(this);
        AnonymousClass8S2 r1 = (AnonymousClass8S2) A03.A00;
        int i2 = AnonymousClass8S2.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 256;
        r1.remoteRegistrationId_ = i;
        AnonymousClass8NN.A0M(A03, this);
    }

    public C202719mV(AnonymousClass8S2 r1) {
        this.A00 = r1;
    }

    public C202719mV() {
        AnonymousClass8NN.A0M(AnonymousClass8S2.DEFAULT_INSTANCE.A0p(), this);
    }
}

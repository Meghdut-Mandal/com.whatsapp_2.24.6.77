package X;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AAD implements C22934Ayk {
    public static final AnonymousClass00T A08 = C36431kI.A1I(C22291Ajs.A00);
    public static final AnonymousClass00T A09 = C36431kI.A1I(C22292Ajt.A00);
    public final C19700wN A00;
    public final C20310xM A01;
    public final C45832Sw A02;
    public final C177808eP A03;
    public final C29871Yh A04;
    public final C23084B3s A05;
    public final Integer A06;
    public final boolean A07;

    public AAD(C19700wN r4, C20310xM r5, C45832Sw r6, AnonymousClass19L r7, C29871Yh r8, C23084B3s b3s, Integer num, boolean z) {
        AnonymousClass00C.A0D(r8, 5);
        C36321k7.A13(r5, r4, r7);
        this.A06 = num;
        this.A05 = b3s;
        this.A02 = r6;
        this.A07 = z;
        this.A04 = r8;
        this.A01 = r5;
        this.A00 = r4;
        this.A03 = (C177808eP) AnonymousClass19L.A00(r7, 0, b3s.BDf());
    }

    public void BJg(byte[] bArr) {
        AnonymousClass3T1 r3;
        byte[] bArr2 = bArr;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DecryptionCallbackInterop/handlePlaintext message=");
        C23084B3s b3s = this.A05;
        A0u.append(b3s);
        A0u.append(" sendReceipt=");
        C36331k8.A1S(A0u, this.A07);
        Integer num = this.A06;
        if (num == null || num.intValue() != 4) {
            bArr2 = C200429hO.A02(this.A02, this.A03, bArr2);
        }
        if (bArr2 == null) {
            this.A00.A0E("DecryptionCallbackInterop/handlePlaintext/invalid-plaintext", AnonymousClass000.A0o(b3s.BE4(), AnonymousClass000.A0v("message.key=")), false);
            return;
        }
        try {
            AnonymousClass8RS r32 = (AnonymousClass8RS) C170918Hz.A08(AnonymousClass8RS.DEFAULT_INSTANCE, bArr2);
            AnonymousClass00C.A0B(r32);
            C170918Hz[] r2 = new C170918Hz[5];
            r2[0] = r32;
            AnonymousClass8SB r1 = r32.imageMessage_;
            if (r1 == null) {
                r1 = AnonymousClass8SB.DEFAULT_INSTANCE;
            }
            r2[1] = r1;
            AnonymousClass8S8 r12 = r32.videoMessage_;
            if (r12 == null) {
                r12 = AnonymousClass8S8.DEFAULT_INSTANCE;
            }
            r2[2] = r12;
            C173518Rz r13 = r32.audioMessage_;
            if (r13 == null) {
                r13 = C173518Rz.DEFAULT_INSTANCE;
            }
            r2[3] = r13;
            AnonymousClass8S7 r14 = r32.documentMessage_;
            if (r14 == null) {
                r14 = AnonymousClass8S7.DEFAULT_INSTANCE;
            }
            List<Object> A0m = C36341k9.A0m(r14, r2, 4);
            if (!(A0m instanceof Collection) || !A0m.isEmpty()) {
                for (Object obj : A0m) {
                    try {
                        int i = ((Field) A08.getValue()).getInt(((Field) A09.getValue()).get(obj));
                        if (i >= 1) {
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append(C165607th.A0g(b3s, "DecryptionCallbackInterop/validateUnknownFields axolotl received unknown fields; message.key=", A0u2));
                            C36321k7.A1U(" numUnknownFields=", A0u2, i);
                            C200429hO.A01(this.A02, this.A03, 70);
                            return;
                        }
                    } catch (IllegalAccessException e) {
                        C36321k7.A1J(e, "DecryptionCallbackInterop/validateUnknownFields/error unknown-message-count, exception=", AnonymousClass000.A0u());
                        throw C90524aI.A0Y(e);
                    }
                }
            }
            if (b3s instanceof C21337AHp) {
                C21337AHp aHp = (C21337AHp) b3s;
                try {
                    C29871Yh r11 = this.A04;
                    C64933Qa A002 = C21337AHp.A00(aHp);
                    long j = aHp.A18;
                    int i2 = 0;
                    C193459Ln r15 = new C193459Ln(r32, A002, j);
                    AnonymousClass11F A003 = AnonymousClass143.A00(aHp.A0E);
                    r15.A01 = A003;
                    Integer num2 = aHp.A0U;
                    if (num2 != null) {
                        i2 = num2.intValue();
                    }
                    Long l = aHp.A0c;
                    String str = aHp.A0w;
                    String str2 = aHp.A0k;
                    String str3 = aHp.A0r;
                    AnonymousClass8RS r6 = r15.A02;
                    Long l2 = l;
                    C64933Qa r20 = r15.A03;
                    AnonymousClass8RS r19 = r6;
                    AnonymousClass11F r18 = A003;
                    AnonymousClass9XL r17 = new AnonymousClass9XL(r18, r19, r20, l2, str, str2, str3, i2, r15.A00);
                    Iterator it = C90524aI.A0q(r11.A01).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            r3 = new C181028mo(C21337AHp.A00(aHp), j);
                            break;
                        }
                        r3 = ((B6B) ((AnonymousClass011) it.next()).second).BlI(r17);
                        if (r3 != null) {
                            break;
                        }
                    }
                } catch (C28531Ta e2) {
                    this.A00.A0D("DecryptionCallbackInterop/handlePlaintext/invalid-fmessage", AnonymousClass000.A0o(b3s.BE4(), AnonymousClass000.A0v("message.key=")), e2);
                    r3 = new C181028mo(C21337AHp.A00(aHp), aHp.A18);
                }
                aHp.A02(r3);
                this.A01.A0P(r3);
            }
        } catch (AnonymousClass186 e3) {
            this.A00.A0D("DecryptionCallbackInterop/handlePlaintext/invalid-protobuf", AnonymousClass000.A0o(b3s.BE4(), AnonymousClass000.A0v("message.key=")), e3);
        }
    }
}

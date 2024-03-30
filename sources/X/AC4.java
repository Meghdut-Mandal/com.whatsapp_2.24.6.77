package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class AC4 implements C22938Ayo, C22942Ays, C22994Azk, C17740rx {
    public final C20810yC A00;
    public final C220412q A01;
    public final C202029kv A02;

    public void B24(C196159Xy r10, AnonymousClass3T1 r11) {
        AnonymousClass8RG r0;
        int i;
        int i2;
        if (r11 instanceof AnonymousClass2bS) {
            AnonymousClass2bS r112 = (AnonymousClass2bS) r11;
            C64933Qa r02 = r112.A1J;
            int i3 = r112.A01;
            String str = r112.A03;
            List list = r112.A05;
            boolean A0O = this.A01.A0O(r02.A00);
            AnonymousClass8NL r4 = r10.A00;
            AnonymousClass8SX r03 = (AnonymousClass8SX) r4.A00;
            if (A0O) {
                r0 = r03.pollCreationMessageV2_;
            } else {
                r0 = r03.pollCreationMessageV3_;
            }
            if (r0 == null) {
                r0 = AnonymousClass8RG.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r0.A0q();
            if (!TextUtils.isEmpty(str)) {
                AnonymousClass8RG r1 = (AnonymousClass8RG) C90524aI.A0H(A0q);
                int i4 = AnonymousClass8RG.CONTEXT_INFO_FIELD_NUMBER;
                str.getClass();
                r1.bitField0_ |= 2;
                r1.name_ = str;
            }
            C80103un r2 = r10.A02;
            byte[] bArr = r10.A0B;
            if (C202029kv.A02(r2, r112, bArr)) {
                AnonymousClass8SG A002 = C196159Xy.A00(this.A02, r10, r2, r112, bArr);
                AnonymousClass8RG r12 = (AnonymousClass8RG) C90524aI.A0H(A0q);
                int i5 = AnonymousClass8RG.CONTEXT_INFO_FIELD_NUMBER;
                A002.getClass();
                r12.contextInfo_ = A002;
                r12.bitField0_ |= 8;
            }
            AnonymousClass8RG r13 = (AnonymousClass8RG) C90524aI.A0H(A0q);
            int i6 = AnonymousClass8RG.CONTEXT_INFO_FIELD_NUMBER;
            r13.bitField0_ |= 4;
            r13.selectableOptionsCount_ = i3;
            for (int i7 = 0; i7 < list.size(); i7++) {
                AnonymousClass8NN A0p = C172438Nv.DEFAULT_INSTANCE.A0p();
                String str2 = ((AnonymousClass3PS) list.get(i7)).A03;
                C172438Nv r14 = (C172438Nv) C90524aI.A0H(A0p);
                str2.getClass();
                r14.bitField0_ |= 1;
                r14.optionName_ = str2;
                C170918Hz A0R = A0p.A0R();
                AnonymousClass8RG r22 = (AnonymousClass8RG) C90524aI.A0H(A0q);
                A0R.getClass();
                C23122B6c b6c = r22.options_;
                if (!((C21886AcE) b6c).A00) {
                    b6c = C170918Hz.A0A(b6c);
                    r22.options_ = b6c;
                }
                b6c.add(A0R);
            }
            AnonymousClass8RG r04 = (AnonymousClass8RG) A0q.A0R();
            AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r4, r04);
            if (A0O) {
                A0F.pollCreationMessageV2_ = r04;
                i = A0F.bitField1_;
                i2 = 32768;
            } else {
                A0F.pollCreationMessageV3_ = r04;
                i = A0F.bitField1_;
                i2 = 524288;
            }
            A0F.bitField1_ = i | i2;
            return;
        }
        throw AnonymousClass001.A08("FMessagePollProtobuf/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r20) {
        AnonymousClass8RG r5;
        String str;
        AnonymousClass9YL r6 = r20;
        AnonymousClass8SX r4 = r6.A0A;
        int i = r4.bitField1_;
        if ((i & 64) != 0) {
            if (AnonymousClass6HF.A01(this.A00)) {
                r5 = r4.pollCreationMessage_;
            }
            return new AnonymousClass2bK(r6.A0C, r6.A0B.A0o(), 2, r6.A01, r6.A04);
        } else if ((32768 & i) != 0) {
            if (AnonymousClass6HF.A00(this.A00)) {
                r5 = r4.pollCreationMessageV2_;
            }
            return new AnonymousClass2bK(r6.A0C, r6.A0B.A0o(), 2, r6.A01, r6.A04);
        } else if ((i & 524288) == 0) {
            return null;
        } else {
            r5 = r4.pollCreationMessageV3_;
        }
        if (r5 == null) {
            r5 = AnonymousClass8RG.DEFAULT_INSTANCE;
        }
        AnonymousClass2bS r12 = new AnonymousClass2bS(r6.A0C, r6.A04);
        boolean A1P = AnonymousClass000.A1P(r5.bitField0_ & 2);
        Integer A0U = C36421kH.A0U();
        if (A1P) {
            boolean z = r6.A0O;
            String str2 = r5.name_;
            if (z) {
                if (str2 == null) {
                    str2 = "";
                }
                r12.A03 = str2;
            } else if (TextUtils.isEmpty(str2) || str2.length() > 5000) {
                throw C165617ti.A0S(A0U, "poll_creation_invalid_name");
            } else {
                r12.A03 = str2;
                if (r5.options_.size() > 0) {
                    C23122B6c<C172438Nv> b6c = r5.options_;
                    int min = Math.min(this.A00.A07(1408), 12);
                    if (b6c == null || b6c.size() < 2) {
                        throw C165617ti.A0S(A0U, "poll_creation_invalid_options_count");
                    }
                    LinkedHashSet A17 = C36441kJ.A17();
                    for (C172438Nv r1 : b6c) {
                        if ((r1.bitField0_ & 1) != 0) {
                            str = r1.optionName_;
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str) || str.length() > 2500) {
                            throw C165617ti.A0S(A0U, "poll_creation_invalid_option");
                        }
                        AnonymousClass3PS r13 = new AnonymousClass3PS(str);
                        if (!A17.contains(r13)) {
                            A17.add(r13);
                        }
                    }
                    if (A17.size() < 2 || A17.size() > min) {
                        throw C165617ti.A0S(A0U, "poll_creation_invalid_options_count");
                    }
                    ArrayList A15 = C36441kJ.A15(A17);
                    List list = r12.A05;
                    list.clear();
                    list.addAll(A15);
                    if ((r5.bitField0_ & 4) != 0) {
                        int i2 = r5.selectableOptionsCount_;
                        if (i2 < 0 || i2 > list.size()) {
                            throw C165617ti.A0S(A0U, "poll_creation_invalid_selectable_options_count");
                        }
                        r12.A01 = i2;
                    } else {
                        throw C165617ti.A0S(A0U, "poll_creation_missing_selectable_options_count");
                    }
                } else {
                    throw C165617ti.A0S(A0U, "poll_creation_missing_options");
                }
            }
            C173348Ri r0 = r4.messageContextInfo_;
            if (r0 == null) {
                r0 = C173348Ri.DEFAULT_INSTANCE;
            }
            r12.A1b = r0.messageSecret_.A06();
            return r12;
        }
        throw C165617ti.A0S(A0U, "poll_creation_missing_name");
    }

    public AC4(C220412q r1, C20810yC r2, C202029kv r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public ArrayList BHq(AnonymousClass3T1 r5) {
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1AL[] A0k = C165617ti.A0k();
        C36381kD.A1N("polltype", "creation", A0k);
        C203399nx.A0E("meta", A0I, A0k);
        return A0I;
    }
}

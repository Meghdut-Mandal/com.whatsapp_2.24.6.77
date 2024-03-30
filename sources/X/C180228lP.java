package X;

import android.os.Bundle;
import java.util.List;
import java.util.Objects;

/* renamed from: X.8lP  reason: invalid class name and case insensitive filesystem */
public class C180228lP extends C180338lb {
    public static final AnonymousClass16U A0K = AnonymousClass16W.A05;
    public final C19970wo A00;
    public final C29121Vk A01;
    public final C202699mR A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public void A0g(List list) {
        C201459je r4;
        C193689Ml r1 = this.A06;
        C18740tg.A06(r1);
        C202319lY r9 = r1.A01;
        C175928bI A002 = C202319lY.A00(r9);
        boolean A1V = AnonymousClass000.A1V(this.A0G);
        C207249un r8 = r1.A00;
        C201599jw r0 = A002.A0G;
        List list2 = list;
        if (r0 != null && (r4 = r0.A0C) != null && "UNKNOWN".equals(r4.A08) && "INIT".equals(r4.A09) && A1V) {
            long A042 = this.A02.A04(this.A0H, false);
            C201599jw r42 = A002.A0G;
            boolean A1Q = AnonymousClass000.A1Q((A042 > r42.A01 ? 1 : (A042 == r42.A01 ? 0 : -1)));
            boolean equals = C202349ld.A00(this.A0A, "moneyStringValue").equals(r42.A09);
            if (A1Q && equals) {
                this.A08.A0D(new C180268lU(114));
                A0u(r9, A002, list);
                A0y(r9, list);
                A0v(r9, A002, list);
                C180088lB r12 = new C180088lB();
                r12.A02 = this.A06;
                r12.A01 = this;
                r12.A00 = C165587tf.A0W(this.A0Y).BAj();
                list.add(r12);
                A0w(r9, A002, list);
                A0i(list);
                C167797yq.A05(list);
                A0t(r8, r9, A002, list2, A1V);
                C167797yq.A05(list);
                A0o(list);
                C167797yq.A05(list);
                list.add(new AnonymousClass5Gz(1007));
            }
        }
        A0x(r9, A002, list, true);
        A0u(r9, A002, list);
        A0y(r9, list);
        A0v(r9, A002, list);
        C180088lB r122 = new C180088lB();
        r122.A02 = this.A06;
        r122.A01 = this;
        r122.A00 = C165587tf.A0W(this.A0Y).BAj();
        list.add(r122);
        A0w(r9, A002, list);
        A0i(list);
        C167797yq.A05(list);
        A0t(r8, r9, A002, list2, A1V);
        C167797yq.A05(list);
        A0o(list);
        C167797yq.A05(list);
        list.add(new AnonymousClass5Gz(1007));
    }

    public boolean A0r() {
        return false;
    }

    public C180228lP(Bundle bundle, AnonymousClass17Y r4, C19730wQ r5, C21100yf r6, AnonymousClass1KK r7, AnonymousClass1NG r8, AnonymousClass16D r9, C21060yb r10, C19970wo r11, C19630wG r12, C18820ts r13, C20310xM r14, AnonymousClass1FF r15, AnonymousClass1VZ r16, C24881Ed r17, AnonymousClass16T r18, AnonymousClass16S r19, C20810yC r20, AnonymousClass19A r21, C196129Xv r22, AEA aea, C202269lR r24, AE0 ae0, C25251Fo r26, AnonymousClass1EZ r27, C29221Vu r28, C24601Db r29, AnonymousClass1DR r30, C29121Vk r31, AnonymousClass1EV r32, AnonymousClass1EU r33, AnonymousClass1XC r34, AnonymousClass6PS r35, C23075B3f b3f, C202179lC r37, AnonymousClass1YQ r38, AnonymousClass39O r39, C199849g7 r40, AnonymousClass5GM r41, C200899iR r42, C202699mR r43, C29131Vl r44, AnonymousClass1FR r45, AnonymousClass1VY r46, C19770wU r47) {
        super(bundle, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, aea, r24, ae0, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, b3f, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47);
        String A0Z;
        String A0Z2;
        String A0Z3;
        this.A00 = r11;
        this.A02 = r43;
        this.A01 = r31;
        this.A0C = bundle.getString("extra_new_mandate_transaction_ref");
        String string = bundle.getString("extra_new_mandate_payee_name");
        Objects.requireNonNull(string);
        this.A09 = string;
        String string2 = bundle.getString("extra_new_mandate_preset_amount");
        Objects.requireNonNull(string2);
        this.A0A = string2;
        this.A08 = bundle.getString("extra_new_mandate_merchant_code");
        String string3 = bundle.getString("extra_new_mandate_purpose_code");
        Objects.requireNonNull(string3);
        this.A0B = string3;
        String string4 = bundle.getString("extra_new_mandate_vpa");
        Objects.requireNonNull(string4);
        this.A0J = string4;
        String string5 = bundle.getString("extra_new_mandate_amount_rule");
        if (string5 == null) {
            A0Z = null;
        } else {
            A0Z = C165617ti.A0Z(string5);
        }
        this.A03 = A0Z;
        this.A07 = bundle.getString("extra_new_mandate_mandate_name");
        String string6 = bundle.getString("extra_new_mandate_validity_start");
        Objects.requireNonNull(string6);
        this.A0I = string6;
        String string7 = bundle.getString("extra_new_mandate_validity_end");
        Objects.requireNonNull(string7);
        this.A0H = string7;
        String string8 = bundle.getString("extra_new_mandate_frequency");
        if (string8 == null) {
            A0Z2 = null;
        } else {
            A0Z2 = C165617ti.A0Z(string8);
        }
        Objects.requireNonNull(A0Z2);
        this.A05 = A0Z2;
        this.A0C = bundle.getString("extra_new_mandate_recurrence_day");
        String string9 = bundle.getString("extra_new_mandate_recurrence_rule");
        if (string9 == null) {
            A0Z3 = null;
        } else {
            A0Z3 = C165617ti.A0Z(string9);
        }
        this.A0D = A0Z3;
        this.A0E = bundle.getString("extra_new_mandate_rev");
        this.A0F = bundle.getString("extra_new_mandate_share");
        this.A0G = bundle.getString("extra_new_mandate_unique_mandate_number");
        this.A04 = bundle.getString("extra_update_mandate_transaction_id");
        this.A06 = bundle.getString("extra_new_mandate_initiation_mode");
    }
}

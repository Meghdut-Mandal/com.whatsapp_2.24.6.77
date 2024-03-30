package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import org.json.JSONException;

/* renamed from: X.8oI  reason: invalid class name and case insensitive filesystem */
public final class C181948oI extends C200259gz {
    public final C20810yC A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C181948oI(C20810yC r2, C207219uk r3, AnonymousClass9IS r4) {
        super(r3, r4);
        AnonymousClass00C.A0D(r2, 3);
        this.A00 = r2;
    }

    public CharSequence A07(Context context, Paint paint) {
        String str;
        CharSequence obj;
        C207199ui r0 = this.A02.A01;
        if (r0 == null || (str = r0.A0G) == null || str.length() == 0) {
            return super.A07(context, paint);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C36351kA.A0w(context, str, 1, R.string.f12nameremoved));
        Drawable A04 = A04(context);
        if (A04 != null) {
            obj = C37351mE.A02(paint, A04, A0u);
        } else {
            obj = A0u.toString();
        }
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public String A0D(Context context) {
        String str;
        AnonymousClass00C.A0D(context, 0);
        C207199ui r0 = this.A02.A01;
        if (r0 == null || (str = r0.A0G) == null || str.length() == 0) {
            return super.A0D(context);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('*');
        A0u.append(str);
        return AnonymousClass000.A0t(A0u, '*');
    }

    public void A0F(C196159Xy r9, AnonymousClass3T1 r10) {
        boolean A1a = C36341k9.A1a(r9, r10);
        C207219uk r2 = this.A02;
        C207199ui r0 = r2.A01;
        if (r0 == null || r0.A0M != A1a) {
            AnonymousClass8NL r4 = r9.A00;
            C173308Re r02 = ((AnonymousClass8SX) r4.A00).buttonsMessage_;
            if (r02 == null) {
                r02 = C173308Re.DEFAULT_INSTANCE;
            }
            AnonymousClass8N3 r3 = (AnonymousClass8N3) r02.A0q();
            byte[] bArr = null;
            C207199ui r03 = r2.A01;
            if (r03 == null || r03.A0N == null) {
                r3.A0U(AnonymousClass91C.EMPTY);
            } else {
                AnonymousClass8NJ r6 = (AnonymousClass8NJ) AnonymousClass8SF.DEFAULT_INSTANCE.A0p();
                C207199ui r04 = r2.A01;
                if (r04 != null) {
                    bArr = r04.A0N;
                }
                AnonymousClass8I5 A01 = C21674AUx.A01(bArr, 0, bArr.length);
                AnonymousClass8SF A09 = AnonymousClass8NN.A09(r6);
                A09.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                A09.jpegThumbnail_ = A01;
                r3.A0U(AnonymousClass91C.IMAGE);
                C173308Re r5 = (C173308Re) C90524aI.A0H(r3);
                C170918Hz A0R = r6.A0R();
                int i = C173308Re.BUTTONS_FIELD_NUMBER;
                A0R.getClass();
                r5.header_ = A0R;
                r5.headerCase_ = 3;
            }
            String str = r2.A09;
            if (str != null) {
                C173308Re A06 = AnonymousClass8NN.A06(r3);
                A06.bitField0_ |= 32;
                A06.contentText_ = str;
            }
            String str2 = r2.A0A;
            if (str2 != null) {
                C173308Re A062 = AnonymousClass8NN.A06(r3);
                A062.bitField0_ |= 64;
                A062.footerText_ = str2;
            }
            AnonymousClass8NN A012 = C170918Hz.A01(C172718Ox.DEFAULT_INSTANCE);
            C172718Ox r1 = (C172718Ox) A012.A00;
            r1.bitField0_ |= 1;
            r1.name_ = "review_and_pay";
            C207199ui r12 = r2.A01;
            if (r12 != null) {
                try {
                    String obj = C202749ma.A05(r12, r9.A08).toString();
                    C172718Ox r13 = (C172718Ox) C90524aI.A0H(A012);
                    obj.getClass();
                    r13.bitField0_ |= 2;
                    r13.paramsJson_ = obj;
                } catch (JSONException e) {
                    C36321k7.A1W("CheckoutMessageCustomizer/getJsonParameter/invalid parameter json: ", AnonymousClass000.A0u(), e);
                }
            }
            AnonymousClass8NN A013 = C170918Hz.A01(C173078Qh.DEFAULT_INSTANCE);
            C173078Qh r14 = (C173078Qh) A013.A00;
            C172718Ox r05 = (C172718Ox) A012.A0R();
            r05.getClass();
            r14.nativeFlowInfo_ = r05;
            r14.bitField0_ |= 8;
            AnonymousClass90Y r06 = AnonymousClass90Y.NATIVE_FLOW;
            C173078Qh r15 = (C173078Qh) C90524aI.A0H(A013);
            r15.type_ = r06.value;
            r15.bitField0_ |= 4;
            AnonymousClass8NN A014 = C170918Hz.A01(C172298Nh.DEFAULT_INSTANCE);
            C172298Nh r16 = (C172298Nh) A014.A00;
            r16.bitField0_ |= 1;
            r16.displayText_ = "review_and_pay";
            C173078Qh r17 = (C173078Qh) C90524aI.A0H(A013);
            C172298Nh r07 = (C172298Nh) A014.A0R();
            r07.getClass();
            r17.buttonText_ = r07;
            r17.bitField0_ |= 2;
            C173308Re r52 = (C173308Re) C90524aI.A0H(r3);
            C170918Hz A0R2 = A013.A0R();
            int i2 = C173308Re.BUTTONS_FIELD_NUMBER;
            A0R2.getClass();
            C23122B6c b6c = r52.buttons_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r52.buttons_ = b6c;
            }
            b6c.add(A0R2);
            C80103un r22 = r9.A02;
            byte[] bArr2 = r9.A0B;
            if (C202029kv.A02(r22, r10, bArr2)) {
                AnonymousClass8SG A002 = C196159Xy.A00(this.A01, r9, r22, r10, bArr2);
                C173308Re r18 = (C173308Re) C90524aI.A0H(r3);
                A002.getClass();
                r18.contextInfo_ = A002;
                r18.bitField0_ |= 128;
            }
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r4);
            C173308Re r08 = (C173308Re) r3.A0R();
            r08.getClass();
            A0E.buttonsMessage_ = r08;
            A0E.bitField1_ |= 1;
            return;
        }
        super.A0F(r9, r10);
        AnonymousClass8NL r42 = r9.A00;
        AnonymousClass8NN A02 = C170918Hz.A02(r42);
        AnonymousClass8NN A0q = ((AnonymousClass8SV) A02.A00).A0u().A0q();
        String A022 = r2.A02();
        if (A022 == null) {
            A022 = "review_and_pay";
        }
        AnonymousClass8NN A015 = C170918Hz.A01(AnonymousClass8P5.DEFAULT_INSTANCE);
        AnonymousClass8P5 r19 = (AnonymousClass8P5) A015.A00;
        r19.bitField0_ |= 1;
        r19.name_ = A022;
        C207199ui r110 = r2.A01;
        if (r110 != null) {
            try {
                String obj2 = C202749ma.A05(r110, r9.A08).toString();
                AnonymousClass8P5 r111 = (AnonymousClass8P5) C90524aI.A0H(A015);
                obj2.getClass();
                r111.bitField0_ |= 2;
                r111.buttonParamsJson_ = obj2;
            } catch (JSONException e2) {
                C36321k7.A1W("CheckoutMessageCustomizer/getJsonParameter/invalid parameter json: ", AnonymousClass000.A0u(), e2);
            }
        }
        C170918Hz A0R3 = A015.A0R();
        AnonymousClass8Q1 r23 = (AnonymousClass8Q1) C90524aI.A0H(A0q);
        int i3 = AnonymousClass8Q1.BUTTONS_FIELD_NUMBER;
        A0R3.getClass();
        C23122B6c b6c2 = r23.buttons_;
        if (!((C21886AcE) b6c2).A00) {
            b6c2 = C170918Hz.A0A(b6c2);
            r23.buttons_ = b6c2;
        }
        b6c2.add(A0R3);
        C200259gz.A00(A02, A0q).interactiveMessageCase_ = 6;
        r42.A0a((AnonymousClass8SV) A02.A0R());
    }

    public String A09() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        C207219uk r4 = this.A02;
        String str2 = null;
        C207199ui r0 = r4.A01;
        if (r0 != null) {
            C207009uP r02 = r0.A09;
            if (r02 != null) {
                str = r02.A01();
            } else {
                str = null;
            }
            C200259gz.A02(str, "\n", A0u);
            C207199ui r1 = r4.A01;
            if (r1 != null) {
                str2 = r1.A06(this.A00);
            }
            C200259gz.A02(str2, "\n", A0u);
        }
        C200259gz.A02(r4.A09, "\n", A0u);
        C200259gz.A02(r4.A0A, "\n", A0u);
        C200259gz.A02(this.A00.A0B(R.string.f12nameremoved), "\n", A0u);
        return C36381kD.A0y(A0u);
    }
}

package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass001;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass185;
import X.AnonymousClass1H2;
import X.AnonymousClass1LI;
import X.AnonymousClass1RY;
import X.AnonymousClass1T6;
import X.AnonymousClass3IL;
import X.AnonymousClass3LQ;
import X.AnonymousClass3SF;
import X.AnonymousClass3U8;
import X.AnonymousClass3UG;
import X.AnonymousClass3Y6;
import X.AnonymousClass4RX;
import X.AnonymousClass4W3;
import X.C012005e;
import X.C16550pQ;
import X.C18820ts;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C20430xY;
import X.C226815j;
import X.C27261Nn;
import X.C27731Pn;
import X.C32661dz;
import X.C32811eE;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;

public class ScannedCodeDialogFragment extends Hilt_ScannedCodeDialogFragment implements C16550pQ {
    public int A00;
    public ImageView A01;
    public C19730wQ A02;
    public AnonymousClass1LI A03;
    public AnonymousClass16D A04;
    public AnonymousClass16I A05;
    public C27261Nn A06;
    public AnonymousClass185 A07;
    public AnonymousClass171 A08;
    public AnonymousClass1RY A09;
    public C27731Pn A0A;
    public C20430xY A0B;
    public C19970wo A0C;
    public C18820ts A0D;
    public AnonymousClass141 A0E;
    public AnonymousClass1H2 A0F;
    public UserJid A0G;
    public AnonymousClass1T6 A0H;
    public C32661dz A0I;
    public C32811eE A0J;
    public C19770wU A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public AnonymousClass4RX A0O;
    public final View.OnClickListener A0P = new AnonymousClass3Y6(this, 6);
    public final View.OnClickListener A0Q = new AnonymousClass3Y6(this, 7);
    public final C226815j A0R = AnonymousClass4W3.A00(this, 31);

    public void A1N(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                this.A0B.A08();
                A1C(C36371kC.A0C(A0i()));
                Intent A0F2 = C36391kE.A0F(A0a(), C36441kJ.A0j(), this.A0G);
                A0F2.putExtra("added_by_qr_code", true);
                AnonymousClass3LQ.A00(A0F2, this);
            }
            A1b();
            this.A0I.A01();
            return;
        }
        super.A1N(i, i2, intent);
    }

    public void A19() {
        super.A19();
        this.A05.unregisterObserver(this.A0R);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A022;
        int i;
        Bundle A0b = A0b();
        this.A00 = A0b.getInt("ARG_TYPE");
        this.A0G = C36391kE.A0h(A0b, "ARG_JID");
        this.A0M = A0b.getString("ARG_MESSAGE");
        this.A0L = A0b.getString("ARG_SOURCE");
        this.A0N = A0b.getString("ARG_QR_CODE_ID");
        this.A0E = C36441kJ.A0i(this.A04, this.A0G);
        boolean A0M2 = this.A02.A0M(this.A0G);
        View A0K2 = C36381kD.A0K(C36381kD.A0J(this), R.layout.f9nameremoved);
        TextView A0O2 = C36391kE.A0O(A0K2, R.id.title);
        TextView A0O3 = C36391kE.A0O(A0K2, R.id.positive_button);
        this.A01 = C36401kF.A0G(A0K2, R.id.profile_picture);
        View A023 = C012005e.A02(A0K2, R.id.contact_info);
        TextView A0O4 = C36391kE.A0O(A0K2, R.id.result_title);
        TextEmojiLabel A0O5 = C36401kF.A0O(A0K2, R.id.result_subtitle);
        if (!this.A0E.A0A()) {
            A0O4.setText(this.A0D.A0H(AnonymousClass3U8.A04(this.A0G)));
            String A0K3 = this.A08.A0K(this.A0E);
            if (A0K3 != null) {
                A0O5.A0I(A0K3);
            } else {
                A0O5.setVisibility(8);
            }
        } else {
            AnonymousClass3SF A012 = AnonymousClass3SF.A01(A023, this.A03, R.id.result_title);
            A0O4.setText(AnonymousClass3UG.A03(A1D(), A0O4.getPaint(), this.A0F, this.A0E.A0K()));
            A012.A03(1);
            AnonymousClass1T6 r0 = this.A0H;
            int i2 = R.string.f12nameremoved;
            if (r0.A00.A0E(5846)) {
                i2 = R.string.f12nameremoved;
            }
            A0O5.setText(i2);
        }
        this.A09.A08(this.A01, this.A0E);
        int i3 = this.A00;
        if (i3 == 0) {
            A0O2.setText(R.string.f12nameremoved);
            if (A0M2 || !C36441kJ.A1J(this.A02)) {
                A0O3.setText(R.string.f12nameremoved);
                A0O3.setOnClickListener(this.A0Q);
                return A0K2;
            }
            AnonymousClass3IL r1 = this.A0E.A0F;
            int i4 = R.string.f12nameremoved;
            if (r1 != null) {
                i4 = R.string.f12nameremoved;
            }
            A0O3.setText(i4);
            A0O3.setOnClickListener(this.A0P);
            A022 = C012005e.A02(A0K2, R.id.details_row);
            i = 8;
        } else if (i3 == 1) {
            A1b();
            return A0K2;
        } else if (i3 == 2) {
            A0O2.setText(R.string.f12nameremoved);
            A0O3.setText(R.string.f12nameremoved);
            A0O3.setOnClickListener(this.A0P);
            A022 = C012005e.A02(A0K2, R.id.details_row);
            i = 9;
        } else {
            throw AnonymousClass001.A08("Unhandled type");
        }
        AnonymousClass3Y6.A00(A022, this, i);
        return A0K2;
    }

    public void A1H() {
        super.A1H();
        this.A09.A02();
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof AnonymousClass4RX) {
            this.A0O = (AnonymousClass4RX) context;
        }
        this.A05.registerObserver(this.A0R);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A09 = this.A0A.A05(A0a(), "scanned-code-dialog-fragment");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass4RX r0 = this.A0O;
        if (r0 != null) {
            r0.Bdw();
        }
    }
}

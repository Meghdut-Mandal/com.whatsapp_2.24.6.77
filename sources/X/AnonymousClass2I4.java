package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.List;

/* renamed from: X.2I4  reason: invalid class name */
public class AnonymousClass2I4 extends AnonymousClass8YV implements C16290ov {
    public C19460v5 A00;
    public C19460v5 A01;
    public AnonymousClass1T1 A02;
    public AnonymousClass5M6 A03;
    public AnonymousClass1ND A04;
    public C34631hO A05;
    public AnonymousClass1LV A06;
    public C20230xE A07;
    public C27761Ps A08;
    public AnonymousClass3D6 A09;
    public C604737z A0A;
    public SharePhoneNumberRowViewModel A0B;
    public AnonymousClass1HJ A0C;
    public AnonymousClass1HO A0D;
    public C26211Jh A0E;
    public AnonymousClass1YC A0F;
    public AnonymousClass1LU A0G;
    public AnonymousClass1T5 A0H;
    public AnonymousClass1FQ A0I;
    public C123445wV A0J;
    public AnonymousClass1EM A0K;
    public AnonymousClass005 A0L;
    public final View.OnClickListener A0M = new C66953Xy(this, 31);
    public final TextView A0N;

    public boolean A25() {
        return false;
    }

    public boolean A28() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x017c, code lost:
        if (r4 == 59) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x018b, code lost:
        if (r2.A0D(X.C65533Sl.A02(r8.A1J.A00)) != false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x018f, code lost:
        if ((r8 instanceof X.AnonymousClass2cS) == false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0193, code lost:
        if (r4 == 77) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0197, code lost:
        if (r4 != 78) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x019c, code lost:
        if (r4 == 11) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01a0, code lost:
        if (r4 == 20) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01a4, code lost:
        if (r4 == 93) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01a8, code lost:
        if (r4 == 94) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ac, code lost:
        if (r4 == 97) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01b0, code lost:
        if (r4 == 99) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b4, code lost:
        if (r4 == 79) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b8, code lost:
        if (r4 == 134) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01bc, code lost:
        if (r4 == 138) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c0, code lost:
        if (r4 == 137) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c4, code lost:
        if (r4 == 101) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01c8, code lost:
        if (r4 == 125) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01cc, code lost:
        if (r4 == 102) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01d0, code lost:
        if (r4 == 103) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01d4, code lost:
        if (r4 == 104) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01d8, code lost:
        if (r4 == 107) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01dc, code lost:
        if (r4 == 108) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01e0, code lost:
        if (r4 == 109) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01e4, code lost:
        if (r4 == 112) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01e8, code lost:
        if (r4 == 128) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01ec, code lost:
        if (r4 == 115) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01f0, code lost:
        if (r4 == 114) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01f4, code lost:
        if (r4 == 113) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01f8, code lost:
        if (r4 == 140) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x01fc, code lost:
        if (r4 == 141) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0200, code lost:
        if (r4 == 146) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0204, code lost:
        if (r4 == 145) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0208, code lost:
        if (r4 == 150) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x020c, code lost:
        if (r4 == 151) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0210, code lost:
        if (r4 == 147) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0214, code lost:
        if (r4 == 156) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0218, code lost:
        if (r4 == 155) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x021c, code lost:
        if (r4 == 157) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0220, code lost:
        if (r4 == 158) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0224, code lost:
        if (r4 == 162) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0228, code lost:
        if (r4 == 164) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x022a, code lost:
        r6.setOnClickListener((android.view.View.OnClickListener) null);
        r6.setClickable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0231, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x025d, code lost:
        if (X.AnonymousClass000.A1Q(r1.A00) == ((X.AnonymousClass1NP) r9.A24.get()).A03(r2)) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if ((r8 instanceof X.AnonymousClass2cI) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x02cb, code lost:
        if (r4 != 86) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0310, code lost:
        if (r0 != false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0345, code lost:
        if (r1 == 5) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0354, code lost:
        if (r1 != 5) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        if (r1 != com.whatsapp.R.drawable.vec_ic_info_white_24dp) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x052b, code lost:
        if (r4 == 158) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012b, code lost:
        if (r0 == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0166, code lost:
        if (r0 != false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016d, code lost:
        if (r1 != false) goto L_0x016f;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0C() {
        /*
            r16 = this;
            r9 = r16
            X.3T1 r8 = r9.A0K
            X.2bI r8 = (X.AnonymousClass2bI) r8
            r7 = 0
            r9.setClickable(r7)
            android.widget.TextView r6 = r9.A0N
            float r0 = r9.getDividerFontSize()
            r6.setTextSize(r0)
            int r0 = r8.A0D
            r1 = -1
            if (r0 != r1) goto L_0x0023
            int r0 = r8.A1I
            if (r0 != r1) goto L_0x0023
        L_0x001c:
            r0 = 2131889557(0x7f120d95, float:1.941378E38)
            r6.setText(r0)
            return
        L_0x0023:
            int r0 = r9.getBackgroundResource()
            if (r0 == 0) goto L_0x002c
            r6.setBackgroundResource(r0)
        L_0x002c:
            android.content.Context r1 = r9.getContext()
            int r0 = r9.getTextColor()
            X.C36331k8.A0r(r1, r6, r0)
            X.1T1 r0 = r9.A02     // Catch:{ all -> 0x0587 }
            r5 = 1
            java.lang.String r4 = r0.A0O(r8, r5)     // Catch:{ all -> 0x0587 }
            android.content.Context r3 = r9.getContext()
            android.text.TextPaint r2 = r6.getPaint()
            r1 = 1067869798(0x3fa66666, float:1.3)
            X.1H2 r0 = r9.A1M
            java.lang.CharSequence r11 = X.AnonymousClass3UG.A04(r3, r2, r0, r4, r1)
            int r4 = r8.A00
            r1 = 164(0xa4, float:2.3E-43)
            r12 = 56
            r13 = 156(0x9c, float:2.19E-43)
            r10 = 146(0x92, float:2.05E-43)
            r3 = 67
            r0 = 11
            r2 = 96
            if (r4 == r5) goto L_0x0581
            if (r4 == r0) goto L_0x0581
            if (r4 == r3) goto L_0x006d
            r0 = 69
            if (r4 != r0) goto L_0x037e
            boolean r0 = r8 instanceof X.AnonymousClass2cI
            if (r0 == 0) goto L_0x051b
        L_0x006d:
            boolean r0 = r9 instanceof X.C43372Hg
            if (r0 == 0) goto L_0x02dd
            r0 = 2131232597(0x7f080755, float:1.8081308E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131100211(0x7f060233, float:1.7812797E38)
            android.util.Pair r0 = X.C36341k9.A0I(r1, r0)
        L_0x007f:
            int r1 = X.C36381kD.A04(r0)
            int r10 = X.C36381kD.A03(r0)
            X.3Qa r0 = r8.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass143.A0H(r0)
            if (r0 != 0) goto L_0x00c0
            X.0yC r12 = r9.A0G
            r0 = 7131(0x1bdb, float:9.993E-42)
            boolean r0 = r12.A0E(r0)
            if (r0 == 0) goto L_0x00a5
            r0 = 2131232597(0x7f080755, float:1.8081308E38)
            if (r1 == r0) goto L_0x00c0
            r0 = 2131234159(0x7f080d6f, float:1.8084476E38)
            if (r1 == r0) goto L_0x00c0
        L_0x00a5:
            android.content.Context r0 = r9.getContext()
            android.graphics.drawable.Drawable r1 = X.C013105r.A01(r0, r1)
            X.C18740tg.A06(r1)
            int r0 = X.C36381kD.A05(r9, r10)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3UF.A08(r1, r0)
        L_0x00b8:
            android.text.TextPaint r0 = r6.getPaint()
            java.lang.CharSequence r11 = X.C37351mE.A02(r0, r1, r11)
        L_0x00c0:
            r6.setText(r11)
            r0 = 18
            if (r4 == r0) goto L_0x016f
            if (r4 == r2) goto L_0x016f
            r0 = 57
            if (r4 == r0) goto L_0x016f
            r0 = 71
            if (r4 == r0) goto L_0x016f
            r0 = 28
            if (r4 != r0) goto L_0x02cf
            X.0wQ r0 = r9.A0T
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x016f
            boolean r0 = r8 instanceof X.C181248nA
            if (r0 == 0) goto L_0x016f
            r0 = r8
            X.8nA r0 = (X.C181248nA) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = X.C64933Qa.A05(r8, r0)
            if (r0 == 0) goto L_0x016f
        L_0x00ec:
            boolean r0 = X.C66013Ui.A0r(r8)
            if (r0 != 0) goto L_0x016f
            r0 = 61
            if (r4 == r0) goto L_0x016f
            r0 = 69
            if (r4 == r0) goto L_0x016f
            r0 = 62
            if (r4 == r0) goto L_0x016f
            r0 = 37
            if (r4 == r0) goto L_0x016f
            r0 = 39
            if (r4 == r0) goto L_0x016f
            r0 = 40
            if (r4 == r0) goto L_0x016f
            r0 = 41
            if (r4 == r0) goto L_0x016f
            r0 = 44
            if (r4 == r0) goto L_0x016f
            r0 = 70
            if (r4 == r0) goto L_0x016f
            r0 = 117(0x75, float:1.64E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 68
            if (r4 == r0) goto L_0x016f
            r0 = 58
            if (r4 != r0) goto L_0x0232
            boolean r0 = r8 instanceof X.AnonymousClass2cL
            if (r0 == 0) goto L_0x012d
            r0 = r8
            X.2cL r0 = (X.AnonymousClass2cL) r0
            boolean r0 = r0.A00
        L_0x012b:
            if (r0 != 0) goto L_0x016f
        L_0x012d:
            boolean r0 = r8.A1Y()
            if (r0 == 0) goto L_0x0157
            X.11F r1 = r8.A0J()
            if (r1 == 0) goto L_0x0157
            X.0wQ r0 = r9.A0T
            boolean r0 = r0.A0M(r1)
            if (r0 != 0) goto L_0x0157
            X.3Qa r0 = r8.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 == 0) goto L_0x0157
            r0 = 15
            if (r4 == r0) goto L_0x0157
            r0 = 16
            if (r4 == r0) goto L_0x0157
            r0 = 56
            if (r4 != r0) goto L_0x016f
        L_0x0157:
            X.0wQ r1 = r9.A0T
            X.17X r2 = r9.A1F
            X.11F r0 = r8.A0J()
            if (r0 == 0) goto L_0x0168
            boolean r0 = r1.A0M(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0169
        L_0x0168:
            r1 = 0
        L_0x0169:
            r0 = 56
            if (r4 != r0) goto L_0x0178
            if (r1 == 0) goto L_0x017f
        L_0x016f:
            android.view.View$OnClickListener r0 = r9.A0M
            r6.setOnClickListener(r0)
            X.C33521fV.A02(r6)
            return
        L_0x0178:
            if (r4 == r0) goto L_0x017f
            r0 = 59
            if (r4 != r0) goto L_0x018d
            goto L_0x016f
        L_0x017f:
            X.3Qa r0 = r8.A1J
            X.11F r0 = r0.A00
            X.147 r0 = X.C65533Sl.A02(r0)
            boolean r0 = r2.A0D(r0)
            if (r0 != 0) goto L_0x016f
        L_0x018d:
            boolean r0 = r8 instanceof X.AnonymousClass2cS
            if (r0 == 0) goto L_0x019a
            r0 = 77
            if (r4 == r0) goto L_0x016f
            r0 = 78
            if (r4 != r0) goto L_0x019a
            goto L_0x016f
        L_0x019a:
            r0 = 11
            if (r4 == r0) goto L_0x016f
            r0 = 20
            if (r4 == r0) goto L_0x016f
            r0 = 93
            if (r4 == r0) goto L_0x016f
            r0 = 94
            if (r4 == r0) goto L_0x016f
            r0 = 97
            if (r4 == r0) goto L_0x016f
            r0 = 99
            if (r4 == r0) goto L_0x016f
            r0 = 79
            if (r4 == r0) goto L_0x016f
            r0 = 134(0x86, float:1.88E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 138(0x8a, float:1.93E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 137(0x89, float:1.92E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 101(0x65, float:1.42E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 102(0x66, float:1.43E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 103(0x67, float:1.44E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 104(0x68, float:1.46E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 107(0x6b, float:1.5E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 109(0x6d, float:1.53E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 112(0x70, float:1.57E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 128(0x80, float:1.794E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 115(0x73, float:1.61E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 114(0x72, float:1.6E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 113(0x71, float:1.58E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 140(0x8c, float:1.96E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 141(0x8d, float:1.98E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 146(0x92, float:2.05E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 145(0x91, float:2.03E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 150(0x96, float:2.1E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 151(0x97, float:2.12E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 147(0x93, float:2.06E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 156(0x9c, float:2.19E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 155(0x9b, float:2.17E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 157(0x9d, float:2.2E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 158(0x9e, float:2.21E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 162(0xa2, float:2.27E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 164(0xa4, float:2.3E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 0
            r6.setOnClickListener(r0)
            r6.setClickable(r7)
            return
        L_0x0232:
            r0 = 153(0x99, float:2.14E-43)
            if (r4 != r0) goto L_0x0261
            boolean r0 = r8 instanceof X.AnonymousClass2cM
            if (r0 == 0) goto L_0x012d
            r1 = r8
            X.2cM r1 = (X.AnonymousClass2cM) r1
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r0)
            if (r2 == 0) goto L_0x012d
            int r0 = r1.A01
            if (r0 != 0) goto L_0x012d
            int r0 = r1.A00
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            X.005 r0 = r9.A24
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            boolean r0 = r0.A03(r2)
            if (r1 != r0) goto L_0x012d
            goto L_0x016f
        L_0x0261:
            r0 = 27
            if (r4 == r0) goto L_0x016f
            r0 = 131(0x83, float:1.84E-43)
            if (r4 == r0) goto L_0x016f
            r0 = 73
            if (r4 == r0) goto L_0x016f
            r0 = 74
            if (r4 == r0) goto L_0x016f
            r0 = 83
            if (r4 == r0) goto L_0x016f
            r0 = 84
            if (r4 == r0) goto L_0x016f
            r0 = 85
            if (r4 == r0) goto L_0x016f
            r0 = 14
            if (r4 != r0) goto L_0x0292
            X.0yC r1 = r9.A0G
            r0 = r8
            X.8nz r0 = (X.C181758nz) r0
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            boolean r0 = X.AnonymousClass1T1.A0G(r1, r0)
            goto L_0x012b
        L_0x0292:
            r0 = 12
            if (r4 != r0) goto L_0x02b9
            X.0yC r1 = r9.A0G
            r0 = r8
            X.8nz r0 = (X.C181758nz) r0
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            boolean r0 = X.AnonymousClass1T1.A0G(r1, r0)
            if (r0 != 0) goto L_0x016f
            X.1T1 r0 = r9.A02
            boolean r0 = r0.A0Q(r8, r5)
            if (r0 != 0) goto L_0x016f
            X.12q r1 = r9.A0F
            X.17X r0 = r9.A1F
            boolean r0 = X.AnonymousClass3RA.A00(r1, r0, r8)
            goto L_0x012b
        L_0x02b9:
            r0 = 75
            if (r4 == r0) goto L_0x016f
            r0 = 100
            if (r4 == r0) goto L_0x016f
            r0 = 95
            if (r4 == r0) goto L_0x016f
            r0 = 76
            if (r4 == r0) goto L_0x016f
            r0 = 86
            if (r4 == r0) goto L_0x016f
            goto L_0x012d
        L_0x02cf:
            r0 = 10
            if (r4 == r0) goto L_0x016f
            if (r4 == r3) goto L_0x016f
            if (r4 == r2) goto L_0x016f
            r0 = 21
            if (r4 == r0) goto L_0x016f
            goto L_0x00ec
        L_0x02dd:
            X.3Qa r0 = r8.A1J
            X.11F r10 = r0.A00
            X.1CF r0 = r9.A1S
            boolean r0 = r0.A02(r10)
            if (r0 != 0) goto L_0x0377
            X.0yC r0 = r9.A0G
            boolean r0 = X.AnonymousClass3RR.A00(r0, r10)
            if (r0 != 0) goto L_0x0377
            X.0xf r0 = r9.A1O
            boolean r0 = X.AnonymousClass3M3.A01(r0, r10)
            if (r0 != 0) goto L_0x0377
            if (r4 != r3) goto L_0x032b
            boolean r0 = r8 instanceof X.AnonymousClass2cH
            if (r0 == 0) goto L_0x035b
            r0 = r8
            X.2cH r0 = (X.AnonymousClass2cH) r0
            int r1 = r0.A00
            X.0yC r0 = r9.A0G
            boolean r0 = X.AnonymousClass3RR.A01(r0, r8)
            switch(r1) {
                case 5: goto L_0x0312;
                case 6: goto L_0x0312;
                case 7: goto L_0x0312;
                case 8: goto L_0x0312;
                case 9: goto L_0x0312;
                case 10: goto L_0x0312;
                case 11: goto L_0x030d;
                case 12: goto L_0x030d;
                case 13: goto L_0x030d;
                case 14: goto L_0x030d;
                case 15: goto L_0x0312;
                case 16: goto L_0x0312;
                case 17: goto L_0x0312;
                default: goto L_0x030d;
            }
        L_0x030d:
            r12 = 2131232653(0x7f08078d, float:1.8081421E38)
            if (r0 == 0) goto L_0x0315
        L_0x0312:
            r12 = 2131232597(0x7f080755, float:1.8081308E38)
        L_0x0315:
            boolean r0 = X.AnonymousClass143.A0H(r10)
            if (r0 != 0) goto L_0x0357
            switch(r1) {
                case 5: goto L_0x0357;
                case 6: goto L_0x0357;
                case 7: goto L_0x0357;
                case 8: goto L_0x0357;
                case 9: goto L_0x0357;
                case 10: goto L_0x0357;
                case 11: goto L_0x031e;
                case 12: goto L_0x031e;
                case 13: goto L_0x031e;
                case 14: goto L_0x031e;
                case 15: goto L_0x0357;
                case 16: goto L_0x0357;
                case 17: goto L_0x0357;
                default: goto L_0x031e;
            }
        L_0x031e:
            r1 = 2131100228(0x7f060244, float:1.7812832E38)
        L_0x0321:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            android.util.Pair r0 = X.C36341k9.A0I(r0, r1)
            goto L_0x007f
        L_0x032b:
            r0 = 69
            if (r4 != r0) goto L_0x035b
            boolean r0 = r8 instanceof X.AnonymousClass2cI
            if (r0 == 0) goto L_0x035b
            r0 = r8
            X.2cI r0 = (X.AnonymousClass2cI) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 == r0) goto L_0x0347
            r0 = 3
            if (r1 == r0) goto L_0x0347
            r0 = 4
            if (r1 == r0) goto L_0x0347
            r0 = 5
            r12 = 2131232653(0x7f08078d, float:1.8081421E38)
            if (r1 != r0) goto L_0x034a
        L_0x0347:
            r12 = 2131232597(0x7f080755, float:1.8081308E38)
        L_0x034a:
            r0 = 2
            if (r1 == r0) goto L_0x0357
            r0 = 3
            if (r1 == r0) goto L_0x0357
            r0 = 4
            if (r1 == r0) goto L_0x0357
            r0 = 5
            if (r1 == r0) goto L_0x0357
            goto L_0x031e
        L_0x0357:
            r1 = 2131101685(0x7f0607f5, float:1.7815787E38)
            goto L_0x0321
        L_0x035b:
            boolean r0 = X.C66013Ui.A0e(r8)
            if (r0 == 0) goto L_0x0373
            boolean r0 = r8 instanceof X.AnonymousClass2cH
            if (r0 == 0) goto L_0x0373
            r0 = r8
            X.2cH r0 = (X.AnonymousClass2cH) r0
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0373
            r12 = 2131232597(0x7f080755, float:1.8081308E38)
            r1 = 2131100227(0x7f060243, float:1.781283E38)
            goto L_0x0321
        L_0x0373:
            r12 = 2131232653(0x7f08078d, float:1.8081421E38)
            goto L_0x031e
        L_0x0377:
            r12 = 2131234159(0x7f080d6f, float:1.8084476E38)
            r1 = 2131100224(0x7f060240, float:1.7812823E38)
            goto L_0x0321
        L_0x037e:
            if (r4 == r10) goto L_0x006d
            if (r4 == r13) goto L_0x006d
            r0 = 32
            if (r4 == r0) goto L_0x04b1
            r0 = 31
            if (r4 == r0) goto L_0x04b1
            if (r4 == r12) goto L_0x049e
            r0 = 59
            if (r4 == r0) goto L_0x049e
            r0 = 68
            if (r4 == r0) goto L_0x049e
            r0 = 70
            if (r4 != r0) goto L_0x03cb
            boolean r0 = r8 instanceof X.C46992cO
            if (r0 == 0) goto L_0x001c
            X.5M6 r0 = r9.A03
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r12 = r8
            X.2cO r12 = (X.C46992cO) r12
            android.content.Context r10 = r9.getContext()
            if (r0 == 0) goto L_0x03b7
            r1 = 2131232397(0x7f08068d, float:1.8080902E38)
        L_0x03ae:
            r0 = 2131100186(0x7f06021a, float:1.7812746E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3UF.A02(r10, r1, r0)
            goto L_0x00b8
        L_0x03b7:
            int r1 = r12.A00
            r0 = 2
            if (r1 != r0) goto L_0x03c0
            r1 = 2131234349(0x7f080e2d, float:1.8084861E38)
            goto L_0x03ae
        L_0x03c0:
            boolean r0 = r12.A02
            r1 = 2131232356(0x7f080664, float:1.8080819E38)
            if (r0 == 0) goto L_0x03ae
            r1 = 2131232354(0x7f080662, float:1.8080815E38)
            goto L_0x03ae
        L_0x03cb:
            if (r4 != r1) goto L_0x0426
            android.text.TextPaint r11 = r6.getPaint()
            r0 = r8
            X.2cK r0 = (X.AnonymousClass2cK) r0
            java.lang.String r14 = r0.A01
            android.content.Context r13 = r9.getContext()
            r12 = 2131891229(0x7f12141d, float:1.9417172E38)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "\""
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r14, r1)
            java.lang.String r10 = X.C36391kE.A0v(r13, r0, r10, r7, r12)
            r1 = 1152647168(0x44b40000, float:1440.0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r13 = android.text.TextUtils.ellipsize(r10, r11, r1, r0)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            android.content.Context r1 = r9.getContext()
            r0 = 2131891231(0x7f12141f, float:1.9417176E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r12 = X.C36441kJ.A0P(r0)
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r5)
            int r1 = r12.length()
            r0 = 33
            r12.setSpan(r10, r7, r1, r0)
            android.text.SpannableStringBuilder r1 = r11.append(r13)
            java.lang.String r0 = "\" "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            r0.append(r12)
            goto L_0x00c0
        L_0x0426:
            r0 = 162(0xa2, float:2.27E-43)
            if (r4 != r0) goto L_0x04cf
            r0 = r8
            X.5JE r0 = (X.AnonymousClass5JE) r0
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            long r0 = r0.A01
            r11.setTimeInMillis(r0)
            X.0ts r10 = r9.A0E
            java.lang.String r15 = X.AnonymousClass3UM.A03(r10, r11)
            X.0ts r10 = r9.A0E
            java.lang.String r13 = X.C20040wv.A04(r10, r0)
            X.0ts r10 = r9.A0E
            X.0wo r0 = r9.A19
            long r0 = X.C19970wo.A00(r0)
            java.lang.String r14 = X.C20040wv.A04(r10, r0)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            android.content.Context r1 = r9.getContext()
            r0 = 2131891234(0x7f121422, float:1.9417182E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r12 = X.C36441kJ.A0P(r0)
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r5)
            int r1 = r12.length()
            r0 = 33
            r12.setSpan(r10, r7, r1, r0)
            boolean r0 = r13.equals(r14)
            java.lang.String r10 = " "
            android.content.res.Resources r14 = X.C36341k9.A0F(r9)
            if (r0 == 0) goto L_0x0494
            r1 = 2131891233(0x7f121421, float:1.941718E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r7] = r15
        L_0x0483:
            java.lang.String r0 = r14.getString(r1, r0)
            android.text.SpannableStringBuilder r0 = r11.append(r0)
            android.text.SpannableStringBuilder r0 = r0.append(r10)
            r0.append(r12)
            goto L_0x00c0
        L_0x0494:
            r1 = 2131891232(0x7f121420, float:1.9417178E38)
            java.lang.Object[] r0 = X.C36411kG.A1b(r15)
            r0[r5] = r13
            goto L_0x0483
        L_0x049e:
            android.content.Context r1 = r9.getContext()
            r0 = 2131232267(0x7f08060b, float:1.8080638E38)
            android.graphics.drawable.Drawable r13 = X.C36381kD.A0H(r1, r0)
            android.content.Context r12 = r9.getContext()
            r0 = 2131100177(0x7f060211, float:1.7812728E38)
            goto L_0x04e7
        L_0x04b1:
            android.content.Context r1 = r9.getContext()
            r0 = 2131232497(0x7f0806f1, float:1.8081105E38)
            android.graphics.drawable.Drawable r13 = X.C36381kD.A0H(r1, r0)
            android.content.Context r12 = r9.getContext()
            android.content.Context r10 = r9.getContext()
            r1 = 2130969107(0x7f040213, float:1.7546887E38)
            r0 = 2131100225(0x7f060241, float:1.7812825E38)
            int r0 = X.C224514j.A00(r10, r1, r0)
            goto L_0x04e7
        L_0x04cf:
            if (r4 != r2) goto L_0x04ed
            boolean r0 = r8 instanceof X.AnonymousClass5JC
        L_0x04d3:
            if (r0 == 0) goto L_0x00c0
            android.content.Context r1 = r9.getContext()
            r0 = 2131232590(0x7f08074e, float:1.8081294E38)
            android.graphics.drawable.Drawable r13 = X.C36381kD.A0H(r1, r0)
            android.content.Context r12 = r9.getContext()
            r0 = 2131100186(0x7f06021a, float:1.7812746E38)
        L_0x04e7:
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3UF.A04(r12, r13, r0)
            goto L_0x00b8
        L_0x04ed:
            r0 = 97
            if (r4 != r0) goto L_0x0500
            r9.getContext()
            X.0v5 r0 = r9.A01
            r0.A02()
            java.lang.String r0 = "getSmbChatAssignmentIconId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0500:
            r0 = 99
            if (r4 != r0) goto L_0x0507
            boolean r0 = r8 instanceof X.C181368nM
            goto L_0x04d3
        L_0x0507:
            r0 = 117(0x75, float:1.64E-43)
            if (r4 == r0) goto L_0x0574
            r0 = 121(0x79, float:1.7E-43)
            if (r4 == r0) goto L_0x0574
            r0 = 134(0x86, float:1.88E-43)
            if (r4 != r0) goto L_0x051b
            r10 = 2131100177(0x7f060211, float:1.7812728E38)
            r1 = 2131234209(0x7f080da1, float:1.8084577E38)
            goto L_0x00a5
        L_0x051b:
            java.util.Set r0 = X.C56672wh.A01
            r0 = 147(0x93, float:2.06E-43)
            if (r4 == r0) goto L_0x0535
            r0 = 155(0x9b, float:2.17E-43)
            if (r4 == r0) goto L_0x0535
            r0 = 157(0x9d, float:2.2E-43)
            if (r4 == r0) goto L_0x052d
            r0 = 158(0x9e, float:2.21E-43)
            if (r4 != r0) goto L_0x00c0
        L_0x052d:
            r10 = 2131100227(0x7f060243, float:1.781283E38)
            r1 = 2131234097(0x7f080d31, float:1.808435E38)
            goto L_0x00a5
        L_0x0535:
            X.1T2 r10 = r9.A22
            android.text.TextPaint r12 = r6.getPaint()
            r0 = 155(0x9b, float:2.17E-43)
            boolean r0 = X.AnonymousClass000.A1S(r4, r0)
            X.1T3 r10 = (X.AnonymousClass1T3) r10
            X.AnonymousClass00C.A0D(r11, r7)
            X.AnonymousClass00C.A0D(r12, r5)
            if (r0 != 0) goto L_0x00c0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "i "
            java.lang.String r0 = X.AnonymousClass000.A0l(r11, r0, r1)
            android.text.Spanned r11 = android.text.Html.fromHtml(r0)
            X.0wG r0 = r10.A00
            android.content.Context r10 = r0.A00
            r0 = 2131234159(0x7f080d6f, float:1.8084476E38)
            android.graphics.drawable.Drawable r1 = X.C36381kD.A0H(r10, r0)
            r0 = 2131100186(0x7f06021a, float:1.7812746E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A04(r10, r1, r0)
            java.lang.CharSequence r11 = X.C37351mE.A02(r12, r0, r11)
            X.AnonymousClass00C.A0B(r11)
            goto L_0x00c0
        L_0x0574:
            android.content.Context r1 = r9.getContext()
            r0 = 2131234024(0x7f080ce8, float:1.8084202E38)
            android.graphics.drawable.Drawable r1 = X.C36381kD.A0H(r1, r0)
            goto L_0x00b8
        L_0x0581:
            java.lang.CharSequence r11 = r9.A1V(r11)
            goto L_0x00c0
        L_0x0587:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2I4.A0C():void");
    }

    public static boolean A0D(AnonymousClass2I4 r3) {
        AnonymousClass147 A022;
        AnonymousClass147 A012 = C65533Sl.A01(r3.A0K.A1J.A00);
        if (A012 == null || !r3.A0F.A0O(A012) || (A022 = r3.A06.A02(A012)) == null) {
            return false;
        }
        r3.A07.Bkx(r3.getContext(), r3, A022);
        return true;
    }

    public static boolean A0E(AnonymousClass2I4 r4, AnonymousClass2bI r5, String str) {
        C181758nz r52 = (C181758nz) r5;
        if (!AnonymousClass1T1.A0G(r4.A0G, r52.A01.size())) {
            return false;
        }
        List list = r52.A01;
        C36321k7.A0w(str, list);
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = new GroupChangedParticipantsBottomSheet();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("changed_participants_title", str);
        A072.putStringArrayList("changed_participants", AnonymousClass143.A07(list));
        C36381kD.A17(A072, groupChangedParticipantsBottomSheet, (C225314u) C36361kB.A06(r4));
        return true;
    }

    private C20120x3 getPhoneNumberSharedBridge() {
        return (C20120x3) ((C20780y9) this.A28.get()).A01(C20120x3.class);
    }

    private C20110x2 getSharePhoneNumberBridge() {
        return (C20110x2) ((C20780y9) this.A28.get()).A01(C20110x2.class);
    }

    private C20530xi getVoipErrorFragmentBridge() {
        return (C20530xi) ((C20780y9) this.A28.get()).A01(C20530xi.class);
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0C();
        }
    }

    public /* synthetic */ void A2D(AnonymousClass01L r4, C53942s9 r5) {
        DialogFragment A002;
        String str;
        if (r4 instanceof C225314u) {
            if (r5 instanceof C43862Kc) {
                getPhoneNumberSharedBridge();
                C43862Kc r52 = (C43862Kc) r5;
                A002 = C53482rO.A00(r52.A00, r52.A01);
                str = "PhoneNumberSharedBottomSheet";
            } else {
                getSharePhoneNumberBridge();
                AnonymousClass11F r2 = ((C43852Kb) r5).A00;
                AnonymousClass00C.A0D(r2, 0);
                A002 = C53492rP.A00(r2, 6);
                str = "SharePhoneNumberBottomSheet";
            }
            ((C225314u) r4).Btl(A002, str);
        }
    }

    public /* synthetic */ void A2E(AnonymousClass147 r13, AnonymousClass2bI r14) {
        C19970wo r4 = this.A19;
        Context context = getContext();
        AnonymousClass17Y r1 = this.A0R;
        long j = ((AnonymousClass2cN) r14).A01;
        AnonymousClass1ND r2 = this.A04;
        AnonymousClass1HJ r5 = this.A0C;
        C26211Jh r7 = this.A0E;
        AnonymousClass3UL.A05(context, r1, r2, getVoipErrorFragmentBridge(), r4, r5, this.A0D, r7, r13, 8, j);
    }

    public /* synthetic */ void A2F(AnonymousClass2bI r6, C107265Nh r7) {
        int i = ((C46992cO) r6).A00;
        if (r7 == null || r7.A0F == null) {
            C225314u r2 = (C225314u) C36361kB.A06(this);
            getVoipErrorFragmentBridge();
            int i2 = 12;
            if (i == 2) {
                i2 = 33;
            }
            r2.Btl(VoipErrorDialogFragment.A05(new AnonymousClass3FU(), i2), (String) null);
        } else {
            ((AnonymousClass1NE) this.A04).BNr(getContext(), r7, 8, false);
        }
        this.A03 = null;
        A1Y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if ((r2 instanceof X.AnonymousClass2cH) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getBackgroundResource() {
        /*
            r5 = this;
            X.3T1 r2 = r5.A0K
            X.2bI r2 = (X.AnonymousClass2bI) r2
            X.3Qa r0 = r2.A1J
            X.11F r4 = r0.A00
            X.1CF r0 = r5.A1S
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x0026
            int r1 = r2.A00
            r0 = 67
            if (r1 != r0) goto L_0x001a
            boolean r0 = r2 instanceof X.AnonymousClass2cH
            if (r0 != 0) goto L_0x004a
        L_0x001a:
            boolean r0 = r2 instanceof X.C181758nz
            if (r0 != 0) goto L_0x0022
            boolean r0 = r2 instanceof X.C181048mq
            if (r0 == 0) goto L_0x009f
        L_0x0022:
            r0 = 2131231401(0x7f0802a9, float:1.8078882E38)
            return r0
        L_0x0026:
            X.0yC r0 = r5.A0G
            boolean r0 = X.AnonymousClass3RR.A00(r0, r4)
            if (r0 != 0) goto L_0x004a
            int r1 = r2.A00
            r0 = 67
            if (r1 != r0) goto L_0x0039
            boolean r0 = r2 instanceof X.AnonymousClass2cH
            r3 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x004e
            X.0xf r0 = r5.A1O
            boolean r0 = X.AnonymousClass3M3.A01(r0, r4)
            if (r0 != 0) goto L_0x004a
            boolean r0 = X.AnonymousClass143.A0H(r4)
            if (r0 == 0) goto L_0x004e
        L_0x004a:
            r0 = 2131233172(0x7f080994, float:1.8082474E38)
            return r0
        L_0x004e:
            r0 = 69
            if (r1 != r0) goto L_0x006a
            boolean r0 = r2 instanceof X.AnonymousClass2cI
            if (r0 == 0) goto L_0x006a
            X.2cI r2 = (X.AnonymousClass2cI) r2
            int r1 = r2.A00
            r0 = 2
            if (r1 == r0) goto L_0x004a
            r0 = 3
            if (r1 == r0) goto L_0x004a
            r0 = 4
            if (r1 == r0) goto L_0x004a
            r0 = 5
            if (r1 == r0) goto L_0x004a
        L_0x0066:
            r0 = 2131233634(0x7f080b62, float:1.8083411E38)
            return r0
        L_0x006a:
            if (r3 == 0) goto L_0x007d
            r0 = r2
            X.2cH r0 = (X.AnonymousClass2cH) r0
            int r1 = r0.A00
            X.0yC r0 = r5.A0G
            boolean r0 = X.AnonymousClass3RR.A01(r0, r2)
            switch(r1) {
                case 5: goto L_0x004a;
                case 6: goto L_0x004a;
                case 7: goto L_0x004a;
                case 8: goto L_0x004a;
                case 9: goto L_0x004a;
                case 10: goto L_0x004a;
                case 11: goto L_0x007a;
                case 12: goto L_0x007a;
                case 13: goto L_0x007a;
                case 14: goto L_0x007a;
                case 15: goto L_0x004a;
                case 16: goto L_0x004a;
                case 17: goto L_0x004a;
                default: goto L_0x007a;
            }
        L_0x007a:
            if (r0 == 0) goto L_0x0066
            goto L_0x004a
        L_0x007d:
            boolean r0 = A0F(r2)
            if (r0 != 0) goto L_0x0066
            boolean r0 = X.C66013Ui.A0r(r2)
            if (r0 != 0) goto L_0x009f
            boolean r0 = X.C66013Ui.A0d(r2)
            if (r0 != 0) goto L_0x009f
            boolean r0 = X.C66013Ui.A0e(r2)
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r2 instanceof X.AnonymousClass2cH
            if (r0 == 0) goto L_0x00a3
            X.2cH r2 = (X.AnonymousClass2cH) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x00a3
        L_0x009f:
            r0 = 2131231213(0x7f0801ed, float:1.80785E38)
            return r0
        L_0x00a3:
            java.util.Set r0 = X.C56672wh.A01
            r0 = 147(0x93, float:2.06E-43)
            if (r1 == r0) goto L_0x00ad
            r0 = 155(0x9b, float:2.17E-43)
            if (r1 != r0) goto L_0x0022
        L_0x00ad:
            r0 = 2131231377(0x7f080291, float:1.8078833E38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2I4.getBackgroundResource():int");
    }

    public AnonymousClass2bI getFMessage() {
        return (AnonymousClass2bI) this.A0K;
    }

    public int getTextColor() {
        AnonymousClass2bI r2 = (AnonymousClass2bI) this.A0K;
        AnonymousClass11F r3 = r2.A1J.A00;
        if (this.A1S.A02(r3)) {
            if ((r2.A00 != 67 || !(r2 instanceof AnonymousClass2cH)) && !(r2 instanceof C181758nz)) {
                return R.color.f6nameremoved;
            }
            return R.color.f6nameremoved;
        } else if (AnonymousClass3RR.A00(this.A0G, r3) || AnonymousClass3M3.A01(this.A1O, r3)) {
            return R.color.f6nameremoved;
        } else {
            int i = r2.A00;
            if (i != 67 || !(r2 instanceof AnonymousClass2cH)) {
                if (i == 69 && (r2 instanceof AnonymousClass2cI)) {
                    int i2 = ((AnonymousClass2cI) r2).A00;
                    if (i2 == 2 || i2 == 3 || i2 == 4 || i2 != 5) {
                        return R.color.f6nameremoved;
                    }
                    return R.color.f6nameremoved;
                } else if (A0F(r2) || C66013Ui.A0r(r2) || C66013Ui.A0d(r2) || !C66013Ui.A0e(r2) || !(r2 instanceof AnonymousClass2cH) || ((AnonymousClass2cH) r2).A00 != 0) {
                    return R.color.f6nameremoved;
                } else {
                    return R.color.f6nameremoved;
                }
            } else if (AnonymousClass143.A0H(r3)) {
                return R.color.f6nameremoved;
            } else {
                int i3 = ((AnonymousClass2cH) r2).A00;
                boolean A012 = AnonymousClass3RR.A01(this.A0G, r2);
                switch (i3) {
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        return R.color.f6nameremoved;
                    default:
                        if (A012) {
                            return R.color.f6nameremoved;
                        }
                        return R.color.f6nameremoved;
                }
            }
        }
    }

    public void onDetachedFromWindow() {
        AnonymousClass5M6 r1 = this.A03;
        if (r1 != null) {
            r1.A0D(true);
            this.A03 = null;
        }
        super.onDetachedFromWindow();
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bI);
        this.A0K = r2;
    }

    public AnonymousClass2I4(Context context, C89004Uw r4, AnonymousClass2bI r5) {
        super(context, r4, r5);
        setClickable(false);
        this.A0N = C36391kE.A0P(this, R.id.info);
        A0C();
    }

    public static boolean A0F(AnonymousClass2bI r2) {
        int i;
        if (C66013Ui.A0m(r2) || ((C66013Ui.A0e(r2) && (r2 instanceof AnonymousClass2cH) && ((AnonymousClass2cH) r2).A00 == 0) || C66013Ui.A0g(r2) || C66013Ui.A0h(r2) || (i = r2.A00) == 62 || i == 63)) {
            return true;
        }
        return false;
    }

    public void A1Y() {
        A0C();
        AnonymousClass2IR.A0d(this, false);
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}

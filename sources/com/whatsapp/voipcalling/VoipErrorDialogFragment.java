package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3FU;
import X.C19730wQ;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36441kJ;
import X.C55782vB;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoipErrorDialogFragment extends Hilt_VoipErrorDialogFragment {
    public int A00;
    public C19730wQ A01;
    public AnonymousClass3FU A02;
    public AnonymousClass16D A03;
    public AnonymousClass171 A04;
    public ArrayList A05 = AnonymousClass001.A0I();
    public int A06;

    public static VoipErrorDialogFragment A06(List list, int i, boolean z) {
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("error", C36371kC.A00(z ? 1 : 0));
        A07.putParcelableArrayList("user_jids", C36441kJ.A15(list));
        A07.putInt("call_size", i);
        voipErrorDialogFragment.A17(A07);
        voipErrorDialogFragment.A02 = new AnonymousClass3FU();
        return voipErrorDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        return X.C36331k8.A0g(r6, r9.A06, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        return X.C36401kF.A0q(r9, A09(r9.A05), new java.lang.Object[1], 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        return A0n(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A07() {
        /*
            r9 = this;
            int r0 = r9.A00
            r5 = 0
            r8 = 1
            switch(r0) {
                case 1: goto L_0x005e;
                case 2: goto L_0x0037;
                case 3: goto L_0x006a;
                case 4: goto L_0x006e;
                case 5: goto L_0x007d;
                case 6: goto L_0x0081;
                case 7: goto L_0x0085;
                case 8: goto L_0x0089;
                case 9: goto L_0x008d;
                case 10: goto L_0x0091;
                case 11: goto L_0x0095;
                case 12: goto L_0x0099;
                case 13: goto L_0x009d;
                case 14: goto L_0x00a1;
                case 15: goto L_0x00a5;
                case 16: goto L_0x00a9;
                case 17: goto L_0x00ad;
                case 18: goto L_0x000f;
                case 19: goto L_0x00b1;
                case 20: goto L_0x00b5;
                case 21: goto L_0x00b1;
                case 22: goto L_0x00b9;
                case 23: goto L_0x00bd;
                case 24: goto L_0x0085;
                case 25: goto L_0x00c1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x000f;
                case 28: goto L_0x00b1;
                case 29: goto L_0x00b1;
                case 30: goto L_0x00d5;
                case 31: goto L_0x00d9;
                case 32: goto L_0x0014;
                case 33: goto L_0x00dd;
                case 34: goto L_0x00e1;
                case 35: goto L_0x00e5;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "Unknown error"
            X.C18740tg.A0D(r5, r0)
            java.lang.String r0 = ""
            return r0
        L_0x000f:
            r2 = 2131895923(0x7f122673, float:1.9426693E38)
            goto L_0x00c4
        L_0x0014:
            java.util.ArrayList r2 = r9.A05
            int r0 = r2.size()
            if (r0 != r8) goto L_0x0032
            X.0wQ r1 = r9.A01
            java.lang.Object r0 = r2.get(r5)
            X.11F r0 = (X.AnonymousClass11F) r0
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 2131889307(0x7f120c9b, float:1.9413274E38)
            java.lang.String r0 = r9.A0n(r0)
            return r0
        L_0x0032:
            r2 = 2131889306(0x7f120c9a, float:1.9413272E38)
            goto L_0x00c4
        L_0x0037:
            java.util.ArrayList r7 = r9.A05
            int r0 = r7.size()
            X.0ts r6 = r9.A01
            r1 = 2131755422(0x7f10019e, float:1.9141723E38)
            if (r0 != r8) goto L_0x0063
            r4 = 2131755423(0x7f10019f, float:1.9141725E38)
            int r0 = r9.A06
            long r2 = (long) r0
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            java.lang.String r0 = r9.A09(r7)
            r1[r5] = r0
            int r0 = r9.A06
            X.AnonymousClass000.A1L(r1, r0, r8)
            java.lang.String r0 = r6.A0L(r1, r4, r2)
            return r0
        L_0x005e:
            X.0ts r6 = r9.A01
            r1 = 2131755421(0x7f10019d, float:1.914172E38)
        L_0x0063:
            int r0 = r9.A06
            java.lang.String r0 = X.C36331k8.A0g(r6, r0, r5, r1)
            return r0
        L_0x006a:
            r0 = 2131895974(0x7f1226a6, float:1.9426796E38)
            goto L_0x00e8
        L_0x006e:
            r2 = 2131895967(0x7f12269f, float:1.9426782E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 64
            X.AnonymousClass000.A1L(r1, r0, r5)
            java.lang.String r0 = r9.A0o(r2, r1)
            return r0
        L_0x007d:
            r0 = 2131895937(0x7f122681, float:1.9426721E38)
            goto L_0x00e8
        L_0x0081:
            r0 = 2131895942(0x7f122686, float:1.9426731E38)
            goto L_0x00e8
        L_0x0085:
            r0 = 2131895941(0x7f122685, float:1.942673E38)
            goto L_0x00e8
        L_0x0089:
            r0 = 2131895935(0x7f12267f, float:1.9426717E38)
            goto L_0x00e8
        L_0x008d:
            r0 = 2131895939(0x7f122683, float:1.9426725E38)
            goto L_0x00e8
        L_0x0091:
            r0 = 2131890767(0x7f12124f, float:1.9416235E38)
            goto L_0x00e8
        L_0x0095:
            r0 = 2131890763(0x7f12124b, float:1.9416227E38)
            goto L_0x00e8
        L_0x0099:
            r0 = 2131890764(0x7f12124c, float:1.941623E38)
            goto L_0x00e8
        L_0x009d:
            r0 = 2131890773(0x7f121255, float:1.9416247E38)
            goto L_0x00e8
        L_0x00a1:
            r0 = 2131890772(0x7f121254, float:1.9416245E38)
            goto L_0x00e8
        L_0x00a5:
            r0 = 2131890765(0x7f12124d, float:1.9416231E38)
            goto L_0x00e8
        L_0x00a9:
            r0 = 2131890774(0x7f121256, float:1.941625E38)
            goto L_0x00e8
        L_0x00ad:
            r0 = 2131894757(0x7f1221e5, float:1.9424328E38)
            goto L_0x00e8
        L_0x00b1:
            r0 = 2131887333(0x7f1204e5, float:1.940927E38)
            goto L_0x00e8
        L_0x00b5:
            r0 = 2131887861(0x7f1206f5, float:1.9410341E38)
            goto L_0x00e8
        L_0x00b9:
            r0 = 2131890540(0x7f12116c, float:1.9415775E38)
            goto L_0x00e8
        L_0x00bd:
            r0 = 2131893094(0x7f121b66, float:1.9420955E38)
            goto L_0x00e8
        L_0x00c1:
            r2 = 2131893552(0x7f121d30, float:1.9421884E38)
        L_0x00c4:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.util.ArrayList r0 = r9.A05
            java.lang.String r0 = r9.A09(r0)
            java.lang.String r0 = X.C36401kF.A0q(r9, r0, r1, r5, r2)
            return r0
        L_0x00d1:
            r0 = 2131895149(0x7f12236d, float:1.9425123E38)
            goto L_0x00e8
        L_0x00d5:
            r0 = 2131895936(0x7f122680, float:1.942672E38)
            goto L_0x00e8
        L_0x00d9:
            r0 = 2131893842(0x7f121e52, float:1.9422472E38)
            goto L_0x00e8
        L_0x00dd:
            r0 = 2131895808(0x7f122600, float:1.942646E38)
            goto L_0x00e8
        L_0x00e1:
            r0 = 2131888506(0x7f12097a, float:1.941165E38)
            goto L_0x00e8
        L_0x00e5:
            r0 = 2131889430(0x7f120d16, float:1.9413523E38)
        L_0x00e8:
            java.lang.String r0 = r9.A0n(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A07():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        return A0n(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        return "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A08() {
        /*
            r9 = this;
            int r0 = r9.A00
            java.lang.String r1 = ""
            r7 = 0
            switch(r0) {
                case 1: goto L_0x0052;
                case 2: goto L_0x004a;
                case 3: goto L_0x0046;
                case 4: goto L_0x0042;
                case 5: goto L_0x003e;
                case 6: goto L_0x003e;
                case 7: goto L_0x003e;
                case 8: goto L_0x003a;
                case 9: goto L_0x0036;
                case 10: goto L_0x0032;
                case 11: goto L_0x0032;
                case 12: goto L_0x003a;
                case 13: goto L_0x0032;
                case 14: goto L_0x0032;
                case 15: goto L_0x0032;
                case 16: goto L_0x0032;
                case 17: goto L_0x0032;
                case 18: goto L_0x000d;
                case 19: goto L_0x002e;
                case 20: goto L_0x0046;
                case 21: goto L_0x002a;
                case 22: goto L_0x000d;
                case 23: goto L_0x0026;
                case 24: goto L_0x003e;
                case 25: goto L_0x000d;
                case 26: goto L_0x000d;
                case 27: goto L_0x000d;
                case 28: goto L_0x0022;
                case 29: goto L_0x001e;
                case 30: goto L_0x000d;
                case 31: goto L_0x001a;
                case 32: goto L_0x000d;
                case 33: goto L_0x0016;
                case 34: goto L_0x0012;
                case 35: goto L_0x000e;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r0 = "Unknown error"
            X.C18740tg.A0D(r7, r0)
        L_0x000d:
            return r1
        L_0x000e:
            r0 = 2131889429(0x7f120d15, float:1.9413521E38)
            goto L_0x004d
        L_0x0012:
            r0 = 2131888505(0x7f120979, float:1.9411647E38)
            goto L_0x004d
        L_0x0016:
            r0 = 2131895809(0x7f122601, float:1.9426461E38)
            goto L_0x004d
        L_0x001a:
            r0 = 2131893843(0x7f121e53, float:1.9422474E38)
            goto L_0x004d
        L_0x001e:
            r0 = 2131893522(0x7f121d12, float:1.9421823E38)
            goto L_0x004d
        L_0x0022:
            r0 = 2131893553(0x7f121d31, float:1.9421886E38)
            goto L_0x004d
        L_0x0026:
            r0 = 2131895149(0x7f12236d, float:1.9425123E38)
            goto L_0x004d
        L_0x002a:
            r0 = 2131887467(0x7f12056b, float:1.9409542E38)
            goto L_0x004d
        L_0x002e:
            r0 = 2131887334(0x7f1204e6, float:1.9409272E38)
            goto L_0x004d
        L_0x0032:
            r0 = 2131895881(0x7f122649, float:1.9426608E38)
            goto L_0x004d
        L_0x0036:
            r0 = 2131895940(0x7f122684, float:1.9426727E38)
            goto L_0x004d
        L_0x003a:
            r0 = 2131895936(0x7f122680, float:1.942672E38)
            goto L_0x004d
        L_0x003e:
            r0 = 2131895943(0x7f122687, float:1.9426733E38)
            goto L_0x004d
        L_0x0042:
            r0 = 2131895968(0x7f1226a0, float:1.9426784E38)
            goto L_0x004d
        L_0x0046:
            r0 = 2131895975(0x7f1226a7, float:1.9426798E38)
            goto L_0x004d
        L_0x004a:
            r0 = 2131895922(0x7f122672, float:1.942669E38)
        L_0x004d:
            java.lang.String r0 = r9.A0n(r0)
            return r0
        L_0x0052:
            java.util.ArrayList r8 = r9.A05
            int r1 = r8.size()
            r0 = 3
            r6 = 1
            X.0ts r5 = r9.A01
            if (r1 > r0) goto L_0x0073
            r4 = 2131755420(0x7f10019c, float:1.9141719E38)
            int r0 = r8.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r9.A09(r8)
            r1[r7] = r0
            java.lang.String r0 = r5.A0L(r1, r4, r2)
            return r0
        L_0x0073:
            r4 = 2131755419(0x7f10019b, float:1.9141717E38)
            int r0 = r8.size()
            int r0 = r0 - r6
            long r1 = (long) r0
            java.lang.Object[] r3 = X.AnonymousClass001.A0M()
            java.util.List r0 = r8.subList(r7, r6)
            java.lang.String r0 = r9.A09(r0)
            r3[r7] = r0
            java.util.ArrayList r0 = r9.A05
            int r0 = r0.size()
            int r0 = r0 - r6
            X.AnonymousClass000.A1L(r3, r0, r6)
            java.lang.String r0 = r5.A0L(r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A08():java.lang.String");
    }

    public static VoipErrorDialogFragment A03(Bundle bundle, AnonymousClass3FU r3, int i) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putAll(bundle);
        A07.putInt("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A17(A07);
        voipErrorDialogFragment.A02 = r3;
        return voipErrorDialogFragment;
    }

    public static VoipErrorDialogFragment A05(AnonymousClass3FU r2, int i) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A17(A07);
        voipErrorDialogFragment.A02 = r2;
        return voipErrorDialogFragment;
    }

    private String A09(List list) {
        ArrayList A0r = C36361kB.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(C36381kD.A0v(this.A04, this.A03.A0D(C36401kF.A0a(it))));
        }
        if (A0r.size() <= 3) {
            return C55782vB.A00(this.A04.A02, A0r, true);
        }
        int size = A0r.size() - 1;
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = A0r.get(0);
        AnonymousClass000.A1L(A0M, size, 1);
        return this.A01.A0L(A0M, R.plurals.f10nameremoved, (long) size);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("error");
            this.A05 = bundle2.getParcelableArrayList("user_jids");
            this.A06 = bundle2.getInt("call_size");
        }
        if (this.A05 == null) {
            this.A05 = AnonymousClass001.A0I();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.A08()
            java.lang.String r1 = r5.A07()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r0 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            X.C18740tg.A0B(r0)
            X.1qm r4 = X.AnonymousClass3LW.A05(r5)
            java.lang.String r0 = r5.A08()
            r4.A0q(r0)
            java.lang.String r0 = r5.A07()
            r4.A0p(r0)
            r4.A0r(r2)
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x003a;
                case 2: goto L_0x003a;
                case 3: goto L_0x003a;
                case 4: goto L_0x003a;
                case 5: goto L_0x007e;
                case 6: goto L_0x003a;
                case 7: goto L_0x003a;
                case 8: goto L_0x003a;
                case 9: goto L_0x003a;
                case 10: goto L_0x003a;
                case 11: goto L_0x003a;
                case 12: goto L_0x003a;
                case 13: goto L_0x003a;
                case 14: goto L_0x003a;
                case 15: goto L_0x003a;
                case 16: goto L_0x003a;
                case 17: goto L_0x003a;
                case 18: goto L_0x003a;
                case 19: goto L_0x0084;
                case 20: goto L_0x0084;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.String r0 = "Unknown error"
            X.C18740tg.A0D(r3, r0)
        L_0x003a:
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x0064;
                case 2: goto L_0x0064;
                case 3: goto L_0x0064;
                case 4: goto L_0x0064;
                case 5: goto L_0x006a;
                case 6: goto L_0x0064;
                case 7: goto L_0x0064;
                case 8: goto L_0x0064;
                case 9: goto L_0x0064;
                case 10: goto L_0x0064;
                case 11: goto L_0x0070;
                case 12: goto L_0x0064;
                case 13: goto L_0x0064;
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0064;
                case 17: goto L_0x0064;
                case 18: goto L_0x0064;
                case 19: goto L_0x006a;
                case 20: goto L_0x006a;
                case 21: goto L_0x0070;
                case 22: goto L_0x0070;
                case 23: goto L_0x0070;
                case 24: goto L_0x0070;
                case 25: goto L_0x0064;
                case 26: goto L_0x0070;
                case 27: goto L_0x0064;
                case 28: goto L_0x0064;
                case 29: goto L_0x0064;
                case 30: goto L_0x0064;
                case 31: goto L_0x0064;
                case 32: goto L_0x0064;
                case 33: goto L_0x0064;
                case 34: goto L_0x0064;
                case 35: goto L_0x0064;
                default: goto L_0x003f;
            }
        L_0x003f:
            java.lang.String r0 = "Unknown error"
            X.C18740tg.A0D(r3, r0)
        L_0x0044:
            android.os.Bundle r1 = r5.A0A
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "finish"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x005a
            r3 = 1
            r1 = 5
            X.4ZV r0 = new X.4ZV
            r0.<init>(r5, r1)
            r4.A0W(r0)
        L_0x005a:
            X.0FM r1 = r4.create()
            r0 = r3 ^ 1
            r1.setCanceledOnTouchOutside(r0)
            return r1
        L_0x0064:
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 16
            goto L_0x0075
        L_0x006a:
            r2 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 17
            goto L_0x0075
        L_0x0070:
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 18
        L_0x0075:
            X.4XQ r0 = new X.4XQ
            r0.<init>(r5, r1)
            r4.setNegativeButton(r2, r0)
            goto L_0x0044
        L_0x007e:
            r1 = 2131895929(0x7f122679, float:1.9426705E38)
            r0 = 19
            goto L_0x0089
        L_0x0084:
            r1 = 2131887359(0x7f1204ff, float:1.9409323E38)
            r0 = 20
        L_0x0089:
            X.AnonymousClass4XQ.A00(r4, r5, r0, r1)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }
}

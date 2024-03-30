package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass11F;
import X.AnonymousClass15P;
import X.AnonymousClass16D;
import X.AnonymousClass16E;
import X.AnonymousClass16I;
import X.AnonymousClass190;
import X.AnonymousClass1C4;
import X.AnonymousClass1CM;
import X.AnonymousClass1DL;
import X.AnonymousClass1DO;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1EZ;
import X.AnonymousClass1JZ;
import X.AnonymousClass1MI;
import X.AnonymousClass1NG;
import X.AnonymousClass1P5;
import X.AnonymousClass1T5;
import X.AnonymousClass1UM;
import X.AnonymousClass1YV;
import X.AnonymousClass2aR;
import X.AnonymousClass2aS;
import X.AnonymousClass2aT;
import X.AnonymousClass2aU;
import X.AnonymousClass2aV;
import X.AnonymousClass2df;
import X.AnonymousClass30R;
import X.AnonymousClass34Z;
import X.AnonymousClass35H;
import X.AnonymousClass38X;
import X.AnonymousClass3PI;
import X.AnonymousClass3PJ;
import X.AnonymousClass3Y8;
import X.AnonymousClass4P2;
import X.AnonymousClass4TK;
import X.AnonymousClass4W3;
import X.C012005e;
import X.C03570Gk;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19550w8;
import X.C196129Xv;
import X.C19970wo;
import X.C19980wp;
import X.C21010yW;
import X.C226815j;
import X.C235518x;
import X.C235618y;
import X.C235718z;
import X.C27111My;
import X.C27251Nm;
import X.C27341Nv;
import X.C27371Ny;
import X.C28781Ua;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C54262sf;
import X.C68803cU;
import X.C81163wZ;
import X.C89364Wg;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SettingsPrivacy extends AnonymousClass2df implements AnonymousClass15P {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public ProgressBar A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public TextView A0Q;
    public SwitchCompat A0R;
    public SwitchCompat A0S;
    public C27341Nv A0T;
    public AnonymousClass1NG A0U;
    public C235718z A0V;
    public AnonymousClass16I A0W;
    public C235618y A0X;
    public C19980wp A0Y;
    public AnonymousClass34Z A0Z;
    public AnonymousClass16E A0a;
    public AnonymousClass1DO A0b;
    public AnonymousClass1T5 A0c;
    public C27371Ny A0d;
    public C235518x A0e;
    public C21010yW A0f;
    public AnonymousClass190 A0g;
    public C27251Nm A0h;
    public AnonymousClass1P5 A0i;
    public AnonymousClass1CM A0j;
    public AnonymousClass1DL A0k;
    public AnonymousClass1C4 A0l;
    public AnonymousClass1EZ A0m;
    public AnonymousClass1EV A0n;
    public AnonymousClass1EU A0o;
    public AnonymousClass1YV A0p;
    public AnonymousClass2aR A0q;
    public AnonymousClass2aS A0r;
    public AnonymousClass2aT A0s;
    public AnonymousClass2aU A0t;
    public AnonymousClass2aV A0u;
    public AnonymousClass35H A0v;
    public SettingsPrivacyCameraEffectsViewModel A0w;
    public SettingsRowPrivacyLinearLayout A0x;
    public AnonymousClass3PI A0y;
    public AnonymousClass3PJ A0z;
    public AnonymousClass1UM A10;
    public C28781Ua A11;
    public AnonymousClass005 A12;
    public String A13;
    public boolean A14;
    public final AnonymousClass4P2 A15;
    public final C226815j A16;
    public final Map A17;
    public final Set A18;
    public final AnonymousClass4TK A19;
    public volatile boolean A1A;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0K(java.lang.String r11) {
        /*
            r10 = this;
            r4 = r10
            r7 = r11
            android.widget.TextView r0 = r10.A07(r11)
            if (r0 == 0) goto L_0x0055
            int r0 = r11.hashCode()
            switch(r0) {
                case -892481550: goto L_0x0056;
                case -309425751: goto L_0x0061;
                case 3314326: goto L_0x006c;
                case 506363330: goto L_0x0077;
                case 1531715286: goto L_0x0082;
                default: goto L_0x000f;
            }
        L_0x000f:
            r5 = 0
        L_0x0010:
            X.1Nv r0 = r10.A0T
            int r9 = r0.A00(r11)
            r0 = 3
            r3 = 0
            if (r9 == r0) goto L_0x001d
            r0 = 6
            if (r9 != r0) goto L_0x008d
        L_0x001d:
            if (r5 == 0) goto L_0x008d
            X.005 r0 = r10.A12
            java.lang.Object r0 = r0.get()
            X.33H r0 = (X.AnonymousClass33H) r0
            java.util.Map r8 = r0.A00
            boolean r0 = r8.containsKey(r11)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = X.C36431kI.A1A(r11, r8)
            if (r0 == 0) goto L_0x0038
            A0J(r10, r11, r0)
        L_0x0038:
            X.2jJ r3 = new X.2jJ
            r6 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.1Rs r2 = r5.A01()
            X.00t r0 = r2.A02
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x004b
            r2.A07(r10)
        L_0x004b:
            r1 = 8
            X.3UX r0 = new X.3UX
            r0.<init>(r3, r10, r2, r1)
            r2.A08(r10, r0)
        L_0x0055:
            return
        L_0x0056:
            java.lang.String r0 = "status"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.2aR r5 = r10.A0q
            goto L_0x0010
        L_0x0061:
            java.lang.String r0 = "profile"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.2aU r5 = r10.A0t
            goto L_0x0010
        L_0x006c:
            java.lang.String r0 = "last"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.2aT r5 = r10.A0s
            goto L_0x0010
        L_0x0077:
            java.lang.String r0 = "groupadd"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.2aS r5 = r10.A0r
            goto L_0x0010
        L_0x0082:
            java.lang.String r0 = "stickers"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.2aV r5 = r10.A0u
            goto L_0x0010
        L_0x008d:
            int[] r2 = X.AnonymousClass3TL.A00
            r0 = 3
            if (r9 >= r0) goto L_0x009c
            r0 = r2[r9]
            java.lang.String r0 = r10.getString(r0)
            A0J(r10, r11, r0)
            return
        L_0x009c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Received privacy value "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " with no available single-setting text"
            X.C36341k9.A1O(r1, r0)
            r0 = r2[r3]
            java.lang.String r0 = r10.getString(r0)
            A0J(r10, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.A0K(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r2 = X.AnonymousClass3TL.A02(r3, java.lang.Math.max(0, r6));
        X.AnonymousClass1YV.A02(r4.A0p, true);
        r4.A0T.A04(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("Unrecognized preference: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw X.AnonymousClass000.A0c(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgm(int r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            if (r5 == r0) goto L_0x0089
            r0 = 3
            if (r5 != r0) goto L_0x008d
            java.lang.String r1 = "privacy_status"
        L_0x0008:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1977700443: goto L_0x001d;
                case -1926138227: goto L_0x0028;
                case -1643403859: goto L_0x0033;
                case -1038662714: goto L_0x003e;
                case -385074228: goto L_0x0049;
                case 897320682: goto L_0x0054;
                case 1017061513: goto L_0x005f;
                case 1626211481: goto L_0x006a;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unrecognized preference: "
            r2.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r1, r2)
            throw r0
        L_0x001d:
            java.lang.String r0 = "privacy_profile_photo"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "profile"
            goto L_0x0074
        L_0x0028:
            java.lang.String r0 = "privacy_last_seen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "last"
            goto L_0x0074
        L_0x0033:
            java.lang.String r0 = "privacy_stickers"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "stickers"
            goto L_0x0074
        L_0x003e:
            java.lang.String r0 = "read_receipts_enabled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "readreceipts"
            goto L_0x0074
        L_0x0049:
            java.lang.String r0 = "privacy_calladd"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "calladd"
            goto L_0x0074
        L_0x0054:
            java.lang.String r0 = "privacy_online"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "online"
            goto L_0x0074
        L_0x005f:
            java.lang.String r0 = "privacy_status"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "status"
            goto L_0x0074
        L_0x006a:
            java.lang.String r0 = "privacy_groupadd"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "groupadd"
        L_0x0074:
            r0 = 0
            int r0 = java.lang.Math.max(r0, r6)
            java.lang.String r2 = X.AnonymousClass3TL.A02(r3, r0)
            X.1YV r1 = r4.A0p
            r0 = 1
            X.AnonymousClass1YV.A02(r1, r0)
            X.1Nv r0 = r4.A0T
            r0.A04(r3, r2)
            return
        L_0x0089:
            java.lang.String r1 = "privacy_profile_photo"
            goto L_0x0008
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.Bgm(int, int):void");
    }

    private View A01() {
        View view = this.A0C;
        if (view != null) {
            return view;
        }
        ViewStub viewStub = (ViewStub) findViewById(R.id.privacy_carrot_entry_stub);
        viewStub.setInflatedId(R.id.privacy_carrot_entry);
        boolean A002 = AnonymousClass1MI.A00(this.A0D);
        int i = R.layout.f9nameremoved;
        if (A002) {
            i = R.layout.f9nameremoved;
        }
        View A0E2 = C36401kF.A0E(viewStub, i);
        this.A0C = A0E2;
        return A0E2;
    }

    private String A0F(long j) {
        C18820ts r5;
        int i;
        long j2;
        Object[] objArr;
        int i2;
        if (j != 0) {
            if (j == 60000) {
                r5 = this.A00;
                i = R.plurals.f10nameremoved;
                j2 = 1;
                objArr = new Object[1];
                i2 = 1;
            } else if (j == 1800000) {
                r5 = this.A00;
                i = R.plurals.f10nameremoved;
                j2 = 30;
                objArr = new Object[1];
                i2 = 30;
            }
            objArr[0] = i2;
            return r5.A0L(objArr, i, j2);
        }
        return getString(R.string.f12nameremoved);
    }

    public static void A0G(SettingsPrivacy settingsPrivacy) {
        String str;
        int i;
        C196129Xv BAH;
        boolean A1P;
        int size;
        if (!settingsPrivacy.A0U.A0M() || !settingsPrivacy.A0U.A0M.get()) {
            i = R.string.f12nameremoved;
        } else {
            int size2 = settingsPrivacy.A18.size();
            if (settingsPrivacy.A0n.A03() && settingsPrivacy.A0m.A0F() && (BAH = settingsPrivacy.A0o.A05().BAH()) != null) {
                synchronized (BAH) {
                    A1P = AnonymousClass000.A1P((BAH.A00 > -1 ? 1 : (BAH.A00 == -1 ? 0 : -1)));
                }
                if (A1P) {
                    synchronized (BAH) {
                        size = BAH.A09.size();
                    }
                    size2 += size;
                }
            }
            if (size2 > 0) {
                str = String.valueOf(size2);
                settingsPrivacy.A0L.setText(str);
            }
            i = R.string.f12nameremoved;
        }
        str = settingsPrivacy.getString(i);
        settingsPrivacy.A0L.setText(str);
    }

    public static void A0H(SettingsPrivacy settingsPrivacy) {
        ArrayList A142;
        String string;
        AnonymousClass1P5 r9 = settingsPrivacy.A0i;
        synchronized (r9.A0R) {
            Map A062 = AnonymousClass1P5.A06(r9);
            A142 = C36441kJ.A14(A062.size());
            long A002 = C19970wo.A00(r9.A0D);
            Iterator A0z2 = AnonymousClass000.A0z(A062);
            while (A0z2.hasNext()) {
                AnonymousClass38X r5 = (AnonymousClass38X) A0z2.next();
                if (AnonymousClass1P5.A0G(r5.A01, A002)) {
                    AnonymousClass16D r3 = r9.A0A;
                    AnonymousClass11F r0 = r5.A02.A00;
                    C18740tg.A06(r0);
                    A142.add(r3.A08(r0));
                }
            }
        }
        if (A142.size() > 0) {
            C18820ts r6 = settingsPrivacy.A00;
            long size = (long) A142.size();
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L2, A142.size(), 0);
            string = r6.A0L(A0L2, R.plurals.f10nameremoved, size);
        } else {
            string = settingsPrivacy.getString(R.string.f12nameremoved);
        }
        TextView textView = settingsPrivacy.A0O;
        if (textView != null) {
            textView.setText(string);
        }
    }

    public void A2F() {
        if (!this.A14) {
            this.A14 = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r3 = r1.A00;
            C36321k7.A0X(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A0g = C36351kA.A0h(r1);
            this.A0f = C36351kA.A0g(r1);
            this.A0l = C36421kH.A0Q(r1);
            this.A0a = C36391kE.A0e(r1);
            this.A0k = (AnonymousClass1DL) r1.A7C.get();
            this.A0V = C36391kE.A0Z(r1);
            this.A0o = C36381kD.A0f(r1);
            this.A0U = C36381kD.A0V(r1);
            this.A0W = C36351kA.A0S(r1);
            this.A0X = C36401kF.A0U(r1);
            this.A0p = (AnonymousClass1YV) r1.A5S.get();
            this.A0j = (AnonymousClass1CM) r1.AWX.get();
            this.A0m = (AnonymousClass1EZ) r1.A65.get();
            this.A0q = C27111My.A31(A0L2);
            this.A0n = C36371kC.A0h(r1);
            this.A0T = C36411kG.A0X(r1);
            this.A0i = C36411kG.A0l(r1);
            this.A0Z = (AnonymousClass34Z) r3.A3H.get();
            this.A0h = (C27251Nm) r1.A4J.get();
            this.A12 = C18840tu.A00(r3.A6B);
            this.A0d = (C27371Ny) r1.A2o.get();
            this.A0u = C27111My.A34(A0L2);
            this.A0r = (AnonymousClass2aS) r3.A8n.get();
            this.A0s = C27111My.A32(A0L2);
            this.A0c = (AnonymousClass1T5) r1.AFv.get();
            this.A0t = C27111My.A33(A0L2);
            this.A0Y = (C19980wp) r1.A1x.get();
            this.A0b = (AnonymousClass1DO) r1.AdF.get();
            this.A0e = (C235518x) r1.A2p.get();
            this.A0v = (AnonymousClass35H) A0L2.A05.get();
            this.A10 = (AnonymousClass1UM) r1.A3S.get();
            this.A11 = C36391kE.A0p(r1);
            this.A0y = C27111My.A3F(A0L2);
            this.A0z = new AnonymousClass3PJ((C21010yW) r1.A79.get());
        }
    }

    public void A3i() {
        boolean A2L;
        C81163wZ.A00(this.A04, this, 35);
        A0K("groupadd");
        A0K("last");
        A0K("status");
        A0K("profile");
        AnonymousClass30R r4 = (AnonymousClass30R) this.A0T.A02.get("readreceipts");
        if (r4 != null) {
            A2L = "all".contentEquals(r4.A00);
        } else {
            A2L = this.A09.A2L();
        }
        int i = 0;
        this.A0x.setEnabled(AnonymousClass000.A1W(r4));
        ProgressBar progressBar = this.A0G;
        int i2 = 4;
        if (r4 != null) {
            i2 = 0;
        }
        progressBar.setVisibility(i2);
        SwitchCompat switchCompat = this.A0S;
        if (r4 != null) {
            i = 4;
        }
        switchCompat.setVisibility(i);
        if (r4 == null) {
            this.A0S.setChecked(A2L);
        }
        int i3 = R.string.f12nameremoved;
        if (A2L) {
            i3 = R.string.f12nameremoved;
        }
        if (C19550w8.A07()) {
            C012005e.A0Z(this.A0S, C36401kF.A0o(this, i3));
        }
        C27341Nv r0 = this.A0T;
        r0.A03.add(this.A15);
        A0K("stickers");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x016d, code lost:
        if (r9.A01.A01() == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0500, code lost:
        if (r3 > 180) goto L_0x041f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r11 = r20
            r0 = r21
            super.onCreate(r0)
            r0 = 2131897006(0x7f122aae, float:1.942889E38)
            r11.setTitle(r0)
            r0 = 2131625930(0x7f0e07ca, float:1.8879082E38)
            r11.setContentView((int) r0)
            X.C36321k7.A0O(r11)
            X.04H r1 = X.C36441kJ.A0b(r11)
            java.lang.Class<com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel> r0 = com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel.class
            X.04R r0 = r1.A00(r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = (com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel) r0
            r11.A0w = r0
            X.1hi r0 = r0.A05
            r6 = 7
            X.C65963Ud.A00(r11, r0, r6)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = r11.A0w
            X.1hi r0 = r0.A06
            r5 = 8
            X.C65963Ud.A00(r11, r0, r5)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = r11.A0w
            X.1Rs r1 = r0.A07
            r0 = 10
            X.C65963Ud.A00(r11, r1, r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = r11.A0w
            X.1Rs r0 = r0.A08
            r4 = 11
            X.C65963Ud.A00(r11, r0, r4)
            X.1Nv r0 = r11.A0T
            X.4P2 r1 = r11.A15
            java.util.Set r0 = r0.A03
            r0.add(r1)
            r0 = 2131431134(0x7f0b0ede, float:1.8483989E38)
            android.view.View r1 = X.C03570Gk.A0B(r11, r0)
            r11.A0A = r1
            r0 = 2131433986(0x7f0b1a02, float:1.8489773E38)
            r3 = 2131433986(0x7f0b1a02, float:1.8489773E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r1, r0)
            r0 = 2131894285(0x7f12200d, float:1.942337E38)
            r1.setText(r0)
            android.view.View r1 = r11.A0A
            r0 = 2131433985(0x7f0b1a01, float:1.8489771E38)
            r2 = 2131433985(0x7f0b1a01, float:1.8489771E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r1, r0)
            r11.A0N = r0
            java.util.Map r7 = r11.A17
            java.lang.String r1 = "last"
            java.lang.String r0 = "online"
            r7.put(r1, r0)
            r0 = 2131432986(0x7f0b161a, float:1.8487745E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A0D = r0
            android.widget.TextView r1 = X.C36391kE.A0O(r0, r3)
            r0 = 2131894248(0x7f121fe8, float:1.9423295E38)
            r1.setText(r0)
            android.view.View r0 = r11.A0D
            android.widget.TextView r0 = X.C36391kE.A0O(r0, r2)
            r11.A0P = r0
            r0 = 2131427358(0x7f0b001e, float:1.847633E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A01 = r0
            android.widget.TextView r7 = X.C36391kE.A0O(r0, r3)
            X.0yC r1 = r11.A0D
            r0 = 4921(0x1339, float:6.896E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 2131894246(0x7f121fe6, float:1.9423291E38)
            if (r1 == 0) goto L_0x00b6
            r0 = 2131894912(0x7f122280, float:1.9424642E38)
        L_0x00b6:
            r7.setText(r0)
            android.view.View r0 = r11.A01
            android.widget.TextView r0 = X.C36391kE.A0O(r0, r2)
            r11.A0I = r0
            r0 = 2131434292(0x7f0b1b34, float:1.8490394E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A0F = r0
            android.widget.TextView r1 = X.C36391kE.A0O(r0, r3)
            r0 = 2131894253(0x7f121fed, float:1.9423306E38)
            r1.setText(r0)
            android.view.View r0 = r11.A0F
            android.widget.TextView r0 = X.C36391kE.A0O(r0, r2)
            r11.A0Q = r0
            boolean r0 = X.C36421kH.A1V(r11)
            r8 = 8
            if (r0 == 0) goto L_0x0101
            X.0wp r0 = r11.A0Y
            android.content.SharedPreferences r1 = X.C19980wp.A00(r0)
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 == 0) goto L_0x00fc
            X.0yC r1 = r11.A0D
            r0 = 4905(0x1329, float:6.873E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0101
        L_0x00fc:
            android.view.View r0 = r11.A0F
            r0.setVisibility(r5)
        L_0x0101:
            r0 = 2131431271(0x7f0b0f67, float:1.8484266E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A0B = r0
            android.widget.TextView r1 = X.C36391kE.A0O(r0, r3)
            r0 = 2131894247(0x7f121fe7, float:1.9423293E38)
            r1.setText(r0)
            android.view.View r0 = r11.A0B
            android.widget.TextView r0 = X.C36391kE.A0O(r0, r2)
            r11.A0O = r0
            android.view.View r7 = r11.A0B
            boolean r0 = X.C36421kH.A1V(r11)
            r1 = 0
            int r0 = X.C36381kD.A00(r0)
            r7.setVisibility(r0)
            X.35H r0 = r11.A0v
            X.0yC r7 = r0.A00
            r0 = 5979(0x175b, float:8.378E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0174
            r0 = 2131427879(0x7f0b0227, float:1.8477387E38)
            android.view.View r7 = X.C03570Gk.A0B(r11, r0)
            r11.A03 = r7
            r0 = 16
            X.AnonymousClass3Y8.A00(r7, r11, r0)
            android.view.View r0 = r11.A03
            android.widget.TextView r7 = X.C36391kE.A0O(r0, r3)
            r0 = 2131896333(0x7f12280d, float:1.9427524E38)
            r7.setText(r0)
            android.view.View r0 = r11.A03
            android.widget.TextView r0 = X.C36391kE.A0O(r0, r2)
            r11.A0K = r0
            android.view.View r10 = r11.A03
            X.35H r9 = r11.A0v
            X.0yC r7 = r9.A00
            r0 = 5979(0x175b, float:8.378E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x016f
            X.1BF r0 = r9.A01
            boolean r7 = r0.A01()
            r0 = 0
            if (r7 != 0) goto L_0x0171
        L_0x016f:
            r0 = 8
        L_0x0171:
            r10.setVisibility(r0)
        L_0x0174:
            r0 = 2131428538(0x7f0b04ba, float:1.8478723E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A06 = r0
            r0 = 2131428539(0x7f0b04bb, float:1.8478725E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r11.A0R = r0
            android.view.View r10 = r11.A06
            r0 = 2131428540(0x7f0b04bc, float:1.8478727E38)
            android.widget.TextView r7 = X.C36391kE.A0O(r10, r0)
            r0 = 2131896387(0x7f122843, float:1.9427634E38)
            r7.setText(r0)
            r7 = 2131896386(0x7f122842, float:1.9427632E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            java.lang.String r9 = "learn-more"
            java.lang.String r18 = X.C36391kE.A0v(r11, r9, r0, r1, r7)
            r0 = 2131428537(0x7f0b04b9, float:1.8478721E38)
            com.whatsapp.TextEmojiLabel r15 = X.C36401kF.A0O(r10, r0)
            X.0yC r7 = r11.A0D
            X.17Y r14 = r11.A05
            X.1Dv r13 = r11.A01
            X.0yb r0 = r11.A08
            java.lang.String r10 = "https://faq.whatsapp.com/603175068451715/"
            android.net.Uri r12 = android.net.Uri.parse(r10)
            r16 = r0
            r17 = r7
            r19 = r9
            X.AnonymousClass6YV.A0E(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 2131429633(0x7f0b0901, float:1.8480944E38)
            android.view.View r7 = X.C03570Gk.A0B(r11, r0)
            r11.A08 = r7
            r0 = 2131429637(0x7f0b0905, float:1.8480952E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r7, r0)
            r11.A0H = r0
            android.view.View r7 = r11.A08
            X.1T5 r0 = r11.A0c
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x01df
            r8 = 0
        L_0x01df:
            r7.setVisibility(r8)
            r0 = 2131430614(0x7f0b0cd6, float:1.8482934E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A09 = r0
            android.widget.TextView r7 = X.C36391kE.A0O(r0, r3)
            r0 = 2131894243(0x7f121fe3, float:1.9423285E38)
            r7.setText(r0)
            android.view.View r0 = r11.A09
            android.widget.TextView r0 = X.C36391kE.A0O(r0, r2)
            r11.A0M = r0
            r0 = 2131428062(0x7f0b02de, float:1.8477758E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A04 = r0
            android.widget.TextView r7 = X.C36391kE.A0O(r0, r3)
            r0 = 2131886904(0x7f120338, float:1.94084E38)
            r7.setText(r0)
            android.view.View r0 = r11.A04
            android.widget.TextView r0 = X.C36391kE.A0O(r0, r2)
            r11.A0L = r0
            X.0wU r7 = r11.A04
            r0 = 34
            X.C81163wZ.A00(r7, r11, r0)
            r0 = 2131433172(0x7f0b16d4, float:1.8488122E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            com.whatsapp.settings.SettingsRowPrivacyLinearLayout r0 = (com.whatsapp.settings.SettingsRowPrivacyLinearLayout) r0
            r11.A0x = r0
            r0 = 2131433173(0x7f0b16d5, float:1.8488124E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r11.A0S = r0
            r0 = 2131433174(0x7f0b16d6, float:1.8488126E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r11.A0G = r0
            r0 = 2131433171(0x7f0b16d3, float:1.848812E38)
            X.C03570Gk.A0B(r11, r0)
            r0 = 2131433736(0x7f0b1908, float:1.8489266E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A0E = r0
            android.widget.TextView r8 = X.C36391kE.A0O(r0, r3)
            X.18U r0 = r11.A05
            X.0yC r0 = r0.A03
            r9 = 266(0x10a, float:3.73E-43)
            boolean r7 = r0.A0E(r9)
            r0 = 2131894252(0x7f121fec, float:1.9423304E38)
            if (r7 == 0) goto L_0x0265
            r0 = 2131894251(0x7f121feb, float:1.9423301E38)
        L_0x0265:
            r8.setText(r0)
            android.view.View r0 = r11.A0E
            android.widget.TextView r8 = X.C36391kE.A0O(r0, r2)
            r11.A0J = r8
            X.18U r0 = r11.A05
            X.0yC r0 = r0.A03
            boolean r7 = r0.A0E(r9)
            r0 = 2131894252(0x7f121fec, float:1.9423304E38)
            if (r7 == 0) goto L_0x0280
            r0 = 2131894251(0x7f121feb, float:1.9423301E38)
        L_0x0280:
            r8.setText(r0)
            X.18z r0 = r11.A0V
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x02a3
            r0 = 2131428782(0x7f0b05ae, float:1.8479218E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A07 = r0
            r0.setVisibility(r1)
            android.view.View r0 = r11.A07
            android.widget.TextView r1 = X.C36391kE.A0O(r0, r3)
            r0 = 2131887758(0x7f12068e, float:1.9410132E38)
            r1.setText(r0)
        L_0x02a3:
            r0 = 2131428517(0x7f0b04a5, float:1.847868E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A05 = r0
            android.widget.TextView r1 = X.C36391kE.A0O(r0, r3)
            r0 = 2131896383(0x7f12283f, float:1.9427626E38)
            r1.setText(r0)
            android.view.View r0 = r11.A05
            android.widget.TextView r1 = X.C36391kE.A0O(r0, r2)
            r0 = 2131897013(0x7f122ab5, float:1.9428903E38)
            r1.setText(r0)
            r0 = 2131427660(0x7f0b014c, float:1.8476943E38)
            android.view.View r0 = X.C03570Gk.A0B(r11, r0)
            r11.A02 = r0
            android.widget.TextView r1 = X.C36391kE.A0O(r0, r3)
            r0 = 2131896293(0x7f1227e5, float:1.9427443E38)
            r1.setText(r0)
            android.view.View r0 = r11.A02
            android.widget.TextView r1 = X.C36391kE.A0O(r0, r2)
            r0 = 2131896382(0x7f12283e, float:1.9427624E38)
            r1.setText(r0)
            r11.A3i()
            android.content.Intent r2 = r11.getIntent()
            java.lang.String r1 = "entry_point"
            r0 = -1
            int r0 = r2.getIntExtra(r1, r0)
            r11.A00 = r0
            android.view.View r1 = r11.A0A
            r0 = 12
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            android.view.View r1 = r11.A0D
            r0 = 18
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            android.view.View r1 = r11.A01
            r0 = 22
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            android.view.View r1 = r11.A0F
            r0 = 23
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            android.view.View r1 = r11.A0B
            r0 = 24
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            X.18z r0 = r11.A0V
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x0325
            android.view.View r1 = r11.A07
            if (r1 == 0) goto L_0x0325
            r0 = 25
            X.AnonymousClass3Y8.A00(r1, r11, r0)
        L_0x0325:
            android.view.View r1 = r11.A06
            r0 = 26
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            android.view.View r1 = r11.A05
            r0 = 13
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            android.view.View r1 = r11.A02
            r0 = 14
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            android.view.View r1 = r11.A09
            r0 = 15
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            X.1T5 r0 = r11.A0c
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0399
            android.view.View r1 = r11.A08
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r11.A08
            r0 = 19
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            android.view.View r7 = r11.A08
            X.18x r0 = r11.A0e
            int r1 = X.C36431kI.A05(r0)
            r3 = 0
            r0 = 1
            java.lang.String r1 = X.AnonymousClass3TD.A01(r11, r1, r3, r0)
            android.widget.TextView r0 = r11.A0H
            r0.setText(r1)
            X.1Ny r0 = r11.A0d
            X.18x r0 = r0.A04
            X.00s r1 = r0.A00
            r0 = 9
            X.C65963Ud.A00(r11, r1, r0)
            r0 = 2131429634(0x7f0b0902, float:1.8480946E38)
            android.view.View r2 = X.C012005e.A02(r7, r0)
            r0 = 2131429636(0x7f0b0904, float:1.848095E38)
            X.C012005e.A02(r7, r0)
            r0 = 2131429635(0x7f0b0903, float:1.8480948E38)
            X.C012005e.A02(r7, r0)
            r0 = 2131429631(0x7f0b08ff, float:1.848094E38)
            android.view.View r1 = X.C03570Gk.A0B(r11, r0)
            r2.setVisibility(r3)
            android.widget.TextView r0 = r11.A0H
            r0.setVisibility(r3)
            r1.setVisibility(r3)
        L_0x0399:
            android.view.View r1 = r11.A04
            r0 = 20
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            com.whatsapp.settings.SettingsRowPrivacyLinearLayout r1 = r11.A0x
            r0 = 21
            X.AnonymousClass3Y8.A00(r1, r11, r0)
            X.0v0 r2 = r11.A09
            X.0wo r1 = r11.A07
            X.0yC r0 = r11.A0D
            X.37P r8 = new X.37P
            r8.<init>(r1, r2, r0)
            X.0v0 r7 = r8.A00
            java.lang.String r1 = "privacy_checkup_banner_last_seen_timestamp"
            long r2 = r7.A0V(r1)
            r9 = -1
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x04ec
            r7.A1Z(r1)
        L_0x03c3:
            X.005 r2 = r7.A00
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "privacy_checkup_banner_dismiss"
            int r1 = X.C36371kC.A01(r1, r0)
            r0 = 3
            if (r1 >= r0) goto L_0x041f
            X.0yC r1 = r8.A01
            r0 = 3815(0xee7, float:5.346E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x041f
            android.content.SharedPreferences r2 = X.C36391kE.A0H(r2)
            java.lang.String r1 = "privacy_checkup_banner_max_cool_off_days"
            r0 = -1
            r2.getInt(r1, r0)
            long r0 = (long) r6
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r2
            java.lang.String r2 = "privacy_checkup_banner_cool_off_timestamp"
            boolean r0 = r7.A2V(r2, r0)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x041f
            X.3PJ r1 = r11.A0z
            r0 = 1
            r1.A01(r0)
            X.3YC r3 = new X.3YC
            r3.<init>(r11, r8, r4)
            r0 = 12
            X.3YC r4 = new X.3YC
            r4.<init>(r11, r8, r0)
            android.view.View r6 = r11.A01()
            boolean r0 = r6 instanceof com.whatsapp.settings.SettingsRowBanner
            if (r0 == 0) goto L_0x04b0
            com.whatsapp.settings.SettingsRowBanner r6 = (com.whatsapp.settings.SettingsRowBanner) r6
            r0 = 2131232467(0x7f0806d3, float:1.8081044E38)
            r6.setIcon(r0)
            r6.setOnClickListener(r4)
            r6.setOnCloseClickListener(r3)
        L_0x041f:
            X.1Nv r1 = r11.A0T
            r0 = 0
            r1.A01(r0)
            X.1Ny r0 = r11.A0d
            r0.A00()
            X.16I r1 = r11.A0W
            X.15j r0 = r11.A16
            r1.registerObserver(r0)
            X.1P5 r1 = r11.A0i
            X.4TK r0 = r11.A19
            r1.A0Z(r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "target_setting"
            java.lang.String r1 = r1.getStringExtra(r0)
            java.lang.String r0 = "read_receipts_enabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x045d
            com.whatsapp.settings.SettingsRowPrivacyLinearLayout r0 = r11.A0x
            r0.A00()
            android.view.View r0 = r11.A0C
            if (r0 == 0) goto L_0x045d
            android.view.View r0 = r11.A01()
            r0.setVisibility(r5)
            A0I(r11)
        L_0x045d:
            java.lang.String r0 = "privacy_groupadd"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x047d
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAddPrivacyActivity"
            r2.setClassName(r1, r0)
            r0 = 2
        L_0x0473:
            r11.startActivityForResult(r2, r0)
        L_0x0476:
            java.lang.String r0 = X.C36381kD.A0q(r11)
            r11.A13 = r0
            return
        L_0x047d:
            java.lang.String r0 = "privacy_profile_photo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0491
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoPrivacyActivity"
            android.content.Intent r2 = r1.setClassName(r11, r0)
            r0 = 6
            goto L_0x0473
        L_0x0491:
            java.lang.String r0 = "privacy_checkup"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0476
            r3 = 5
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "com.whatsapp.privacy.checkup.PrivacyCheckupHomeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "ENTRY_POINT"
            r2.putExtra(r0, r3)
            r11.startActivity(r2)
            goto L_0x0476
        L_0x04b0:
            boolean r0 = r6 instanceof com.whatsapp.wds.components.banners.WDSBanner
            if (r0 == 0) goto L_0x041f
            com.whatsapp.wds.components.banners.WDSBanner r6 = (com.whatsapp.wds.components.banners.WDSBanner) r6
            X.3Eo r2 = new X.3Eo
            r2.<init>()
            r0 = 2131232467(0x7f0806d3, float:1.8081044E38)
            X.2lX r1 = new X.2lX
            r1.<init>(r0)
            X.2lR r0 = new X.2lR
            r0.<init>(r1)
            r2.A02 = r0
            r0 = 2131893197(0x7f121bcd, float:1.9421164E38)
            r2.A01 = r0
            r0 = 2131893196(0x7f121bcc, float:1.9421162E38)
            android.text.Spanned r0 = X.C63953Mb.A00(r11, r0)
            X.C62053Eo.A00(r6, r2, r0)
            boolean r0 = X.C222013h.A05
            if (r0 != 0) goto L_0x04e8
            r6.A07()
        L_0x04e0:
            r6.setOnClickListener(r4)
            r6.setOnDismissListener((android.view.View.OnClickListener) r3)
            goto L_0x041f
        L_0x04e8:
            r6.A06()
            goto L_0x04e0
        L_0x04ec:
            long r0 = java.lang.System.currentTimeMillis()
            int r3 = X.AnonymousClass6XI.A00(r0, r2)
            android.content.SharedPreferences r2 = X.C36341k9.A0E(r7)
            java.lang.String r1 = "privacy_checkup_banner_max_display_days"
            r0 = -1
            r2.getInt(r1, r0)
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 <= r0) goto L_0x03c3
            goto L_0x041f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.onCreate(android.os.Bundle):void");
    }

    public SettingsPrivacy(int i) {
        this.A14 = false;
        C89364Wg.A00(this, 28);
    }

    private TextView A07(String str) {
        switch (str.hashCode()) {
            case -892481550:
                if (str.equals("status")) {
                    return this.A0I;
                }
                return null;
            case -309425751:
                if (str.equals("profile")) {
                    return this.A0P;
                }
                return null;
            case 3314326:
                if (str.equals("last")) {
                    return this.A0N;
                }
                return null;
            case 506363330:
                if (str.equals("groupadd")) {
                    return this.A0M;
                }
                return null;
            case 1531715286:
                if (str.equals("stickers")) {
                    return this.A0K;
                }
                return null;
            default:
                return null;
        }
    }

    public static void A0I(SettingsPrivacy settingsPrivacy) {
        int A052 = C36441kJ.A05(settingsPrivacy.getResources(), R.dimen.f7nameremoved);
        View A0B2 = C03570Gk.A0B(settingsPrivacy, R.id.content);
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(A0B2);
        AnonymousClass1JZ.A06(A0B2, settingsPrivacy.A00, A0a2.leftMargin, A052, A0a2.rightMargin, A0a2.bottomMargin);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0J(com.whatsapp.settings.SettingsPrivacy r4, java.lang.String r5, java.lang.String r6) {
        /*
            android.widget.TextView r3 = r4.A07(r5)
            if (r3 != 0) goto L_0x0018
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Tried to put text for privacy category "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " with no subtitle text view"
            X.C36321k7.A1a(r1, r0)
            return
        L_0x0018:
            java.util.Map r0 = r4.A17
            java.lang.String r1 = X.C36431kI.A1A(r5, r0)
            if (r1 == 0) goto L_0x0049
            X.1Nv r0 = r4.A0T
            int r2 = r0.A00(r1)
            if (r2 < 0) goto L_0x0047
            int[] r1 = X.AnonymousClass3TL.A00
            r0 = 3
            if (r2 >= r0) goto L_0x0047
            r0 = r1[r2]
            java.lang.String r2 = r4.getString(r0)
        L_0x0033:
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L_0x0049
            r1 = 2131894240(0x7f121fe0, float:1.942328E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0M()
            X.C36331k8.A1N(r6, r2, r0)
            X.C36341k9.A0s(r4, r3, r0, r1)
            return
        L_0x0047:
            r2 = r6
            goto L_0x0033
        L_0x0049:
            r3.setText(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.A0J(com.whatsapp.settings.SettingsPrivacy, java.lang.String, java.lang.String):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            C81163wZ.A00(this.A04, this, 35);
        } else if (i == 2 || i == 6) {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1P5 r0 = this.A0i;
        r0.A0T.remove(this.A19);
        this.A0W.unregisterObserver(this.A16);
        C27341Nv r02 = this.A0T;
        r02.A03.remove(this.A15);
    }

    public void onRestart() {
        super.onRestart();
        this.A13 = null;
    }

    public void onResume() {
        String string;
        super.onResume();
        if (!this.A1A) {
            A0G(this);
        }
        A0H(this);
        boolean A052 = this.A05.A05();
        View view = this.A0E;
        if (A052) {
            view.setVisibility(0);
            if (this.A09.A2K()) {
                string = A0F(this.A09.A0P());
            } else {
                string = getString(R.string.f12nameremoved);
            }
            this.A0J.setText(string);
            AnonymousClass3Y8.A00(this.A0E, this, 17);
        } else {
            view.setVisibility(8);
        }
        A3i();
        this.A0y.A02(this.A00, "privacy", this.A13);
        SettingsPrivacyCameraEffectsViewModel.A01(this.A0w);
    }

    public SettingsPrivacy() {
        this(0);
        this.A16 = AnonymousClass4W3.A00(this, 35);
        this.A19 = new C54262sf(this, 4);
        this.A15 = new C68803cU(this);
        this.A17 = AnonymousClass001.A0J();
        this.A18 = C36441kJ.A16();
        this.A1A = false;
    }
}

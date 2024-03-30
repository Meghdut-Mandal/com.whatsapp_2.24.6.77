package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.InfoCard;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.biz.profile.TrustSignalItem;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import java.util.Calendar;

/* renamed from: X.3dG  reason: invalid class name and case insensitive filesystem */
public class C69273dG implements C31751cK {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public InfoCard A04;
    public InfoCard A05;
    public TextEmojiLabel A06;
    public WaTextView A07;
    public WaTextView A08;
    public AnonymousClass3TW A09;
    public BusinessProfileFieldView A0A;
    public CatalogMediaCard A0B;
    public LinkedAccountsMediaCard A0C;
    public LinkedAccountsMediaCard A0D;
    public TrustSignalItem A0E;
    public TrustSignalItem A0F;
    public C606838y A0G;
    public C206949uI A0H;
    public C207109uZ A0I;
    public AnonymousClass141 A0J;
    public AnonymousClass1CF A0K;
    public C69213dA A0L;
    public boolean A0M;
    public boolean A0N = true;
    public boolean A0O = true;
    public View A0P;
    public AnonymousClass1LI A0Q;
    public final View A0R;
    public final View A0S;
    public final C19460v5 A0T;
    public final C19460v5 A0U;
    public final C24801Dv A0V;
    public final C32761e9 A0W;
    public final AnonymousClass17Y A0X;
    public final C32691e2 A0Y;
    public final C19730wQ A0Z;
    public final TextEmojiLabel A0a;
    public final TextEmojiLabel A0b;
    public final WaTextView A0c;
    public final C63553Km A0d;
    public final AnonymousClass1KK A0e;
    public final AnonymousClass1KL A0f;
    public final C201549jr A0g;
    public final C199439fJ A0h;
    public final C62763Hl A0i;
    public final AnonymousClass1ND A0j;
    public final ContactInfoActivity A0k;
    public final AnonymousClass2E6 A0l;
    public final AnonymousClass185 A0m;
    public final AnonymousClass171 A0n;
    public final AnonymousClass1LL A0o;
    public final C30791am A0p;
    public final C21060yb A0q;
    public final C19970wo A0r;
    public final C19630wG A0s;
    public final AnonymousClass17Z A0t;
    public final C18820ts A0u;
    public final C20810yC A0v;
    public final C20500xf A0w;
    public final C21010yW A0x;
    public final AnonymousClass19A A0y;
    public final AnonymousClass1QW A0z;
    public final C24631De A10;
    public final AnonymousClass3EV A11;
    public final AnonymousClass1FR A12;
    public final C63583Kp A13;
    public final RequestPhoneNumberViewModel A14;
    public final AnonymousClass9R0 A15;
    public final C61083Am A16;
    public final C197659c4 A17;
    public final C122825vU A18;
    public final C19770wU A19;
    public final AnonymousClass1KI A1A;
    public final AnonymousClass62F A1B;
    public final AnonymousClass005 A1C;
    public final Integer A1D;
    public final boolean A1E;
    public final C19460v5 A1F;
    public final TextEmojiLabel A1G;
    public final AnonymousClass9Y1 A1H;
    public final C229516p A1I;
    public final AnonymousClass2XH A1J;
    public final AnonymousClass1T2 A1K;
    public final C55952vS A1L;

    public static boolean A07(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect A062 = AnonymousClass001.A06();
        view.getGlobalVisibleRect(A062);
        return A062.intersects(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, C36411kG.A00());
    }

    public static void A02(C69273dG r7, int i) {
        if (r7.A0J.A0C()) {
            r7.A0g.A06((Integer) null, r7.A1D, AnonymousClass143.A03(r7.A0A()), i, r7.A0D(), r7.A0C());
        }
    }

    public static void A03(C69273dG r2, int i) {
        if (r2.A0J.A0C()) {
            r2.A0g.A02(r2.A0H, i);
        }
    }

    public static void A05(C69273dG r3, String str) {
        if (str == null || str.isEmpty() || r3.A0b.getText().equals(str)) {
            TextEmojiLabel textEmojiLabel = r3.A1G;
            C36391kE.A1K(textEmojiLabel);
            textEmojiLabel.setVisibility(8);
        } else if (str.charAt(0) == '@') {
            TextEmojiLabel textEmojiLabel2 = r3.A1G;
            textEmojiLabel2.setText(str);
            textEmojiLabel2.setVisibility(0);
        }
    }

    private void A06(AnonymousClass141 r6) {
        if (r6 != null) {
            AnonymousClass11F r4 = r6.A0H;
            if (r4 instanceof C223313w) {
                RequestPhoneNumberViewModel requestPhoneNumberViewModel = this.A14;
                AnonymousClass00C.A0D(r4, 0);
                C001700s r2 = requestPhoneNumberViewModel.A01;
                C36391kE.A1S(requestPhoneNumberViewModel.A06, requestPhoneNumberViewModel, r4, 32);
                C55492ui.A01(this.A0k, r2, this, 15);
                C36411kG.A1C(this.A0S, this, r4, 13);
            }
        }
    }

    public static boolean A08(C69273dG r2) {
        C19460v5 r1 = r2.A0T;
        if (!r1.A05() || !C36441kJ.A0f(r1).BLB(r2.A0A())) {
            return false;
        }
        return true;
    }

    public static boolean A09(C69273dG r1) {
        if (!r1.A0J.A0E() || !C55942vR.A00(r1.A0v)) {
            return false;
        }
        return true;
    }

    public UserJid A0A() {
        AnonymousClass141 r0 = this.A0J;
        if (r0 == null) {
            return null;
        }
        return C36351kA.A0l(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r3.A02(r11.A0I) != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(com.whatsapp.jid.UserJid r12, boolean r13) {
        /*
            r11 = this;
            X.9uZ r0 = r11.A0I
            r2 = 8
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0c
            if (r0 == 0) goto L_0x0024
            X.0yC r1 = r11.A0v
            r0 = 957(0x3bd, float:1.341E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0014:
            com.whatsapp.biz.catalog.view.CatalogMediaCard r0 = r11.A0B
            r0.setVisibility(r2)
            android.view.View r5 = r11.A02
        L_0x001b:
            r5.setVisibility(r2)
            com.whatsapp.InfoCard r0 = r11.A05
            r0.setVisibility(r2)
        L_0x0023:
            return
        L_0x0024:
            com.whatsapp.biz.catalog.view.CatalogMediaCard r5 = r11.A0B
            X.3dR r0 = new X.3dR
            r0.<init>(r11)
            r5.A04 = r0
            X.3Km r3 = r11.A0d
            X.9uZ r4 = r11.A0I
            X.0yC r1 = r3.A01
            r0 = 355(0x163, float:4.97E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0088
            r0 = 636(0x27c, float:8.91E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0088
        L_0x0043:
            android.view.View r1 = r11.A02
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x004e
            r1.setVisibility(r2)
        L_0x004e:
            X.9uZ r0 = r11.A0I
            java.lang.String r1 = r3.A00(r0)
            java.lang.String r0 = "PERMANENT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001b
            X.9uZ r1 = r11.A0I
            if (r1 == 0) goto L_0x006e
            boolean r0 = r1.A0Y
            if (r0 == 0) goto L_0x006e
            boolean r0 = r1.A0X
            if (r0 == 0) goto L_0x0076
            boolean r0 = r3.A03(r1)
            if (r0 != 0) goto L_0x0076
        L_0x006e:
            X.9uZ r0 = r11.A0I
            boolean r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x001b
        L_0x0076:
            r10 = 0
            r5.setVisibility(r10)
            com.whatsapp.InfoCard r0 = r11.A05
            r0.setVisibility(r10)
            r8 = 0
            X.9uZ r6 = r11.A0I
            r7 = r12
            r9 = r13
            r5.A02(r6, r7, r8, r9, r10)
            return
        L_0x0088:
            boolean r0 = r3.A01(r4)
            if (r0 == 0) goto L_0x0043
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0097
            r5.setVisibility(r2)
        L_0x0097:
            X.9uZ r2 = r11.A0I
            android.view.View r0 = r11.A02
            r1 = 0
            r0.setVisibility(r1)
            com.whatsapp.InfoCard r0 = r11.A05
            r0.setVisibility(r1)
            com.whatsapp.chatinfo.ContactInfoActivity r0 = r11.A0k
            X.01z r6 = r0.getSupportFragmentManager()
            java.lang.String r5 = "shops_product_frag"
            X.02E r0 = r6.A0N(r5)
            if (r0 != 0) goto L_0x0023
            java.lang.String r4 = r2.A0J
            X.C18740tg.A06(r4)
            com.whatsapp.shops.ShopsProductPreviewFragment r3 = new com.whatsapp.shops.ShopsProductPreviewFragment
            r3.<init>()
            android.os.Bundle r2 = r3.A0b()
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "com.bloks.www.minishops.whatsapp.products_preview_h_scroll"
            r2.putString(r1, r0)
            java.lang.String r0 = "shopUrl"
            r2.putString(r0, r4)
            X.09Y r1 = new X.09Y
            r1.<init>(r6)
            r0 = 2131434083(0x7f0b1a63, float:1.848997E38)
            r1.A0E(r3, r5, r0)
            r1.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69273dG.A0B(com.whatsapp.jid.UserJid, boolean):void");
    }

    public boolean A0C() {
        AnonymousClass3XP r0;
        C207109uZ r02 = this.A0I;
        if (r02 == null || (r0 = r02.A04) == null || TextUtils.isEmpty(r0.A00)) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        C206549ta r1;
        C207109uZ r0 = this.A0I;
        if (r0 == null || (r1 = r0.A05) == null) {
            return false;
        }
        if (r1.A00 == null && r1.A01 == null) {
            return false;
        }
        return true;
    }

    public void BYZ() {
        ContactInfoActivity contactInfoActivity = this.A0k;
        contactInfoActivity.Bnv();
        contactInfoActivity.A1F.A05("profile_view_tag", false);
    }

    public void BYa() {
        ContactInfoActivity contactInfoActivity = this.A0k;
        contactInfoActivity.Bnv();
        contactInfoActivity.A1F.A05("profile_view_tag", true);
    }

    public static final Calendar A00(Calendar calendar, int i, int i2) {
        Object clone = calendar.clone();
        AnonymousClass00C.A0E(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) clone;
        calendar2.set(7, i);
        calendar2.set(11, i2 / 60);
        calendar2.set(12, i2 % 60);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public static void A01(View view, C69273dG r2, int i) {
        if (A08(r2) || A09(r2)) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public C69273dG(View view, C19460v5 r16, C19460v5 r17, C19460v5 r18, C24801Dv r19, C32761e9 r20, AnonymousClass17Y r21, C32691e2 r22, C19730wQ r23, AnonymousClass1LI r24, C63553Km r25, AnonymousClass1KK r26, AnonymousClass1KL r27, AnonymousClass9Y1 r28, C201549jr r29, C199439fJ r30, C206949uI r31, C62763Hl r32, AnonymousClass1ND r33, ContactInfoActivity contactInfoActivity, AnonymousClass2E6 r35, C229516p r36, AnonymousClass185 r37, AnonymousClass171 r38, AnonymousClass9RO r39, AnonymousClass1LL r40, C30791am r41, C21060yb r42, C19970wo r43, C19630wG r44, AnonymousClass17Z r45, C18820ts r46, AnonymousClass141 r47, C20810yC r48, C20500xf r49, C21010yW r50, AnonymousClass1CF r51, AnonymousClass2XH r52, AnonymousClass19A r53, AnonymousClass1QW r54, C24631De r55, AnonymousClass3EV r56, AnonymousClass1FR r57, C63583Kp r58, RequestPhoneNumberViewModel requestPhoneNumberViewModel, AnonymousClass9R0 r60, C61083Am r61, C197659c4 r62, C122825vU r63, C19770wU r64, AnonymousClass1KI r65, AnonymousClass1T2 r66, AnonymousClass62F r67, C55952vS r68, AnonymousClass005 r69, Integer num) {
        this.A0r = r43;
        this.A0v = r48;
        this.A1L = r68;
        this.A0X = r21;
        this.A0Z = r23;
        this.A0s = r44;
        this.A19 = r64;
        this.A1F = r16;
        this.A0x = r50;
        this.A1A = r65;
        this.A0j = r33;
        this.A0w = r49;
        this.A0Y = r22;
        this.A0V = r19;
        this.A1J = r52;
        this.A1K = r66;
        this.A0y = r53;
        this.A12 = r57;
        this.A0n = r38;
        this.A0q = r42;
        this.A0u = r46;
        this.A1C = r69;
        this.A0l = r35;
        this.A1B = r67;
        this.A16 = r61;
        this.A0U = r17;
        this.A0m = r37;
        this.A0T = r18;
        this.A0f = r27;
        this.A0d = r25;
        this.A0e = r26;
        this.A1H = r28;
        this.A1I = r36;
        this.A10 = r55;
        this.A0z = r54;
        this.A18 = r63;
        this.A13 = r58;
        this.A0o = r40;
        this.A14 = requestPhoneNumberViewModel;
        this.A17 = r62;
        this.A0t = r45;
        this.A0g = r29;
        this.A11 = r56;
        this.A0i = r32;
        this.A0Q = r24;
        this.A0H = r31;
        this.A0h = r30;
        this.A0K = r51;
        this.A0p = r41;
        this.A0W = r20;
        C18740tg.A04(view);
        this.A01 = view.findViewById(R.id.business_verification_status);
        this.A06 = C36401kF.A0O(view, R.id.business_verification_status_text);
        this.A0A = (BusinessProfileFieldView) C012005e.A02(view, R.id.business_description);
        this.A0B = (CatalogMediaCard) C012005e.A02(view, R.id.business_catalog_media_card);
        this.A0C = (LinkedAccountsMediaCard) C012005e.A02(view, R.id.business_fb_media_card);
        this.A0D = (LinkedAccountsMediaCard) C012005e.A02(view, R.id.business_ig_media_card);
        this.A05 = (InfoCard) C012005e.A02(view, R.id.business_catalog_shop_info_card);
        this.A02 = C012005e.A02(view, R.id.shops_container);
        this.A03 = C36391kE.A0O(view, R.id.blank_business_details_text);
        this.A00 = C012005e.A02(view, R.id.add_business_to_contact);
        this.A04 = (InfoCard) C012005e.A02(view, R.id.business_chaining_container);
        this.A0S = C012005e.A02(view, R.id.action_request_phone_number);
        ContactInfoActivity contactInfoActivity2 = contactInfoActivity;
        AnonymousClass22V.A01(contactInfoActivity2, (AnonymousClass22V) C012005e.A02(view, R.id.business_chaining_layout), R.string.f12nameremoved);
        this.A0b = C36401kF.A0O(view, R.id.business_title);
        this.A0a = C36401kF.A0O(view, R.id.business_subtitle);
        this.A1G = C36401kF.A0O(view, R.id.business_username);
        this.A0c = C36401kF.A0Q(view, R.id.business_categories);
        this.A07 = C36401kF.A0Q(view, R.id.custom_url);
        this.A08 = C36401kF.A0Q(view, R.id.responsiveness_signal);
        this.A1D = num;
        this.A0k = contactInfoActivity2;
        this.A0R = view;
        AnonymousClass141 r2 = r47;
        this.A0J = r2;
        this.A15 = r60;
        this.A1E = r39.A00(r2);
        C20810yC r1 = this.A0v;
        if (r1.A0E(2582) || (!r1.A0E(1483) && !r1.A0E(1849))) {
            this.A07.setVisibility(8);
        } else {
            UserJid A0A2 = A0A();
            C18740tg.A06(A0A2);
            WaTextView waTextView = this.A07;
            waTextView.setVisibility(0);
            waTextView.setText(R.string.f12nameremoved);
            AnonymousClass19A r3 = this.A0y;
            C76883pb r8 = new C76883pb(new C593833s(this, A0A2), this.A0t, r3);
            AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
            AnonymousClass19A r7 = r8.A01;
            String A092 = r7.A09();
            AnonymousClass6QB A0q2 = C36441kJ.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            C36351kA.A1I(A0A2, A0q2, "jid");
            C203399nx A032 = A0q2.A03();
            AnonymousClass1AL[] r5 = new AnonymousClass1AL[5];
            r5[0] = new AnonymousClass1AL((Jid) C177588e2.A00, "to");
            r5[1] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092);
            C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r5);
            C36361kB.A1Q("xmlns", "fb:thrift_iq", r5);
            r5[4] = new AnonymousClass1AL("smax_id", "78");
            r7.A0F(r8, C36391kE.A0m(A032, r5), A092, 316, 32000);
            C36321k7.A1K(A0A2, "GetCustomUrlsByJidProtocol/sendRequest/jid=", AnonymousClass000.A0u());
        }
        A06(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0501, code lost:
        if (r14.A0E(3465) == false) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x052b, code lost:
        if (r14.A0E(3464) != false) goto L_0x052f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0731, code lost:
        if (r0.A0K.A02(r0.A0A()) != false) goto L_0x0733;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0109, code lost:
        if (r0.A0m.A04(r7) == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x083e, code lost:
        if (r0.A0F.getVisibility() != 0) goto L_0x0840;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0c17, code lost:
        r9.add(r11.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0225, code lost:
        if (r15 == false) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0837  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08ed  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0a62  */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0bc3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C69273dG r41, X.C206949uI r42, X.AnonymousClass141 r43, X.C33541fX r44, boolean r45, boolean r46, boolean r47) {
        /*
            r0 = r41
            r6 = r43
            r0.A0J = r6
            r0.A06(r6)
            android.view.View r3 = r0.A0R
            X.C18740tg.A04(r3)
            r8 = 0
            r3.setVisibility(r8)
            int r7 = r6.A08
            java.lang.String r5 = r6.A0J()
            X.0xf r1 = r0.A0w
            r41 = r1
            com.whatsapp.jid.UserJid r2 = r0.A0A()
            boolean r1 = X.AnonymousClass3M3.A01(r1, r2)
            r9 = 1
            r2 = 8
            if (r1 != 0) goto L_0x04b7
            X.0yC r4 = r0.A0v
            com.whatsapp.jid.UserJid r1 = r0.A0A()
            boolean r1 = X.AnonymousClass3RR.A00(r4, r1)
            if (r1 != 0) goto L_0x04b7
            X.1CF r4 = r0.A0K
            com.whatsapp.jid.UserJid r1 = r0.A0A()
            boolean r1 = r4.A02(r1)
            if (r1 != 0) goto L_0x04b7
            android.view.View r1 = r0.A01
            r16 = r1
            X.2i2 r4 = new X.2i2
            r4.<init>(r0, r5, r7)
            r1.setOnClickListener(r4)
            X.141 r4 = r0.A0J
            X.3IL r1 = r4.A0F
            if (r1 != 0) goto L_0x0064
            X.141 r1 = r4.A0G
            if (r1 != 0) goto L_0x0064
            X.0wQ r4 = r0.A0Z
            com.whatsapp.jid.UserJid r1 = r0.A0A()
            boolean r1 = r4.A0M(r1)
            if (r1 != 0) goto L_0x0064
            r9 = 0
        L_0x0064:
            android.view.View r1 = r0.A00
            r40 = r1
            X.C18740tg.A04(r40)
            r4 = r44
            r1.setOnClickListener(r4)
            if (r9 != 0) goto L_0x04be
            X.0wQ r1 = r0.A0Z
            boolean r1 = X.C36441kJ.A1J(r1)
            if (r1 == 0) goto L_0x04be
            r1 = r40
            A01(r1, r0, r8)
        L_0x007f:
            X.9uZ r1 = r0.A0I
            if (r1 != 0) goto L_0x04b1
            r23 = 0
        L_0x0085:
            r1 = 2131428353(0x7f0b0401, float:1.8478348E38)
            android.view.View r4 = X.C012005e.A02(r3, r1)
            X.9uZ r2 = r0.A0I
            if (r2 == 0) goto L_0x00a2
            boolean r1 = r2.A00()
            if (r1 == 0) goto L_0x02a1
            java.lang.String r1 = r2.A0M
            if (r1 != 0) goto L_0x02a1
            java.util.List r1 = r2.A0O
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02a1
        L_0x00a2:
            r2 = 8
            r4.setVisibility(r2)
        L_0x00a7:
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            X.C18740tg.A06(r4)
            r1 = 0
            r0.A0B(r4, r8)
            r4 = 2131427507(0x7f0b00b3, float:1.8476632E38)
            android.view.View r13 = X.C012005e.A02(r3, r4)
            r4 = 2131427484(0x7f0b009c, float:1.8476586E38)
            android.view.View r12 = X.C012005e.A02(r3, r4)
            r4 = 2131427522(0x7f0b00c2, float:1.8476663E38)
            android.view.View r11 = X.C012005e.A02(r3, r4)
            r4 = 2131427511(0x7f0b00b7, float:1.847664E38)
            android.view.View r10 = X.C012005e.A02(r3, r4)
            r4 = 2131427494(0x7f0b00a6, float:1.8476606E38)
            android.view.View r9 = X.C012005e.A02(r3, r4)
            r4 = 2131427515(0x7f0b00bb, float:1.8476648E38)
            android.view.View r8 = X.C012005e.A02(r3, r4)
            com.whatsapp.jid.UserJid r7 = r0.A0A()
            X.C18740tg.A06(r7)
            com.whatsapp.jid.UserJid r5 = r0.A0A()
            r4 = r41
            boolean r15 = X.AnonymousClass3M3.A01(r4, r5)
            int r4 = X.C36351kA.A00(r47)
            r13.setVisibility(r4)
            r4 = 9
            X.C48812i6.A00(r13, r7, r0, r4)
            X.141 r4 = r0.A0J
            boolean r4 = r4.A0C()
            r5 = 1
            if (r4 == 0) goto L_0x010b
            X.185 r4 = r0.A0m
            boolean r4 = r4.A04(r7)
            r14 = 1
            if (r4 != 0) goto L_0x010c
        L_0x010b:
            r14 = 0
        L_0x010c:
            if (r15 != 0) goto L_0x012e
            X.1LL r4 = r0.A0o
            com.whatsapp.jid.UserJid r4 = r4.A01(r7)
            if (r4 != 0) goto L_0x012e
            r4 = 29
            X.C48732hx.A00(r12, r0, r4)
            X.0yC r13 = r0.A0v
            r4 = 4067(0xfe3, float:5.699E-42)
            int r4 = r13.A07(r4)
            if (r14 == 0) goto L_0x027b
            if (r4 < r5) goto L_0x012e
            X.0wU r5 = r0.A19
            r4 = 25
            X.C36391kE.A1R(r5, r0, r12, r4)
        L_0x012e:
            boolean r4 = A08(r0)
            if (r4 != 0) goto L_0x0146
            X.9uZ r4 = r0.A0I
            if (r4 == 0) goto L_0x0229
            boolean r4 = r4.A0c
            if (r4 == 0) goto L_0x0229
            X.0yC r5 = r0.A0v
            r4 = 957(0x3bd, float:1.341E-42)
            boolean r4 = r5.A0E(r4)
            if (r4 == 0) goto L_0x0229
        L_0x0146:
            r11.setVisibility(r2)
        L_0x0149:
            r10.setVisibility(r2)
            X.0yC r14 = r0.A0v
            r4 = 5415(0x1527, float:7.588E-42)
            boolean r4 = r14.A0E(r4)
            if (r4 == 0) goto L_0x016c
            X.9l8 r5 = X.C202159l8.A0F
            X.1De r4 = r0.A10
            X.9l8 r4 = r4.A02()
            if (r5 != r4) goto L_0x016c
            r4 = 31
            X.C48732hx.A00(r10, r0, r4)
            X.0wU r5 = r0.A19
            r4 = 24
            X.C36391kE.A1R(r5, r0, r10, r4)
        L_0x016c:
            if (r15 != 0) goto L_0x0222
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            boolean r4 = X.AnonymousClass3RR.A00(r14, r4)
            if (r4 != 0) goto L_0x0222
            X.1CF r5 = r0.A0K
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            boolean r4 = r5.A02(r4)
            if (r4 != 0) goto L_0x0222
            r4 = 26
            X.C48732hx.A00(r9, r0, r4)
        L_0x0189:
            X.0v5 r7 = r0.A0T
            boolean r4 = r7.A05()
            if (r4 == 0) goto L_0x0218
            X.1K3 r5 = X.C36441kJ.A0f(r7)
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            boolean r4 = r5.BLB(r4)
            if (r4 == 0) goto L_0x0218
            X.1K3 r5 = X.C36441kJ.A0f(r7)
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            boolean r4 = r5.BLD(r4)
            if (r4 != 0) goto L_0x0218
        L_0x01ad:
            r4 = 31
            X.C36421kH.A10(r8, r0, r4)
            r8.setVisibility(r1)
        L_0x01b5:
            X.9uZ r4 = r0.A0I
            if (r4 == 0) goto L_0x04e4
            java.util.List r4 = r4.A0O
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x04e4
            X.1KL r4 = r0.A0f
            int r4 = r4.A00()
            r4 = r4 & 4
            if (r4 <= 0) goto L_0x04e4
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            boolean r4 = X.AnonymousClass3RR.A00(r14, r4)
            if (r4 != 0) goto L_0x04e4
            X.1CF r5 = r0.A0K
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            boolean r4 = r5.A02(r4)
            if (r4 != 0) goto L_0x04e4
            com.whatsapp.WaTextView r7 = r0.A0c
            X.9uZ r4 = r0.A0I
            java.util.List r4 = r4.A0O
            java.lang.String r5 = " • "
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.util.Iterator r10 = r4.iterator()
        L_0x01f1:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x04c7
            java.lang.Object r4 = r10.next()
            X.6bw r4 = (X.C134986bw) r4
            if (r4 == 0) goto L_0x020e
            java.lang.String r9 = r4.A01
            int r4 = r9.length()
            if (r4 <= 0) goto L_0x020e
            r8.append(r9)
            r8.append(r5)
            goto L_0x01f1
        L_0x020e:
            java.lang.String r4 = "Category is null"
            java.lang.NullPointerException r4 = X.AnonymousClass001.A0A(r4)
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
            goto L_0x01f1
        L_0x0218:
            boolean r4 = A09(r0)
            if (r4 != 0) goto L_0x01ad
            r8.setVisibility(r2)
            goto L_0x01b5
        L_0x0222:
            r9.setVisibility(r2)
            if (r15 != 0) goto L_0x01ad
            goto L_0x0189
        L_0x0229:
            X.9uZ r12 = r0.A0I
            if (r12 == 0) goto L_0x025a
            X.3Km r5 = r0.A0d
            boolean r4 = r12.A0Y
            if (r4 == 0) goto L_0x025a
            boolean r4 = r12.A0X
            if (r4 == 0) goto L_0x023d
            boolean r4 = r5.A03(r12)
            if (r4 == 0) goto L_0x025a
        L_0x023d:
            X.9uZ r4 = r0.A0I
            java.lang.String r5 = r5.A00(r4)
            java.lang.String r4 = "PERMANENT"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x025a
            r4 = 10
            X.2i6 r5 = new X.2i6
            r5.<init>(r7, r0, r4)
        L_0x0252:
            r11.setOnClickListener(r5)
            r11.setVisibility(r1)
            goto L_0x0149
        L_0x025a:
            X.3Km r5 = r0.A0d
            X.9uZ r4 = r0.A0I
            boolean r4 = r5.A01(r4)
            if (r4 == 0) goto L_0x0146
            r7 = r11
            com.whatsapp.wds.components.actiontile.WDSActionTile r7 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r7
            r5 = 2131231871(0x7f08047f, float:1.8079835E38)
            r4 = 2131888246(0x7f120876, float:1.9411122E38)
            r7.setIcon((int) r5)
            r7.setText((int) r4)
            r4 = 30
            X.2hx r5 = new X.2hx
            r5.<init>(r0, r4)
            goto L_0x0252
        L_0x027b:
            X.0wQ r5 = r0.A0Z
            X.141 r4 = r0.A0J
            boolean r4 = X.C36361kB.A1X(r5, r4)
            if (r4 == 0) goto L_0x028b
            boolean r4 = X.C36391kE.A1X(r13)
            if (r4 != 0) goto L_0x029c
        L_0x028b:
            boolean r4 = A08(r0)
            if (r4 != 0) goto L_0x029c
            boolean r4 = A09(r0)
            if (r4 != 0) goto L_0x029c
            r12.setVisibility(r1)
            goto L_0x012e
        L_0x029c:
            r12.setVisibility(r2)
            goto L_0x012e
        L_0x02a1:
            X.9uZ r1 = r0.A0I
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x02b5
            X.1CF r2 = r0.A0K
            com.whatsapp.jid.UserJid r1 = r0.A0A()
            boolean r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x00a2
        L_0x02b5:
            X.0yC r10 = r0.A0v
            X.AnonymousClass00C.A0D(r10, r8)
            boolean r1 = r6.A0E()
            if (r1 == 0) goto L_0x02c8
            boolean r1 = X.C55942vR.A00(r10)
            if (r1 == 0) goto L_0x02c8
            goto L_0x00a2
        L_0x02c8:
            r4.setVisibility(r8)
            X.9uZ r4 = r0.A0I
            X.1CF r2 = r0.A0K
            com.whatsapp.jid.UserJid r1 = r0.A0A()
            boolean r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x04ad
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0k
            r1 = 2131896210(0x7f122792, float:1.9427275E38)
            java.lang.String r5 = r2.getString(r1)
        L_0x02e2:
            com.whatsapp.biz.BusinessProfileFieldView r4 = r0.A0A
            r2 = 30
            X.6cg r1 = new X.6cg
            r1.<init>(r0, r2)
            r4.setText(r5, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0308
            r1 = 37
            boolean r1 = r10.A0E(r1)
            if (r1 == 0) goto L_0x04a5
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0k
            r1 = 2131101127(0x7f0605c7, float:1.7814655E38)
            int r1 = X.AnonymousClass00F.A00(r2, r1)
            r4.setTextColor(r1)
        L_0x0308:
            r1 = 37
            boolean r1 = r10.A0E(r1)
            if (r1 != 0) goto L_0x03a8
            X.3TW r9 = r0.A09
            if (r9 != 0) goto L_0x035d
            r1 = 2131428354(0x7f0b0402, float:1.847835E38)
            android.view.ViewStub r2 = X.C36441kJ.A0S(r3, r1)
            r1 = 2131626220(0x7f0e08ec, float:1.887967E38)
            android.view.View r25 = X.C36401kF.A0E(r2, r1)
            X.0wQ r15 = r0.A0Z
            X.1Dv r14 = r0.A0V
            X.2XH r13 = r0.A1J
            X.171 r12 = r0.A0n
            X.0ts r11 = r0.A0u
            X.1KL r7 = r0.A0f
            X.1QW r5 = r0.A0z
            X.9jr r4 = r0.A0g
            java.lang.Integer r2 = r0.A1D
            com.whatsapp.chatinfo.ContactInfoActivity r1 = r0.A0k
            boolean r39 = r0.A0D()
            X.3TW r9 = new X.3TW
            r38 = 0
            r31 = r42
            r30 = r4
            r32 = r12
            r33 = r11
            r34 = r6
            r35 = r13
            r36 = r5
            r37 = r2
            r24 = r9
            r26 = r14
            r27 = r1
            r28 = r15
            r29 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0.A09 = r9
        L_0x035d:
            X.9uZ r1 = r0.A0I
            r9.A04(r1)
        L_0x0362:
            com.whatsapp.chatinfo.ContactInfoActivity r4 = r0.A0k
            r4.populatePhoneNumber(r3)
            X.3Km r2 = r0.A0d
            X.9uZ r1 = r0.A0I
            boolean r1 = r2.A01(r1)
            if (r1 == 0) goto L_0x038f
            r1 = 2131434645(0x7f0b1c95, float:1.849111E38)
            android.widget.ImageView r2 = X.C36411kG.A0Q(r4, r1)
            if (r2 == 0) goto L_0x038f
            X.9uZ r1 = r0.A0I
            if (r1 == 0) goto L_0x0393
            boolean r1 = r1.A0c
            if (r1 == 0) goto L_0x0393
            r1 = 957(0x3bd, float:1.341E-42)
            boolean r1 = r10.A0E(r1)
            if (r1 == 0) goto L_0x0393
            r1 = 8
            r2.setVisibility(r1)
        L_0x038f:
            r2 = 8
            goto L_0x00a7
        L_0x0393:
            r2.setVisibility(r8)
            r1 = 2131231871(0x7f08047f, float:1.8079835E38)
            r2.setImageResource(r1)
            r1 = 2131888246(0x7f120876, float:1.9411122E38)
            X.C36331k8.A0q(r4, r2, r1)
            r1 = 27
            X.C48732hx.A00(r2, r0, r1)
            goto L_0x038f
        L_0x03a8:
            X.9uZ r4 = r0.A0I
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.3XK r1 = r4.A03
            if (r1 == 0) goto L_0x03be
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0k
            r1 = 2131887234(0x7f120482, float:1.940907E38)
            java.lang.String r1 = r2.getString(r1)
            r5.add(r1)
        L_0x03be:
            X.3XS r2 = r4.A07
            X.3XS r1 = X.AnonymousClass3XS.A04
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x03d4
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0k
            r1 = 2131887231(0x7f12047f, float:1.9409063E38)
            java.lang.String r1 = r2.getString(r1)
            r5.add(r1)
        L_0x03d4:
            java.lang.String r1 = r4.A0M
            if (r1 == 0) goto L_0x03e4
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0k
            r1 = 2131887232(0x7f120480, float:1.9409065E38)
            java.lang.String r1 = r2.getString(r1)
            r5.add(r1)
        L_0x03e4:
            java.lang.String r1 = r4.A0H
            if (r1 == 0) goto L_0x03f4
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0k
            r1 = 2131887233(0x7f120481, float:1.9409067E38)
            java.lang.String r1 = r2.getString(r1)
            r5.add(r1)
        L_0x03f4:
            java.util.List r2 = r4.A0U
            boolean r1 = r2.isEmpty()
            r4 = 1
            if (r1 != 0) goto L_0x0471
            java.util.Iterator r12 = r2.iterator()
            r7 = 0
            r11 = 0
        L_0x0403:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0450
            java.lang.String r2 = X.AnonymousClass001.A0C(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0403
            java.lang.String r1 = X.C53312r7.A00(r2)
            android.net.Uri r9 = android.net.Uri.parse(r1)
            java.lang.String r2 = r9.getHost()
            java.lang.String r1 = "www.instagram.com"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x044e
            java.lang.String r2 = r9.getHost()
            java.lang.String r1 = "instagram.com"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x044e
            java.lang.String r2 = r9.getHost()
            java.lang.String r1 = "instagr.am"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x044e
            java.lang.String r2 = r9.getHost()
            java.lang.String r1 = "www.instagr.am"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x044e
            int r7 = r7 + 1
            goto L_0x0403
        L_0x044e:
            r11 = 1
            goto L_0x0403
        L_0x0450:
            if (r7 <= 0) goto L_0x0463
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0k
            r1 = 2131887236(0x7f120484, float:1.9409073E38)
            if (r7 <= r4) goto L_0x045c
            r1 = 2131887237(0x7f120485, float:1.9409075E38)
        L_0x045c:
            java.lang.String r1 = r2.getString(r1)
            r5.add(r1)
        L_0x0463:
            if (r11 == 0) goto L_0x0471
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0k
            r1 = 2131887235(0x7f120483, float:1.9409071E38)
            java.lang.String r1 = r2.getString(r1)
            r5.add(r1)
        L_0x0471:
            X.0ts r1 = r0.A0u
            java.lang.String r4 = X.C55782vB.A00(r1, r5, r4)
            android.view.View r1 = r0.A0P
            if (r1 != 0) goto L_0x0362
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0362
            r1 = 2131432254(0x7f0b133e, float:1.848626E38)
            android.view.ViewStub r2 = X.C36441kJ.A0S(r3, r1)
            r1 = 2131626225(0x7f0e08f1, float:1.887968E38)
            android.view.View r2 = X.C36401kF.A0E(r2, r1)
            r0.A0P = r2
            r1 = 2131432252(0x7f0b133c, float:1.8486256E38)
            X.C36371kC.A1E(r2, r4, r1)
            r1 = 2131432253(0x7f0b133d, float:1.8486258E38)
            X.C36341k9.A10(r3, r1, r8)
            android.view.View r2 = r0.A0P
            r1 = 7
            X.C48812i6.A00(r2, r6, r0, r1)
            goto L_0x0362
        L_0x04a5:
            r1 = 2131232064(0x7f080540, float:1.8080227E38)
            r4.setIcon((int) r1)
            goto L_0x0308
        L_0x04ad:
            java.lang.String r5 = r4.A0G
            goto L_0x02e2
        L_0x04b1:
            java.lang.String r1 = r1.A0L
            r23 = r1
            goto L_0x0085
        L_0x04b7:
            android.view.View r1 = r0.A01
            r16 = r1
            r1.setVisibility(r2)
        L_0x04be:
            android.view.View r1 = r0.A00
            r40 = r1
            A01(r1, r0, r2)
            goto L_0x007f
        L_0x04c7:
            int r4 = r8.length()
            int r5 = r5.length()
            if (r4 <= r5) goto L_0x0bc3
            int r4 = r8.length()
            int r4 = r4 - r5
            java.lang.String r5 = r8.substring(r1, r4)
            X.AnonymousClass00C.A08(r5)
        L_0x04dd:
            r4 = 0
            r7.setText(r5, r4)
            A01(r7, r0, r1)
        L_0x04e4:
            r4 = 2131428338(0x7f0b03f2, float:1.8478318E38)
            android.widget.TextView r24 = X.C36391kE.A0O(r3, r4)
            X.9uZ r7 = r0.A0I
            if (r7 == 0) goto L_0x0509
            X.3XK r4 = r7.A03
            boolean r5 = X.AnonymousClass000.A1V(r4)
            X.6bQ r4 = r7.A06
            if (r4 == 0) goto L_0x0503
            r4 = 3465(0xd89, float:4.855E-42)
            boolean r4 = r14.A0E(r4)
            r22 = 1
            if (r4 != 0) goto L_0x0505
        L_0x0503:
            r22 = 0
        L_0x0505:
            if (r5 != 0) goto L_0x0992
            if (r22 != 0) goto L_0x0992
        L_0x0509:
            r4 = r24
            r4.setVisibility(r2)
        L_0x050e:
            com.whatsapp.WaTextView r7 = r0.A08
            X.9uZ r4 = r0.A0I
            if (r4 == 0) goto L_0x052d
            boolean r4 = r4.A0b
            if (r4 == 0) goto L_0x052d
            X.9uI r4 = r0.A0H
            if (r4 == 0) goto L_0x052d
            java.lang.Integer r4 = r4.A04
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x052d
            r4 = 3464(0xd88, float:4.854E-42)
            boolean r5 = r14.A0E(r4)
            r4 = 0
            if (r5 != 0) goto L_0x052f
        L_0x052d:
            r4 = 8
        L_0x052f:
            r7.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r9 = r0.A0b
            if (r9 == 0) goto L_0x05a7
            com.whatsapp.TextEmojiLabel r7 = r0.A0a
            if (r7 == 0) goto L_0x05a7
            X.171 r5 = r0.A0n
            X.34G r4 = r5.A0F(r6, r1)
            java.lang.String r4 = r4.A01
            if (r4 != 0) goto L_0x0548
            java.lang.String r4 = r6.A0K()
        L_0x0548:
            android.text.SpannableStringBuilder r4 = X.AnonymousClass6YV.A02(r4)
            X.C36431kI.A1M(r9, r4)
            boolean r4 = r6.A0N()
            if (r4 != 0) goto L_0x095a
            boolean r4 = r6.A0O()
            if (r4 != 0) goto L_0x095a
            r9.A0E()
            r4 = 0
        L_0x055f:
            r9.setOnClickListener(r4)
            r7.setOnClickListener(r4)
        L_0x0565:
            boolean r4 = A09(r0)
            if (r4 == 0) goto L_0x08ed
            r7.setVisibility(r1)
            r5 = 2131887075(0x7f1203e3, float:1.9408747E38)
            java.lang.String r10 = r6.A0K()
            int r8 = X.C55832vG.A00(r14)
            boolean r4 = r6.A0B()
            if (r4 == 0) goto L_0x08dc
            java.lang.String r4 = r6.A0J()
            if (r4 == 0) goto L_0x08dc
            java.lang.String r4 = r6.A0J()
            r9.setText(r4)
            if (r10 == 0) goto L_0x059e
            r7.setText(r5)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = " · "
            java.lang.String r4 = X.AnonymousClass000.A0p(r4, r10, r5)
            r7.append(r4)
        L_0x059e:
            boolean r4 = r6.A0N()
            if (r4 == 0) goto L_0x05a7
            r7.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r8, r1)
        L_0x05a7:
            android.widget.TextView r4 = r0.A03
            r4.setVisibility(r2)
            r4 = 1
            if (r46 != 0) goto L_0x05c8
            X.9Y1 r8 = r0.A1H
            java.lang.Integer r5 = r0.A1D
            if (r5 == 0) goto L_0x08d8
            int r7 = r5.intValue()
            r5 = 19
            if (r7 == r5) goto L_0x08d4
            r5 = 20
            if (r7 != r5) goto L_0x08d8
            java.lang.String r7 = "custom_qr_code_link"
        L_0x05c3:
            java.lang.String r5 = "whatsapp"
            r8.A02(r4, r7, r5)
        L_0x05c8:
            if (r45 == 0) goto L_0x0612
            X.9uZ r5 = r0.A0I
            if (r5 != 0) goto L_0x05d6
            com.whatsapp.chatinfo.ContactInfoActivity r7 = r0.A0k
            r5 = 2131887238(0x7f120486, float:1.9409077E38)
            r7.Bu1(r5)
        L_0x05d6:
            com.whatsapp.jid.UserJid r8 = r0.A0A()
            if (r8 == 0) goto L_0x05e3
            X.1KK r7 = r0.A0e
            r5 = r23
            r7.A0E(r0, r8, r5)
        L_0x05e3:
            boolean r5 = r6.A0C()
            if (r5 == 0) goto L_0x0612
            X.9jr r7 = r0.A0g
            com.whatsapp.jid.UserJid r5 = r0.A0A()
            java.lang.String r10 = X.AnonymousClass143.A03(r5)
            r8 = 0
            java.lang.Integer r9 = r0.A1D
            boolean r12 = r0.A0D()
            boolean r13 = r0.A0C()
            r11 = 1
            r7.A06(r8, r9, r10, r11, r12, r13)
            X.9uZ r5 = r0.A0I
            if (r5 == 0) goto L_0x060f
            X.3XP r5 = r5.A04
            if (r5 == 0) goto L_0x060f
            r5 = 19
            A02(r0, r5)
        L_0x060f:
            A03(r0, r1)
        L_0x0612:
            X.2E6 r12 = r0.A0l
            android.view.ViewTreeObserver r5 = r12.getViewTreeObserver()
            r7 = 2
            X.C90104Zc.A00(r5, r0, r7)
            r5 = 2582(0xa16, float:3.618E-42)
            boolean r5 = r14.A0E(r5)
            if (r5 == 0) goto L_0x0658
            X.9uZ r5 = r0.A0I
            if (r5 == 0) goto L_0x08cd
            java.lang.String r8 = r5.A0F
            boolean r5 = X.AnonymousClass14B.A0F(r8)
            if (r5 != 0) goto L_0x08cd
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r5 = "wa.me"
            r7[r1] = r5
            r7[r4] = r8
            java.lang.String r4 = "%s/%s"
            java.lang.String r7 = java.lang.String.format(r4, r7)
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            X.C18740tg.A06(r4)
            com.whatsapp.WaTextView r5 = r0.A07
            r5.setText(r7)
            r5.setVisibility(r1)
            X.C48812i6.A00(r5, r4, r0, r2)
            X.4Y4 r4 = new X.4Y4
            r4.<init>(r1, r7, r0)
            r5.setOnLongClickListener(r4)
        L_0x0658:
            X.9uZ r11 = r0.A0I
            if (r11 == 0) goto L_0x0700
            X.9ta r9 = r11.A05
            if (r9 == 0) goto L_0x0700
            r4 = 2131429042(0x7f0b06b2, float:1.8479746E38)
            android.view.View r13 = X.C012005e.A02(r3, r4)
            r7 = 8
            X.6bZ r5 = r9.A00
            if (r5 != 0) goto L_0x07cc
            X.6bZ r4 = r9.A01
            if (r4 != 0) goto L_0x07cc
        L_0x0671:
            r13.setVisibility(r7)
            com.whatsapp.jid.UserJid r18 = r0.A0A()
            if (r5 == 0) goto L_0x07c5
            X.1QW r7 = r0.A0z
            boolean r5 = r5.A03
            if (r5 == 0) goto L_0x07c5
            X.0yC r10 = r7.A03
            r5 = 3487(0xd9f, float:4.886E-42)
            boolean r5 = r10.A0E(r5)
            if (r5 != 0) goto L_0x0692
            r5 = 2781(0xadd, float:3.897E-42)
            boolean r5 = r10.A0E(r5)
            if (r5 == 0) goto L_0x07c5
        L_0x0692:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r7 = r0.A0C
            r7.setVisibility(r1)
            java.lang.Integer r9 = r0.A1D
            X.9uI r8 = r0.A0H
            boolean r24 = r0.A0C()
            r5 = 3487(0xd9f, float:4.886E-42)
            boolean r5 = r10.A0E(r5)
            boolean r25 = X.AnonymousClass000.A1P(r5)
            X.9jr r5 = r0.A0g
            r19 = 0
            r21 = 0
            r20 = r11
            r22 = r9
            r23 = r8
            r26 = r5
            r17 = r7
            r17.setup(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x06bc:
            if (r4 == 0) goto L_0x07be
            X.1QW r5 = r0.A0z
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x07be
            X.0yC r9 = r5.A03
            r4 = 3486(0xd9e, float:4.885E-42)
            boolean r4 = r9.A0E(r4)
            if (r4 != 0) goto L_0x06d6
            r4 = 2780(0xadc, float:3.896E-42)
            boolean r4 = r9.A0E(r4)
            if (r4 == 0) goto L_0x07be
        L_0x06d6:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r7 = r0.A0D
            r7.setVisibility(r1)
            r21 = 1
            java.lang.Integer r8 = r0.A1D
            X.9uI r5 = r0.A0H
            boolean r24 = r0.A0C()
            r4 = 3486(0xd9e, float:4.885E-42)
            boolean r4 = r9.A0E(r4)
            boolean r25 = X.AnonymousClass000.A1P(r4)
            X.9jr r4 = r0.A0g
            r19 = 0
            r20 = r11
            r22 = r8
            r23 = r5
            r26 = r4
            r17 = r7
            r17.setup(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0700:
            X.9uZ r4 = r0.A0I
            if (r4 == 0) goto L_0x07b8
            X.9ta r5 = r4.A05
            if (r5 == 0) goto L_0x07b8
            X.6bZ r4 = r5.A00
            if (r4 != 0) goto L_0x070e
            r0.A0N = r1
        L_0x070e:
            X.6bZ r4 = r5.A01
            if (r4 != 0) goto L_0x0714
            r0.A0O = r1
        L_0x0714:
            X.2sz r4 = new X.2sz
            r4.<init>(r0, r1)
            r12.A0N = r4
        L_0x071b:
            X.3Hl r5 = r0.A0i
            X.141 r4 = r0.A0J
            boolean r4 = r5.A01(r4)
            r7 = 0
            if (r4 == 0) goto L_0x0733
            X.1CF r5 = r0.A0K
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            boolean r4 = r5.A02(r4)
            r5 = 1
            if (r4 == 0) goto L_0x0734
        L_0x0733:
            r5 = 0
        L_0x0734:
            com.whatsapp.InfoCard r8 = r0.A04
            if (r5 != 0) goto L_0x073a
            r7 = 8
        L_0x073a:
            A01(r8, r0, r7)
            r0.A0M = r5
            r4 = 28
            X.C48732hx.A00(r8, r0, r4)
            if (r5 == 0) goto L_0x074e
            r5 = 1
            X.2sz r4 = new X.2sz
            r4.<init>(r0, r5)
            r12.A0N = r4
        L_0x074e:
            r4 = 2852(0xb24, float:3.997E-42)
            boolean r4 = r14.A0E(r4)
            if (r4 == 0) goto L_0x077a
            X.9uZ r4 = r0.A0I
            if (r4 == 0) goto L_0x077a
            java.lang.String r4 = r4.A0I
            boolean r4 = X.AnonymousClass14B.A0F(r4)
            if (r4 != 0) goto L_0x077a
            r4 = 2131431553(0x7f0b1081, float:1.8484838E38)
            android.view.View r5 = X.C012005e.A02(r3, r4)
            r5.setVisibility(r1)
            r4 = 2131431554(0x7f0b1082, float:1.848484E38)
            android.widget.TextView r5 = X.C36391kE.A0O(r5, r4)
            X.9uZ r4 = r0.A0I
            java.lang.String r4 = r4.A0I
            r5.setText(r4)
        L_0x077a:
            X.9uZ r4 = r0.A0I
            if (r4 == 0) goto L_0x0c40
            java.util.List r4 = r4.A0N
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0c40
            r4 = 3286(0xcd6, float:4.605E-42)
            boolean r4 = r14.A0E(r4)
            if (r4 == 0) goto L_0x0c40
            r4 = 2131433899(0x7f0b19ab, float:1.8489597E38)
            android.view.View r7 = X.C012005e.A02(r3, r4)
            r7.setVisibility(r1)
            X.38y r12 = r0.A0G
            if (r12 != 0) goto L_0x07a9
            X.0ts r5 = r0.A0u
            android.content.Context r4 = r7.getContext()
            X.38y r12 = new X.38y
            r12.<init>(r4, r7, r5)
            r0.A0G = r12
        L_0x07a9:
            X.9uZ r4 = r0.A0I
            java.util.List r4 = r4.A0N
            X.1vb r7 = r12.A00
            if (r7 != 0) goto L_0x0bc7
            java.lang.String r0 = "serviceOfferingsGridAdapter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07b8:
            r0.A0N = r1
            r0.A0O = r1
            goto L_0x071b
        L_0x07be:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r4 = r0.A0D
            r4.setVisibility(r2)
            goto L_0x0700
        L_0x07c5:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r5 = r0.A0C
            r5.setVisibility(r2)
            goto L_0x06bc
        L_0x07cc:
            r4 = 2131434897(0x7f0b1d91, float:1.849162E38)
            android.view.View r4 = X.C012005e.A02(r3, r4)
            com.whatsapp.biz.profile.TrustSignalItem r4 = (com.whatsapp.biz.profile.TrustSignalItem) r4
            r0.A0E = r4
            r4 = 2131434898(0x7f0b1d92, float:1.8491623E38)
            android.view.View r4 = X.C012005e.A02(r3, r4)
            com.whatsapp.biz.profile.TrustSignalItem r4 = (com.whatsapp.biz.profile.TrustSignalItem) r4
            r0.A0F = r4
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            java.lang.String r25 = X.AnonymousClass143.A03(r4)
            X.1QW r8 = r0.A0z
            if (r5 == 0) goto L_0x0890
            boolean r4 = r5.A03
            if (r4 == 0) goto L_0x0890
            X.0yC r10 = r8.A03
            r4 = 3487(0xd9f, float:4.886E-42)
            boolean r4 = r10.A0E(r4)
            if (r4 != 0) goto L_0x0804
            r4 = 2781(0xadd, float:3.897E-42)
            boolean r4 = r10.A0E(r4)
            if (r4 == 0) goto L_0x0890
        L_0x0804:
            com.whatsapp.biz.profile.TrustSignalItem r4 = r0.A0E
            r4.setVisibility(r2)
        L_0x0809:
            X.6bZ r4 = r9.A01
            if (r4 == 0) goto L_0x0858
            boolean r9 = r4.A03
            if (r9 == 0) goto L_0x0858
            X.0yC r9 = r8.A03
            r8 = 3486(0xd9e, float:4.885E-42)
            boolean r8 = r9.A0E(r8)
            if (r8 != 0) goto L_0x0823
            r8 = 2780(0xadc, float:3.896E-42)
            boolean r8 = r9.A0E(r8)
            if (r8 == 0) goto L_0x0858
        L_0x0823:
            com.whatsapp.biz.profile.TrustSignalItem r8 = r0.A0F
            r8.setVisibility(r2)
        L_0x0828:
            r8 = 2131434900(0x7f0b1d94, float:1.8491627E38)
            android.view.View r10 = X.C012005e.A02(r3, r8)
            com.whatsapp.biz.profile.TrustSignalItem r8 = r0.A0E
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x0840
            com.whatsapp.biz.profile.TrustSignalItem r8 = r0.A0F
            int r9 = r8.getVisibility()
            r8 = 0
            if (r9 == 0) goto L_0x0842
        L_0x0840:
            r8 = 8
        L_0x0842:
            r10.setVisibility(r8)
            com.whatsapp.biz.profile.TrustSignalItem r8 = r0.A0E
            int r8 = r8.getVisibility()
            if (r8 == 0) goto L_0x0855
            com.whatsapp.biz.profile.TrustSignalItem r8 = r0.A0F
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x0671
        L_0x0855:
            r7 = 0
            goto L_0x0671
        L_0x0858:
            X.1Dv r8 = r0.A0V
            r19 = r8
            com.whatsapp.biz.profile.TrustSignalItem r9 = r0.A0F
            X.9jr r8 = r0.A0g
            r17 = r8
            java.lang.Integer r15 = r0.A1D
            X.141 r8 = r0.A0J
            boolean r27 = r8.A0C()
            X.9uI r10 = r0.A0H
            boolean r26 = r0.A0C()
            r9.setUpFromAccount(r4)
            if (r4 == 0) goto L_0x0828
            int r8 = r9.A00
            android.net.Uri r18 = X.C53302r6.A00(r4, r8)
            X.3Ye r8 = new X.3Ye
            r20 = r9
            r21 = r17
            r22 = r10
            r23 = r4
            r24 = r15
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9.setOnClickListener(r8)
            goto L_0x0828
        L_0x0890:
            X.1Dv r4 = r0.A0V
            r28 = r4
            com.whatsapp.biz.profile.TrustSignalItem r10 = r0.A0E
            X.9jr r4 = r0.A0g
            r19 = r4
            java.lang.Integer r4 = r0.A1D
            r17 = r4
            X.141 r4 = r0.A0J
            boolean r27 = r4.A0C()
            X.9uI r15 = r0.A0H
            boolean r26 = r0.A0C()
            r10.setUpFromAccount(r5)
            if (r5 == 0) goto L_0x0809
            int r4 = r10.A00
            android.net.Uri r18 = X.C53302r6.A00(r5, r4)
            X.3Ye r4 = new X.3Ye
            r20 = r10
            r21 = r19
            r22 = r15
            r23 = r5
            r24 = r17
            r17 = r4
            r19 = r28
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r10.setOnClickListener(r4)
            goto L_0x0809
        L_0x08cd:
            com.whatsapp.WaTextView r4 = r0.A07
            r4.setVisibility(r2)
            goto L_0x0658
        L_0x08d4:
            java.lang.String r7 = "custom_link"
            goto L_0x05c3
        L_0x08d8:
            java.lang.String r7 = "biz_profile"
            goto L_0x05c3
        L_0x08dc:
            r9.setText(r10)
            r7.setText(r5)
            boolean r4 = r6.A0N()
            if (r4 == 0) goto L_0x05a7
            r9.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r8, r1)
            goto L_0x05a7
        L_0x08ed:
            X.1CF r8 = r0.A0K
            X.11F r4 = r6.A0H
            boolean r4 = r8.A02(r4)
            if (r4 == 0) goto L_0x0902
            r4 = 2131896209(0x7f122791, float:1.9427273E38)
            r7.setText(r4)
        L_0x08fd:
            r7.setVisibility(r1)
            goto L_0x05a7
        L_0x0902:
            X.11F r8 = r6.A0H
            r4 = r41
            boolean r4 = X.AnonymousClass3M3.A01(r4, r8)
            if (r4 != 0) goto L_0x092e
            X.11F r4 = r6.A0H
            boolean r4 = X.AnonymousClass3RR.A00(r14, r4)
            if (r4 != 0) goto L_0x092e
            boolean r4 = r0.A1E
            if (r4 != 0) goto L_0x0955
            boolean r4 = X.C36431kI.A1W(r6)
            if (r4 != 0) goto L_0x093a
            boolean r4 = r6.A0B()
            if (r4 != 0) goto L_0x093a
            X.0ts r4 = r0.A0u
            java.lang.String r4 = X.AnonymousClass3U8.A02(r4, r6)
        L_0x092a:
            r7.setText(r4)
            goto L_0x08fd
        L_0x092e:
            X.0wG r4 = r0.A0s
            android.content.Context r5 = r4.A00
            r4 = 2131896086(0x7f122716, float:1.9427023E38)
            java.lang.String r4 = X.C44122Lf.A02(r5, r4)
            goto L_0x092a
        L_0x093a:
            boolean r4 = r5.A0f(r6)
            if (r4 != 0) goto L_0x0955
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "~"
            r5.append(r4)
            java.lang.String r4 = r6.A0K()
            java.lang.String r4 = X.AnonymousClass000.A0q(r4, r5)
            r7.A0I(r4)
            goto L_0x08fd
        L_0x0955:
            r7.setVisibility(r2)
            goto L_0x05a7
        L_0x095a:
            int r8 = X.C55832vG.A00(r14)
            X.3IL r4 = r6.A0F
            if (r4 == 0) goto L_0x0988
            boolean r4 = r5.A0f(r6)
            if (r4 != 0) goto L_0x0988
            r9.A0E()
            r4 = 2131168705(0x7f070dc1, float:1.795172E38)
            r7.A0F(r8, r4)
        L_0x0971:
            X.11F r4 = r6.A0H
            boolean r4 = r4 instanceof X.C177638e7
            if (r4 != 0) goto L_0x0565
            r4 = 5295(0x14af, float:7.42E-42)
            boolean r4 = r14.A0E(r4)
            if (r4 == 0) goto L_0x0565
            r8 = 12
            X.6co r4 = new X.6co
            r4.<init>(r0, r6, r8)
            goto L_0x055f
        L_0x0988:
            r7.A0E()
            r4 = 2131168705(0x7f070dc1, float:1.795172E38)
            r9.A0F(r8, r4)
            goto L_0x0971
        L_0x0992:
            android.text.SpannableStringBuilder r21 = new android.text.SpannableStringBuilder
            r21.<init>()
            if (r5 == 0) goto L_0x0b99
            X.0ts r4 = r0.A0u
            r25 = r4
            com.whatsapp.chatinfo.ContactInfoActivity r11 = r0.A0k
            X.0wo r4 = r0.A0r
            long r4 = X.C19970wo.A00(r4)
            X.9uZ r7 = r0.A0I
            X.3XK r8 = r7.A03
            r7 = r25
            X.AnonymousClass00C.A0D(r7, r1)
            r10 = 1
            r7 = 3
            X.AnonymousClass00C.A0D(r8, r7)
            java.lang.String r7 = r8.A01
            r17 = r7
            boolean r7 = X.AnonymousClass14B.A0F(r17)
            if (r7 == 0) goto L_0x09ef
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()
        L_0x09c1:
            java.util.Calendar r9 = java.util.Calendar.getInstance(r7)
            r9.setTimeInMillis(r4)
            r7 = 7
            int r12 = r9.get(r7)
            java.util.ArrayList r20 = X.AnonymousClass001.A0I()
            java.util.List r7 = r8.A02
            java.util.Iterator r13 = r7.iterator()
        L_0x09d7:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x09f4
            java.lang.Object r8 = r13.next()
            X.3XO r8 = (X.AnonymousClass3XO) r8
            if (r8 == 0) goto L_0x09d7
            int r7 = r8.A00
            if (r7 != r12) goto L_0x09d7
            r7 = r20
            r7.add(r8)
            goto L_0x09d7
        L_0x09ef:
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r17)
            goto L_0x09c1
        L_0x09f4:
            r15 = 2131099947(0x7f06012b, float:1.7812262E38)
            r7 = 2131887249(0x7f120491, float:1.94091E38)
            java.lang.String r8 = X.C36361kB.A0m(r11, r7)
            if (r17 == 0) goto L_0x0b6d
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()
            int r12 = r7.getOffset(r4)
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r17)
            int r4 = r7.getOffset(r4)
            if (r12 == r4) goto L_0x0b6d
            r4 = 2131887242(0x7f12048a, float:1.9409086E38)
            java.lang.String r19 = r11.getString(r4)
        L_0x0a19:
            X.AnonymousClass00C.A0B(r19)
            boolean r4 = X.C36411kG.A1a(r20)
            if (r4 == 0) goto L_0x0b6a
            r4 = r20
            java.lang.Object r4 = r4.get(r1)
            X.3XO r4 = (X.AnonymousClass3XO) r4
            if (r4 == 0) goto L_0x0b6a
            int r13 = r4.A00
            int r5 = r4.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            if (r4 == 0) goto L_0x0b6a
            if (r5 != r10) goto L_0x0a82
            r15 = 2131099948(0x7f06012c, float:1.7812264E38)
            r4 = 2131887252(0x7f120494, float:1.9409106E38)
            java.lang.String r5 = X.C36361kB.A0m(r11, r4)
            r7 = 2131887251(0x7f120493, float:1.9409104E38)
        L_0x0a45:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r1] = r5
        L_0x0a49:
            java.lang.String r8 = r11.getString(r7, r4)
        L_0x0a4d:
            X.AnonymousClass00C.A08(r8)
        L_0x0a50:
            int r4 = X.AnonymousClass00F.A00(r11, r15)
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan
            r11.<init>(r4)
            int r9 = r8.length()
            int r9 = r9 - r10
            r10 = 0
            r12 = 0
        L_0x0a60:
            if (r10 > r9) goto L_0x0b71
            r4 = r9
            if (r12 != 0) goto L_0x0a66
            r4 = r10
        L_0x0a66:
            char r7 = r8.charAt(r4)
            r4 = 32
            int r7 = X.AnonymousClass00C.A00(r7, r4)
            r4 = 0
            if (r7 > 0) goto L_0x0a74
            r4 = 1
        L_0x0a74:
            if (r12 != 0) goto L_0x0a7d
            if (r4 != 0) goto L_0x0a7a
            r12 = 1
            goto L_0x0a60
        L_0x0a7a:
            int r10 = r10 + 1
            goto L_0x0a60
        L_0x0a7d:
            if (r4 == 0) goto L_0x0b71
            int r9 = r9 + -1
            goto L_0x0a60
        L_0x0a82:
            r18 = 2
            r4 = 2
            if (r5 != r4) goto L_0x0a95
            r15 = 2131099948(0x7f06012c, float:1.7812264E38)
            r4 = 2131887245(0x7f12048d, float:1.9409092E38)
            java.lang.String r5 = X.C36361kB.A0m(r11, r4)
            r7 = 2131887244(0x7f12048c, float:1.940909E38)
            goto L_0x0a45
        L_0x0a95:
            if (r5 != 0) goto L_0x0b6a
            r4 = 11
            int r4 = r9.get(r4)
            int r7 = r4 * 60
            r4 = 12
            int r4 = r9.get(r4)
            int r7 = r7 + r4
            java.util.Iterator r12 = r20.iterator()
            r17 = 1
        L_0x0aac:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0b6a
            java.lang.Object r5 = r12.next()
            X.3XO r5 = (X.AnonymousClass3XO) r5
            if (r5 == 0) goto L_0x0b03
            java.lang.Integer r4 = r5.A03
        L_0x0abc:
            X.C18740tg.A06(r4)
            if (r5 == 0) goto L_0x0b01
            java.lang.Integer r5 = r5.A02
        L_0x0ac3:
            X.C18740tg.A06(r5)
            int r4 = X.C36411kG.A07(r4)
            if (r7 >= r4) goto L_0x0af1
            java.util.Calendar r9 = A00(r9, r13, r4)
            r4 = 2131887248(0x7f120490, float:1.9409098E38)
            java.lang.String r5 = X.C36361kB.A0m(r11, r4)
            r8 = 2131887247(0x7f12048f, float:1.9409096E38)
            java.lang.Object[] r7 = X.C36441kJ.A1Q()
            r7[r1] = r5
            r4 = r25
            java.lang.String r4 = X.AnonymousClass3UM.A03(r4, r9)
            r7[r10] = r4
            r9 = 2
            r4 = r19
            java.lang.String r8 = X.C36391kE.A0v(r11, r4, r7, r9, r8)
            goto L_0x0a4d
        L_0x0af1:
            int r4 = X.C36411kG.A07(r5)
            if (r7 <= r4) goto L_0x0b05
            r4 = 2131887246(0x7f12048e, float:1.9409094E38)
            java.lang.String r8 = X.C36361kB.A0m(r11, r4)
            r17 = 0
            goto L_0x0aac
        L_0x0b01:
            r5 = 0
            goto L_0x0ac3
        L_0x0b03:
            r4 = 0
            goto L_0x0abc
        L_0x0b05:
            java.util.Calendar r5 = A00(r9, r13, r4)
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()
            r4 = r25
            java.lang.String r4 = X.AnonymousClass3UM.A03(r4, r5)
            r12.append(r4)
            int r4 = r20.size()
            if (r4 <= r10) goto L_0x0b54
            if (r17 == 0) goto L_0x0b54
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r7 = r4
            java.lang.String r5 = " "
            r4 = 2131887243(0x7f12048b, float:1.9409088E38)
            java.lang.String r4 = X.C36391kE.A0v(r11, r5, r7, r1, r4)
            r12.append(r4)
            r4 = r20
            java.lang.Object r4 = r4.get(r10)
            X.3XO r4 = (X.AnonymousClass3XO) r4
            if (r4 == 0) goto L_0x0b6a
            java.lang.Integer r5 = r4.A03
            int r5 = X.C36411kG.A06(r5)
            java.util.Calendar r5 = A00(r9, r13, r5)
            java.lang.Integer r4 = r4.A02
            int r4 = X.C36411kG.A06(r4)
            java.util.Calendar r7 = A00(r9, r13, r4)
            r4 = r25
            java.lang.String r4 = X.AnonymousClass3UM.A04(r4, r5, r7)
            r12.append(r4)
        L_0x0b54:
            r15 = 2131099948(0x7f06012c, float:1.7812264E38)
            r4 = 2131887255(0x7f120497, float:1.9409112E38)
            java.lang.String r5 = X.C36361kB.A0m(r11, r4)
            r7 = 2131887254(0x7f120496, float:1.940911E38)
            r4 = 3
            java.lang.Object[] r4 = X.C36431kI.A1a(r5, r12, r4)
            r4[r18] = r19
            goto L_0x0a49
        L_0x0b6a:
            r5 = r8
            goto L_0x0a50
        L_0x0b6d:
            java.lang.String r19 = ""
            goto L_0x0a19
        L_0x0b71:
            int r4 = r9 + 1
            java.lang.CharSequence r4 = r8.subSequence(r10, r4)
            java.lang.String r4 = r4.toString()
            int r9 = X.AnonymousClass099.A0C(r4, r5, r1, r1)
            int r8 = X.C36441kJ.A09(r5, r9)
            android.text.SpannableString r7 = X.C36441kJ.A0O(r4)
            r5 = 33
            r7.setSpan(r11, r9, r8, r5)
            X.1mJ r4 = new X.1mJ
            r4.<init>()
            r7.setSpan(r4, r9, r8, r5)
            r4 = r21
            r4.append(r7)
        L_0x0b99:
            if (r22 == 0) goto L_0x0bb7
            int r4 = r21.length()
            if (r4 <= 0) goto L_0x0bac
            java.lang.String r4 = " • "
            android.text.SpannableString r5 = X.C36441kJ.A0O(r4)
            r4 = r21
            r4.append(r5)
        L_0x0bac:
            X.9uZ r4 = r0.A0I
            X.6bQ r4 = r4.A06
            java.lang.String r5 = r4.A02
            r4 = r21
            r4.append(r5)
        L_0x0bb7:
            r5 = r24
            r4 = r21
            X.C36431kI.A1M(r5, r4)
            r5.setVisibility(r1)
            goto L_0x050e
        L_0x0bc3:
            java.lang.String r5 = ""
            goto L_0x04dd
        L_0x0bc7:
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.LinkedHashMap r11 = X.C36431kI.A1G()
            java.util.Iterator r10 = r4.iterator()
        L_0x0bd3:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0bec
            java.lang.Object r5 = r10.next()
            r4 = r5
            X.6bd r4 = (X.C134806bd) r4
            java.lang.String r4 = r4.A02
            java.lang.Object r4 = X.C36391kE.A0s(r4, r11)
            java.util.List r4 = (java.util.List) r4
            r4.add(r5)
            goto L_0x0bd3
        L_0x0bec:
            java.util.Iterator r13 = X.AnonymousClass000.A0y(r11)
        L_0x0bf0:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x0c1f
            java.lang.Object r11 = X.C36351kA.A0u(r13)
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r10 = r11.iterator()
        L_0x0c00:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0c17
            java.lang.Object r5 = r10.next()
            r4 = r5
            X.6bd r4 = (X.C134806bd) r4
            boolean r4 = r4.A04
            if (r4 == 0) goto L_0x0c00
            if (r5 == 0) goto L_0x0c17
            r9.add(r5)
            goto L_0x0bf0
        L_0x0c17:
            java.lang.Object r4 = r11.get(r1)
            r9.add(r4)
            goto L_0x0bf0
        L_0x0c1f:
            X.0ts r4 = r12.A04
            java.text.Collator r4 = X.C36361kB.A0p(r4)
            r4.setStrength(r1)
            X.4NN r5 = new X.4NN
            r5.<init>(r4)
            r4 = 1
            java.util.List r5 = X.AnonymousClass4YZ.A00(r9, r5, r4)
            X.AnonymousClass00C.A0D(r5, r1)
            java.util.List r4 = r7.A00
            r4.clear()
            r4.addAll(r5)
            r7.A06()
        L_0x0c40:
            X.0v5 r4 = r0.A0T
            java.lang.Object r7 = r4.A03()
            X.1K3 r7 = (X.AnonymousClass1K3) r7
            com.whatsapp.jid.UserJid r4 = r0.A0A()
            if (r7 == 0) goto L_0x0c79
            if (r4 == 0) goto L_0x0c79
            boolean r4 = r7.BLB(r4)
            if (r4 == 0) goto L_0x0c79
            com.whatsapp.TextEmojiLabel r5 = r0.A0a
            r4 = 2131887022(0x7f1203ae, float:1.940864E38)
            r5.setText(r4)
            r4 = 2131100167(0x7f060207, float:1.7812708E38)
            r7.B1X(r5, r4, r1)
            com.whatsapp.WaTextView r4 = r0.A0c
            A01(r4, r0, r2)
            r4 = r40
            A01(r4, r0, r2)
            A01(r8, r0, r2)
            com.whatsapp.TextEmojiLabel r5 = r0.A06
            r4 = 2131887015(0x7f1203a7, float:1.9408625E38)
            r5.setText(r4)
        L_0x0c79:
            java.lang.String r7 = r6.A0J()
            if (r7 == 0) goto L_0x0d48
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x0d48
            char r5 = r7.charAt(r1)
            r4 = 64
            if (r5 != r4) goto L_0x0d48
            A05(r0, r7)
        L_0x0c90:
            boolean r4 = r0.A1E
            if (r4 == 0) goto L_0x0c99
            r4 = r40
            A01(r4, r0, r2)
        L_0x0c99:
            boolean r4 = A09(r0)
            if (r4 == 0) goto L_0x0cdc
            if (r16 == 0) goto L_0x0ca6
            r4 = r16
            r4.setVisibility(r2)
        L_0x0ca6:
            r2 = 2131428289(0x7f0b03c1, float:1.8478218E38)
            android.view.ViewStub r2 = X.C36431kI.A0M(r3, r2)
            if (r2 == 0) goto L_0x0cb8
            android.view.View r4 = r2.inflate()
            r2 = 32
            X.C36421kH.A10(r4, r0, r2)
        L_0x0cb8:
            X.9uZ r2 = r0.A0I
            if (r2 == 0) goto L_0x0cdc
            java.lang.String r5 = r2.A0G
            boolean r2 = X.AnonymousClass14B.A0F(r5)
            if (r2 != 0) goto L_0x0cdc
            r2 = 2131428368(0x7f0b0410, float:1.8478379E38)
            android.view.ViewStub r2 = X.C36431kI.A0M(r3, r2)
            if (r2 != 0) goto L_0x0d3c
            r2 = 2131428293(0x7f0b03c5, float:1.8478226E38)
            android.view.View r2 = r3.findViewById(r2)
        L_0x0cd4:
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r5)
            r2.setVisibility(r1)
        L_0x0cdc:
            X.9uZ r2 = r0.A0I
            if (r2 == 0) goto L_0x0d66
            java.util.List r5 = r2.A0P
            if (r5 == 0) goto L_0x0d66
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x0d66
            r2 = 2131428291(0x7f0b03c3, float:1.8478222E38)
            android.view.ViewStub r2 = X.C36431kI.A0M(r3, r2)
            if (r2 == 0) goto L_0x0d66
            android.view.View r4 = r2.inflate()
            r2 = 2131428290(0x7f0b03c2, float:1.847822E38)
            android.view.ViewGroup r8 = X.C36411kG.A0P(r4, r2)
            if (r8 == 0) goto L_0x0d66
            java.util.Iterator r9 = r5.iterator()
        L_0x0d04:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0d66
            java.lang.Object r7 = r9.next()
            X.3uw r7 = (X.C80153uw) r7
            android.view.LayoutInflater r4 = X.C36351kA.A0C(r3)
            r2 = 2131626361(0x7f0e0979, float:1.8879956E38)
            android.view.View r6 = r4.inflate(r2, r8, r1)
            boolean r2 = r6 instanceof com.google.android.material.chip.Chip
            if (r2 == 0) goto L_0x0d38
            r5 = r6
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object[] r4 = X.AnonymousClass001.A0L()
            java.lang.String r2 = r7.A01
            r4[r1] = r2
            java.lang.String r2 = "/%s"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r5.setText(r2)
            r2 = 11
            X.C36411kG.A1C(r6, r0, r7, r2)
        L_0x0d38:
            r8.addView(r6)
            goto L_0x0d04
        L_0x0d3c:
            android.view.View r4 = r2.inflate()
            r2 = 2131428293(0x7f0b03c5, float:1.8478226E38)
            android.view.View r2 = X.C012005e.A02(r4, r2)
            goto L_0x0cd4
        L_0x0d48:
            X.11F r9 = r6.A0H
            if (r9 == 0) goto L_0x0c90
            X.5vU r8 = r0.A18
            X.00s r7 = X.C36431kI.A0S()
            X.040 r6 = r8.A03
            r5 = 0
            com.whatsapp.usernames.ContactUsernameProvider$getUsernameForJid$1$1 r4 = new com.whatsapp.usernames.ContactUsernameProvider$getUsernameForJid$1$1
            r4.<init>(r7, r9, r8, r5)
            X.C36331k8.A1T(r4, r6)
            com.whatsapp.chatinfo.ContactInfoActivity r5 = r0.A0k
            r4 = 16
            X.C55492ui.A01(r5, r7, r0, r4)
            goto L_0x0c90
        L_0x0d66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69273dG.A04(X.3dG, X.9uI, X.141, X.1fX, boolean, boolean, boolean):void");
    }
}

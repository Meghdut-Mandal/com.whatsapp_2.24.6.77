package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass16K;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass19A;
import X.AnonymousClass1A5;
import X.AnonymousClass1LY;
import X.AnonymousClass1N6;
import X.AnonymousClass1RJ;
import X.AnonymousClass1Sk;
import X.AnonymousClass2Es;
import X.AnonymousClass3YE;
import X.AnonymousClass4YE;
import X.C03570Gk;
import X.C125405zr;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C20350xQ;
import X.C20380xT;
import X.C220412q;
import X.C24381Cf;
import X.C24521Ct;
import X.C26801Lo;
import X.C27731Pn;
import X.C27751Pr;
import X.C28081Rg;
import X.C28421Sp;
import X.C28431Sq;
import X.C32681e1;
import X.C33511fU;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C43202Fo;
import X.C51432no;
import X.C61503Cd;
import X.C66933Xw;
import X.C68443bu;
import X.C81093wS;
import X.C88504Sy;
import X.C89324Wc;
import X.C89644Xi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class NewCommunityActivity extends AnonymousClass2Es implements C88504Sy {
    public static final int[] A0R = {127979, 127969, 129716, 127800, 127912, 128218, 127916, 128054, 128049, 127918, 128663, 128247, 128241, 127958, 9917, 127936, 127955, 127944, 128512, 127828, 127922, 9992, 10084};
    public ImageView A00;
    public C28431Sq A01;
    public AnonymousClass16D A02;
    public C43202Fo A03;
    public AnonymousClass171 A04;
    public C27731Pn A05;
    public C33751fs A06;
    public C220412q A07;
    public AnonymousClass1A5 A08;
    public C24381Cf A09;
    public AnonymousClass17X A0A;
    public C20350xQ A0B;
    public C125405zr A0C;
    public C26801Lo A0D;
    public C61503Cd A0E;
    public AnonymousClass147 A0F;
    public AnonymousClass19A A0G;
    public AnonymousClass1LY A0H;
    public C20380xT A0I;
    public AnonymousClass1N6 A0J;
    public C28081Rg A0K;
    public C32681e1 A0L;
    public int[] A0M;
    public boolean A0N;
    public final Runnable A0O;
    public final AtomicReference A0P;
    public final C24521Ct A0Q;

    public boolean A2g() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0084, code lost:
        if (r7.A0D.A0E(5453) == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(android.net.Uri r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            r22 = this;
            r7 = r22
            boolean r0 = X.C36431kI.A1R(r7)
            if (r0 != 0) goto L_0x0011
            X.1Sk r0 = r7.A0A
            r0.A04()
            A0G(r7)
            return
        L_0x0011:
            r0 = 2131888541(0x7f12099d, float:1.941172E38)
            r7.Bu1(r0)
            X.0wo r14 = r7.A07
            X.0yC r15 = r7.A0D
            X.17Y r9 = r7.A05
            X.0wN r8 = r7.A03
            X.0wQ r10 = r7.A02
            X.19A r5 = r7.A0G
            X.16D r12 = r7.A02
            X.0xQ r4 = r7.A0B
            X.1Rg r3 = r7.A0K
            X.16K r13 = r7.A0B
            X.1P3 r2 = r7.A0F
            X.1Lo r1 = r7.A0D
            X.3Cd r0 = r7.A0E
            X.30s r11 = new X.30s
            r11.<init>(r7)
            X.3OG r6 = new X.3OG
            r17 = r1
            r18 = r0
            r19 = r5
            r20 = r2
            r21 = r3
            r16 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.util.HashSet r3 = X.C36441kJ.A16()
            r1 = r26
            if (r26 == 0) goto L_0x007b
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r1 = r0.A06(r1)
            if (r1 == 0) goto L_0x0060
            X.1A5 r0 = r7.A08
            X.141 r0 = r0.A01(r1)
            r3.add(r0)
        L_0x0060:
            r2 = 0
        L_0x0061:
            java.util.Set r5 = java.util.Collections.emptySet()
            r0 = 0
            r4 = r24
            X.C36331k8.A1G(r4, r0, r5)
            X.0yC r10 = r6.A08
            r0 = 5543(0x15a7, float:7.767E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "Community creation disabled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x007b:
            X.0yC r1 = r7.A0D
            r0 = 5453(0x154d, float:7.641E-42)
            boolean r0 = r1.A0E(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0061
            goto L_0x0060
        L_0x0087:
            X.0wo r9 = r6.A07
            long r0 = X.C19970wo.A00(r9)
            r6.A00 = r0
            X.0xQ r11 = r6.A09
            X.146 r0 = r11.A0P()
            X.0wN r7 = r6.A03
            X.0wQ r8 = r6.A04
            X.19A r14 = r6.A0C
            X.3mm r12 = new X.3mm
            r1 = r23
            r12.<init>(r1, r6, r3, r5)
            X.3FK r1 = new X.3FK
            r1.<init>(r0)
            r1.A03 = r4
            r0 = r25
            r1.A02 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r1.A04 = r0
            r0 = 1
            r1.A0A = r0
            r1.A0B = r2
            X.3B9 r13 = r1.A00()
            X.3pa r6 = new X.3pa
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r6.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.NewCommunityActivity.A01(android.net.Uri, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void A07(NewCommunityActivity newCommunityActivity) {
        String rawString;
        Editable text = newCommunityActivity.A08.getText();
        if (text == null) {
            text = "";
        }
        String A0z = C36411kG.A0z(text);
        Editable text2 = newCommunityActivity.A07.getText();
        if (text2 == null) {
            text2 = "";
        }
        String A0z2 = C36411kG.A0z(text2);
        AnonymousClass147 r0 = newCommunityActivity.A0F;
        Uri uri = null;
        if (r0 == null) {
            rawString = null;
        } else {
            rawString = r0.getRawString();
        }
        File A002 = newCommunityActivity.A0B.A00(newCommunityActivity.A03);
        if (A002 != null) {
            uri = Uri.fromFile(A002);
        }
        AnonymousClass1Sk r6 = newCommunityActivity.A0A;
        int i = 1;
        if (rawString == null) {
            i = 0;
        }
        C28421Sp r02 = r6.A02;
        String A003 = r02.A00();
        Integer num = r02.A00;
        if (i > 0) {
            r6.A08(num, C36441kJ.A0y(i), A003, (String) null, 6, 4);
        }
        r6.A08(num, (Long) null, A003, (String) null, 7, 4);
        AnonymousClass147 r03 = newCommunityActivity.A0F;
        if (r03 == null) {
            newCommunityActivity.A01(uri, A0z, A0z2, rawString);
            return;
        }
        List singletonList = Collections.singletonList(r03);
        C51432no r4 = C51432no.GROUP_UPGRADE;
        AnonymousClass00C.A0D(singletonList, 0);
        CommunityConfirmLinkDialogFragment communityConfirmLinkDialogFragment = new CommunityConfirmLinkDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putStringArrayList("subgroup_jid_list", AnonymousClass143.A07(singletonList));
        A072.putString("link_mode", r4.toString());
        communityConfirmLinkDialogFragment.A17(A072);
        communityConfirmLinkDialogFragment.A1i(newCommunityActivity.getSupportFragmentManager(), (String) null);
    }

    public void A2F() {
        if (!this.A0N) {
            this.A0N = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0B = (AnonymousClass16K) A0B2.A2C.get();
            this.A0D = C36381kD.A0b(A0B2);
            this.A0F = C36391kE.A0k(A0B2);
            this.A0A = C36431kI.A0Z(A0B2);
            this.A09 = (C28421Sp) A0B2.ADy.get();
            this.A0E = C36351kA.A0m(A0B2);
            this.A0C = C36361kB.A0W(A0B2);
            this.A0L = C36351kA.A0p(r1);
            this.A07 = C36351kA.A0a(A0B2);
            this.A0H = (AnonymousClass1LY) A0B2.A5r.get();
            this.A05 = C36351kA.A0T(A0B2);
            this.A0G = C36361kB.A0c(A0B2);
            this.A0I = C36331k8.A0I(A0B2);
            this.A04 = C36341k9.A0S(A0B2);
            this.A02 = C36341k9.A0R(A0B2);
            this.A0B = C36361kB.A0a(A0B2);
            this.A0K = C18800tq.ALZ(A0B2);
            this.A01 = C36391kE.A0b(A0B2);
            this.A0D = C36431kI.A0f(A0B2);
            this.A06 = C36361kB.A0X(r1);
            this.A09 = C36371kC.A0Y(A0B2);
            this.A0A = C36351kA.A0b(A0B2);
            this.A08 = C36371kC.A0X(A0B2);
            this.A0J = C36361kB.A0e(A0B2);
            this.A0E = r1.A5f();
            this.A0C = (C125405zr) r1.A8o.get();
        }
    }

    public void A2X() {
        this.A0J.A03((AnonymousClass11F) null, 11);
    }

    public void BT0() {
        AnonymousClass1Sk r1 = this.A0A;
        C28421Sp r0 = r1.A02;
        r1.A08(r0.A00, (Long) null, r0.A00(), (String) null, 14, 9);
    }

    public void BUG() {
        AnonymousClass1Sk r3 = this.A0A;
        C28421Sp r0 = r3.A02;
        String str = null;
        r3.A08(r0.A00, (Long) null, r0.A00(), (String) null, 13, 9);
        Editable text = this.A08.getText();
        if (text == null) {
            text = "";
        }
        String A0z = C36411kG.A0z(text);
        Editable text2 = this.A07.getText();
        if (text2 == null) {
            text2 = "";
        }
        String A0z2 = C36411kG.A0z(text2);
        AnonymousClass147 r02 = this.A0F;
        Uri uri = null;
        if (r02 != null) {
            str = r02.getRawString();
        }
        File A002 = this.A0B.A00(this.A03);
        if (A002 != null) {
            uri = Uri.fromFile(A002);
        }
        A01(uri, A0z, A0z2, str);
    }

    public void onBackPressed() {
        String A002 = this.A09.A00();
        this.A0A.A09(this.A09.A00, A002, 8, 4);
        super.onBackPressed();
    }

    public NewCommunityActivity(int i) {
        this.A0N = false;
        C89324Wc.A00(this, 12);
    }

    public static void A0F(NewCommunityActivity newCommunityActivity) {
        Bitmap A092 = C36401kF.A09(newCommunityActivity, newCommunityActivity.A0C, newCommunityActivity.A03, newCommunityActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        if (A092 != null) {
            newCommunityActivity.A03.setImageDrawable(newCommunityActivity.A0D.A01(newCommunityActivity.getResources(), A092, C68443bu.A00));
        } else {
            newCommunityActivity.A0B.A04(newCommunityActivity.A03);
        }
    }

    public static void A0G(NewCommunityActivity newCommunityActivity) {
        newCommunityActivity.A37(new C89644Xi(newCommunityActivity, 1), 0, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (i != 64206) {
            if (i == 16436755) {
                this.A0F.A03(this.A03).delete();
                if (i2 != -1) {
                    if (i2 == 0 && intent != null) {
                        this.A0F.A04(intent, this);
                        return;
                    }
                    return;
                }
            } else if (i == 16436756 && i2 == -1) {
                finish();
                return;
            } else {
                super.onActivityResult(i, i2, intent);
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    Log.i("newcommunity/resetphoto");
                    File A002 = this.A0B.A00(this.A03);
                    C18740tg.A06(A002);
                    A002.delete();
                    File A012 = this.A0B.A01(this.A03);
                    C18740tg.A06(A012);
                    A012.delete();
                    ImageView imageView = this.A03;
                    C27751Pr r3 = this.A0D;
                    C36391kE.A1B(getTheme(), getResources(), imageView, C68443bu.A00, r3);
                    this.A05.A06(R.string.f12nameremoved, 0);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    this.A0F.A03(this.A03).delete();
                }
            }
            Log.i("newcommunity/cropphoto");
            this.A0F.A06(intent2, this, this, this.A03, 16436755);
            return;
        } else {
            return;
        }
        Log.i("newcommunity/photopicked");
        A0F(this);
    }

    public void onCreate(Bundle bundle) {
        String string;
        String string2;
        super.onCreate(bundle);
        if (bundle == null || (string2 = bundle.getString("dummy_community_photo_id", (String) null)) == null) {
            this.A03 = new C43202Fo(this.A03, this.A0B.A0P().getRawString());
        } else {
            this.A03 = new C43202Fo(this.A03, string2);
        }
        A0F(this);
        this.A09.registerObserver(this.A0Q);
        String stringExtra = getIntent().getStringExtra("NewCommunityActivity_group_to_be_added");
        if (stringExtra != null) {
            this.A0F = AnonymousClass147.A01.A06(stringExtra);
        }
        int intExtra = getIntent().getIntExtra("NewCommunityActivity_current_screen", -1);
        if (!this.A0H.A01((Object) null, "community") && intExtra != 3 && !BLh()) {
            AnonymousClass147 r3 = this.A0F;
            Intent A0D2 = C36431kI.A0D();
            A0D2.setClassName(getPackageName(), "com.whatsapp.community.CommunityNUXActivity");
            if (r3 != null) {
                A0D2.putExtra("CommunityNUXActivity_group_to_be_added", r3.getRawString());
            }
            startActivity(A0D2);
            finish();
        }
        C36361kB.A0v(this, R.id.camera_icon);
        C66933Xw.A00(C36391kE.A0L(C36361kB.A0h(this, R.id.new_community_icon_randomizer), 0), this, 41);
        TextView A0H2 = C36401kF.A0H(this, R.id.new_community_change_photo);
        C33511fU.A03(A0H2);
        A0H2.setOnClickListener(this.A01);
        A0H2.setVisibility(0);
        this.A07.setText(R.string.f12nameremoved);
        if (this.A0F != null) {
            AnonymousClass1RJ A0h = C36361kB.A0h(this, R.id.link_group_row_container);
            A0h.A03(0);
            getWindow().setSoftInputMode(2);
            View A0B2 = C03570Gk.A0B(this, R.id.added_subgroup_row_remove_button);
            C36331k8.A0q(this, A0B2, R.string.f12nameremoved);
            AnonymousClass3YE.A00(A0B2, this, A0h, 21);
            TextView A0H3 = C36401kF.A0H(this, R.id.added_subgroup_row_group_name);
            C33511fU.A03(A0H3);
            A0H3.setText(this.A07.A0D(this.A0F));
            this.A05.A03(this, this, "new-community").A08(C36431kI.A0P(this, R.id.added_subgroup_row_group_icon), this.A02.A0D(this.A0F));
            TextEmojiLabel A0e = C36441kJ.A0e(this, R.id.added_subgroup_row_group_status);
            AnonymousClass17X r0 = this.A0A;
            if (r0.A07.A0C(this.A0F).A0O(this.A02)) {
                string = AnonymousClass171.A04(this.A04, this.A0F, 1, true);
            } else {
                string = getResources().getString(R.string.f12nameremoved);
            }
            A0e.A0I(string);
        }
        this.A0M = getResources().getIntArray(R.array.f3nameremoved);
        this.A00 = (ImageView) C36361kB.A0E(LayoutInflater.from(this), (ViewGroup) this.A00, R.layout.f9nameremoved);
        C36361kB.A0h(this, R.id.see_community_examples_with_divider).A03(0);
        TextView A0H4 = C36401kF.A0H(this, R.id.see_examples_of_different_communities);
        String A0v = C36391kE.A0v(this, "learn-more", AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
        A0H4.setText(this.A0L.A03(A0H4.getContext(), new C81093wS(this, 19), A0v, "learn-more", C36341k9.A05(A0H4.getContext())));
        C36331k8.A0z(A0H4, this, this.A0D);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.unregisterObserver(this.A0Q);
        this.A04.Bnx(this.A0O);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass1Sk r1 = this.A0A;
        C28421Sp r0 = r1.A02;
        r1.A08(r0.A00, (Long) null, r0.A00(), (String) null, 12, 4);
        this.A06.A01(this, "community-examples-article");
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C43202Fo r0 = this.A03;
        if (r0 != null) {
            bundle.putString("dummy_community_photo_id", r0.A00);
        }
    }

    public NewCommunityActivity() {
        this(0);
        this.A0P = new AtomicReference();
        this.A0Q = new AnonymousClass4YE(this, 8);
        this.A0O = new C81093wS(this, 20);
        this.A0F = null;
    }
}

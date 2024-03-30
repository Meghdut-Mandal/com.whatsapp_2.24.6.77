package com.whatsapp.profile;

import X.AnonymousClass07B;
import X.AnonymousClass141;
import X.AnonymousClass142;
import X.AnonymousClass155;
import X.AnonymousClass16I;
import X.AnonymousClass1H2;
import X.AnonymousClass1JZ;
import X.AnonymousClass1N2;
import X.AnonymousClass1P3;
import X.AnonymousClass1Pp;
import X.AnonymousClass1XN;
import X.AnonymousClass22t;
import X.AnonymousClass2gA;
import X.AnonymousClass3ED;
import X.AnonymousClass3J6;
import X.AnonymousClass3SK;
import X.AnonymousClass3Y5;
import X.AnonymousClass4W3;
import X.AnonymousClass6O1;
import X.AnonymousClass6X5;
import X.C013405v;
import X.C1261362r;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19420v0;
import X.C19890wg;
import X.C202899mr;
import X.C20720y3;
import X.C20810yC;
import X.C21060yb;
import X.C21360z5;
import X.C226815j;
import X.C27761Ps;
import X.C28361Si;
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
import X.C36421kH;
import X.C36431kI;
import X.C66763Xf;
import X.C81133wW;
import X.C87484Oz;
import X.C88314Sf;
import X.C89354Wf;
import X.C89604Xe;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.util.Log;

public class ProfilePhotoReminder extends AnonymousClass155 {
    public View A00;
    public ImageView A01;
    public C21360z5 A02;
    public WaEditText A03;
    public AnonymousClass1Pp A04;
    public AnonymousClass16I A05;
    public C27761Ps A06;
    public AnonymousClass141 A07;
    public C1261362r A08;
    public AnonymousClass6O1 A09;
    public AnonymousClass1XN A0A;
    public AnonymousClass3J6 A0B;
    public EmojiSearchProvider A0C;
    public C20720y3 A0D;
    public C28361Si A0E;
    public C19890wg A0F;
    public AnonymousClass1P3 A0G;
    public AnonymousClass3ED A0H;
    public Bitmap A0I;
    public Handler A0J;
    public Runnable A0K;
    public boolean A0L;
    public final C88314Sf A0M;
    public final C226815j A0N;

    public static void A01(ProfilePhotoReminder profilePhotoReminder) {
        Bitmap A072;
        ProfilePhotoReminder profilePhotoReminder2 = profilePhotoReminder;
        profilePhotoReminder.A00.setVisibility(8);
        int dimensionPixelSize = profilePhotoReminder.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        float dimension = profilePhotoReminder.getResources().getDimension(R.dimen.f7nameremoved);
        if (C202899mr.A02(C36411kG.A0j(profilePhotoReminder))) {
            profilePhotoReminder2.A01.setEnabled(false);
            profilePhotoReminder2.A00.setVisibility(0);
            A072 = profilePhotoReminder2.A0I;
            if (A072 == null) {
                A072 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ALPHA_8);
                profilePhotoReminder2.A0I = A072;
            }
        } else {
            profilePhotoReminder2.A01.setEnabled(true);
            profilePhotoReminder2.A00.setVisibility(4);
            A072 = profilePhotoReminder2.A06.A07(profilePhotoReminder2, profilePhotoReminder2.A07, dimension, dimensionPixelSize, false);
            if (A072 == null) {
                AnonymousClass141 r1 = profilePhotoReminder2.A07;
                if (r1.A06 == 0 && r1.A05 == 0) {
                    profilePhotoReminder2.A00.setVisibility(0);
                    Handler handler = profilePhotoReminder2.A0J;
                    if (handler == null) {
                        handler = C36341k9.A0H();
                        profilePhotoReminder2.A0J = handler;
                        profilePhotoReminder2.A0K = new C81133wW((Object) profilePhotoReminder2, 11);
                    }
                    handler.removeCallbacks(profilePhotoReminder2.A0K);
                    profilePhotoReminder2.A0J.postDelayed(profilePhotoReminder2.A0K, AnonymousClass6X5.A0L);
                } else {
                    profilePhotoReminder2.A00.setVisibility(4);
                }
                A072 = AnonymousClass1Pp.A01(profilePhotoReminder2.A00.getContext(), profilePhotoReminder2.A04, dimension, R.drawable.avatar_contact, dimensionPixelSize);
            }
        }
        profilePhotoReminder2.A01.setImageBitmap(A072);
    }

    public void A2F() {
        if (!this.A0L) {
            this.A0L = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A02 = C36401kF.A0N(A0B2);
            this.A0A = C36351kA.A0d(A0B2);
            this.A08 = C36371kC.A0b(r1);
            this.A04 = C36361kB.A0V(A0B2);
            this.A0D = C36401kF.A0c(A0B2);
            this.A0H = (AnonymousClass3ED) r1.ABY.get();
            this.A05 = C36351kA.A0S(A0B2);
            this.A0C = C36351kA.A0f(r1);
            this.A0E = C36371kC.A0g(A0B2);
            this.A0G = C36391kE.A0k(A0B2);
            this.A0F = C36351kA.A0m(A0B2);
            this.A06 = C36361kB.A0W(A0B2);
            this.A09 = C36351kA.A0c(r1);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 12) {
            if (i != 13) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            C36411kG.A1J(this.A0G);
            if (i2 != -1) {
                if (i2 == 0 && intent != null) {
                    this.A0G.A04(intent, this);
                    return;
                }
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    this.A00.setVisibility(0);
                    this.A0G.A0D(this.A07);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    C36411kG.A1J(this.A0G);
                }
            }
            this.A0G.A05(intent, this, 13);
            return;
        } else {
            return;
        }
        if (this.A0G.A0F(this.A07)) {
            this.A00.setVisibility(0);
        }
    }

    public void onBackPressed() {
        if (!this.A0B.A03()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        AnonymousClass07B A0O = C36381kD.A0O(this);
        A0O.A0V(true);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass142 A0V = C36431kI.A0V(this);
        this.A07 = A0V;
        if (A0V == null) {
            Log.i("profilephotoreminder/create/no-me");
            C36351kA.A12(this);
            return;
        }
        TextView A0H2 = C36401kF.A0H(this, R.id.name_counter_tv);
        this.A03 = (WaEditText) findViewById(R.id.registration_name);
        C20810yC r18 = this.A0D;
        AnonymousClass1N2 r16 = this.A0C;
        AnonymousClass1H2 r15 = this.A0C;
        AnonymousClass1XN r14 = this.A0A;
        C21060yb r11 = this.A08;
        C18820ts r10 = this.A00;
        C1261362r r9 = this.A08;
        EmojiSearchProvider emojiSearchProvider = this.A0C;
        C19420v0 r6 = this.A09;
        C19890wg r5 = this.A0F;
        WaEditText waEditText = this.A03;
        AnonymousClass1N2 r30 = r16;
        C87484Oz r182 = (C87484Oz) findViewById(R.id.main);
        WaEditText waEditText2 = waEditText;
        C21060yb r20 = r11;
        ImageButton imageButton = (ImageButton) findViewById(R.id.emoji_btn);
        AnonymousClass22t r142 = new AnonymousClass22t(this, imageButton, this.A03, r182, waEditText2, r20, r6, r10, r9, this.A09, r14, r15, emojiSearchProvider, r18, r5, r30, 23, (Integer) null);
        r142.A0H(this.A0M);
        AnonymousClass3J6 r3 = new AnonymousClass3J6(this, r142, (EmojiSearchContainer) findViewById(R.id.emoji_search_container));
        this.A0B = r3;
        AnonymousClass3J6.A00(r3, this, 7);
        r142.A0F = new C81133wW((Object) this, 10);
        ImageView A0Q = C36411kG.A0Q(this, R.id.change_photo_btn);
        this.A01 = A0Q;
        AnonymousClass3Y5.A00(A0Q, this, 34);
        C18820ts r52 = this.A00;
        String string = getString(R.string.f12nameremoved);
        AnonymousClass3Y5 r32 = new AnonymousClass3Y5(this, 35);
        View A0E2 = C36361kB.A0E(LayoutInflater.from(A0O.A0A()), (ViewGroup) null, R.layout.f9nameremoved);
        C013405v r1 = new C013405v(-2, -2);
        r1.A00 = C36421kH.A01(C36351kA.A1Y(r52) ? 1 : 0);
        A0O.A0O(A0E2, r1);
        C36391kE.A0P(A0E2, R.id.action_done_text).setText(string.toUpperCase(C36401kF.A0x(r52)));
        A0E2.findViewById(R.id.action_done).setOnClickListener(r32);
        this.A00 = findViewById(R.id.change_photo_progress);
        A01(this);
        AnonymousClass1JZ.A09(this.A03, this.A00);
        WaEditText waEditText3 = this.A03;
        AnonymousClass1H2 r62 = this.A0C;
        WaEditText waEditText4 = waEditText3;
        waEditText3.addTextChangedListener(new AnonymousClass2gA(waEditText4, A0H2, this.A08, this.A00, this.A0B, r62, this.A0F, 25, 0, false, false, false));
        this.A03.setFilters(new InputFilter[]{new C66763Xf(25)});
        this.A03.setText(C36391kE.A0w(this));
        WaEditText waEditText5 = this.A03;
        waEditText5.setSelection(waEditText5.length());
        if (this.A02.A03()) {
            Log.w("profilephotoreminder/clock-wrong");
            AnonymousClass3SK.A02(this, this.A0D, this.A0E);
        } else if (this.A02.A02()) {
            Log.w("profilephotoreminder/sw-expired");
            AnonymousClass3SK.A03(this, this.A0D, this.A0E);
        }
        this.A05.registerObserver(this.A0N);
    }

    public ProfilePhotoReminder(int i) {
        this.A0L = false;
        C89354Wf.A00(this, 27);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A05.unregisterObserver(this.A0N);
        Handler handler = this.A0J;
        if (handler != null) {
            handler.removeCallbacks(this.A0K);
        }
    }

    public ProfilePhotoReminder() {
        this(0);
        this.A0M = new C89604Xe(this, 10);
        this.A0N = AnonymousClass4W3.A00(this, 29);
    }
}

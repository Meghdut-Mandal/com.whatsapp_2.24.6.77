package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass0FM;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass15Q;
import X.AnonymousClass190;
import X.AnonymousClass1DU;
import X.AnonymousClass1X4;
import X.AnonymousClass1XY;
import X.AnonymousClass24H;
import X.AnonymousClass2OH;
import X.AnonymousClass3M9;
import X.AnonymousClass3T1;
import X.AnonymousClass3XT;
import X.AnonymousClass4QY;
import X.C131006Ni;
import X.C145166tS;
import X.C161947nj;
import X.C177528dw;
import X.C18740tg;
import X.C18910u1;
import X.C18950u5;
import X.C19430v1;
import X.C20800yB;
import X.C20830yE;
import X.C21000yV;
import X.C21010yW;
import X.C21360z5;
import X.C21710zg;
import X.C225314u;
import X.C229216m;
import X.C238119y;
import X.C29501Ww;
import X.C33511fU;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C64033Mj;
import X.C66943Xx;
import X.C68733cN;
import X.C87554Pg;
import X.C87574Pi;
import X.C88184Rs;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment;
import com.whatsapp.R;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.payments.ui.PaymentContactPicker;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContactPicker extends AnonymousClass24H implements C88184Rs, C87554Pg, C87574Pi, AnonymousClass15Q, AnonymousClass4QY, C161947nj {
    public View A00;
    public FragmentContainerView A01;
    public C21360z5 A02;
    public AnonymousClass1XY A03;
    public AnonymousClass1X4 A04;
    public C229216m A05;
    public BaseSharedPreviewDialogFragment A06;
    public C20830yE A07;
    public C21010yW A08;
    public AnonymousClass1DU A09;
    public WhatsAppLibLoader A0A;
    public C29501Ww A0B;
    public C68733cN A0C;
    public ContactPickerFragment A0D;

    public int A2I() {
        return 78318969;
    }

    public void Bal(ArrayList arrayList) {
    }

    public void A2x(int i) {
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1n(i);
        }
    }

    public AnonymousClass005 A3i() {
        return new C18910u1(this.A0B, (AnonymousClass004) null);
    }

    public void A3j() {
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1f();
        }
    }

    public void A3k(C131006Ni r2) {
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1g();
            ContactPickerFragment.A3r = false;
        }
    }

    public ContactPickerFragment A3n() {
        if (this instanceof PaymentContactPicker) {
            return new PaymentContactPickerFragment();
        }
        if (this instanceof AudienceSelectionContactPicker) {
            return new AudienceSelectionContactPickerFragment();
        }
        return new ContactPickerFragment();
    }

    public C68733cN BCU() {
        C68733cN r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C68733cN r02 = new C68733cN(this);
        this.A0C = r02;
        return r02;
    }

    public void BWX(int i) {
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment != null) {
            C36341k9.A0v(C238119y.A00(contactPickerFragment.A1e).edit(), "disappearing_mode_duration_for_chat_picker_int", i);
            contactPickerFragment.A1g();
        }
    }

    public void Bbo(String str) {
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment == null) {
            return;
        }
        if (contactPickerFragment.A36 || contactPickerFragment.A34 || contactPickerFragment.A3A) {
            ContactPickerFragment.A0J(contactPickerFragment, str);
        }
    }

    public void BhY(AnonymousClass3XT r17) {
        List list;
        ArrayList A15;
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment != null) {
            Log.i("contactpicker/onStatusPrivacyBottomSheetDismissedSuccessful");
            AnonymousClass3XT r1 = r17;
            boolean z = !r1.equals(contactPickerFragment.A1W);
            contactPickerFragment.A1W = r1;
            Map map = contactPickerFragment.A3o;
            C177528dw r12 = C177528dw.A00;
            if (map.containsKey(r12) || contactPickerFragment.A0A == null) {
                contactPickerFragment.A1g();
            } else {
                ContactPickerFragment.A0E(contactPickerFragment.A0A, contactPickerFragment, contactPickerFragment.A0j.A08(r12));
            }
            contactPickerFragment.A1k();
            if (z) {
                int i = -1;
                if (C20800yB.A01(C21000yV.A01, contactPickerFragment.A1g, 2531)) {
                    i = 0;
                }
                AnonymousClass3XT r2 = contactPickerFragment.A1W;
                int i2 = r2.A00;
                if (i2 == 0) {
                    A15 = null;
                } else {
                    if (i2 == 1) {
                        list = r2.A01;
                    } else {
                        list = r2.A02;
                    }
                    A15 = C36441kJ.A15(list);
                }
                C36391kE.A1Q(contactPickerFragment.A0O.A00((C225314u) contactPickerFragment.A0h(), A15, contactPickerFragment.A1W.A00, i, 0, false, false, false, false, false), contactPickerFragment.A2L);
            }
        }
    }

    public void Bpx(Bundle bundle, String str, List list) {
        C145166tS r4;
        Intent A052;
        boolean z = bundle.getBoolean("load_preview");
        C18740tg.A06(Boolean.valueOf(z));
        AnonymousClass3XT r5 = null;
        String str2 = str;
        if (z) {
            r4 = C64033Mj.A00(this.A09.A03(str));
        } else {
            r4 = null;
        }
        boolean z2 = bundle.getBoolean("has_text_from_url");
        C18740tg.A06(Boolean.valueOf(z2));
        boolean z3 = bundle.getBoolean("fb_share_wa_redirect");
        ContactPickerFragment contactPickerFragment = this.A0D;
        boolean z4 = false;
        if (contactPickerFragment != null) {
            z4 = contactPickerFragment.A24(false);
            r5 = this.A0D.A1W;
        }
        this.A04.A0I(r4, r5, (AnonymousClass3T1) null, str2, list, (List) null, false, z2);
        if (!z3) {
            if (!z4) {
                BCU().A00.Bvu(list);
            }
            if (!bundle.getBoolean("disable_post_send_intent")) {
                if (list.size() == 1) {
                    A052 = C36441kJ.A0j().A1Z(this, (AnonymousClass11F) list.get(0), 0);
                    AnonymousClass3M9.A01(A052, "ContactPicker:getPostSendIntent");
                } else {
                    A052 = AnonymousClass190.A05(this);
                }
                if (A052 != null) {
                    startActivity(A052);
                }
            }
            finish();
        }
    }

    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment == null || !contactPickerFragment.A21()) {
            super.onBackPressed();
        }
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass0FM A1b;
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment == null || (A1b = contactPickerFragment.A1b(i)) == null) {
            return super.onCreateDialog(i);
        }
        return A1b;
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A1h();
        return true;
    }

    private void A07() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) getSupportFragmentManager().A0N("ContactPickerFragment");
        this.A0D = contactPickerFragment;
        if (contactPickerFragment == null) {
            this.A0D = A3n();
            Intent intent = getIntent();
            Bundle A072 = AnonymousClass001.A07();
            if (intent.getExtras() != null) {
                A072.putAll(intent.getExtras());
                A072.remove("perf_origin");
                A072.remove("perf_start_time_ns");
                A072.remove("key_perf_tracked");
            }
            if (intent.hasExtra("android.intent.extra.shortcut.ID")) {
                A072.putString("jid", intent.getStringExtra("android.intent.extra.shortcut.ID"));
            }
            Bundle A073 = AnonymousClass001.A07();
            A073.putString("action", intent.getAction());
            A073.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, intent.getType());
            A073.putBundle("extras", A072);
            this.A0D.A17(A073);
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            A0O.A0E(this.A0D, "ContactPickerFragment", R.id.fragment);
            A0O.A01();
        }
        if (C36411kG.A1W(this.A0D)) {
            FragmentContainerView fragmentContainerView = this.A01;
            if (fragmentContainerView != null) {
                fragmentContainerView.setVisibility(0);
            }
            C36341k9.A0y(this.A00);
        }
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public C18950u5 BGv() {
        return C19430v1.A02;
    }

    public void Bih(AnonymousClass0V9 r1) {
        super.Bih(r1);
        C36391kE.A14(this);
    }

    public void Bii(AnonymousClass0V9 r1) {
        super.Bii(r1);
        C36341k9.A0n(this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass02E A0L = getSupportFragmentManager().A0L(R.id.fragment);
        if (A0L != null) {
            A0L.A1N(i, i2, intent);
        }
        if (i == 150 && this.A07.A02("android.permission.GET_ACCOUNTS") == 0 && this.A05.A00()) {
            A07();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A0A.A04()) {
            Log.i("aborting due to native libraries missing");
        } else if (C36401kF.A0M(this) == null || !this.A0A.A03()) {
            this.A05.A06(R.string.f12nameremoved, 1);
            startActivity(AnonymousClass190.A09(this));
        } else {
            if (C21360z5.A00()) {
                Log.w("contactpicker/device-not-supported");
                Btm(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
            }
            if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
                setTitle(R.string.f12nameremoved);
            }
            setContentView((int) R.layout.f9nameremoved);
            C36331k8.A0l(this);
            if (!C36411kG.A1W(this.A0D) || C36401kF.A1Y(this.A0D) || C36421kH.A1V(this) || (this.A07.A02("android.permission.GET_ACCOUNTS") == 0 && this.A05.A00())) {
                A07();
                return;
            }
            if (this.A00 == null) {
                this.A00 = ((ViewStub) findViewById(R.id.contacts_perm_banner_container)).inflate();
                setTitle(R.string.f12nameremoved);
                Toolbar A0N = C36361kB.A0N(this);
                A0N.setSubtitle((int) R.string.f12nameremoved);
                setSupportActionBar(A0N);
                C36321k7.A0O(this);
                C33511fU.A03(C36391kE.A0Q(this, R.id.banner_title));
                C66943Xx.A00(findViewById(R.id.contacts_perm_sync_btn), this, 35);
                this.A01 = (FragmentContainerView) findViewById(R.id.fragment);
                Integer A0i = C36361kB.A0i();
                AnonymousClass2OH r1 = new AnonymousClass2OH();
                r1.A00 = A0i;
                r1.A01 = A0i;
                this.A08.Bly(r1);
            }
            View view = this.A00;
            C18740tg.A04(view);
            view.setVisibility(0);
            C36341k9.A0y(this.A01);
            return;
        }
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = this.A06;
            if (baseSharedPreviewDialogFragment != null) {
                baseSharedPreviewDialogFragment.A1b();
                return true;
            }
            ContactPickerFragment contactPickerFragment = this.A0D;
            if (contactPickerFragment != null && contactPickerFragment.A21()) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A0D;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A1h();
        return true;
    }
}

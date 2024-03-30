package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass012;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass1DF;
import X.AnonymousClass1H2;
import X.AnonymousClass1RY;
import X.AnonymousClass1V2;
import X.AnonymousClass26R;
import X.AnonymousClass2JU;
import X.AnonymousClass33A;
import X.AnonymousClass3C3;
import X.AnonymousClass3HC;
import X.AnonymousClass3PH;
import X.AnonymousClass3T1;
import X.AnonymousClass3T4;
import X.AnonymousClass3TF;
import X.AnonymousClass3UJ;
import X.AnonymousClass4Q4;
import X.AnonymousClass4W7;
import X.C001600r;
import X.C012005e;
import X.C013405v;
import X.C021809f;
import X.C02680Bk;
import X.C18740tg;
import X.C18820ts;
import X.C20310xM;
import X.C21010yW;
import X.C21060yb;
import X.C21710zg;
import X.C27111My;
import X.C27731Pn;
import X.C28371Sj;
import X.C33521fV;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C43682Jk;
import X.C49412j4;
import X.C53542rU;
import X.C57892yz;
import X.C62473Gh;
import X.C64933Qa;
import X.C65503Si;
import X.C67103Yn;
import X.C81183wb;
import X.C88764Ty;
import X.C89004Uw;
import X.C89014Ux;
import X.C90394a5;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StorageUsageGalleryActivity extends AnonymousClass26R implements C89004Uw {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public ViewGroup A04;
    public AnonymousClass0V9 A05;
    public C02680Bk A06;
    public C57892yz A07;
    public AnonymousClass16D A08;
    public AnonymousClass171 A09;
    public AnonymousClass1RY A0A;
    public C27731Pn A0B;
    public AnonymousClass3HC A0C;
    public C62473Gh A0D;
    public C20310xM A0E;
    public C49412j4 A0F;
    public AnonymousClass1DF A0G;
    public AnonymousClass16J A0H;
    public C65503Si A0I;
    public AnonymousClass141 A0J;
    public ProgressDialogFragment A0K;
    public C21010yW A0L;
    public AnonymousClass11F A0M;
    public C28371Sj A0N;
    public StorageUsageMediaGalleryFragment A0O;
    public C43682Jk A0P;
    public AnonymousClass1A1 A0Q;
    public Runnable A0R;
    public Runnable A0S;
    public String A0T;
    public C021809f A0U;
    public final Handler A0V = C36341k9.A0H();
    public final Runnable A0W = C81183wb.A00(this, 14);
    public final Runnable A0X = C81183wb.A00(this, 15);
    public final AnonymousClass4Q4 A0Y = new AnonymousClass3T4(this, 4);
    public final AnonymousClass191 A0Z = C90394a5.A00(this, 34);
    public final C88764Ty A0a = new C53542rU(this, 1);

    public int A2I() {
        return 78318969;
    }

    public void B0z(Drawable drawable, View view) {
    }

    public /* synthetic */ void B1j(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void B7f(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bdt() {
    }

    public /* synthetic */ void Bel(AnonymousClass3T1 r1, boolean z) {
    }

    public /* synthetic */ void BpV(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BrT(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Bth(AnonymousClass3T1 r1) {
    }

    public void Bu3(View view, AnonymousClass3T1 r2, int i, boolean z) {
    }

    public /* synthetic */ void Bwy(AnonymousClass3T1 r1) {
    }

    public AnonymousClass012 getLifecycleOwner() {
        return this;
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass3T1 r1) {
    }

    public static void A01(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        Handler handler = storageUsageGalleryActivity.A0V;
        handler.removeCallbacks(storageUsageGalleryActivity.A0X);
        Runnable runnable = storageUsageGalleryActivity.A0S;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            storageUsageGalleryActivity.A0S = null;
        }
        ProgressDialogFragment progressDialogFragment = storageUsageGalleryActivity.A0K;
        if (progressDialogFragment != null) {
            progressDialogFragment.A1c();
            storageUsageGalleryActivity.A0K = null;
        }
        C49412j4 r1 = storageUsageGalleryActivity.A0F;
        if (r1 != null) {
            r1.A0D(true);
            storageUsageGalleryActivity.A0F = null;
        }
        C02680Bk r0 = storageUsageGalleryActivity.A06;
        if (r0 != null) {
            r0.A03();
            storageUsageGalleryActivity.A06 = null;
        }
    }

    public static void A07(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        int i;
        TextView A0O2 = C36391kE.A0O(storageUsageGalleryActivity.A04, R.id.storage_usage_detail_all_size);
        long j = storageUsageGalleryActivity.A03;
        if (j >= 0) {
            AnonymousClass3TF.A05(A0O2, storageUsageGalleryActivity.A00, Math.max(j - storageUsageGalleryActivity.A02, 0));
            i = 0;
        } else {
            i = 8;
        }
        A0O2.setVisibility(i);
    }

    public static void A0F(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        C62473Gh r1;
        AnonymousClass0V9 r2 = storageUsageGalleryActivity.A05;
        if (r2 != null && (r1 = storageUsageGalleryActivity.A0D) != null) {
            if (r1.A03.isEmpty()) {
                r2.A05();
                return;
            }
            C21060yb r8 = storageUsageGalleryActivity.A08;
            C18820ts r7 = storageUsageGalleryActivity.A00;
            HashMap hashMap = r1.A03;
            long size = (long) hashMap.size();
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L2, hashMap.size(), 0);
            C33521fV.A00(storageUsageGalleryActivity, r8, r7.A0L(A0L2, R.plurals.f10nameremoved, size));
            storageUsageGalleryActivity.A05.A06();
        }
    }

    public void B7Q() {
        AnonymousClass0V9 r0 = this.A05;
        if (r0 != null) {
            r0.A05();
        }
    }

    public Object BAB(Class cls) {
        if (cls == AnonymousClass4Q4.class) {
            return this.A0Y;
        }
        return null;
    }

    public boolean BK6() {
        return AnonymousClass000.A1V(this.A0D);
    }

    public boolean BMT(AnonymousClass3T1 r3) {
        C62473Gh r0 = this.A0D;
        if (r0 != null) {
            if (!r0.A03.containsKey(r3.A1J)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BsB(List list, boolean z) {
        if (this.A0D == null) {
            this.A0D = C62473Gh.A00(this.A05, (C62473Gh) null, this.A0H, this, 2);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            C62473Gh r0 = this.A0D;
            C64933Qa r1 = A0l.A1J;
            HashMap hashMap = r0.A03;
            if (z) {
                hashMap.put(r1, A0l);
            } else {
                hashMap.remove(r1);
            }
        }
        A0F(this);
    }

    public void Bur(AnonymousClass3T1 r9) {
        C62473Gh A002 = C62473Gh.A00(this.A05, this.A0D, this.A0H, this, 2);
        this.A0D = A002;
        A002.A03.put(r9.A1J, r9);
        this.A05 = But(this.A0U);
        C21060yb r7 = this.A08;
        C18820ts r6 = this.A00;
        C62473Gh r4 = this.A0D;
        long size = (long) r4.A03.size();
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L2, r4.A03.size());
        C33521fV.A00(this, r7, r6.A0L(A0L2, R.plurals.f10nameremoved, size));
    }

    public boolean Bvv(AnonymousClass3T1 r5) {
        C62473Gh r0 = this.A0D;
        if (r0 == null) {
            r0 = C62473Gh.A00(this.A05, (C62473Gh) null, this.A0H, this, 2);
            this.A0D = r0;
        }
        C64933Qa r2 = r5.A1J;
        boolean containsKey = r0.A03.containsKey(r2);
        HashMap hashMap = this.A0D.A03;
        if (containsKey) {
            hashMap.remove(r2);
        } else {
            hashMap.put(r2, r5);
        }
        A0F(this);
        return !containsKey;
    }

    public C89014Ux getConversationRowCustomizer() {
        return this.A0C.A09;
    }

    public void onBackPressed() {
        long j = this.A02;
        if (j >= 0) {
            if (j > this.A03) {
                Log.e("Deleted media size is greater than the total media size");
            }
            Intent A0D2 = C36431kI.A0D();
            AnonymousClass11F r0 = this.A0M;
            if (r0 != null) {
                C36371kC.A17(A0D2, r0);
            }
            A0D2.putExtra("gallery_type", this.A01);
            A0D2.putExtra("memory_size", Math.max(this.A03 - this.A02, 0));
            A0D2.putExtra("deleted_size", this.A02);
            setResult(1, A0D2);
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        A2u();
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass1H2 r3 = this.A0C;
        AnonymousClass16D r10 = this.A08;
        AnonymousClass171 r11 = this.A09;
        C18820ts r15 = this.A00;
        C57892yz r4 = this.A07;
        this.A0U = new AnonymousClass4W7(this, r10, r11, new AnonymousClass3PH(), new AnonymousClass2JU((AnonymousClass3C3) r4.A00.A00.A1Y.get(), this, C27111My.A3V(r4.A00.A00)), this.A0P, r15, r3, this, 6);
        this.A0A = this.A0B.A05(this, "storage-usage-gallery-activity");
        int intExtra = getIntent().getIntExtra("gallery_type", 0);
        this.A01 = intExtra;
        if (intExtra == 0) {
            AnonymousClass11F A0F2 = C36331k8.A0F(this);
            C18740tg.A06(A0F2);
            this.A0M = A0F2;
            this.A0J = this.A08.A08(A0F2);
        }
        this.A03 = getIntent().getLongExtra("memory_size", 0);
        this.A0T = C36391kE.A0u(this);
        this.A00 = getIntent().getIntExtra("entry_point", 0);
        String str = null;
        if (bundle == null) {
            AnonymousClass33A r1 = new AnonymousClass33A();
            r1.A00 = this.A01;
            AnonymousClass11F r0 = this.A0M;
            if (r0 != null) {
                str = r0.getRawString();
            }
            int i = r1.A00;
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = new StorageUsageMediaGalleryFragment();
            Bundle A072 = AnonymousClass001.A07();
            A072.putInt("storage_media_gallery_fragment_gallery_type", i);
            A072.putString("storage_media_gallery_fragment_jid", str);
            A072.putInt("sort_type", 2);
            storageUsageMediaGalleryFragment.A17(A072);
            this.A0O = storageUsageMediaGalleryFragment;
            AnonymousClass09Y A0O2 = C36341k9.A0O(this);
            A0O2.A0E(this.A0O, "storage_usage_gallery_fragment_tag", R.id.storage_usage_gallery_container);
            A0O2.A01();
            this.A02 = 0;
        } else {
            this.A0O = (StorageUsageMediaGalleryFragment) getSupportFragmentManager().A0N("storage_usage_gallery_fragment_tag");
            ArrayList A052 = AnonymousClass3UJ.A05(bundle2);
            if (A052 != null) {
                Iterator it = A052.iterator();
                while (it.hasNext()) {
                    C64933Qa r5 = (C64933Qa) it.next();
                    AnonymousClass3T1 A032 = this.A0Q.A03(r5);
                    if (A032 != null) {
                        C62473Gh r02 = this.A0D;
                        if (r02 == null) {
                            r02 = C62473Gh.A00(this.A05, (C62473Gh) null, this.A0H, this, 2);
                            this.A0D = r02;
                        }
                        r02.A03.put(r5, A032);
                    }
                }
                if (this.A0D != null) {
                    this.A05 = But(this.A0U);
                }
            }
            this.A02 = bundle2.getLong("deleted_size");
        }
        C65503Si r03 = this.A0I;
        r03.A07.add(this.A0a);
        this.A0H.registerObserver(this.A0Z);
        AnonymousClass07B A0O3 = C36381kD.A0O(this);
        A0O3.A0U(false);
        A0O3.A0X(false);
        C36361kB.A0N(this).A0F();
        View A0J2 = C36431kI.A0J(LayoutInflater.from(this), R.layout.f9nameremoved);
        C18740tg.A04(A0J2);
        ViewGroup viewGroup = (ViewGroup) A0J2;
        this.A04 = viewGroup;
        ImageView A0G2 = C36401kF.A0G(viewGroup, R.id.storage_usage_back_button);
        C67103Yn.A00(A0G2, this, 30);
        boolean A1Y = C36351kA.A1Y(this.A00);
        int i2 = R.drawable.ic_back_rtl;
        if (A1Y) {
            i2 = R.drawable.ic_back;
        }
        A0G2.setImageResource(i2);
        View A022 = C012005e.A02(this.A04, R.id.storage_usage_sort_button);
        A022.setVisibility(0);
        C67103Yn.A00(A022, this, 31);
        A0O3.A0V(true);
        A0O3.A0O(this.A04, new C013405v(-1, -1));
        TextEmojiLabel A0O4 = C36401kF.A0O(this.A04, R.id.storage_usage_detail_name);
        View A023 = C012005e.A02(this.A04, R.id.storage_usage_contact_photo_container);
        ImageView A0G3 = C36401kF.A0G(this.A04, R.id.storage_usage_contact_photo);
        int i3 = this.A01;
        if (i3 == 2) {
            A0O4.setText(AnonymousClass1V2.A04(this, this.A00));
        } else if (i3 == 1) {
            A0O4.setText(R.string.f12nameremoved);
        } else {
            if (i3 == 0) {
                AnonymousClass171 r12 = this.A09;
                AnonymousClass141 r04 = this.A0J;
                C18740tg.A06(r04);
                A0O4.A0I(r12.A0H(r04));
                A023.setVisibility(0);
                this.A0A.A08(A0G3, this.A0J);
            }
            A07(this);
            C36401kF.A1C(this);
        }
        A023.setVisibility(8);
        A07(this);
        C36401kF.A1C(this);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public /* synthetic */ boolean BMS() {
        return false;
    }

    public /* synthetic */ boolean BMm() {
        return false;
    }

    public /* synthetic */ boolean BPt() {
        return true;
    }

    public /* synthetic */ boolean BtT() {
        return false;
    }

    public /* synthetic */ boolean Btp() {
        return false;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public /* synthetic */ C001600r getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C001600r getLastMessageLiveData() {
        return null;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        C62473Gh r0 = this.A0D;
        if (r0 != null) {
            r0.A02();
            this.A0D = null;
        }
        this.A0O = null;
        C65503Si r02 = this.A0I;
        r02.A07.remove(this.A0a);
        this.A0V.removeCallbacks((Runnable) null);
        A01(this);
        this.A0H.unregisterObserver(this.A0Z);
        AnonymousClass1RY r03 = this.A0A;
        if (r03 != null) {
            r03.A02();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C62473Gh r0 = this.A0D;
        if (r0 != null) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator A10 = C36391kE.A10(r0.A03);
            while (A10.hasNext()) {
                AnonymousClass3T1.A0A(A0I2, A10);
            }
            AnonymousClass3UJ.A0A(bundle, A0I2);
        }
        bundle.putLong("deleted_size", this.A02);
    }

    public /* synthetic */ int BF0(AnonymousClass3T1 r2) {
        return 1;
    }

    public /* synthetic */ boolean BNW(AnonymousClass3T1 r2) {
        return false;
    }
}

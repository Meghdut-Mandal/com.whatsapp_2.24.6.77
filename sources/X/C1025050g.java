package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.50g  reason: invalid class name and case insensitive filesystem */
public abstract class C1025050g extends C100904wE implements C159987kH, C158017ff {
    public AnonymousClass60P A00;
    public C1258161j A01;
    public AnonymousClass6W0 A02;
    public C158027fg A03;
    public C119105pF A04;
    public BloksDialogFragment A05;
    public C1265064h A06;
    public C21010yW A07;
    public Map A08;
    public final AnonymousClass6Q3 A09 = new AnonymousClass6Q3();

    public static void A01(Intent intent, String str, String str2) {
        HashMap hashMap;
        Serializable serializableExtra = intent.getSerializableExtra("screen_params");
        if (serializableExtra == null) {
            hashMap = AnonymousClass001.A0J();
        } else {
            hashMap = (HashMap) serializableExtra;
        }
        hashMap.put(str, str2);
        intent.putExtra("screen_params", hashMap);
    }

    public C158027fg A3i() {
        C119105pF r2 = this.A04;
        AnonymousClass6Q3 r1 = this.A09;
        C19970wo r9 = this.A07;
        AnonymousClass17Y r4 = this.A05;
        C19730wQ r5 = this.A02;
        C21010yW r11 = this.A07;
        C21060yb r8 = this.A08;
        C18820ts r10 = this.A00;
        C143236qD r0 = new C143236qD(r1, r2, new C1265164i(r4, r5, this.A01, this.A02, r8, r9, r10, r11));
        r2.A00 = r0;
        return r0;
    }

    public void A3j() {
        String str = C108925Vm.A00;
        if (str == null) {
            str = getIntent().getStringExtra("screen_name");
        }
        if (!TextUtils.isEmpty(str)) {
            this.A05 = BloksDialogFragment.A03(str, C108925Vm.A01);
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            A0O.A0B(this.A05, R.id.bloks_fragment_container);
            A0O.A00(false);
        }
    }

    public void onBackPressed() {
        AnonymousClass6Q3 r5 = this.A09;
        HashMap hashMap = r5.A01;
        AnonymousClass6C8 r1 = (AnonymousClass6C8) hashMap.get("backpress");
        if (r1 != null) {
            r1.A00("on_success");
            return;
        }
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.A0I() <= 1) {
            setResult(0, C53092ql.A00(getIntent()));
            C108925Vm.A00 = null;
            C108925Vm.A01 = null;
            finish();
            return;
        }
        supportFragmentManager.A0V();
        supportFragmentManager.A0T();
        AnonymousClass6Q3.A00(hashMap);
        Stack stack = r5.A02;
        stack.pop();
        AnonymousClass01z supportFragmentManager2 = getSupportFragmentManager();
        this.A05 = BloksDialogFragment.A03(((AnonymousClass09Y) ((AnonymousClass09X) supportFragmentManager2.A0C.get(supportFragmentManager2.A0I() - 1))).A0B, (HashMap) stack.peek());
        AnonymousClass09Y r2 = new AnonymousClass09Y(supportFragmentManager);
        r2.A0B(this.A05, R.id.bloks_fragment_container);
        r2.A00(false);
    }

    public void onCreate(Bundle bundle) {
        Serializable serializableExtra = getIntent().getSerializableExtra("screen_params");
        AnonymousClass6Q3 r2 = this.A09;
        AnonymousClass6Q3.A00(r2.A01);
        r2.A02.add(AnonymousClass001.A0J());
        if (serializableExtra != null) {
            r2.A03((Map) serializableExtra);
        }
        super.onCreate(bundle);
        try {
            AnonymousClass10B.A00(getApplicationContext());
        } catch (IOException unused) {
        }
        Toolbar A0O = C36361kB.A0O(this, R.layout.f9nameremoved);
        A0O.A0F();
        AnonymousClass07B A0Q = C36431kI.A0Q(this, A0O);
        if (A0Q != null) {
            A0Q.A0Q("");
            A0Q.A0U(true);
        }
        C100744vb A002 = C91364bt.A00(this, this.A00, R.drawable.ic_back);
        C90484aE.A15(getResources(), A002, R.color.f6nameremoved);
        A0O.setNavigationIcon((Drawable) A002);
        A0O.setNavigationOnClickListener(new C135436ch(this, 17));
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass6Q3 r2 = this.A09;
        Iterator it = r2.A02.iterator();
        while (it.hasNext()) {
            ((Map) it.next()).clear();
        }
        AnonymousClass6Q3.A00(r2.A01);
        r2.A00.A01.clear();
    }

    public void onPause() {
        super.onPause();
        this.A09.A04(false);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        AnonymousClass6Q3 r2 = this.A09;
        ArrayList arrayList = (ArrayList) bundle.getSerializable("screen_manager_saved_state");
        if (arrayList != null) {
            Stack stack = r2.A02;
            stack.clear();
            stack.addAll(arrayList);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A03 == null) {
            this.A03 = A3i();
        }
        this.A06.A00(getApplicationContext(), this.A03.B7z(), this.A00.A00(this, getSupportFragmentManager(), new C116645kv(this.A08)));
        this.A09.A04(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Stack stack = this.A09.A02;
        if (!stack.isEmpty()) {
            ArrayList A0v = C36401kF.A0v(stack);
            Iterator it = stack.iterator();
            while (it.hasNext()) {
                A0v.add(new HashMap((Map) it.next()));
            }
            bundle.putSerializable("screen_manager_saved_state", A0v);
        }
    }
}

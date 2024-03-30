package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2IW  reason: invalid class name */
public abstract class AnonymousClass2IW extends AnonymousClass24M implements C89004Uw, C88994Uv, C87704Pv {
    public C70523fI A00;
    public List A01 = AnonymousClass001.A0I();

    public /* synthetic */ void B0z(Drawable drawable, View view) {
    }

    public /* synthetic */ void B1j(AnonymousClass3T1 r1) {
    }

    public AnonymousClass22t BBT(Integer num) {
        return null;
    }

    public void BKA() {
    }

    public /* synthetic */ void Bdt() {
    }

    public /* synthetic */ void Bel(AnonymousClass3T1 r1, boolean z) {
    }

    public AnonymousClass155 BoP() {
        return this;
    }

    public /* synthetic */ void Bth(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass3T1 r1) {
    }

    public C87444Ov B4o() {
        return new C68613cB(this.A00);
    }

    public void B5e() {
        C38861qL r0 = this.A00.A0O;
        if (r0 != null) {
            r0.dismiss();
        }
    }

    public void B7Q() {
        this.A00.B7Q();
    }

    public void B7f(AnonymousClass3T1 r2) {
        this.A00.B7f(r2);
    }

    public Object BAB(Class cls) {
        return this.A00.BAB(cls);
    }

    public int BF0(AnonymousClass3T1 r2) {
        return this.A00.BF0(r2);
    }

    public boolean BK6() {
        return this.A00.BK6();
    }

    public boolean BMT(AnonymousClass3T1 r2) {
        return this.A00.BMT(r2);
    }

    public boolean BMu() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0u;
        if (reactionsTrayViewModel == null || C36341k9.A07(reactionsTrayViewModel.A0B) != 2) {
            return false;
        }
        return true;
    }

    public void Be8(int i) {
        this.A00.A0B(i);
    }

    public void BpV(AnonymousClass3T1 r2) {
        this.A00.BpV(r2);
    }

    public void BrT(AnonymousClass3T1 r2, int i) {
        this.A00.BrT(r2, i);
    }

    public void BsB(List list, boolean z) {
        this.A00.BsB(list, z);
    }

    public void Btg(Bitmap bitmap, C65643Sx r3) {
        this.A00.Btg(bitmap, r3);
    }

    public void Bu3(View view, AnonymousClass3T1 r3, int i, boolean z) {
        this.A00.Bu3(view, r3, i, z);
    }

    public void Bur(AnonymousClass3T1 r2) {
        this.A00.Bur(r2);
    }

    public boolean Bvv(AnonymousClass3T1 r2) {
        return this.A00.Bvv(r2);
    }

    public void Bwy(AnonymousClass3T1 r2) {
        this.A00.Bwy(r2);
    }

    public void onCreate(Bundle bundle) {
        if (this.A00 == null) {
            C70523fI ADd = ((C27101Mx) C19570wA.A00(C27101Mx.class, this)).ADd();
            this.A00 = ADd;
            ADd.A0M = this;
            List list = this.A01;
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0A("onCreate");
            }
        }
        super.onCreate(bundle);
        this.A00.A06();
    }

    public Dialog onCreateDialog(int i) {
        return this.A00.A03(i);
    }

    public void onDestroy() {
        this.A00.A07();
        this.A01.clear();
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

    public Dialog BiX(int i) {
        return super.onCreateDialog(i);
    }

    public void BiZ() {
        super.onDestroy();
    }

    public void Bih(AnonymousClass0V9 r2) {
        super.Bih(r2);
        this.A00.A09();
    }

    public void Bii(AnonymousClass0V9 r2) {
        super.Bii(r2);
        this.A00.A0A();
    }

    public /* synthetic */ boolean BtT() {
        return false;
    }

    public /* synthetic */ boolean Btp() {
        return false;
    }

    public C20810yC getABProps() {
        return this.A0D;
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

    public AnonymousClass016 getViewModelStoreOwner() {
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A0C(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A0D(configuration);
    }

    public void onPause() {
        super.onPause();
        this.A00.A08();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C64933Qa A03;
        super.onRestoreInstanceState(bundle);
        C70523fI r2 = this.A00;
        C70523fI.A02(r2);
        if (bundle != null && (A03 = AnonymousClass3UJ.A03(bundle, "")) != null) {
            r2.A0r = r2.A0x.A03(A03);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass3T1 r0 = this.A00.A0r;
        if (r0 != null) {
            AnonymousClass3UJ.A08(bundle, r0.A1J);
        }
    }

    public /* synthetic */ boolean BNW(AnonymousClass3T1 r2) {
        return false;
    }
}

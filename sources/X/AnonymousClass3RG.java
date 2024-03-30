package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3RG  reason: invalid class name */
public class AnonymousClass3RG implements C89004Uw {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    public AnonymousClass3RG(C43922Kk r2) {
        this.A01 = r2;
        this.A00 = C36431kI.A1G();
    }

    public /* synthetic */ void B0z(Drawable drawable, View view) {
    }

    public Object BAB(Class cls) {
        if (this.A02 != 0) {
            return null;
        }
        AnonymousClass00C.A0D(cls, 0);
        return ((C89004Uw) this.A01).BAB(cls);
    }

    public /* synthetic */ int BF0(AnonymousClass3T1 r3) {
        if (this.A02 == 0) {
            return 1;
        }
        AnonymousClass00C.A0D(r3, 0);
        Number number = (Number) ((Map) this.A00).get(r3.A1J);
        if (number != null) {
            return number.intValue();
        }
        return 1;
    }

    public /* synthetic */ void Bel(AnonymousClass3T1 r1, boolean z) {
    }

    public /* synthetic */ void BrT(AnonymousClass3T1 r3, int i) {
        if (this.A02 != 0) {
            AnonymousClass00C.A0D(r3, 0);
            C64933Qa r0 = r3.A1J;
            AnonymousClass00C.A07(r0);
            C36421kH.A1M(r0, (Map) this.A00, i);
        }
    }

    public /* synthetic */ void BsB(List list, boolean z) {
    }

    public /* synthetic */ int getContainerType() {
        if (this.A02 != 0) {
            return 5;
        }
        return 0;
    }

    public C89014Ux getConversationRowCustomizer() {
        if (this.A02 == 0) {
            return (C89014Ux) this.A00;
        }
        C43922Kk r0 = (C43922Kk) this.A01;
        AnonymousClass3HC r1 = r0.A04;
        if (r1 != null) {
            return r1.A00(C36331k8.A02(r0.A08));
        }
        throw C36331k8.A0d("conversationRowCustomizers");
    }

    public AnonymousClass012 getLifecycleOwner() {
        if (this.A02 != 0) {
            return (AnonymousClass014) this.A01;
        }
        AnonymousClass012 lifecycleOwner = ((C89004Uw) this.A01).getLifecycleOwner();
        AnonymousClass00C.A08(lifecycleOwner);
        return lifecycleOwner;
    }

    public /* synthetic */ void B7Q() {
    }

    public /* synthetic */ boolean BK6() {
        return false;
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

    public /* synthetic */ void Bdt() {
    }

    public /* synthetic */ boolean BtT() {
        return false;
    }

    public /* synthetic */ boolean Btp() {
        return false;
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

    public /* synthetic */ void B1j(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void B7f(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ boolean BMT(AnonymousClass3T1 r2) {
        return false;
    }

    public /* synthetic */ boolean BNW(AnonymousClass3T1 r2) {
        return false;
    }

    public /* synthetic */ void BpV(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bth(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bur(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ boolean Bvv(AnonymousClass3T1 r2) {
        return false;
    }

    public /* synthetic */ void Bwy(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass3T1 r1) {
    }

    public void Bu3(View view, AnonymousClass3T1 r2, int i, boolean z) {
    }

    public AnonymousClass3RG(C89004Uw r2, C89014Ux r3) {
        this.A00 = r3;
        this.A01 = r2;
    }
}

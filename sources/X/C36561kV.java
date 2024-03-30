package X;

import android.app.IntentService;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.DirectReplyService;

/* renamed from: X.1kV  reason: invalid class name and case insensitive filesystem */
public abstract class C36561kV extends IntentService implements C18700tb {
    public final Object A00 = C36441kJ.A11();
    public volatile C31091bG A01;

    public void A04() {
        if (this instanceof DirectReplyService) {
            DirectReplyService directReplyService = (DirectReplyService) this;
            if (!directReplyService.A0A) {
                directReplyService.A0A = true;
                C18800tq r1 = ((C31141bL) ((C31131bK) directReplyService.generatedComponent())).A05;
                directReplyService.A00 = C36351kA.A0M(r1);
                directReplyService.A01 = C36361kB.A0T(r1);
                directReplyService.A02 = C36341k9.A0R(r1);
                directReplyService.A05 = C36351kA.A0U(r1);
                directReplyService.A06 = C36361kB.A0Z(r1);
                directReplyService.A04 = C36401kF.A0W(r1);
                directReplyService.A07 = C36371kC.A0g(r1);
                directReplyService.A08 = (C34061gO) r1.A00.A2j.get();
                directReplyService.A03 = (AnonymousClass1Y3) r1.A2N.get();
                directReplyService.A09 = C36351kA.A0m(r1);
                return;
            }
            return;
        }
        AndroidWear androidWear = (AndroidWear) this;
        if (!androidWear.A0A) {
            androidWear.A0A = true;
            C18800tq r12 = ((C31141bL) ((C31131bK) androidWear.generatedComponent())).A05;
            androidWear.A00 = C36351kA.A0M(r12);
            androidWear.A01 = C36361kB.A0T(r12);
            androidWear.A02 = C36341k9.A0R(r12);
            androidWear.A05 = C36351kA.A0U(r12);
            androidWear.A06 = (C26141Ja) r12.A5m.get();
            androidWear.A04 = C36401kF.A0W(r12);
            androidWear.A07 = C36431kI.A0m(r12);
            androidWear.A08 = C36371kC.A0g(r12);
            androidWear.A03 = (AnonymousClass1Y3) r12.A2N.get();
            androidWear.A09 = C36351kA.A0m(r12);
        }
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new C31091bG(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public C36561kV(String str) {
        super(str);
    }

    public void onCreate() {
        A04();
        super.onCreate();
    }
}

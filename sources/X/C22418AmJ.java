package X;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.whatsapp.util.Log;

/* renamed from: X.AmJ  reason: case insensitive filesystem */
public final class C22418AmJ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass9XW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22418AmJ(AnonymousClass9XW r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RecaptchaTasksClient recaptchaTasksClient = (RecaptchaTasksClient) obj;
        AnonymousClass9XW r0 = this.this$0;
        AnonymousClass00C.A0B(recaptchaTasksClient);
        AnonymousClass00C.A0D(recaptchaTasksClient, 0);
        r0.A01 = recaptchaTasksClient;
        AnonymousClass9XW r1 = this.this$0;
        r1.A02 = C188258zI.INIT_SUCCEEDED;
        r1.A09.A01("RECAPTCHA_INIT_", "SUCCESS");
        this.this$0.A04.set(false);
        AnonymousClass9XW r6 = this.this$0;
        if (!r6.A02()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("RecaptchaClientHandler/Cannot fetch token - not enabled for this user: ");
            C36321k7.A1Y(A0u, r6.A00);
        } else if (r6.A01 == null) {
            Log.e("RecaptchaClientHandler/callExecute/client is not registered, cancelling");
            r6.A08.A00(C188648zz.A0H, "executeCalledPreInitFinish");
        } else {
            r6.A02 = C188258zI.FETCH_STARTED;
            AnonymousClass1X1 r5 = r6.A09;
            r5.A00("RECAPTCHA_EXECUTE_");
            try {
                RecaptchaTasksClient recaptchaTasksClient2 = r6.A01;
                if (recaptchaTasksClient2 != null) {
                    Task executeTask = recaptchaTasksClient2.executeTask(RecaptchaAction.SIGNUP, 10000);
                    executeTask.addOnSuccessListener(new C1903297y(new C22417AmI(r6), 3));
                    executeTask.addOnFailureListener(new B9C(r6, 1));
                } else {
                    throw C36331k8.A0d("recaptchaClient");
                }
            } catch (Exception e) {
                r6.A08.A01(C188648zz.A0H, "exceptionThrown", e);
                C36321k7.A1J(e, "RecaptchaClientHandler/execute exception caught: ", AnonymousClass000.A0u());
                r6.A03 = e;
                r6.A02 = C188258zI.FETCH_FAILED;
                r5.A01("RECAPTCHA_EXECUTE_", "EXCEPTION");
            }
        }
        return AnonymousClass0AJ.A00;
    }
}

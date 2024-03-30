package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.AbsListView;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.phonenumberentry.ChangeNumber;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.4VT  reason: invalid class name */
public class AnonymousClass4VT extends Handler {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4VT(Looper looper, Object obj, int i) {
        super(looper);
        this.A01 = i;
        this.A00 = obj;
    }

    public void handleMessage(Message message) {
        EditText editText;
        switch (this.A01) {
            case 0:
                int i = C65923Tz.A0Z;
                C88314Sf r0 = ((C65923Tz) this.A00).A02;
                if (r0 != null) {
                    r0.BRp();
                    sendEmptyMessageDelayed(0, (long) C65923Tz.A0Z);
                    return;
                }
                return;
            case 1:
                if (message.what == 0) {
                    VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) this.A00;
                    if (verifyTwoFactorAuthCodeDialogFragment.A00 == 0) {
                        verifyTwoFactorAuthCodeDialogFragment.A07.Bp1(new AnonymousClass751(10, (String) message.obj, verifyTwoFactorAuthCodeDialogFragment));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AnonymousClass00C.A0D(message, 0);
                Object obj = message.obj;
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.protocol.FMessage");
                C71903hW r2 = (C71903hW) this.A00;
                Map map = r2.A07;
                C64933Qa A0B = C66013Ui.A0B((AnonymousClass3T1) obj);
                AnonymousClass00C.A08(A0B);
                AnonymousClass3T1 r02 = (AnonymousClass3T1) map.get(A0B);
                if (r02 != null) {
                    C71903hW.A00(r2, r02);
                    return;
                }
                return;
            case 3:
                if (message.what == 0) {
                    ((ConversationListView) this.A00).A0A(true);
                }
                ((AbsListView) this.A00).setTranscriptMode(0);
                return;
            case 4:
                AnonymousClass00C.A0D(message, 0);
                Object obj2 = message.obj;
                AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.Int>");
                C64443Nz.A00((C64443Nz) this.A00, AnonymousClass000.A0I(((AnonymousClass011) obj2).second));
                return;
            case 5:
                C80933wC r1 = RegisterName.A1r;
                if (r1 != null && r1.A03) {
                    boolean z = r1.A04;
                    int i2 = 1;
                    RegisterName registerName = (RegisterName) this.A00;
                    if (z) {
                        AnonymousClass226 r03 = registerName.A19;
                        if (r03 != null) {
                            r03.A01(1);
                            return;
                        }
                        return;
                    }
                    AnonymousClass3SJ.A00(registerName, 0);
                    int i3 = RegisterName.A1r.A00;
                    if (i3 != 1) {
                        if (i3 == 3) {
                            i2 = 109;
                        } else {
                            return;
                        }
                    }
                    AnonymousClass3SJ.A01(registerName, i2);
                    return;
                }
                return;
            case 6:
                RegisterName.A0F((RegisterName) this.A00);
                return;
            default:
                int i4 = message.what;
                if (i4 == 1) {
                    Log.w("ChangeNumber/check-number/match");
                    ChangeNumber changeNumber = (ChangeNumber) this.A00;
                    changeNumber.A0L.removeMessages(4);
                    C81143wX.A01(changeNumber.A04, this, 48);
                    if (!Objects.equals(ChangeNumber.A0P, changeNumber.A0P.A03.A04())) {
                        AnonymousClass3SJ.A00(changeNumber, 1);
                        AnonymousClass3SJ.A01(changeNumber, 2);
                        AnonymousClass3AK r04 = changeNumber.A0H;
                        if (r04 != null) {
                            editText = r04.A02;
                        } else {
                            return;
                        }
                    } else {
                        ChangeNumber.A0Q(changeNumber);
                        return;
                    }
                } else if (i4 == 2) {
                    Log.w("ChangeNumber/check-number/mismatch");
                    ChangeNumber changeNumber2 = (ChangeNumber) this.A00;
                    changeNumber2.A0L.removeMessages(4);
                    AnonymousClass3SJ.A00(changeNumber2, 1);
                    changeNumber2.BO5(R.string.f12nameremoved);
                    AnonymousClass3AK r05 = changeNumber2.A0H;
                    if (r05 != null) {
                        editText = r05.A03;
                    } else {
                        return;
                    }
                } else if (i4 == 3) {
                    Log.e("ChangeNumber/error");
                    Activity activity = (Activity) this.A00;
                    AnonymousClass3SJ.A00(activity, 1);
                    AnonymousClass3SJ.A01(activity, 109);
                    return;
                } else if (i4 == 4) {
                    Log.e("ChangeNumber/timeout");
                    ChangeNumber changeNumber3 = (ChangeNumber) this.A00;
                    changeNumber3.A0L.removeMessages(4);
                    AnonymousClass3SJ.A00(changeNumber3, 1);
                    AnonymousClass3SJ.A01(changeNumber3, 109);
                    return;
                } else {
                    return;
                }
                if (editText != null) {
                    editText.requestFocus();
                    return;
                }
                return;
        }
    }

    public static AnonymousClass4VT A00(ConversationListView conversationListView) {
        conversationListView.A04();
        conversationListView.A0K = true;
        conversationListView.A0N = true;
        return new AnonymousClass4VT(Looper.getMainLooper(), conversationListView, 3);
    }
}

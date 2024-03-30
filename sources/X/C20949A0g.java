package X;

import com.whatsapp.util.Log;

/* renamed from: X.A0g  reason: case insensitive filesystem */
public final class C20949A0g implements C23063B2m {
    public void BSw() {
        Log.e("voip/video/VoipCamera/ VoipLiteCamera/onCameraInitialised");
    }

    public void BSz() {
        Log.e("voip/video/VoipCamera/ VoipLiteCamera/onCameraSwitched");
    }

    public void BSt(Exception exc) {
        C36321k7.A1J(exc, "voip/video/VoipCamera/ VoipLiteCamera/onCameraError: ", C36341k9.A0i(exc));
    }

    public void BSx(String str, String str2) {
        C36321k7.A0w(str, str2);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/video/VoipCamera/ VoipLiteCamera/onCameraLocallyEvicted: ");
        A0u.append(str);
        A0u.append('>');
        C36321k7.A1Z(A0u, str2);
    }
}

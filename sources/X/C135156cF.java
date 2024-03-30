package X;

import android.os.Bundle;
import android.speech.RecognitionListener;
import java.util.ArrayList;

/* renamed from: X.6cF  reason: invalid class name and case insensitive filesystem */
public final class C135156cF implements RecognitionListener {
    public final /* synthetic */ C46812bi A00;
    public final /* synthetic */ C159737jq A01;
    public final /* synthetic */ AnonymousClass00S A02;
    public final /* synthetic */ C10810fG A03;

    public void onBeginningOfSpeech() {
    }

    public void onBufferReceived(byte[] bArr) {
    }

    public void onEndOfSpeech() {
    }

    public void onEvent(int i, Bundle bundle) {
    }

    public void onPartialResults(Bundle bundle) {
    }

    public void onReadyForSpeech(Bundle bundle) {
    }

    public void onResults(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        C10810fG r3 = this.A03;
        A00(bundle, r3);
        AnonymousClass00S r0 = this.A02;
        C159737jq r2 = this.A01;
        C46812bi r1 = this.A00;
        r0.invoke();
        r2.BjT(r1, (String) r3.element);
    }

    public void onRmsChanged(float f) {
    }

    public void onSegmentResults(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        A00(bundle, this.A03);
    }

    public C135156cF(C46812bi r1, C159737jq r2, AnonymousClass00S r3, C10810fG r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onEndOfSegmentedSession() {
        AnonymousClass00S r3 = this.A02;
        C159737jq r2 = this.A01;
        C46812bi r1 = this.A00;
        C10810fG r0 = this.A03;
        r3.invoke();
        r2.BjT(r1, (String) r0.element);
    }

    public static final void A00(Bundle bundle, C10810fG r3) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append((String) r3.element);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || (str = (String) C007103b.A0M(stringArrayList)) == null) {
            str = "";
        }
        r3.element = AnonymousClass000.A0q(str, A0u);
    }

    public void onError(int i) {
        C108145Si r2;
        C36321k7.A1T("voicetranscription/SpeechRecognizerTranscriptionEngine/onError error=", AnonymousClass000.A0u(), i);
        this.A02.invoke();
        if (i == 3) {
            r2 = C108145Si.BAD_AUDIO;
        } else if (i == 9) {
            r2 = C108145Si.INSUFFICIENT_PERMISSIONS;
        } else if (i != 12) {
            r2 = C108145Si.UNKNOWN_TRANSCRIPTION_ERROR;
        } else {
            r2 = C108145Si.LANGUAGE_NOT_SUPPORTED;
        }
        this.A01.BjS(this.A00, r2);
    }
}
